# Product Management API

This Spring Boot application provides RESTful API endpoints for managing products.

## Getting Started

### Prerequisites

- [Java](https://www.oracle.com/java/technologies/javase-downloads.html) (version 8 or above)
- [Maven](https://maven.apache.org/download.cgi)

### Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/your-username/product-management.git
    cd product-management
    ```

2. Build the project:

    ```bash
    mvn clean install
    ```

3. Run the application:

    ```bash
    java -jar target/product-management.jar
    ```

The application will start on `http://localhost:8080`.

## API Endpoints

### Product Controller

- **Get All Products:**
  - **Endpoint:** `/product`
  - **Method:** GET
  - **Description:** Retrieve a list of all products.

- **Save a Product:**
  - **Endpoint:** `/product`
  - **Method:** POST
  - **Description:** Save a single product.

- **Save Multiple Products:**
  - **Endpoint:** `/product/all`
  - **Method:** POST
  - **Description:** Save multiple products at once.

- **Delete All Products:**
  - **Endpoint:** `/product`
  - **Method:** DELETE
  - **Description:** Delete all products.

- **Delete Product by ID:**
  - **Endpoint:** `/product/id/{id}`
  - **Method:** DELETE
  - **Description:** Delete a product by its ID.

- **Get Product by ID:**
  - **Endpoint:** `/product/id/{id}`
  - **Method:** GET
  - **Description:** Retrieve a product by its ID.

- **Update Product by ID:**
  - **Endpoint:** `/product/id/{id}`
  - **Method:** PUT
  - **Description:** Update a product by its ID.

## Usage

- Use your preferred API testing tool (e.g., Postman) to interact with the endpoints.
- Replace `{id}` with the actual product ID in the endpoint URLs.

## Contributing

1. Fork the repository.
2. Create a feature branch (`git checkout -b feature/new-feature`).
3. Commit your changes (`git commit -m 'Add new feature'`).
4. Push to the branch (`git push origin feature/new-feature`).
5. Open a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
