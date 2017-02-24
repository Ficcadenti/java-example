CREATE DATABASE  IF NOT EXISTS `phpexample` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `phpexample`;
-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: phpexample
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
  `Nome` varchar(45) DEFAULT NULL,
  `Cognome` varchar(45) DEFAULT NULL,
  `e-mail` varchar(45) DEFAULT NULL,
  `Telefono` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tab_01`
--

LOCK TABLES `tab_01` WRITE;
/*!40000 ALTER TABLE `tab_01` DISABLE KEYS */;
INSERT INTO `tab_01` VALUES (1,'Raffaele','Ficcadenti','raffaele.ficcadenti@gmail.com','3404020010'),(2,'tert','er','roberto.greco@gmail.com','ertr');
/*!40000 ALTER TABLE `tab_01` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tab_contvisite`
--

DROP TABLE IF EXISTS `tab_contvisite`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tab_contvisite` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_visit` int(11) DEFAULT NULL,
  `last_visit` int(11) DEFAULT NULL,
  `num_visit` int(11) DEFAULT NULL,
  `total_duration` int(11) DEFAULT NULL,
  `total_clicks` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 COMMENT='Tabella di esempio per contare le visite di un sito';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tab_contvisite`
--

LOCK TABLES `tab_contvisite` WRITE;
/*!40000 ALTER TABLE `tab_contvisite` DISABLE KEYS */;
INSERT INTO `tab_contvisite` VALUES (1,1476794771,1476871620,4,1,46),(2,1476794953,1476794953,1,0,0),(3,1476796088,1476796088,1,0,0),(4,1476796091,1476796091,1,0,0),(5,1476796092,1476796092,1,0,0),(6,1476796109,1476796109,1,0,0),(7,1476796207,1477561000,4,2,12),(8,1477560707,1477560707,1,0,0),(9,1477560716,1477560716,1,0,0),(10,1477560717,1477560717,1,0,0),(11,1477560718,1477560718,1,0,0),(12,1477560719,1477560719,1,0,0),(13,1477560737,1477560737,1,0,0),(14,1477560738,1477560738,1,0,0),(15,1477560746,1477560746,1,0,0),(16,1477560828,1477560828,1,0,0),(17,1477560829,1477560829,1,0,0),(18,1477560829,1477560829,1,0,0),(19,1477560830,1477560830,1,0,0),(20,1477560883,1477560889,1,2,2);
/*!40000 ALTER TABLE `tab_contvisite` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tab_vincitori`
--

DROP TABLE IF EXISTS `tab_vincitori`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tab_vincitori` (
  `id` int(2) NOT NULL AUTO_INCREMENT,
  `nazionali` varchar(20) NOT NULL,
  `vittorie` int(2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tab_vincitori`
--

LOCK TABLES `tab_vincitori` WRITE;
/*!40000 ALTER TABLE `tab_vincitori` DISABLE KEYS */;
INSERT INTO `tab_vincitori` VALUES (1,'Brasile',5),(2,'Italia',4),(3,'Germania',3),(4,'Argentina',2),(5,'Uruguay',2),(6,'Spagna',1),(7,'Francia',1),(8,'Inghilterra',1);
/*!40000 ALTER TABLE `tab_vincitori` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'phpexample'
--

--
-- Dumping routines for database 'phpexample'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-02-24 15:29:41
