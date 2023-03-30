FROM tomcat:8.0.36-jre8-alpine

RUN mkdir -pv $CATALINA_HOME/log4j2/lib
RUN mkdir -pv $CATALINA_HOME/log4j2/conf

ADD log4j2.xml $CATALINA_HOME/log4j2/conf/log4j2.xml
ADD setenv.sh $CATALINA_HOME/bin

RUN rm -rf /usr/local/tomcat/webapps/*
ADD target/log4shell-app.war /usr/local/tomcat/webapps/ROOT.war 
ADD log4j2.xml $CATALINA_HOME/log4j2/conf/log4j2.xml
CMD ["catalina.sh", "run"]
