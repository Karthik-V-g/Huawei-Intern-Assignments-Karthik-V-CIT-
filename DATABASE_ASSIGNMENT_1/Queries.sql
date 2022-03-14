/*
DELETE FROM teacher WHERE department='IT';

SELECT * FROM teacher;
*/


/*
UPDATE students SET age=20 WHERE year_of_batch=2018;

SELECT * from students;

*/





/*SELECT * from teacher WHERE department='CSE';
*/








/*
SELECT * FROM students WHERE year_of_batch=2020;
*/

























/*
INSERT INTO students (name,age,mobile_no,registration_no,year_of_batch) VALUES 
 ('karthik',20,'9876765676',1,2018),
 ('logesh',21,'9876545676',2,2018),
 ('abi',19,'8765678765',3,2020),
 ('gopi',22,'8767987656',4,2017),
 ('priya',23,'9876567656',5,2017),
 ('subi',18,'9456765678',6,2021),
 ('kavin',20,'9876567656',7,2018),
 ('praba',18,'9876767678',8,2020),
 ('tom',18,'8767879656',9,2021),
 ('john',17,'9876776876',10,2022);


SELECT * from students;

*/


/*
INSERT INTO teacher (id,name,domain,department) VALUES 
 (1,'muthu','Maths','CSE'),
 (2,'kevin','Java','CSE'),
 (3,'hemanth','Database','IT'),
 (4,'vaani','Operating System','IT'),
 (5,'george','Computer Networks','CSE'),
 (6,'arul','Engineering Drawing and Graphics','CIVIL'),
 (7,'indhu','Thermodynamics','MECHANICAL'),
 (8,'divya','CAD/CAM','MECHANICAL'),
 (9,'mary','Microcontroller','EEE'),
 (10,'peter','Fluid-Mechanics','MECHANICAL');


*/






/*CREATE TABLE students(
  name TEXT NOT NULL,
  age INTEGER NOT NULL,
  mobile_no TEXT NOT NULL,
  registration_no INTEGER PRIMARY kEY,
  year_of_batch YEAR NOT NULL
);
  
  CREATE TABLE teacher(
   id INTEGER PRIMARY KEY,
   name TEXT NOT NULL,
   domain TEXT NOT NULL,
   department TEXT NOT NULL
);
*/