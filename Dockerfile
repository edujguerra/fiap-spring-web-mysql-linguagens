FROM openjdk:17-jdk-alpine
COPY /target/linguagens-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java","-jar","linguagens-0.0.1-SNAPSHOT.jar"]
