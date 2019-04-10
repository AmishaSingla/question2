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

Git installation on windows

1. Install Git & Git Bash
    (Note : you should be familiar with basic linux commands)

    
    To install git on windows , in browser search like “git for windows”. And download git  
    for windows. (or) By using the following link you can download.
    
    https://git-scm.com/download/win
    
    After downloading git . { in installation process you can get "select components" window
    there you need to select 'git bash' and 'on the desktop' (it will provide desktop icon for git bash) }
    install it on your local machine by clicking ‘Next’ until you encounter ‘Finish’ option.
    
    git bash provides you a terminal(so you can work from git bash like linux terminal).

2. Using Git Bash
        
        
        

    After installing git , it will provide a terminal to run linux commands on windows.
    Now you can check the version of git (whether it got installed or not ), 
    by using the following command.(through bash terminal)
        
            * git --version(it will give you which version you have installed)
                
    Now clone  poorna-client-be (project) to your local machine by using the following command git clone with URL.
        
            * git clone https://git.vivasa.in/vivasa-open/poorna-client-be.git
        
    Next step enter in to that project by using (cd projectname/). Now make sure you are in
    that project , next you need to perform the following command .
        
            * ./gradlew whoami
                
    Type the above command and press enter it will ask for email id . enter your email id and press enter.
    Now start working with our project in your local machine.
        
3. Install JDK >= 8
4. Configure JAVA_HOME

#### Linux

 Git installation on Linux :
 (Note : you should be familiar with basic linux commands)
 
 Debian/Ubuntu
 
    For the latest stable version for your release of Debian/Ubuntu
    
        # sudo apt-get update
        # sudo apt-get install git 
    
 Fedora
 
        # sudo yum update 
        # sudo yum install git (up to Fedora 21)
        # sudo dnf install git (Fedora 22 and later)

 By using the above commands you can install git in your linux machine. Now you can check the version of git (whether it got installed or not ), 
 by using the following command.

        * git --version(it will give you which version you have installed)
            
 Now clone  poorna-client-be (project) to your local machine by using the following command with URL.
   
        * git clone https://git.vivasa.in/vivasa-open/poorna-client-be.git
   
 Next step enter in to that project by using (cd projectname/). Now make sure you are in
 that project , next you need to perform the following command .

        * ./gradlew whoami
                
 Type the above command and press enter it will ask for email id . enter your email id and press enter.
 Now start working with our project in your local machine.


### Editor
WE STRONGLY ADVICE AGAINST ECLIPSE, NETBEANS, IDEA or any other mainstream Java IDE and recommend simple file editors such as Sublime, Atom, TextMate, Textpad etc.,

### Building and executing this project


### How to run the test cases

From the root directory of the project: 
To execute the test case for Class Question1 in package `chelog1` use the command: `./gradlew test -Dtest.single='*chelog1/Question1'`