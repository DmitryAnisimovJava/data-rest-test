--liquibase formatted sql

--changeset dmitry:1
INSERT INTO users (id, name, username, birthday)
OVERRIDING SYSTEM VALUE VALUES
        (1, 'Jack', 'jack12', '1999-02-13'),
       (2,'Mark', 'mrknt', '2003-12-30'),
       (3, 'Jenna', 'lald123', '1989-03-24'),
       (4, 'Lisa', 'username1', '1996-07-03');

--changeset dmitry:2
INSERT INTO cards(user_id, create_date, card_number)
VALUES (1, now(), gen_random_uuid()),
       (1, now(), gen_random_uuid()),
       (1, now(), gen_random_uuid()),
       (2, now(), gen_random_uuid()),
       (2, now(), gen_random_uuid()),
       (3, now(), gen_random_uuid());
