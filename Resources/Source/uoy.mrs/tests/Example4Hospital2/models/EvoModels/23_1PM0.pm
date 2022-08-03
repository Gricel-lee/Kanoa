mdp

formula done = (r2_order=4);

// failure
formula fail = (r2_fail=0 );

// total time available
const int TT=60;

// completion tasks time
const int r2at4_notify_2Time=5;
const int r2at2_floor_3Time=7;
const int r2at3_sanit_4Time=5;

// probabilities of succeeding with a task
const double pr2_Succ_at2_floor = 0.85;
const double pr2_Succ_at3_sanit = 0.9;
const double pr2_Succ_at4_notify = 0.85;

// travelling costs of each robot
const int r2_travDist = 6; //l8->room2->room2->room2

// tasks to track for ordering constraints
//const int at3_sanit_7 = 0;
//const int at3_sanit_13 = 0;
//const int at2_floor_9 = 0;
//const int at2_floor_6 = 0;
//const int at4_notify_8 = 0;
//const int at4_notify_2 = 0;
//const int at2_floor_12 = 0;
//const int at2_floor_3 = 0;
//const int at4_notify_11 = 0;
//const int at4_notify_5 = 0;
//const int at3_sanit_10 = 0;
//const int at3_sanit_4 = 0;


//---------- Robot r2 MODULE----------
module r2
  //r2_order=0: travel cost 
  //r2_order=1: task at4_notify_2
  //r2_order=2: task at2_floor_3
  //r2_order=3: task at3_sanit_4
  r2_order: [0..4] init 0; // execution order
  r2_time:[0..TT] init 0; //time available
  r2_travel: [0..1] init 0; // get travelling reward
  r2_fail: [0..1] init 0; // failure detected

  // tasks to track for ordering constraints
  at4_notify_2:[0..1];
  at2_floor_3:[0..1];
  at3_sanit_4:[0..1];

  // travel captured as a reward
  [r2travel] r2_order=0 -> (r2_order'=1);
  // do sequence of tasks
  [ ] r2_order=1 & r2_fail=0 & (r2_time+ r2at4_notify_2Time + 6 <=TT) -> (pr2_Succ_at4_notify): (r2_order'=2) & (r2_time'= r2_time+ r2at4_notify_2Time + 6) & (at4_notify_2'=1)+ (1-pr2_Succ_at4_notify): (r2_fail'=1) & (r2_order'=2) & (r2_time'= r2_time+ r2at4_notify_2Time + 6) & (at4_notify_2'=1);
  [ ] r2_order=2 & r2_fail=0 & at3_sanit_4=1 & at4_notify_2=1 & (r2_time+ r2at2_floor_3Time + 0 <=TT) -> (pr2_Succ_at2_floor): (r2_order'=3) & (r2_time'= r2_time+ r2at2_floor_3Time + 0) & (at2_floor_3'=1)+ (1-pr2_Succ_at2_floor): (r2_fail'=1) & (r2_order'=3) & (r2_time'= r2_time+ r2at2_floor_3Time + 0) & (at2_floor_3'=1);
  [ ] r2_order=3 & r2_fail=0 & at4_notify_2=1 & (r2_time+ r2at3_sanit_4Time + 0 <=TT) -> (pr2_Succ_at3_sanit): (r2_order'=4) & (r2_time'= r2_time+ r2at3_sanit_4Time + 0) & (at3_sanit_4'=1)+ (1-pr2_Succ_at3_sanit): (r2_fail'=1) & (r2_order'=4) & (r2_time'= r2_time+ r2at3_sanit_4Time + 0) & (at3_sanit_4'=1);

  // failure and recovery
  [ ] r2_fail=1 -> (r2_fail'=0); // fail
  [r2idle] r2_order!=4 & r2_fail=0 & (r2_time+1<=TT) -> (r2_time'=r2_time+1); // idle
endmodule

rewards "travel" 
 [r2travel] true: r2_travDist;
endrewards
rewards "idle" 
 [r2idle] true: 1;
endrewards