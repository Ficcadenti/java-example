CREATE DATABASE  IF NOT EXISTS `hibernate_test` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `hibernate_test`;

-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: hibernate_test
-- ------------------------------------------------------
-- Server version	5.7.10-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tab_01`
--

DROP TABLE IF EXISTS `tab_01`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tab_01` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  `cognome` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tab_01`
--

LOCK TABLES `tab_01` WRITE;
/*!40000 ALTER TABLE `tab_01` DISABLE KEYS */;
INSERT INTO `tab_01` VALUES (1,'Raffaele','Ficcadenti','raffaele.ficcadenti@gmail.com'),(2,'Raffaele','Ficcadenti','raffaele.ficcadenti@gmail.com'),(3,'Raffaele','Ficcadenti','raffaele.ficcadenti@gmail.com'),(4,'Raffaele','Ficcadenti','raffaele.ficcadenti@gmail.com'),(5,'Raffaele','Ficcadenti','raffaele.ficcadenti@gmail.com'),(6,'Raffaele','Ficcadenti','raffaele.ficcadenti@gmail.com'),(7,'Raffaele','Ficcadenti','raffaele.ficcadenti@gmail.com'),(8,'Raffaele','Ficcadenti','raffaele.ficcadenti@gmail.com'),(9,'Raffaele','Ficcadenti','raffaele.ficcadenti@gmail.com'),(10,'Raffaele','Ficcadenti','raffaele.ficcadenti@gmail.com'),(11,'Raffaele','Ficcadenti','raffaele.ficcadenti@gmail.com'),(12,'Raffaele','Ficcadenti','raffaele.ficcadenti@gmail.com'),(13,'Raffaele','Ficcadenti','raffaele.ficcadenti@gmail.com'),(14,'Raffaele','Ficcadenti','raffaele.ficcadenti@gmail.com'),(15,'Raffaele','Ficcadenti','raffaele.ficcadenti@gmail.com'),(16,'Raffaele','Ficcadenti','raffaele.ficcadenti@gmail.com'),(17,'Raffaele','Ficcadenti','raffaele.ficcadenti@gmail.com'),(18,'Raffaele','Ficcadenti','raffaele.ficcadenti@gmail.com'),(19,'Valeria','Greco','valeria5.gr@gmail.com'),(20,'Valeria','Greco','valeria5.gr@gmail.com'),(21,'Valeria','Greco','valeria5.gr@gmail.com'),(22,'Valeria','Greco','valeria5.gr@gmail.com'),(23,'Valeria','Greco','valeria5.gr@gmail.com'),(24,'Valeria','Greco','valeria5.gr@gmail.com'),(25,'Valeria','Greco','valeria5.gr@gmail.com');
/*!40000 ALTER TABLE `tab_01` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'hibernate_test'
--

--
-- Dumping routines for database 'hibernate_test'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-01-26 13:45:23
