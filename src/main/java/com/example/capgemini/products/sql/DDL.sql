CREATE TABLE orders (
id_order INTEGER NOT NULL UNIQUE PRIMARY KEY,
sender_name VARCHAR(20) NOT NULL,
customer_name VARCHAR(50) NOT NULL,
status VARCHAR(20) NOT NULL
);

CREATE TABLE orderdetails (
id_order INTEGER NOT NULL,
id_product INTEGER NOT NULL,
quantity_ordered INTEGER NOT NULL,
price INTEGER NOT NULL,
PRIMARY KEY (id_order, id_product),
CONSTRAINT `orderdetails_ibfk_1` FOREIGN KEY (id_order) REFERENCES orders (id_order),
CONSTRAINT `orderdetails_ibfk_2` FOREIGN KEY (id_product) REFERENCES product (id_product)
);

CREATE TABLE product (
id_product INTEGER NOT NULL,
name VARCHAR(70) NOT NULL,
vendor VARCHAR(50) NOT NULL,
PRIMARY KEY (id_product)
);
