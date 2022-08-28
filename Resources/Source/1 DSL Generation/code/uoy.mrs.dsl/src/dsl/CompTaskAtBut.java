/**
 */
package dsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comp Task At But</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsl.CompTaskAtBut#getCt <em>Ct</em>}</li>
 *   <li>{@link dsl.CompTaskAtBut#getLocationList <em>Location List</em>}</li>
 *   <li>{@link dsl.CompTaskAtBut#getLoc <em>Loc</em>}</li>
 * </ul>
 *
 * @see dsl.DslPackage#getCompTaskAtBut()
 * @model
 * @generated
 */
public interface CompTaskAtBut extends Mission {
	/**
	 * Returns the value of the '<em><b>Ct</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ct</em>' reference.
	 * @see #setCt(CompoundTask)
	 * @see dsl.DslPackage#getCompTaskAtBut_Ct()
	 * @model required="true"
	 * @generated
	 */
	CompoundTask getCt();

	/**
	 * Sets the value of the '{@link dsl.CompTaskAtBut#getCt <em>Ct</em>}' reference.
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
	 * @see dsl.DslPackage#getCompTaskAtBut_LocationList()
	 * @model lower="2"
	 * @generated
	 */
	EList<Location> getLocationList();

	/**
	 * Returns the value of the '<em><b>Loc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loc</em>' reference.
	 * @see #setLoc(LocationOrSpace)
	 * @see dsl.DslPackage#getCompTaskAtBut_Loc()
	 * @model required="true"
	 * @generated
	 */
	LocationOrSpace getLoc();

	/**
	 * Sets the value of the '{@link dsl.CompTaskAtBut#getLoc <em>Loc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc</em>' reference.
	 * @see #getLoc()
	 * @generated
	 */
	void setLoc(LocationOrSpace value);

} // CompTaskAtBut
