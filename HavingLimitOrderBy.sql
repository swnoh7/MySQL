select dp.department_name, count(*) as 학생수
from student st
inner join department dp
on st.department_code = dp.department_code
group by dp.department_name
having 학생수 > 2;


select st.student_name,dp.department_name
from student st, department dp
where st.department_code = dp.department_code;

INSERT INTO Student (student_name, student_height, department_code) VALUES
('가길동', 170.5, 1),
('나길동', 165.2, 1),
('다길동', 180.0, 2),
('라길동', 175.8, 3),
('마길동', 160.7, 4),
('바길동', 168.3, 1),
('사길동', 172.1, 2),
('아길동', 175.0, 1);

select * from student
-- 국어국문과에 다니는 학생을 출력하시오(학생이름, 국어국문과)
select st.student_name, dp.department_name
from student st
inner join department dp
on dp.department_code = st.department_code
where dp.department_name = '컴퓨터공학과';

select*from student
where student_name like'%길동';

-- sql학생의 키가 170이상 180이하인 학생만 출력하세요.
select st.student_height, st.student_name
from student st
where student_height between 170 and 180;

select st.student_height, st.student_name
from student st
where 180 > student_height && student_height >=170;

-- 키가 가장큰 사람을 출력하세요.
SELECT st.student_height, st.student_name
FROM student st
ORDER BY st.student_height DESC
LIMIT 1;

-- 페이지 별 게시물 수 할때도 LIMIT 사용 페이지 넘어갈때 곱하기사용



