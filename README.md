# Microservices with Spring Boot
The source code for medium series of articles on Microservices with Spring Boot. 

The series of articles can be found below:
- [Microservices with Spring Boot — Intro to Microservices (Part 1)](https://medium.com/omarelgabrys-blog/microservices-with-spring-boot-intro-to-microservices-part-1-c0d24cd422c3)
- [Microservices with Spring Boot — Creating our Microserivces & Gateway (Part 2)](https://medium.com/omarelgabrys-blog/microservices-with-spring-boot-creating-our-microserivces-gateway-part-2-31f8aa6b215b)
- [Microservices with Spring Boot — Authentication with JWT (Part 3)](https://medium.com/omarelgabrys-blog/microservices-with-spring-boot-authentication-with-jwt-part-3-fafc9d7187e8)
- [Microservices with Spring Boot — Circuit Breaker & Log Tracing (Part 4)](https://medium.com/omarelgabrys-blog/microservices-with-spring-boot-circuit-breaker-log-tracing-part-4-9cdf5e898988)


## How to run
Note: open a terminal window for each directory (parent-project, spring-eureka-server/target, spring-eureka-zuul/target and spring-eureka-map/target).
Note: Wait for each run to complete before the starting the next, server must be loaded before zuul can start and zuul must be loaded before any following microservices can be run.
1. In directory 'parent-project'
2. Run 'mvn install on cmd line', this will build the eureka-server, zuul and map-service
3. In directory 'spring-eureka-server/target'
4. Run 'java -jar spring-eureka-server-0.0.1-SNAPSHOT.jar'
5. In directory 'spring-eureka-zuul/target'
6. Run 'java -jar spring-eureka-zuul-0.0.1-SNAPSHOT.jar'
7. In directory 'spring-eureka-map/target'
8. Run 'java -jar spring-eureka-map-0.0.1-SNAPSHOT.jar'
