CREATE TABLE restaurants
(
    id                serial  NOT NULL PRIMARY KEY,
    description       varchar(255),
    image_description varchar(255),
    image_src         varchar(255),
    name              varchar(255),
    price_range       integer NOT NULL
);
