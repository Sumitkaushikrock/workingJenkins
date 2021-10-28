FROM gradle:7.2.0-jdk8 as build
WORKDIR /home/sumit
COPY ./ ./
RUN gradle clean build --no-daemon
FROM openjdk:8-jre-slim
WORKDIR /home/sumit:
RUN mkdir "apps"
COPY --from=build /home/sumit/build/libs/demo-0.0.1-SNAPSHOT.jar ./apps
CMD ["java","-jar","apps/demo-0.0.1-SNAPSHOT.jar"]


#FROM gradle:7.2.0-jdk8 as cache
#RUN mkdir -p /home/gradle/cache_home
#ENV GRADLE_USER_HOME /home/gradle/cache_home
#COPY build.gradle /home/gradle/java-code/
#WORKDIR /home/gradle/java-code
#RUN gradle clean build
#
#FROM gradle:7.2.0-jdk8 as builder
#COPY --from=cache /home/gradle/cache_home /home/gradle/.gradle
#WORKDIR /usr/src/java-code
#COPY ./ ./
#RUN gradle build
#
#FROM openjdk:8-jre-slim
#EXPOSE 8080
#USER root
#WORKDIR /usr/src/java-app
#COPY --from=builder /usr/src/java-code/build/libs/*.jar ./app.jar
#ENTRYPOINT ["java", "-jar", "app.jar"]