-- moeny table 생성 및 데이터 삽입
create table money_tbl_02 (
custno number(6),
saleno number(8),
pcost number(8),
amount number(4),
price number(8),
pcode varchar2(4),
sdate date,
primary key(custno, saleno)
);

insert into money_tbl_02 values (100001, 20210001, 500, 5, 2500, 'A001', '20210101');

insert into money_tbl_02 values (100001, 20210002, 1000, 4, 4000, 'A002', '20210101');

insert into money_tbl_02 values (100001, 20210003, 500, 3, 1500, 'A008', '20210101');

insert into money_tbl_02 values (100002, 20210004, 2000, 1, 2000, 'A004', '20210102');

insert into money_tbl_02 values (100002, 20210005, 500, 1, 500, 'A001', '20210103');

insert into money_tbl_02 values (100003, 20210006, 1500, 2, 3000, 'A003', '20210103');

insert into money_tbl_02 values (100004, 20210007, 500, 2, 1000, 'A001', '20210104');

insert into money_tbl_02 values (100004, 20210008, 300, 1, 300, 'A005', '20210104');

insert into money_tbl_02 values (100004, 20210009, 600, 1, 600, 'A006', '20210104');

insert into money_tbl_02 values (100004, 20210010, 3000, 1, 3000, 'A007', '20210106');

select max(custno)+1 from MEMBER_TBL_02;


SELECT a.custno, a.custname, 
       CASE a.grade 
           WHEN 'A' THEN 'VIP' 
           WHEN 'B' THEN '일반' 
           ELSE '직원' 
       END AS grade, 
       SUM(b.price) AS price 
FROM member_tbl_02 a, money_tbl_02 b
WHERE a.custno = b.custno and NVL(b.price, 0) > 0 
GROUP BY a.custno, a.custname, a.grade 
ORDER BY SUM(b.price) DESC;

select * from MONEY_TBL_02;
