-- 프로그래머스 최문석 
-- 1. 동물의 아이디와 이름 
SELECT animal_id,name 
from animal_ins
order by animal_id;

-- 2. 아픈 동물 찾기 
SELECT ANIMAL_ID, NAME 
FROM ANIMAL_INS
WHERE INTAKE_CONDITION = 'SICK';

-- 3. 역순정렬 
SELECT name, datetime
from animal_ins
order by animal_id desc;

-- 4. 상위 n개 레코드 
SELECT name
from animal_ins
group by name
order by datetime limit 1;

-- 5. 이름이 있는 동물의 아이디 
SELECT animal_id 
from animal_ins
where name is not null
order by animal_id;

-- 6. 어린 동물 찾기 
-- != 
SELECT animal_id, name
from animal_ins 
where INTAKE_CONDITION != "aged"
order by animal_id;

-- 7. 나이정보가 없는 회원 수 구하기 
SELECT count(user_id) as users
from user_info
where age is null;

-- 8. 가장 비싼 상품 구하기 
SELECT max(price) as max_price
from product
where price limit 1;

-- 9. 강원도에 위치한 생산공장 목록 출력하기 
SELECT factory_id, factory_name, address 
from food_factory
where address like "%강원도%"
order by factory_id;

-- 10. 경기도에 위치한 식품창고 목록 출력하기

SELECT warehouse_id, warehouse_name, address ,ifnull(freezer_yn, "N") as freezer_yn
from food_warehouse
where address like "%경기도%"
order by warehouse_id;

-- 11. 흉부외과 또는 일반외과 의사 목록 출력하기
SELECT dr_name, dr_id, mcdp_cd, date_format(hire_ymd,"%Y-%m-%d") as hire_ymd
from doctor
where mcdp_cd in("gs","cs")
order by hire_ymd desc, dr_name asc;

-- 12. 이름이 없는 동물의 아이디

SELECT animal_id
from animal_ins
where name is null
order by animal_id;

-- 13. NULL 처리하기

select animal_type, ifnull(name,"No name") as name, sex_upon_intake 
from animal_ins 
order by animal_id;
-- 14. 주문량이 많은 아이스크림들 조회하기
SELECT F.flavor
from FIRST_HALF f join july j
on j.flavor = f.flavor
GROUP BY F.flavor
order by SUM(F.TOTAL_ORDER+J.TOTAL_ORDER) desc limit 3;

-- 15.인기있는 아이스크림

SELECT FLAVOR
FROM FIRST_HALF
ORDER BY TOTAL_ORDER DESC, SHIPMENT_ID ASC;

-- 16. 조건에 맞는 도서 리스트 출력하기

-- 코드를 입력하세요
SELECT BOOK_ID,date_format(PUBLISHED_DATE,"%Y-%m-%d") as PUBLISHED_DATE
FROM BOOK 
WHERE PUBLISHED_DATE like '%2021%' and CATEGORY = '인문';

-- 17.평균 일일 대여 요금 구하기 

SELECT round(avg(DAILY_FEE),0) as AVERAGE_FEE
from CAR_RENTAL_COMPANY_CAR
where car_type = 'suv';

-- 18.모든 레코드 조회하기
SELECT animal_id, animal_type, datetime, intake_condition, name, sex_upon_intake
from animal_ins 
order by animal_id;

-- 19 .과일로 만든 아이스크림 고르기


SELECT f.flavor
from FIRST_HALF f join ICECREAM_INFO i
on f.FLAVOR = i.FLAVOR
where  f.TOTAL_ORDER>3000 and i.INGREDIENT_TYPE = 'fruit_based'
order by f.TOTAL_ORDER desc;

-- 20 최댓값 구하기
SELECT max(datetime) as 시간 
from animal_ins;

-- 21.  옵션이 포함된 자동차 리스트 구하기

SELECT car_id, car_type, daily_fee,options
from car_rental_company_car
where options like "%네비게이션%"
order by car_id desc;

-- 22.  자동차 대여 기록에서 장기/단기 대여 구분하기

SELECT HISTORY_ID,CAR_ID,date_format(START_DATE,"%Y-%m-%d") AS START_DATE,date_format(END_DATE,"%Y-%m-%d") AS END_DATE,
IF(DATEDIFF(END_DATE,START_DATE)+1>=30,"장기 대여","단기 대여") AS RENT_TYPE
from CAR_RENTAL_COMPANY_RENTAL_HISTORY 
where START_DATE like "%2022-09%"
ORDER BY HISTORY_ID DESC;

-- 23. 동물 수 구하기
SELECT COUNT(ANIMAL_TYPE) AS COUNT
FROM ANIMAL_INS;

-- 24. 중복 제거하기
 
SELECT COUNT(DISTINCT NAME) 
FROM ANIMAL_INS
WHERE NAME IS NOT NULL;

-- 25. 최솟값 구하기
SELECT min(datetime)
from animal_ins
order by datetime;

