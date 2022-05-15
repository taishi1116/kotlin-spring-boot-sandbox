-- もし既存のテーブルがあるなら削除して作り直す
DROP TABLE IF EXISTS DEPT;


CREATE TABLE USERS
(
    id         INTEGER AUTO_INCREMENT NOT NULL,
    name       VARCHAR   NOT NUll,
    email      VARCHAR   NOT NULL,
    password   VARCHAR   NOT NULL,
    created_at TIMESTAMP NOT NULL,
    updated_at TIMESTAMP NOT NULL,
    PRIMARY KEY (id)
)
