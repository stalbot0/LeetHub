# Write your MySQL query statement below
SELECT name FROM Customer c
WHERE c.referee_id != 2 OR c.referee_id IS NULL;