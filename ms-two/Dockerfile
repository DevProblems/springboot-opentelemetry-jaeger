FROM openjdk:17-jdk-slim
WORKDIR /app
COPY /target/*.jar main.jar
ADD https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/latest/download/opentelemetry-javaagent.jar .
ENV JAVA_TOOL_OPTIONS "-javaagent:./opentelemetry-javaagent.jar"
CMD ["java", "-jar", "main.jar"]