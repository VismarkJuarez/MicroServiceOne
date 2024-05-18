# FROM openjdk:8
# ADD target/MicroServiceOne-0.0.1-SNAPSHOT.jar MicroServiceOne.jar
# EXPOSE 2019
# VOLUME /MyVolume
# ADD . /MyVolume
# ENTRYPOINT ["java", "-jar", "MicroServiceOne.jar"]


# Below, we update the Dockerfile to include the newrelic agent
# at container start up.
# This allows New Relic to export metrics for the application.
# The "-Dnewrelic.config.app_name" flag also changes the name of the
# application.
FROM openjdk:8
ADD target/MicroServiceOne-0.0.1-SNAPSHOT.jar MicroServiceOne.jar
EXPOSE 2019
VOLUME /MyVolume
ADD . /MyVolume

ADD ./newrelic/newrelic.jar newrelic.jar
ADD ./newrelic/newrelic.yml newrelic.yml

ENTRYPOINT ["java", "-javaagent:newrelic.jar", "-Dnewrelic.config.app_name=MicroServiceOne-overridedName", "-jar", "MicroServiceOne.jar"]