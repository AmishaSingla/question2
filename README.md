## Getting started
### Prerequisites
* JDK 1.8 or higher is needed to build and execute this project
* To clone this project (to get a copy of this project code) to your local machine, you need Git to be installed
This project uses (gradle)[https://gradle.org/] as its build management tool. But installing 
### About this project
> The use of this project is to help the participants of Poorna program validate their work easily against the test cases packaged.

#### Folder structure
<details><summary>Please click here!</summary>


<code>
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

</code>


</details>


## Installation

### Git on Windows

1. Install Git & Git Bash
      (Note : you should be familiar with basic linux commands)

    
    To install git on windows , in browser search  “git for windows”. And download git  
    for windows. (or) By using the following link you can download.
    
    https://git-scm.com/download/win
    
    After downloading git .install it on your local machine by clicking ‘Next’ until you encounter ‘Finish’ option.
    Refer the following link to install Git & Git bash
    
    https://www.youtube.com/watch?v=rWboGsc6CqI
    
    git bash provides you a terminal(so you can work from git bash like linux terminal).

2. Using Git Bash

    After installing git , it will provide a terminal to run linux commands on windows.
    Now you can check the version of git (whether it got installed or not ), 
    by using the following command.(through bash terminal)
        
            * git --version(it will give you which version you have installed)
                
    Now clone  poorna-client-be (project) to your local machine by using the following command git clone with URL.
        
            * git clone https://git.vivasa.in/vivasa-open/poorna-client-be.git
        
    Next step is to enter into that project by using (cd projectname/). Now make sure you are in
    that project , next you need to perform the following command .
        
            * ./gradlew whoami
                
    Type the above command and press enter it will ask for email id . enter your email id and press enter.
    Now start working with our project in your local machine.
        
3. Install JDK >= 8
        (Note : Install JDK if it is not present in your machine)
    

        Following are steps to install Java in Windows
        
        step 1 : Go to the following link. Click on Download JDK. For java latest version.
           
        https://www.oracle.com/technetwork/java/javase/downloads/index.html
       
        Step 2) Next,
    
        Accept License Agreement
        
        Download latest Java JDK for your version(32 or 64 bit) of java for Windows.
        
        Step 3) Once the download is complete, run the exe for install JDK. Click Next
        
        Step 4) Once installation is complete click Close
   
4. Configure JAVA_HOME
     
     ( Now configure the path)

        The CLASSPATH variable gives location of the Library Files.
        
        Let's look into the steps to set the PATH and CLASSPATH
        
        Step 1) Right Click on the My Computer and Select the properties
        
        Step 2) Click on advanced system settings
        
        Step 3) Click on Environment Variables
        
        Step 4) Click on new Button of User variables
        
        Step 5) Type PATH in the Variable name.
        
        Step 6) Copy the path of bin folder which is installed in JDK folder.
        
        Step 7) Paste Path of bin folder in Variable value and click on OK Button.
        
        Note: In case you already have a PATH variable created in your PC, edit the PATH variable to

        PATH = <JDK installation directory>\bin;%PATH%;
        Here, %PATH% appends the existing path variable to our new value
        
        Step 8) You can follow a similar process to set CLASSPATH.

        Note: In case java installation does not work after installation, change classpath to

        CLASSPATH = <JDK installation directory>\lib\tools.jar;
        Step 9) Click on OK button
        
        Step 10) Go to command prompt and type javac commands.(then you will get to know java is installed or not)


### Git on Linux

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
   
 Next step is to enter into that project by using (cd projectname/). Now make sure you are in
 that project and perform the following command .

        * ./gradlew whoami
                
 Type the above command and press enter. It will ask for email id , enter your email id and press enter.
 Now start working with our project in your local machine.

### Cloning the project repository

[![asciicast](https://asciinema.org/a/1TfYlx72vfP9LGuU2RDHuTvOK.svg)](https://asciinema.org/a/1TfYlx72vfP9LGuU2RDHuTvOK)

### Editor
For this project, WE STRONGLY ADVICE AGAINST ECLIPSE, NETBEANS, IDEA or any other mainstream Java IDE and recommend simple file editors such as Sublime, Atom, TextMate, Textpad etc.,


### How to run the test cases

From the root directory of the project: 
To execute the test case for Class Question1 in package `level100` use the command: `./gradlew test -Dtest.single='*level100/Question1'`

