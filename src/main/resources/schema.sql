create table if not exists user_info (
    id varchar(20) not null primary key,
    pw varchar(20),
    email varchar(255)
);