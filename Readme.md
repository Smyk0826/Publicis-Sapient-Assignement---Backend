# SapientsTest Application

## How to Run

1. **Clone the repository:**
    ```bash
    git clone <repository-url>
    cd sapientsTest
    ```

2. **Build the project:**
    ```bash
    ./mvnw clean install
    ```
    or, if you have Maven installed:
    ```bash
    mvn clean install
    ```

3. **Run the application:**
    ```bash
    ./mvnw spring-boot:run
    ```
    or
    ```bash
    mvn spring-boot:run
    ```
    The server will start on the default port (e.g., `http://localhost:8080`).

## API Endpoints

| Method | Endpoint           | Description                                 |
|--------|--------------------|---------------------------------------------|
| GET    | `/api/items`       | Retrieves a list of all items.              |
| GET    | `/api/items/{id}`  | Retrieves details of a specific item by ID. |
| POST   | `/api/items`       | Creates a new item.                         |
| PUT    | `/api/items/{id}`  | Updates an existing item by ID.             |
| DELETE | `/api/items/{id}`  | Deletes an item by ID.                      |

> Replace `items` with your actual resource name if different.

## Notes

- Ensure Java (JDK 17 or above) and Maven are installed, or use the provided Maven Wrapper (`mvnw`).
- Update environment variables as needed in `application.properties` or `application.yml`.
- For more details, refer to the source code and comments.

