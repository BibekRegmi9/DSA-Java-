
-- Using ROW_NUMBER() for one top student per class
with rank_students as (select student_name,
                              class,
                              marks,
                              ROW_NUMBER() over (partition by class order by marks desc) as rank
                       from students)
select student_name, class, marks
from rank_students
where rank = 1;


--You Want All Students Who Share Top Marks (Use RANK()
with rank_students as (select student_name,
                              class,
                              marks,
                              RANK() over (partition by class order by marks desc) as rank)
from students)
select student_name, class, marks
from rank_students
where rank = 1;


