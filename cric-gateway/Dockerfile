# For Java 8
FROM openjdk:8-jdk-alpine

# server target
ARG JAR_FILE=target/*.jar

# working dir for docker 
WORKDIR /opt/app

# copy jar
COPY ${JAR_FILE} cric-gateway.jar

# java -jar /opt/app/dummy-eureka.jar
ENTRYPOINT ["java","-jar","cric-gateway.jar"]