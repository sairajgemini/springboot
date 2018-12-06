/*CREATE TABLE PERSON
(
	id integer not null,
	name varchar(255) not null,
	location varchar(255),
	birth_date timestamp,
	primary key(id)
);*/

/*
INSERT INTO PERSON(ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10000, 'SAIKAT GUPTA', 'DELHI', SYSDATE());*/

/*INSERT INTO PERSON(ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10001, 'INDRAKSHI GUPTA', 'DELHI', SYSDATE());*/

/*INSERT INTO PERSON(ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10002, 'AGNIBHA GUPTA', 'DELHI', SYSDATE());*/

/*INSERT INTO COURSE(ID, NAME) VALUES(10001, 'JPA support in Spring');*/
/*INSERT INTO COURSE(ID, NAME) VALUES(10002, 'Hibernate support in Spring');*/
/*INSERT INTO COURSE(ID, NAME) VALUES(10003, 'Web Service (REST/SOAP) support in Spring');*/

insert into employee_details(EMP_ID, FIRST_NAME, LAST_NAME, DOB) values(10001, 'Saikat', 'Gupta', SYSDATE);