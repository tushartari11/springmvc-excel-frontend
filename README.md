# springmvc-excel-frontend


checkout the python project first 

```shell
python excel_to_database.py   
```

This will create the database and populate it with data from the excel file.

## Running the Spring Boot Application

## Prerequisites
Java 11 or higher
Maven
Docker (for running the database and Redis in a container)

## Steps to Run the Application
1: Clone the repository

```shell

git clone https://github.com/tushartari11/springmvc-excel-frontend.git
cd springmvc-excel-frontend
```
2: Run the database and Redis using Docker Compose
```shell
docker-compose up -d
```
3: Build the Spring Boot application

```shell
mvn clean install
```

Then run the application

```shell
mvn spring-boot:run
```

Then you can access the application at `http://localhost:8080/invoices/view?page=8&size=25&sortBy=id` and see the records which are present int the database.



