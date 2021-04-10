INSERT INTO my_users (username, password, enabled) VALUES ('user', '$2a$10$wPHxwfsfTnOJAdgYcerBt.utdAvC24B/DWfuXfzKBSDHO0etB1ica', TRUE);
INSERT INTO my_users (username, password, enabled) VALUES ('admin', '$2a$10$wPHxwfsfTnOJAdgYcerBt.utdAvC24B/DWfuXfzKBSDHO0etB1ica', TRUE);

INSERT INTO my_authorities (username, authority) VALUES ('user', 'ROLE_USER');
INSERT INTO my_authorities (username, authority) VALUES ('admin', 'ROLE_USER');
INSERT INTO my_authorities (username, authority) VALUES ('admin', 'ROLE_ADMIN');