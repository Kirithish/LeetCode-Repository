-- Last updated: 2/25/2026, 9:09:39 AM
select name from employee where id in (select managerId from employee group by managerId  having count(*)>=5)