# Microservice One

Receives first name, last name and age in an HTTP GET request and returns the same info in plaintext.

- Running the service using Docker:

```bash
docker run -d -p 2019:2019 vismarkjuarez1994/microserviceone
```

- HHTP GET request:
```
http://localhost:2019/person?age=26&firstName=Vismark&lastName=Juarez
```

- HTTP Response:
```bash
Vismark Juarez: 26
```
