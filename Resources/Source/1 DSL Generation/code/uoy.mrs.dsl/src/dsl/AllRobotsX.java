/**
 */
package dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All Robots X</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsl.AllRobotsX#getCoordinate <em>Coordinate</em>}</li>
 *   <li>{@link dsl.AllRobotsX#getType <em>Type</em>}</li>
 *   <li>{@link dsl.AllRobotsX#getXy <em>Xy</em>}</li>
 * </ul>
 *
 * @see dsl.DslPackage#getAllRobotsX()
 * @model
 * @generated
 */
public interface AllRobotsX extends QoS {
	/**
	 * Returns the value of the '<em><b>Coordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinate</em>' attribute.
	 * @see #setCoordinate(String)
	 * @see dsl.DslPackage#getAllRobotsX_Coordinate()
	 * @model required="true"
	 * @generated
	 */
	String getCoordinate();

	/**
	 * Sets the value of the '{@link dsl.AllRobotsX#getCoordinate <em>Coordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinate</em>' attribute.
	 * @see #getCoordinate()
	 * @generated
	 */
	void setCoordinate(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see dsl.DslPackage#getAllRobotsX_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link dsl.AllRobotsX#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Xy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xy</em>' attribute.
	 * @see #setXy(double)
	 * @see dsl.DslPackage#getAllRobotsX_Xy()
	 * @model required="true"
	 * @generated
	 */
	double getXy();

	/**
	 * Sets the value of the '{@link dsl.AllRobotsX#getXy <em>Xy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xy</em>' attribute.
	 * @see #getXy()
	 * @generated
	 */
	void setXy(double value);

} // AllRobotsX
