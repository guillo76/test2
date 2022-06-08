# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
FROM tomcat:9.0 

LABEL maintainer="@gestradah"

ADD demo-0.0.1-SNAPSHOT.jar /usr/local/tomcat/webapps/

EXPOSE 8080

CMD ["catalina.sh", "run"]