FROM openjdk:8-jdk-alpine
MAINTAINER Ramazan Sakin <ramazansakin63@gmail.com>
ADD target/auth-service-1.0-RELEASE.jar auth-service-1.0-RELEASE.jar
ENV SPR_PROFILE=""
ENV EUREKA_SERVER_URL=""
EXPOSE 9100

ENTRYPOINT ["java", "-Dspring.profiles.active=docker", "-jar", "/auth-service-1.0-RELEASE.jar"]