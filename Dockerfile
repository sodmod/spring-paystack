FROM openjdk:19-jdk-alpine
EXPOSE 8021
LABEL maintainer="badmussodiq"
ADD target/paystack-0.0.1-SNAPSHOT.jar paystack.jar
ENTRYPOINT ["java", "-jar", "/paystack.jar"]