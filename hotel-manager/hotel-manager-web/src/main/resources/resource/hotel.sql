create database hotel;
use hotel;

drop table if exist tb_admin;
create table tb_admin(
	admin_id varchar(30) not null,
	admin_account varchar(30) not null,
	admin_password varchar(30) not null,
	permissions varchar(10) not null,
	PRIMARY KEY (admin_id)
);

drop table if exist tb_account;

create table tb_account(
	account_id varchar(30) not null,
	account varchar(30) not null,
	password varchar(30) not null,
	name varchar(10) not null,
	phone_number varchar(20) not null,
	PRIMARY KEY (account_id)
);

drop table if exist tb_user;
create table tb_user(
	id_card varchar(30) not null,
	name varchar(10) not null,
	sex varchar(2) not null,
	phone_number varchar(20) not null,
	address varchar(50) not null,
	PRIMARY KEY (id_card)
);

drop table if exist tb_room;
create table tb_room(
	room_id varchar(10),
	root_type varchar(10) not null,
	price float not null,
	free  tinyint(1) not null,
	scheduled tinyint(1) not null,
	abandoned tinyint(1) not null,
	euqipment varchar(200) not null,
	remark varchar(200) not null,
	PRIMARY KEY (room_id)
);

drop table if exist tb_order;
create table tb_order(
	order_id varchar(50) not null,
	name varchar(10) not null,
	phone_number varchar(20) not null,
	room_count int not null,
	room_type varchar(10) not null,
	order_time datetime not null,
	entry_time datetime not null,
	leave_time datetime not null,
	is_pay     tinyint(1) not null,
	PRIMARY KEY (order_id)
);
drop table if exist tb_accommodation;	
create table tb_accommodation(
	accommodation_id varchar(30) not null,
	id_card varchar(30) not null,
	room_id varchar(10) not null,
	entry_time datetime not null,
	leave_time datetime not null,
	days int not null,
	PRIMARY KEY (accommodation_id)
);
ALTER TABLE tb_accommodation ADD CONSTRAINT fk_accommodation_user
FOREIGN KEY (id_card)
REFERENCES tb_user(id_card);

ALTER TABLE tb_accommodation ADD CONSTRAINT fk_accommodation_room
FOREIGN KEY (room_id)
REFERENCES tb_room(room_id);
drop table if exist tb_leave;	
create table tb_leave(
	leave_id varchar(30) not null,
	leave_time datetime not null,
	id_card varchar(30) not null,
	room_id varchar(10) not null,
	spend_money float not null,
	remain_money float not null,
	PRIMARY KEY (leave_id)
);

ALTER TABLE tb_leave ADD CONSTRAINT fk_leave_user
FOREIGN KEY (id_card)
REFERENCES tb_user(id_card);

ALTER TABLE tb_leave ADD CONSTRAINT fk_stayout_room
FOREIGN KEY (room_id)
REFERENCES tb_room(room_id);
