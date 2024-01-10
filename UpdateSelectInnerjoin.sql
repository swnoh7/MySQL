select * from t_customer;

insert into t_customer(customer_name, phone, email, address, region_code)
values('노승우','010-9391-7888','woody1@hanmail.net','광주광역시 남구','062');

update t_customer set address = '광주광역시 남구 진월동' where id = '9';

select * from t_customer where region_code = '062';

select * from t_product;

insert into t_sales(customer_id, product_code, qty)
values(9,'P005',2);

select * from t_sales;

select tc.id, tc.customer_name, tp.product_code
from t_customer tc
inner join t_product tp
on tc.product_code = tp.product_code;