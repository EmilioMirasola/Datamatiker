--Opgave 1

select sname
from Sailors
         join Reserves R2 on Sailors.said = R2.said
where bid = 103

--Udtrykt i algebra
-- πsnavn((σbid = 103(Reserves))⋈Sailors

--Opgave 2
select color
from Boats
         join Reserves R2 on Boats.bid = R2.bid
where said = 31

--Udtrykt i algebra
-- πcolor((σsaid = 31(Reserves))⋈Boats