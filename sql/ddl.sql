
create database if not exists my_db;

use my_db;

create table if not exists user
(
    id           bigint auto_increment comment 'id' primary key,
    userName     varchar(256)                           null ,
    userAccount  varchar(256)                           not null ,
    userAvatar   varchar(1024)                          null ,
    gender       tinyint                                null ,
    userRole     varchar(256) default 'user'            not null ,
    userPassword varchar(512)                           not null ,
    createTime   datetime     default CURRENT_TIMESTAMP not null ,
    updateTime   datetime     default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP,
    isDelete     tinyint      default 0                 not null,
    constraint uni_userAccount
        unique (userAccount)
);

create table if not exists post
(
    id            bigint auto_increment  primary key,
    age           int ,
    gender        tinyint  default 0                 not null ,
    education     varchar(512)                       null ,
    place         varchar(512)                       null ,
    job           varchar(512)                       null ,
    contact       varchar(512)                       null ,
    loveExp       varchar(512)                       null ,
    content       text                               null ,
    photo         varchar(1024)                      null ,
    reviewStatus  int      default 0                 not null ,
    reviewMessage varchar(512)                       null ,
    viewNum       int                                not null default 0 ,
    thumbNum      int                                not null default 0 ,
    userId        bigint                             not null,
    createTime    datetime default CURRENT_TIMESTAMP not null,
    updateTime    datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP,
    isDelete      tinyint  default 0                 not null
);