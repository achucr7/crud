

CREATE TABLE salesrep(
        id INT Primary key NOT NULL,
        name VARCHAR NOT NULL,
        opening_sales decimal(10,5),
        closing_sales decimal(10,5)

);

CREATE TABLE repdetails(
        id INT primary key not null,
        address VARCHAR,
        number VARCHAR,
        salary decimal(10,5)
);

