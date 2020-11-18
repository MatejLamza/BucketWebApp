insert into users (username, password, enabled)
values ('admin', '$2a$10$eG28hqAjihXGfSyrNUji9OZEGnMNh66uQUjjIBU0OaaE4Os4u1tom', 1),
       ('student', '$2a$10$XUil1gwD8eWVxsCl4T0WmuvWr/u/eOR/colwWalMWa.4rw.BK7Unm', 1);

insert into authorities (username, authority)
values ('admin', 'ROLE_ADMIN'),
       ('admin', 'ROLE_USER'),
       ('student', 'ROLE_USER');

insert into user_names (id, name)
values (1, 'Solaire Astora');