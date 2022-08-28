/**
 */
package dsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dsl.DslFactory
 * @model kind="package"
 * @generated
 */
public interface DslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/dsl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dsl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DslPackage eINSTANCE = dsl.impl.DslPackageImpl.init();

	/**
	 * The meta object id for the '{@link dsl.impl.ProblemSpecificationImpl <em>Problem Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.ProblemSpecificationImpl
	 * @see dsl.impl.DslPackageImpl#getProblemSpecification()
	 * @generated
	 */
	int PROBLEM_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>World Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_SPECIFICATION__WORLD_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Robots Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_SPECIFICATION__ROBOTS_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Tasks Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_SPECIFICATION__TASKS_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Mission</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_SPECIFICATION__MISSION = 3;

	/**
	 * The feature id for the '<em><b>Qos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_SPECIFICATION__QOS = 4;

	/**
	 * The number of structural features of the '<em>Problem Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_SPECIFICATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Problem Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsl.impl.WorldModelImpl <em>World Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.WorldModelImpl
	 * @see dsl.impl.DslPackageImpl#getWorldModel()
	 * @generated
	 */
	int WORLD_MODEL = 1;

	/**
	 * The number of structural features of the '<em>World Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_MODEL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>World Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsl.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.LocationImpl
	 * @see dsl.impl.DslPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = WORLD_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__X = WORLD_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__Y = WORLD_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__DESCRIPTION = WORLD_MODEL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = WORLD_MODEL_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = WORLD_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsl.impl.PathsImpl <em>Paths</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.PathsImpl
	 * @see dsl.impl.DslPackageImpl#getPaths()
	 * @generated
	 */
	int PATHS = 3;

	/**
	 * The feature id for the '<em><b>Loc1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHS__LOC1 = WORLD_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loc2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHS__LOC2 = WORLD_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHS__DISTANCE = WORLD_MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Paths</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHS_FEATURE_COUNT = WORLD_MODEL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Paths</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHS_OPERATION_COUNT = WORLD_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsl.impl.RobotsModelImpl <em>Robots Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.RobotsModelImpl
	 * @see dsl.impl.DslPackageImpl#getRobotsModel()
	 * @generated
	 */
	int ROBOTS_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTS_MODEL__CAPABILITIES = 0;

	/**
	 * The feature id for the '<em><b>Robots</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTS_MODEL__ROBOTS = 1;

	/**
	 * The number of structural features of the '<em>Robots Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTS_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Robots Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTS_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsl.impl.RobotImpl <em>Robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.RobotImpl
	 * @see dsl.impl.DslPackageImpl#getRobot()
	 * @generated
	 */
	int ROBOT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Init Loc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__INIT_LOC = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__VELOCITY = 3;

	/**
	 * The number of structural features of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsl.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.CapabilityImpl
	 * @see dsl.impl.DslPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>At</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__AT = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsl.impl.TasksModelImpl <em>Tasks Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.TasksModelImpl
	 * @see dsl.impl.DslPackageImpl#getTasksModel()
	 * @generated
	 */
	int TASKS_MODEL = 7;

	/**
	 * The number of structural features of the '<em>Tasks Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKS_MODEL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Tasks Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASKS_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsl.impl.AtomicTaskImpl <em>Atomic Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.AtomicTaskImpl
	 * @see dsl.impl.DslPackageImpl#getAtomicTask()
	 * @generated
	 */
	int ATOMIC_TASK = 8;

	/**
	 * The feature id for the '<em><b>Robots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TASK__ROBOTS = TASKS_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TASK__LOC = TASKS_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TASK__CRITICALITY = TASKS_MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Atomic Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TASK_FEATURE_COUNT = TASKS_MODEL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Atomic Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TASK_OPERATION_COUNT = TASKS_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsl.impl.CompoundTaskImpl <em>Compound Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.CompoundTaskImpl
	 * @see dsl.impl.DslPackageImpl#getCompoundTask()
	 * @generated
	 */
	int COMPOUND_TASK = 9;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TASK__LOCATION = TASKS_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TASK__CRITICALITY = TASKS_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TASK__ORDERED = TASKS_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Consecutive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TASK__CONSECUTIVE = TASKS_MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Can Do Task</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TASK__CAN_DO_TASK = TASKS_MODEL_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Compound Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TASK_FEATURE_COUNT = TASKS_MODEL_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Compound Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TASK_OPERATION_COUNT = TASKS_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsl.impl.MissionImpl <em>Mission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.MissionImpl
	 * @see dsl.impl.DslPackageImpl#getMission()
	 * @generated
	 */
	int MISSION = 10;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__CRITICALITY = 1;

	/**
	 * The number of structural features of the '<em>Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsl.impl.QoSImpl <em>Qo S</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.QoSImpl
	 * @see dsl.impl.DslPackageImpl#getQoS()
	 * @generated
	 */
	int QO_S = 11;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_S__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_S__CRITICALITY = 1;

	/**
	 * The number of structural features of the '<em>Qo S</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_S_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Qo S</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_S_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsl.impl.AtomicTaskNoLocImpl <em>Atomic Task No Loc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.AtomicTaskNoLocImpl
	 * @see dsl.impl.DslPackageImpl#getAtomicTaskNoLoc()
	 * @generated
	 */
	int ATOMIC_TASK_NO_LOC = 12;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TASK_NO_LOC__DESCRIPTION = MISSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TASK_NO_LOC__CRITICALITY = MISSION__CRITICALITY;

	/**
	 * The feature id for the '<em><b>At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TASK_NO_LOC__AT = MISSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atomic Task No Loc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TASK_NO_LOC_FEATURE_COUNT = MISSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Atomic Task No Loc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TASK_NO_LOC_OPERATION_COUNT = MISSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsl.impl.AtomicTaskLocImpl <em>Atomic Task Loc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.AtomicTaskLocImpl
	 * @see dsl.impl.DslPackageImpl#getAtomicTaskLoc()
	 * @generated
	 */
	int ATOMIC_TASK_LOC = 13;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TASK_LOC__DESCRIPTION = MISSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TASK_LOC__CRITICALITY = MISSION__CRITICALITY;

	/**
	 * The feature id for the '<em><b>At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TASK_LOC__AT = MISSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TASK_LOC__LOC = MISSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Atomic Task Loc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TASK_LOC_FEATURE_COUNT = MISSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Atomic Task Loc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TASK_LOC_OPERATION_COUNT = MISSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsl.impl.CompTaskNoLocImpl <em>Comp Task No Loc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.CompTaskNoLocImpl
	 * @see dsl.impl.DslPackageImpl#getCompTaskNoLoc()
	 * @generated
	 */
	int COMP_TASK_NO_LOC = 14;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TASK_NO_LOC__DESCRIPTION = MISSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TASK_NO_LOC__CRITICALITY = MISSION__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Ct</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TASK_NO_LOC__CT = MISSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comp Task No Loc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TASK_NO_LOC_FEATURE_COUNT = MISSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Comp Task No Loc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TASK_NO_LOC_OPERATION_COUNT = MISSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsl.impl.CompTaskOneLocImpl <em>Comp Task One Loc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.CompTaskOneLocImpl
	 * @see dsl.impl.DslPackageImpl#getCompTaskOneLoc()
	 * @generated
	 */
	int COMP_TASK_ONE_LOC = 15;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TASK_ONE_LOC__DESCRIPTION = MISSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TASK_ONE_LOC__CRITICALITY = MISSION__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Ct</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TASK_ONE_LOC__CT = MISSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TASK_ONE_LOC__LOC = MISSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Comp Task One Loc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TASK_ONE_LOC_FEATURE_COUNT = MISSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Comp Task One Loc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TASK_ONE_LOC_OPERATION_COUNT = MISSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsl.impl.CompTaskAllLocImpl <em>Comp Task All Loc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.CompTaskAllLocImpl
	 * @see dsl.impl.DslPackageImpl#getCompTaskAllLoc()
	 * @generated
	 */
	int COMP_TASK_ALL_LOC = 16;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TASK_ALL_LOC__DESCRIPTION = MISSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TASK_ALL_LOC__CRITICALITY = MISSION__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Ct</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TASK_ALL_LOC__CT = MISSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TASK_ALL_LOC__LOC = MISSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Comp Task All Loc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TASK_ALL_LOC_FEATURE_COUNT = MISSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Comp Task All Loc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TASK_ALL_LOC_OPERATION_COUNT = MISSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsl.impl.CompTaskAtButImpl <em>Comp Task At But</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.CompTaskAtButImpl
	 * @see dsl.impl.DslPackageImpl#getCompTaskAtBut()
	 * @generated
	 */
	int COMP_TASK_AT_BUT = 17;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TASK_AT_BUT__DESCRIPTION = MISSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TASK_AT_BUT__CRITICALITY = MISSION__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Ct</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TASK_AT_BUT__CT = MISSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TASK_AT_BUT__LOCATION_LIST = MISSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Loc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TASK_AT_BUT__LOC = MISSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Comp Task At But</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TASK_AT_BUT_FEATURE_COUNT = MISSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Comp Task At But</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TASK_AT_BUT_OPERATION_COUNT = MISSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsl.impl.CompTaskStatedButImpl <em>Comp Task Stated But</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.CompTaskStatedButImpl
	 * @see dsl.impl.DslPackageImpl#getCompTaskStatedBut()
	 * @generated
	 */
	int COMP_TASK_STATED_BUT = 18;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TASK_STATED_BUT__DESCRIPTION = MISSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TASK_STATED_BUT__CRITICALITY = MISSION__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Ct</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TASK_STATED_BUT__CT = MISSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TASK_STATED_BUT__LOCATION_LIST = MISSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Comp Task Stated But</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TASK_STATED_BUT_FEATURE_COUNT = MISSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Comp Task Stated But</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TASK_STATED_BUT_OPERATION_COUNT = MISSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsl.impl.LocationOrSpaceImpl <em>Location Or Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.LocationOrSpaceImpl
	 * @see dsl.impl.DslPackageImpl#getLocationOrSpace()
	 * @generated
	 */
	int LOCATION_OR_SPACE = 19;

	/**
	 * The feature id for the '<em><b>Loc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OR_SPACE__LOC = 0;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OR_SPACE__SPACE = 1;

	/**
	 * The number of structural features of the '<em>Location Or Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OR_SPACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Location Or Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OR_SPACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsl.impl.Robots2tasksPerformanceImpl <em>Robots2tasks Performance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.Robots2tasksPerformanceImpl
	 * @see dsl.impl.DslPackageImpl#getRobots2tasksPerformance()
	 * @generated
	 */
	int ROBOTS2TASKS_PERFORMANCE = 20;

	/**
	 * The feature id for the '<em><b>At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTS2TASKS_PERFORMANCE__AT = 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTS2TASKS_PERFORMANCE__TIME = 1;

	/**
	 * The feature id for the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTS2TASKS_PERFORMANCE__PROB = 2;

	/**
	 * The number of structural features of the '<em>Robots2tasks Performance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTS2TASKS_PERFORMANCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Robots2tasks Performance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTS2TASKS_PERFORMANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsl.impl.CompTaskListLocImpl <em>Comp Task List Loc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.CompTaskListLocImpl
	 * @see dsl.impl.DslPackageImpl#getCompTaskListLoc()
	 * @generated
	 */
	int COMP_TASK_LIST_LOC = 21;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TASK_LIST_LOC__DESCRIPTION = MISSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TASK_LIST_LOC__CRITICALITY = MISSION__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Ct</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TASK_LIST_LOC__CT = MISSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TASK_LIST_LOC__LOCATION_LIST = MISSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Comp Task List Loc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TASK_LIST_LOC_FEATURE_COUNT = MISSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Comp Task List Loc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TASK_LIST_LOC_OPERATION_COUNT = MISSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsl.impl.AllRobotsXXImpl <em>All Robots XX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.AllRobotsXXImpl
	 * @see dsl.impl.DslPackageImpl#getAllRobotsXX()
	 * @generated
	 */
	int ALL_ROBOTS_XX = 22;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_ROBOTS_XX__DESCRIPTION = QO_S__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_ROBOTS_XX__CRITICALITY = QO_S__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_ROBOTS_XX__COORDINATE = QO_S_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Xy1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_ROBOTS_XX__XY1 = QO_S_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Xy2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_ROBOTS_XX__XY2 = QO_S_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>All Robots XX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_ROBOTS_XX_FEATURE_COUNT = QO_S_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>All Robots XX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_ROBOTS_XX_OPERATION_COUNT = QO_S_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsl.impl.AllRobotsXImpl <em>All Robots X</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.AllRobotsXImpl
	 * @see dsl.impl.DslPackageImpl#getAllRobotsX()
	 * @generated
	 */
	int ALL_ROBOTS_X = 23;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_ROBOTS_X__DESCRIPTION = QO_S__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_ROBOTS_X__CRITICALITY = QO_S__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_ROBOTS_X__COORDINATE = QO_S_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_ROBOTS_X__TYPE = QO_S_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Xy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_ROBOTS_X__XY = QO_S_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>All Robots X</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_ROBOTS_X_FEATURE_COUNT = QO_S_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>All Robots X</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_ROBOTS_X_OPERATION_COUNT = QO_S_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsl.impl.RobotsXXImpl <em>Robots XX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.RobotsXXImpl
	 * @see dsl.impl.DslPackageImpl#getRobotsXX()
	 * @generated
	 */
	int ROBOTS_XX = 24;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTS_XX__DESCRIPTION = QO_S__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTS_XX__CRITICALITY = QO_S__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTS_XX__COORDINATE = QO_S_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Xy1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTS_XX__XY1 = QO_S_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Xy2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTS_XX__XY2 = QO_S_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Robot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTS_XX__ROBOT = QO_S_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Robots XX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTS_XX_FEATURE_COUNT = QO_S_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Robots XX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTS_XX_OPERATION_COUNT = QO_S_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsl.impl.RobotsXImpl <em>Robots X</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.RobotsXImpl
	 * @see dsl.impl.DslPackageImpl#getRobotsX()
	 * @generated
	 */
	int ROBOTS_X = 25;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTS_X__DESCRIPTION = QO_S__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTS_X__CRITICALITY = QO_S__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTS_X__COORDINATE = QO_S_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Xy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTS_X__XY = QO_S_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Robot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTS_X__ROBOT = QO_S_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTS_X__TYPE = QO_S_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Typ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTS_X__TYP = QO_S_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Robots X</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTS_X_FEATURE_COUNT = QO_S_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Robots X</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTS_X_OPERATION_COUNT = QO_S_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsl.impl.AllRobotsDeployImpl <em>All Robots Deploy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.AllRobotsDeployImpl
	 * @see dsl.impl.DslPackageImpl#getAllRobotsDeploy()
	 * @generated
	 */
	int ALL_ROBOTS_DEPLOY = 26;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_ROBOTS_DEPLOY__DESCRIPTION = QO_S__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_ROBOTS_DEPLOY__CRITICALITY = QO_S__CRITICALITY;

	/**
	 * The feature id for the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_ROBOTS_DEPLOY__S = QO_S_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>All Robots Deploy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_ROBOTS_DEPLOY_FEATURE_COUNT = QO_S_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>All Robots Deploy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_ROBOTS_DEPLOY_OPERATION_COUNT = QO_S_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsl.impl.NumAllocationsImpl <em>Num Allocations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.NumAllocationsImpl
	 * @see dsl.impl.DslPackageImpl#getNumAllocations()
	 * @generated
	 */
	int NUM_ALLOCATIONS = 27;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_ALLOCATIONS__DESCRIPTION = QO_S__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_ALLOCATIONS__CRITICALITY = QO_S__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_ALLOCATIONS__NUMBER = QO_S_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Num Allocations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_ALLOCATIONS_FEATURE_COUNT = QO_S_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Num Allocations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_ALLOCATIONS_OPERATION_COUNT = QO_S_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsl.impl.NumPopulationImpl <em>Num Population</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.NumPopulationImpl
	 * @see dsl.impl.DslPackageImpl#getNumPopulation()
	 * @generated
	 */
	int NUM_POPULATION = 28;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POPULATION__DESCRIPTION = QO_S__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POPULATION__CRITICALITY = QO_S__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POPULATION__NUMBER = QO_S_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Num Population</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POPULATION_FEATURE_COUNT = QO_S_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Num Population</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_POPULATION_OPERATION_COUNT = QO_S_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsl.impl.NumEvaluationsImpl <em>Num Evaluations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.impl.NumEvaluationsImpl
	 * @see dsl.impl.DslPackageImpl#getNumEvaluations()
	 * @generated
	 */
	int NUM_EVALUATIONS = 29;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_EVALUATIONS__DESCRIPTION = QO_S__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_EVALUATIONS__CRITICALITY = QO_S__CRITICALITY;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_EVALUATIONS__NUMBER = QO_S_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Num Evaluations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_EVALUATIONS_FEATURE_COUNT = QO_S_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Num Evaluations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_EVALUATIONS_OPERATION_COUNT = QO_S_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsl.NoLocation <em>No Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsl.NoLocation
	 * @see dsl.impl.DslPackageImpl#getNoLocation()
	 * @generated
	 */
	int NO_LOCATION = 30;


	/**
	 * Returns the meta object for class '{@link dsl.ProblemSpecification <em>Problem Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem Specification</em>'.
	 * @see dsl.ProblemSpecification
	 * @generated
	 */
	EClass getProblemSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link dsl.ProblemSpecification#getWorldModel <em>World Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>World Model</em>'.
	 * @see dsl.ProblemSpecification#getWorldModel()
	 * @see #getProblemSpecification()
	 * @generated
	 */
	EReference getProblemSpecification_WorldModel();

	/**
	 * Returns the meta object for the containment reference list '{@link dsl.ProblemSpecification#getRobotsModel <em>Robots Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Robots Model</em>'.
	 * @see dsl.ProblemSpecification#getRobotsModel()
	 * @see #getProblemSpecification()
	 * @generated
	 */
	EReference getProblemSpecification_RobotsModel();

	/**
	 * Returns the meta object for the containment reference list '{@link dsl.ProblemSpecification#getTasksModel <em>Tasks Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks Model</em>'.
	 * @see dsl.ProblemSpecification#getTasksModel()
	 * @see #getProblemSpecification()
	 * @generated
	 */
	EReference getProblemSpecification_TasksModel();

	/**
	 * Returns the meta object for the containment reference list '{@link dsl.ProblemSpecification#getMission <em>Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mission</em>'.
	 * @see dsl.ProblemSpecification#getMission()
	 * @see #getProblemSpecification()
	 * @generated
	 */
	EReference getProblemSpecification_Mission();

	/**
	 * Returns the meta object for the containment reference list '{@link dsl.ProblemSpecification#getQos <em>Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Qos</em>'.
	 * @see dsl.ProblemSpecification#getQos()
	 * @see #getProblemSpecification()
	 * @generated
	 */
	EReference getProblemSpecification_Qos();

	/**
	 * Returns the meta object for class '{@link dsl.WorldModel <em>World Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>World Model</em>'.
	 * @see dsl.WorldModel
	 * @generated
	 */
	EClass getWorldModel();

	/**
	 * Returns the meta object for class '{@link dsl.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see dsl.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link dsl.Location#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsl.Location#getName()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Name();

	/**
	 * Returns the meta object for the attribute '{@link dsl.Location#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see dsl.Location#getX()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_X();

	/**
	 * Returns the meta object for the attribute '{@link dsl.Location#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see dsl.Location#getY()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Y();

	/**
	 * Returns the meta object for the attribute '{@link dsl.Location#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dsl.Location#getDescription()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Description();

	/**
	 * Returns the meta object for class '{@link dsl.Paths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paths</em>'.
	 * @see dsl.Paths
	 * @generated
	 */
	EClass getPaths();

	/**
	 * Returns the meta object for the reference '{@link dsl.Paths#getLoc1 <em>Loc1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Loc1</em>'.
	 * @see dsl.Paths#getLoc1()
	 * @see #getPaths()
	 * @generated
	 */
	EReference getPaths_Loc1();

	/**
	 * Returns the meta object for the reference '{@link dsl.Paths#getLoc2 <em>Loc2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Loc2</em>'.
	 * @see dsl.Paths#getLoc2()
	 * @see #getPaths()
	 * @generated
	 */
	EReference getPaths_Loc2();

	/**
	 * Returns the meta object for the attribute '{@link dsl.Paths#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see dsl.Paths#getDistance()
	 * @see #getPaths()
	 * @generated
	 */
	EAttribute getPaths_Distance();

	/**
	 * Returns the meta object for class '{@link dsl.RobotsModel <em>Robots Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robots Model</em>'.
	 * @see dsl.RobotsModel
	 * @generated
	 */
	EClass getRobotsModel();

	/**
	 * Returns the meta object for the containment reference list '{@link dsl.RobotsModel#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capabilities</em>'.
	 * @see dsl.RobotsModel#getCapabilities()
	 * @see #getRobotsModel()
	 * @generated
	 */
	EReference getRobotsModel_Capabilities();

	/**
	 * Returns the meta object for the reference list '{@link dsl.RobotsModel#getRobots <em>Robots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Robots</em>'.
	 * @see dsl.RobotsModel#getRobots()
	 * @see #getRobotsModel()
	 * @generated
	 */
	EReference getRobotsModel_Robots();

	/**
	 * Returns the meta object for class '{@link dsl.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot</em>'.
	 * @see dsl.Robot
	 * @generated
	 */
	EClass getRobot();

	/**
	 * Returns the meta object for the attribute '{@link dsl.Robot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsl.Robot#getName()
	 * @see #getRobot()
	 * @generated
	 */
	EAttribute getRobot_Name();

	/**
	 * Returns the meta object for the reference '{@link dsl.Robot#getInitLoc <em>Init Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Init Loc</em>'.
	 * @see dsl.Robot#getInitLoc()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_InitLoc();

	/**
	 * Returns the meta object for the attribute '{@link dsl.Robot#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dsl.Robot#getDescription()
	 * @see #getRobot()
	 * @generated
	 */
	EAttribute getRobot_Description();

	/**
	 * Returns the meta object for the attribute '{@link dsl.Robot#getVelocity <em>Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Velocity</em>'.
	 * @see dsl.Robot#getVelocity()
	 * @see #getRobot()
	 * @generated
	 */
	EAttribute getRobot_Velocity();

	/**
	 * Returns the meta object for class '{@link dsl.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see dsl.Capability
	 * @generated
	 */
	EClass getCapability();

	/**
	 * Returns the meta object for the attribute '{@link dsl.Capability#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsl.Capability#getName()
	 * @see #getCapability()
	 * @generated
	 */
	EAttribute getCapability_Name();

	/**
	 * Returns the meta object for the reference list '{@link dsl.Capability#getAt <em>At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>At</em>'.
	 * @see dsl.Capability#getAt()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_At();

	/**
	 * Returns the meta object for the attribute '{@link dsl.Capability#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dsl.Capability#getDescription()
	 * @see #getCapability()
	 * @generated
	 */
	EAttribute getCapability_Description();

	/**
	 * Returns the meta object for class '{@link dsl.TasksModel <em>Tasks Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tasks Model</em>'.
	 * @see dsl.TasksModel
	 * @generated
	 */
	EClass getTasksModel();

	/**
	 * Returns the meta object for class '{@link dsl.AtomicTask <em>Atomic Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Task</em>'.
	 * @see dsl.AtomicTask
	 * @generated
	 */
	EClass getAtomicTask();

	/**
	 * Returns the meta object for the attribute '{@link dsl.AtomicTask#getRobots <em>Robots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Robots</em>'.
	 * @see dsl.AtomicTask#getRobots()
	 * @see #getAtomicTask()
	 * @generated
	 */
	EAttribute getAtomicTask_Robots();

	/**
	 * Returns the meta object for the reference '{@link dsl.AtomicTask#getLoc <em>Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Loc</em>'.
	 * @see dsl.AtomicTask#getLoc()
	 * @see #getAtomicTask()
	 * @generated
	 */
	EReference getAtomicTask_Loc();

	/**
	 * Returns the meta object for the attribute '{@link dsl.AtomicTask#isCriticality <em>Criticality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Criticality</em>'.
	 * @see dsl.AtomicTask#isCriticality()
	 * @see #getAtomicTask()
	 * @generated
	 */
	EAttribute getAtomicTask_Criticality();

	/**
	 * Returns the meta object for class '{@link dsl.CompoundTask <em>Compound Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Task</em>'.
	 * @see dsl.CompoundTask
	 * @generated
	 */
	EClass getCompoundTask();

	/**
	 * Returns the meta object for the reference '{@link dsl.CompoundTask#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see dsl.CompoundTask#getLocation()
	 * @see #getCompoundTask()
	 * @generated
	 */
	EReference getCompoundTask_Location();

	/**
	 * Returns the meta object for the attribute '{@link dsl.CompoundTask#isCriticality <em>Criticality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Criticality</em>'.
	 * @see dsl.CompoundTask#isCriticality()
	 * @see #getCompoundTask()
	 * @generated
	 */
	EAttribute getCompoundTask_Criticality();

	/**
	 * Returns the meta object for the attribute '{@link dsl.CompoundTask#isOrdered <em>Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordered</em>'.
	 * @see dsl.CompoundTask#isOrdered()
	 * @see #getCompoundTask()
	 * @generated
	 */
	EAttribute getCompoundTask_Ordered();

	/**
	 * Returns the meta object for the attribute '{@link dsl.CompoundTask#isConsecutive <em>Consecutive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consecutive</em>'.
	 * @see dsl.CompoundTask#isConsecutive()
	 * @see #getCompoundTask()
	 * @generated
	 */
	EAttribute getCompoundTask_Consecutive();

	/**
	 * Returns the meta object for the reference list '{@link dsl.CompoundTask#getCanDoTask <em>Can Do Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Can Do Task</em>'.
	 * @see dsl.CompoundTask#getCanDoTask()
	 * @see #getCompoundTask()
	 * @generated
	 */
	EReference getCompoundTask_CanDoTask();

	/**
	 * Returns the meta object for class '{@link dsl.Mission <em>Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mission</em>'.
	 * @see dsl.Mission
	 * @generated
	 */
	EClass getMission();

	/**
	 * Returns the meta object for the attribute '{@link dsl.Mission#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dsl.Mission#getDescription()
	 * @see #getMission()
	 * @generated
	 */
	EAttribute getMission_Description();

	/**
	 * Returns the meta object for the attribute '{@link dsl.Mission#getCriticality <em>Criticality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Criticality</em>'.
	 * @see dsl.Mission#getCriticality()
	 * @see #getMission()
	 * @generated
	 */
	EAttribute getMission_Criticality();

	/**
	 * Returns the meta object for class '{@link dsl.QoS <em>Qo S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qo S</em>'.
	 * @see dsl.QoS
	 * @generated
	 */
	EClass getQoS();

	/**
	 * Returns the meta object for the attribute '{@link dsl.QoS#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dsl.QoS#getDescription()
	 * @see #getQoS()
	 * @generated
	 */
	EAttribute getQoS_Description();

	/**
	 * Returns the meta object for the attribute '{@link dsl.QoS#getCriticality <em>Criticality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Criticality</em>'.
	 * @see dsl.QoS#getCriticality()
	 * @see #getQoS()
	 * @generated
	 */
	EAttribute getQoS_Criticality();

	/**
	 * Returns the meta object for class '{@link dsl.AtomicTaskNoLoc <em>Atomic Task No Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Task No Loc</em>'.
	 * @see dsl.AtomicTaskNoLoc
	 * @generated
	 */
	EClass getAtomicTaskNoLoc();

	/**
	 * Returns the meta object for the reference '{@link dsl.AtomicTaskNoLoc#getAt <em>At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>At</em>'.
	 * @see dsl.AtomicTaskNoLoc#getAt()
	 * @see #getAtomicTaskNoLoc()
	 * @generated
	 */
	EReference getAtomicTaskNoLoc_At();

	/**
	 * Returns the meta object for class '{@link dsl.AtomicTaskLoc <em>Atomic Task Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Task Loc</em>'.
	 * @see dsl.AtomicTaskLoc
	 * @generated
	 */
	EClass getAtomicTaskLoc();

	/**
	 * Returns the meta object for the reference '{@link dsl.AtomicTaskLoc#getAt <em>At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>At</em>'.
	 * @see dsl.AtomicTaskLoc#getAt()
	 * @see #getAtomicTaskLoc()
	 * @generated
	 */
	EReference getAtomicTaskLoc_At();

	/**
	 * Returns the meta object for the reference '{@link dsl.AtomicTaskLoc#getLoc <em>Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Loc</em>'.
	 * @see dsl.AtomicTaskLoc#getLoc()
	 * @see #getAtomicTaskLoc()
	 * @generated
	 */
	EReference getAtomicTaskLoc_Loc();

	/**
	 * Returns the meta object for class '{@link dsl.CompTaskNoLoc <em>Comp Task No Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comp Task No Loc</em>'.
	 * @see dsl.CompTaskNoLoc
	 * @generated
	 */
	EClass getCompTaskNoLoc();

	/**
	 * Returns the meta object for the reference '{@link dsl.CompTaskNoLoc#getCt <em>Ct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ct</em>'.
	 * @see dsl.CompTaskNoLoc#getCt()
	 * @see #getCompTaskNoLoc()
	 * @generated
	 */
	EReference getCompTaskNoLoc_Ct();

	/**
	 * Returns the meta object for class '{@link dsl.CompTaskOneLoc <em>Comp Task One Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comp Task One Loc</em>'.
	 * @see dsl.CompTaskOneLoc
	 * @generated
	 */
	EClass getCompTaskOneLoc();

	/**
	 * Returns the meta object for the reference '{@link dsl.CompTaskOneLoc#getCt <em>Ct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ct</em>'.
	 * @see dsl.CompTaskOneLoc#getCt()
	 * @see #getCompTaskOneLoc()
	 * @generated
	 */
	EReference getCompTaskOneLoc_Ct();

	/**
	 * Returns the meta object for the reference '{@link dsl.CompTaskOneLoc#getLoc <em>Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Loc</em>'.
	 * @see dsl.CompTaskOneLoc#getLoc()
	 * @see #getCompTaskOneLoc()
	 * @generated
	 */
	EReference getCompTaskOneLoc_Loc();

	/**
	 * Returns the meta object for class '{@link dsl.CompTaskAllLoc <em>Comp Task All Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comp Task All Loc</em>'.
	 * @see dsl.CompTaskAllLoc
	 * @generated
	 */
	EClass getCompTaskAllLoc();

	/**
	 * Returns the meta object for the reference '{@link dsl.CompTaskAllLoc#getCt <em>Ct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ct</em>'.
	 * @see dsl.CompTaskAllLoc#getCt()
	 * @see #getCompTaskAllLoc()
	 * @generated
	 */
	EReference getCompTaskAllLoc_Ct();

	/**
	 * Returns the meta object for the reference '{@link dsl.CompTaskAllLoc#getLoc <em>Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Loc</em>'.
	 * @see dsl.CompTaskAllLoc#getLoc()
	 * @see #getCompTaskAllLoc()
	 * @generated
	 */
	EReference getCompTaskAllLoc_Loc();

	/**
	 * Returns the meta object for class '{@link dsl.CompTaskAtBut <em>Comp Task At But</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comp Task At But</em>'.
	 * @see dsl.CompTaskAtBut
	 * @generated
	 */
	EClass getCompTaskAtBut();

	/**
	 * Returns the meta object for the reference '{@link dsl.CompTaskAtBut#getCt <em>Ct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ct</em>'.
	 * @see dsl.CompTaskAtBut#getCt()
	 * @see #getCompTaskAtBut()
	 * @generated
	 */
	EReference getCompTaskAtBut_Ct();

	/**
	 * Returns the meta object for the reference list '{@link dsl.CompTaskAtBut#getLocationList <em>Location List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Location List</em>'.
	 * @see dsl.CompTaskAtBut#getLocationList()
	 * @see #getCompTaskAtBut()
	 * @generated
	 */
	EReference getCompTaskAtBut_LocationList();

	/**
	 * Returns the meta object for the reference '{@link dsl.CompTaskAtBut#getLoc <em>Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Loc</em>'.
	 * @see dsl.CompTaskAtBut#getLoc()
	 * @see #getCompTaskAtBut()
	 * @generated
	 */
	EReference getCompTaskAtBut_Loc();

	/**
	 * Returns the meta object for class '{@link dsl.CompTaskStatedBut <em>Comp Task Stated But</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comp Task Stated But</em>'.
	 * @see dsl.CompTaskStatedBut
	 * @generated
	 */
	EClass getCompTaskStatedBut();

	/**
	 * Returns the meta object for the reference '{@link dsl.CompTaskStatedBut#getCt <em>Ct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ct</em>'.
	 * @see dsl.CompTaskStatedBut#getCt()
	 * @see #getCompTaskStatedBut()
	 * @generated
	 */
	EReference getCompTaskStatedBut_Ct();

	/**
	 * Returns the meta object for the reference list '{@link dsl.CompTaskStatedBut#getLocationList <em>Location List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Location List</em>'.
	 * @see dsl.CompTaskStatedBut#getLocationList()
	 * @see #getCompTaskStatedBut()
	 * @generated
	 */
	EReference getCompTaskStatedBut_LocationList();

	/**
	 * Returns the meta object for class '{@link dsl.LocationOrSpace <em>Location Or Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Or Space</em>'.
	 * @see dsl.LocationOrSpace
	 * @generated
	 */
	EClass getLocationOrSpace();

	/**
	 * Returns the meta object for the reference '{@link dsl.LocationOrSpace#getLoc <em>Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Loc</em>'.
	 * @see dsl.LocationOrSpace#getLoc()
	 * @see #getLocationOrSpace()
	 * @generated
	 */
	EReference getLocationOrSpace_Loc();

	/**
	 * Returns the meta object for the attribute '{@link dsl.LocationOrSpace#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see dsl.LocationOrSpace#getSpace()
	 * @see #getLocationOrSpace()
	 * @generated
	 */
	EAttribute getLocationOrSpace_Space();

	/**
	 * Returns the meta object for class '{@link dsl.Robots2tasksPerformance <em>Robots2tasks Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robots2tasks Performance</em>'.
	 * @see dsl.Robots2tasksPerformance
	 * @generated
	 */
	EClass getRobots2tasksPerformance();

	/**
	 * Returns the meta object for the reference '{@link dsl.Robots2tasksPerformance#getAt <em>At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>At</em>'.
	 * @see dsl.Robots2tasksPerformance#getAt()
	 * @see #getRobots2tasksPerformance()
	 * @generated
	 */
	EReference getRobots2tasksPerformance_At();

	/**
	 * Returns the meta object for the attribute '{@link dsl.Robots2tasksPerformance#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see dsl.Robots2tasksPerformance#getTime()
	 * @see #getRobots2tasksPerformance()
	 * @generated
	 */
	EAttribute getRobots2tasksPerformance_Time();

	/**
	 * Returns the meta object for the attribute '{@link dsl.Robots2tasksPerformance#getProb <em>Prob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prob</em>'.
	 * @see dsl.Robots2tasksPerformance#getProb()
	 * @see #getRobots2tasksPerformance()
	 * @generated
	 */
	EAttribute getRobots2tasksPerformance_Prob();

	/**
	 * Returns the meta object for class '{@link dsl.CompTaskListLoc <em>Comp Task List Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comp Task List Loc</em>'.
	 * @see dsl.CompTaskListLoc
	 * @generated
	 */
	EClass getCompTaskListLoc();

	/**
	 * Returns the meta object for the reference '{@link dsl.CompTaskListLoc#getCt <em>Ct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ct</em>'.
	 * @see dsl.CompTaskListLoc#getCt()
	 * @see #getCompTaskListLoc()
	 * @generated
	 */
	EReference getCompTaskListLoc_Ct();

	/**
	 * Returns the meta object for the reference list '{@link dsl.CompTaskListLoc#getLocationList <em>Location List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Location List</em>'.
	 * @see dsl.CompTaskListLoc#getLocationList()
	 * @see #getCompTaskListLoc()
	 * @generated
	 */
	EReference getCompTaskListLoc_LocationList();

	/**
	 * Returns the meta object for class '{@link dsl.AllRobotsXX <em>All Robots XX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Robots XX</em>'.
	 * @see dsl.AllRobotsXX
	 * @generated
	 */
	EClass getAllRobotsXX();

	/**
	 * Returns the meta object for the attribute '{@link dsl.AllRobotsXX#getCoordinate <em>Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordinate</em>'.
	 * @see dsl.AllRobotsXX#getCoordinate()
	 * @see #getAllRobotsXX()
	 * @generated
	 */
	EAttribute getAllRobotsXX_Coordinate();

	/**
	 * Returns the meta object for the attribute '{@link dsl.AllRobotsXX#getXy1 <em>Xy1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xy1</em>'.
	 * @see dsl.AllRobotsXX#getXy1()
	 * @see #getAllRobotsXX()
	 * @generated
	 */
	EAttribute getAllRobotsXX_Xy1();

	/**
	 * Returns the meta object for the attribute '{@link dsl.AllRobotsXX#getXy2 <em>Xy2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xy2</em>'.
	 * @see dsl.AllRobotsXX#getXy2()
	 * @see #getAllRobotsXX()
	 * @generated
	 */
	EAttribute getAllRobotsXX_Xy2();

	/**
	 * Returns the meta object for class '{@link dsl.AllRobotsX <em>All Robots X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Robots X</em>'.
	 * @see dsl.AllRobotsX
	 * @generated
	 */
	EClass getAllRobotsX();

	/**
	 * Returns the meta object for the attribute '{@link dsl.AllRobotsX#getCoordinate <em>Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordinate</em>'.
	 * @see dsl.AllRobotsX#getCoordinate()
	 * @see #getAllRobotsX()
	 * @generated
	 */
	EAttribute getAllRobotsX_Coordinate();

	/**
	 * Returns the meta object for the attribute '{@link dsl.AllRobotsX#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dsl.AllRobotsX#getType()
	 * @see #getAllRobotsX()
	 * @generated
	 */
	EAttribute getAllRobotsX_Type();

	/**
	 * Returns the meta object for the attribute '{@link dsl.AllRobotsX#getXy <em>Xy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xy</em>'.
	 * @see dsl.AllRobotsX#getXy()
	 * @see #getAllRobotsX()
	 * @generated
	 */
	EAttribute getAllRobotsX_Xy();

	/**
	 * Returns the meta object for class '{@link dsl.RobotsXX <em>Robots XX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robots XX</em>'.
	 * @see dsl.RobotsXX
	 * @generated
	 */
	EClass getRobotsXX();

	/**
	 * Returns the meta object for the attribute '{@link dsl.RobotsXX#getCoordinate <em>Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordinate</em>'.
	 * @see dsl.RobotsXX#getCoordinate()
	 * @see #getRobotsXX()
	 * @generated
	 */
	EAttribute getRobotsXX_Coordinate();

	/**
	 * Returns the meta object for the attribute '{@link dsl.RobotsXX#getXy1 <em>Xy1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xy1</em>'.
	 * @see dsl.RobotsXX#getXy1()
	 * @see #getRobotsXX()
	 * @generated
	 */
	EAttribute getRobotsXX_Xy1();

	/**
	 * Returns the meta object for the attribute '{@link dsl.RobotsXX#getXy2 <em>Xy2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xy2</em>'.
	 * @see dsl.RobotsXX#getXy2()
	 * @see #getRobotsXX()
	 * @generated
	 */
	EAttribute getRobotsXX_Xy2();

	/**
	 * Returns the meta object for the reference '{@link dsl.RobotsXX#getRobot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Robot</em>'.
	 * @see dsl.RobotsXX#getRobot()
	 * @see #getRobotsXX()
	 * @generated
	 */
	EReference getRobotsXX_Robot();

	/**
	 * Returns the meta object for class '{@link dsl.RobotsX <em>Robots X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robots X</em>'.
	 * @see dsl.RobotsX
	 * @generated
	 */
	EClass getRobotsX();

	/**
	 * Returns the meta object for the attribute '{@link dsl.RobotsX#getCoordinate <em>Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordinate</em>'.
	 * @see dsl.RobotsX#getCoordinate()
	 * @see #getRobotsX()
	 * @generated
	 */
	EAttribute getRobotsX_Coordinate();

	/**
	 * Returns the meta object for the attribute '{@link dsl.RobotsX#getXy <em>Xy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xy</em>'.
	 * @see dsl.RobotsX#getXy()
	 * @see #getRobotsX()
	 * @generated
	 */
	EAttribute getRobotsX_Xy();

	/**
	 * Returns the meta object for the reference '{@link dsl.RobotsX#getRobot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Robot</em>'.
	 * @see dsl.RobotsX#getRobot()
	 * @see #getRobotsX()
	 * @generated
	 */
	EReference getRobotsX_Robot();

	/**
	 * Returns the meta object for the attribute '{@link dsl.RobotsX#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dsl.RobotsX#getType()
	 * @see #getRobotsX()
	 * @generated
	 */
	EAttribute getRobotsX_Type();

	/**
	 * Returns the meta object for the attribute '{@link dsl.RobotsX#getTyp <em>Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typ</em>'.
	 * @see dsl.RobotsX#getTyp()
	 * @see #getRobotsX()
	 * @generated
	 */
	EAttribute getRobotsX_Typ();

	/**
	 * Returns the meta object for class '{@link dsl.AllRobotsDeploy <em>All Robots Deploy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Robots Deploy</em>'.
	 * @see dsl.AllRobotsDeploy
	 * @generated
	 */
	EClass getAllRobotsDeploy();

	/**
	 * Returns the meta object for the attribute '{@link dsl.AllRobotsDeploy#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>S</em>'.
	 * @see dsl.AllRobotsDeploy#getS()
	 * @see #getAllRobotsDeploy()
	 * @generated
	 */
	EAttribute getAllRobotsDeploy_S();

	/**
	 * Returns the meta object for class '{@link dsl.NumAllocations <em>Num Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Num Allocations</em>'.
	 * @see dsl.NumAllocations
	 * @generated
	 */
	EClass getNumAllocations();

	/**
	 * Returns the meta object for the attribute '{@link dsl.NumAllocations#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see dsl.NumAllocations#getNumber()
	 * @see #getNumAllocations()
	 * @generated
	 */
	EAttribute getNumAllocations_Number();

	/**
	 * Returns the meta object for class '{@link dsl.NumPopulation <em>Num Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Num Population</em>'.
	 * @see dsl.NumPopulation
	 * @generated
	 */
	EClass getNumPopulation();

	/**
	 * Returns the meta object for the attribute '{@link dsl.NumPopulation#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see dsl.NumPopulation#getNumber()
	 * @see #getNumPopulation()
	 * @generated
	 */
	EAttribute getNumPopulation_Number();

	/**
	 * Returns the meta object for class '{@link dsl.NumEvaluations <em>Num Evaluations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Num Evaluations</em>'.
	 * @see dsl.NumEvaluations
	 * @generated
	 */
	EClass getNumEvaluations();

	/**
	 * Returns the meta object for the attribute '{@link dsl.NumEvaluations#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see dsl.NumEvaluations#getNumber()
	 * @see #getNumEvaluations()
	 * @generated
	 */
	EAttribute getNumEvaluations_Number();

	/**
	 * Returns the meta object for enum '{@link dsl.NoLocation <em>No Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>No Location</em>'.
	 * @see dsl.NoLocation
	 * @generated
	 */
	EEnum getNoLocation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DslFactory getDslFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dsl.impl.ProblemSpecificationImpl <em>Problem Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.ProblemSpecificationImpl
		 * @see dsl.impl.DslPackageImpl#getProblemSpecification()
		 * @generated
		 */
		EClass PROBLEM_SPECIFICATION = eINSTANCE.getProblemSpecification();

		/**
		 * The meta object literal for the '<em><b>World Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM_SPECIFICATION__WORLD_MODEL = eINSTANCE.getProblemSpecification_WorldModel();

		/**
		 * The meta object literal for the '<em><b>Robots Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM_SPECIFICATION__ROBOTS_MODEL = eINSTANCE.getProblemSpecification_RobotsModel();

		/**
		 * The meta object literal for the '<em><b>Tasks Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM_SPECIFICATION__TASKS_MODEL = eINSTANCE.getProblemSpecification_TasksModel();

		/**
		 * The meta object literal for the '<em><b>Mission</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM_SPECIFICATION__MISSION = eINSTANCE.getProblemSpecification_Mission();

		/**
		 * The meta object literal for the '<em><b>Qos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM_SPECIFICATION__QOS = eINSTANCE.getProblemSpecification_Qos();

		/**
		 * The meta object literal for the '{@link dsl.impl.WorldModelImpl <em>World Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.WorldModelImpl
		 * @see dsl.impl.DslPackageImpl#getWorldModel()
		 * @generated
		 */
		EClass WORLD_MODEL = eINSTANCE.getWorldModel();

		/**
		 * The meta object literal for the '{@link dsl.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.LocationImpl
		 * @see dsl.impl.DslPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__NAME = eINSTANCE.getLocation_Name();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__X = eINSTANCE.getLocation_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__Y = eINSTANCE.getLocation_Y();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__DESCRIPTION = eINSTANCE.getLocation_Description();

		/**
		 * The meta object literal for the '{@link dsl.impl.PathsImpl <em>Paths</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.PathsImpl
		 * @see dsl.impl.DslPackageImpl#getPaths()
		 * @generated
		 */
		EClass PATHS = eINSTANCE.getPaths();

		/**
		 * The meta object literal for the '<em><b>Loc1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATHS__LOC1 = eINSTANCE.getPaths_Loc1();

		/**
		 * The meta object literal for the '<em><b>Loc2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATHS__LOC2 = eINSTANCE.getPaths_Loc2();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATHS__DISTANCE = eINSTANCE.getPaths_Distance();

		/**
		 * The meta object literal for the '{@link dsl.impl.RobotsModelImpl <em>Robots Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.RobotsModelImpl
		 * @see dsl.impl.DslPackageImpl#getRobotsModel()
		 * @generated
		 */
		EClass ROBOTS_MODEL = eINSTANCE.getRobotsModel();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOTS_MODEL__CAPABILITIES = eINSTANCE.getRobotsModel_Capabilities();

		/**
		 * The meta object literal for the '<em><b>Robots</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOTS_MODEL__ROBOTS = eINSTANCE.getRobotsModel_Robots();

		/**
		 * The meta object literal for the '{@link dsl.impl.RobotImpl <em>Robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.RobotImpl
		 * @see dsl.impl.DslPackageImpl#getRobot()
		 * @generated
		 */
		EClass ROBOT = eINSTANCE.getRobot();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT__NAME = eINSTANCE.getRobot_Name();

		/**
		 * The meta object literal for the '<em><b>Init Loc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__INIT_LOC = eINSTANCE.getRobot_InitLoc();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT__DESCRIPTION = eINSTANCE.getRobot_Description();

		/**
		 * The meta object literal for the '<em><b>Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT__VELOCITY = eINSTANCE.getRobot_Velocity();

		/**
		 * The meta object literal for the '{@link dsl.impl.CapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.CapabilityImpl
		 * @see dsl.impl.DslPackageImpl#getCapability()
		 * @generated
		 */
		EClass CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY__NAME = eINSTANCE.getCapability_Name();

		/**
		 * The meta object literal for the '<em><b>At</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__AT = eINSTANCE.getCapability_At();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY__DESCRIPTION = eINSTANCE.getCapability_Description();

		/**
		 * The meta object literal for the '{@link dsl.impl.TasksModelImpl <em>Tasks Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.TasksModelImpl
		 * @see dsl.impl.DslPackageImpl#getTasksModel()
		 * @generated
		 */
		EClass TASKS_MODEL = eINSTANCE.getTasksModel();

		/**
		 * The meta object literal for the '{@link dsl.impl.AtomicTaskImpl <em>Atomic Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.AtomicTaskImpl
		 * @see dsl.impl.DslPackageImpl#getAtomicTask()
		 * @generated
		 */
		EClass ATOMIC_TASK = eINSTANCE.getAtomicTask();

		/**
		 * The meta object literal for the '<em><b>Robots</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_TASK__ROBOTS = eINSTANCE.getAtomicTask_Robots();

		/**
		 * The meta object literal for the '<em><b>Loc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_TASK__LOC = eINSTANCE.getAtomicTask_Loc();

		/**
		 * The meta object literal for the '<em><b>Criticality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_TASK__CRITICALITY = eINSTANCE.getAtomicTask_Criticality();

		/**
		 * The meta object literal for the '{@link dsl.impl.CompoundTaskImpl <em>Compound Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.CompoundTaskImpl
		 * @see dsl.impl.DslPackageImpl#getCompoundTask()
		 * @generated
		 */
		EClass COMPOUND_TASK = eINSTANCE.getCompoundTask();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_TASK__LOCATION = eINSTANCE.getCompoundTask_Location();

		/**
		 * The meta object literal for the '<em><b>Criticality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOUND_TASK__CRITICALITY = eINSTANCE.getCompoundTask_Criticality();

		/**
		 * The meta object literal for the '<em><b>Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOUND_TASK__ORDERED = eINSTANCE.getCompoundTask_Ordered();

		/**
		 * The meta object literal for the '<em><b>Consecutive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOUND_TASK__CONSECUTIVE = eINSTANCE.getCompoundTask_Consecutive();

		/**
		 * The meta object literal for the '<em><b>Can Do Task</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_TASK__CAN_DO_TASK = eINSTANCE.getCompoundTask_CanDoTask();

		/**
		 * The meta object literal for the '{@link dsl.impl.MissionImpl <em>Mission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.MissionImpl
		 * @see dsl.impl.DslPackageImpl#getMission()
		 * @generated
		 */
		EClass MISSION = eINSTANCE.getMission();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MISSION__DESCRIPTION = eINSTANCE.getMission_Description();

		/**
		 * The meta object literal for the '<em><b>Criticality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MISSION__CRITICALITY = eINSTANCE.getMission_Criticality();

		/**
		 * The meta object literal for the '{@link dsl.impl.QoSImpl <em>Qo S</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.QoSImpl
		 * @see dsl.impl.DslPackageImpl#getQoS()
		 * @generated
		 */
		EClass QO_S = eINSTANCE.getQoS();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QO_S__DESCRIPTION = eINSTANCE.getQoS_Description();

		/**
		 * The meta object literal for the '<em><b>Criticality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QO_S__CRITICALITY = eINSTANCE.getQoS_Criticality();

		/**
		 * The meta object literal for the '{@link dsl.impl.AtomicTaskNoLocImpl <em>Atomic Task No Loc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.AtomicTaskNoLocImpl
		 * @see dsl.impl.DslPackageImpl#getAtomicTaskNoLoc()
		 * @generated
		 */
		EClass ATOMIC_TASK_NO_LOC = eINSTANCE.getAtomicTaskNoLoc();

		/**
		 * The meta object literal for the '<em><b>At</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_TASK_NO_LOC__AT = eINSTANCE.getAtomicTaskNoLoc_At();

		/**
		 * The meta object literal for the '{@link dsl.impl.AtomicTaskLocImpl <em>Atomic Task Loc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.AtomicTaskLocImpl
		 * @see dsl.impl.DslPackageImpl#getAtomicTaskLoc()
		 * @generated
		 */
		EClass ATOMIC_TASK_LOC = eINSTANCE.getAtomicTaskLoc();

		/**
		 * The meta object literal for the '<em><b>At</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_TASK_LOC__AT = eINSTANCE.getAtomicTaskLoc_At();

		/**
		 * The meta object literal for the '<em><b>Loc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_TASK_LOC__LOC = eINSTANCE.getAtomicTaskLoc_Loc();

		/**
		 * The meta object literal for the '{@link dsl.impl.CompTaskNoLocImpl <em>Comp Task No Loc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.CompTaskNoLocImpl
		 * @see dsl.impl.DslPackageImpl#getCompTaskNoLoc()
		 * @generated
		 */
		EClass COMP_TASK_NO_LOC = eINSTANCE.getCompTaskNoLoc();

		/**
		 * The meta object literal for the '<em><b>Ct</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_TASK_NO_LOC__CT = eINSTANCE.getCompTaskNoLoc_Ct();

		/**
		 * The meta object literal for the '{@link dsl.impl.CompTaskOneLocImpl <em>Comp Task One Loc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.CompTaskOneLocImpl
		 * @see dsl.impl.DslPackageImpl#getCompTaskOneLoc()
		 * @generated
		 */
		EClass COMP_TASK_ONE_LOC = eINSTANCE.getCompTaskOneLoc();

		/**
		 * The meta object literal for the '<em><b>Ct</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_TASK_ONE_LOC__CT = eINSTANCE.getCompTaskOneLoc_Ct();

		/**
		 * The meta object literal for the '<em><b>Loc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_TASK_ONE_LOC__LOC = eINSTANCE.getCompTaskOneLoc_Loc();

		/**
		 * The meta object literal for the '{@link dsl.impl.CompTaskAllLocImpl <em>Comp Task All Loc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.CompTaskAllLocImpl
		 * @see dsl.impl.DslPackageImpl#getCompTaskAllLoc()
		 * @generated
		 */
		EClass COMP_TASK_ALL_LOC = eINSTANCE.getCompTaskAllLoc();

		/**
		 * The meta object literal for the '<em><b>Ct</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_TASK_ALL_LOC__CT = eINSTANCE.getCompTaskAllLoc_Ct();

		/**
		 * The meta object literal for the '<em><b>Loc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_TASK_ALL_LOC__LOC = eINSTANCE.getCompTaskAllLoc_Loc();

		/**
		 * The meta object literal for the '{@link dsl.impl.CompTaskAtButImpl <em>Comp Task At But</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.CompTaskAtButImpl
		 * @see dsl.impl.DslPackageImpl#getCompTaskAtBut()
		 * @generated
		 */
		EClass COMP_TASK_AT_BUT = eINSTANCE.getCompTaskAtBut();

		/**
		 * The meta object literal for the '<em><b>Ct</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_TASK_AT_BUT__CT = eINSTANCE.getCompTaskAtBut_Ct();

		/**
		 * The meta object literal for the '<em><b>Location List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_TASK_AT_BUT__LOCATION_LIST = eINSTANCE.getCompTaskAtBut_LocationList();

		/**
		 * The meta object literal for the '<em><b>Loc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_TASK_AT_BUT__LOC = eINSTANCE.getCompTaskAtBut_Loc();

		/**
		 * The meta object literal for the '{@link dsl.impl.CompTaskStatedButImpl <em>Comp Task Stated But</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.CompTaskStatedButImpl
		 * @see dsl.impl.DslPackageImpl#getCompTaskStatedBut()
		 * @generated
		 */
		EClass COMP_TASK_STATED_BUT = eINSTANCE.getCompTaskStatedBut();

		/**
		 * The meta object literal for the '<em><b>Ct</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_TASK_STATED_BUT__CT = eINSTANCE.getCompTaskStatedBut_Ct();

		/**
		 * The meta object literal for the '<em><b>Location List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_TASK_STATED_BUT__LOCATION_LIST = eINSTANCE.getCompTaskStatedBut_LocationList();

		/**
		 * The meta object literal for the '{@link dsl.impl.LocationOrSpaceImpl <em>Location Or Space</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.LocationOrSpaceImpl
		 * @see dsl.impl.DslPackageImpl#getLocationOrSpace()
		 * @generated
		 */
		EClass LOCATION_OR_SPACE = eINSTANCE.getLocationOrSpace();

		/**
		 * The meta object literal for the '<em><b>Loc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_OR_SPACE__LOC = eINSTANCE.getLocationOrSpace_Loc();

		/**
		 * The meta object literal for the '<em><b>Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_OR_SPACE__SPACE = eINSTANCE.getLocationOrSpace_Space();

		/**
		 * The meta object literal for the '{@link dsl.impl.Robots2tasksPerformanceImpl <em>Robots2tasks Performance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.Robots2tasksPerformanceImpl
		 * @see dsl.impl.DslPackageImpl#getRobots2tasksPerformance()
		 * @generated
		 */
		EClass ROBOTS2TASKS_PERFORMANCE = eINSTANCE.getRobots2tasksPerformance();

		/**
		 * The meta object literal for the '<em><b>At</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOTS2TASKS_PERFORMANCE__AT = eINSTANCE.getRobots2tasksPerformance_At();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOTS2TASKS_PERFORMANCE__TIME = eINSTANCE.getRobots2tasksPerformance_Time();

		/**
		 * The meta object literal for the '<em><b>Prob</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOTS2TASKS_PERFORMANCE__PROB = eINSTANCE.getRobots2tasksPerformance_Prob();

		/**
		 * The meta object literal for the '{@link dsl.impl.CompTaskListLocImpl <em>Comp Task List Loc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.CompTaskListLocImpl
		 * @see dsl.impl.DslPackageImpl#getCompTaskListLoc()
		 * @generated
		 */
		EClass COMP_TASK_LIST_LOC = eINSTANCE.getCompTaskListLoc();

		/**
		 * The meta object literal for the '<em><b>Ct</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_TASK_LIST_LOC__CT = eINSTANCE.getCompTaskListLoc_Ct();

		/**
		 * The meta object literal for the '<em><b>Location List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_TASK_LIST_LOC__LOCATION_LIST = eINSTANCE.getCompTaskListLoc_LocationList();

		/**
		 * The meta object literal for the '{@link dsl.impl.AllRobotsXXImpl <em>All Robots XX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.AllRobotsXXImpl
		 * @see dsl.impl.DslPackageImpl#getAllRobotsXX()
		 * @generated
		 */
		EClass ALL_ROBOTS_XX = eINSTANCE.getAllRobotsXX();

		/**
		 * The meta object literal for the '<em><b>Coordinate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALL_ROBOTS_XX__COORDINATE = eINSTANCE.getAllRobotsXX_Coordinate();

		/**
		 * The meta object literal for the '<em><b>Xy1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALL_ROBOTS_XX__XY1 = eINSTANCE.getAllRobotsXX_Xy1();

		/**
		 * The meta object literal for the '<em><b>Xy2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALL_ROBOTS_XX__XY2 = eINSTANCE.getAllRobotsXX_Xy2();

		/**
		 * The meta object literal for the '{@link dsl.impl.AllRobotsXImpl <em>All Robots X</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.AllRobotsXImpl
		 * @see dsl.impl.DslPackageImpl#getAllRobotsX()
		 * @generated
		 */
		EClass ALL_ROBOTS_X = eINSTANCE.getAllRobotsX();

		/**
		 * The meta object literal for the '<em><b>Coordinate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALL_ROBOTS_X__COORDINATE = eINSTANCE.getAllRobotsX_Coordinate();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALL_ROBOTS_X__TYPE = eINSTANCE.getAllRobotsX_Type();

		/**
		 * The meta object literal for the '<em><b>Xy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALL_ROBOTS_X__XY = eINSTANCE.getAllRobotsX_Xy();

		/**
		 * The meta object literal for the '{@link dsl.impl.RobotsXXImpl <em>Robots XX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.RobotsXXImpl
		 * @see dsl.impl.DslPackageImpl#getRobotsXX()
		 * @generated
		 */
		EClass ROBOTS_XX = eINSTANCE.getRobotsXX();

		/**
		 * The meta object literal for the '<em><b>Coordinate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOTS_XX__COORDINATE = eINSTANCE.getRobotsXX_Coordinate();

		/**
		 * The meta object literal for the '<em><b>Xy1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOTS_XX__XY1 = eINSTANCE.getRobotsXX_Xy1();

		/**
		 * The meta object literal for the '<em><b>Xy2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOTS_XX__XY2 = eINSTANCE.getRobotsXX_Xy2();

		/**
		 * The meta object literal for the '<em><b>Robot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOTS_XX__ROBOT = eINSTANCE.getRobotsXX_Robot();

		/**
		 * The meta object literal for the '{@link dsl.impl.RobotsXImpl <em>Robots X</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.RobotsXImpl
		 * @see dsl.impl.DslPackageImpl#getRobotsX()
		 * @generated
		 */
		EClass ROBOTS_X = eINSTANCE.getRobotsX();

		/**
		 * The meta object literal for the '<em><b>Coordinate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOTS_X__COORDINATE = eINSTANCE.getRobotsX_Coordinate();

		/**
		 * The meta object literal for the '<em><b>Xy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOTS_X__XY = eINSTANCE.getRobotsX_Xy();

		/**
		 * The meta object literal for the '<em><b>Robot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOTS_X__ROBOT = eINSTANCE.getRobotsX_Robot();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOTS_X__TYPE = eINSTANCE.getRobotsX_Type();

		/**
		 * The meta object literal for the '<em><b>Typ</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOTS_X__TYP = eINSTANCE.getRobotsX_Typ();

		/**
		 * The meta object literal for the '{@link dsl.impl.AllRobotsDeployImpl <em>All Robots Deploy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.AllRobotsDeployImpl
		 * @see dsl.impl.DslPackageImpl#getAllRobotsDeploy()
		 * @generated
		 */
		EClass ALL_ROBOTS_DEPLOY = eINSTANCE.getAllRobotsDeploy();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALL_ROBOTS_DEPLOY__S = eINSTANCE.getAllRobotsDeploy_S();

		/**
		 * The meta object literal for the '{@link dsl.impl.NumAllocationsImpl <em>Num Allocations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.NumAllocationsImpl
		 * @see dsl.impl.DslPackageImpl#getNumAllocations()
		 * @generated
		 */
		EClass NUM_ALLOCATIONS = eINSTANCE.getNumAllocations();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUM_ALLOCATIONS__NUMBER = eINSTANCE.getNumAllocations_Number();

		/**
		 * The meta object literal for the '{@link dsl.impl.NumPopulationImpl <em>Num Population</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.NumPopulationImpl
		 * @see dsl.impl.DslPackageImpl#getNumPopulation()
		 * @generated
		 */
		EClass NUM_POPULATION = eINSTANCE.getNumPopulation();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUM_POPULATION__NUMBER = eINSTANCE.getNumPopulation_Number();

		/**
		 * The meta object literal for the '{@link dsl.impl.NumEvaluationsImpl <em>Num Evaluations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.impl.NumEvaluationsImpl
		 * @see dsl.impl.DslPackageImpl#getNumEvaluations()
		 * @generated
		 */
		EClass NUM_EVALUATIONS = eINSTANCE.getNumEvaluations();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUM_EVALUATIONS__NUMBER = eINSTANCE.getNumEvaluations_Number();

		/**
		 * The meta object literal for the '{@link dsl.NoLocation <em>No Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsl.NoLocation
		 * @see dsl.impl.DslPackageImpl#getNoLocation()
		 * @generated
		 */
		EEnum NO_LOCATION = eINSTANCE.getNoLocation();

	}

} //DslPackage
