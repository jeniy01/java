show user;

create table tbl_class(class_seq number(4), regist_month char(8), class_no char(5), class_area varchar2(15), tution number(8), teacher_code char(3));
create sequence class_seq;
insert into tbl_class values (class_seq.nextval, '202203', '10001', '서울본원', 100000, '100');
insert into tbl_class values (class_seq.nextval, '202203', '10002', '성남분원', 100000, '100');
insert into tbl_class values (class_seq.nextval, '202203', '10003', '부산분원', 200000, '200');
insert into tbl_class values (class_seq.nextval, '202203', '20001', '광주분원', 150000, '300');
insert into tbl_class values (class_seq.nextval, '202203', '20002', '대전분원', 200000, '400');
select * from tbl_class;
desc tbl_class;

create table tbl_member(member_seq number(4), member_no char(5), c_name varchar2(12), phone varchar2(11), address varchar2(50), regist_date char(8), member_type varchar2(12));
create sequence member_seq;
insert into tbl_member values (member_seq.nextval, '10001', '이다영', '01022221111', '서울시 강남구', '20220101', '일반');
insert into tbl_member values (member_seq.nextval, '10002', '이유섭', '01011112222', '서울시 성북구', '20220102', '일반');
insert into tbl_member values (member_seq.nextval, '10003', '이재호', '01022223333', '성남시 분당구', '20220103', '일반');
insert into tbl_member values (member_seq.nextval, '10004', '조태정', '01033334444', '부산시 서구', '20220104', '일반');
insert into tbl_member values (member_seq.nextval, '20001', '황병준', '01044445555', '광주시 남구', '20220105', 'VIP');
insert into tbl_member values (member_seq.nextval, '20002', '전재영', '01055556666', '대전시 유성구', '20220106', 'VIP');
select * from tbl_member;
desc tbl_member;

create table tbl_teacher(teacher_seq number(4), teacher_code char(3), class_name varchar2(12), teacher_name varchar2(11), class_price number(8) default 100000, teacher_regist_date char(8), contract date default sysdate);
create sequence teacher_seq start with 5;
insert into tbl_teacher values (teacher_seq.nextval, '100', '초급반', '김초급', 100000, '20220101', default);
insert into tbl_teacher values (teacher_seq.nextval, '200', '중급반', '이중급', 200000, '20220102', default);
insert into tbl_teacher values (teacher_seq.nextval, '300', '고급반', '박고급', 300000, '20220103', default);
insert into tbl_teacher values (teacher_seq.nextval, '400', '심화반', '조심화', 400000, '20220104', default);
select * from tbl_teacher;
desc tbl_teacher;

commit;

create table tbl_board(board_seq number(4), title varchar2(200), content varchar2(500), author char(40), resdate date);
create sequence board_seq;
insert into tbl_board values (board_seq.nextval, '게시글1제목', '첫 번째 게시글에 대한 내용입니다.', '관리자', '2023-01-01');
insert into tbl_board values (board_seq.nextval, '게시글제목2', '두 번째 공지사항입니다.', '초급반', '2023-01-02');
insert into tbl_board values (board_seq.nextval, '게시글3제목', '세 번째 업로드 자료입니다.', '고급반', '2023-01-03');
insert into tbl_board values (board_seq.nextval, '게시글제목4', '네 번째 게시글의 내용입니다.', '조심화', '2023-01-04');
select board_seq, title, content, author, to_char(resdate, 'YYYY/MM/DD') as resdate from tbl_board;
desc tbl_board;

commit;

show user;

alter table tbl_class add(classroom  varchar2(10) default 'A201');
select * from tbl_class;
desc tbl_class;

alter table tbl_member rename column member_no to cno;
desc tbl_member;

alter table tbl_teacher drop column contract;
desc tbl_teacher;

drop sequence member_seq;
drop table tbl_member;
create table tbl_member(member_seq number(4), member_no char(5), c_name varchar2(12), phone varchar2(11), address varchar2(50), regist_date char(8), member_type varchar2(12));
create sequence member_seq;
alter table tbl_member rename column member_no to cno;
alter table tbl_member add primary key(cno);
alter table tbl_class add primary key(class_no);
alter table tbl_member add constraint fk_cno foreign key(cno) references tbl_class (class_no);
select * from all_constraints where owner = 'TEST1';
select * from all_constraints where table_name = 'tbl_member';
select * from all_constraints where table_name = 'tbl_class';
alter table tbl_member drop constraint fk_cno;
insert into tbl_member values (member_seq.nextval, '10001', '이다영', '01022221111', '서울시 강남구', '20220101', '일반');
insert into tbl_member values (member_seq.nextval, '10002', '이유섭', '01011112222', '서울시 성북구', '20220102', '일반');
insert into tbl_member values (member_seq.nextval, '10003', '이재호', '01022223333', '성남시 분당구', '20220103', '일반');
insert into tbl_member values (member_seq.nextval, '10004', '조태정', '01033334444', '부산시 서구', '20220104', '일반');
insert into tbl_member values (member_seq.nextval, '20001', '황병준', '01044445555', '광주시 남구', '20220105', 'VIP');
insert into tbl_member values (member_seq.nextval, '20002', '전재영', '01055556666', '대전시 유성구', '20220106', 'VIP');
select * from tbl_member;
desc tbl_member;

create table tbl_notice as select * from tbl_board;
delete from tbl_notice;
select * from tbl_notice;

insert into tbl_class values (class_seq.nextval, '202203', '10004', '수원분원', 200000, '100', default);
insert into tbl_class values (class_seq.nextval, '202203', '20003', '청주분원', 150000, '400', default);
insert into tbl_class values (class_seq.nextval, '202203', '20004', '전주분원', 150000, '300', default);
insert into tbl_class values (class_seq.nextval, '202203', '10005', '고양분원', 200000, '100', default);
insert into tbl_class values (class_seq.nextval, '202203', '10006', '대구분원', 100000, '200', default);
select * from tbl_class;
drop table tbl_board;
select * from user_tables;

create table tbl_course as select class_no, class_area, tution, teacher_code, classroom from tbl_class;
alter table tbl_course add primary key(class_no);
alter table tbl_course drop primary key;
--alter table tbl_course add primary key(teacher_code);
alter table tbl_teacher add primary key(teacher_code);
alter table tbl_course add constraint fk_code foreign key(teacher_code) references tbl_teacher (teacher_code);
select * from all_constraints where owner = 'TEST1';
select * from all_constraints where table_name = 'tbl_source';
select * from all_constraints where table_name = 'tbl_teacher';
--alter table tbl_member drop constraint fk_code;

insert into tbl_teacher values (teacher_seq.nextval, '500', '전문반', '최전문', 500000, '20220105');
select * from tbl_teacher;
insert into tbl_course values ('20003', '서울본원', 250000, 500, 'A202');
select * from tbl_course;

create table tbl_class_2204 as select * from tbl_class;
select * from tbl_class_2204;
delete from tbl_class_2204 where class_no=10002;
select * from tbl_class_2204;
update tbl_class_2204 set class_area='의정부' where class_no=10003;
select * from tbl_class_2204;
 
update tbl_course set tution=tution+20000;
select * from tbl_course;

commit;










