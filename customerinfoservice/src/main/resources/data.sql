DROP TABLE IF EXISTS customer;

CREATE TABLE `customer` (
  `customer_id` int NOT NULL AUTO_INCREMENT ,
 `customer_name` varchar(100) NOT NULL,
  `customer_address` varchar(100) NOT NULL,
	PRIMARY KEY (`customer_id`)
  
);


INSERT INTO `customer` (`customer_id`, `customer_name`, `customer_address`)
 VALUES (1, 'Johnson', 'chennai');
