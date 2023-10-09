# Java Maven Spring Basic App
You’ll create an application that provides the time of day and then build it with Maven.

To test the Maven installation, run mvn from the command-line:
mvn -v
To try out the build, issue the following at the command line:
mvn compile

Since it’s unlikely that you’ll want to distribute or work with .class files directly, you’ll probably want to run the package goal instead:
mvn package

The package goal will compile your Java code, run any tests, and finish by packaging the code up in a JAR file within the target directory. The name of the JAR file will be based on the project’s <artifactId> and <version>. For example, given the minimal pom.xml file from before, the JAR file will be named gs-maven-0.1.0.jar.

To execute the JAR file run:
java -jar target/gs-maven-0.1.0.jar

Maven also maintains a repository of dependencies on your local machine (usually in a .m2/repository directory in your home directory) for quick access to project dependencies. If you’d like to install your project’s JAR file to that local repository, then you should invoke the install goal:
mvn install

The install goal will compile, test, and package your project’s code and then copy it into the local dependency repository, ready for another project to reference it as a dependency.
