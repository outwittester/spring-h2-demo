create table book(
    id int auto_increment,
    title varchar(50) not null,
    pages int not null,
    author varchar(50)
);

insert into book(title, pages, author)
values ( 'spring boot h2',222,'Xikai Xiong' )