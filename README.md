*	This project is made with Java 8. Make sure you have Java 8 and MySQL server installed.

*	MySQL server should be up and running.

*	Create a schema named liv2train.

*	Open the file "application.properties" in "Liv2Train/src/main/resources".

*	Enter your MySQL credentials in the fields "spring.datasource.username" and "spring.datasource.password".

*	Open this project in a spring-supported IDE and run it.
		To run this project in a linux terminal, change the directory to "Liv2Train" and enter:
   	./mvnw spring-boot:run

*	The APIs are "/create" for POST, and "/view" and "/view/<centreCode>" for GET. The JSON format is: <br>
    {<br>
      "centreCode": "CENTRE123456",<br>
      "centreName": "Senpiper",<br>
      "address": {<br>
          &nbsp;&nbsp;"detailedAddress": "Sector 32",<br>
          &nbsp;&nbsp;"city": "Gurgaon",<br>
          &nbsp;&nbsp;"state": "Haryana",<br>
          &nbsp;&nbsp;"pincode": "122001"<br>
      &nbsp;&nbsp;},<br>
      "studentCapacity": 50,<br>
      "coursesOffered": ["Data Science", "Blockchain"],<br>
      "contactEmail": "xyz@yahoo.com",<br>
      "contactPhone": "9876543210"<br>
    }
