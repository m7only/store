--liquibase formatted sql

--changeSet skryagin:1
INSERT INTO product_types(id, title)
VALUES (1, 'Настольные компьютеры');
INSERT INTO product_types(id, title)
VALUES (2, 'Ноутбуки');
INSERT INTO product_types(id, title)
VALUES (3, 'Мониторы');
INSERT INTO product_types(id, title)
VALUES (4, 'Жесткие диски');

INSERT INTO additional_properties(id, title)
VALUES (1, 'Форм-фактор');
INSERT INTO additional_properties(id, title)
VALUES (2, 'Размер, дюйм');
INSERT INTO additional_properties(id, title)
VALUES (3, 'Диагональ, дюйм');
INSERT INTO additional_properties(id, title)
VALUES (4, 'Объем');

INSERT INTO products(serial_number, manufacturer, price, quantity, product_type_id, additional_property_id,
                     additional_property_value)
VALUES ('Комбугтер 1', 'HP', 100.00, 1, 1, 1, 'Десктоп');

INSERT INTO products(serial_number, manufacturer, price, quantity, product_type_id, additional_property_id,
                     additional_property_value)
VALUES ('Комбугтер 2', 'Acer', 200.00, 2, 1, 1, 'Неттоп');

INSERT INTO products(serial_number, manufacturer, price, quantity, product_type_id, additional_property_id,
                     additional_property_value)
VALUES ('Комбугтер 3', 'Apple', 300.00, 3, 1, 1, 'Моноблок');

INSERT INTO products(serial_number, manufacturer, price, quantity, product_type_id, additional_property_id,
                     additional_property_value)
VALUES ('Ноутбуг 1', 'HP', 100.00, 10, 2, 2, '13');
INSERT INTO products(serial_number, manufacturer, price, quantity, product_type_id, additional_property_id,
                     additional_property_value)
VALUES ('Ноутбуг 2', 'Apple', 200.00, 11, 2, 2, '14');
INSERT INTO products(serial_number, manufacturer, price, quantity, product_type_id, additional_property_id,
                     additional_property_value)
VALUES ('Ноутбуг 3', 'Acer', 300.00, 12, 2, 2, '15');

INSERT INTO products(serial_number, manufacturer, price, quantity, product_type_id, additional_property_id,
                     additional_property_value)
VALUES ('Монитор 1', 'HP', 100.00, 10, 3, 2, '21');
INSERT INTO products(serial_number, manufacturer, price, quantity, product_type_id, additional_property_id,
                     additional_property_value)
VALUES ('Монитор 2', 'Apple', 200.00, 11, 3, 3, '22');
INSERT INTO products(serial_number, manufacturer, price, quantity, product_type_id, additional_property_id,
                     additional_property_value)
VALUES ('Мониторчик 3', 'Acer', 300.00, 12, 3,3, '24');

INSERT INTO products(serial_number, manufacturer, price, quantity, product_type_id, additional_property_id,
                     additional_property_value)
VALUES ('Хард 1', 'Seagate', 100.00, 10, 4, 4, '1 TB');
INSERT INTO products(serial_number, manufacturer, price, quantity, product_type_id, additional_property_id,
                     additional_property_value)
VALUES ('Хард 2', 'Barracuda', 200.00, 11, 4, 4, '500 GB');
INSERT INTO products(serial_number, manufacturer, price, quantity, product_type_id, additional_property_id,
                     additional_property_value)
VALUES ('Хард 3', 'NoName', 300.00, 12, 4,4, '15 Mb');