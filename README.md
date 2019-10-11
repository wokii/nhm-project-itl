# nhm-project-itl

## Getting Started

### Install dependent softwares
1.Use command 

```
docker run -u zap -p 8080:8080 -i owasp/zap2docker-stable zap.sh -daemon -host 0.0.0.0 -port 8080 -config api.addrs.addr.name=.* -config api.addrs.addr.regex=true -config api.key=<api-key>
```

to start the ZAP inside the docker container, remember to replace \<api-key\> with user specified api-key.


2.Install w3af by following steps
http://docs.w3af.org/en/latest/install.html.

Change "val W3AF_PATH" to the actual installation path of the server, inside 
nhm-project-itl/ic.ac.uk.itl.parent/ic.ac.uk.itl.web/src/ic/ac/uk/itl/web/ItlServiceDispatcher.xtend


### Build project and deploy
Use 
```
mvn clean verify
```
to build the project, then deploy the .war file inside "nhm-project-itl/ic.ac.uk.itl.parent/ic.ac.uk.itl.web/target/" to the tomcat server.



