FROM openjdk:8-jdk-alpine
MAINTAINER Ramazan Sakin <ramazansakin63@gmail.com>
ADD target/gallery-service-1.0-RELEASE.jar gallery-service-1.0-RELEASE.jar
EXPOSE 8100

ENTRYPOINT ["java", "-Dspring.profiles.active=docker", "-jar", "/gallery-service-1.0-RELEASE.jar"]