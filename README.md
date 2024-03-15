# Getting Started

This is spring boot starter example to integrate Spring web controller that connects to postgres database to read and write data using Spring-JPA module.

This example has integrations of following spring modules
1. Spring Boot
2. Spring Web module
3. Spring JPA


@SpringBootApplication is a convenience annotation that adds all of the following:

@Configuration: Tags the class as a source of bean definitions for the application context.

@EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings. For example, if spring-webmvc is on the classpath, this annotation flags the application as a web application and activates key behaviors, such as setting up a DispatcherServlet.

@ComponentScan: Tells Spring to look for other components, configurations, and services in the com/example package, letting it find the controllers.

The main() method uses Spring Boot’s SpringApplication.run() method to launch an application. Did you notice that there was not a single line of XML? There is no web.xml file, either. This web application is 100% pure Java and you did not have to deal with configuring any plumbing or infrastructure.

### Build an executable JAR

You can run the application from the command line Maven. You can also build a single executable JAR file that contains all the necessary dependencies, classes, and resources and run that. Building an executable jar makes it easy to ship, version, and deploy the service as an application throughout the development lifecycle, across different environments, and so forth.


If you use Maven, you can run the application by using **./mvnw spring-boot:run** 

Alternatively, you can build the JAR file with **./mvnw clean package** and then run the JAR file, as follows:

**java -jar target/SpringPostgres-0.0.1-SNAPSHOT.jar**

The steps described here create a runnable JAR. You can also build a classic WAR file.
When you run the application, logging output is displayed. The service should be up and running within a few seconds.

### **Test the Application**

Now that the application is running, you can test it by using curl or some similar tool. You have two HTTP endpoints that you can test:

GET localhost:8080/demo/all: Gets all data. POST localhost:8080/demo/add: Adds one user to the data.

The following curl command adds a user:

$ curl http://localhost:8080/demo/add -d name=First -d email=someemail@someemailprovider.com
The reply should be as follows:

Saved
The following command shows all the users:

$ curl http://localhost:8080/demo/all
The reply should be as follows:

[{"id":1,"name":"First","email":"someemail@someemailprovider.com"}]

### Reference Documentation
For further reference, please consider the following sections:

https://spring.io/guides/gs/accessing-data-mysql

