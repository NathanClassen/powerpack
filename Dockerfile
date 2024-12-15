FROM maven:3.9.9-amazoncorretto-17

WORKDIR /app

COPY . /app

RUN mvn package

ENTRYPOINT ["java", "-jar", "target/PowerPack-1.0.jar"]

CMD []