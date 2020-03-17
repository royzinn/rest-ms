CREATE TABLE order_product
(
    orders_id   integer NOT NULL REFERENCES orders (id),
    products_id integer NOT NULL UNIQUE REFERENCES restaurant_products (id)
);