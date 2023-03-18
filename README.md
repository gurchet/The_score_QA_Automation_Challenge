## Score QA Automation Challenge
This is an automation solution that finds a league, team, or player within theScore app and verify the specified steps.

------------------------------------------------------

#### Author: Gurchet Singh
#### Email: sgurchet20@gmail.com

### Description
This framework is to provide automation solution to the given problem where the business flows of theScore is to be automated. To provide the cross platform single solution, appium tool is identified. Appium has capability to interact with devices having different plaforms and using same client side source code. To provide behavioral approach cucumber is used. It provided better re-usability and simplicity. Page object model is identified according to the requirement where inheritance based hierarchy built for page objects. On demand page object loading for the generic usage in business flows.  

### Technical dependencies
    * Maven
    * Cucmber Plugin
    * JDK 11
    * Connected mobile device or virtual device


### Prerequisites
- [x] Clone the repository
- [x] Install [jdk 11](https://www.oracle.com/java/technologies/downloads/#java11)
- [x] Install [Maven](https://maven.apache.org/install.html)
- [x] Execute the maven build process
- [x] Install Appium
- [x] Install [cucumber](https://www.jetbrains.com/help/idea/enabling-cucumber-support-in-project.html) plugin in IDE
- [x] The application under test can be found in resources folder
- [x] Connect the device or start virtual device
- [x] Install the app on device or virtual device
- [x] Set the device capabilities in capabilities.json under resources folder
- [x] Set config.properties according to the requirement
- [x] Run maven command "mvn test"
- [x] After run, allure report should get auto launched



### Salient Features
* Behaviour driven features
* Auto appium server run
* Auto recognition of connected device
* Auto app install
* Shared business flows across device platforms
* On demand page object loading from page factory
* Allure reporting


### Test Report

![test report](src/test/resources/allure_demo_report_thumbnail.png)
