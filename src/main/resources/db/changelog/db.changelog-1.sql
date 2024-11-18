--liquibase formatted sql

--changeset dmitry:1
CREATE TABLE IF NOT EXISTS users
(
    id       BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    name     VARCHAR(64)        NOT NULL,
    username VARCHAR(64) UNIQUE NOT NULL,
    birthday DATE               NOT NULL
);

--changeset dmitry:2
CREATE TABLE IF NOT EXISTS cards
(
    id          BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    user_id     BIGSERIAL REFERENCES users (id),
    create_date TIMESTAMP NOT NULL,
    card_number UUID      NOT NULL
)