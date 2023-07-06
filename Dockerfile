FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
RUN ./mvnw clean package -DskipTests
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080
