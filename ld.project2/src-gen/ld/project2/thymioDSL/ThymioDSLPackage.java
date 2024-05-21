/**
 * generated by Xtext 2.34.0
 */
package ld.project2.thymioDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ld.project2.thymioDSL.ThymioDSLFactory
 * @model kind="package"
 * @generated
 */
public interface ThymioDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "thymioDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.project2.ld/ThymioDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "thymioDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ThymioDSLPackage eINSTANCE = ld.project2.thymioDSL.impl.ThymioDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link ld.project2.thymioDSL.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ld.project2.thymioDSL.impl.ModelImpl
   * @see ld.project2.thymioDSL.impl.ThymioDSLPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Procedures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PROCEDURES = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ld.project2.thymioDSL.impl.ProcedureImpl <em>Procedure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ld.project2.thymioDSL.impl.ProcedureImpl
   * @see ld.project2.thymioDSL.impl.ThymioDSLPackageImpl#getProcedure()
   * @generated
   */
  int PROCEDURE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__EVENTS = 1;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__ACTIONS = 2;

  /**
   * The number of structural features of the '<em>Procedure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link ld.project2.thymioDSL.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ld.project2.thymioDSL.impl.EventImpl
   * @see ld.project2.thymioDSL.impl.ThymioDSLPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 2;

  /**
   * The feature id for the '<em><b>Button</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__BUTTON = 0;

  /**
   * The feature id for the '<em><b>Tap</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__TAP = 1;

  /**
   * The feature id for the '<em><b>Mic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__MIC = 2;

  /**
   * The feature id for the '<em><b>Sensor</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__SENSOR = 3;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link ld.project2.thymioDSL.impl.SensorImpl <em>Sensor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ld.project2.thymioDSL.impl.SensorImpl
   * @see ld.project2.thymioDSL.impl.ThymioDSLPackageImpl#getSensor()
   * @generated
   */
  int SENSOR = 3;

  /**
   * The feature id for the '<em><b>Back Left Sensor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR__BACK_LEFT_SENSOR = 0;

  /**
   * The feature id for the '<em><b>Back Right Sensor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR__BACK_RIGHT_SENSOR = 1;

  /**
   * The feature id for the '<em><b>Front Right Sensor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR__FRONT_RIGHT_SENSOR = 2;

  /**
   * The feature id for the '<em><b>Front Center Right Sensor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR__FRONT_CENTER_RIGHT_SENSOR = 3;

  /**
   * The feature id for the '<em><b>Front Center Sensor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR__FRONT_CENTER_SENSOR = 4;

  /**
   * The feature id for the '<em><b>Front Center Left Sensor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR__FRONT_CENTER_LEFT_SENSOR = 5;

  /**
   * The feature id for the '<em><b>Front Left Sensor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR__FRONT_LEFT_SENSOR = 6;

  /**
   * The number of structural features of the '<em>Sensor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSOR_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link ld.project2.thymioDSL.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ld.project2.thymioDSL.impl.ActionImpl
   * @see ld.project2.thymioDSL.impl.ThymioDSLPackageImpl#getAction()
   * @generated
   */
  int ACTION = 4;

  /**
   * The feature id for the '<em><b>Move</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__MOVE = 0;

  /**
   * The feature id for the '<em><b>Top Light</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__TOP_LIGHT = 1;

  /**
   * The feature id for the '<em><b>Bottom Light</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__BOTTOM_LIGHT = 2;

  /**
   * The feature id for the '<em><b>Sound</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__SOUND = 3;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link ld.project2.thymioDSL.impl.MotorImpl <em>Motor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ld.project2.thymioDSL.impl.MotorImpl
   * @see ld.project2.thymioDSL.impl.ThymioDSLPackageImpl#getMotor()
   * @generated
   */
  int MOTOR = 5;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOTOR__LEFT = 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOTOR__RIGHT = 1;

  /**
   * The number of structural features of the '<em>Motor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOTOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ld.project2.thymioDSL.impl.SoundImpl <em>Sound</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ld.project2.thymioDSL.impl.SoundImpl
   * @see ld.project2.thymioDSL.impl.ThymioDSLPackageImpl#getSound()
   * @generated
   */
  int SOUND = 6;

  /**
   * The feature id for the '<em><b>Pitch</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOUND__PITCH = 0;

  /**
   * The feature id for the '<em><b>Duration</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOUND__DURATION = 1;

  /**
   * The number of structural features of the '<em>Sound</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOUND_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ld.project2.thymioDSL.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ld.project2.thymioDSL.impl.ExpressionImpl
   * @see ld.project2.thymioDSL.impl.ThymioDSLPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 7;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__VALUE = 0;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__LEFT = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__RIGHT = 2;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link ld.project2.thymioDSL.impl.AdditionImpl <em>Addition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ld.project2.thymioDSL.impl.AdditionImpl
   * @see ld.project2.thymioDSL.impl.ThymioDSLPackageImpl#getAddition()
   * @generated
   */
  int ADDITION = 8;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION__VALUE = EXPRESSION__VALUE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION__RIGHT = EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Addition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ld.project2.thymioDSL.impl.MultiplicationImpl <em>Multiplication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ld.project2.thymioDSL.impl.MultiplicationImpl
   * @see ld.project2.thymioDSL.impl.ThymioDSLPackageImpl#getMultiplication()
   * @generated
   */
  int MULTIPLICATION = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__VALUE = EXPRESSION__VALUE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__RIGHT = EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Multiplication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link ld.project2.thymioDSL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see ld.project2.thymioDSL.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link ld.project2.thymioDSL.Model#getProcedures <em>Procedures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Procedures</em>'.
   * @see ld.project2.thymioDSL.Model#getProcedures()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Procedures();

  /**
   * Returns the meta object for class '{@link ld.project2.thymioDSL.Procedure <em>Procedure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure</em>'.
   * @see ld.project2.thymioDSL.Procedure
   * @generated
   */
  EClass getProcedure();

  /**
   * Returns the meta object for the attribute '{@link ld.project2.thymioDSL.Procedure#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ld.project2.thymioDSL.Procedure#getName()
   * @see #getProcedure()
   * @generated
   */
  EAttribute getProcedure_Name();

  /**
   * Returns the meta object for the containment reference list '{@link ld.project2.thymioDSL.Procedure#getEvents <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Events</em>'.
   * @see ld.project2.thymioDSL.Procedure#getEvents()
   * @see #getProcedure()
   * @generated
   */
  EReference getProcedure_Events();

  /**
   * Returns the meta object for the containment reference list '{@link ld.project2.thymioDSL.Procedure#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see ld.project2.thymioDSL.Procedure#getActions()
   * @see #getProcedure()
   * @generated
   */
  EReference getProcedure_Actions();

  /**
   * Returns the meta object for class '{@link ld.project2.thymioDSL.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see ld.project2.thymioDSL.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the attribute '{@link ld.project2.thymioDSL.Event#getButton <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Button</em>'.
   * @see ld.project2.thymioDSL.Event#getButton()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Button();

  /**
   * Returns the meta object for the attribute '{@link ld.project2.thymioDSL.Event#isTap <em>Tap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tap</em>'.
   * @see ld.project2.thymioDSL.Event#isTap()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Tap();

  /**
   * Returns the meta object for the attribute '{@link ld.project2.thymioDSL.Event#isMic <em>Mic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mic</em>'.
   * @see ld.project2.thymioDSL.Event#isMic()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Mic();

  /**
   * Returns the meta object for the containment reference list '{@link ld.project2.thymioDSL.Event#getSensor <em>Sensor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sensor</em>'.
   * @see ld.project2.thymioDSL.Event#getSensor()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Sensor();

  /**
   * Returns the meta object for class '{@link ld.project2.thymioDSL.Sensor <em>Sensor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sensor</em>'.
   * @see ld.project2.thymioDSL.Sensor
   * @generated
   */
  EClass getSensor();

  /**
   * Returns the meta object for the attribute '{@link ld.project2.thymioDSL.Sensor#getBackLeftSensor <em>Back Left Sensor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Back Left Sensor</em>'.
   * @see ld.project2.thymioDSL.Sensor#getBackLeftSensor()
   * @see #getSensor()
   * @generated
   */
  EAttribute getSensor_BackLeftSensor();

  /**
   * Returns the meta object for the attribute '{@link ld.project2.thymioDSL.Sensor#getBackRightSensor <em>Back Right Sensor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Back Right Sensor</em>'.
   * @see ld.project2.thymioDSL.Sensor#getBackRightSensor()
   * @see #getSensor()
   * @generated
   */
  EAttribute getSensor_BackRightSensor();

  /**
   * Returns the meta object for the attribute '{@link ld.project2.thymioDSL.Sensor#getFrontRightSensor <em>Front Right Sensor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Front Right Sensor</em>'.
   * @see ld.project2.thymioDSL.Sensor#getFrontRightSensor()
   * @see #getSensor()
   * @generated
   */
  EAttribute getSensor_FrontRightSensor();

  /**
   * Returns the meta object for the attribute '{@link ld.project2.thymioDSL.Sensor#getFrontCenterRightSensor <em>Front Center Right Sensor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Front Center Right Sensor</em>'.
   * @see ld.project2.thymioDSL.Sensor#getFrontCenterRightSensor()
   * @see #getSensor()
   * @generated
   */
  EAttribute getSensor_FrontCenterRightSensor();

  /**
   * Returns the meta object for the attribute '{@link ld.project2.thymioDSL.Sensor#getFrontCenterSensor <em>Front Center Sensor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Front Center Sensor</em>'.
   * @see ld.project2.thymioDSL.Sensor#getFrontCenterSensor()
   * @see #getSensor()
   * @generated
   */
  EAttribute getSensor_FrontCenterSensor();

  /**
   * Returns the meta object for the attribute '{@link ld.project2.thymioDSL.Sensor#getFrontCenterLeftSensor <em>Front Center Left Sensor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Front Center Left Sensor</em>'.
   * @see ld.project2.thymioDSL.Sensor#getFrontCenterLeftSensor()
   * @see #getSensor()
   * @generated
   */
  EAttribute getSensor_FrontCenterLeftSensor();

  /**
   * Returns the meta object for the attribute '{@link ld.project2.thymioDSL.Sensor#getFrontLeftSensor <em>Front Left Sensor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Front Left Sensor</em>'.
   * @see ld.project2.thymioDSL.Sensor#getFrontLeftSensor()
   * @see #getSensor()
   * @generated
   */
  EAttribute getSensor_FrontLeftSensor();

  /**
   * Returns the meta object for class '{@link ld.project2.thymioDSL.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see ld.project2.thymioDSL.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the containment reference '{@link ld.project2.thymioDSL.Action#getMove <em>Move</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Move</em>'.
   * @see ld.project2.thymioDSL.Action#getMove()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Move();

  /**
   * Returns the meta object for the attribute '{@link ld.project2.thymioDSL.Action#getTopLight <em>Top Light</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Top Light</em>'.
   * @see ld.project2.thymioDSL.Action#getTopLight()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_TopLight();

  /**
   * Returns the meta object for the attribute '{@link ld.project2.thymioDSL.Action#getBottomLight <em>Bottom Light</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bottom Light</em>'.
   * @see ld.project2.thymioDSL.Action#getBottomLight()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_BottomLight();

  /**
   * Returns the meta object for the containment reference list '{@link ld.project2.thymioDSL.Action#getSound <em>Sound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sound</em>'.
   * @see ld.project2.thymioDSL.Action#getSound()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Sound();

  /**
   * Returns the meta object for class '{@link ld.project2.thymioDSL.Motor <em>Motor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Motor</em>'.
   * @see ld.project2.thymioDSL.Motor
   * @generated
   */
  EClass getMotor();

  /**
   * Returns the meta object for the containment reference '{@link ld.project2.thymioDSL.Motor#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see ld.project2.thymioDSL.Motor#getLeft()
   * @see #getMotor()
   * @generated
   */
  EReference getMotor_Left();

  /**
   * Returns the meta object for the containment reference '{@link ld.project2.thymioDSL.Motor#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see ld.project2.thymioDSL.Motor#getRight()
   * @see #getMotor()
   * @generated
   */
  EReference getMotor_Right();

  /**
   * Returns the meta object for class '{@link ld.project2.thymioDSL.Sound <em>Sound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sound</em>'.
   * @see ld.project2.thymioDSL.Sound
   * @generated
   */
  EClass getSound();

  /**
   * Returns the meta object for the containment reference list '{@link ld.project2.thymioDSL.Sound#getPitch <em>Pitch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pitch</em>'.
   * @see ld.project2.thymioDSL.Sound#getPitch()
   * @see #getSound()
   * @generated
   */
  EReference getSound_Pitch();

  /**
   * Returns the meta object for the attribute list '{@link ld.project2.thymioDSL.Sound#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Duration</em>'.
   * @see ld.project2.thymioDSL.Sound#getDuration()
   * @see #getSound()
   * @generated
   */
  EAttribute getSound_Duration();

  /**
   * Returns the meta object for class '{@link ld.project2.thymioDSL.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see ld.project2.thymioDSL.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the attribute '{@link ld.project2.thymioDSL.Expression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see ld.project2.thymioDSL.Expression#getValue()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Value();

  /**
   * Returns the meta object for the containment reference '{@link ld.project2.thymioDSL.Expression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see ld.project2.thymioDSL.Expression#getLeft()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link ld.project2.thymioDSL.Expression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see ld.project2.thymioDSL.Expression#getRight()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Right();

  /**
   * Returns the meta object for class '{@link ld.project2.thymioDSL.Addition <em>Addition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Addition</em>'.
   * @see ld.project2.thymioDSL.Addition
   * @generated
   */
  EClass getAddition();

  /**
   * Returns the meta object for class '{@link ld.project2.thymioDSL.Multiplication <em>Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplication</em>'.
   * @see ld.project2.thymioDSL.Multiplication
   * @generated
   */
  EClass getMultiplication();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ThymioDSLFactory getThymioDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link ld.project2.thymioDSL.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ld.project2.thymioDSL.impl.ModelImpl
     * @see ld.project2.thymioDSL.impl.ThymioDSLPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Procedures</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PROCEDURES = eINSTANCE.getModel_Procedures();

    /**
     * The meta object literal for the '{@link ld.project2.thymioDSL.impl.ProcedureImpl <em>Procedure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ld.project2.thymioDSL.impl.ProcedureImpl
     * @see ld.project2.thymioDSL.impl.ThymioDSLPackageImpl#getProcedure()
     * @generated
     */
    EClass PROCEDURE = eINSTANCE.getProcedure();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCEDURE__NAME = eINSTANCE.getProcedure_Name();

    /**
     * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE__EVENTS = eINSTANCE.getProcedure_Events();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE__ACTIONS = eINSTANCE.getProcedure_Actions();

    /**
     * The meta object literal for the '{@link ld.project2.thymioDSL.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ld.project2.thymioDSL.impl.EventImpl
     * @see ld.project2.thymioDSL.impl.ThymioDSLPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '<em><b>Button</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__BUTTON = eINSTANCE.getEvent_Button();

    /**
     * The meta object literal for the '<em><b>Tap</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__TAP = eINSTANCE.getEvent_Tap();

    /**
     * The meta object literal for the '<em><b>Mic</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__MIC = eINSTANCE.getEvent_Mic();

    /**
     * The meta object literal for the '<em><b>Sensor</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__SENSOR = eINSTANCE.getEvent_Sensor();

    /**
     * The meta object literal for the '{@link ld.project2.thymioDSL.impl.SensorImpl <em>Sensor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ld.project2.thymioDSL.impl.SensorImpl
     * @see ld.project2.thymioDSL.impl.ThymioDSLPackageImpl#getSensor()
     * @generated
     */
    EClass SENSOR = eINSTANCE.getSensor();

    /**
     * The meta object literal for the '<em><b>Back Left Sensor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SENSOR__BACK_LEFT_SENSOR = eINSTANCE.getSensor_BackLeftSensor();

    /**
     * The meta object literal for the '<em><b>Back Right Sensor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SENSOR__BACK_RIGHT_SENSOR = eINSTANCE.getSensor_BackRightSensor();

    /**
     * The meta object literal for the '<em><b>Front Right Sensor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SENSOR__FRONT_RIGHT_SENSOR = eINSTANCE.getSensor_FrontRightSensor();

    /**
     * The meta object literal for the '<em><b>Front Center Right Sensor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SENSOR__FRONT_CENTER_RIGHT_SENSOR = eINSTANCE.getSensor_FrontCenterRightSensor();

    /**
     * The meta object literal for the '<em><b>Front Center Sensor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SENSOR__FRONT_CENTER_SENSOR = eINSTANCE.getSensor_FrontCenterSensor();

    /**
     * The meta object literal for the '<em><b>Front Center Left Sensor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SENSOR__FRONT_CENTER_LEFT_SENSOR = eINSTANCE.getSensor_FrontCenterLeftSensor();

    /**
     * The meta object literal for the '<em><b>Front Left Sensor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SENSOR__FRONT_LEFT_SENSOR = eINSTANCE.getSensor_FrontLeftSensor();

    /**
     * The meta object literal for the '{@link ld.project2.thymioDSL.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ld.project2.thymioDSL.impl.ActionImpl
     * @see ld.project2.thymioDSL.impl.ThymioDSLPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Move</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__MOVE = eINSTANCE.getAction_Move();

    /**
     * The meta object literal for the '<em><b>Top Light</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__TOP_LIGHT = eINSTANCE.getAction_TopLight();

    /**
     * The meta object literal for the '<em><b>Bottom Light</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__BOTTOM_LIGHT = eINSTANCE.getAction_BottomLight();

    /**
     * The meta object literal for the '<em><b>Sound</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__SOUND = eINSTANCE.getAction_Sound();

    /**
     * The meta object literal for the '{@link ld.project2.thymioDSL.impl.MotorImpl <em>Motor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ld.project2.thymioDSL.impl.MotorImpl
     * @see ld.project2.thymioDSL.impl.ThymioDSLPackageImpl#getMotor()
     * @generated
     */
    EClass MOTOR = eINSTANCE.getMotor();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOTOR__LEFT = eINSTANCE.getMotor_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOTOR__RIGHT = eINSTANCE.getMotor_Right();

    /**
     * The meta object literal for the '{@link ld.project2.thymioDSL.impl.SoundImpl <em>Sound</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ld.project2.thymioDSL.impl.SoundImpl
     * @see ld.project2.thymioDSL.impl.ThymioDSLPackageImpl#getSound()
     * @generated
     */
    EClass SOUND = eINSTANCE.getSound();

    /**
     * The meta object literal for the '<em><b>Pitch</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOUND__PITCH = eINSTANCE.getSound_Pitch();

    /**
     * The meta object literal for the '<em><b>Duration</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOUND__DURATION = eINSTANCE.getSound_Duration();

    /**
     * The meta object literal for the '{@link ld.project2.thymioDSL.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ld.project2.thymioDSL.impl.ExpressionImpl
     * @see ld.project2.thymioDSL.impl.ThymioDSLPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__VALUE = eINSTANCE.getExpression_Value();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__LEFT = eINSTANCE.getExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__RIGHT = eINSTANCE.getExpression_Right();

    /**
     * The meta object literal for the '{@link ld.project2.thymioDSL.impl.AdditionImpl <em>Addition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ld.project2.thymioDSL.impl.AdditionImpl
     * @see ld.project2.thymioDSL.impl.ThymioDSLPackageImpl#getAddition()
     * @generated
     */
    EClass ADDITION = eINSTANCE.getAddition();

    /**
     * The meta object literal for the '{@link ld.project2.thymioDSL.impl.MultiplicationImpl <em>Multiplication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ld.project2.thymioDSL.impl.MultiplicationImpl
     * @see ld.project2.thymioDSL.impl.ThymioDSLPackageImpl#getMultiplication()
     * @generated
     */
    EClass MULTIPLICATION = eINSTANCE.getMultiplication();

  }

} //ThymioDSLPackage
