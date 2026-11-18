FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY ./target/*.jar hello-spring.jar

CMD [ "java", "-jar", "hello-spring.jar" ]

EXPOSE 8080
