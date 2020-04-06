FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} config.jar
ENTRYPOINT ["java","-jar","/config.jar"]