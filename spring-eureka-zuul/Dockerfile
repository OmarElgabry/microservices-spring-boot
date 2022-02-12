FROM openjdk:8-jdk-alpine
MAINTAINER Ramazan Sakin <ramazansakin63@gmail.com>
ADD target/zuul-gateway-service-1.0-RELEASE.jar zuul-gateway-service-1.0-RELEASE.jar
ENV SPR_PROFILE=""
ENV EUREKA_SERVER_URL=""
EXPOSE 8762

ENTRYPOINT ["java", "-Dspring.profiles.active=docker", "-jar", "/zuul-gateway-service-1.0-RELEASE.jar"]