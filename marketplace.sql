CREATE DATABASE IF NOT EXISTS marketplace;
CREATE USER testuser@localhost IDENTIFIED BY 'helloworld';
GRANT ALL PRIVILEGES ON marketplace.* TO testuser@localhost;
USE marketplace;

CREATE TABLE IF NOT EXISTS users
(
	user_id INT AUTO_INCREMENT PRIMARY KEY,
	username VARCHAR(255),
	password VARCHAR(255),
	email VARCHAR(255),
	contact VARCHAR(255),
	location VARCHAR(255),
	date_registered VARCHAR(255),
	usertype TINYINT(5)
)

CREATE TABLE IF NOT EXISTS category
(
	category_id INT AUTO_INCREMENT PRIMARY KEY,
	brand_name VARCHAR(255),
	model_name VARCHAR(255)
)

CREATE TABLE IF NOT EXISTS phones
(
	phone_id INT AUTO_INCREMENT PRIMARY KEY,
	operating_system VARCHAR(255),
	screen_size VARCHAR(255),
	memory_size VARCHAR(255),
	camera_pixel VARCHAR(255),
	battery_size VARCHAR(255)
)

CREATE TABLE IF NOT EXISTS comment_items
(
	comment_id INT AUTO_INCREMENT PRIMARY KEY,
	comment VARCHAR(255),
	username VARCHAR(255),
	post_id INT,
	date_comment
)

CREATE TABLE IF NOT EXISTS messages
(
	message_id INT AUTO_INCREMENT PRIMARY KEY,
	message_number INT,
	user_to VARCHAR(255),
	subject VARCHAR(255),
	content TEXT,
	user_from VARCHAR(255),
	date_send VARCHAR(255)
)

CREATE TABLE IF NOT EXISTS posted_items
(
	post_id INT AUTO_INCREMENT PRIMARY KEY,
	section INT,
	item_name VARCHAR(255),
	brand_name VARCHAR(255),
	price INT,
	condition VARCHAR(255),
	description TEXT,
	imagedata VARCHAR(255),
	date_posted VARCHAR(255),
	username VARCHAR(255)
)

CREATE TABLE IF NOT EXISTS ratings
(
	rate_id INT AUTO_INCREMENT PRIMARY KEY,
	status VARCHAR(255),
	comment TEXT,
	username VARCHAR(255),
	user_id INT,
	date_rated VARCHAR(255)
)
