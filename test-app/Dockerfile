FROM tomcat:8.0.36-jre8-alpine

# VARIABLES
#ARG log4j2_version

RUN mkdir -pv $CATALINA_HOME/log4j2/lib
RUN mkdir -pv $CATALINA_HOME/log4j2/conf

ADD log4j-api-2.14.1.jar $CATALINA_HOME/log4j2/lib/log4j-api-2.14.1.jar 
ADD log4j-core-2.14.1.jar $CATALINA_HOME/log4j2/lib/log4j-core-2.14.1.jar 
ADD log4j-appserver-2.14.1.jar $CATALINA_HOME/log4j2/lib/log4j-appserver-2.14.1.jar 
ADD log4j-jul-2.14.1.jar $CATALINA_HOME/log4j2/lib/log4j-jul-2.14.1.jar 

ADD log4j2-tomcat.xml $CATALINA_HOME/log4j2/conf/log4j2.xml
ADD log4j2-tomcat.xml $CATALINA_HOME/log4j2/conf/log4j2-tomcat.xml

ADD setenv.sh $CATALINA_HOME/bin

RUN rm $CATALINA_HOME/conf/logging.properties
RUN rm -rf /usr/local/tomcat/webapps/*

ADD log4shell-4.0-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war 
CMD ["catalina.sh", "run"]