/**
 */
package dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All Robots Deploy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsl.AllRobotsDeploy#getS <em>S</em>}</li>
 * </ul>
 *
 * @see dsl.DslPackage#getAllRobotsDeploy()
 * @model
 * @generated
 */
public interface AllRobotsDeploy extends QoS {
	/**
	 * Returns the value of the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>S</em>' attribute.
	 * @see #setS(String)
	 * @see dsl.DslPackage#getAllRobotsDeploy_S()
	 * @model required="true"
	 * @generated
	 */
	String getS();

	/**
	 * Sets the value of the '{@link dsl.AllRobotsDeploy#getS <em>S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>S</em>' attribute.
	 * @see #getS()
	 * @generated
	 */
	void setS(String value);

} // AllRobotsDeploy
