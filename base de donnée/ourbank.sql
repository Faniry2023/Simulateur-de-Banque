-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : mar. 29 août 2023 à 12:51
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

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

DROP TABLE IF EXISTS `client`;
CREATE TABLE IF NOT EXISTS `client` (
  `compte` int(10) NOT NULL,
  `nom` varchar(200) NOT NULL,
  `prenom` varchar(200) NOT NULL,
  `date` date NOT NULL,
  `lieu` varchar(100) NOT NULL,
  `cin` varchar(12) NOT NULL,
  `adresse` varchar(100) NOT NULL,
  `sex` varchar(5) NOT NULL,
  `tel` varchar(13) NOT NULL,
  `image` varchar(250) NOT NULL,
  PRIMARY KEY (`compte`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`compte`, `nom`, `prenom`, `date`, `lieu`, `cin`, `adresse`, `sex`, `tel`, `image`) VALUES
(568, 'TIAVINA', 'Sandra', '2001-07-06', 'Antananarivo', '105104103105', 'Mahazoarivo', 'Homme', '+261333692247', 'D:\\Projet JAVA S4\\WinForm\\Application bancaire\\ourBank\\images\\568.jpg'),
(5634, 'NIRINA', 'Rado', '1995-01-01', 'Antsirabe', '102104105108', 'Tonivao', 'Homme', '+26133658', 'D:\\Projet JAVA S4\\WinForm\\Application bancaire\\ourBank\\images\\5634.jpg'),
(4888, 'RABOKONA', 'tantely Herizo', '2002-04-03', 'Ambatolampy', '104104105101', 'Star', 'Homme', '+261323635655', 'D:\\Projet JAVA S4\\WinForm\\Application bancaire\\ourBank\\images\\4888.jpg'),
(1756, 'MIRANTO', 'miranto', '1995-01-01', 'Antananarivo', '555666888456', 'Antsirabe', 'Homme', '+261343434334', 'D:\\Projet JAVA S4\\WinForm\\Application bancaire\\ourBank\\images\\1756.jpg'),
(8018, 'IES-AV', 'GL', '2013-04-16', 'Antananarivo', '102106102104', 'Tsaratanana', 'Autre', '+26155', 'D:\\Projet JAVA S4\\WinForm\\Application bancaire\\ourBank\\images\\8018.jpg'),
(8708, 'RABENANTOANINA', 'Nixon', '1995-01-01', 'Antananarivo', '102101104104', 'Antsirabe', 'Homme', '+26166545', 'D:\\Projet JAVA S4\\WinForm\\Application bancaire\\ourBank\\images\\8708.jpg'),
(2188, 'FANIRINIAINA', 'Gasikely', '1995-01-01', 'Mahajanga', '555444101236', 'Antananarivo', 'Homme', '+261345856954', 'D:\\Projet JAVA S4\\WinForm\\Application bancaire\\ourBank\\images\\2188.jpg'),
(6536, 'RAFANOMEZANTSOA', 'Mahazo Tina Faniry', '2001-02-08', 'Fianarantsoa', '108071273018', '0710 C 40 BIS Antanety Mandaniresaka', 'Homme', '+261344741133', 'D:\\Projet JAVA S4\\WinForm\\Application bancaire\\ourBank\\images\\6536.jpg'),
(4088, 'ADMIN', 'Admin', '2023-07-11', 'Antsirabe', '108071273014', '0710 C 40 BIS Antsirabe', 'Autre', '+2611449653', 'D:\\Projet JAVA S4\\WinForm\\Application bancaire\\ourBank\\images\\4088.jpg'),
(3801, 'RAZOKIOLONA', 'razandriolona', '1982-04-03', 'Antsiranana', '122222202002', '1245 L 89 Antsiranana', 'Femme', '+261323632545', 'D:\\Projet JAVA S4\\WinForm\\Application bancaire\\ourBank\\images\\3801.jpg'),
(3605, 'GEORGIO', 'Rochel', '2001-01-05', 'Antsirabe', '123456789789', 'Ambohimena', 'Homme', '+261343658935', 'D:\\Projet JAVA S4\\WinForm\\Application bancaire\\ourBank\\images\\3605.jpg');

-- --------------------------------------------------------

--
-- Structure de la table `gestionnaire`
--

DROP TABLE IF EXISTS `gestionnaire`;
CREATE TABLE IF NOT EXISTS `gestionnaire` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(100) NOT NULL,
  `mdp` varchar(100) NOT NULL,
  `nom` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `gestionnaire`
--

INSERT INTO `gestionnaire` (`id`, `email`, `mdp`, `nom`) VALUES
(1, 'admin@gmail.com', 'admin', 'ADMIN');

-- --------------------------------------------------------

--
-- Structure de la table `userclientlogin`
--

DROP TABLE IF EXISTS `userclientlogin`;
CREATE TABLE IF NOT EXISTS `userclientlogin` (
  `numCompte` int(11) NOT NULL,
  `email` varchar(200) NOT NULL,
  `mdp` varchar(200) NOT NULL,
  PRIMARY KEY (`numCompte`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `userclientlogin`
--

INSERT INTO `userclientlogin` (`numCompte`, `email`, `mdp`) VALUES
(568, 'sandra@gmail.com', '123456'),
(5634, 'rado@gmail.com', 'rado123'),
(4888, 'tantely@gmail.com', 'tantely12'),
(1756, 'mi@gmail.com', '321mi'),
(8018, 'iesav@gmail.com', 'mah21'),
(8708, 'nixon@gmail.com', 'rrg'),
(2188, 'gasy@gmail.com', '1234'),
(6536, 'faniry@gmail.com', '08022001'),
(4088, 'admin@gmail.com', 'admin'),
(3801, 'zoky@gmail.com', 'zoky'),
(3605, 'rochel@gmail.com', '123');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
