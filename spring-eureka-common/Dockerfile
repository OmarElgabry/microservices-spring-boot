FROM openjdk:8-jdk-alpine
MAINTAINER Ramazan Sakin <ramazansakin63@gmail.com>
ADD target/common-service-1.0-RELEASE.jar common-service-1.0-RELEASE.jar
ENV SPR_PROFILE=""
ENV EUREKA_SERVER_URL=""
EXPOSE 9200

ENTRYPOINT ["java", "-Dspring.profiles.active=docker", "-jar", "/common-service-1.0-RELEASE.jar"]