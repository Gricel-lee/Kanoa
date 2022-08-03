mdp

formula done = (r4_order=4 & r2_order=7);

// failure
formula fail = (r4_fail=0 & r2_fail=0 );

// total time available
const int TT=60;

// completion tasks time
const int r4at4_notify_5Time=1;
const int r4at4_notify_8Time=1;
const int r4at4_notify_11Time=1;
const int r2at2_floor_6Time=7;
const int r2at3_sanit_7Time=5;
const int r2at2_floor_9Time=7;
const int r2at3_sanit_10Time=5;
const int r2at2_floor_12Time=7;
const int r2at3_sanit_13Time=5;

// probabilities of succeeding with a task
const double pr4_Succ_at1_move = 0.9;
const double pr4_Succ_at4_notify = 0.9;
const double pr2_Succ_at2_floor = 0.85;
const double pr2_Succ_at3_sanit = 0.9;
const double pr2_Succ_at4_notify = 0.85;

// travelling costs of each robot
const int r4_travDist = 12; //l10->room3->room4->room5
const int r2_travDist = 8; //l8->room3->room3->room4->room5->room5->room4

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


//---------- Robot r4 MODULE----------
module r4
  //r4_order=0: travel cost 
  //r4_order=1: task at4_notify_5
  //r4_order=2: task at4_notify_8
  //r4_order=3: task at4_notify_11
  r4_order: [0..4] init 0; // execution order
  r4_time:[0..TT] init 0; //time available
  r4_travel: [0..1] init 0; // get travelling reward
  r4_fail: [0..1] init 0; // failure detected

  // tasks to track for ordering constraints
  at4_notify_5:[0..1];
  at4_notify_8:[0..1];
  at4_notify_11:[0..1];

  // travel captured as a reward
  [r4travel] r4_order=0 -> (r4_order'=1);
  // do sequence of tasks
  [ ] r4_order=1 & r4_fail=0 & (r4_time+ r4at4_notify_5Time + 8 <=TT) -> (pr4_Succ_at4_notify): (r4_order'=2) & (r4_time'= r4_time+ r4at4_notify_5Time + 8) & (at4_notify_5'=1)+ (1-pr4_Succ_at4_notify): (r4_fail'=1) & (r4_order'=2) & (r4_time'= r4_time+ r4at4_notify_5Time + 8) & (at4_notify_5'=1);
  [ ] r4_order=2 & r4_fail=0 & (r4_time+ r4at4_notify_8Time + 2 <=TT) -> (pr4_Succ_at4_notify): (r4_order'=3) & (r4_time'= r4_time+ r4at4_notify_8Time + 2) & (at4_notify_8'=1)+ (1-pr4_Succ_at4_notify): (r4_fail'=1) & (r4_order'=3) & (r4_time'= r4_time+ r4at4_notify_8Time + 2) & (at4_notify_8'=1);
  [ ] r4_order=3 & r4_fail=0 & (r4_time+ r4at4_notify_11Time + 2 <=TT) -> (pr4_Succ_at4_notify): (r4_order'=4) & (r4_time'= r4_time+ r4at4_notify_11Time + 2) & (at4_notify_11'=1)+ (1-pr4_Succ_at4_notify): (r4_fail'=1) & (r4_order'=4) & (r4_time'= r4_time+ r4at4_notify_11Time + 2) & (at4_notify_11'=1);

  // failure and recovery
  [ ] r4_fail=1 -> (r4_fail'=0); // fail
  [r4idle] r4_order!=4 & r4_fail=0 & (r4_time+1<=TT) -> (r4_time'=r4_time+1); // idle
endmodule


//---------- Robot r2 MODULE----------
module r2
  //r2_order=0: travel cost 
  //r2_order=1: task at2_floor_6
  //r2_order=2: task at3_sanit_7
  //r2_order=3: task at2_floor_9
  //r2_order=4: task at3_sanit_13
  //r2_order=5: task at2_floor_12
  //r2_order=6: task at3_sanit_10
  r2_order: [0..7] init 0; // execution order
  r2_time:[0..TT] init 0; //time available
  r2_travel: [0..1] init 0; // get travelling reward
  r2_fail: [0..1] init 0; // failure detected

  // tasks to track for ordering constraints
  at2_floor_6:[0..1];
  at3_sanit_7:[0..1];
  at2_floor_9:[0..1];
  at3_sanit_13:[0..1];
  at2_floor_12:[0..1];
  at3_sanit_10:[0..1];

  // travel captured as a reward
  [r2travel] r2_order=0 -> (r2_order'=1);
  // do sequence of tasks
  [ ] r2_order=1 & r2_fail=0 & at3_sanit_7=1 & at4_notify_5=1 & (r2_time+ r2at2_floor_6Time + 2 <=TT) -> (pr2_Succ_at2_floor): (r2_order'=2) & (r2_time'= r2_time+ r2at2_floor_6Time + 2) & (at2_floor_6'=1)+ (1-pr2_Succ_at2_floor): (r2_fail'=1) & (r2_order'=2) & (r2_time'= r2_time+ r2at2_floor_6Time + 2) & (at2_floor_6'=1);
  [ ] r2_order=2 & r2_fail=0 & at4_notify_5=1 & r2_time>=r4_time & (r2_time+ r2at3_sanit_7Time + 0 <=TT) -> (pr2_Succ_at3_sanit): (r2_order'=3) & (r2_time'= r2_time+ r2at3_sanit_7Time + 0) & (at3_sanit_7'=1)+ (1-pr2_Succ_at3_sanit): (r2_fail'=1) & (r2_order'=3) & (r2_time'= r2_time+ r2at3_sanit_7Time + 0) & (at3_sanit_7'=1);
  [ ] r2_order=3 & r2_fail=0 & at3_sanit_10=1 & at4_notify_8=1 & (r2_time+ r2at2_floor_9Time + 2 <=TT) -> (pr2_Succ_at2_floor): (r2_order'=4) & (r2_time'= r2_time+ r2at2_floor_9Time + 2) & (at2_floor_9'=1)+ (1-pr2_Succ_at2_floor): (r2_fail'=1) & (r2_order'=4) & (r2_time'= r2_time+ r2at2_floor_9Time + 2) & (at2_floor_9'=1);
  [ ] r2_order=4 & r2_fail=0 & at4_notify_11=1 & r2_time>=r4_time & (r2_time+ r2at3_sanit_13Time + 2 <=TT) -> (pr2_Succ_at3_sanit): (r2_order'=5) & (r2_time'= r2_time+ r2at3_sanit_13Time + 2) & (at3_sanit_13'=1)+ (1-pr2_Succ_at3_sanit): (r2_fail'=1) & (r2_order'=5) & (r2_time'= r2_time+ r2at3_sanit_13Time + 2) & (at3_sanit_13'=1);
  [ ] r2_order=5 & r2_fail=0 & at3_sanit_13=1 & at4_notify_11=1 & (r2_time+ r2at2_floor_12Time + 0 <=TT) -> (pr2_Succ_at2_floor): (r2_order'=6) & (r2_time'= r2_time+ r2at2_floor_12Time + 0) & (at2_floor_12'=1)+ (1-pr2_Succ_at2_floor): (r2_fail'=1) & (r2_order'=6) & (r2_time'= r2_time+ r2at2_floor_12Time + 0) & (at2_floor_12'=1);
  [ ] r2_order=6 & r2_fail=0 & at4_notify_8=1 & r2_time>=r4_time & (r2_time+ r2at3_sanit_10Time + 2 <=TT) -> (pr2_Succ_at3_sanit): (r2_order'=7) & (r2_time'= r2_time+ r2at3_sanit_10Time + 2) & (at3_sanit_10'=1)+ (1-pr2_Succ_at3_sanit): (r2_fail'=1) & (r2_order'=7) & (r2_time'= r2_time+ r2at3_sanit_10Time + 2) & (at3_sanit_10'=1);

  // failure and recovery
  [ ] r2_fail=1 -> (r2_fail'=0); // fail
  [r2idle] r2_order!=7 & r2_fail=0 & (r2_time+1<=TT) -> (r2_time'=r2_time+1); // idle
endmodule

rewards "travel" 
 [r4travel] true: r4_travDist;
 [r2travel] true: r2_travDist;
endrewards
rewards "idle" 
 [r4idle] true: 1;
 [r2idle] true: 1;
endrewards