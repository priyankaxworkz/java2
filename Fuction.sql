CREATE DATABASE FUNCTIONS;
USE FUNCTIONS;

CREATE TABLE FUNCTION_INFO(ID INT,
NAME VARCHAR(100),
GUEST VARCHAR(200),
DATE INT,
DAY VARCHAR(100));

INSERT INTO FUNCTION_INFO VALUES(1,'ANNIVERSSARY','VANI',2023/12/16,'MONDAY'),
(2,'ANNUALDAY','MD',2024/03/12,'TUE');

SELECT * FROM FUNCTION_INFO;

SELECT SYSDATE();
SELECT NOW();

SELECT DATE(SYSDATE());
SELECT TIME(SYSDATE());

SELECT MONTH(NOW());

SELECT DAY(NOW());

SELECT YEAR(NOW());

SELECT NAME,LENGTH(NAME) FROM FUNCTION_INFO;
SELECT GUEST,LENGTH(GUEST) FROM FUNCTION_INFO;

SELECT NAME,TRIM(NAME) FROM FUNCTION_INFO;
SELECT GUEST,TRIM(GUEST) FROM FUNCTION_INFO;

SELECT NAME,LTRIM(NAME) FROM FUNCTION_INFO;

SELECT GUEST,RTRIM(GUEST) FROM FUNCTION_INFO;

SELECT LPAD(DAY,10,'MONDAY') FROM FUNCTION_INFO;

SELECT RPAD(NAME,5,'VANNI') FROM FUNCTION_INFO;

SELECT SUBSTRING(NAME,1,2) FROM FUNCTION_INFO;

SELECT CONCAT('GUEST','ON THE','WAY') FROM FUNCTION_INFO;

SELECT LOWER(DAY) FROM FUNCTION_INFO;

SELECT UPPER(DAY) FROM FUNCTION_INFO;

SELECT ASCII(GUEST)  FROM FUNCTION_INFO;

SELECT REPLACE( DAY,'MONDAY','WED') FROM FUNCTION_INFO; 

SELECT CHAR(DAY,'WED') FROM FUNCTION_INFO;

SELECT LCASE(NAME) FROM FUNCTION_INFO;

SELECT SQRT(ID) FROM FUNCTION_INFO;

SELECT CEIL(ID) FROM FUNCTION_INFO;

SELECT FLOOR(DATE) FROM FUNCTION_INFO;

SELECT ROUND(DATE) FROM FUNCTION_INFO;

SELECT POWER(1,2) FROM FUNCTION_INFO;

SELECT MOD(1,ID) FROM FUNCTION_INFO;