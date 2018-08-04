FROM jeanblanchard/busybox-java:8
COPY target/hello.jar /app/hello.jar
#COPY etc /app/etc/
WORKDIR /app
ENTRYPOINT ["java","-jar","/app/hello.jar"]
