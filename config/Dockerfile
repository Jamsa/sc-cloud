from anapsix/alpine-java
ADD ./build/libs/sc-config-0.0.1.jar app.jar
VOLUME /Users/zhujie/Documents/devel/Java/sc-cloud/support/config
#RUN mkdir -p /Users/zhujie/Documents/devel/Java/sc-cloud/support/config
#ADD ./docker/config /Users/zhujie/Documents/devel/Java/sc-cloud/support/config
EXPOSE 9002
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=docker,native","-jar","/app.jar"]