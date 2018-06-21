DROP DATABASE IF EXISTS marketplace;
CREATE DATABASE IF NOT EXISTS marketplace;
CREATE USER testuser@localhost IDENTIFIED BY 'helloworld';
GRANT ALL PRIVILEGES ON marketplace.* TO testuser@localhost;
USE marketplace;

CREATE TABLE IF NOT EXISTS users
(
	user_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	username VARCHAR(255),
	password VARCHAR(255),
	email VARCHAR(255),
	contact VARCHAR(255),
	location VARCHAR(255),
	date_registered VARCHAR(255),
	usertype TINYINT(5)
);

INSERT INTO users (username, password, email, contact, location, date_registered, usertype) VALUES ('Admin', 'asdf123', 'admin@admin.com', '09091234567', 'Laguna', '06-20-2018', 1);
INSERT INTO users (username, password, email, contact, location, date_registered, usertype) VALUES ('benteboy', '123asdf', 'benteboy@admin.com', '09191234567', 'Cavite', '06-21-2018', 2);
INSERT INTO users (username, password, email, contact, location, date_registered, usertype) VALUES ('cellboy', '123asdf', 'cellboy@admin.com', '09071234567', 'Makati', '06-22-2018', 2);

CREATE TABLE IF NOT EXISTS category
(
	category_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	brand_name VARCHAR(255),
	model_name VARCHAR(255)
);

INSERT INTO category (brand_name, model_name) VALUES ('Apple', 'Iphone 6');
INSERT INTO category (brand_name, model_name) VALUES ('Samsung', 'Samsung Galaxy Note S8+');
INSERT INTO category (brand_name, model_name) VALUES ('Xiaomi', 'Redmi 4x');

CREATE TABLE IF NOT EXISTS posted_items
(
	post_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	section_type VARCHAR(255),
	category_id INT,
	price INT,
	item_condition VARCHAR(255),
	description TEXT,
	imagedata VARCHAR(255),
	date_posted VARCHAR(255),
	user_id INT,
	FOREIGN KEY (user_id) REFERENCES users(user_id),
	FOREIGN KEY (category_id) REFERENCES category(category_id)
);

INSERT INTO posted_items (section_type, category_id, price, item_condition, description, imagedata, date_posted, user_id) VALUES ('for sale', 2, 45000, 'brand new', 'Good item comes with accessories', 'pic.jpg', '06-25-2018', 2);
INSERT INTO posted_items (section_type, category_id, price, item_condition, description, imagedata, date_posted, user_id) VALUES ('looking for', 1, 25000, 'second hand', 'No hiddend defects must comes with charger', 'pic2.jpg', '06-26-2018', 3);
INSERT INTO posted_items (section_type, category_id, price, item_condition, description, imagedata, date_posted, user_id) VALUES ('for sale', 3, 5000, 'defective', 'No power, Dead motherboard', 'pic3.jpg', '06-27-2018', 1);

CREATE TABLE IF NOT EXISTS comment_items
(
	comment_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	comments VARCHAR(255),
	user_id INT,
	date_comment VARCHAR(255),
	post_id INT,
	FOREIGN KEY (post_id) REFERENCES posted_items(post_id),
	FOREIGN KEY (user_id) REFERENCES users(user_id)
);

INSERT INTO comment_items (comments, user_id, date_comment, post_id) VALUES ('How much last price?', 2, '06-25-2018', 1);
INSERT INTO comment_items (comments, user_id, date_comment, post_id) VALUES ('I have brand new for 5000 only', 3, '06-26-2018', 2);
INSERT INTO comment_items (comments, user_id, date_comment, post_id) VALUES ('How much last price?', 2, '06-27-2018', 3);

CREATE TABLE IF NOT EXISTS messages
(
	message_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	message_number INT,
	user_id INT,
	subject VARCHAR(255),
	content TEXT,
	user_from VARCHAR(255),
	date_send VARCHAR(255),
	post_id INT,
	FOREIGN KEY (post_id) REFERENCES posted_items(post_id),
	FOREIGN KEY (user_id) REFERENCES users(user_id)
);

INSERT INTO messages (message_number, user_id, subject, content, user_from, date_send, post_id) VALUES (1, 2, '[BNEW][Samsung][Galaxy Note 8+]', 'Factory unlocked and sealed', 'cellboy', '06-27-2018', 2);

CREATE TABLE IF NOT EXISTS ratings
(
	rate_id INT AUTO_INCREMENT PRIMARY KEY,
	status VARCHAR(255),
	comments TEXT,
	user_id INT,
	date_rated VARCHAR(255),
	FOREIGN KEY (user_id) REFERENCES users(user_id)
);

INSERT INTO ratings (status, comments, user_id, date_rated) VALUES ('Dislike', 'The box is open and not sealed', 2, '06-28-2018');