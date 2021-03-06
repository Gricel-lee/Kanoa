/**
 */
package dsl.util;

import dsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see dsl.DslPackage
 * @generated
 */
public class DslSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DslPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslSwitch() {
		if (modelPackage == null) {
			modelPackage = DslPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DslPackage.PROBLEM_SPECIFICATION: {
				ProblemSpecification problemSpecification = (ProblemSpecification)theEObject;
				T result = caseProblemSpecification(problemSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.WORLD_MODEL: {
				WorldModel worldModel = (WorldModel)theEObject;
				T result = caseWorldModel(worldModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.LOCATION: {
				Location location = (Location)theEObject;
				T result = caseLocation(location);
				if (result == null) result = caseWorldModel(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.PATHS: {
				Paths paths = (Paths)theEObject;
				T result = casePaths(paths);
				if (result == null) result = caseWorldModel(paths);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.ROBOTS_MODEL: {
				RobotsModel robotsModel = (RobotsModel)theEObject;
				T result = caseRobotsModel(robotsModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.ROBOT: {
				Robot robot = (Robot)theEObject;
				T result = caseRobot(robot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.CAPABILITY: {
				Capability capability = (Capability)theEObject;
				T result = caseCapability(capability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.TASKS_MODEL: {
				TasksModel tasksModel = (TasksModel)theEObject;
				T result = caseTasksModel(tasksModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.ATOMIC_TASK: {
				AtomicTask atomicTask = (AtomicTask)theEObject;
				T result = caseAtomicTask(atomicTask);
				if (result == null) result = caseTasksModel(atomicTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.COMPOUND_TASK: {
				CompoundTask compoundTask = (CompoundTask)theEObject;
				T result = caseCompoundTask(compoundTask);
				if (result == null) result = caseTasksModel(compoundTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.MISSION: {
				Mission mission = (Mission)theEObject;
				T result = caseMission(mission);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.QO_S: {
				QoS qoS = (QoS)theEObject;
				T result = caseQoS(qoS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.ATOMIC_TASK_NO_LOC: {
				AtomicTaskNoLoc atomicTaskNoLoc = (AtomicTaskNoLoc)theEObject;
				T result = caseAtomicTaskNoLoc(atomicTaskNoLoc);
				if (result == null) result = caseMission(atomicTaskNoLoc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.ATOMIC_TASK_LOC: {
				AtomicTaskLoc atomicTaskLoc = (AtomicTaskLoc)theEObject;
				T result = caseAtomicTaskLoc(atomicTaskLoc);
				if (result == null) result = caseMission(atomicTaskLoc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.COMP_TASK_NO_LOC: {
				CompTaskNoLoc compTaskNoLoc = (CompTaskNoLoc)theEObject;
				T result = caseCompTaskNoLoc(compTaskNoLoc);
				if (result == null) result = caseMission(compTaskNoLoc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.COMP_TASK_ONE_LOC: {
				CompTaskOneLoc compTaskOneLoc = (CompTaskOneLoc)theEObject;
				T result = caseCompTaskOneLoc(compTaskOneLoc);
				if (result == null) result = caseMission(compTaskOneLoc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.COMP_TASK_ALL_LOC: {
				CompTaskAllLoc compTaskAllLoc = (CompTaskAllLoc)theEObject;
				T result = caseCompTaskAllLoc(compTaskAllLoc);
				if (result == null) result = caseMission(compTaskAllLoc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.COMP_TASK_AT_BUT: {
				CompTaskAtBut compTaskAtBut = (CompTaskAtBut)theEObject;
				T result = caseCompTaskAtBut(compTaskAtBut);
				if (result == null) result = caseMission(compTaskAtBut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.COMP_TASK_STATED_BUT: {
				CompTaskStatedBut compTaskStatedBut = (CompTaskStatedBut)theEObject;
				T result = caseCompTaskStatedBut(compTaskStatedBut);
				if (result == null) result = caseMission(compTaskStatedBut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.LOCATION_OR_SPACE: {
				LocationOrSpace locationOrSpace = (LocationOrSpace)theEObject;
				T result = caseLocationOrSpace(locationOrSpace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.ROBOTS2TASKS_PERFORMANCE: {
				Robots2tasksPerformance robots2tasksPerformance = (Robots2tasksPerformance)theEObject;
				T result = caseRobots2tasksPerformance(robots2tasksPerformance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.COMP_TASK_LIST_LOC: {
				CompTaskListLoc compTaskListLoc = (CompTaskListLoc)theEObject;
				T result = caseCompTaskListLoc(compTaskListLoc);
				if (result == null) result = caseMission(compTaskListLoc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.ALL_ROBOTS_XX: {
				AllRobotsXX allRobotsXX = (AllRobotsXX)theEObject;
				T result = caseAllRobotsXX(allRobotsXX);
				if (result == null) result = caseQoS(allRobotsXX);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.ALL_ROBOTS_X: {
				AllRobotsX allRobotsX = (AllRobotsX)theEObject;
				T result = caseAllRobotsX(allRobotsX);
				if (result == null) result = caseQoS(allRobotsX);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.ROBOTS_XX: {
				RobotsXX robotsXX = (RobotsXX)theEObject;
				T result = caseRobotsXX(robotsXX);
				if (result == null) result = caseQoS(robotsXX);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.ROBOTS_X: {
				RobotsX robotsX = (RobotsX)theEObject;
				T result = caseRobotsX(robotsX);
				if (result == null) result = caseQoS(robotsX);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.ALL_ROBOTS_DEPLOY: {
				AllRobotsDeploy allRobotsDeploy = (AllRobotsDeploy)theEObject;
				T result = caseAllRobotsDeploy(allRobotsDeploy);
				if (result == null) result = caseQoS(allRobotsDeploy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.NUM_ALLOCATIONS: {
				NumAllocations numAllocations = (NumAllocations)theEObject;
				T result = caseNumAllocations(numAllocations);
				if (result == null) result = caseQoS(numAllocations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.NUM_POPULATION: {
				NumPopulation numPopulation = (NumPopulation)theEObject;
				T result = caseNumPopulation(numPopulation);
				if (result == null) result = caseQoS(numPopulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.NUM_EVALUATIONS: {
				NumEvaluations numEvaluations = (NumEvaluations)theEObject;
				T result = caseNumEvaluations(numEvaluations);
				if (result == null) result = caseQoS(numEvaluations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problem Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemSpecification(ProblemSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>World Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>World Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorldModel(WorldModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Paths</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paths</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaths(Paths object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Robots Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Robots Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRobotsModel(RobotsModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Robot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Robot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRobot(Robot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapability(Capability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tasks Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tasks Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTasksModel(TasksModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicTask(AtomicTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundTask(CompoundTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMission(Mission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qo S</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qo S</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQoS(QoS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Task No Loc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Task No Loc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicTaskNoLoc(AtomicTaskNoLoc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Task Loc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Task Loc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicTaskLoc(AtomicTaskLoc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comp Task No Loc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comp Task No Loc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompTaskNoLoc(CompTaskNoLoc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comp Task One Loc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comp Task One Loc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompTaskOneLoc(CompTaskOneLoc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comp Task All Loc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comp Task All Loc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompTaskAllLoc(CompTaskAllLoc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comp Task At But</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comp Task At But</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompTaskAtBut(CompTaskAtBut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comp Task Stated But</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comp Task Stated But</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompTaskStatedBut(CompTaskStatedBut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Or Space</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Or Space</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationOrSpace(LocationOrSpace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Robots2tasks Performance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Robots2tasks Performance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRobots2tasksPerformance(Robots2tasksPerformance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comp Task List Loc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comp Task List Loc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompTaskListLoc(CompTaskListLoc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Robots XX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Robots XX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllRobotsXX(AllRobotsXX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Robots X</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Robots X</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllRobotsX(AllRobotsX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Robots XX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Robots XX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRobotsXX(RobotsXX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Robots X</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Robots X</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRobotsX(RobotsX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Robots Deploy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Robots Deploy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllRobotsDeploy(AllRobotsDeploy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Num Allocations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Num Allocations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumAllocations(NumAllocations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Num Population</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Num Population</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumPopulation(NumPopulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Num Evaluations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Num Evaluations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumEvaluations(NumEvaluations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DslSwitch
