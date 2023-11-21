# DML Operations

-- The INSERT statement allows you to insert one or more rows into a table. 
-- The following illustrates the syntax of the INSERT statement:

/*INSERT INTO table(c1,c2,...)
VALUES (v1,v2,...); */

DESC course;

INSERT INTO course VALUES(101, "ComputerScience", 5000.00,"cse@mycollege.com");
INSERT INTO course VALUES(102, "Electronics", 7000.00,"ec@mycollege.com");
INSERT INTO course VALUES(103, "Mechanical", 4000.00,"mech@mycollege.com");
INSERT INTO course VALUES(104, "Electrical", 5000.00,"ele@mycollege.com");

SELECT * FROM course;

INSERT INTO course VALUES(105, "IP", 5000.00,"ip@mycollege.com");

DESC student;

INSERT INTO student VALUES(1001,"James", "Gosling","1998-02-16","Bengaluru", 101);
INSERT INTO student VALUES(1002,"Navin", "Kumar","1986-06-30","Delhi", 105);
INSERT INTO student VALUES(1003,"Jimmy", "Ghosh","1991-05-16","Bengaluru", 103);
INSERT INTO student VALUES(1004,"Maya", "Jain","1999-02-16","Bombay", 101);
INSERT INTO student VALUES(1005,"Seokjin", "Kim","1992-12-04","Delhi", 102);
INSERT INTO student VALUES(1006,"Namjoon","Kim","1994-09-12","Goa", 104);
INSERT INTO student VALUES(1007,"Amy", "Ryan","1995-02-16","Bombay", 101);
INSERT INTO student VALUES(1008,"Mark", "Twain","1988-08-16","Bengaluru", 105);
INSERT INTO student VALUES(1009,"Earth", "Pirapat","1998-02-6","Goa", 104);
INSERT INTO student VALUES(1010,"Max", "Brian","1998-09-1","Delhi", 102);

SELECT * FROM student;

#Update Statement

/*
The UPDATE statement updates data in a table. 
It allows you to change the values in one or more columns of a single row or multiple rows.

 syntax of the UPDATE statement:

UPDATE  table_name 
SET 
    column_name1 = expr1,
    column_name2 = expr2,
    ...
[WHERE
    condition];
*/

SELECT * FROM course;

UPDATE course SET fees=8000 WHERE courseid=101;

UPDATE course SET fees=5000,email="royalmech@mycollege.com" WHERE courseid=103;

CREATE TABLE course_copy AS SELECT * FROM course;

SELECT * FROM course_copy;

# DELETE statement
 /*To delete data from a table, you use the MySQL DELETE statement. 
 syntax of the DELETE statement:

DELETE FROM table_name
WHERE condition;  */

DELETE FROM course_copy WHERE courseid=105;

USE classicmodels;
CREATE TABLE employeesbackup AS SELECT * FROM employees;
SELECT * FROM employeesbackup;
DELETE FROM employeesbackup WHERE officecode=4;

DROP TABLE employeesbackup;