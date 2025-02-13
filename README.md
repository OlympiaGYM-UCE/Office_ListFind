# Office List

A Spring Boot application for managing office data using PostgreSQL database.

## Technologies Used

- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven

## Prerequisites

Before running this application, make sure you have:

- Java JDK 11 or higher
- Maven
- PostgreSQL database server

## Configuration

The application is configured to connect to a PostgreSQL database with the following properties:

```properties
spring.datasource.url=jdbc:postgresql://3.211.181.243:5432/olympia
spring.datasource.username=chris
```

## Setup Instructions

1. Clone the repository:
```bash
git clone https://github.com/OlympiaGYM-UCE/Office_Save.git
```

2. Navigate to the project directory:
```bash
cd Office_Save
```

3. Update the database configuration in `src/main/resources/application.properties` if needed

4. Build the project:
```bash
mvn clean install
```

5. Run the application:
```bash
mvn spring-boot:run
```

## Project Structure

```
Office_Save/
├── src/
│   ├── main/
│   │   ├── java/com/gym/olympia/
│   │   └── resources/
│   └── test/
├── .gitignore
├── Dockerfile
├── mvnw
├── mvnw.cmd
└── pom.xml
```

## Features

- Database integration with PostgreSQL
- JPA/Hibernate configuration
- RESTful API endpoints (details to be added)

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details

## Contact

- Project Link: https://github.com/OlympiaGYM-UCE/Office_ListFind
