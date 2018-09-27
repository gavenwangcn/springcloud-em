FROM java:8
VOLUME /tmp
ADD ./target/feginconsul-1.0.0-SNAPSHOT.jar /app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8900
ENTRYPOINT ["java","-jar","/app.jar"]