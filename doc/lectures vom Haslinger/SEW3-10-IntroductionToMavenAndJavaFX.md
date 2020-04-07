# An Introduction to Maven and JavaFX

*openjdk13 / maven / openjavafx13*

-----
## Prerequisites

1. Update `openjdk`:
   -. Open an elevated powershell console (as administrator).
   
   -  If `jdk13` is already installed, type:
   ```bash
   choco upgrade openjdk13 -y
   ```
   - Otherwise (fresh install of jdk13):
   ```bash
   choco install openjdk13 -y
   ```
2. Check environmental variables:
   - path: `\bin`-directory of `jdk13` before any other jdk
   - JAVA_HOME: set to `C:\Program Files\OpenJDK\jdk-13.x.x`

-----
## Maven[^1]

Maven is a simple **build automation and project management tool** with main focus on java projects. It aims to provide a complete build life cycle framework: 

- setup and monitor automated build process
- managing dependencies (plugins, jar files)
- source code compilation, provisioning
- generating reports (javadoc)
- testing (jUnit)
- artifact generation (jar, war)
- distribution and deployment

> **"Convention over configuration"** - configuration is very minimal.

---
### POM - Project Object Model

Basically every maven project consists of one configuration file called `pom.xml` located in the root directory of the maven project. It contains all the necessary information about the project build life cycle:

- Project name and version
- Dependencies
- Reporting
- Build profiles

*For Information on XML (eXtensible Markup Language) see for example <https://en.wikipedia.org/wiki/XML>.*

---
#### Pom.xml File Example

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>at.ac.litec</groupId>
    <artifactId>JavaFxDemo</artifactId>
    <version>1.0-SNAPSHOT</version>
    <dependencies>
        <dependency>
            <groupId>org.openjfx</groupId>
            <artifactId>javafx-controls</artifactId>
            <version>11.0.2</version>
        </dependency>
    </dependencies>
    <build>
        <plugins>
            <plugin>
                <groupId>org.openjfx</groupId>
                <artifactId>javafx-maven-plugin</artifactId>
                <version>0.0.1</version>
                <configuration>
                    <mainClass>at.ac.litec.App</mainClass>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>
```

A `pom.xml` will always start with a `<project>` root element within all other configurations are set up. Developers should at least define the below listed elements:

- `<groupId>`: unique id to define the organization.
- `<artifactId>`: name of the project.
- `<version>`: Version number and additional flags like 
  - `snapshot`: development version, no production code.
  - `fixed`: more or less a release version.

---
### Maven Repositories

A maven repository is a storage "place", where all kind of artifacts, jar files and other plugins are stored which might be needed to build a project. Necessary artifacts are automatically dowloaded by maven when for example a build cycle is performed. 
These repositories can be local (on the own machine), or remote (on another computer). The most common used remote repository is the Maven Central Repository (default).

---
### Maven Build Life Cycle

> A build life cycle is a sequence of steps in a defined order to execute the tasks and goals of a maven project. 

The following image shows the main phases of a build life cycle:

![Build Life Cycle](./_img/MavenLifeCycle.jpg)

> Whenever a maven command for a lifecycle phase is invoked, then maven executes also every phase above. For example:
>
> If  `mvn compile` is invoked, the following chain is executed: `clean -> validate -> compile`.

| Lifecycle Phase | Description                                                  |
| --------------- | ------------------------------------------------------------ |
| clean           | remove all previously generated files and artifacts.         |
| validate        | Validates and ensures that the project is fine  and perfect considering all the required information is made available  for the build. |
| compile         | Compilation of the project source code.                      |
| test            | Executing/running the tests using some suitable  test framework. Note: these test cases are not considered for packaging  and deploying. |
| package         | Packaging the successfully compiled and tested code to some distributable format - JAR, WAR, EAR. |
| verify          | Performs action for a quality check and ensures the required criteria being met. |
| install         | Installing the application in the local repository. Any other project can use this as a dependency. |
| site            | Generate the documentation for the project (javadoc).        |
| deploy          | The final package will be copied to a remote  repository, may be as a formal release and also made available to other developers. |

-----
### Additional Maven Information

- Plugins: <https://www.studytonight.com/maven/maven-plugins>
- Project example: <https://www.studytonight.com/maven/project-creation-in-maven>
- Build & test: <https://www.studytonight.com/maven/build-and-test-maven-project>
- Dependencies: <https://www.studytonight.com/maven/managing-external-dependency-in-maven>
- Build automation: <https://www.studytonight.com/maven/maven-build-automation>

-----
## JavaFX

We will start with the tutorial of openJavaFX: 
<https://openjfx.io/openjfx-docs/>
Especially the usage with Intellj:
<https://openjfx.io/openjfx-docs/#install-java>

More to follow...

-----
##### Sources

[^1]: [Apache Maven Tutorial](https://www.studytonight.com/maven/introduction-to-maven)


