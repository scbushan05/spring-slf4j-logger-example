# SLF4J Logger Example

A Simple Example on Configuring Logger using SLF4J in Spring MVC.

## Tools and Technologies

* JDK 1.8.0_121
* Eclipse Oxygen
* SLF4J 1.7.12
* Maven
* Spring 4.2.1.RELEASE

## Steps to Setup

**1. Clone the application**

```bash
git@github.com:scbushan05/spring-slf4j-logger-example.git
```

**2. Build and run the app using maven**

```bash
mvn package
```

After executing the application the `console output` and `D:/Logs/logger.log` file will look like as follows

```xml
2018-10-28 11:52:26,130 DEBUG [http-nio-8037-exec-2] org.springframework.web.servlet.DispatcherServlet DispatcherServlet with name 'spring' processing GET request for [/SpringMVCHibernateCRUDExample/]
2018-10-28 11:52:26,140 DEBUG [http-nio-8037-exec-2] org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping Looking up handler method for path /
2018-10-28 11:52:26,152 DEBUG [http-nio-8037-exec-2] org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping Returning handler method [public java.lang.String in.bushansirgur.controller.HomeController.homePage()]
2018-10-28 11:52:26,153 DEBUG [http-nio-8037-exec-2] org.springframework.beans.factory.support.DefaultListableBeanFactory Returning cached instance of singleton bean 'homeController'
2018-10-28 11:52:26,157 DEBUG [http-nio-8037-exec-2] org.springframework.web.servlet.DispatcherServlet Last-Modified value for [/SpringMVCHibernateCRUDExample/] is: -1
2018-10-28 11:52:26,227 INFO [http-nio-8037-exec-2] in.bushansirgur.controller.HomeController This is logger info::::::
2018-10-28 11:52:26,227 DEBUG [http-nio-8037-exec-2] in.bushansirgur.controller.HomeController This is logger debug:::::
2018-10-28 11:52:26,227 ERROR [http-nio-8037-exec-2] in.bushansirgur.controller.HomeController This is logger error    
```
## Learn more

You can find the tutorial for this application on my blog - 

</>
