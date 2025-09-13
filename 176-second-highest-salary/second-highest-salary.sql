# Write your MySQL query statement below
with cte as(
select max(salary) as maxsalary from Employee)

select max(salary) as SecondHighestSalary
from Employee where salary<(select * from cte);
