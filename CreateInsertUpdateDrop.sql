SELECT * FROM bigdata.student;
-- CRUD 
-- 이름을 기준으로 오름차순 정렬(sort)하여 출력하세요
select * from student order by name asc;
select * from student order by name desc;

-- Q. 나이가 30세 이상인 학생을 출력하세요
select count(*) from student where age<=30;

create table student(
	num int not null primary key auto_increment,
    name varchar(50),
    tel varchar(50),
    age int,
    email varchar(50)
);

insert into student(name,tel,age,email)
values('노승우','010-9391-7888','23','woody1@hanamal.net');

update student set age=26 where num=1;

insert into student(name,tel,age,email)
values('박민석','010-4391-7588','32','bms@hanamal.net');

select count(num) from student where age<=30;

ALTER TABLE student
DROP COLUMN age;
