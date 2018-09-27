FROM java:8
VOLUME /tmp
ADD ./target/consul.jar /app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8502
ENTRYPOINT ["java","-jar","/app.jar"]