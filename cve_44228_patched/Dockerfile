FROM tomcat:8.0.36-jre8-alpine

RUN rm -rf /usr/local/tomcat/webapps/*
ADD target/log4shell-app.war /usr/local/tomcat/webapps/ROOT.war 
CMD ["catalina.sh", "run"]
