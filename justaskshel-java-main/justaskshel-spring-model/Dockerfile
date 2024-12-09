# Stage 1: Build Stage
FROM eclipse-temurin:17-jdk AS build
WORKDIR /app

# Install Maven
RUN apt-get update && apt-get install -y maven
# Copy project files, including mvnw and pom.xml (for maven dependencies)
# COPY mvnw mvnw.cmd ./
# COPY .mvn .mvn
# COPY pom.xml ./

COPY justaskshel-spring-model/mvnw ./mvnw
COPY justaskshel-spring-model/mvnw.cmd ./mvnw.cmd
COPY justaskshel-spring-model/.mvn ./.mvn
COPY justaskshel-spring-model/pom.xml ./

# Give execute permission to mvnw and run the dependency offline command
RUN chmod +x mvnw && ./mvnw dependency:go-offline

# Copy the source code
COPY justaskshel-spring-model/src ./src

# Build the application and clean up Maven repository
RUN mvn clean package -DskipTests && rm -rf ~/.m2/repository

# Stage 2: Run Stage
FROM eclipse-temurin:17-jre
WORKDIR /app

# Copy the built JAR from the build stage
COPY --from=build /app/target/justaskshel-spring-model-1.0.0-SNAPSHOT.jar app.jar

# Create a non-root user and switch to it
RUN addgroup --system appgroup && adduser --system appuser --ingroup appgroup
USER appuser

# Expose the application port
EXPOSE 8081

# Add health check
HEALTHCHECK --interval=30s --timeout=5s --start-period=10s --retries=3 \
    CMD curl -f http://localhost:8081/actuator/health || exit 1

# Set the entrypoint to run the application
ENTRYPOINT ["java", "-jar", "app.jar", "--spring.profiles.active=${SPRING_PROFILE}"]
