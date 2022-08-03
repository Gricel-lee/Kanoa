/*
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.myDsl.AllRobotsDeploy;
import org.xtext.example.mydsl.myDsl.AllRobotsX;
import org.xtext.example.mydsl.myDsl.AllRobotsXX;
import org.xtext.example.mydsl.myDsl.AtomicTask;
import org.xtext.example.mydsl.myDsl.AtomicTaskLoc;
import org.xtext.example.mydsl.myDsl.AtomicTaskNoLoc;
import org.xtext.example.mydsl.myDsl.Capability;
import org.xtext.example.mydsl.myDsl.CompTaskAtBut;
import org.xtext.example.mydsl.myDsl.CompTaskListLoc;
import org.xtext.example.mydsl.myDsl.CompTaskNoLoc;
import org.xtext.example.mydsl.myDsl.CompTaskOneLoc;
import org.xtext.example.mydsl.myDsl.CompTaskStatedBut;
import org.xtext.example.mydsl.myDsl.CompoundTask;
import org.xtext.example.mydsl.myDsl.Location;
import org.xtext.example.mydsl.myDsl.LocationOrSpace;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.NumAllocations;
import org.xtext.example.mydsl.myDsl.NumEvaluations;
import org.xtext.example.mydsl.myDsl.NumPopulation;
import org.xtext.example.mydsl.myDsl.Paths;
import org.xtext.example.mydsl.myDsl.ProblemSpecification;
import org.xtext.example.mydsl.myDsl.Robot;
import org.xtext.example.mydsl.myDsl.Robots2tasksPerformance;
import org.xtext.example.mydsl.myDsl.RobotsModel;
import org.xtext.example.mydsl.myDsl.RobotsX;
import org.xtext.example.mydsl.myDsl.RobotsXX;
import org.xtext.example.mydsl.myDsl.TimeAvailable;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.ALL_ROBOTS_DEPLOY:
				sequence_AllRobotsDeploy(context, (AllRobotsDeploy) semanticObject); 
				return; 
			case MyDslPackage.ALL_ROBOTS_X:
				sequence_AllRobotsX(context, (AllRobotsX) semanticObject); 
				return; 
			case MyDslPackage.ALL_ROBOTS_XX:
				sequence_AllRobotsXX(context, (AllRobotsXX) semanticObject); 
				return; 
			case MyDslPackage.ATOMIC_TASK:
				sequence_AtomicTask(context, (AtomicTask) semanticObject); 
				return; 
			case MyDslPackage.ATOMIC_TASK_LOC:
				sequence_AtomicTaskLoc(context, (AtomicTaskLoc) semanticObject); 
				return; 
			case MyDslPackage.ATOMIC_TASK_NO_LOC:
				sequence_AtomicTaskNoLoc(context, (AtomicTaskNoLoc) semanticObject); 
				return; 
			case MyDslPackage.CAPABILITY:
				sequence_Capability(context, (Capability) semanticObject); 
				return; 
			case MyDslPackage.COMP_TASK_AT_BUT:
				sequence_CompTaskAtBut(context, (CompTaskAtBut) semanticObject); 
				return; 
			case MyDslPackage.COMP_TASK_LIST_LOC:
				sequence_CompTaskListLoc(context, (CompTaskListLoc) semanticObject); 
				return; 
			case MyDslPackage.COMP_TASK_NO_LOC:
				sequence_CompTaskNoLoc(context, (CompTaskNoLoc) semanticObject); 
				return; 
			case MyDslPackage.COMP_TASK_ONE_LOC:
				sequence_CompTaskOneLoc(context, (CompTaskOneLoc) semanticObject); 
				return; 
			case MyDslPackage.COMP_TASK_STATED_BUT:
				sequence_CompTaskStatedBut(context, (CompTaskStatedBut) semanticObject); 
				return; 
			case MyDslPackage.COMPOUND_TASK:
				sequence_CompoundTask(context, (CompoundTask) semanticObject); 
				return; 
			case MyDslPackage.LOCATION:
				sequence_Location(context, (Location) semanticObject); 
				return; 
			case MyDslPackage.LOCATION_OR_SPACE:
				sequence_LocationOrSpace(context, (LocationOrSpace) semanticObject); 
				return; 
			case MyDslPackage.NUM_ALLOCATIONS:
				sequence_NumAllocations(context, (NumAllocations) semanticObject); 
				return; 
			case MyDslPackage.NUM_EVALUATIONS:
				sequence_NumEvaluations(context, (NumEvaluations) semanticObject); 
				return; 
			case MyDslPackage.NUM_POPULATION:
				sequence_NumPopulation(context, (NumPopulation) semanticObject); 
				return; 
			case MyDslPackage.PATHS:
				sequence_Paths(context, (Paths) semanticObject); 
				return; 
			case MyDslPackage.PROBLEM_SPECIFICATION:
				sequence_ProblemSpecification(context, (ProblemSpecification) semanticObject); 
				return; 
			case MyDslPackage.ROBOT:
				sequence_Robot(context, (Robot) semanticObject); 
				return; 
			case MyDslPackage.ROBOTS2TASKS_PERFORMANCE:
				sequence_Robots2tasksPerformance(context, (Robots2tasksPerformance) semanticObject); 
				return; 
			case MyDslPackage.ROBOTS_MODEL:
				sequence_RobotsModel(context, (RobotsModel) semanticObject); 
				return; 
			case MyDslPackage.ROBOTS_X:
				sequence_RobotsX(context, (RobotsX) semanticObject); 
				return; 
			case MyDslPackage.ROBOTS_XX:
				sequence_RobotsXX(context, (RobotsXX) semanticObject); 
				return; 
			case MyDslPackage.TIME_AVAILABLE:
				sequence_TimeAvailable(context, (TimeAvailable) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     QoS returns AllRobotsDeploy
	 *     AllRobotsDeploy returns AllRobotsDeploy
	 *
	 * Constraint:
	 *     {AllRobotsDeploy}
	 * </pre>
	 */
	protected void sequence_AllRobotsDeploy(ISerializationContext context, AllRobotsDeploy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     QoS returns AllRobotsXX
	 *     AllRobotsXX returns AllRobotsXX
	 *
	 * Constraint:
	 *     ((coordinate='x' | coordinate='y') xy1=EDouble xy2=EDouble)
	 * </pre>
	 */
	protected void sequence_AllRobotsXX(ISerializationContext context, AllRobotsXX semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     QoS returns AllRobotsX
	 *     AllRobotsX returns AllRobotsX
	 *
	 * Constraint:
	 *     ((coordinate='x' | coordinate='y') (type='greater than' | type='lower than' | type='geq' | type='leq') xy=EDouble)
	 * </pre>
	 */
	protected void sequence_AllRobotsX(ISerializationContext context, AllRobotsX semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Mission returns AtomicTaskLoc
	 *     AtomicTaskLoc returns AtomicTaskLoc
	 *
	 * Constraint:
	 *     (name=EString at=[AtomicTask|EString] loc=[Location|EString] description=EString?)
	 * </pre>
	 */
	protected void sequence_AtomicTaskLoc(ISerializationContext context, AtomicTaskLoc semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Mission returns AtomicTaskNoLoc
	 *     AtomicTaskNoLoc returns AtomicTaskNoLoc
	 *
	 * Constraint:
	 *     (name=EString at=[AtomicTask|EString] description=EString?)
	 * </pre>
	 */
	protected void sequence_AtomicTaskNoLoc(ISerializationContext context, AtomicTaskNoLoc semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TasksModel returns AtomicTask
	 *     AtomicTask returns AtomicTask
	 *
	 * Constraint:
	 *     (name=EString robots=EInt loc=[Location|EString]? criticality=EBoolean? description=EString?)
	 * </pre>
	 */
	protected void sequence_AtomicTask(ISerializationContext context, AtomicTask semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Capability returns Capability
	 *
	 * Constraint:
	 *     (name=EString at+=[AtomicTask|EString] at+=[AtomicTask|EString]* description=EString?)
	 * </pre>
	 */
	protected void sequence_Capability(ISerializationContext context, Capability semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Mission returns CompTaskAtBut
	 *     CompTaskAtBut returns CompTaskAtBut
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ct=[CompoundTask|EString] 
	 *         loc=[Location|EString] 
	 *         locationList+=LocationOrSpace 
	 *         locationList+=LocationOrSpace* 
	 *         criticality=EString? 
	 *         description=EString?
	 *     )
	 * </pre>
	 */
	protected void sequence_CompTaskAtBut(ISerializationContext context, CompTaskAtBut semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Mission returns CompTaskListLoc
	 *     CompTaskListLoc returns CompTaskListLoc
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ct=[CompoundTask|EString] 
	 *         locationList+=[Location|EString] 
	 *         locationList+=[Location|EString]* 
	 *         criticality=EString? 
	 *         description=EString?
	 *     )
	 * </pre>
	 */
	protected void sequence_CompTaskListLoc(ISerializationContext context, CompTaskListLoc semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Mission returns CompTaskNoLoc
	 *     CompTaskNoLoc returns CompTaskNoLoc
	 *
	 * Constraint:
	 *     (name=EString ct=[CompoundTask|EString] criticality=EString? description=EString?)
	 * </pre>
	 */
	protected void sequence_CompTaskNoLoc(ISerializationContext context, CompTaskNoLoc semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Mission returns CompTaskOneLoc
	 *     CompTaskOneLoc returns CompTaskOneLoc
	 *
	 * Constraint:
	 *     (name=EString ct=[CompoundTask|EString] loc=[Location|EString] criticality=EString? description=EString?)
	 * </pre>
	 */
	protected void sequence_CompTaskOneLoc(ISerializationContext context, CompTaskOneLoc semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Mission returns CompTaskStatedBut
	 *     CompTaskStatedBut returns CompTaskStatedBut
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ct=[CompoundTask|EString] 
	 *         locationList+=LocationOrSpace 
	 *         locationList+=LocationOrSpace* 
	 *         criticality=EString? 
	 *         description=EString?
	 *     )
	 * </pre>
	 */
	protected void sequence_CompTaskStatedBut(ISerializationContext context, CompTaskStatedBut semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TasksModel returns CompoundTask
	 *     CompoundTask returns CompoundTask
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         canDoTask+=[TasksModel|EString] 
	 *         canDoTask+=[TasksModel|EString]* 
	 *         location=[Location|EString]? 
	 *         criticality=EBoolean? 
	 *         ordered=EBoolean? 
	 *         consecutive=EBoolean? 
	 *         description=EString?
	 *     )
	 * </pre>
	 */
	protected void sequence_CompoundTask(ISerializationContext context, CompoundTask semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     LocationOrSpace returns LocationOrSpace
	 *
	 * Constraint:
	 *     (space='-' | loc=[Location|EString])
	 * </pre>
	 */
	protected void sequence_LocationOrSpace(ISerializationContext context, LocationOrSpace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     WorldModel returns Location
	 *     Location returns Location
	 *
	 * Constraint:
	 *     (name=EString x=EDouble y=EDouble description=EString?)
	 * </pre>
	 */
	protected void sequence_Location(ISerializationContext context, Location semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     QoS returns NumAllocations
	 *     NumAllocations returns NumAllocations
	 *
	 * Constraint:
	 *     number=EInt
	 * </pre>
	 */
	protected void sequence_NumAllocations(ISerializationContext context, NumAllocations semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.NUM_ALLOCATIONS__NUMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.NUM_ALLOCATIONS__NUMBER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumAllocationsAccess().getNumberEIntParserRuleCall_2_0(), semanticObject.getNumber());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     QoS returns NumEvaluations
	 *     NumEvaluations returns NumEvaluations
	 *
	 * Constraint:
	 *     number=EInt
	 * </pre>
	 */
	protected void sequence_NumEvaluations(ISerializationContext context, NumEvaluations semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.NUM_EVALUATIONS__NUMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.NUM_EVALUATIONS__NUMBER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumEvaluationsAccess().getNumberEIntParserRuleCall_2_0(), semanticObject.getNumber());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     QoS returns NumPopulation
	 *     NumPopulation returns NumPopulation
	 *
	 * Constraint:
	 *     number=EInt
	 * </pre>
	 */
	protected void sequence_NumPopulation(ISerializationContext context, NumPopulation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.NUM_POPULATION__NUMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.NUM_POPULATION__NUMBER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumPopulationAccess().getNumberEIntParserRuleCall_2_0(), semanticObject.getNumber());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     WorldModel returns Paths
	 *     Paths returns Paths
	 *
	 * Constraint:
	 *     (loc1=[Location|EString] loc2=[Location|EString] distance=EDouble)
	 * </pre>
	 */
	protected void sequence_Paths(ISerializationContext context, Paths semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.PATHS__LOC1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.PATHS__LOC1));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.PATHS__LOC2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.PATHS__LOC2));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.PATHS__DISTANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.PATHS__DISTANCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPathsAccess().getLoc1LocationEStringParserRuleCall_1_0_1(), semanticObject.eGet(MyDslPackage.Literals.PATHS__LOC1, false));
		feeder.accept(grammarAccess.getPathsAccess().getLoc2LocationEStringParserRuleCall_3_0_1(), semanticObject.eGet(MyDslPackage.Literals.PATHS__LOC2, false));
		feeder.accept(grammarAccess.getPathsAccess().getDistanceEDoubleParserRuleCall_6_0(), semanticObject.getDistance());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ProblemSpecification returns ProblemSpecification
	 *
	 * Constraint:
	 *     (
	 *         worldModel+=WorldModel 
	 *         worldModel+=WorldModel* 
	 *         tasksModel+=TasksModel 
	 *         tasksModel+=TasksModel* 
	 *         robotsModel=RobotsModel 
	 *         mission+=Mission 
	 *         mission+=Mission* 
	 *         (qos+=QoS qos+=QoS*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_ProblemSpecification(ISerializationContext context, ProblemSpecification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Robot returns Robot
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         initLoc=[Location|EString] 
	 *         velocity=EDouble 
	 *         robots2tasksPerformance+=Robots2tasksPerformance 
	 *         robots2tasksPerformance+=Robots2tasksPerformance*
	 *     )
	 * </pre>
	 */
	protected void sequence_Robot(ISerializationContext context, Robot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Robots2tasksPerformance returns Robots2tasksPerformance
	 *
	 * Constraint:
	 *     (at=[AtomicTask|EString] time=EDouble prob=EDouble)
	 * </pre>
	 */
	protected void sequence_Robots2tasksPerformance(ISerializationContext context, Robots2tasksPerformance semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ROBOTS2TASKS_PERFORMANCE__AT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ROBOTS2TASKS_PERFORMANCE__AT));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ROBOTS2TASKS_PERFORMANCE__TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ROBOTS2TASKS_PERFORMANCE__TIME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ROBOTS2TASKS_PERFORMANCE__PROB) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ROBOTS2TASKS_PERFORMANCE__PROB));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRobots2tasksPerformanceAccess().getAtAtomicTaskEStringParserRuleCall_1_0_1(), semanticObject.eGet(MyDslPackage.Literals.ROBOTS2TASKS_PERFORMANCE__AT, false));
		feeder.accept(grammarAccess.getRobots2tasksPerformanceAccess().getTimeEDoubleParserRuleCall_5_0(), semanticObject.getTime());
		feeder.accept(grammarAccess.getRobots2tasksPerformanceAccess().getProbEDoubleParserRuleCall_10_0(), semanticObject.getProb());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     RobotsModel returns RobotsModel
	 *
	 * Constraint:
	 *     (robots+=Robot robots+=Robot*)
	 * </pre>
	 */
	protected void sequence_RobotsModel(ISerializationContext context, RobotsModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     QoS returns RobotsXX
	 *     RobotsXX returns RobotsXX
	 *
	 * Constraint:
	 *     (robot=[Robot|EString] (coordinate='x' | coordinate='y') xy1=EDouble xy2=EDouble)
	 * </pre>
	 */
	protected void sequence_RobotsXX(ISerializationContext context, RobotsXX semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     QoS returns RobotsX
	 *     RobotsX returns RobotsX
	 *
	 * Constraint:
	 *     (robot=[Robot|EString] (coordinate='x' | coordinate='y') (type='greater than' | type='lower than' | type='qeg' | type='leq') xy=EDouble)
	 * </pre>
	 */
	protected void sequence_RobotsX(ISerializationContext context, RobotsX semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     QoS returns TimeAvailable
	 *     TimeAvailable returns TimeAvailable
	 *
	 * Constraint:
	 *     number=EInt
	 * </pre>
	 */
	protected void sequence_TimeAvailable(ISerializationContext context, TimeAvailable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.TIME_AVAILABLE__NUMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.TIME_AVAILABLE__NUMBER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTimeAvailableAccess().getNumberEIntParserRuleCall_2_0(), semanticObject.getNumber());
		feeder.finish();
	}
	
	
}
