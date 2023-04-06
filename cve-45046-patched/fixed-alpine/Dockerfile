FROM tomcat:9.0.8-jre8-alpine

RUN mkdir -pv $CATALINA_HOME/log4j2/lib
RUN mkdir -pv $CATALINA_HOME/log4j2/conf


ADD ./libs/log4j-api-2.17.0.jar $CATALINA_HOME/log4j2/lib/log4j-api-2.17.0.jar 
ADD ./libs/log4j-core-2.17.0.jar $CATALINA_HOME/log4j2/lib/log4j-core-2.17.0.jar 
ADD ./libs/log4j-appserver-2.17.0.jar $CATALINA_HOME/log4j2/lib/log4j-appserver-2.17.0.jar 
ADD ./libs/log4j-jul-2.17.0.jar $CATALINA_HOME/log4j2/lib/log4j-jul-2.17.0.jar 


ADD log4j2-tomcat.xml $CATALINA_HOME/log4j2/conf/log4j2.xml

ADD setenv.sh $CATALINA_HOME/bin


RUN rm $CATALINA_HOME/conf/logging.properties
RUN rm -rf /usr/local/tomcat/webapps/*

ADD log4j-fixed.SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war 
CMD ["catalina.sh", "run"]
