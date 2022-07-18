/**
 */
package dsl.tests;

import dsl.AllRobotsDeploy;
import dsl.DslFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>All Robots Deploy</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AllRobotsDeployTest extends QoSTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AllRobotsDeployTest.class);
	}

	/**
	 * Constructs a new All Robots Deploy test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllRobotsDeployTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this All Robots Deploy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AllRobotsDeploy getFixture() {
		return (AllRobotsDeploy)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DslFactory.eINSTANCE.createAllRobotsDeploy());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AllRobotsDeployTest
