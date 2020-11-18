CREATE TABLE IF NOT EXISTS user_logins
(
    username varchar(20)  not null primary key,
    password varchar(100) not null,
    enabled  boolean      not null
);

CREATE TABLE IF NOT EXISTS auth
(
    username varchar(20) not null,
    role     varchar(20) not null,
    constraint fk_authorities_users foreign key (username) references user_logins (username)

);

create table if not exists user
(
    id   identity,
    name varchar(100) not null
);