-- 26. 동명 동물 수 찾기
SELECT name,count(*) as count 
from animal_ins
where name is not null
group by name having count(*)>=2
order by name;

-- 27. 이름에 el이 들어가는 동물 찾기

SELECT animal_id,name
from animal_ins
where name like "%el%" and animal_type = "dog"
order by name;

-- 28. DATETIME에서 DATE로 형 변환
SELECT animal_id, name, date_format(datetime,"%Y-%m-%d") as 날짜 
from animal_ins
order by animal_id;
-- 29. 가격이 제일 비싼 식품의 정보 출력하기

SELECT *
from food_product
order by price desc limit 1;

SELECT *
FROM FOOD_PRODUCT
WHERE PRICE = (SELECT MAX(PRICE) FROM FOOD_PRODUCT);

-- 30 . 카테고리 별 상품 개수 구하기

SELECT substr(product_code,1,2) as category, count(*) as products
from product 
group by substr(product_code,1,2)
order by product_code;

-- 31. 중성화 여부 파악하기

SELECT ANIMAL_ID, NAME, if(sex_upon_intake like "%intact%","X","O") AS "중성화"
from animal_ins 
ORDER BY ANIMAL_ID;

-- 정훈이 코드
SELECT ANIMAL_ID, NAME,
CASE SEX_UPON_INTAKE
    when 'Neutered Male' then 'O'
    when 'Spayed Female' then 'O'
    else 'X'
    end as '중성화'
from ANIMAL_INS; 

-- 32. 고양이와 개는 몇 마리 있을까

SELECT ANIMAL_TYPE, COUNT(*)
FROM ANIMAL_INS 
WHERE ANIMAL_TYPE IN("CAT","DOG")
GROUP BY ANIMAL_TYPE
ORDER BY ANIMAL_TYPE;

-- 33. 진료과별 총 예약 횟수 출력하기
SELECT DISTINCT MCDP_CD AS "진료과코드", COUNT(*) AS "5월예약건수"
FROM APPOINTMENT 
WHERE APNT_YMD LIKE "%2022-05%"
GROUP BY MCDP_CD
ORDER BY COUNT(MCDP_CD), MCDP_CD;

-- 34. 입양 시각 구하기(1)

SELECT SUBSTR(DATETIME,12,2) AS HOUR, COUNT(*)
FROM ANIMAL_OUTS 
WHERE SUBSTR(DATETIME,12,2) BETWEEN 9 AND 19
GROUP BY HOUR
ORDER BY HOUR;

-- 35. 자동차 종류 별 특정 옵션이 포함된 자동차 수 구하기
SELECT CAR_TYPE,COUNT(*) AS CARS
FROM CAR_RENTAL_COMPANY_CAR 
WHERE OPTIONS LIKE "%시트%"
GROUP BY CAR_TYPE
ORDER BY CAR_TYPE;

-- 36. 상품 별 오프라인 매출 구하기
SELECT P.PRODUCT_CODE, SUM(O.SALES_AMOUNT*P.PRICE) AS SALES
FROM PRODUCT P JOIN OFFLINE_SALE O
ON P.PRODUCT_ID = O.PRODUCT_ID
GROUP BY P.PRODUCT_ID
ORDER BY SALES DESC , PRODUCT_CODE;

-- 37. 조건에 맞는 도서와 저자 리스트 출력하기
SELECT B.BOOK_ID, A.AUTHOR_NAME, DATE_FORMAT(B.PUBLISHED_DATE,"%Y-%m-%d") as '출판일'
FROM BOOK B 
JOIN AUTHOR A
ON B.AUTHOR_ID =A.AUTHOR_ID
WHERE CATEGORY = '경제'
order by DATE_FORMAT(B.PUBLISHED_DATE,"%Y-%m-%d");

-- 38. 성분으로 구분한 아이스크림 총 주문량

SELECT i.INGREDIENT_TYPE, sum(f.TOTAL_ORDER) as 'TOTAL_ORDER'
from FIRST_HALF f join ICECREAM_INFO  i 
on f.FLAVOR = i.FLAVOR
group by i.INGREDIENT_TYPE
order by 'TOTAL_ORDER';

-- 39.루시와 엘라 찾기

SELECT      `ANIMAL_ID`, `NAME`, `SEX_UPON_INTAKE`
FROM        `ANIMAL_INS`
WHERE       `NAME` IN (
                "Lucy", "Ella", "Pickle",
                "Rogan", "Sabrina", "Mitty"
            )
ORDER BY    `ANIMAL_ID`;

-- 40.3월에 태어난 여성 회원 목록 출력하기

SELECT  MEMBER_ID, member_name, gender,date_format(date_of_birth,'%Y-%m-%d')
from member_profile 
where date_of_birth like "%03%" and 
gender = 'w' and  
tlno is not null ;

-- 41. 가격대 별 상품 개수 구하기

SELECT  floor(price / 10000) * 10000 as PRICE_GROUP, count(*) as PRODUCTS
    from PRODUCT
    group by floor(price / 10000) * 10000
    order by 1;
    
