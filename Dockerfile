# Use the official OpenJDK 21 image as the base image
FROM openjdk:21-jdk

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8180 available to the world outside this container
EXPOSE 8180

# The application's jar file
ARG JAR_FILE=target/*.jar

# Add the application's jar to the container
ADD ${JAR_FILE} app.jar

# Run the jar file
ENTRYPOINT ["java","-jar","/app.jar"]