1. Dependencies: Java, Maven, Spring Boot, Postgres, Swagger, Lombok, Hibernate, HTML, CSS, TypeScript, Angular 9.

2. Data Schemas: Problem and Explore are the two main data schemas shared across the backend files. They define the structure of the data in the Postgres database.

3. Function Names: In the service and controller files, there will be functions like getProblem(), getExplore(), addProblem(), addExplore(), updateProblem(), updateExplore(), deleteProblem(), deleteExplore() etc. These functions will be used to perform CRUD operations on the Problem and Explore data.

4. Message Names: Messages like "Problem added successfully", "Explore updated successfully" etc. will be used across the backend files to indicate the status of the operations.

5. Exported Variables: In the frontend, the AppComponent, ProblemsComponent, and ExploreComponent will be exported and used in the AppModule. The ProblemService and ExploreService will also be exported and used in their respective components.

6. ID Names of DOM Elements: In the frontend HTML files, there will be id names for various DOM elements like "problem-list", "explore-list", "add-problem", "add-explore", "update-problem", "update-explore", "delete-problem", "delete-explore" etc. These id names will be used in the TypeScript files to manipulate the DOM elements.

7. Package.json: This file in the frontend directory will contain the list of all the npm packages required for the frontend application.

8. Angular.json: This file in the frontend directory will contain the configuration for the Angular application.

9. application.properties: This file in the backend directory will contain the configuration for the Spring Boot application.

10. pom.xml: This file in the backend directory will contain the list of all the Maven dependencies required for the backend application.

11. V1__Initial_schema.sql: This file in the backend directory will contain the initial schema for the Postgres database.

12. README.md: This file in the frontend directory will contain the instructions on how to open the code, install node modules, and run the application.