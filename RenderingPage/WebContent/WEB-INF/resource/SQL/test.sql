CREATE TABLE cusConsult(
seq NUMBER(38) PRIMARY KEY,
name VARCHAR2(5) NOT NULL,
phone VARCHAR2(10) NOT NULL,
email VARCHAR2(30),
title VARCHAR2(20) NOT NULL,
content VARCHAR2(500) NOT NULL,
regDate DATE DEFAULT SYSDATE
);
drop table cusconsult