-- Last updated: 10/5/2026, 10:06:40 AM
# Write your MySQL query statement below
select teacher_id , count(distinct(subject_id )) as cnt from Teacher group by teacher_id 