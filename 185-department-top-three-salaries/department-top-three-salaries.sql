# Write your MySQL query statement below
with cte as
(select e.id,e.name,e.salary,d.id as d_id,d.name as d_name from Employee e join Department d on e.departmentId=d.id),

cte2 as
(select c.*,dense_rank() over(partition by c.d_name order by c.salary desc) as ranks from cte c)

select cte2.d_name as Department, cte2.name as Employee, cte2.salary as Salary from cte2 where cte2.ranks<=3;