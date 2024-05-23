/**
 * generated by Xtext 2.34.0
 */
package ld.project2.thymioDSL.impl;

import java.util.Collection;

import ld.project2.thymioDSL.Model;
import ld.project2.thymioDSL.Procedure;
import ld.project2.thymioDSL.ThymioDSLPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ld.project2.thymioDSL.impl.ModelImpl#getProcedures <em>Procedures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
	 * The cached value of the '{@link #getProcedures() <em>Procedures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getProcedures()
	 * @generated
	 * @ordered
	 */
  protected EList<Procedure> procedures;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ModelImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return ThymioDSLPackage.Literals.MODEL;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EList<Procedure> getProcedures()
  {
		if (procedures == null) {
			procedures = new EObjectContainmentEList<Procedure>(Procedure.class, this, ThymioDSLPackage.MODEL__PROCEDURES);
		}
		return procedures;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case ThymioDSLPackage.MODEL__PROCEDURES:
				return ((InternalEList<?>)getProcedures()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case ThymioDSLPackage.MODEL__PROCEDURES:
				return getProcedures();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case ThymioDSLPackage.MODEL__PROCEDURES:
				getProcedures().clear();
				getProcedures().addAll((Collection<? extends Procedure>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case ThymioDSLPackage.MODEL__PROCEDURES:
				getProcedures().clear();
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case ThymioDSLPackage.MODEL__PROCEDURES:
				return procedures != null && !procedures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
