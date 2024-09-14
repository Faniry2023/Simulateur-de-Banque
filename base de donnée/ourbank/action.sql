-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : mar. 29 août 2023 à 12:49
-- Version du serveur : 5.7.36
-- Version de PHP : 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `ourbank`
--

-- --------------------------------------------------------

--
-- Structure de la table `action`
--

DROP TABLE IF EXISTS `action`;
CREATE TABLE IF NOT EXISTS `action` (
  `compte` int(11) NOT NULL,
  `soldeCourant` varchar(20) NOT NULL,
  `soldeEpargne` varchar(20) NOT NULL,
  `hisCou` varchar(250) NOT NULL,
  `hisEp` varchar(250) NOT NULL,
  `hisCou2` varchar(250) NOT NULL,
  `hisEp2` varchar(250) NOT NULL,
  `dateTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`compte`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `action`
--

INSERT INTO `action` (`compte`, `soldeCourant`, `soldeEpargne`, `hisCou`, `hisEp`, `hisCou2`, `hisEp2`, `dateTime`) VALUES
(568, '2660000.0', '0.00', 'Bonjour Sandra! Mahazo Tina Faniry Vous envoie 2000000.0Ar', 'Bonjour Sandra', 'le 2023-08-21 19:01:04.Votre solde est de 2660000.0 Ar', 'Vous n avez pas encore fait des action votre solde est de 0.00ar', '2023-08-21 19:01:04'),
(5634, '140000.0', '0.00', 'Bonjour Rado Vous avez envoyer 60000.0 a Sandra', 'Bonjour Rado', 'le 2023-07-25 17:15:02.Votre solde est de 140000.0 Ar', 'Vous n avez pas encore fait des action votre solde est de 0.00ar', '2023-07-25 17:15:02'),
(4888, '1900000.0', '0.00', 'Bonjour tantely Herizo Vous avez fait un retrait de 100000.0', 'Bonjour tantely Herizo', 'le 2023-07-25 16:52:55.Votre solde est de 1900000.0 Ar', 'Vous n avez pas encore fait des action votre solde est de 0.00ar', '2023-07-25 16:52:55'),
(1756, '5000000.0', '0.00', 'Bonjour miranto Vous avez fait un depot de 5000000.0', 'Bonjour miranto', 'le 2023-07-25 16:55:34.Votre solde est de 5000000.0 Ar', 'Vous n avez pas encore fait des action votre solde est de 0.00ar', '2023-07-25 16:55:34'),
(8018, '3.7E7', '0.00', 'Bonjour GL Vous avez fait un retrait de 1.3E7', 'Bonjour GL', 'le 2023-07-25 16:57:56.Votre solde est de 3.7E7 Ar', 'Vous n avez pas encore fait des action votre solde est de 0.00ar', '2023-07-25 16:57:56'),
(8708, '2500000.0', '0.00', 'Bonjour Nixon! Bema Vous envoie 2000000.0Ar', 'Bonjour Nixon', 'le 2023-07-31 12:23:52.Votre solde est de 2500000.0 Ar', 'Vous n avez pas encore fait des action votre solde est de 0.00ar', '2023-07-31 12:23:52'),
(2188, '1.1E7', '0.00', 'Bonjour Gasikely! Mahazo Tina Faniry Vous envoie 5000000.0Ar', 'Bonjour Gasikely', 'le 2023-08-19 11:29:17.Votre solde est de 1.1E7 Ar', 'Vous n avez pas encore fait des action votre solde est de 0.00ar', '2023-08-19 11:29:17'),
(6536, '2510000.0', '7381000.0', 'Bonjour Mahazo Tina Faniry Vous avez envoyer 2000000.0 a Sandra', 'Bonjour Mahazo Tina Faniry Vous avez fait un retrait de 1000000.0 dans votre compte Epargne', 'le 2023-08-21 19:01:04.Votre solde est de 2510000.0 Ar', 'le 2023-08-19 17:59:17.Votre solde est de 7381000.0 Ar', '2023-08-21 19:01:04'),
(4088, '9900000.0', '0.00', 'Bonjour Admin Vous avez fait un depot de 9900000.0', 'Bonjour Admin', 'le 2023-07-25 17:06:51.Votre solde est de 9900000.0 Ar', 'Vous n avez pas encore fait des action votre solde est de 0.00ar', '2023-07-25 17:06:51'),
(3605, '7000000.0', '2415000.0', 'Bonjour Rochel Vous avez envoyer 200000.0 a test', 'Bonjour Rochel Vous avez fait un depot de 2300000.0 plus le bonus d Epargne', 'le 2023-08-24 12:36:22.Votre solde est de 7000000.0 Ar', 'le 2023-08-24 12:35:43.Votre solde est de 2415000.0 Ar', '2023-08-24 12:36:22'),
(3801, '3400000.0', '525000.0', 'Bonjour razandriolona Vous avez envoyer 600000.0 a Sandra', 'Bonjour razandriolona Vous avez fait un depot de 500000.0 plus le bonus d Epargne', 'le 2023-08-21 18:59:21.Votre solde est de 3400000.0 Ar', 'le 2023-08-21 18:57:25.Votre solde est de 525000.0 Ar', '2023-08-21 18:59:21');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
