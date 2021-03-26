CREATE DATABASE  IF NOT EXISTS `airtraffik`;
USE `airtraffik`;
--
-- Table structure for table `Ethnicity`
-- Table structure for table `user`

-- Table structure for table `lang`
--


DROP TABLE IF EXISTS `Ticket`;


CREATE TABLE Ticket (
                Ticket_Id INT AUTO_INCREMENT NOT NULL,
                DepartureLocation VARCHAR(45) NOT NULL,
				Destination VARCHAR(45) NOT NULL,
                DepartureTime datetime,
                ArrivalTime datetime,
                Price DOUBLE,
                PRIMARY KEY (Ticket_Id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


