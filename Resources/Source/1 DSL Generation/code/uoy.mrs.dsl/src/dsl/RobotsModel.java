/**
 */
package dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robots Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsl.RobotsModel#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link dsl.RobotsModel#getRobots <em>Robots</em>}</li>
 * </ul>
 *
 * @see dsl.DslPackage#getRobotsModel()
 * @model
 * @generated
 */
public interface RobotsModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link dsl.Capability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' containment reference list.
	 * @see dsl.DslPackage#getRobotsModel_Capabilities()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Capability> getCapabilities();

	/**
	 * Returns the value of the '<em><b>Robots</b></em>' reference list.
	 * The list contents are of type {@link dsl.Robot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Robots</em>' reference list.
	 * @see dsl.DslPackage#getRobotsModel_Robots()
	 * @model required="true"
	 * @generated
	 */
	EList<Robot> getRobots();

} // RobotsModel
