/**
 */
package dsl.impl;

import dsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DslFactoryImpl extends EFactoryImpl implements DslFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DslFactory init() {
		try {
			DslFactory theDslFactory = (DslFactory)EPackage.Registry.INSTANCE.getEFactory(DslPackage.eNS_URI);
			if (theDslFactory != null) {
				return theDslFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DslFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DslPackage.PROBLEM_SPECIFICATION: return createProblemSpecification();
			case DslPackage.WORLD_MODEL: return createWorldModel();
			case DslPackage.LOCATION: return createLocation();
			case DslPackage.PATHS: return createPaths();
			case DslPackage.ROBOTS_MODEL: return createRobotsModel();
			case DslPackage.ROBOT: return createRobot();
			case DslPackage.CAPABILITY: return createCapability();
			case DslPackage.TASKS_MODEL: return createTasksModel();
			case DslPackage.ATOMIC_TASK: return createAtomicTask();
			case DslPackage.COMPOUND_TASK: return createCompoundTask();
			case DslPackage.MISSION: return createMission();
			case DslPackage.QO_S: return createQoS();
			case DslPackage.ATOMIC_TASK_NO_LOC: return createAtomicTaskNoLoc();
			case DslPackage.ATOMIC_TASK_LOC: return createAtomicTaskLoc();
			case DslPackage.COMP_TASK_NO_LOC: return createCompTaskNoLoc();
			case DslPackage.COMP_TASK_ONE_LOC: return createCompTaskOneLoc();
			case DslPackage.COMP_TASK_ALL_LOC: return createCompTaskAllLoc();
			case DslPackage.COMP_TASK_AT_BUT: return createCompTaskAtBut();
			case DslPackage.COMP_TASK_STATED_BUT: return createCompTaskStatedBut();
			case DslPackage.LOCATION_OR_SPACE: return createLocationOrSpace();
			case DslPackage.ROBOTS2TASKS_PERFORMANCE: return createRobots2tasksPerformance();
			case DslPackage.COMP_TASK_LIST_LOC: return createCompTaskListLoc();
			case DslPackage.ALL_ROBOTS_XX: return createAllRobotsXX();
			case DslPackage.ALL_ROBOTS_X: return createAllRobotsX();
			case DslPackage.ROBOTS_XX: return createRobotsXX();
			case DslPackage.ROBOTS_X: return createRobotsX();
			case DslPackage.ALL_ROBOTS_DEPLOY: return createAllRobotsDeploy();
			case DslPackage.NUM_ALLOCATIONS: return createNumAllocations();
			case DslPackage.NUM_POPULATION: return createNumPopulation();
			case DslPackage.NUM_EVALUATIONS: return createNumEvaluations();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DslPackage.NO_LOCATION:
				return createNoLocationFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DslPackage.NO_LOCATION:
				return convertNoLocationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemSpecification createProblemSpecification() {
		ProblemSpecificationImpl problemSpecification = new ProblemSpecificationImpl();
		return problemSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorldModel createWorldModel() {
		WorldModelImpl worldModel = new WorldModelImpl();
		return worldModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paths createPaths() {
		PathsImpl paths = new PathsImpl();
		return paths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotsModel createRobotsModel() {
		RobotsModelImpl robotsModel = new RobotsModelImpl();
		return robotsModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Robot createRobot() {
		RobotImpl robot = new RobotImpl();
		return robot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability createCapability() {
		CapabilityImpl capability = new CapabilityImpl();
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TasksModel createTasksModel() {
		TasksModelImpl tasksModel = new TasksModelImpl();
		return tasksModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicTask createAtomicTask() {
		AtomicTaskImpl atomicTask = new AtomicTaskImpl();
		return atomicTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundTask createCompoundTask() {
		CompoundTaskImpl compoundTask = new CompoundTaskImpl();
		return compoundTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mission createMission() {
		MissionImpl mission = new MissionImpl();
		return mission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoS createQoS() {
		QoSImpl qoS = new QoSImpl();
		return qoS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicTaskNoLoc createAtomicTaskNoLoc() {
		AtomicTaskNoLocImpl atomicTaskNoLoc = new AtomicTaskNoLocImpl();
		return atomicTaskNoLoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicTaskLoc createAtomicTaskLoc() {
		AtomicTaskLocImpl atomicTaskLoc = new AtomicTaskLocImpl();
		return atomicTaskLoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompTaskNoLoc createCompTaskNoLoc() {
		CompTaskNoLocImpl compTaskNoLoc = new CompTaskNoLocImpl();
		return compTaskNoLoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompTaskOneLoc createCompTaskOneLoc() {
		CompTaskOneLocImpl compTaskOneLoc = new CompTaskOneLocImpl();
		return compTaskOneLoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompTaskAllLoc createCompTaskAllLoc() {
		CompTaskAllLocImpl compTaskAllLoc = new CompTaskAllLocImpl();
		return compTaskAllLoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompTaskAtBut createCompTaskAtBut() {
		CompTaskAtButImpl compTaskAtBut = new CompTaskAtButImpl();
		return compTaskAtBut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompTaskStatedBut createCompTaskStatedBut() {
		CompTaskStatedButImpl compTaskStatedBut = new CompTaskStatedButImpl();
		return compTaskStatedBut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationOrSpace createLocationOrSpace() {
		LocationOrSpaceImpl locationOrSpace = new LocationOrSpaceImpl();
		return locationOrSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Robots2tasksPerformance createRobots2tasksPerformance() {
		Robots2tasksPerformanceImpl robots2tasksPerformance = new Robots2tasksPerformanceImpl();
		return robots2tasksPerformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompTaskListLoc createCompTaskListLoc() {
		CompTaskListLocImpl compTaskListLoc = new CompTaskListLocImpl();
		return compTaskListLoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllRobotsXX createAllRobotsXX() {
		AllRobotsXXImpl allRobotsXX = new AllRobotsXXImpl();
		return allRobotsXX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllRobotsX createAllRobotsX() {
		AllRobotsXImpl allRobotsX = new AllRobotsXImpl();
		return allRobotsX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotsXX createRobotsXX() {
		RobotsXXImpl robotsXX = new RobotsXXImpl();
		return robotsXX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotsX createRobotsX() {
		RobotsXImpl robotsX = new RobotsXImpl();
		return robotsX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllRobotsDeploy createAllRobotsDeploy() {
		AllRobotsDeployImpl allRobotsDeploy = new AllRobotsDeployImpl();
		return allRobotsDeploy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumAllocations createNumAllocations() {
		NumAllocationsImpl numAllocations = new NumAllocationsImpl();
		return numAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumPopulation createNumPopulation() {
		NumPopulationImpl numPopulation = new NumPopulationImpl();
		return numPopulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumEvaluations createNumEvaluations() {
		NumEvaluationsImpl numEvaluations = new NumEvaluationsImpl();
		return numEvaluations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoLocation createNoLocationFromString(EDataType eDataType, String initialValue) {
		NoLocation result = NoLocation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNoLocationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslPackage getDslPackage() {
		return (DslPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DslPackage getPackage() {
		return DslPackage.eINSTANCE;
	}

} //DslFactoryImpl
