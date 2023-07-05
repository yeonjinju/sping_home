-- 사용자 회원 정보를 저장할 테이블
CREATE TABLE tbl_member (
    userId      VARCHAR2(50)    not null,
    userPass    VARCHAR2(100)   not null,
    userName    VARCHAR2(30)    not null,
    userPhon    VARCHAR2(20)    not null,
    userAddr1   VARCHAR2(20)    null,
    userAddr2   VARCHAR2(50)    null,
    userAddr3   VARCHAR2(50)    null,
    regiDate    DATE            default sysdate,
    verify      NUMBER          default 0,
    primary key(userId)
);

--  상품 테이블
CREATE TABLE tbl_goods (
    gdsNum       NUMBER          not null,
    gdsName      VARCHAR2(50)    not null,
    cateCode     VARCHAR2(30)    not null,
    gdsPrice     NUMBER          not null,
    gdsStock     NUMBER          null,
    gdsDes       VARCHAR2(500)    null,
    gdsImg       VARCHAR2(200)    null,
    gdsDate      DATE            default sysdate,
    primary key(gdsNum)  
);
-- 상품 테이블의 상품번호의 자동입력을 위한 시퀀스 
CREATE SEQUENCE tbl_goods_seq;

-- 분류용 카테고리 테이블
CREATE TABLE goods_category (
    cateName     VARCHAR2(20)    not null,
    cateCode     VARCHAR2(30)    not null,
    cateCodeRef  VARCHAR2(30)    null,
    PRIMARY KEY(cateCode),
    foreign key(cateCodeRef) references goods_category(cateCode)
);

--  카테고리 테이블에서는 같은 테이블에서 참조가 발생하지만, 상품 테이블와 카테고리 테이블은 다른 테이블이기 때문에 별도로 쿼리를 작성해야합니다.
alter table tbl_goods add
    constraint fk_goods_category
    foreign key (cateCode)
        references goods_category(cateCode);
 

--  alter table [ 테이블 이름 ] add
--     constraint [ 제약조건 이름 ]
--     foreign key ([ 참조할 컬럼 이름 ])
--         references [ 참조되는 테이블 이름 ]([ 참조되는 컬럼 이름 ]);

 
       
       
-- 회원가입
INSERT INTO tbl_member(userId, userPass, userName, userPhon)
VALUES('아이디', '비밀번호', '닉네임', '전화번호');

select * from tbl_member;

-- 일반사용자용으로 사용할 아이디 
SELECT userId, verify
	FROM tbl_member;
	

UPDATE tbl_member
	SET 
		verify = 9
	WHERE userId = 'wnduswls21@gmail.com';
	


        


