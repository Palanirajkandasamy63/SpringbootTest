TO login to h2 console use 
change the application properties 
spring.application.name=SpringbootDemo
#logging.level.org.springframework=DEBUG
management.endpoints.web.exposure.include=*
spring.datasource.url=jdbc:h2:mem:testdb
and after this 
localhost:8080/h2/console
paste the jdbc url-->jdbc:h2:mem:testdb
then you can access it 


To add data in to values we can use/course/main/resource data.sql


