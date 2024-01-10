select * from haksa_real.student_course;
select * from course;
select * from professor;
select * from department;
select * from student;

-- 과목별 수강자 수를 출력하시오 ( 과목이름, 수강자수)
select c.course_name, count(*) as cnt
from course c
inner join student_course sc
on c.course_code = sc.course_code
group by c.course_name;
-- having cnt>=2
-- order by c.course_name asc;

-- 빌게이츠 교수의 과목을 수강 신청한 학생수?

select count(student_id)
from haksa_real.student_course sc
	where course_code =(
	select c.course_code
	from course c
		where professor_code =(
		select p.professor_code
		from professor p
		where p.professor_name = '빌 게이츠'
)
);

-- 스티브 잡스 교수의 과목을 수강신청한 학생이름을 출력하세요.

select department_name, student_name
from department d
inner join 
(select student_name, department_code
from student st
where student_id in (
select student_id
from student_course sc
where course_code =(
select course_code
from course c
where professor_code=(
select professor_code
from professor
where professor_name = '스티브 잡스'
)
)
) 
) A
on A.department_code=d.department_code;

select * from student_course;
select * from course;
select * from professor;
select * from department;
select * from student;

-- 사길동 학생과 같은 과목을 수강신청한 학생이름을 출력하세요
select student_name
from student
where student_id in (
	select student_id
	from student_course
	where course_code =(
		select course_code
		from student_course sc
		where student_id=(
				select student_id
				from student st
				where student_name = '사길동'
				)
		)
);
