-- もし既存のテーブルがあるなら削除して作り直す
DROP TABLE IF EXISTS DEPT;

create table users
(
    id         CHAR(26)  not null,
    name       CHAR(50)  not null,
    email      CHAR(50)  not null,
    password   CHAR(50)  not null,
    created_at TIMESTAMP not null,
    updated_at TIMESTAMP not null,
    primary key (id)
);

create table teams
(
    id      CHAR(26) not null,
    user_id CHAR(26) not null,
    primary key (id),
    foreign key (user_id) references users (id)
);


create table team_users
(
    id      CHAR(26) not null,
    team_id CHAR(26) not null,
    user_id CHAR(26) not null,
    primary key (id),
    foreign key (team_id) references teams (id),
    foreign key (user_id) references teams (id)
);

create table boards
(
    id         CHAR(26)  not null,
    team_id    CHAR(26)  not null,
    title      CHAR(50)  not null,
    image_url  text      not null,
    created_at TIMESTAMP not null,
    primary key (id),
    foreign key (team_id) references teams (id)
);


create table card
(
    id              CHAR(26) not null,
    created_user_id CHAR(26) not null,
    title           CHAR(50) not null,
    description     text     not null,
    manager_id      CHAR(26) not null,
    primary key (id),
    foreign key (created_user_id) references users (id),
    foreign key (manager_id) references users (id)
);

create table card_lists
(
    id      CHAR(26) not null,
    card_id CHAR(26) not null,
    primary key (id),
    foreign key (card_id) references card (id)
);


create table columns
(
    id           CHAR(26) not null,
    board_id     CHAR(26) not null,
    card_list_id CHAR(26) not null,
    position INTEGER not null,
    name         CHAR(50) not null,
    primary key (id),
    foreign key (board_id) references boards (id),
    foreign key (card_list_id) references boards (id)
);


