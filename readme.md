# Live coding app
 - add oracle dependency
	<dependency>
			<groupId>com.oracle</groupId>
			<artifactId>ojdbc6</artifactId>
			<version>11.2.0.3</version>
		</dependency>
  - install locally
  
	mvn install:install-file -Dfile="C:\Users\LENOVO\Downloads\ojdbc6-11.2.0.3.jar" -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=11.2.0.3 -Dpackaging=jar -DgeneratePom=true
