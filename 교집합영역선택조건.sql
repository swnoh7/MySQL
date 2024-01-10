SELECT * FROM haksa.professor;

select dp.department_name, count(*) as cnt
from professor pf
inner join department dp
on dp.department_code = pf.department_code
group by department_name
having cnt >= 2;

-- 학과 별 교수의 수를 출력해보시오
-- 교수의 수가 2명 이상인 학과를 출력하세요alter
