## SQL실습문제 
### 24년 1월 18일 신세계 백엔드 DB
<details>
<summary>🐝SQL 실습문제 🐝    </summary>
<div markdown="1">

```SQL
-- 1. 구매 테이블에서 아이디가 
-- 'JYP'를 가진 사람이 구매한 물건을 발송하기 위해 이름/주소/연락처를 조회하시오.
select name,addr,mobile1,mobile2  -- concat(mobile1,mobile2) as 연락처 
from usertbl
where userid  = (select userid from buytbl where userid like 'JYP');
             
-- 다른 친구의 풀이 
select name,addr,concat(mobile1,mobile2) as 연락처  -- 이렇게 한 변수로 합칠
from usertbl
where userid  = (select userid from buytbl where userid like 'JYP');
             
-- 2. 전체 회원들이 구매한 목록 모두를 아이디 순으로 출력하세요
select *
from buytbl
group by userid
order by userid;
        
select * from buytbl;
select * from usertbl;
-- 3. 전체 회원의 구매기록을 조회하시오. 단, 구매 기록이 없는 회원도 출력하세요
select b.*, u.* 
from buytbl b left outer join usertbl u
on b.userid = u.userid;
        
-- 다른 친구의 풀이 
select b.*, u.* 
from buytbl b left join usertbl u
on b.userid = u.userid;
        
-- 4. 한번 도 구매한 적이 없는 회원의 아이디, 이름, 주소 , 연락처를 조회하세요 ★★★★★★★★★★★
select name,addr,concat(mobile1,mobile2) as 연락처 
from usertbl u left join buytbl b
on u.userid = b.userid
where b.userid is null; 

-- 다른 사람의 풀이 ★★★★★★★★★★★
select name,addr,concat(mobile1,mobile2) as 연락처 
from usertbl u left join buytbl b -- ★★★★★★★★ 
on u.userid = b.userid
where b.userID is null; -- ★★★★★★

            
-- 5. 우대리 상관의 연락처를 조회하세요 
select * from emptbl;
select * from buytbl;
select * from usertbl;

select manager '이름', emptel '연락처'
from emptbl
where emp = (select emp from emptbl where emp like '%우대리');
   
-- 다른사람풀이 (셀프조인 사용방법) ★★★★★★★★


-- 6.usertbl에서 사용자를 조회하되 전화번호가 없는 사람을 제외하여 조회하세요 
select * 
from usertbl
where not mobile1 is null and not mobile2 is null; -- ★★★ null 사용 방법 
-- 다른사람 풀이 
SELECT u1.*
FROM usertbl u1
JOIN usertbl u2 ON u1.userID = u2.userID
WHERE (u1.mobile1 IS NOT NULL OR u1.mobile2 IS NOT NULL) AND u2.userID = u1.userID;

-- 7.usertbl에서 전화가 없는 사람만 조회하세요 
select *
from usertbl
where mobile1 is null;
    
-- 다른 사람 풀이 
select * from usertbl where mobile1 is null;

-- 셀프조인 사용 방법
-- 8. 학생 테이블, 동아리 테이블, 학생동아리 테이블을 이용해서 학생을 기준으로 학생 이름
-- / 지역/가입한 동아리/동아리 방 을 조회하세요
select * from clubtbl;
select * from stdtbl;
select * from stdclubtbl;
			
        
select s.stdname,
s.addr,
sc.clubname,
c.roomno
from stdtbl s,clubtbl c, stdclubtbl sc
where s.stdname = sc.stdname and sc.clubname = c.clubname;
              
-- 다른 사람 풀이 
select s.stdname, s.addr, sc.clubname, c.roomno
from stdtbl s join
stdclubtbl sc on s.stdname = sc.stdname
join clubtbl on sc.clubname = c.clubname;
              
             
              
-- 9. 동아리를 기준으로 가입한 학생의 목록을 조회하세요
select 
sc.clubname,
c.roomno,
s.stdname,
s.addr
from stdtbl s,clubtbl c, stdclubtbl sc
where s.stdname = sc.stdname and sc.clubname = c.clubname
order by sc.clubname;
              
-- 다른사람 풀이 
select * 
from stdclubtbl sc
join stdtbl as s 
on sc.stdname = s.stdname;
-- 서브쿼리 사용방법 
select * 
from stdclubtbl as sc
where sc.stdname in(select stdnamefrom stdtbl);
   
select s.stdname from stdtbl s 
where stdname in(
select sc.stdname
from stdclubtbl sc
where sc.stdname is not null);
   
-- ★★★★★★★★★★★★★★★★★★★ㅍ 여기서부터는 내가 풀지 못했음 
-- 10.동아리에 가입되지 않은 학생의 이름도 포함하여 학생의 이름/주소/동아리명/동아리 방 조회하세요
select		 
s.stdname,
s.addr,
sc.clubname,
c.roomno
from stdtbl s,clubtbl c, stdclubtbl sc
where s.stdname = sc.stdname and sc.clubname = c.clubname;
-- 다른사람 풀이 
select s.stdname, s.addr, sc.clubname, c.roomno
from stdtbl s  
left outer join stdclubtbl sc on s.stdname = sc.stdname
left outer join clubtbl c on c.clubname = sc.clubname;              
 
 
 -- 11. 동아리 기준으로 가입된 학생을 출력하되, 가입학생이 하나도 없는 동아리(이름/주소/동아리명/동아리 방) 조회하세요.

 
select s.stdname, s.addr, c.clubname, c.roomno 
from clubtbl c
left outer join stdclubtbl sc on sc.clubname = c.clubname
left outer join stdtbl s on sc.stdname = s.stdname;
 
-- 12. 동아리에 가입하지 않은 학생도 출력하고, 학생이 한 명도 없는 동아리도 조회 하세요.
select s.stdname, s.addr, c.clubname, c.roomno 
from clubtbl c
left outer join stdclubtbl sc on sc.clubname = c.clubname
left outer join stdtbl s on sc.stdname = s.stdname
union
select s.stdname, s.addr, c.clubname, c.roomno 
from clubtbl c
right outer join stdclubtbl sc on sc.clubname = c.clubname
right outer join stdtbl s on sc.stdname = s.stdname;
    
    
    
     
```

</div>
</details>
