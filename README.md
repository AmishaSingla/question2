## Getting started
### Prerequisites
* JDK 1.8 or higher is needed to build and execute this project
* To clone this project (to get a copy of this project code) to your local machine, you need [Git](https://git-scm.com/) to be installed
* This project uses [gradle](https://gradle.org/) as its build management tool. But installing gradle locally is not needed since this project comes with a gradle wrapper that is self sufficient

## Step 1: Clone the repository (How to copy the code of this project into your local machine)
Assuming you installed Git on your local machine, run the following command from terminal
    
    `git clone https://git.vivasa.in/vivasa-open/poorna-client-be`

## Step 2: Review the Folder Structure
<details>
  <summary>Structure</summary>
  #### Review this structure to find the important folders in this project you need to be familiar with
<pre>
├── bin/
├── build/
│   ├── classes
│   ├── reports --> Test reports can be found here
│   ├── resources
│   ├── springloaded
│   ├── test-results
│   └── tmp
├── build.gradle --> Primary configuration file of this entire project
├── gradle
│   └── wrapper
├── gradle.properties
├── gradlew
├── gradlew.bat
├── grails-app --> Can be ignored for now as it is irrelevant. Should not be delete though
├── grailsw
├── grailsw.bat
├── grails-wrapper.jar
├── lib
│   └── poorna-tests-0.1.jar
└── src --> All source code lives here
    ├── integration-test
    ├── test --> Code related to Test cases lives here
    └── main --> Application code lives here
</pre>

</details>
## Step 3: Configure your email 
Once you clone the project and you are ready to code, you need to configure your email inside this project. 
This is done by executing this command from the root directory of the project:
`./gradlew whoami`
Provide your email id when the above command prompts you about the same.

If you would like to reconfigure your email, remove the file `.poornaid` from the folder `src/main/resources` using the command `rm src/main/resources .poornaid`

## Step 4: Write the code for your exercise
* You should have been given one or more challenges with few exercises in each. 
* In the source directory inside the project (`src/main/java`) you will find dedicated packages created for each challenge. 
* Source files without implementation are already created for each exercise. 
* Locate the correct source file and code your solution.



### Cloning the project repository

[![asciicast](https://asciinema.org/a/1TfYlx72vfP9LGuU2RDHuTvOK.svg)](https://asciinema.org/a/1TfYlx72vfP9LGuU2RDHuTvOK)

### Editor
For this project, WE STRONGLY ADVICE AGAINST ECLIPSE, NETBEANS, IDEA or any other mainstream Java IDE and recommend simple file editors such as Sublime, Atom, TextMate, Textpad etc.,


### How to run the test cases

From the root directory of the project: 
To execute the test case for Class Question1 in package `level100` use the command: `./gradlew test -Dtest.single='*level100/Question1'`

