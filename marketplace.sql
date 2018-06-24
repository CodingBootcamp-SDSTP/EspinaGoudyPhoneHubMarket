CREATE DATABASE IF NOT EXISTS phonehubmarket;
CREATE USER testuser@localhost IDENTIFIED BY 'helloworld';
GRANT ALL PRIVILEGES ON phonehubmarket.* TO testuser@localhost;
USE phonehubmarket;

CREATE TABLE `users` (
	`user_id` int NOT NULL AUTO_INCREMENT,
	`username` varchar(255) NOT NULL,
	`password` varchar(255) NOT NULL,
	`email` varchar(255) NOT NULL,
	`contact` varchar(255) NOT NULL,
	`location` varchar(255) NOT NULL,
	`date_registered` DATE NOT NULL,
	PRIMARY KEY (`user_id`)
);

CREATE TABLE `login_history` (
	`login_id` int NOT NULL AUTO_INCREMENT,
	`login_in` TIMESTAMP NOT NULL,
	`log_out` TIMESTAMP NOT NULL,
	`user_id` int NOT NULL,
	PRIMARY KEY (`login_id`)
);

CREATE TABLE `phones` (
	`phone_id` int NOT NULL AUTO_INCREMENT,
	`brand_name` varchar(255) NOT NULL,
	`model_name` varchar(255) NOT NULL,
	`operating_system` varchar(255) NOT NULL,
	`processor` varchar(255) NOT NULL,
	`screen_size` varchar(255) NOT NULL,
	`ram_size` varchar(255) NOT NULL,
	`storage_size` varchar(255) NOT NULL,
	`camera` varchar(255) NOT NULL,
	`battery_size` varchar(255) NOT NULL,
	`sim_slot` varchar(255) NOT NULL,
	PRIMARY KEY (`phone_id`)
);

CREATE TABLE `posted_items` (
	`post_id` int NOT NULL AUTO_INCREMENT,
	`user_id` int(255) NOT NULL,
	`phone_id` int NOT NULL,
	`post_type` varchar(255) NOT NULL,
	`item_condition` varchar(255) NOT NULL,
	`price` int(255) NOT NULL,
	`photo` blob(255) NOT NULL,
	`description` TEXT NOT NULL,
	`date_posted` TIMESTAMP NOT NULL,
	PRIMARY KEY (`post_id`)
);

CREATE TABLE `feedbacks` (
	`feedback_id` int NOT NULL AUTO_INCREMENT,
	`user_id` int NOT NULL,
	`post_id` int NOT NULL,
	`feedback_type` varchar(255) NOT NULL,
	`message_body` TEXT NOT NULL,
	`date_feedback` TIMESTAMP NOT NULL,
	PRIMARY KEY (`feedback_id`)
);

CREATE TABLE `messages` (
	`message_id` int NOT NULL AUTO_INCREMENT,
	`post_id` int NOT NULL,
	`user_id` int NOT NULL,
	`message_body` TEXT NOT NULL,
	`date_message` TIMESTAMP NOT NULL,
	PRIMARY KEY (`message_id`)
);

CREATE TABLE `comment_items` (
	`comment_id` int NOT NULL AUTO_INCREMENT,
	`post_id` int NOT NULL,
	`user_id` int NOT NULL,
	`message_body` TEXT NOT NULL,
	`date_comment` TIMESTAMP NOT NULL,
	PRIMARY KEY (`comment_id`)
);

ALTER TABLE `login_history` ADD CONSTRAINT `login_history_fk0` FOREIGN KEY (`user_id`) REFERENCES `users`(`user_id`);

ALTER TABLE `posted_items` ADD CONSTRAINT `posted_items_fk0` FOREIGN KEY (`user_id`) REFERENCES `users`(`user_id`);

ALTER TABLE `posted_items` ADD CONSTRAINT `posted_items_fk1` FOREIGN KEY (`phone_id`) REFERENCES `phones`(`phone_id`);

ALTER TABLE `feedbacks` ADD CONSTRAINT `feedbacks_fk0` FOREIGN KEY (`user_id`) REFERENCES `users`(`user_id`);

ALTER TABLE `feedbacks` ADD CONSTRAINT `feedbacks_fk1` FOREIGN KEY (`post_id`) REFERENCES `posted_items`(`post_id`);

ALTER TABLE `messages` ADD CONSTRAINT `messages_fk0` FOREIGN KEY (`post_id`) REFERENCES `posted_items`(`post_id`);

ALTER TABLE `messages` ADD CONSTRAINT `messages_fk1` FOREIGN KEY (`user_id`) REFERENCES `users`(`user_id`);

ALTER TABLE `comment_items` ADD CONSTRAINT `comment_items_fk0` FOREIGN KEY (`post_id`) REFERENCES `posted_items`(`post_id`);

ALTER TABLE `comment_items` ADD CONSTRAINT `comment_items_fk1` FOREIGN KEY (`user_id`) REFERENCES `users`(`user_id`);


