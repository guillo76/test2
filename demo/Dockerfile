# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
FROM openjdk:13-jdk-alpine3.10

LABEL maintainer="@gestradah"

ENV execpath /usr/src/myapp
ENV jar demo-0.0.1-SNAPSHOT.jar
ENV port 8080 

COPY $jav .

EXPOSE $port

CMD ["catalina.sh", "run"]
