select Department, Employee,Salary
from (
    select
    d.name as Department,
    e.name as Employee,
    e.salary as Salary,
    dense_rank() over (partition by d.name order by e.salary  desc) as ranking

    from Employee  e
    left join Department  d
    on  e.DepartmentId=d.id

)t
where ranking <=3;