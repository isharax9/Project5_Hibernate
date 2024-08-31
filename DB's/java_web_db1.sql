-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.0.34 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             12.4.0.6659
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- Dumping data for table java_web_db1.country: ~6 rows (approximately)
DELETE FROM `country`;
INSERT INTO `country` (`id`, `name`) VALUES
	(1, 'LK'),
	(2, 'SWD'),
	(3, 'IN'),
	(4, 'JP'),
	(5, 'US'),
	(6, 'UK');

-- Dumping data for table java_web_db1.user: ~4 rows (approximately)
DELETE FROM `user`;
INSERT INTO `user` (`id`, `name`, `mobile`, `country_id`) VALUES
	(1, 'Ishara', '0710351156', 1),
	(2, 'Lakshan', '0710444100', 6),
	(3, 'Tharuka', '0710444101', 2),
	(4, 'Nimal', '0716092775', 5);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
