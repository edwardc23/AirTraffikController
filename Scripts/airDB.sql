CREATE DATABASE  IF NOT EXISTS `airtraffik`;
USE `airtraffik`;
--
-- Table structure for table `Ethnicity`
-- Table structure for table `user`

-- Table structure for table `lang`
--


DROP TABLE IF EXISTS `Ticket`;


CREATE TABLE Ticket (
                ticket_id INT AUTO_INCREMENT NOT NULL,
                departure_location VARCHAR(45) NOT NULL,
				destination VARCHAR(45) NOT NULL,
                departure_time datetime,
                arrival_time datetime,
                price DOUBLE,
                PRIMARY KEY (Ticket_Id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


