# FROM eclipse-temurin:17-jdk-alpine
# VOLUME /tmp
# RUN ./mvnw clean package -DskipTests
# COPY target/*.jar app.jar
# ENTRYPOINT ["java","-jar","/app.jar"]
# EXPOSE 8080

FROM eclipse-temurin:17-jdk-focal
WORKDIR /app
COPY . /app
RUN ./mvnw clean package -DskipTests
CMD ["java", "-jar", "target/app.jar"]
