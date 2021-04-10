drop index if exists ix_auth_username;
drop table if exists my_authorities;
drop table if exists my_users;

create table my_users(
    username varchar(50)  not null,
    password varchar(255) not null,
    enabled  boolean      not null,
    primary key (username)
);

create table my_authorities(
    username  varchar(50) not null,
    authority varchar(50) not null,
    primary key (username, authority),
    foreign key (username) references my_users (username)
);

create
unique index ix_auth_username on my_authorities (username, authority);