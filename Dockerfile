FROM openjdk:8-jdk-alpine
MAINTAINER DiegoVallejo
COPY target/argp2-0.0.1-SNAPSHOT.jar argp-app.jar
ENTRYPOINT ["java","-jar","/argp-app.jar"]
