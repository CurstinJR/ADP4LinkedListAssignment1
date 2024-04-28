# ADP4LinkedListAssignment1

## Overview
ADP4LinkedListAssignment1 is a Maven-based Java application designed to manage and display student records in a tabular format in the console. It includes functionalities to add student details along with their marks for four terms (T1 to T4) and calculate their final marks.

## Prerequisites
- Java JDK 11 or higher
- Maven 3.6.3 or higher

## Building the Application
To build the application, navigate to the project directory and run the following Maven command:
```bash
mvn clean install
```

## Running the Application
After building the application, you can run it using the following command:
```bash
java -jar target/ADP4LinkedListAssignment1-1.0-SNAPSHOT.jar
```

## Output Example
The application will display the student records in a table format in the console as shown below:

| Student Name | Student Number | Course | T1 | T2 | T3 | T4 | Final Mark |
| ------------ | -------------- | ------ | -- | -- | -- | -- | ---------- | 
| John Doe | 123456789 | Computer Science |	88.0 | 92.0 | 85.0 | 90.0 | 88.75 |
| Jane Smith | 987654321 | Mathematics | 78.0 | 81.0 | 75.0 | 80.0 | 78.5 |
