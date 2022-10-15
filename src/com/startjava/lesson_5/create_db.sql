DROP TABLE jagers;
--создание таблицы
CREATE TABLE jagers (
    ID SERIAL PRIMARY KEY,
    modelName TEXT,
    mark INT,
    height NUMERIC,
    weight NUMERIC,
    status TEXT,
    origin CHAR(3),
    launch DATE,
    kaijuKill INT
    );