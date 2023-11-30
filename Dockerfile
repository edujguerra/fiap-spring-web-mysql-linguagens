FROM openjdk:17-jdk-alpine
COPY /target/linguagens-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java","-jar","linguagens-0.0.1-SNAPSHOT.jar"]

#FROM openjdk:17-jdk-alpine
#WORKDIR "/home"
#COPY . .
#RUN apk add maven
#WORKDIR "home/demo"
#RUN mvn clean package
#EXPOSE 8080
#CMD ["java","-jar","linguagens-0.0.1-SNAPSHOT.jar"]

