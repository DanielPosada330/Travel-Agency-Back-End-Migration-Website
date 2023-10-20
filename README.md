## Travel Agency Back-End Migration Website
The purpose of this project was to successfully update a legacy back-end and integrate it with a modern back-end and framework.


## Language and Tools
This project used Java, Spring Boot, Angular, MySQL, HTML and CSS.

## Commit History

Construct packages of controllers, entities, dao, and services. 
The packages were used for a checkout form and vacations packages list.

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

Wrote code for the entities package that included entity classes and the enum designed to match the UML diagram.

1) Carts.java, lines 55-63: Added OneToMany and ManyToOne relationships between tables and classes.
2) Cart_items.java, lines 39-54: Added OneToMany and ManyToOne relationships between tables and classes.
3) Vacations.java, lines 45-52: Added OneToMany and ManyToOne relationships between tables and classes.
4) Excursions.java, lines 45-53: Added ManyToMany and ManyToOne relationships between tables and classes.
5) Customers.java, lines 50-58: Added OneToMany and ManyToOne relationships between tables and classes.
6) Divisions.java, lines 38-46: Added OneToMany and ManyToOne relationships between tables and classes.
7) Countries.java, lines 37-39: Added OneToMany relationships between tables and classes.
8) RestDataConfig.java, lines 3, 37-41: Changed import address and physical addresses.
9) Carts.java, lines 38-42: Added enum designed to match the UML diagram and SQL database.
10) Add @NoArgsConstructor and @AllArgsConstructor to each entity file.

Wrote code for the dao package that included repository interfaces for the entities that extend JpaRepository, and add cross-origin support.
1) Create Cart_itemsRepository.java interface in dao package.
2) Create CartsRepository.java interface in dao package.
3) Create CountriesRepository.java interface in dao package.
4) Create CustomersRepository.java interface in dao package.
5) Create DivisionsRepository.java interface in dao package.
6) Create ExcursionsRepository.java interface in dao package.
7) Create VacationsRepository.java interface in dao package.
8) Add cross-origin support within each of the repository.java files.
9) Add @RepositoryRestResource annotation to each repository file to ensure correct mapping.

Wrote code for the services package that included each of the following:

•   a purchase data class with a customer cart and a set of cart items
1) Create Purchase.java data class that contains a customer, cart, and a set of cart items.

•   a purchase response data class that contains an order tracking number
1) Create PurchaseResponse.java data class that contains an order tracking number.

•   a checkout service interface
1) Create CheckoutService.java interface.

•   a checkout service implementation class
1) Create CheckoutServiceImpl.java class.
2) Cart.java, lines 46, 67-77: Added column for status; added method for add to reflective changes in CheckoutServiceImpl.java
3) Customer.java, lines 60-72: Added method for add to reflective changes in CheckoutServiceImpl.java

Wrote code to include validation to enforce the inputs needed by the Angular front-end.
1) Update Customer.java file with validation @Column(nullable = false) to each input field to enforce inputs.

Wrote code for the controllers package that included a REST controller checkout controller class with a post mapping to place orders.

1) Create CheckoutController.java class in Controller Package that includes post mapping to place orders.

Added five sample customers to the application programmatically.
1) Create BootStrapData.java file
2) Add 5 unique customers to BootStrapData.java file to populate database.

