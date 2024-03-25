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

insert into course(id,name,created_date_time,last_updated_date_time)
values(20001,'Chapter 1',current_timestamp(),current_timestamp());
insert into course(id,name,created_date_time,last_updated_date_time)
values(20002,'Chapter 2',current_timestamp(),current_timestamp());
insert into course(id,name,created_date_time,last_updated_date_time)
values(20003,'Chapter 3',current_timestamp(),current_timestamp());



insert into review(id,rating,description,course_id)
values(50001,'4','My life lession',20001);
insert into review(id,rating,description,course_id)
values(50002,'4','My life lession1',20001);
insert into review(id,rating,description,course_id)
values(50003,'3','My life lession2 and exp',20003);