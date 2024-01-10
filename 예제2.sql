select * from customer;
select * from customer_product;
select * from product;


-- 주분테이블에서 CUST005 고객이 주문한 제품의 이름을 출력하세요
select product_name
from product
where product_number in (
select product_number
from customer_product
where customer_id = 'CUST005'
);

-- 주문테이블에서 나이가 30세 이상인 고객이 
-- 주문한 제품의 번호와 주문일자를 출력하시오

select * from customer;
select * from customer_product;
select * from product;

select product_number, order_date
from customer_product
where customer_id in (
select customer_id
from customer
where age > 30
);
-- 주문테이블에서 나이가 30세 이상인 고객이 
-- 주문한 제품의 번호와 주문일자를 출력하시오

select cp.product_number, cp.order_date
from customer_product cp
inner join customer c
on cp.customer_id = c.customer_id
where age >= 30;


select * from customer;
select * from customer_product;
select * from product;
-- 고객 테이블에서 적립금 평균이 80원 이상인 등급에 대해
-- 등급별 고객수와 적립금 평균을 출력하세요.

select rating, count(*) cnt, avg(reserves) as 평균
from customer
group by rating
having 평균 >= 80;

select 고객번호, sum(금액)
from t_order
group by 고객번호;

select * from customer;
select * from customer_product;
select * from product;
-- 주문테이블에서 적립금이 가장 많은 고객의 고객이름과 적립금을 출력하세요
select customer_name, max(reserves) as mx
from customer
group by customer_name
order by mx desc limit 1;

select customer_name, reserves
from customer
where reserves=(
	select max(reserves)
    from customer
);


select * from customer;
select * from customer_product;
select * from product;

select 고객번호, 성명, 주소
from t_cus


-- 주문테이블에서 CUST005.
 -- 고객이 주문한 제품의 이름과 제조업체를 출력하세요.
 select p.product_name, p.manufacturer
 from product p
 inner join customer_product cp
 on p.product_number = cp.product_number
 where customer_name = "CUST005";
 

select product_name, manufacturer
from product
where product_number in (
select product_number
from customer_product
where customer_id = "CUST005"
);

select 성명, 주소, 품명, 수량, 금액
from t_cus ts
inner join t_order tr
on ts.고객번호 = tr.고객번호
where 고객번호 = '001'; 

-- customer 테이블에서 occupation이 4글자 미만인 것을 출력하시오.
SELECT occupation
FROM customer
WHERE CHAR_LENGTH(occupation) < 4;


SELECT *
FROM customer
ORDER BY customer_name DESC;

select dp.department_name, count(st.student_name) as cnt
from student st
inner join department dp
on dp.department_code = st.department_code
group by department_name
order by cnt asc
limit 1;

select * from customer;
select * from customer_product;
select * from product;

select customer_id
from customer_product cp
inner join product p
on cp.product_number = p.product_number
group by customer_id;

