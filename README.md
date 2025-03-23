<p align="right">
    <a href="https://computesphere.com/"><img src="https://pepublicassets.blob.core.windows.net/public-assets/computesphere-favicon.svg" width="50px" /></a>
</p>

# ComputeSphere Java Spring Boot Example

This example deploys a Java - Spring Boot application to ComputeSphere.

> [!NOTE]
> This guide builds a Docker image for the provided sample code. Please note that the version `v0.0.1` used in the example is only for demonstration. You should replace it with a version that suits your specific setup and requirements.

## Prerequisites

- A [ComputeSphere](https://computesphere.com) account
- [Git](https://git-scm.com/downloads)
- JDK ([Oracle](https://www.oracle.com/ie/java/technologies/downloads/), [Amazon Corretto](https://aws.amazon.com/corretto/?filtered-posts.sort-by=item.additionalFields.createdDate&filtered-posts.sort-order=desc), [OpenJDK](https://openjdk.org/install/)) - To compile the project
- [Maven](https://maven.apache.org/download.cgi) or [Gradle](https://gradle.org/install/) - To build the project
- [Docker](https://docs.docker.com/engine/install/) - To create and deploy the image

## Setup

1. Clone this repository.

    ```bash
    git clone https://github.com/computesphere-samples/computesphere-java-springboot-example.git

    cd computesphere-java-springboot-example
    ```

1. Create the docker image.

    ```bash
    docker build -t computesphere-java-springboot-example:v.0.0.1 .
    ```

    Alternatively, you can use the `docker buildx --build` command to utilize Docker's BuildKit which offers several improvements over the traditional Docker build.
    
    ```bash
    docker buildx build --platform=linux/amd64 --tag computesphere-java-springboot-example:v0.0.1 .
    ``` 

3. Push the image to Docker Hub.

    ```bash
    docker tag computesphere-java-springboot-example:v0.0.1 [REPOSITORY]/computesphere-java-springboot-example:v0.0.1

    docker push [REPOSITORY]/computesphere-java-springboot-example:v0.0.1
    ```

> [!NOTE]
> Be sure to log in to Docker Hub and replace `[REPOSITORY]` with your Docker Hub username.

## Running the project locally

If you are using Maven,

```bash
cd computesphere-java-springboot-example

./mvnw spring-boot:run
```

If you are using Gradle,

```bash
cd computesphere-java-springboot-example

./gradlew bootRun
```

This runs the server on `localhost:8080`.

## Deploy to ComputeSphere

<!-- Add a link to the blog once published -->
See our [guide](https://docs.computesphere.com/docs/getting-started/quickstart/getting-started-with-java) on how to deploy this project to ComputeSphere.

<!-- Check if this is the right link to the dashboard -->
<a href="https://console.computesphere.com"> <img src="https://pepublicassets.blob.core.windows.net/public-assets/computesphere-full-logo.png" width="350px" alt="ComputeSphere Logo"> </a>

---
[Explore ComputeSphere Documentation](https://docs.computesphere.com)

**Contact Us:**  
[support@computesphere.com](mailto:support@computesphere.com)  
[Support Portal](https://support.computesphere.com/portal)

&copy; 2025 ComputeSphere LLC. All Rights Reserved.

---
