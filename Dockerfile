FROM eclipse-temurin:17-jdk-focal
WORKDIR /app
COPY . /app
RUN mvnw.cmd clean package -DskipTests
CMD ["java", "-jar", "target/app.jar"]