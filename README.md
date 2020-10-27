# Interview Project for Inpost Application

Sample project for interview to Inpost

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

Tests and WebDriver are create for Windows operation systems.

Test requires to have installed jdk1.8 and Maven on testing environment.

### JDK Installation:

1. Download jdk1.8 for Windows x64 from https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html and follow the installation instructions.
2. Set the PATH Environment Variable
 - Select Control Panel and then System.
 - Click Advanced and then Environment Variables.
 - Add the location of the bin folder of the JDK installation to the PATH variable in System Variables
 
To set the PATH variable add the full path of the jdk-8\bin directory to the PATH variable. Typically, the full path is:

```
C:\Program Files\Java\jdk-8\bin
```

3. Add ‘JAVA_HOME’ Environment Variable
 - Select Control Panel and then System.
 - Click Advanced and then Environment Variables.
 - Add the jdk location to the JAVA_HOME variable in User Variables

4. After that, type the following in a terminal or in a command prompt:

```
java -version
```

It should print out your installed version of JAVA, for example:
```
java version "1.8.0_171"
Java(TM) SE Runtime Environment (build 1.8.0_171-b11)
Java HotSpot(TM) 64-Bit Server VM (build 25.171-b11, mixed mode)
```

### MAVEN Installation:

1. Download Maven from https://maven.apache.org/download.cgi and follow the installation instructions.
2. Set the PATH Environment Variable
 - Select Control Panel and then System.
 - Click Advanced and then Environment Variables.
 - Add the location of the bin folder of the Maven installation to the PATH variable in System Variables
 
To set the PATH variable add the full path of the apache-maven-3.0.4/bin directory to the PATH variable. Typically, the full path is:

```
C:\Program Files\apache-maven-3.0.4\bin
```

3. Add ‘MAVEN_HOME’ and ‘M2_HOME’ Environment Variables
 - Select Control Panel and then System.
 - Click Advanced and then Environment Variables.
 - Add the jdk location to the MAVEN_HOME variable in User Variables
 - Add the jdk location to the M2_HOME variable in User Variables

4. After that, type the following in a terminal or in a command prompt:

```
mvn --version
```

It should print out your installed version of Maven, for example:
```
Apache Maven 3.6.1 (r01de14724cdef164cd33c7c8c2fe155faf9602da; 2019-08-04 14:51:28+0100)
Maven home: D:\apache-maven-3.5.3\bin\..
Java version: 1.8.0_171, vendor: Sun Microsystems Inc.
Java home: C:\Program Files\Java\jdk1.8.0_171\jre
Default locale: nl_NL, platform encoding: Cp1252
OS name: "windows 10", version: "6.1", arch: "amd64", family: "windows"
```


## Building and Running tests

To run the automated tests type in terminal or command prompt:

```
mvn clean verify
```

If build will be successful the command line will print out the following:

```
 ...
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESSFUL
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 2 seconds
[INFO] Finished at: Thu Jul 07 21:34:52 CEST 2011
[INFO] Final Memory: 3M/6M
[INFO] ------------------------------------------------------------------------
```

You can also just run the CucumberTestSuite test runner class to run tests.

By default, the tests will run using Chrome. You can run them in Firefox by overriding the driver system property, e.g.

```
mvn clean verify -Ddriver=firefox
```


### Cucumber add Gherkin

Gherkin uses a set of special keywords to give structure and meaning to executable specifications.

```
Feature: Search by keyword

  Scenario: Searching for a term
    Given Sergey is researching things on the internet
    When he looks up "Cucumber"
    Then he should see information about "Cucumber"
```

### Serenity BDD 

1. Driver initialization

Serenity BDD is an open source library with strong WebDriver integration than manages the WebDriver instances for user. 
When using Serenity user will  almost never need to create or close your own WebDriver instance.
This instance is created through class:

```
PageObject
```

Information about driver such as arguments, source path, preferences are stored in: 

```
serenity.properties
```

For example:

```
webdriver.chrome.driver=src/test/resources/chromedriver.exe
chrome.switches=--homepage=about:blank,--no-first-run,--start-maximized,--incognito
```

In tests driver can be managed through annotation:

```
@Managed
```

2. Page Objects

All WebElement interface need to be implemented as:

```
WebElementFacade
```

3. Explicit Wait

In Serenity BDD some useful explicit wait are implemented in simple way, e.g.:

```
webElementFacde.waitUntilClickable()
```

which in one line covers all exceptions and validates if element is visible and present

4. Reports

Serenity BDD can create full detailed aggregated reports.

Report can be created after adding correct dependency to pom.xml

```
<build>
    <plugins>
        <plugin>
            <groupId>net.serenity-bdd.maven.plugins</groupId>
            <artifactId>serenity-maven-plugin</artifactId>
            <version>${serenity.maven.version}</version>
            <executions>
                <execution>
                    <id>serenity-reports</id>
                    <phase>post-integration-test</phase>
                    <goals>
                        <goal>aggregate</goal>
                    </goals>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>
```

To create report type into terminal or command prompt:

```
mvn clean post-integration-test
```

Report can be found under:

```
test-app\target\site\serenity\index.html
```



 

## Built With

* [Serenity](http://www.thucydides.info/#/documentation) - The test framework used
* [Cucumber](https://cucumber.io/) - The test framework used
* [Maven](https://maven.apache.org/) - Dependency Management