# Stage 1: Build Stage
FROM eclipse-temurin:17-jdk AS build
WORKDIR /app

# Copy only pom.xml first to leverage Docker cache
COPY pom.xml .
RUN ./mvnw dependency:go-offline

# Copy the source code
COPY justaskshel-spring-services/src ./src


# Build the application and clean up Maven repository
RUN mvn clean package -DskipTests && rm -rf ~/.m2/repository

# Stage 2: Run Stage
FROM eclipse-temurin:17-jre
WORKDIR /app

# Copy the built JAR from the build stage
COPY --from=build /app/target/justaskshel-spring-services-0.0.1-SNAPSHOT.jar app.jar

# Create a non-root user and switch to it
RUN addgroup --system appgroup && adduser --system appuser --ingroup appgroup
USER appuser

# Expose the application port
EXPOSE 8082

# Add health check
HEALTHCHECK --interval=30s --timeout=5s --start-period=10s --retries=3 \
    CMD curl -f http://localhost:8082/actuator/health || exit 1

# Set the entrypoint to run the application
ENTRYPOINT ["java", "-jar", "app.jar", "--spring.profiles.active=${SPRING_PROFILE}"]
