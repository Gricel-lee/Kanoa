/**
 */
package dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robots XX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsl.RobotsXX#getCoordinate <em>Coordinate</em>}</li>
 *   <li>{@link dsl.RobotsXX#getXy1 <em>Xy1</em>}</li>
 *   <li>{@link dsl.RobotsXX#getXy2 <em>Xy2</em>}</li>
 *   <li>{@link dsl.RobotsXX#getRobot <em>Robot</em>}</li>
 * </ul>
 *
 * @see dsl.DslPackage#getRobotsXX()
 * @model
 * @generated
 */
public interface RobotsXX extends QoS {
	/**
	 * Returns the value of the '<em><b>Coordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinate</em>' attribute.
	 * @see #setCoordinate(String)
	 * @see dsl.DslPackage#getRobotsXX_Coordinate()
	 * @model required="true"
	 * @generated
	 */
	String getCoordinate();

	/**
	 * Sets the value of the '{@link dsl.RobotsXX#getCoordinate <em>Coordinate</em>}' attribute.
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
	 * @see dsl.DslPackage#getRobotsXX_Xy1()
	 * @model required="true"
	 * @generated
	 */
	double getXy1();

	/**
	 * Sets the value of the '{@link dsl.RobotsXX#getXy1 <em>Xy1</em>}' attribute.
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
	 * @see dsl.DslPackage#getRobotsXX_Xy2()
	 * @model required="true"
	 * @generated
	 */
	double getXy2();

	/**
	 * Sets the value of the '{@link dsl.RobotsXX#getXy2 <em>Xy2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xy2</em>' attribute.
	 * @see #getXy2()
	 * @generated
	 */
	void setXy2(double value);

	/**
	 * Returns the value of the '<em><b>Robot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Robot</em>' reference.
	 * @see #setRobot(Robot)
	 * @see dsl.DslPackage#getRobotsXX_Robot()
	 * @model required="true"
	 * @generated
	 */
	Robot getRobot();

	/**
	 * Sets the value of the '{@link dsl.RobotsXX#getRobot <em>Robot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Robot</em>' reference.
	 * @see #getRobot()
	 * @generated
	 */
	void setRobot(Robot value);

} // RobotsXX
