/**
 */
package dsl.util;

import dsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dsl.DslPackage
 * @generated
 */
public class DslAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DslPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DslPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DslSwitch<Adapter> modelSwitch =
		new DslSwitch<Adapter>() {
			@Override
			public Adapter caseProblemSpecification(ProblemSpecification object) {
				return createProblemSpecificationAdapter();
			}
			@Override
			public Adapter caseWorldModel(WorldModel object) {
				return createWorldModelAdapter();
			}
			@Override
			public Adapter caseLocation(Location object) {
				return createLocationAdapter();
			}
			@Override
			public Adapter casePaths(Paths object) {
				return createPathsAdapter();
			}
			@Override
			public Adapter caseRobotsModel(RobotsModel object) {
				return createRobotsModelAdapter();
			}
			@Override
			public Adapter caseRobot(Robot object) {
				return createRobotAdapter();
			}
			@Override
			public Adapter caseCapability(Capability object) {
				return createCapabilityAdapter();
			}
			@Override
			public Adapter caseTasksModel(TasksModel object) {
				return createTasksModelAdapter();
			}
			@Override
			public Adapter caseAtomicTask(AtomicTask object) {
				return createAtomicTaskAdapter();
			}
			@Override
			public Adapter caseCompoundTask(CompoundTask object) {
				return createCompoundTaskAdapter();
			}
			@Override
			public Adapter caseMission(Mission object) {
				return createMissionAdapter();
			}
			@Override
			public Adapter caseQoS(QoS object) {
				return createQoSAdapter();
			}
			@Override
			public Adapter caseAtomicTaskNoLoc(AtomicTaskNoLoc object) {
				return createAtomicTaskNoLocAdapter();
			}
			@Override
			public Adapter caseAtomicTaskLoc(AtomicTaskLoc object) {
				return createAtomicTaskLocAdapter();
			}
			@Override
			public Adapter caseCompTaskNoLoc(CompTaskNoLoc object) {
				return createCompTaskNoLocAdapter();
			}
			@Override
			public Adapter caseCompTaskOneLoc(CompTaskOneLoc object) {
				return createCompTaskOneLocAdapter();
			}
			@Override
			public Adapter caseCompTaskAllLoc(CompTaskAllLoc object) {
				return createCompTaskAllLocAdapter();
			}
			@Override
			public Adapter caseCompTaskAtBut(CompTaskAtBut object) {
				return createCompTaskAtButAdapter();
			}
			@Override
			public Adapter caseCompTaskStatedBut(CompTaskStatedBut object) {
				return createCompTaskStatedButAdapter();
			}
			@Override
			public Adapter caseLocationOrSpace(LocationOrSpace object) {
				return createLocationOrSpaceAdapter();
			}
			@Override
			public Adapter caseRobots2tasksPerformance(Robots2tasksPerformance object) {
				return createRobots2tasksPerformanceAdapter();
			}
			@Override
			public Adapter caseCompTaskListLoc(CompTaskListLoc object) {
				return createCompTaskListLocAdapter();
			}
			@Override
			public Adapter caseAllRobotsXX(AllRobotsXX object) {
				return createAllRobotsXXAdapter();
			}
			@Override
			public Adapter caseAllRobotsX(AllRobotsX object) {
				return createAllRobotsXAdapter();
			}
			@Override
			public Adapter caseRobotsXX(RobotsXX object) {
				return createRobotsXXAdapter();
			}
			@Override
			public Adapter caseRobotsX(RobotsX object) {
				return createRobotsXAdapter();
			}
			@Override
			public Adapter caseAllRobotsDeploy(AllRobotsDeploy object) {
				return createAllRobotsDeployAdapter();
			}
			@Override
			public Adapter caseNumAllocations(NumAllocations object) {
				return createNumAllocationsAdapter();
			}
			@Override
			public Adapter caseNumPopulation(NumPopulation object) {
				return createNumPopulationAdapter();
			}
			@Override
			public Adapter caseNumEvaluations(NumEvaluations object) {
				return createNumEvaluationsAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link dsl.ProblemSpecification <em>Problem Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsl.ProblemSpecification
	 * @generated
	 */
	public Adapter createProblemSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsl.WorldModel <em>World Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsl.WorldModel
	 * @generated
	 */
	public Adapter createWorldModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsl.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsl.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsl.Paths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsl.Paths
	 * @generated
	 */
	public Adapter createPathsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsl.RobotsModel <em>Robots Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsl.RobotsModel
	 * @generated
	 */
	public Adapter createRobotsModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsl.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsl.Robot
	 * @generated
	 */
	public Adapter createRobotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsl.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsl.Capability
	 * @generated
	 */
	public Adapter createCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsl.TasksModel <em>Tasks Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsl.TasksModel
	 * @generated
	 */
	public Adapter createTasksModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsl.AtomicTask <em>Atomic Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsl.AtomicTask
	 * @generated
	 */
	public Adapter createAtomicTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsl.CompoundTask <em>Compound Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsl.CompoundTask
	 * @generated
	 */
	public Adapter createCompoundTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsl.Mission <em>Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsl.Mission
	 * @generated
	 */
	public Adapter createMissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsl.QoS <em>Qo S</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsl.QoS
	 * @generated
	 */
	public Adapter createQoSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsl.AtomicTaskNoLoc <em>Atomic Task No Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsl.AtomicTaskNoLoc
	 * @generated
	 */
	public Adapter createAtomicTaskNoLocAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsl.AtomicTaskLoc <em>Atomic Task Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsl.AtomicTaskLoc
	 * @generated
	 */
	public Adapter createAtomicTaskLocAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsl.CompTaskNoLoc <em>Comp Task No Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsl.CompTaskNoLoc
	 * @generated
	 */
	public Adapter createCompTaskNoLocAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsl.CompTaskOneLoc <em>Comp Task One Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsl.CompTaskOneLoc
	 * @generated
	 */
	public Adapter createCompTaskOneLocAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsl.CompTaskAllLoc <em>Comp Task All Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsl.CompTaskAllLoc
	 * @generated
	 */
	public Adapter createCompTaskAllLocAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsl.CompTaskAtBut <em>Comp Task At But</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsl.CompTaskAtBut
	 * @generated
	 */
	public Adapter createCompTaskAtButAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsl.CompTaskStatedBut <em>Comp Task Stated But</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsl.CompTaskStatedBut
	 * @generated
	 */
	public Adapter createCompTaskStatedButAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsl.LocationOrSpace <em>Location Or Space</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsl.LocationOrSpace
	 * @generated
	 */
	public Adapter createLocationOrSpaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsl.Robots2tasksPerformance <em>Robots2tasks Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsl.Robots2tasksPerformance
	 * @generated
	 */
	public Adapter createRobots2tasksPerformanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsl.CompTaskListLoc <em>Comp Task List Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsl.CompTaskListLoc
	 * @generated
	 */
	public Adapter createCompTaskListLocAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsl.AllRobotsXX <em>All Robots XX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsl.AllRobotsXX
	 * @generated
	 */
	public Adapter createAllRobotsXXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsl.AllRobotsX <em>All Robots X</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsl.AllRobotsX
	 * @generated
	 */
	public Adapter createAllRobotsXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsl.RobotsXX <em>Robots XX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsl.RobotsXX
	 * @generated
	 */
	public Adapter createRobotsXXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsl.RobotsX <em>Robots X</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsl.RobotsX
	 * @generated
	 */
	public Adapter createRobotsXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsl.AllRobotsDeploy <em>All Robots Deploy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsl.AllRobotsDeploy
	 * @generated
	 */
	public Adapter createAllRobotsDeployAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsl.NumAllocations <em>Num Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsl.NumAllocations
	 * @generated
	 */
	public Adapter createNumAllocationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsl.NumPopulation <em>Num Population</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsl.NumPopulation
	 * @generated
	 */
	public Adapter createNumPopulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsl.NumEvaluations <em>Num Evaluations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsl.NumEvaluations
	 * @generated
	 */
	public Adapter createNumEvaluationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DslAdapterFactory
