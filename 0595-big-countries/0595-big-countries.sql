# Write your MySQL query statement below
SELECT name, area, population FROM World w
WHERE w.population >= 25000000 
OR w.area >= 3000000;