/**
 */
package dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Task Loc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsl.AtomicTaskLoc#getAt <em>At</em>}</li>
 *   <li>{@link dsl.AtomicTaskLoc#getLoc <em>Loc</em>}</li>
 * </ul>
 *
 * @see dsl.DslPackage#getAtomicTaskLoc()
 * @model
 * @generated
 */
public interface AtomicTaskLoc extends Mission {
	/**
	 * Returns the value of the '<em><b>At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>At</em>' reference.
	 * @see #setAt(AtomicTask)
	 * @see dsl.DslPackage#getAtomicTaskLoc_At()
	 * @model required="true"
	 * @generated
	 */
	AtomicTask getAt();

	/**
	 * Sets the value of the '{@link dsl.AtomicTaskLoc#getAt <em>At</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>At</em>' reference.
	 * @see #getAt()
	 * @generated
	 */
	void setAt(AtomicTask value);

	/**
	 * Returns the value of the '<em><b>Loc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loc</em>' reference.
	 * @see #setLoc(Location)
	 * @see dsl.DslPackage#getAtomicTaskLoc_Loc()
	 * @model
	 * @generated
	 */
	Location getLoc();

	/**
	 * Sets the value of the '{@link dsl.AtomicTaskLoc#getLoc <em>Loc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc</em>' reference.
	 * @see #getLoc()
	 * @generated
	 */
	void setLoc(Location value);

} // AtomicTaskLoc
