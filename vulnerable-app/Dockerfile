FROM tomcat:8.0.36-jre8

RUN rm -rf /usr/local/tomcat/webapps/*
ADD log4shell-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war 
CMD ["catalina.sh", "run"]
