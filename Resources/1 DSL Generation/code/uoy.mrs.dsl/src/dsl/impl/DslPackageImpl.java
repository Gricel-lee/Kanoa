/**
 */
package dsl.impl;

import dsl.AllRobotsDeploy;
import dsl.AllRobotsX;
import dsl.AllRobotsXX;
import dsl.AtomicTask;
import dsl.AtomicTaskLoc;
import dsl.AtomicTaskNoLoc;
import dsl.Capability;
import dsl.CompTaskAllLoc;
import dsl.CompTaskAtBut;
import dsl.CompTaskListLoc;
import dsl.CompTaskNoLoc;
import dsl.CompTaskOneLoc;
import dsl.CompTaskStatedBut;
import dsl.CompoundTask;
import dsl.DslFactory;
import dsl.DslPackage;
import dsl.Location;
import dsl.LocationOrSpace;
import dsl.Mission;
import dsl.NoLocation;
import dsl.NumAllocations;
import dsl.NumEvaluations;
import dsl.NumPopulation;
import dsl.Paths;
import dsl.ProblemSpecification;
import dsl.QoS;
import dsl.Robot;
import dsl.Robots2tasksPerformance;
import dsl.RobotsModel;
import dsl.RobotsX;
import dsl.RobotsXX;
import dsl.TasksModel;
import dsl.WorldModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DslPackageImpl extends EPackageImpl implements DslPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass worldModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass robotsModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass robotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tasksModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass missionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qoSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicTaskNoLocEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicTaskLocEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compTaskNoLocEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compTaskOneLocEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compTaskAllLocEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compTaskAtButEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compTaskStatedButEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationOrSpaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass robots2tasksPerformanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compTaskListLocEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allRobotsXXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allRobotsXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass robotsXXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass robotsXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allRobotsDeployEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numAllocationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numPopulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numEvaluationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum noLocationEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see dsl.DslPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DslPackageImpl() {
		super(eNS_URI, DslFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DslPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DslPackage init() {
		if (isInited) return (DslPackage)EPackage.Registry.INSTANCE.getEPackage(DslPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDslPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DslPackageImpl theDslPackage = registeredDslPackage instanceof DslPackageImpl ? (DslPackageImpl)registeredDslPackage : new DslPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDslPackage.createPackageContents();

		// Initialize created meta-data
		theDslPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDslPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DslPackage.eNS_URI, theDslPackage);
		return theDslPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblemSpecification() {
		return problemSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProblemSpecification_WorldModel() {
		return (EReference)problemSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProblemSpecification_RobotsModel() {
		return (EReference)problemSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProblemSpecification_TasksModel() {
		return (EReference)problemSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProblemSpecification_Mission() {
		return (EReference)problemSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProblemSpecification_Qos() {
		return (EReference)problemSpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorldModel() {
		return worldModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Name() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_X() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Y() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Description() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaths() {
		return pathsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaths_Loc1() {
		return (EReference)pathsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaths_Loc2() {
		return (EReference)pathsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaths_Distance() {
		return (EAttribute)pathsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRobotsModel() {
		return robotsModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobotsModel_Capabilities() {
		return (EReference)robotsModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobotsModel_Robots() {
		return (EReference)robotsModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRobot() {
		return robotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRobot_Name() {
		return (EAttribute)robotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobot_InitLoc() {
		return (EReference)robotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRobot_Description() {
		return (EAttribute)robotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRobot_Velocity() {
		return (EAttribute)robotEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapability() {
		return capabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapability_Name() {
		return (EAttribute)capabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapability_At() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapability_Description() {
		return (EAttribute)capabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTasksModel() {
		return tasksModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicTask() {
		return atomicTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtomicTask_Robots() {
		return (EAttribute)atomicTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicTask_Loc() {
		return (EReference)atomicTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtomicTask_Criticality() {
		return (EAttribute)atomicTaskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompoundTask() {
		return compoundTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundTask_Location() {
		return (EReference)compoundTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompoundTask_Criticality() {
		return (EAttribute)compoundTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompoundTask_Ordered() {
		return (EAttribute)compoundTaskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompoundTask_Consecutive() {
		return (EAttribute)compoundTaskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundTask_CanDoTask() {
		return (EReference)compoundTaskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMission() {
		return missionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMission_Description() {
		return (EAttribute)missionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMission_Criticality() {
		return (EAttribute)missionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQoS() {
		return qoSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQoS_Description() {
		return (EAttribute)qoSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQoS_Criticality() {
		return (EAttribute)qoSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicTaskNoLoc() {
		return atomicTaskNoLocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicTaskNoLoc_At() {
		return (EReference)atomicTaskNoLocEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicTaskLoc() {
		return atomicTaskLocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicTaskLoc_At() {
		return (EReference)atomicTaskLocEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicTaskLoc_Loc() {
		return (EReference)atomicTaskLocEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompTaskNoLoc() {
		return compTaskNoLocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompTaskNoLoc_Ct() {
		return (EReference)compTaskNoLocEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompTaskOneLoc() {
		return compTaskOneLocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompTaskOneLoc_Ct() {
		return (EReference)compTaskOneLocEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompTaskOneLoc_Loc() {
		return (EReference)compTaskOneLocEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompTaskAllLoc() {
		return compTaskAllLocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompTaskAllLoc_Ct() {
		return (EReference)compTaskAllLocEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompTaskAllLoc_Loc() {
		return (EReference)compTaskAllLocEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompTaskAtBut() {
		return compTaskAtButEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompTaskAtBut_Ct() {
		return (EReference)compTaskAtButEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompTaskAtBut_LocationList() {
		return (EReference)compTaskAtButEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompTaskAtBut_Loc() {
		return (EReference)compTaskAtButEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompTaskStatedBut() {
		return compTaskStatedButEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompTaskStatedBut_Ct() {
		return (EReference)compTaskStatedButEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompTaskStatedBut_LocationList() {
		return (EReference)compTaskStatedButEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationOrSpace() {
		return locationOrSpaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationOrSpace_Loc() {
		return (EReference)locationOrSpaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationOrSpace_Space() {
		return (EAttribute)locationOrSpaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRobots2tasksPerformance() {
		return robots2tasksPerformanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobots2tasksPerformance_At() {
		return (EReference)robots2tasksPerformanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRobots2tasksPerformance_Time() {
		return (EAttribute)robots2tasksPerformanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRobots2tasksPerformance_Prob() {
		return (EAttribute)robots2tasksPerformanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompTaskListLoc() {
		return compTaskListLocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompTaskListLoc_Ct() {
		return (EReference)compTaskListLocEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompTaskListLoc_LocationList() {
		return (EReference)compTaskListLocEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllRobotsXX() {
		return allRobotsXXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllRobotsXX_Coordinate() {
		return (EAttribute)allRobotsXXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllRobotsXX_Xy1() {
		return (EAttribute)allRobotsXXEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllRobotsXX_Xy2() {
		return (EAttribute)allRobotsXXEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllRobotsX() {
		return allRobotsXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllRobotsX_Coordinate() {
		return (EAttribute)allRobotsXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllRobotsX_Type() {
		return (EAttribute)allRobotsXEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllRobotsX_Xy() {
		return (EAttribute)allRobotsXEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRobotsXX() {
		return robotsXXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRobotsXX_Coordinate() {
		return (EAttribute)robotsXXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRobotsXX_Xy1() {
		return (EAttribute)robotsXXEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRobotsXX_Xy2() {
		return (EAttribute)robotsXXEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobotsXX_Robot() {
		return (EReference)robotsXXEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRobotsX() {
		return robotsXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRobotsX_Coordinate() {
		return (EAttribute)robotsXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRobotsX_Xy() {
		return (EAttribute)robotsXEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobotsX_Robot() {
		return (EReference)robotsXEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRobotsX_Type() {
		return (EAttribute)robotsXEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRobotsX_Typ() {
		return (EAttribute)robotsXEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllRobotsDeploy() {
		return allRobotsDeployEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllRobotsDeploy_S() {
		return (EAttribute)allRobotsDeployEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumAllocations() {
		return numAllocationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumAllocations_Number() {
		return (EAttribute)numAllocationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumPopulation() {
		return numPopulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumPopulation_Number() {
		return (EAttribute)numPopulationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumEvaluations() {
		return numEvaluationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumEvaluations_Number() {
		return (EAttribute)numEvaluationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNoLocation() {
		return noLocationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslFactory getDslFactory() {
		return (DslFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		problemSpecificationEClass = createEClass(PROBLEM_SPECIFICATION);
		createEReference(problemSpecificationEClass, PROBLEM_SPECIFICATION__WORLD_MODEL);
		createEReference(problemSpecificationEClass, PROBLEM_SPECIFICATION__ROBOTS_MODEL);
		createEReference(problemSpecificationEClass, PROBLEM_SPECIFICATION__TASKS_MODEL);
		createEReference(problemSpecificationEClass, PROBLEM_SPECIFICATION__MISSION);
		createEReference(problemSpecificationEClass, PROBLEM_SPECIFICATION__QOS);

		worldModelEClass = createEClass(WORLD_MODEL);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__NAME);
		createEAttribute(locationEClass, LOCATION__X);
		createEAttribute(locationEClass, LOCATION__Y);
		createEAttribute(locationEClass, LOCATION__DESCRIPTION);

		pathsEClass = createEClass(PATHS);
		createEReference(pathsEClass, PATHS__LOC1);
		createEReference(pathsEClass, PATHS__LOC2);
		createEAttribute(pathsEClass, PATHS__DISTANCE);

		robotsModelEClass = createEClass(ROBOTS_MODEL);
		createEReference(robotsModelEClass, ROBOTS_MODEL__CAPABILITIES);
		createEReference(robotsModelEClass, ROBOTS_MODEL__ROBOTS);

		robotEClass = createEClass(ROBOT);
		createEAttribute(robotEClass, ROBOT__NAME);
		createEReference(robotEClass, ROBOT__INIT_LOC);
		createEAttribute(robotEClass, ROBOT__DESCRIPTION);
		createEAttribute(robotEClass, ROBOT__VELOCITY);

		capabilityEClass = createEClass(CAPABILITY);
		createEAttribute(capabilityEClass, CAPABILITY__NAME);
		createEReference(capabilityEClass, CAPABILITY__AT);
		createEAttribute(capabilityEClass, CAPABILITY__DESCRIPTION);

		tasksModelEClass = createEClass(TASKS_MODEL);

		atomicTaskEClass = createEClass(ATOMIC_TASK);
		createEAttribute(atomicTaskEClass, ATOMIC_TASK__ROBOTS);
		createEReference(atomicTaskEClass, ATOMIC_TASK__LOC);
		createEAttribute(atomicTaskEClass, ATOMIC_TASK__CRITICALITY);

		compoundTaskEClass = createEClass(COMPOUND_TASK);
		createEReference(compoundTaskEClass, COMPOUND_TASK__LOCATION);
		createEAttribute(compoundTaskEClass, COMPOUND_TASK__CRITICALITY);
		createEAttribute(compoundTaskEClass, COMPOUND_TASK__ORDERED);
		createEAttribute(compoundTaskEClass, COMPOUND_TASK__CONSECUTIVE);
		createEReference(compoundTaskEClass, COMPOUND_TASK__CAN_DO_TASK);

		missionEClass = createEClass(MISSION);
		createEAttribute(missionEClass, MISSION__DESCRIPTION);
		createEAttribute(missionEClass, MISSION__CRITICALITY);

		qoSEClass = createEClass(QO_S);
		createEAttribute(qoSEClass, QO_S__DESCRIPTION);
		createEAttribute(qoSEClass, QO_S__CRITICALITY);

		atomicTaskNoLocEClass = createEClass(ATOMIC_TASK_NO_LOC);
		createEReference(atomicTaskNoLocEClass, ATOMIC_TASK_NO_LOC__AT);

		atomicTaskLocEClass = createEClass(ATOMIC_TASK_LOC);
		createEReference(atomicTaskLocEClass, ATOMIC_TASK_LOC__AT);
		createEReference(atomicTaskLocEClass, ATOMIC_TASK_LOC__LOC);

		compTaskNoLocEClass = createEClass(COMP_TASK_NO_LOC);
		createEReference(compTaskNoLocEClass, COMP_TASK_NO_LOC__CT);

		compTaskOneLocEClass = createEClass(COMP_TASK_ONE_LOC);
		createEReference(compTaskOneLocEClass, COMP_TASK_ONE_LOC__CT);
		createEReference(compTaskOneLocEClass, COMP_TASK_ONE_LOC__LOC);

		compTaskAllLocEClass = createEClass(COMP_TASK_ALL_LOC);
		createEReference(compTaskAllLocEClass, COMP_TASK_ALL_LOC__CT);
		createEReference(compTaskAllLocEClass, COMP_TASK_ALL_LOC__LOC);

		compTaskAtButEClass = createEClass(COMP_TASK_AT_BUT);
		createEReference(compTaskAtButEClass, COMP_TASK_AT_BUT__CT);
		createEReference(compTaskAtButEClass, COMP_TASK_AT_BUT__LOCATION_LIST);
		createEReference(compTaskAtButEClass, COMP_TASK_AT_BUT__LOC);

		compTaskStatedButEClass = createEClass(COMP_TASK_STATED_BUT);
		createEReference(compTaskStatedButEClass, COMP_TASK_STATED_BUT__CT);
		createEReference(compTaskStatedButEClass, COMP_TASK_STATED_BUT__LOCATION_LIST);

		locationOrSpaceEClass = createEClass(LOCATION_OR_SPACE);
		createEReference(locationOrSpaceEClass, LOCATION_OR_SPACE__LOC);
		createEAttribute(locationOrSpaceEClass, LOCATION_OR_SPACE__SPACE);

		robots2tasksPerformanceEClass = createEClass(ROBOTS2TASKS_PERFORMANCE);
		createEReference(robots2tasksPerformanceEClass, ROBOTS2TASKS_PERFORMANCE__AT);
		createEAttribute(robots2tasksPerformanceEClass, ROBOTS2TASKS_PERFORMANCE__TIME);
		createEAttribute(robots2tasksPerformanceEClass, ROBOTS2TASKS_PERFORMANCE__PROB);

		compTaskListLocEClass = createEClass(COMP_TASK_LIST_LOC);
		createEReference(compTaskListLocEClass, COMP_TASK_LIST_LOC__CT);
		createEReference(compTaskListLocEClass, COMP_TASK_LIST_LOC__LOCATION_LIST);

		allRobotsXXEClass = createEClass(ALL_ROBOTS_XX);
		createEAttribute(allRobotsXXEClass, ALL_ROBOTS_XX__COORDINATE);
		createEAttribute(allRobotsXXEClass, ALL_ROBOTS_XX__XY1);
		createEAttribute(allRobotsXXEClass, ALL_ROBOTS_XX__XY2);

		allRobotsXEClass = createEClass(ALL_ROBOTS_X);
		createEAttribute(allRobotsXEClass, ALL_ROBOTS_X__COORDINATE);
		createEAttribute(allRobotsXEClass, ALL_ROBOTS_X__TYPE);
		createEAttribute(allRobotsXEClass, ALL_ROBOTS_X__XY);

		robotsXXEClass = createEClass(ROBOTS_XX);
		createEAttribute(robotsXXEClass, ROBOTS_XX__COORDINATE);
		createEAttribute(robotsXXEClass, ROBOTS_XX__XY1);
		createEAttribute(robotsXXEClass, ROBOTS_XX__XY2);
		createEReference(robotsXXEClass, ROBOTS_XX__ROBOT);

		robotsXEClass = createEClass(ROBOTS_X);
		createEAttribute(robotsXEClass, ROBOTS_X__COORDINATE);
		createEAttribute(robotsXEClass, ROBOTS_X__XY);
		createEReference(robotsXEClass, ROBOTS_X__ROBOT);
		createEAttribute(robotsXEClass, ROBOTS_X__TYPE);
		createEAttribute(robotsXEClass, ROBOTS_X__TYP);

		allRobotsDeployEClass = createEClass(ALL_ROBOTS_DEPLOY);
		createEAttribute(allRobotsDeployEClass, ALL_ROBOTS_DEPLOY__S);

		numAllocationsEClass = createEClass(NUM_ALLOCATIONS);
		createEAttribute(numAllocationsEClass, NUM_ALLOCATIONS__NUMBER);

		numPopulationEClass = createEClass(NUM_POPULATION);
		createEAttribute(numPopulationEClass, NUM_POPULATION__NUMBER);

		numEvaluationsEClass = createEClass(NUM_EVALUATIONS);
		createEAttribute(numEvaluationsEClass, NUM_EVALUATIONS__NUMBER);

		// Create enums
		noLocationEEnum = createEEnum(NO_LOCATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		locationEClass.getESuperTypes().add(this.getWorldModel());
		pathsEClass.getESuperTypes().add(this.getWorldModel());
		atomicTaskEClass.getESuperTypes().add(this.getTasksModel());
		compoundTaskEClass.getESuperTypes().add(this.getTasksModel());
		atomicTaskNoLocEClass.getESuperTypes().add(this.getMission());
		atomicTaskLocEClass.getESuperTypes().add(this.getMission());
		compTaskNoLocEClass.getESuperTypes().add(this.getMission());
		compTaskOneLocEClass.getESuperTypes().add(this.getMission());
		compTaskAllLocEClass.getESuperTypes().add(this.getMission());
		compTaskAtButEClass.getESuperTypes().add(this.getMission());
		compTaskStatedButEClass.getESuperTypes().add(this.getMission());
		compTaskListLocEClass.getESuperTypes().add(this.getMission());
		allRobotsXXEClass.getESuperTypes().add(this.getQoS());
		allRobotsXEClass.getESuperTypes().add(this.getQoS());
		robotsXXEClass.getESuperTypes().add(this.getQoS());
		robotsXEClass.getESuperTypes().add(this.getQoS());
		allRobotsDeployEClass.getESuperTypes().add(this.getQoS());
		numAllocationsEClass.getESuperTypes().add(this.getQoS());
		numPopulationEClass.getESuperTypes().add(this.getQoS());
		numEvaluationsEClass.getESuperTypes().add(this.getQoS());

		// Initialize classes, features, and operations; add parameters
		initEClass(problemSpecificationEClass, ProblemSpecification.class, "ProblemSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProblemSpecification_WorldModel(), this.getWorldModel(), null, "worldModel", null, 1, -1, ProblemSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProblemSpecification_RobotsModel(), this.getRobotsModel(), null, "robotsModel", null, 1, -1, ProblemSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProblemSpecification_TasksModel(), this.getTasksModel(), null, "tasksModel", null, 1, -1, ProblemSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProblemSpecification_Mission(), this.getMission(), null, "mission", null, 1, -1, ProblemSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProblemSpecification_Qos(), this.getQoS(), null, "qos", null, 1, -1, ProblemSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(worldModelEClass, WorldModel.class, "WorldModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_Name(), ecorePackage.getEString(), "name", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_X(), ecorePackage.getEDouble(), "x", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Y(), ecorePackage.getEDouble(), "y", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Description(), ecorePackage.getEString(), "description", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathsEClass, Paths.class, "Paths", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPaths_Loc1(), this.getLocation(), null, "loc1", null, 1, 1, Paths.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaths_Loc2(), this.getLocation(), null, "loc2", null, 1, 1, Paths.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaths_Distance(), ecorePackage.getEDouble(), "distance", null, 1, 1, Paths.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(robotsModelEClass, RobotsModel.class, "RobotsModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRobotsModel_Capabilities(), this.getCapability(), null, "capabilities", null, 1, -1, RobotsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRobotsModel_Robots(), this.getRobot(), null, "robots", null, 1, -1, RobotsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(robotEClass, Robot.class, "Robot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRobot_Name(), ecorePackage.getEString(), "name", null, 1, 1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRobot_InitLoc(), this.getLocation(), null, "initLoc", null, 1, 1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRobot_Description(), ecorePackage.getEString(), "description", null, 0, 1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRobot_Velocity(), ecorePackage.getEDouble(), "velocity", null, 1, 1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityEClass, Capability.class, "Capability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCapability_Name(), ecorePackage.getEString(), "name", null, 1, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapability_At(), this.getAtomicTask(), null, "at", null, 1, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapability_Description(), ecorePackage.getEString(), "description", null, 0, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tasksModelEClass, TasksModel.class, "TasksModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atomicTaskEClass, AtomicTask.class, "AtomicTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtomicTask_Robots(), ecorePackage.getEInt(), "robots", null, 1, 1, AtomicTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomicTask_Loc(), this.getLocation(), null, "loc", null, 0, 1, AtomicTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomicTask_Criticality(), ecorePackage.getEBoolean(), "criticality", null, 0, 1, AtomicTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compoundTaskEClass, CompoundTask.class, "CompoundTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompoundTask_Location(), this.getLocation(), null, "location", null, 0, 1, CompoundTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompoundTask_Criticality(), ecorePackage.getEBoolean(), "criticality", null, 0, 1, CompoundTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompoundTask_Ordered(), ecorePackage.getEBoolean(), "ordered", null, 1, 1, CompoundTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompoundTask_Consecutive(), ecorePackage.getEBoolean(), "consecutive", null, 1, 1, CompoundTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompoundTask_CanDoTask(), this.getTasksModel(), null, "canDoTask", null, 0, -1, CompoundTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(missionEClass, Mission.class, "Mission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMission_Description(), ecorePackage.getEString(), "description", null, 0, 1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMission_Criticality(), ecorePackage.getEString(), "criticality", null, 0, 1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qoSEClass, QoS.class, "QoS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQoS_Description(), ecorePackage.getEString(), "description", null, 0, 1, QoS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQoS_Criticality(), ecorePackage.getEString(), "criticality", null, 0, 1, QoS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicTaskNoLocEClass, AtomicTaskNoLoc.class, "AtomicTaskNoLoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtomicTaskNoLoc_At(), this.getAtomicTask(), null, "at", null, 1, 1, AtomicTaskNoLoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicTaskLocEClass, AtomicTaskLoc.class, "AtomicTaskLoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtomicTaskLoc_At(), this.getAtomicTask(), null, "at", null, 1, 1, AtomicTaskLoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomicTaskLoc_Loc(), this.getLocation(), null, "loc", null, 0, 1, AtomicTaskLoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compTaskNoLocEClass, CompTaskNoLoc.class, "CompTaskNoLoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompTaskNoLoc_Ct(), this.getCompoundTask(), null, "ct", null, 1, 1, CompTaskNoLoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compTaskOneLocEClass, CompTaskOneLoc.class, "CompTaskOneLoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompTaskOneLoc_Ct(), this.getCompoundTask(), null, "ct", null, 1, 1, CompTaskOneLoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompTaskOneLoc_Loc(), this.getLocation(), null, "loc", null, 1, 1, CompTaskOneLoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compTaskAllLocEClass, CompTaskAllLoc.class, "CompTaskAllLoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompTaskAllLoc_Ct(), this.getCompoundTask(), null, "ct", null, 1, 1, CompTaskAllLoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompTaskAllLoc_Loc(), this.getLocation(), null, "loc", null, 0, 1, CompTaskAllLoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compTaskAtButEClass, CompTaskAtBut.class, "CompTaskAtBut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompTaskAtBut_Ct(), this.getCompoundTask(), null, "ct", null, 1, 1, CompTaskAtBut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompTaskAtBut_LocationList(), this.getLocation(), null, "locationList", null, 2, -1, CompTaskAtBut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompTaskAtBut_Loc(), this.getLocationOrSpace(), null, "loc", null, 1, 1, CompTaskAtBut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compTaskStatedButEClass, CompTaskStatedBut.class, "CompTaskStatedBut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompTaskStatedBut_Ct(), this.getCompoundTask(), null, "ct", null, 1, 1, CompTaskStatedBut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompTaskStatedBut_LocationList(), this.getLocation(), null, "locationList", null, 2, -1, CompTaskStatedBut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationOrSpaceEClass, LocationOrSpace.class, "LocationOrSpace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocationOrSpace_Loc(), this.getLocation(), null, "loc", null, 0, 1, LocationOrSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationOrSpace_Space(), this.getNoLocation(), "space", null, 0, 1, LocationOrSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(robots2tasksPerformanceEClass, Robots2tasksPerformance.class, "Robots2tasksPerformance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRobots2tasksPerformance_At(), this.getAtomicTask(), null, "at", null, 1, 1, Robots2tasksPerformance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRobots2tasksPerformance_Time(), ecorePackage.getEDouble(), "time", null, 0, 1, Robots2tasksPerformance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRobots2tasksPerformance_Prob(), ecorePackage.getEDouble(), "prob", null, 0, 1, Robots2tasksPerformance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compTaskListLocEClass, CompTaskListLoc.class, "CompTaskListLoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompTaskListLoc_Ct(), this.getCompoundTask(), null, "ct", null, 1, 1, CompTaskListLoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompTaskListLoc_LocationList(), this.getLocation(), null, "locationList", null, 2, -1, CompTaskListLoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allRobotsXXEClass, AllRobotsXX.class, "AllRobotsXX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAllRobotsXX_Coordinate(), ecorePackage.getEString(), "coordinate", null, 1, 1, AllRobotsXX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllRobotsXX_Xy1(), ecorePackage.getEDouble(), "xy1", null, 1, 1, AllRobotsXX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllRobotsXX_Xy2(), ecorePackage.getEDouble(), "xy2", null, 1, 1, AllRobotsXX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allRobotsXEClass, AllRobotsX.class, "AllRobotsX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAllRobotsX_Coordinate(), ecorePackage.getEString(), "coordinate", null, 1, 1, AllRobotsX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllRobotsX_Type(), ecorePackage.getEString(), "type", null, 1, 1, AllRobotsX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllRobotsX_Xy(), ecorePackage.getEDouble(), "xy", null, 1, 1, AllRobotsX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(robotsXXEClass, RobotsXX.class, "RobotsXX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRobotsXX_Coordinate(), ecorePackage.getEString(), "coordinate", null, 1, 1, RobotsXX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRobotsXX_Xy1(), ecorePackage.getEDouble(), "xy1", null, 1, 1, RobotsXX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRobotsXX_Xy2(), ecorePackage.getEDouble(), "xy2", null, 1, 1, RobotsXX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRobotsXX_Robot(), this.getRobot(), null, "robot", null, 1, 1, RobotsXX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(robotsXEClass, RobotsX.class, "RobotsX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRobotsX_Coordinate(), ecorePackage.getEString(), "coordinate", null, 1, 1, RobotsX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRobotsX_Xy(), ecorePackage.getEDouble(), "xy", null, 1, 1, RobotsX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRobotsX_Robot(), this.getRobot(), null, "robot", null, 1, 1, RobotsX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRobotsX_Type(), ecorePackage.getEString(), "type", null, 1, 1, RobotsX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRobotsX_Typ(), ecorePackage.getEString(), "typ", null, 1, 1, RobotsX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allRobotsDeployEClass, AllRobotsDeploy.class, "AllRobotsDeploy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAllRobotsDeploy_S(), ecorePackage.getEString(), "s", null, 1, 1, AllRobotsDeploy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numAllocationsEClass, NumAllocations.class, "NumAllocations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumAllocations_Number(), ecorePackage.getEInt(), "number", null, 1, 1, NumAllocations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numPopulationEClass, NumPopulation.class, "NumPopulation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumPopulation_Number(), ecorePackage.getEInt(), "number", null, 1, 1, NumPopulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(numEvaluationsEClass, NumEvaluations.class, "NumEvaluations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumEvaluations_Number(), ecorePackage.getEInt(), "number", null, 1, 1, NumEvaluations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(noLocationEEnum, NoLocation.class, "NoLocation");
		addEEnumLiteral(noLocationEEnum, NoLocation.NO);

		// Create resource
		createResource(eNS_URI);
	}

} //DslPackageImpl
