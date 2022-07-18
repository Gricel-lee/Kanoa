/**
 */
package dsl.tests;

import dsl.DslFactory;
import dsl.NumEvaluations;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Num Evaluations</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NumEvaluationsTest extends QoSTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NumEvaluationsTest.class);
	}

	/**
	 * Constructs a new Num Evaluations test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumEvaluationsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Num Evaluations test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NumEvaluations getFixture() {
		return (NumEvaluations)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DslFactory.eINSTANCE.createNumEvaluations());
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

} //NumEvaluationsTest
