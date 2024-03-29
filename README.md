# SecureAuth Challenge


[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

In this challenge you would find :
- FrontEnd : 3 automated scenarios
- BackEnd : GET an API response
- Gerking: create 5 scenarios for https://www.ebay.com/
    

### Installation
1) Install intellij comunity compiler  --> (https://www.jetbrains.com/es-es/idea/download/)
2) Open intellij and select "get from version control"
3) On the URL field paste the following URL (https://github.com/Gonzalo-Busson/SecureAuthChallenge.git)
4) Click on "Clone" button


### Important!! 
Respository use Chrome v.79 Driver, in case the user is not using  Chrome or has other version, the front-end scenarios will fail.
Chrome:(https://www.google.com.mx/chrome/?brand=CHBD&gclid=Cj0KCQiApaXxBRDNARIsAGFdaB_W9SyMR5KStuUh1KwYCHnycJwCuW-zD67d_IJdr_S_oAyOsRAQuj8aAsFeEALw_wcB&gclsrc=aw.ds)

### Running the Tests

##### Gerking Challenge
Feature folder located on (src/test/java/features), writen in BDD using cucumber library 

##### Frontend Challenge
Execute the  class :"TestSuite" (src/test/java/TestSuite.java) on line 16 in order to perform the 3 frontEnd Automated test. 

Scenarios developed : 
- Search an item
- Validate notification component was displayed 
- Validate Offers Carousel

##### Backend Challenge

Execute the  class :"APITest" (src/test/java/backEnd/APITest.java) on line 26 in order to perform the  BackEnd  Automated test. 


###### manipulation of the item search :
The String variable  "item" can be edited in order to change the item we want to search.


Expected result : Script should print  the URL used, api response coide , limit of items listed and amount of items found. Also it will print all titles of items retrieved. 




## Built With

* [Selenium](https://selenium.dev) - The Automation framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [Cucumber](https://cucumber.io/) - Feature gerking framework 
## Author

* **Busson Gonzalo** - *Initial work* 


