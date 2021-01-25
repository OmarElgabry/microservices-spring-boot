FROM openjdk:8-jdk-alpine
MAINTAINER Ramazan Sakin <ramazansakin63@gmail.com>
ADD target/*.jar eureka-server-1.0-RELEASE.jar
EXPOSE 8761

ENTRYPOINT ["java", "-jar", "/eureka-server-1.0-RELEASE.jar"]