FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/tareas-0.0.1-SNAPSHOT.jar tareas.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "tareas.jar"]