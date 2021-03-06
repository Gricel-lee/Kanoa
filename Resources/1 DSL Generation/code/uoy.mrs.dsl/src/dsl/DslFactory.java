/**
 */
package dsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dsl.DslPackage
 * @generated
 */
public interface DslFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DslFactory eINSTANCE = dsl.impl.DslFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Problem Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Specification</em>'.
	 * @generated
	 */
	ProblemSpecification createProblemSpecification();

	/**
	 * Returns a new object of class '<em>World Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>World Model</em>'.
	 * @generated
	 */
	WorldModel createWorldModel();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Paths</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Paths</em>'.
	 * @generated
	 */
	Paths createPaths();

	/**
	 * Returns a new object of class '<em>Robots Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robots Model</em>'.
	 * @generated
	 */
	RobotsModel createRobotsModel();

	/**
	 * Returns a new object of class '<em>Robot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robot</em>'.
	 * @generated
	 */
	Robot createRobot();

	/**
	 * Returns a new object of class '<em>Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability</em>'.
	 * @generated
	 */
	Capability createCapability();

	/**
	 * Returns a new object of class '<em>Tasks Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tasks Model</em>'.
	 * @generated
	 */
	TasksModel createTasksModel();

	/**
	 * Returns a new object of class '<em>Atomic Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Task</em>'.
	 * @generated
	 */
	AtomicTask createAtomicTask();

	/**
	 * Returns a new object of class '<em>Compound Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compound Task</em>'.
	 * @generated
	 */
	CompoundTask createCompoundTask();

	/**
	 * Returns a new object of class '<em>Mission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mission</em>'.
	 * @generated
	 */
	Mission createMission();

	/**
	 * Returns a new object of class '<em>Qo S</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qo S</em>'.
	 * @generated
	 */
	QoS createQoS();

	/**
	 * Returns a new object of class '<em>Atomic Task No Loc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Task No Loc</em>'.
	 * @generated
	 */
	AtomicTaskNoLoc createAtomicTaskNoLoc();

	/**
	 * Returns a new object of class '<em>Atomic Task Loc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Task Loc</em>'.
	 * @generated
	 */
	AtomicTaskLoc createAtomicTaskLoc();

	/**
	 * Returns a new object of class '<em>Comp Task No Loc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comp Task No Loc</em>'.
	 * @generated
	 */
	CompTaskNoLoc createCompTaskNoLoc();

	/**
	 * Returns a new object of class '<em>Comp Task One Loc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comp Task One Loc</em>'.
	 * @generated
	 */
	CompTaskOneLoc createCompTaskOneLoc();

	/**
	 * Returns a new object of class '<em>Comp Task All Loc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comp Task All Loc</em>'.
	 * @generated
	 */
	CompTaskAllLoc createCompTaskAllLoc();

	/**
	 * Returns a new object of class '<em>Comp Task At But</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comp Task At But</em>'.
	 * @generated
	 */
	CompTaskAtBut createCompTaskAtBut();

	/**
	 * Returns a new object of class '<em>Comp Task Stated But</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comp Task Stated But</em>'.
	 * @generated
	 */
	CompTaskStatedBut createCompTaskStatedBut();

	/**
	 * Returns a new object of class '<em>Location Or Space</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Or Space</em>'.
	 * @generated
	 */
	LocationOrSpace createLocationOrSpace();

	/**
	 * Returns a new object of class '<em>Robots2tasks Performance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robots2tasks Performance</em>'.
	 * @generated
	 */
	Robots2tasksPerformance createRobots2tasksPerformance();

	/**
	 * Returns a new object of class '<em>Comp Task List Loc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comp Task List Loc</em>'.
	 * @generated
	 */
	CompTaskListLoc createCompTaskListLoc();

	/**
	 * Returns a new object of class '<em>All Robots XX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>All Robots XX</em>'.
	 * @generated
	 */
	AllRobotsXX createAllRobotsXX();

	/**
	 * Returns a new object of class '<em>All Robots X</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>All Robots X</em>'.
	 * @generated
	 */
	AllRobotsX createAllRobotsX();

	/**
	 * Returns a new object of class '<em>Robots XX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robots XX</em>'.
	 * @generated
	 */
	RobotsXX createRobotsXX();

	/**
	 * Returns a new object of class '<em>Robots X</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robots X</em>'.
	 * @generated
	 */
	RobotsX createRobotsX();

	/**
	 * Returns a new object of class '<em>All Robots Deploy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>All Robots Deploy</em>'.
	 * @generated
	 */
	AllRobotsDeploy createAllRobotsDeploy();

	/**
	 * Returns a new object of class '<em>Num Allocations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Num Allocations</em>'.
	 * @generated
	 */
	NumAllocations createNumAllocations();

	/**
	 * Returns a new object of class '<em>Num Population</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Num Population</em>'.
	 * @generated
	 */
	NumPopulation createNumPopulation();

	/**
	 * Returns a new object of class '<em>Num Evaluations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Num Evaluations</em>'.
	 * @generated
	 */
	NumEvaluations createNumEvaluations();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DslPackage getDslPackage();

} //DslFactory
