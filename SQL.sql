create table history (
id int auto_increment primary key,
habit_name varchar(50) not null
);

create table history_records (
history_id int,
records varchar(50) not null,
FOREIGN KEY (history_id) REFERENCES history (id)
);

insert into history (id, habit_name) values (1, "run");
insert into history (id, habit_name) values (2, "push-up");

insert into history_records (history_id, records) values (1, "ACHIEVED"), (1, "ACHIEVED"), (1, "ACHIEVED");
insert into history_records values (2, "ACHIEVED"), (2, "FAILED"), (2, "ACHIEVED");
