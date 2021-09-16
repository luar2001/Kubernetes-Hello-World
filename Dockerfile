FROM adoptopenjdk/openjdk16

EXPOSE 8080


ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} hello.jar

ENTRYPOINT ["java","-jar","/hello.jar"]