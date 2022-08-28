/**
 */
package dsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comp Task Stated But</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsl.CompTaskStatedBut#getCt <em>Ct</em>}</li>
 *   <li>{@link dsl.CompTaskStatedBut#getLocationList <em>Location List</em>}</li>
 * </ul>
 *
 * @see dsl.DslPackage#getCompTaskStatedBut()
 * @model
 * @generated
 */
public interface CompTaskStatedBut extends Mission {
	/**
	 * Returns the value of the '<em><b>Ct</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ct</em>' reference.
	 * @see #setCt(CompoundTask)
	 * @see dsl.DslPackage#getCompTaskStatedBut_Ct()
	 * @model required="true"
	 * @generated
	 */
	CompoundTask getCt();

	/**
	 * Sets the value of the '{@link dsl.CompTaskStatedBut#getCt <em>Ct</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ct</em>' reference.
	 * @see #getCt()
	 * @generated
	 */
	void setCt(CompoundTask value);

	/**
	 * Returns the value of the '<em><b>Location List</b></em>' reference list.
	 * The list contents are of type {@link dsl.Location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location List</em>' reference list.
	 * @see dsl.DslPackage#getCompTaskStatedBut_LocationList()
	 * @model lower="2"
	 * @generated
	 */
	EList<Location> getLocationList();

} // CompTaskStatedBut
