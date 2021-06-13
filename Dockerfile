FROM openjdk:8
ADD target/MicroServiceOne-0.0.1-SNAPSHOT.jar MicroServiceOne.jar
EXPOSE 2021
VOLUME /MyVolume
ADD . /MyVolume
ENTRYPOINT ["java", "-jar", "MicroServiceOne.jar"]