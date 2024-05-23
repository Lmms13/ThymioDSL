/**
 * generated by Xtext 2.34.0
 */
package ld.project2.thymioDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lights</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ld.project2.thymioDSL.Lights#getTopLight <em>Top Light</em>}</li>
 *   <li>{@link ld.project2.thymioDSL.Lights#getBottomLight <em>Bottom Light</em>}</li>
 * </ul>
 *
 * @see ld.project2.thymioDSL.ThymioDSLPackage#getLights()
 * @model
 * @generated
 */
public interface Lights extends EObject
{
  /**
	 * Returns the value of the '<em><b>Top Light</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Light</em>' containment reference.
	 * @see #setTopLight(RGB)
	 * @see ld.project2.thymioDSL.ThymioDSLPackage#getLights_TopLight()
	 * @model containment="true"
	 * @generated
	 */
  RGB getTopLight();

  /**
	 * Sets the value of the '{@link ld.project2.thymioDSL.Lights#getTopLight <em>Top Light</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Light</em>' containment reference.
	 * @see #getTopLight()
	 * @generated
	 */
  void setTopLight(RGB value);

  /**
	 * Returns the value of the '<em><b>Bottom Light</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom Light</em>' containment reference.
	 * @see #setBottomLight(RGB)
	 * @see ld.project2.thymioDSL.ThymioDSLPackage#getLights_BottomLight()
	 * @model containment="true"
	 * @generated
	 */
  RGB getBottomLight();

  /**
	 * Sets the value of the '{@link ld.project2.thymioDSL.Lights#getBottomLight <em>Bottom Light</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bottom Light</em>' containment reference.
	 * @see #getBottomLight()
	 * @generated
	 */
  void setBottomLight(RGB value);

} // Lights
