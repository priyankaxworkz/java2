CREATE DATABASE COMPANY;
USE COMPANY;

CREATE TABLE EMPLOYEE_INFO(EMPLOYEE_ID INT PRIMARY KEY,
EMPLOYEE_NAME VARCHAR(50) NOT NULL,
EMPLOYEE_MAIL VARCHAR(100) UNIQUE );

INSERT INTO EMPLOYEE_INFO VALUES(1,'NANDHINI','NANDHINI@GMAIL.COM');
INSERT INTO EMPLOYEE_INFO VALUES(2,'NANDHI','NANDHI@GMAIL.COM');
INSERT INTO EMPLOYEE_INFO VALUES(3,'AMRUTHA','AMRUTHA@GMAIL.COM');
INSERT INTO EMPLOYEE_INFO VALUES(4,'NAVEEN','NAVEEN@GMAIL.COM');
INSERT INTO EMPLOYEE_INFO VALUES(5,'POJJA','POJJA@GMAIL.COM');
INSERT INTO EMPLOYEE_INFO VALUES(6,'VANNI','VANNI@GMAIL.COM');
INSERT INTO EMPLOYEE_INFO VALUES(7,'NANDHINI','NANDHINI2@GMAIL.COM');
INSERT INTO EMPLOYEE_INFO VALUES(8,'AKSHTA','AKSHTA@GMAIL.COM');
INSERT INTO EMPLOYEE_INFO VALUES(9,'TILAK','TILAK@GMAIL.COM');
INSERT INTO EMPLOYEE_INFO VALUES(10,'NAYANA','NAYANA@GMAIL.COM');

SELECT * FROM EMPLOYEE_INFO WHERE EMPLOYEE_ID=2;

SELECT * FROM EMPLOYEE_INFO;

SELECT EMPLOYEE_NAME FROM EMPLOYEE_INFO;

CREATE TABLE DEPARTMENT(DEPARTMENT_NAME VARCHAR(100) NOT NULL,
DEPARTMENT_ID INT UNIQUE,
MANAGER_EMAIL VARCHAR(100) PRIMARY KEY);

INSERT INTO DEPARTMENT VALUES('MARKETING DEPARTMENT',2345,'XYZ@GMAIL.COM');
INSERT INTO DEPARTMENT VALUES('FINANCE DEPARTMENT',675,'FD@GMAIL.COM');
INSERT INTO DEPARTMENT VALUES('SALES DEPARTMENT',56,'SD@GMAIL.COM');
INSERT INTO DEPARTMENT VALUES('HUMANRESOURCE DEPARTMENT',256,'HSD1@GMAIL.COM');
INSERT INTO DEPARTMENT VALUES('ACCOUNTANCY DEPARTMENT',3457,'A6D@GMAIL.COM');
INSERT INTO DEPARTMENT VALUES('RESOURCEDEVELOPMENT DEPARTMENT',2351,'RDD@GMAIL.COM');
INSERT INTO DEPARTMENT VALUES('MARKETING DEPARTMENT',2405,'MD@GMAIL.COM');
INSERT INTO DEPARTMENT VALUES('IT DEPARTMENT',234,'IT@GMAIL.COM');
INSERT INTO DEPARTMENT VALUES('OPERATION DEPARTMENT',987,'OD@GMAIL.COM');
INSERT INTO DEPARTMENT VALUES('MANAGMENT DEPARTMENT',768,'MND@GMAIL.COM');

SELECT * FROM DEPARTMENT WHERE DEPARTMENT_NAME='FINANCE DEPARTMENT';

SELECT * FROM DEPARTMENT;




