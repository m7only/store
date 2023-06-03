FROM amazoncorretto:17-alpine-jdk
MAINTAINER m7only
COPY target/store-0.0.1-SNAPSHOT.jar store-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/store-0.0.1-SNAPSHOT.jar"]