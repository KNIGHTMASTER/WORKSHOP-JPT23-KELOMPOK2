-- drop the existing database
drop database minibankdb;

-- create the test user
create user test password 'test';

-- create the database
create database minibankdb owner test;
