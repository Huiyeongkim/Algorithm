-- 코드를 입력하세요
SELECT ANIMAL_TYPE, count(ANIMAL_TYPE) AS count FROM ANIMAL_INS
group by animal_type
order by Animal_type Asc;