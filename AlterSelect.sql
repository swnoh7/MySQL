select * from t_customer;

insert into t_customer(customer_name, phone, email, address, region_code)
values('손흥민','010-1234-7894','son@gmail.com','서울특별시 강남구 삼성동','02'); 

insert into t_customer(customer_name, phone, email, address, region_code)
values('박태환','010-1234-5555','park@gmail.com','제주특별자치도 제주시 일도','064');

update t_customer set address = '서울시 강남구 일동' where id = 6;

delete from t_customer where id = 1;

ALTER TABLE t_customer
ADD CONSTRAINT fk_region_code FOREIGN KEY (region_code) REFERENCES t_region(region_code);


ALTER TABLE t_sales
ADD CONSTRAINT fk_customer_id FOREIGN KEY (customer_id) REFERENCES t_customer (id),
ADD CONSTRAINT fk_product_code FOREIGN KEY (product_code) REFERENCES t_product (product_code);

ALTER TABLE t_sales
DROP FOREIGN KEY fk_customer_id, DROP FOREIGN KEY fk_product_code;

select * from t_customer where region_code = '02';

insert into t_sales(customer_id, product_code, qty) values (7,'P001',2);

SELECT customer_name, email
FROM t_customer;

select tc.id, tc.customer_name, tr.region_name
from t_customer tc
right join t_region tr
on tc.region_code=tr.region_code;


SELECT qty, sales_date
FROM t_sales
WHERE product_code = 'P001';

SELECT product_name, SUM(qty) AS total_quantity, SUM(qty * price) AS total_price
FROM t_sales
JOIN t_product ON t_sales.product_code = t_product.product_code;