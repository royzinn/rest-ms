CREATE TABLE restaurant_products (
    id serial not null primary key,
    item varchar(255),
    price double precision NOT NULL,
    restaurant_id integer NOT NULL REFERENCES restaurants(id)
);


