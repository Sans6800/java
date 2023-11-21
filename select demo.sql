SELECT CURDATE()

SELECT VERSION ()

SELECT 10+20, (4+5)+5;

/* MySQL/MariaDB is a RDBMS software used to Store & Manage data.

MySQl founder- Michael Widenius. His 2 daughters - My  & Maria

/* Heidi SQL - It's an IDE for working with MariaDB. It's installed 		automatically.
/* SQL Developer -  It's an IDE for working with MySQL. It's an standalone Installation*/
/*


*/
/*Data is information such as facts and numbers used to analyze something or make decisions.*/
/*
Database is merely a structured collection of data.
Database is a collection of inter-related Tables.
Table is a collection of Records.
Record is a collection of fields.

The data relating to each other by nature, e.g., a product belonged to a product 
category and associated with multiple tags. Therefore, we use the term relational database.
A table may relate to another table using a relationship
*/
aa
/* Eg:
 classicmodels- Database
 employees,customers,offices,products - Tables
*/
/*An RDBMS is a type of database management system (DBMS) that stores data in a 
row-based table structure which connects related data elements. 

SQL- SQL is a standard language for storing, manipulating and retrieving data in databases.

   DML - SELECT, INSERT, UPDATE, DELETE
   DDL- CREATE,ALTER,DROP
   TCL - COMMIT, ROLLBACK, SAVEPOINT
   DCL - GRANT REVOKE
   
   
# The SELECT statement allows you to retreieve data from one or more tables
-- Select Statements Syntax

-- SELECT select_list
-- FROM table_name;
*/
SELECT * FROM customers;

SELECT * FROM employees;

SELECT lastname FROM employees;

SELECT employeenumber, lastname,jobtitle FROM employees;

DESCRIBE employees;

DESC customers;

SELECT customernumber, customername,phone,city FROM customers;

#----------------------------------------------------------------
-- Filter Records

#MySQL WHERE clause

-- The WHERE clause allows you to specify a search condition for the rows 
-- returned by a query.
# Syntax :
/*  SELECT 
    select_list
FROM
    table_name
WHERE
    search_condition;  */

SELECT employeeNumber,lastname,firstname,jobTitle,email from employees;

-- Display Sales rep's in the organization
SELECT employeeNumber,lastname,firstname,jobTitle,email from employees WHERE jobTitle='Sales Rep';

SELECT * FROM orderdetails;
-- Display orders with quantity greater then 50
SELECT * FROM orderdetails WHERE quantityOrdered >=50;

/* The search_condition is a combination of one or more predicates using the 
logical operator AND, OR and NOT.

AND- All conditions should be TRUE
OR - Any one of the conditions should be TRUE.
NOT - Negate the Condition .
 */

/* Example uses the WHERE clause to find employees whose job titles are 
Sales Rep and office codes are 1 */

SELECT employeeNumber,lastname,firstname,jobTitle,email,officeCode 
	from employees 
		WHERE jobTitle='Sales Rep' AND officeCode=1;
		
SELECT * FROM orderdetails 
	WHERE quantityOrdered >=50 AND priceEach > 100;
	
-- OR operator
 -- query finds employees whose job title is Sales Rep or employees who 
 -- locate the office with office code 1:
SELECT employeeNumber,lastname,firstname,jobTitle,email,officeCode 
	from employees 
		WHERE jobTitle='Sales Rep' OR officeCode=1;
		
-- The BETWEEN operator returns TRUE if a value is in a range of values:
 
 -- Syntax: expression BETWEEN low AND high
 
 -- query finds employees who locate in offices whose office code is from 1 to 3:
SELECT employeeNumber,lastname,firstname,jobTitle,email,officeCode 
	from employees 
		WHERE officeCode BETWEEN 1 AND 3;

-- query to list orders done in the first quarter of 2004 .
SELECT * FROM orders; 

SELECT * FROM orders WHERE shippedDate BETWEEN '2004-01-01' AND '2004-03-31';

# MySQL WHERE with the LIKE operator
 
 /* The LIKE operator evaluates to TRUE if a value matches a specified pattern. 
 To form a pattern, you use % and _ wildcards. 
 The % wildcard matches any string of zero or more characters 
 while the _ wildcard matches any single character. */
 
 -- query finds employees whose last names end with the string 'son':
 SELECT employeeNumber,lastname,firstname,jobTitle,email
	from employees WHERE lastname LIKE '%son';

SELECT employeeNumber,lastname,firstname,jobTitle,email
	from employees WHERE lastname LIKE 'B%';

SELECT employeeNumber,lastname,firstname,jobTitle,email
	from employees WHERE lastname LIKE 'B%' OR firstname LIKE 'S%';	
	
SELECT employeeNumber,lastname,firstname,jobTitle,email
	from employees WHERE firstname LIKE '_arry';	
	
SELECT employeeNumber,lastname,firstname,jobTitle,email
	from employees WHERE firstname LIKE 'A%';	

-- NOT -- Negates the condition
SELECT employeeNumber,lastname,firstname,jobTitle,email
	from employees WHERE firstname NOT LIKE 'A%';	
	
#MySQL WHERE clause with the IN operator

-- The IN operator returns TRUE if a value matches any value in a list.
-- Syntax
-- value IN (value1, value2,...)

-- IN condition is used to help reduce the need to use multiple OR conditions in a 
-- SELECT, INSERT, UPDATE, or DELETE statement.

