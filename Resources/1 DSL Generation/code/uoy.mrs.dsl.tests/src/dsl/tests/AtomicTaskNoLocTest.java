/**
 */
package dsl.tests;

import dsl.AtomicTaskNoLoc;
import dsl.DslFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Atomic Task No Loc</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtomicTaskNoLocTest extends MissionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AtomicTaskNoLocTest.class);
	}

	/**
	 * Constructs a new Atomic Task No Loc test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicTaskNoLocTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Atomic Task No Loc test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AtomicTaskNoLoc getFixture() {
		return (AtomicTaskNoLoc)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DslFactory.eINSTANCE.createAtomicTaskNoLoc());
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

} //AtomicTaskNoLocTest
