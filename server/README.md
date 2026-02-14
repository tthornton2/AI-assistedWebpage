# Email Preferences Test Server

This is a minimal Spring Boot server that accepts POSTs at `/preferences` and returns a JSON acknowledgement. It's CORS-enabled for local testing.

Prerequisites:
- Java 17 JDK
- Maven

Run locally:

```bash
cd server
mvn spring-boot:run
```

The endpoint will be available at `http://localhost:8080/preferences` and accepts form submissions (application/x-www-form-urlencoded).
