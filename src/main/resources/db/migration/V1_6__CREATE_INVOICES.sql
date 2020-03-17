CREATE TABLE invoices
(
    id            serial           NOT NULL PRIMARY KEY,
    quantity      double precision NOT NULL,
    customer_id   integer          NOT NULL REFERENCES customers (id),
    restaurant_id integer          NOT NULL REFERENCES restaurants (id)
);

CREATE TABLE invoice_items
(
    id         serial           NOT NULL PRIMARY KEY,
    quantity   double precision NOT NULL,
    product_id integer UNIQUE REFERENCES restaurant_products (id)
);

CREATE TABLE invoice_line_items
(
    invoice_id    integer NOT NULL REFERENCES invoices (id),
    line_items_id integer NOT NULL UNIQUE REFERENCES invoice_items (id)
)