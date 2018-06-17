from anapsix/alpine-java
ADD ./build/libs/sc-registry-0.0.1.jar app.jar
EXPOSE 9001
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=docker,native","-jar","/app.jar"]