use sqldb;

create table stdTbl ( stdName varchar(10) not null primary key,
                      addr char(4) not null );
                      
                      
create table clubtbl ( clubName varchar(10) not null primary key,
                      roomNo char(4) not null );


create table stdclubTbl ( 
             num int auto_increment NOT NULL primary key,
             stdName varchar(10) not null,
			 clubName varchar(10) not null,
			 foreign key(stdName) references stdtbl(stdName),
			 foreign key(clubName) references clubtbl(clubName));
             

insert into stdtbl values ('김범수','경남'),('성시경','서울'),('이효리','제주'),('BTS 진','서울'),('블랙핑크 제니','경북');

insert into clubtbl values ('수영','101호'),('바둑','102호'),('축구','103호'),('노래','104호'),('춤','105호');

insert into stdclub values (null,'김범수','바둑'),(null,'김범수','축구'),(null,'이효리','춤'),(null,'BTS 진','노래'),(null,'블랙핑크 제니','노래'),(null,'블랙핑크 제니','춤');

            
            