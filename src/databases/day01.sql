-- (1) 현재 DB서버의 모든 데이터베이스 목록 확인
-- show databases;
-- (2) 현재 DB서버의 실제 로컬 경로 확인
show variables like 'datadir'; -- /opt/homebrew/var/mysql
-- (3) 현재 DB서버의 나만의 데이터베이스 생성
create database mydb0130;

drop database if exists mydb0130;
show databases;

use mydb0130;