-- Last updated: 10/5/2026, 10:08:34 AM
select
    x,
    y,
    z,
    case
    when x+y>z and x+z>y and y+z>x then 'Yes'
    else 'No'
    end as triangle 
from Triangle