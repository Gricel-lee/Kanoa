/**
 */
package dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robots X</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsl.RobotsX#getCoordinate <em>Coordinate</em>}</li>
 *   <li>{@link dsl.RobotsX#getXy <em>Xy</em>}</li>
 *   <li>{@link dsl.RobotsX#getRobot <em>Robot</em>}</li>
 *   <li>{@link dsl.RobotsX#getType <em>Type</em>}</li>
 *   <li>{@link dsl.RobotsX#getTyp <em>Typ</em>}</li>
 * </ul>
 *
 * @see dsl.DslPackage#getRobotsX()
 * @model
 * @generated
 */
public interface RobotsX extends QoS {
	/**
	 * Returns the value of the '<em><b>Coordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinate</em>' attribute.
	 * @see #setCoordinate(String)
	 * @see dsl.DslPackage#getRobotsX_Coordinate()
	 * @model required="true"
	 * @generated
	 */
	String getCoordinate();

	/**
	 * Sets the value of the '{@link dsl.RobotsX#getCoordinate <em>Coordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinate</em>' attribute.
	 * @see #getCoordinate()
	 * @generated
	 */
	void setCoordinate(String value);

	/**
	 * Returns the value of the '<em><b>Xy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xy</em>' attribute.
	 * @see #setXy(double)
	 * @see dsl.DslPackage#getRobotsX_Xy()
	 * @model required="true"
	 * @generated
	 */
	double getXy();

	/**
	 * Sets the value of the '{@link dsl.RobotsX#getXy <em>Xy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xy</em>' attribute.
	 * @see #getXy()
	 * @generated
	 */
	void setXy(double value);

	/**
	 * Returns the value of the '<em><b>Robot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Robot</em>' reference.
	 * @see #setRobot(Robot)
	 * @see dsl.DslPackage#getRobotsX_Robot()
	 * @model required="true"
	 * @generated
	 */
	Robot getRobot();

	/**
	 * Sets the value of the '{@link dsl.RobotsX#getRobot <em>Robot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Robot</em>' reference.
	 * @see #getRobot()
	 * @generated
	 */
	void setRobot(Robot value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see dsl.DslPackage#getRobotsX_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link dsl.RobotsX#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Typ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typ</em>' attribute.
	 * @see #setTyp(String)
	 * @see dsl.DslPackage#getRobotsX_Typ()
	 * @model required="true"
	 * @generated
	 */
	String getTyp();

	/**
	 * Sets the value of the '{@link dsl.RobotsX#getTyp <em>Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typ</em>' attribute.
	 * @see #getTyp()
	 * @generated
	 */
	void setTyp(String value);

} // RobotsX
