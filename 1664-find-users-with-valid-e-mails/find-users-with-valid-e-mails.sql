# Write your MySQL query statement below
select * from Users u where regexp_like (mail,'^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode\\.com$','c');