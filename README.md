<p align="right">
    <img src="https://raw.githubusercontent.com/computesphere-samples/computesphere-nodejs-example/main/public/assets/logo.svg?token=GHSAT0AAAAAACOBHNZG3TPBPC74TUMV4MGUZSTITBA" width="50px" />
</p>

# ComputeSphere Java Spring Boot Example

This example deploys a Java - Spring Boot application to ComputeSphere.

> [!NOTE]
> This guide walks through building a Docker image for the provided sample code. Please note that the version `v0.0.1` used in the example is for demonstration purposes only. You should replace it with a version that suits your specific setup and requirements.

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

    Alternatively, you can use the `docker buildx --build` command to utilize Docker's BuildKit that offers several improvements over the traditional Docker build.
    
    ```bash
    docker buildx build --platform=linux/amd64 --tag computesphere-java-springboot-example:v0.0.1 .
    ``` 

3. Push the image to Docker Hub.

    ```bash
    docker tag computesphere-java-springboot-example:v0.0.1 [REPOSITORY]/computesphere-java-springboot-example:v0.0.1

    docker push [REPOSITORY]/computesphere-java-springboot-example:v0.0.1
    ```

> [!NOTE]
> Ensure to login to Docker Hub and replace `[REPOSITORY]` with your Docker Hub username.

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

This runs the server on `localhost:3000`.

## Deploy to ComputeSphere

<!-- Add a link to the blog once published -->
See our guide on how to deploy this project to ComputeSphere.

<!-- Check if this is the right link to the dashboard -->
<a href="https://console.computesphere.com"> <img src="https://perizer.com/wp-content/uploads/2024/01/Group-1-1.png" alt="ComputeSphere Logo"> </a>

---
[Explore ComputeSphere Documentation](https://docs.computesphere.com)

**Contact Us:**  
[support@computesphere.com](mailto:support@computesphere.com)  
[Support Portal](https://support.computesphere.com/portal)

&copy; 2024 ComputeSphere LLC. All Rights Reserved.

---
