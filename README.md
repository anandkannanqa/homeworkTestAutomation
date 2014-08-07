Version: 1.0

Introduction: This is a short test automation project 

Requirements: The below mentioned environment was used by me and it is tested in the below environment


ENVIRONMENT USED

    Operating system: Windows 7  (Altough this should work in Mac, Linux and other windows version, however I have tested only in windows 7)

    IDE:Eclipse 

    Build tool: ANTS 

    Test Runner: TestNG

    Selenium Webdriver jars extracted from selenium website (The dependecny jar is also provided in the attachments)

    The google chrome version used is Version 36.0.1985.125 m
    The firefox version used is firefox 31.0 


prerequisites & how to run the test:
-----------------------------

    Selenium jars need to be extracted from the jars.zip folder https://www.dropbox.com/home/King%20Test

    TestNG is required to be installed if the test is directly run from the IDE.

    ANTS should be configured to run the test from command line: 

    The ANT can be downloaded from http://ant.apache.org/bindownload.cgi 
    and further instructions will be found in http://ant.apache.org/manualdownload.cgi.
    In the build.xml file of ant one of the properties to look for jars is <property name="ws.jars" value="E:\jars"/> thereby ant requires all jars to be avialabe in "E:\jars".
    Kindly change this propery according to your computer configurations. The required jar which should be present in the jars directory can be downloaded here https://www.dropbox.com/home/King%20Test 


    cd till you reach the project and use the below commands

    C:\KingAutomationAssingment> ant clean
    C:\KingAutomationAssingment> ant compile
    C:\KingAutomationAssingment> ant run

    The TestNg produces a graphical result in my computer it produces here file:///C:/KingAutomationAssingment/test-output/index.html. But this can be seen in the test-output folder in the IDE or one can browse to this location.






