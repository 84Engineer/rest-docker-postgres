FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
LABEL author="Alex Lysenko"
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]