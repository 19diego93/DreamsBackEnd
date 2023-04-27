FROM eclipse-temurin:17-jdk-jammy
MAINTAINER DiegoVallejo
COPY target/argp2-0.0.1-SNAPSHOT.jar argp-app.jar
ENTRYPOINT ["java","-jar","/argp-app.jar"]
