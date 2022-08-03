# Kanoa

Multi-robot task allocation and scheduling tool. The code is provided in Resources>Source.

## Installation

### DSL
We provide a user-friendly DSL for the adoption of Kanoa. We use EclipseEMF Modeling Tools Version: 2020-12 (4.18.0), project execution environment 'JavaSE-11' (Java SE 18 [18]).


### Task Allcoation and Scheduling
We tested Kanoa on Eclipse IDE Version: 2022-06 (4.24.0), project execution environment 'JavaSE-1.8' (JRE[17.0.2]).

It was developed as a Maven project. Make sure that the following Libraries are uploaded as part the pom.xml file:
![Screenshot 2022-08-03 at 01 53 11](https://user-images.githubusercontent.com/63869574/182501198-00b894b8-d11c-48a2-91cf-33b5a827c4e7.png)

Make sure you add the environmental variable in __Run Conconfigurations__, on IOs:
- DYLD_LIBRARY_PATH = libs/runtime

and on Linux:
- LD_LIBRARY_PATH = libs/runtime

You can now run ```RunApp.java``` directly or from your own project.

### Side note:
This is the first version of the end-to-end Kanoa tool, we appreciate reporting any bugs and ask any related questions.
Enjoy!
