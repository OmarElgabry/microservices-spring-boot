FROM openjdk:8-jdk-alpine
MAINTAINER Ramazan Sakin <ramazansakin63@gmail.com>
ADD target/image-service-1.0-RELEASE.jar image-service-1.0-RELEASE.jar
ENV SPR_PROFILE=""
ENV EUREKA_SERVER_URL=""
EXPOSE 8200

ENTRYPOINT ["java", "-Dspring.profiles.active=docker", "-jar", "/image-service-1.0-RELEASE.jar"]