<strong> **DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>
# WESTERN GOVERNOR UNIVERSITY 
## D288 – BACK-END PROGRAMMING
Welcome to Back-End Programming! This is an opportunity for students to develop object-oriented applications that can be integrated with relational databases, write code for object-oriented applications using Spring framework, and implements design patterns for object-oriented applications. 
FOR SPECIFIC TASK INSTRUCTIONS AND REQUIREMENTS FOR THIS ASSESSMENT, PLEASE REFER TO THE COURSE PAGE.
## BASIC INSTRUCTIONS
For this project, you will be building your project using IntelliJ IDEA (Ultimate Edition) in a WGU-provided lab environment. You will be working with an existing MySQL database and Angular front-end, which are supplied for you in the lab environment. You will share this project to a private external GitLab repository and backup regularly. If you wish to work on it on your local machine, you will also need to download the Angular front-end application and create your own MySQL database. Use the links on your course page to install the integrated development environments (IDE), MySQL WorkBench, and IntelliJ IDEA, and pull the project from the lab environment.  


## SUPPLEMENTAL RESOURCES  
1.	How to clone a project to IntelliJ using Git?

> Ensure that you have Git installed on your system and that IntelliJ is installed using [Toolbox](https://www.jetbrains.com/toolbox-app/). Make sure that you are using version 2022.3.2. Once this has been confirmed, click the clone button and use the 'IntelliJ IDEA (HTTPS)' button. This will open IntelliJ with a prompt to clone the proejct. Save it in a safe location for the directory and press clone. IntelliJ will prompt you for your credentials. Enter in your WGU Credentials and the project will be cloned onto your local machine.  

2. How to create a branch and start Development?

- GitLab method
> Press the '+' button located near your branch name. In the dropdown list, press the 'New branch' button. This will allow you to create a name for your branch. Once the branch has been named, you can select 'Create Branch' to push the branch to your repository.

- IntelliJ method
> In IntelliJ, Go to the 'Git' button on the top toolbar. Select the new branch option and create a name for the branch. Make sure checkout branch is selected and press create. You can now add a commit message and push the new branch to the local repo.

## SUPPORT
If you need additional support, please navigate to the course page and reach out to your course instructor.
## FUTURE USE
Take this opportunity to create or add to a simple resume portfolio to highlight and showcase your work for future use in career search, experience, and education!

## Rubric Sections
This section will be used to annotate what changes were made as a supplement to the repository graph history.
Changes will be made in numerical order with the following format: file(s) changed/added, lines affected/added, changes/additions made.

C.  Construct four new packages, one for each of the following: controllers, entities, dao, and services. 
The packages will need to be used for a checkout form and vacations packages list.

Note: The packages should be on the same level of the hierarchy.

Note: Construct a package named config and copy the RestDataConfig.java provided in the laboratory environment to the package. Modify it so that the package and imports have the correct package and import addresses. Copy the application.properties file that is provided in the laboratory environment into your application properties resource file.
1) Create 5 packages: config, controllers, dao, entities, and services.
2) Update config package: Add RestDataConfig.java file to config package.
3) Update application.properties: Add data to application.properties file.
4) Create Cart_items class in entities package: class reflects cart_items table and its respective columns in SQL database.
5) Create Carts class in entities package: class reflects cart_items table and its respective columns in SQL database.
6) Create Countries class in entities package: class reflects cart_items table and its respective columns in SQL database.
7) Create Customers class in entities package: class reflects cart_items table and its respective columns in SQL database.
8) Create Divisions class in entities package: class reflects cart_items table and its respective columns in SQL database.
9) Create Excursions class in entities package: class reflects cart_items table and its respective columns in SQL database.
10) Create Vacations class in entities package: class reflects cart_items table and its respective columns in SQL database.

D.  Write code for the entities package that includes entity classes and the enum designed to match the UML diagram.

1) Carts.java, lines 55-63: Added OneToMany and ManyToOne relationships between tables and classes.
2) Cart_items.java, lines 39-54: Added OneToMany and ManyToOne relationships between tables and classes.
3) Vacations.java, lines 45-52: Added OneToMany and ManyToOne relationships between tables and classes.
4) Excursions.java, lines 45-53: Added ManyToMany and ManyToOne relationships between tables and classes.
5) Customers.java, lines 50-58: Added OneToMany and ManyToOne relationships between tables and classes.
6) Divisions.java, lines 38-46: Added OneToMany and ManyToOne relationships between tables and classes.
7) Countries.java, lines 37-39: Added OneToMany relationships between tables and classes.
8) RestDataConfig.java, lines 3, 37-41: Changed import address and physical addresses.
9) Carts.java, lines 38-42: Added enum designed to match the UML diagram and SQL database.

E.  Write code for the dao package that includes repository interfaces for the entities that extend JpaRepository, and add cross-origin support.
1) Create Cart_itemsRepository.java interface in dao package.
2) Create CartsRepository.java interface in dao package.
3) Create CountriesRepository.java interface in dao package.
4) Create CustomersRepository.java interface in dao package.
5) Create DivisionsRepository.java interface in dao package.
6) Create ExcursionsRepository.java interface in dao package.
7) Create VacationsRepository.java interface in dao package.





F.  Write code for the services package that includes each of the following:

•   a purchase data class with a customer cart and a set of cart items

•   a purchase response data class that contains an order tracking number

•   a checkout service interface

•   a checkout service implementation class


G.  Write code to include validation to enforce the inputs needed by the Angular front-end.


H.  Write code for the controllers package that includes a REST controller checkout controller class with a post mapping to place orders.

Note: You do not need to duplicate REST functionality for each repository by creating methods in Java.


I.  Add five sample customers to the application programmatically.


Note: Make sure the customer information is not overwritten each time you run the application.
