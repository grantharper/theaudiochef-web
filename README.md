# Audio Chef Web


### Compilation
./gradlew bootRepackage

### Deployment
scp -i <pk> <jar-file> ec2-user@<ec2-ip>:/tmp/<jar-file>
ssh -i <pk> ec2-user@<ec2-ip>
cd /tmp
java -Dspring.profiles.active=<desired-profile> -jar <jar-file>
OR export SPRING_PROFILES_ACTIVE=<desired-profile>
java -jar <jar-file>


Example
scp -i "AWSGH.pem" /c/src/AudioChefJava/web/build/libs/theaudiochefweb-0.1.0.jar ec2-user@ec2-34-200-246-136.compute-1.amazonaws.com:/tmp/theaudiochefweb-0.1.0.jar

