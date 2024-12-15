FROM maven:3.9.9-amazoncorretto-17

WORKDIR /app

COPY . /app

RUN mvn package

ENTRYPOINT ["java", "-jar", "target/PowerReviewBackpack-1.0-SNAPSHOT.jar"]

CMD []