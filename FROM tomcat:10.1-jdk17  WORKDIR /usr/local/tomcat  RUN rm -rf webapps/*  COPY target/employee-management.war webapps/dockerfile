FROM tomcat:10.1-jdk17

WORKDIR /usr/local/tomcat

RUN rm -rf webapps/*

COPY target/employee-management.war webapps/employee-management.war

EXPOSE 8080

CMD ["catalina.sh", "run"]