SELECT employeeNumber,lastname,firstname,jobTitle,email,officeCode 
	from employees 
		WHERE -- officeCode =1 OR officeCode =5 OR officeCode =7;
		officeCode IN(1,5,7) ORDER BY officecode;
		
SELECT * FROM customers WHERE contactLastName IN ('Young','Smith');

SELECT * FROM customers WHERE contactLastName NOT IN ('Taylor','Brown');

#MySQL WHERE  clause with the IS NULL operator
-- Null -> Absence of Data or Data is missing

/* To check if a value is NULL or not, you use the IS NULL operator, 
not the equal operator (=). The IS NULL operator returns TRUE if a value is NULL.

Syntax: 
value IS NULL  */ 		
		
-- Display employees who doesn't have Managers allocated		
SELECT employeeNumber,lastname,firstname,jobTitle,email,reportsTo 
	from employees WHERE reportsTo IS NULL;	
		
SELECT * FROM orders WHERE comments IS NULL;	

SELECT * FROM orders WHERE comments="";	 -- not considered as NULL

SELECT * FROM customers WHERE phone=0;   -- not considered as NULL

#WHERE clause with comparison operators
-- >, <, >=, <=, =, <> or != (not equals)

SELECT firstname,lastname,jobtitle from employees where jobtitle <> 'Sales Rep';

SELECT lastname, firstname, officeCode FROM employees
WHERE officecode > 5;

#---------------------------------------------------------------------------------
#MySQL ORDER BY clause
-- When you use the SELECT statement to query data from a table, 
-- the result set is not sorted. It means that the rows in the result set can 
-- be in any order.

-- To sort the result set, you add the ORDER BY clause to the SELECT statement
/* Syntax:
SELECT   select_list FROM    table_name
ORDER BY 
   column1 [ASC|DESC], 
   column2 [ASC|DESC],
   ...;  */

SELECT contactLastName, contactFirstName FROM customers;

-- sorts in ascending order
SELECT contactLastName, contactFirstName FROM customers ORDER BY contactLastName;

-- sort in descending order
SELECT contactLastName, contactFirstName FROM customers ORDER BY contactLastName DESC;


SELECT * FROM products;

SELECT productCode, productName, buyPrice FROM products ORDER BY buyPrice DESC;

# MySQL GROUP BY clause
 -- The GROUP BY clause groups a set of rows into a set of summary rows by values 
 -- of columns or expressions. The GROUP BY clause returns one row for each group. 
 -- In other words, it reduces the number of rows in the result set.
 
 /* You often use the GROUP BY clause with aggregate functions such as SUM, AVG, 
 MAX, MIN, and COUNT. The aggregate function that appears in the SELECT clause 
 provides information about each group. */
 
 /* Syntax: 
 SELECT c1, c2,..., cn, aggregate_function(ci)
FROM table
WHERE where_conditions
GROUP BY c1 , c2,...,cn; */


SELECT STATUS FROM orders;

SELECT STATUS FROM orders GROUP BY STATUS;

SELECT STATUS ,COUNT(*) AS Total FROM orders GROUP BY STATUS;

SELECT COUNT(*) 'Total Orders' FROM orders;

SELECT quantityInStock FROM products;

SELECT sum(quantityInStock) 'Total Quantity' FROM products;


SELECT productLine,quantityInStock FROM products;

 /* The GROUP BY clause is often used with an aggregate function to perform calculation and 
return a single value for each subgroup. */
-- Query to find sum of quantity of Products
SELECT productLine,sum(quantityInStock) FROM products GROUP BY productLine;

SELECT orderdate FROM orders;

SELECT YEAR(orderdate) AS Year, COUNT( orderNumber) FROM orders GROUP BY YEAR DESC;

SELECT orderNumber,SUM(quantityOrdered * priceEach) as Total from orderDetails
group by orderNumber;
 

-- Query to display total no. of customers from each city

SELECT * FROM customers;

 SELECT city , COUNT(*) "Total Customers" from customers group by city;
 
 # SQL Joins
-- A join is a method of linking data between one (self-join) or 
-- more tables based on values of the common column between the tables.

/* MySQL supports the following types of joins:

Inner join
Left join
Right join
Cross join */

-- Inner Join - Returns only matching records from 2 tables

/* SELECT3
    select_list
FROM t1
INNER JOIN t2 ON join_condition1
INNER JOIN t3 ON join_condition2
...; */

-- Query to display employeeCode, firstName & city of employees

SELECT * FROM employees;
SELECT * FROM offices;

SELECT employeeNumber, firstName,city FROM employees e
	INNER JOIN offices o
		ON e.officeCode=o.officeCode;
		
-- Query to display productCode and productName from the products table.
-- and  textDescription of product lines from the productlines table.

SELECT productCode, productName, textDescription from products p
	INNER JOIN productlines pl
		ON p.productLine=pl.productLine;
		
SELECT productCode, productName, textDescription from products
	INNER JOIN productlines
		ON products.productLine=productlines.productLine;

-- USING clause -  If joined fields of both tables have same name

SELECT employeeNumber,firstName,city,country FROM employees
	INNER JOIN offices USING(officeCode);

# Design a query to display custNo, custName, SalesRepName of the customer

SELECT * FROM customers;
SELECT * FROM employees;

SELECT customerNumber,customerName, CONCAT(firstName,' ',lastName) 'Sales Rep'
	FROM customers c
		INNER JOIN employees e
			ON c.salesRepEmployeeNumber=e.employeeNumber;



