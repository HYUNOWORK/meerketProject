# DATABASE 생성 및 선택
CREATE DATABASE IF NOT EXISTS spring;
use spring;
# 테이블 생성

DROP TABLE IF EXISTS member;
CREATE TABLE IF NOT EXISTS member(
userNo int primary KEY,
userId VARCHAR(20) NOT NULL,
name VARCHAR(10) NOT NULL,
nickname VARCHAR(10) NOT NULL,
pass VARCHAR(20) NOT NULL,
securityNumber VARCHAR(20) NOT NULL,
phone VARCHAR(13) NOT NULL,
email VARCHAR(30) NOT NULL,
address1 VARCHAR(80) NOT NULL,
address2 VARCHAR(60) NOT NULL,
zipcode VARCHAR(5) NOT NULL,
introduction VARCHAR(100) ,
image longblob, 
reg_date TIMESTAMP NOT NULL
);

INSERT INTO member VALUES(0, 'test01', '로그인테스트','로테',
'1234' , '1234', '010-1234-5678',
'test@test.com', '서울특별시 test동 12', '1동 101',
'00000', 'Hi My Name is Test', LOAD_FILE('C:\SQL\Image\test.JPG'),'0000-00-00 00:00:00');
commit;
SELECT * FROM member;