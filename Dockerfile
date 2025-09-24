# Use a secure and official base image with Java 17
FROM eclipse-temurin:21-jdk-jammy

# Set the working directory inside the container
WORKDIR /app

# Copy the executable JAR file built by Maven into the container
COPY target/Sistema-Mesa-Ayuda-TI-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that the Spring Boot application listens on
EXPOSE 8080

# The command to run the application when the container starts
ENTRYPOINT ["java", "-jar", "app.jar"]