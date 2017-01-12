FROM java:8
EXPOSE 8080
ADD /target/flight-service.jar flight-service.jar
ENTRYPOINT ["java","-jar","flight-service.jar"]

