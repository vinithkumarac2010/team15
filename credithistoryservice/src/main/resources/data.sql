DROP TABLE IF EXISTS crdrhistory;

CREATE TABLE `crdrhistory` (
  `customer_id` int NOT NULL,
  `amount` int NOT NULL,
 `crdr_ind` varchar(100) NOT NULL
);


INSERT INTO `crdrhistory` (`customer_id`, `amount`, `crdr_ind`)
 VALUES (1, 1500, 'CRD');
INSERT INTO `crdrhistory` (`customer_id`, `amount`, `crdr_ind`)
 VALUES (1, 500, 'CRD');
INSERT INTO `crdrhistory` (`customer_id`, `amount`, `crdr_ind`)
 VALUES (1, 2000, 'DBT');