# springmvc-excel-frontend


checkout the python project first 

```shell
python excel_to_database.py   
```

This will create the database and populate it with data from the excel file.

Then you can run the spring boot project

```shell
mvn clean install
```

Then run the application

```shell
mvn spring-boot:run
```

Then you can access the application at `http://localhost:8080/invoices/view?page=8&size=25&sortBy=id` and see the records which are present int the database.



