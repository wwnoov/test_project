CREATE TABLE student
(
    studentId   varchar(4) PRIMARY key not null ,
    studentName     VARCHAR(50),
    korean           int,
    english         int,
    math            int
);
CREATE TABLE teacher
(
    id       varchar(50) PRIMARY KEY NOT NULL,
    password VARCHAR(100)
);