-- 42. 재구매가 일어난 상품과 회원 리스트 구하기

SELECT user_id ,PRODUCT_ID
from ONLINE_SALE 
group by user_id,product_id having count(product_id)>= 2 
order by 1, 2 desc;

-- 43. 조건에 부합하는 중고거래 상태 조회하기

SELECT BOARD_ID,WRITER_ID,TITLE,PRICE,
case 
when STATUS like "%sale%" then '판매중'
when STATUS like "%RESERVED%" then '예약중'
when STATUS like "%done%" then '거래완료'
end 
as status
from USED_GOODS_BOARD 
where created_date like '2022-10-05%'
order by 1 desc;

-- 44. 자동차 평균 대여 기간 구하기

SELECT
car_id ,
round(avg(DATEDIFF(END_DATE,START_DATE)+1), 1) as AVERAGE_DURATION
from CAR_RENTAL_COMPANY_RENTAL_HISTORY 
group by 
car_id
having AVERAGE_DURATION >=7
order by 2 desc , 1 desc;

-- 45. 카테고리 별 도서 판매량 집계하기

SELECT b.CATEGORY, sum(bs.sales) as TOTAL_SALES
from book b 
join BOOK_SALES bs
on b.book_id = bs.book_id
where bs.SALES_DATE like '%2022-01%'
group by b.CATEGORY
order by 1;

-- 46. 오랜 기간 보호한 동물(1)

SELECT a.name, a.datetime
from ANIMAL_INS a 
left join ANIMAL_OUTS ao
on a.animal_id = ao.animal_id
where ao.animal_id is null
order by 2 limit 3;

-- 47. 있었는데요 없었습니다
SELECT a.animal_id, a.name
from ANIMAL_INS a 
left join ANIMAL_OUTS ao
on a.animal_id = ao.animal_id
where a.datetime > ao.datetime
order by a.datetime;

-- 48. 조건별로 분류하여 주문상태 출력하기

SELECT order_id, product_id, date_format(out_date,'%Y-%m-%d'),
case 
when out_date>'2022-05-01' then '출고대기'
when out_date<='2022-05-01' then '출고완료'
else '출고미정'
end 
as '출고여부'
from food_order;

-- 49. 오랜 기간 보호한 동물(2)


SELECT ao.animal_id, ao.name
from ANIMAL_INS a 
left join ANIMAL_OUTS ao
on a.animal_id = ao.animal_id
where ao.animal_id is not null
order by DATEDIFF(ao.DATETIME,a.DATETIME) desc limit 2;

SELECT ao.animal_id, ao.name
from ANIMAL_INS a 
join ANIMAL_OUTS ao
on a.animal_id = ao.animal_id
order by DATEDIFF(ao.DATETIME,a.DATETIME) desc limit 2; -- 이렇게만 풀어도 정답이였다... 허무 

-- 50. 조건에 맞는 사용자와 총 거래금액 조회하기

SELECT u.user_id,u.nickname,sum(price) as total_sales
from USED_GOODS_BOARD b
join USED_GOODS_USER u
on b.writer_id = u.user_id
where  b.status like '%done%'
group by user_id having sum(price)>=700000
order by total_sales;

-- 51. 대여 기록이 존재하는 자동차 리스트 구하기
SELECT distinct c.car_id
from CAR_RENTAL_COMPANY_CAR c
join CAR_RENTAL_COMPANY_RENTAL_HISTORY h
on c.car_id = h.car_id
where c.car_type = '세단' and month(start_date)= '10'

order by c.car_id desc;

-- 52. 대여 횟수가 많은 자동차들의 월별 대여 횟수 구하기

SELECT month(start_date) as month , car_id,  COUNT(HISTORY_ID) AS RECORDS
from CAR_RENTAL_COMPANY_RENTAL_HISTORY 
where car_id in(select car_id from CAR_RENTAL_COMPANY_RENTAL_HISTORY where month(start_date) in (8,9,10)
                group by car_id having count(HISTORY_ID)>=5)
          AND MONTH(START_DATE) IN (8, 9, 10)
GROUP BY MONTH, CAR_ID
HAVING COUNT(HISTORY_ID) >= 1
ORDER BY MONTH
       , CAR_ID DESC;

-- 53. 즐겨찾기가 가장 많은 식당 정보 출력하기

SELECT FOOD_TYPE, rest_id, rest_name, FAVORITES
from rest_info 
where FAVORITES in (select max(FAVORITES) FROM rest_info GROUP BY FOOD_TYPE)
group by FOOD_TYPE
order by FOOD_TYPE desc;


-- 54 . 없어진 기록 찾기

SELECT oa.animal_id,oa.name
from ANIMAL_INS a 
right join ANIMAL_OUTS oa 
on a.animal_id = oa.animal_id
where a.animal_id is null 
order by 1;
-- 이건 라이트 조인을 무조건 해줘야한다. 

