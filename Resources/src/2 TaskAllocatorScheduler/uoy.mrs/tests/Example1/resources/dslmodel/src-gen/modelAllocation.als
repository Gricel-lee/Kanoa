// ----------------Initialise constraint solver-------------//
open util/integer

abstract sig Robot {
	capability: set Capability,
}

abstract sig Capability {
	do: set AtomicTask
}

abstract sig AtomicTask {
	x: one Int,
	y: one Int
}

fact{all rt: Capability | #capability.rt=1} //all Capability appearing must be assigned to a robot
fact{all r: Robot | #r.capability.do>0} //all Robots appearing must have assigned tasks
fact{all rt: Capability | #rt.do>0} // all capability appearing must have assigned tasks
fact{all r:Robot | #r<=1} // all robots appears max. once


// ----------------ROBOTS:

sig r1 extends Robot{}
{disj[capability ,  Capability-r1at2_floor-r1at3_sanit-r1at4_notify]}
fact{#r1<=1}
sig r5 extends Robot{}
{disj[capability ,  Capability-r5at4_notify]}
fact{#r5<=1}

// ----------------CAPABILITIES:

sig r1at2_floor extends Capability{}
{all d:do | d in at2_floor}
sig r1at3_sanit extends Capability{}
{all d:do | d in at3_sanit}
sig r1at4_notify extends Capability{}
{all d:do | d in at4_notify}
sig r5at4_notify extends Capability{}
{all d:do | d in at4_notify}

fact{#r1at2_floor<=1
#r1at3_sanit<=1
#r1at4_notify<=1
#r5at4_notify<=1
} // robot capabilities appear once (if robot appears, and if capab. tasks assigned)

// ----------------ATOMIC TASKS:

abstract sig at2_floor,at3_sanit,at4_notify extends AtomicTask {}
fact{all a:at2_floor | #do.a=1}	// number of robots needed
fact{all a:at3_sanit | #do.a=1}	// number of robots needed
fact{all a:at4_notify | #do.a=1}	// number of robots needed
sig at4_notify_0 extends at4_notify{}
{x=4
y=1}
sig at2_floor_1 extends at2_floor{}
{x=4
y=1}
sig at3_sanit_2 extends at3_sanit{}
{x=4
y=1}
sig at4_notify_3 extends at4_notify{}
{x=10
y=5}
sig at2_floor_4 extends at2_floor{}
{x=10
y=5}
sig at3_sanit_5 extends at3_sanit{}
{x=10
y=5}

// ----------------PREDICATE:

pred TaskAllocation{
}

// ----------------CONSTRAINTS:


// ----------------RUN COMMAND:

run TaskAllocation for
7 Int,
4 Capability,
exactly 6 AtomicTask,
exactly 2 Robot,// deploy all robots,
exactly 1 at4_notify_0,
exactly 1 at2_floor_1,
exactly 1 at3_sanit_2,
exactly 1 at4_notify_3,
exactly 1 at2_floor_4,
exactly 1 at3_sanit_5