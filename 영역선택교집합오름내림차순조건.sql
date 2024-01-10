SELECT * FROM haksa.student;

select dp.department_name, count(st.student_name) as cnt
from student st
inner join department dp
on dp.department_code = st.department_code
group by department_name
order by cnt desc
limit 1;


-- 서브쿼리
select department_name
from department
where department_code=(
select department_code from student
group by department_code
having count(department_code)=(
	select count(department_code) cnt from student group by department_code
    order by cnt desc limit 1
    )
);

-- 학생 중 성이 아인 학생이 속한 학과명과 학생명을 출력하세요
select department_name, student_name
from student st
inner join department dp
on st.department_code = dp.department_code
where student_name like '아%';

-- 키가 175~180 사이에 속한 학생수를 출력하세요.
select count(student_id) as 학생수
from student
where 180 > student_height && student_height >=175;