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

DROP TABLE IF EXISTS `Login`;
CREATE TABLE Login (
                login_Id INT AUTO_INCREMENT NOT NULL,
                username VARCHAR(45) NOT NULL,
				password VARCHAR(45) NOT NULL,
                airline_password VARCHAR(20) NOT NULL,
                PRIMARY KEY (login_Id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


