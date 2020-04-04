# For Java 8
FROM openjdk:8-jdk-alpine

# server target
ARG JAR_FILE=target/*.jar

# working dir for docker 
WORKDIR /opt/app

# copy jar
COPY ${JAR_FILE} cric-registry.jar

# java -jar /opt/app/cric-registry.jar
ENTRYPOINT ["java","-jar","cric-registry.jar"]
