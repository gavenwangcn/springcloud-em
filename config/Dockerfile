FROM java:8
VOLUME /tmp
ADD ./target/config-1.0.0-SNAPSHOT.jar /app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 4001
ENTRYPOINT ["java","-jar","/app.jar"]