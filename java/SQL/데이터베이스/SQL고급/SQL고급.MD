## MYSQL안에서의 함수(즉 API)

## 수업 목표 

- SQL 코드작성에 수훨해지고 적용을 더 빠르게 하기위해서 
    알아두면 유용한 함수들이 많이 있다. 
- 아래 SQL 사이트를 참고해도 API자료가 많아서 좋다

[MYSQL DOCUMENT](https://dev.mysql.com/doc/refman/8.3/en/keywords.html)


![IMG](목표.png)

### 목차 
![IMG](목차.png)
<details>
<summary>1. 🐝내장함수 🐝    </summary>
<div markdown="1">



![IMG](내장함수/내장함수.png)

<details>
<summary> 🐝SQL내장함수 🐝    </summary>
<div markdown="1">

1. 내장함수 
2. Null 값 처리 
3. 행 번호 출력 
- 함수 
![IMG](내장함수/내장함수1.png)

- 내장함수
1.[x] 모든 내장함수는 최초에 선언될 때 유요한 입력 값을 받아야함  

1.[x] SQL 내장함수는 상수나 속석 이름을 입력 값으로 받아 **단일값으로 결과를 반환한다.**

![IMG](내장함수/내장함수2.png)
### 간단한 코드 예시 
```SQL
-- 1. 절대값을 출력하는 키워드 
SELECT ABS(-78),ABS(78);
-- 2. 소수점 반올림 하는 키워드 
SELECT round(4.875,1);
-- 3. 
SELECT CUSTID 고객번호, round(SUM(SALEPRICE)/COUNT(*),-2) 평균금액 
FROM ORDERS
group by CUSTID;
-- 라운드 플로우 셀 시험에 자주 나옴 SQLD


```

- 문자함수 
1.[x] 문자열에 대한 함수를 처리하는 키워드


- ![IMG](내장함수/문자함수.png)
### 간단한 코드 예시

```sql
-- 서점의 고객 중에서 같은 성을 가진 사람이 몇 명이나 되는지 성별 인원수를 구하시오 

-- SUBSTR은 문자열에서 지정된 자리에서부터 지정된 길이만큼 잘라서 반환 

SELECT SUBSTR(NAME,1,1) '성',COUNT(*) '인원'
FROM CUSTOMER
GROUP BY SUBSTR(NAME,1,1);

```
- 날짜시간함수
![img](내장함수/날짜시간함수.png)
### 간단한 코드 예시
```sql
-- 7. 서점은 주문일로부터 10일 후의 매출을 확정한다 각 주문의 확정일자를 구하시오.
SELECT ADDDATE(ORDERDATE, INTERVAL +10 DAY) '주문 확정일자'
FROM ORDERS
WHERE ORDERDATE;

-- 8. 서점이 2014년 7월 7일에 주문 받은 도서의 주문번호, 주문일, 고객번호, 도서번호를 모두 보이시오 
-- 단, 주문일은 '%Y-%m-%d'형태로 표시 
select orderid, date_format(orderdate,'%Y-%m-%d'), custid, bookid from orders;


-- 9. 현재 dbms의 시간을 출력하시오
select sysdate();
```

- 숫자함수
- ![img](내장함수/숫자함수.png)
</div>
</details>

<details>
<summary> 🐝NULL 값 처리  🐝    </summary>
<div markdown="1">

### Null 값처리 
- SQL 에서의 Null을 처리하는 방식 
![img](내장함수/NULL값처리.png)
- Null값을 출력하기 싫을때 이런식으로 사용하면 된다. 
![img](내장함수/NULL값처리2.png)
```sql
-- 이렇게 하면 전화번호가 없는 사람은 null이 아닌 연락처없음으로 출력이됨

SELECT NAME, ifnull(PHONE,"연락처없음") '전화번호' FROM CUSTOMER;

```
</div>
</details>

<details>
<summary> 🐝행 번호 출력   🐝    </summary>
<div markdown="1">

### 행을 단순하게 출력하기 위한 코드 
```SQL
-- 행 정렬  단순한 출력을 위한 코드  --뒤에는 실행 순서다
-- 포문의 실행 방식과 비슷하다고 생각하면 될듯하다. 
SET @SEQ:=0;  -- 1번 
SELECT (@SEQ:=@SEQ+1) '순번', CUSTID, NAME, PHONE -- 4번 
FROM CUSTOMER -- 2번 
WHERE @SEQ <=2; -- 3번 
```


</div>
</details>

</div>
</details>

<details>
<summary>2. 🐝뷰   🐝    </summary>
<div markdown="1">


🐝뷰의 생성 및 수정 삭제  🐝 

1. 뷰의 생성에 대한 코드 및 설명

![IMG](뷰/뷰의생성.png)

2. 뷰를 수정에 대한 코드 및 설명 

![IMG](뷰/뷰의수정.png)
- create or replace view 뷰명



## 위의 내용을 참조한 실습 코드 
```sql
-- VW_BOOK1 VW를 만드는 코드 
create view vw_book1
as
select *
from book
where bookname like '%축구%';

-- VW_BOOK1 조회 코드 

select * 
from vw_book1;

-- #####20번 대한민국을 포함한 고객을 뷰를 만들기 

-- VW_CUSTOMER 뷰 만드는 코드  
create or replace view vw_customer
as select* 
from customer 
where address like "%대한민국%";
select * 
from vw_customer;

-- #######21 번 오더테이블에 고객이름과 도서이름을 바로 확인할 수 있는 뷰를 생성한후
-- '김연아' 고객이 구입한 도서의 주문번호,도서이름,주문액을 보이시오


create view o_orders(orderid,custid,name,bookid,bookname,saleprice,orderdate)
as 
select od.orderid, od.custid,cs.name,od.bookid,bk.bookname,od.saleprice,od.orderdate
from orders od, customer cs, book bk
where od.custid = cs.custid and od.bookid = bk.bookid;

select orderid, bookname, saleprice from o_orders where name ="김연아";

-- 수정가능한 뷰 생성  or replace 
create or replace view o_orders(orderid,custid,name,bookid,bookname,saleprice,orderdate)
as 
select od.orderid, od.custid,cs.name,od.bookid,bk.bookname,od.saleprice,od.orderdate
from orders od, customer cs, book bk
where od.custid = cs.custid and od.bookid = bk.bookid;

select orderid, bookname, saleprice from o_orders where name ="김연아";

-- ######22번 20번의 뷰를 영국을 포함한 주소를 가진 고객으로 변경하시오 
create or replace view vw_customer(custid, name, address)
as select custid, name, address
from customer 
where address like '%영국%';
select * 
from vw_customer;

drop view o_orders;

-- 만든 뷰 들은 시스템 사탈로그에 저장이 된다. 
-- 문제풀이 


create or replace view highorders(bookid,bookname,name,publisher,price)
as
select b.bookid,b.bookname,c.name,b.publisher,b.price
from book b, customer c, orders o
where o.custid = c.custid and o.bookid = b.bookid and price>=20000;
select * 
from highorders;

select bookname, name 
from highorders;

create or replace view highorders(bookid,bookname,name,publisher)
as
select b.bookid,b.bookname,c.name,b.publisher
from book b, customer c, orders o
where o.custid = c.custid and o.bookid = b.bookid;

select *
from highorders;

```


</div>
</details>

<details>
<summary>3.  🐝 인덱스   🐝    </summary>
<div markdown="1">


인덱스  == 참조형 타입 == 객체
unique는 보조 인덱스

보조 인덱스는 여러개 생성 가능

클러스트형 인덱스는 참조형 타입(객체다)
인덱스를 먼저 기입하고 데이터를 넣는 것이 효율적이다.
why? 그렇지 않으면 작업을 두번하는것이 되기때문이다.
인덱스는 메모리를 꽤 잡아먹는다.(10%? 정확하지 않다.)

**저장 프로그램은 로직을 프로시저로 구현하여 객체형태로 사용한다.**
저장 프로그램은 일반 프로그래밍에서 사용하는 함수와 비슷한 개념이다.
작업 순서가 정해진 독립된 프로그램 수행단위이다.
프로시저가 정의된 다음 MySQL(DBMS)에 저장되어 저장 프로그램이라고 명칭한다.
저장 프로그램은 저장 루틴(routine) , 트리거(trigger), 이벤트(event)로 구성된다.
저장 루틴은 프로시저(procedure), 함수 (function) 분류된다.

## 실습코드 
```sql
use shopdb;
select * from producttbl where productName = '세탁기';
select count(*) from indextbl;

-- 테이블 생성 
create table indextbl2(first_name varchar(14), last_name varchar(16), hire_date date);



-- @@@@@@@@@@@테이블 복사해서 다른 테이블에 투플들을 복사해서 넣는것 쿼리@@@@@@@@@@@@@@  
insert into indextbl2 select first_name,last_name,hire_date from employees.employees limit 1000;
select count(*) from indextbl2;
-- indextbl2 에서 first_name = 'mary'인 사람을 찾기  
select * from indextbl2 where first_name = 'mary';

-- 여기서 문제점은 검색이 오래걸릴 수 있다는 점이다.
-- 그러면 우리는 여기서 index를 걸어주면 된다. 그러면 위에 문제를 좀 더 쉽게 해결할 수 있다. 
create index idx_indextbl2_firstname on indextbl2(first_name);


-- @@@@@@@@@@@@@@여기서 인덱스 수업@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

-- 위에 코드는 idx_indextbl2_firstname 은 인덱스 이름  indextbl2(first_name);
-- idx_indextbl2_firstname@@@@ 여기서는 indextbl2 테이블에 first_name에 인덱스를 걸었다. @@@@ 라는뜻
-- 인덱스로 인해 찾는 방법은? 
select * from indextbl2 ;

-- pk또한 클러스트형 인덱스이다 
-- pk (클러스트형 인덱스) - 테이블 당 한 개 
-- pk는 테이블 당 몇개가 생성이 가능할까? 1개다.
-- 테이블 생성시 제약 조건 primary key 또는 unique 를 사용하면 자동으로 인덱스가 생성된다. 
create table tbl1 ( a int primary key, b int, c int);
show index from tbl1; -- 보면 이렇게 pk를 걸어놓았더니 index가 하나있는것을 알 수 있다.
create table tbl2 ( a int primary key, b int unique, c int unique); -- unique 는 보조 index다 // 보조 index 는 여러개 생성 가능 
show index from tbl2;  -- unique 또한 index로 걸리기 떄문에 보이는걸 알 수 있다. but unique is null 
create table tbl3 ( a int primary key, b int unique not null, c int unique, d int); -- 이렇게 해놓으면 b도 클러스트형 인덱스가 된것이다. not null이기때문에 
show index from tbl3;
-- 클러스트형 인덱스가중요한 이유는? 행(row)을 자신의 열(column)을 기준으로 정렬을 할 수 있기 때문에 

-- 회원 usertbl1오ㅔ 회원2명 정보 입력 
create table usertbl2(userid char(8) primary key, name varchar(10) not null, birthyear int , addr varchar(40));
insert into usertbl2 select userid, name,birthyear,addr from usertbl;
select * from usertbl;
select * from usertbl2;
insert into usertbl2 values('KGB','김종봉',1987,'서울');
insert into usertbl2 values('YKL','임경림',1980,'제주');

ALTER TABLE usertbl2 drop primary key; -- pk 드랍 할수도 있음 
show index from usertbl2;
alter table usertbl2
	add constraint pk_name primary key(name);
select * from usertbl2;
show index from usertbl2;

-- @@@@@실습 총정리@@@@@ 
-- pk를 지정한 열은 클러스터형 인덱스가 된다. 
-- unique not null 지정한 열은 클러스트형 인덱스로 생성된다. 
-- unique (unique null) 지정한 열은 보조 인덱스가 생성된다. 
-- pk와 unique not null 지정한 열이 두 개가 있다면 pk의 열이 우선 클러스트형 인덱스가 생성된다. 
-- pk로 지정한 열로 데이터가 오름차순 정렬된다.
-- 인덱스는 데이터가 생성되기전에 미리 지정하는것이 좋다 
-- 인덱스는 한마디로 참조형 타입이다. 테이블 자체에 생성되는 것이 아니라 별도로 주소값을 갖고 생성되는것이다.  

```



![IMG](인덱스/인덱스목차.png)
![IMG](인덱스/데이터의물리적저장.png)
![IMG](인덱스/엑세스시간.png)
![IMG](인덱스/DBMS구조.png)
![IMG](인덱스/인덱스저장위치.png)
![IMG](인덱스/인덱스의종류.png)

![IMG](인덱스/B-tree.png)
![IMG](인덱스/B-tree1.png)
![IMG](인덱스/데이터저장예시.png)
![IMG](인덱스/데이터저장예시2.png)

</div>
</details>