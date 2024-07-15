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
