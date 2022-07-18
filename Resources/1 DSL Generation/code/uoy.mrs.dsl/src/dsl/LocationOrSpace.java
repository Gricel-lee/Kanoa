/**
 */
package dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Or Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsl.LocationOrSpace#getLoc <em>Loc</em>}</li>
 *   <li>{@link dsl.LocationOrSpace#getSpace <em>Space</em>}</li>
 * </ul>
 *
 * @see dsl.DslPackage#getLocationOrSpace()
 * @model
 * @generated
 */
public interface LocationOrSpace extends EObject {
	/**
	 * Returns the value of the '<em><b>Loc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loc</em>' reference.
	 * @see #setLoc(Location)
	 * @see dsl.DslPackage#getLocationOrSpace_Loc()
	 * @model
	 * @generated
	 */
	Location getLoc();

	/**
	 * Sets the value of the '{@link dsl.LocationOrSpace#getLoc <em>Loc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc</em>' reference.
	 * @see #getLoc()
	 * @generated
	 */
	void setLoc(Location value);

	/**
	 * Returns the value of the '<em><b>Space</b></em>' attribute.
	 * The literals are from the enumeration {@link dsl.NoLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space</em>' attribute.
	 * @see dsl.NoLocation
	 * @see #setSpace(NoLocation)
	 * @see dsl.DslPackage#getLocationOrSpace_Space()
	 * @model
	 * @generated
	 */
	NoLocation getSpace();

	/**
	 * Sets the value of the '{@link dsl.LocationOrSpace#getSpace <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space</em>' attribute.
	 * @see dsl.NoLocation
	 * @see #getSpace()
	 * @generated
	 */
	void setSpace(NoLocation value);

} // LocationOrSpace
