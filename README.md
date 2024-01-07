# Microservice One

Receives first name, last name and age in an HTTP GET request and returns the same info in plaintext.

- Running the service using Docker:

```bash
docker run -d -p 2019:2019 vismarkjuarez1994/microserviceone
```

- HHTP GET request:
```
http://localhost:2019/person?age=28&firstName=Vismark&lastName=Juarez
```

- HTTP Response:
```bash
Vismark Juarez: 28
```

## Packaging the Application

To package this application, simply run the following commands in the root same directory where the `Dockerfile` is located:

```bash
docker build -t microservice-one .
```

```bash
docker tag microservice-one {desired-repository:desired-version}
```

For example: 
```bash
docker tag microservice-one mcd.jfrog.io/digital-docker/core-java-mesh-container-java-mesh-kramsiv:ms
```

Finally, push the tagged image:
```bash
docker push mcd.jfrog.io/digital-docker/core-java-mesh-container-java-mesh-kramsiv:ms
```
