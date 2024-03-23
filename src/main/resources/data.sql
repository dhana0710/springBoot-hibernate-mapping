-- create table person
-- (
--    id integer not null,
--    name varchar(255) not null,
--    location varchar(255),
--    birth_date timestamp,
--    primary key(id)
-- );


-- //declaration can in small


INSERT INTO PASSPORT(id,passportnum) VALUES (201,'ABC123');
INSERT INTO PASSPORT(id,passportnum) VALUES (202,'ACF345');
INSERT INTO PASSPORT(id,passportnum) VALUES (203,'AVB543');


INSERT INTO STUDENT (ID, NAME, LOCATION ,PASSPORT_ID) 
VALUES(10001,  'Ranga', 'Hyderabad',201);
INSERT INTO STUDENT (ID, NAME, LOCATION ,PASSPORT_ID) 
VALUES(10002,  'James', 'New York',202);
INSERT INTO STUDENT (ID, NAME, LOCATION,PASSPORT_ID) 
VALUES(10003,  'Pieter', 'Amsterdam',203);

