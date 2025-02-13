/**
 * generated by Xtext 2.34.0
 */
package ld.project2.thymioDSL.impl;

import ld.project2.thymioDSL.BottomSensor;
import ld.project2.thymioDSL.Event;
import ld.project2.thymioDSL.ProxSensor;
import ld.project2.thymioDSL.ThymioDSLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ld.project2.thymioDSL.impl.EventImpl#getButton <em>Button</em>}</li>
 *   <li>{@link ld.project2.thymioDSL.impl.EventImpl#getStimulus <em>Stimulus</em>}</li>
 *   <li>{@link ld.project2.thymioDSL.impl.EventImpl#getProxSensor <em>Prox Sensor</em>}</li>
 *   <li>{@link ld.project2.thymioDSL.impl.EventImpl#getBottomSensor <em>Bottom Sensor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends MinimalEObjectImpl.Container implements Event
{
  /**
	 * The default value of the '{@link #getButton() <em>Button</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getButton()
	 * @generated
	 * @ordered
	 */
  protected static final String BUTTON_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getButton() <em>Button</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getButton()
	 * @generated
	 * @ordered
	 */
  protected String button = BUTTON_EDEFAULT;

  /**
	 * The default value of the '{@link #getStimulus() <em>Stimulus</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getStimulus()
	 * @generated
	 * @ordered
	 */
  protected static final String STIMULUS_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getStimulus() <em>Stimulus</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getStimulus()
	 * @generated
	 * @ordered
	 */
  protected String stimulus = STIMULUS_EDEFAULT;

  /**
	 * The cached value of the '{@link #getProxSensor() <em>Prox Sensor</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getProxSensor()
	 * @generated
	 * @ordered
	 */
  protected ProxSensor proxSensor;

  /**
	 * The cached value of the '{@link #getBottomSensor() <em>Bottom Sensor</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getBottomSensor()
	 * @generated
	 * @ordered
	 */
  protected BottomSensor bottomSensor;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EventImpl()
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
		return ThymioDSLPackage.Literals.EVENT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getButton()
  {
		return button;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setButton(String newButton)
  {
		String oldButton = button;
		button = newButton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThymioDSLPackage.EVENT__BUTTON, oldButton, button));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getStimulus()
  {
		return stimulus;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setStimulus(String newStimulus)
  {
		String oldStimulus = stimulus;
		stimulus = newStimulus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThymioDSLPackage.EVENT__STIMULUS, oldStimulus, stimulus));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public ProxSensor getProxSensor()
  {
		return proxSensor;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetProxSensor(ProxSensor newProxSensor, NotificationChain msgs)
  {
		ProxSensor oldProxSensor = proxSensor;
		proxSensor = newProxSensor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThymioDSLPackage.EVENT__PROX_SENSOR, oldProxSensor, newProxSensor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setProxSensor(ProxSensor newProxSensor)
  {
		if (newProxSensor != proxSensor) {
			NotificationChain msgs = null;
			if (proxSensor != null)
				msgs = ((InternalEObject)proxSensor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThymioDSLPackage.EVENT__PROX_SENSOR, null, msgs);
			if (newProxSensor != null)
				msgs = ((InternalEObject)newProxSensor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThymioDSLPackage.EVENT__PROX_SENSOR, null, msgs);
			msgs = basicSetProxSensor(newProxSensor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThymioDSLPackage.EVENT__PROX_SENSOR, newProxSensor, newProxSensor));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public BottomSensor getBottomSensor()
  {
		return bottomSensor;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetBottomSensor(BottomSensor newBottomSensor, NotificationChain msgs)
  {
		BottomSensor oldBottomSensor = bottomSensor;
		bottomSensor = newBottomSensor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThymioDSLPackage.EVENT__BOTTOM_SENSOR, oldBottomSensor, newBottomSensor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setBottomSensor(BottomSensor newBottomSensor)
  {
		if (newBottomSensor != bottomSensor) {
			NotificationChain msgs = null;
			if (bottomSensor != null)
				msgs = ((InternalEObject)bottomSensor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThymioDSLPackage.EVENT__BOTTOM_SENSOR, null, msgs);
			if (newBottomSensor != null)
				msgs = ((InternalEObject)newBottomSensor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThymioDSLPackage.EVENT__BOTTOM_SENSOR, null, msgs);
			msgs = basicSetBottomSensor(newBottomSensor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThymioDSLPackage.EVENT__BOTTOM_SENSOR, newBottomSensor, newBottomSensor));
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
			case ThymioDSLPackage.EVENT__PROX_SENSOR:
				return basicSetProxSensor(null, msgs);
			case ThymioDSLPackage.EVENT__BOTTOM_SENSOR:
				return basicSetBottomSensor(null, msgs);
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
			case ThymioDSLPackage.EVENT__BUTTON:
				return getButton();
			case ThymioDSLPackage.EVENT__STIMULUS:
				return getStimulus();
			case ThymioDSLPackage.EVENT__PROX_SENSOR:
				return getProxSensor();
			case ThymioDSLPackage.EVENT__BOTTOM_SENSOR:
				return getBottomSensor();
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
			case ThymioDSLPackage.EVENT__BUTTON:
				setButton((String)newValue);
				return;
			case ThymioDSLPackage.EVENT__STIMULUS:
				setStimulus((String)newValue);
				return;
			case ThymioDSLPackage.EVENT__PROX_SENSOR:
				setProxSensor((ProxSensor)newValue);
				return;
			case ThymioDSLPackage.EVENT__BOTTOM_SENSOR:
				setBottomSensor((BottomSensor)newValue);
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
			case ThymioDSLPackage.EVENT__BUTTON:
				setButton(BUTTON_EDEFAULT);
				return;
			case ThymioDSLPackage.EVENT__STIMULUS:
				setStimulus(STIMULUS_EDEFAULT);
				return;
			case ThymioDSLPackage.EVENT__PROX_SENSOR:
				setProxSensor((ProxSensor)null);
				return;
			case ThymioDSLPackage.EVENT__BOTTOM_SENSOR:
				setBottomSensor((BottomSensor)null);
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
			case ThymioDSLPackage.EVENT__BUTTON:
				return BUTTON_EDEFAULT == null ? button != null : !BUTTON_EDEFAULT.equals(button);
			case ThymioDSLPackage.EVENT__STIMULUS:
				return STIMULUS_EDEFAULT == null ? stimulus != null : !STIMULUS_EDEFAULT.equals(stimulus);
			case ThymioDSLPackage.EVENT__PROX_SENSOR:
				return proxSensor != null;
			case ThymioDSLPackage.EVENT__BOTTOM_SENSOR:
				return bottomSensor != null;
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
		result.append(" (button: ");
		result.append(button);
		result.append(", stimulus: ");
		result.append(stimulus);
		result.append(')');
		return result.toString();
	}

} //EventImpl
