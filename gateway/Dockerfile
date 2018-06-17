from anapsix/alpine-java
ADD ./build/libs/sc-gateway-0.0.1.jar app.jar
EXPOSE 9000
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=docker,native","-jar","/app.jar"]