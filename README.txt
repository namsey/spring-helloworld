

This is the example project referred to in the Spring MVC 5 documentation, Hello World tutorial. See:  http://spring.io. 

To build the application's war file run mvn clean package from the project's root folder. 

The war file is created in the target sub-folder. 

Copy the war file to your Servlet container (e.g. Tomcat) and then startup the Servlet container. 

Or if you are using maven you can run command: mvn jetty:run

In a web browser go to:  http://localhost:8080/helloworld/index. 

You should see a web page with Welcome to Spring MVC 5!
