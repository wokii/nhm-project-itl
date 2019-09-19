# nhm-project-itl

## Getting Started

use 
```
mvn clean verify
```
to build the project, then deploy the .war file inside "nhm-project-itl/ic.ac.uk.itl.parent/ic.ac.uk.itl.web/target/" in the tomcat server.


using command 

```
docker run -u zap -p 8080:8080 -i owasp/zap2docker-stable zap.sh -daemon -host 0.0.0.0 -port 8080 -config api.addrs.addr.name=.* -config api.addrs.addr.regex=true -config api.key=<api-key>
```

to start the ZAP inside the docker container, remember to replace \<api-key\> with user specified api-key.

