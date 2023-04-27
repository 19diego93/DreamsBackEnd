FROM amazoncorretto:8
MAINTAINER DiegoVallejo
COPY target/argp2-0.0.1-SNAPSHOT.jar argp-app.jar
ENTRYPOINT ["java","-jar","/argp-app.jar"]
