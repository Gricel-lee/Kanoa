/**
 */
package dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All Robots XX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsl.AllRobotsXX#getCoordinate <em>Coordinate</em>}</li>
 *   <li>{@link dsl.AllRobotsXX#getXy1 <em>Xy1</em>}</li>
 *   <li>{@link dsl.AllRobotsXX#getXy2 <em>Xy2</em>}</li>
 * </ul>
 *
 * @see dsl.DslPackage#getAllRobotsXX()
 * @model
 * @generated
 */
public interface AllRobotsXX extends QoS {
	/**
	 * Returns the value of the '<em><b>Coordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinate</em>' attribute.
	 * @see #setCoordinate(String)
	 * @see dsl.DslPackage#getAllRobotsXX_Coordinate()
	 * @model required="true"
	 * @generated
	 */
	String getCoordinate();

	/**
	 * Sets the value of the '{@link dsl.AllRobotsXX#getCoordinate <em>Coordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinate</em>' attribute.
	 * @see #getCoordinate()
	 * @generated
	 */
	void setCoordinate(String value);

	/**
	 * Returns the value of the '<em><b>Xy1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xy1</em>' attribute.
	 * @see #setXy1(double)
	 * @see dsl.DslPackage#getAllRobotsXX_Xy1()
	 * @model required="true"
	 * @generated
	 */
	double getXy1();

	/**
	 * Sets the value of the '{@link dsl.AllRobotsXX#getXy1 <em>Xy1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xy1</em>' attribute.
	 * @see #getXy1()
	 * @generated
	 */
	void setXy1(double value);

	/**
	 * Returns the value of the '<em><b>Xy2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xy2</em>' attribute.
	 * @see #setXy2(double)
	 * @see dsl.DslPackage#getAllRobotsXX_Xy2()
	 * @model required="true"
	 * @generated
	 */
	double getXy2();

	/**
	 * Sets the value of the '{@link dsl.AllRobotsXX#getXy2 <em>Xy2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xy2</em>' attribute.
	 * @see #getXy2()
	 * @generated
	 */
	void setXy2(double value);

} // AllRobotsXX
