-- もし既存のテーブルがあるなら削除して作り直す
DROP TABLE IF EXISTS DEPT;


CREATE TABLE USERS
(
    id         CHAR(26)  NOT NULL,
    name       VARCHAR   NOT NUll,
    email      VARCHAR   NOT NULL,
    password   VARCHAR   NOT NULL,
    created_at TIMESTAMP NOT NULL,
    updated_at TIMESTAMP NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE TEAMS
(
    id      CHAR(26) NOT NULL,
    user_id CHAR(26) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES USERS (id),
);


CREATE TABLE TEAM_USERS
(
    id      CHAR(26) NOT NULL,
    team_id CHAR(26) NOT NULL,
    user_id CHAR(26) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (team_id) REFERENCES TEAMS (id),
    FOREIGN KEY (user_id) REFERENCES TEAMS (id)
)

CREATE TABLE BOARDS
(
    id         CHAR(26)  NOT NULL,
    team_id    CHAR(26)  NOT NULL,
    title      CHAR(50)  NOT NULL,
    image_url  TEXT      NOT NULL,
    created_at TIMESTAMP NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (team_id) REFERENCES TEAMS (id)
)


CREATE TABLE CARD
(
    id              CHAR(26) NOT NULL,
    created_user_id CHAR(26) NOT NULL,
    title           CHAR(50) NOT NULL,
    description     TEXT     NOT NULL,
    title           CHAR(50) NOT NULL,
    manager_id      CHAR(26) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (created_user_id) REFERENCES USERS (id),
    FOREIGN KEY (manager_id) REFERENCES USERS (id),
)

CREATE TABLE CARD_LISTS
(
    id      CHAR(26) NOT NULL,
    card_id CHAR(26) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (card_id) REFERENCES CARD (id)
)


CREATE TABLE COLUMNS
(
    id           CHAR(26) NOT NULL,
    board_id     CHAR(26) NOT NULL,
    card_list_id CHAR(26) NOT NULL,
    index        INTEGER  NOT NULL,
    name         CHAR(20) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (board_id) REFERENCES BOARDS (id),
    FOREIGN KEY (card_list_id) REFERENCES BOARDS (id),
)


