CREATE TABLE order_customer
(
    customer_id integer NOT NULL REFERENCES customers (id),
    order_id    integer NOT NULL UNIQUE REFERENCES orders (id)
);