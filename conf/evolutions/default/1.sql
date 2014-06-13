# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table company (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  address                   varchar(255),
  zip_code                  integer,
  constraint pk_company primary key (id))
;

create table post (
  id                        bigint auto_increment not null,
  user_id                   bigint,
  company_id                bigint,
  title                     varchar(255),
  content                   varchar(255),
  date                      datetime,
  applied                   bigint,
  constraint pk_post primary key (id))
;

create table user (
  id                        bigint auto_increment not null,
  user_name                 varchar(255),
  address                   varchar(255),
  zip_code                  integer,
  constraint pk_user primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table company;

drop table post;

drop table user;

SET FOREIGN_KEY_CHECKS=1;

