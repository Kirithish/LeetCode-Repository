-- Last updated: 2/25/2026, 9:08:57 AM
# Write your MySQL query statement below
select teacher_id , count(distinct(subject_id )) as cnt from Teacher group by teacher_id 