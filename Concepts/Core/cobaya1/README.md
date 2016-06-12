#Lesson 1

##Agenda

``` bash
1. Origen
https://docs.oracle.com/javase/tutorial/java/concepts/interface.html
https://en.wikipedia.org/wiki/Enterprise_JavaBeans
https://en.wikipedia.org/wiki/Spring_Framework
2. Que es Spring
3. Alcance de Spring
http://www.tutorialspoint.com/spring/images/spring_architecture.png
4. Spring-core
5. Spring-context
http://docs.spring.io/spring/docs/current/spring-framework-reference/html/beans.html
6. Anotaciones
	@Configuration
	@ConstructorProperties
		Scope	Description
		singleton	(Default) Scopes a single bean definition to a single object instance per Spring IoC container.
		prototype	Scopes a single bean definition to any number of object instances.
		request	Scopes a single bean definition to the lifecycle of a single HTTP request; that is, each HTTP request has its own instance of a bean created off the back of a single bean definition. Only valid in the context of a web-aware SpringApplicationContext.
		session	Scopes a single bean definition to the lifecycle of an HTTPSession. Only valid in the context of a web-aware SpringApplicationContext.
		global session	Scopes a single bean definition to the lifecycle of a global HTTPSession. Typically only valid when used in a portlet context. Only valid in the context of a web-aware SpringApplicationContext.
		application	Scopes a single bean definition to the lifecycle of aServletContext. Only valid in the context of a web-aware SpringApplicationContext.
	@primary
	@qualifier
	@PostConstruct and @PreDestroy
```

# Exercise

``
Desarrolla una aplicacion en Spring que implemente el calculo de la circunferencia.
El calculo de la circunferencia es: C = D * pi
http://www.aaamatematicas.com/geo612x4.htm

Para la implmentacion, desarrolla un proyecto Java con Gradle
empleando Springs para la gestion de los Beans.

Beans a desarrollar:

Bean Calculator
Bean PiPRO (Ofrece una mayor precision del numero PI)
Bean PiCERT (Ofrece una rapida implementacion de PI)

Para la configuracion de los Beans, emplea una Clase Java.
```


# Popular questions:

3) What is the default scope of bean in Spring framework?
The default scope of bean is Singleton for Spring framework.
5) Is Singleton beans are thread safe in Spring Framework?
No, singleton beans are not thread-safe in Spring framework.
7) What is Bean Factory?
Bean Factory is core of the spring framework and, it is a Lightweight container which loads bean definitions and manages your beans. Beans are configured using XML file and manage singleton defined bean. It is also responsible for life cycle methods and injects dependencies. It also removes adhoc singletons and factories.
13) Define Application context module?
This is a very important module and supplies various necessary services like EJB integration, remoting, JNDI access and scheduling. It transforms spring into a framework. It also broadens the idea of BeanFactory by application of lifecycle events, providing support for internationalization messages and validation.
20) What are the methods of bean life cycle?
There are two important methods of Bean life cycle:
Setup – called when bean is loaded into container
Teardown – called when bean is unloaded into container
22) Differentiate between singleton and prototype bean?
Singleton means only one bean is defined per object instance while Prototype means one definition to more than one object instances in Spring.