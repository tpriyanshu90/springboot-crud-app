# Spring boot CRUD App

Spring Boot Rest CRUD API application shows the basic CRUD functionalities using Hibernate, JPA, and Spring Data JPA to interact with MySQL database.


## Pre-requisites

1. Set up MySQL database on your machine. You can follow this digitalOcean [guide](https://www.digitalocean.com/community/tutorials/how-to-install-mysql-on-ubuntu-20-04)

2. JDK 11 installation. Digital Ocean [guide](https://www.digitalocean.com/community/tutorials/how-to-install-java-with-apt-on-ubuntu-20-04)

## How to begin?

1. Clone the repo
2. Open the repo in eclipse ocean Java EE IDE
3. Update the username and password of your database in file:
`/cruddemo/src/main/resources/application.properties`
4. Paste and run the `employee.sql` file in [MySQL workbench](https://dev.mysql.com/downloads/workbench/) to setup the employee table
4. Run the CruddemoApplication.java file as a **Java Application**
5. Application will run on [http://localhost:8080](http://localhost:8080)

## Extras
1. You can download [Postman](https://www.postman.com/downloads/) to access various routes