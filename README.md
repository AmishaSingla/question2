## Getting started

### About this project
> The use of this project is to help the participants of Poorna program validate their work easily against the test cases packaged along with this project.

#### Folder structure
```
.
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

```

### Installation
#### Windows

1. Install Git & Git Bash
2. Using Git Bash
3. Install JDK >= 8
4. Configure JAVA_HOME

#### Linux

### Editor
WE STRONGLY ADVICE AGAINST ECLIPSE, NETBEANS, IDEA or any other mainstream Java IDE and recommend simple file editors such as Sublime, Atom, TextMate, Textpad etc.,

### Building and executing this project


### How to run the test cases

From the root directory of the project: 
To execute the test case for Class Question1 in package `athletes` use the command: `./gradlew test -Dtest.single='*athletes/Question1'`