/**
 * generated by Xtext 2.34.0
 */
package ld.project2.thymioDSL.impl;

import ld.project2.thymioDSL.BottomSensor;
import ld.project2.thymioDSL.ThymioDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bottom Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ld.project2.thymioDSL.impl.BottomSensorImpl#getBottomLeftSensor <em>Bottom Left Sensor</em>}</li>
 *   <li>{@link ld.project2.thymioDSL.impl.BottomSensorImpl#getBottomRightSensor <em>Bottom Right Sensor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BottomSensorImpl extends MinimalEObjectImpl.Container implements BottomSensor
{
  /**
	 * The default value of the '{@link #getBottomLeftSensor() <em>Bottom Left Sensor</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getBottomLeftSensor()
	 * @generated
	 * @ordered
	 */
  protected static final String BOTTOM_LEFT_SENSOR_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getBottomLeftSensor() <em>Bottom Left Sensor</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getBottomLeftSensor()
	 * @generated
	 * @ordered
	 */
  protected String bottomLeftSensor = BOTTOM_LEFT_SENSOR_EDEFAULT;

  /**
	 * The default value of the '{@link #getBottomRightSensor() <em>Bottom Right Sensor</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getBottomRightSensor()
	 * @generated
	 * @ordered
	 */
  protected static final String BOTTOM_RIGHT_SENSOR_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getBottomRightSensor() <em>Bottom Right Sensor</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getBottomRightSensor()
	 * @generated
	 * @ordered
	 */
  protected String bottomRightSensor = BOTTOM_RIGHT_SENSOR_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected BottomSensorImpl()
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
		return ThymioDSLPackage.Literals.BOTTOM_SENSOR;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getBottomLeftSensor()
  {
		return bottomLeftSensor;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setBottomLeftSensor(String newBottomLeftSensor)
  {
		String oldBottomLeftSensor = bottomLeftSensor;
		bottomLeftSensor = newBottomLeftSensor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThymioDSLPackage.BOTTOM_SENSOR__BOTTOM_LEFT_SENSOR, oldBottomLeftSensor, bottomLeftSensor));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getBottomRightSensor()
  {
		return bottomRightSensor;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setBottomRightSensor(String newBottomRightSensor)
  {
		String oldBottomRightSensor = bottomRightSensor;
		bottomRightSensor = newBottomRightSensor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThymioDSLPackage.BOTTOM_SENSOR__BOTTOM_RIGHT_SENSOR, oldBottomRightSensor, bottomRightSensor));
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
			case ThymioDSLPackage.BOTTOM_SENSOR__BOTTOM_LEFT_SENSOR:
				return getBottomLeftSensor();
			case ThymioDSLPackage.BOTTOM_SENSOR__BOTTOM_RIGHT_SENSOR:
				return getBottomRightSensor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case ThymioDSLPackage.BOTTOM_SENSOR__BOTTOM_LEFT_SENSOR:
				setBottomLeftSensor((String)newValue);
				return;
			case ThymioDSLPackage.BOTTOM_SENSOR__BOTTOM_RIGHT_SENSOR:
				setBottomRightSensor((String)newValue);
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
			case ThymioDSLPackage.BOTTOM_SENSOR__BOTTOM_LEFT_SENSOR:
				setBottomLeftSensor(BOTTOM_LEFT_SENSOR_EDEFAULT);
				return;
			case ThymioDSLPackage.BOTTOM_SENSOR__BOTTOM_RIGHT_SENSOR:
				setBottomRightSensor(BOTTOM_RIGHT_SENSOR_EDEFAULT);
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
			case ThymioDSLPackage.BOTTOM_SENSOR__BOTTOM_LEFT_SENSOR:
				return BOTTOM_LEFT_SENSOR_EDEFAULT == null ? bottomLeftSensor != null : !BOTTOM_LEFT_SENSOR_EDEFAULT.equals(bottomLeftSensor);
			case ThymioDSLPackage.BOTTOM_SENSOR__BOTTOM_RIGHT_SENSOR:
				return BOTTOM_RIGHT_SENSOR_EDEFAULT == null ? bottomRightSensor != null : !BOTTOM_RIGHT_SENSOR_EDEFAULT.equals(bottomRightSensor);
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (bottomLeftSensor: ");
		result.append(bottomLeftSensor);
		result.append(", bottomRightSensor: ");
		result.append(bottomRightSensor);
		result.append(')');
		return result.toString();
	}

} //BottomSensorImpl
