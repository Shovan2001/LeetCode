# Write your MySQL query statement below
with cte as
(
    select id,country,state,amount,CAST(trans_date AS char) as month_wise_trans from Transactions
),
cte2 as
(select id,country,state,amount,substr(month_wise_trans,1,7) as mon_trans from cte)

select cte2.mon_trans as month,
        cte2.country as country,
        count(cte2.mon_trans) as trans_count,
        sum((cte2.state = 'approved')) as approved_count,
        sum(cte2.amount) as trans_total_amount,
        sum((cte2.state='approved')*cte2.amount) as approved_total_amount 
        from cte2 group by cte2.mon_trans,cte2.country;