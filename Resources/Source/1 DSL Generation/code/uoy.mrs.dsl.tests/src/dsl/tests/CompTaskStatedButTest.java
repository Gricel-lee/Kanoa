/**
 */
package dsl.tests;

import dsl.CompTaskStatedBut;
import dsl.DslFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Comp Task Stated But</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompTaskStatedButTest extends MissionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CompTaskStatedButTest.class);
	}

	/**
	 * Constructs a new Comp Task Stated But test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompTaskStatedButTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Comp Task Stated But test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CompTaskStatedBut getFixture() {
		return (CompTaskStatedBut)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DslFactory.eINSTANCE.createCompTaskStatedBut());
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

} //CompTaskStatedButTest
