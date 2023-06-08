Requirements
For building and running the application you need:

* Make sure you are using JDK 1.8 and Maven 4.x
* You can build the project and run the tests by running ```mvn clean package```


Explore Rest APIs

Method	Url	Decription	Sample Valid Request Body
GET 	/search/ -  params {name,state} 

  Implemented   H2 in-memory datbase
  Change H2 database username and password below path
open src/main/resources/application.properties

 To view your H2 in-memory datbase
The 'test' profile runs on H2 in-memory database. To view and query the database you can browse to http://localhost:8090/h2-console. Default username is 'sa' with a blank password. Make sure you disable this in your production profiles. For more, see https://goo.gl/U8m62X

  Build and run the app using maven
  mvn spring-boot:run


