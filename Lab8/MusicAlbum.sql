create table artists(
    id integer not null,
    name varchar(100) not null,
    country varchar(100),
    primary key (id)
);
create table albums(
    id integer not null,
    name varchar(100) not null,
    release_year integer not null,
    primary key (id)
);