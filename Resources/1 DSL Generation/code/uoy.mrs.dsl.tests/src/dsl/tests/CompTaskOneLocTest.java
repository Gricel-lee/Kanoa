/**
 */
package dsl.tests;

import dsl.CompTaskOneLoc;
import dsl.DslFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Comp Task One Loc</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompTaskOneLocTest extends MissionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CompTaskOneLocTest.class);
	}

	/**
	 * Constructs a new Comp Task One Loc test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompTaskOneLocTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Comp Task One Loc test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CompTaskOneLoc getFixture() {
		return (CompTaskOneLoc)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DslFactory.eINSTANCE.createCompTaskOneLoc());
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

} //CompTaskOneLocTest
