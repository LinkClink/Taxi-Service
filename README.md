# Taxi-Service

# Table of Contents
* [Project description](#description)
* [Project structure](#structure)
* [How to start?](#start)
* [Authors](#authors)

# <a name="description"></a>Project description
This is simple program for taxi service. The program uses mysql to store data. Tomcat is also used as a web-server Program has next functions:

* display all Drivers
* display all Cars
* display all Manufacturers
* create new Driver
* create new Car
* create new Manufacturer
* add driver to car
* all cars by driver

# 3-layer architecture
* DAO - Data access layer
* Service - Application layer
* Controllers - Presentation layer

The administrator can manage the user list and product list.

# <a name="structure"></a>Technologies
* Java 11
* Maven 4.0.0
* MavenCheckstyle 3.1.1
* Tomcat 9.0.58
* MySQL 8.0.22
* Servlet 4.0.1
* JSTL 1.2
* JDBC

# <a name="start"></a>How to start?
1. Configure Apache Tomcat for your IDE
2. Install MySQL and MySQL Workbench
3. Use `resources/init_db.sql` for creating a Schema and tables
4. Configure `ConnectionUtil.java` with your URL, `USERNAME`, `PASSWORD`, `JDBC_DRIVER`
5. Configure the tomcat library path in the startup settings

Enjoy!

# <a name="authors"></a>Authors
@LinkClink [telegram](https://t.me/linkclink)
