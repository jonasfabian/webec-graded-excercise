FROM openjdk:16-alpine
ARG JAR_FILE=build/libs/kanban-backend-latest.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
