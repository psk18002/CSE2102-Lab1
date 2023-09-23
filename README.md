# CSE2102-Lab1

Download and install Maven via UNIX:

	sudo dnf install maven

Check the version of Maven for compatability to run tests:

  	mvn --v

Verify Maven version info as the following in the terminal:

	Apache Maven 3.5.4 (Red Hat 3.5.4-5)
 	Maven home: /usr/share/maven
	Java version: 1.8.0_382, vendor: Red Hat, Inc., runtime:
 	/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.382.b05-2.el8.x86_64/jre
	Default locale: en_US, platform encoding: UTF-8
 	OS name: "linux", version: "4.18.0-477.21.1.el8_8.x86_64", arch:
	"amd64", family: "unix"

Generate a Maven archetype:

	mvn archetype:generate
	-DgroupId=com.mycompany.app
	-DartifactId=my-app
	-DarchetypeArtifactId=maven-archetype-quickstart
	-DarchetypeVersion=1.4 -DinteractiveMode=false

Download TestMe.java and TestMeTests.java from current repo.
Within the created archetype, move TestMe.java and TestMeTests.java to directories 

	./my-app/src/main/java/com/mycompany/app 
 and
 
	./my-app/src/test/java/com/mycompany/app 
respectively.

Return to terminal and navigate to 'my-app' directory.
Compile and execute TestMe.java and TestMeTests.java via Maven:
  
	mvn compile
	mvn exec:java -Dexec.mainClass="com.mycompany.app.TestMe"
	mvn test
