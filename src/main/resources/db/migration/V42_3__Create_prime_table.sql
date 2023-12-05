create extension if not exists "uuid-ossp";

create table if not exists prime
(
    id                varchar
    constraint prime_pk primary key                 default uuid_generate_v4(),
    value text not null,
    creation_datetime timestamp with time zone not null
);