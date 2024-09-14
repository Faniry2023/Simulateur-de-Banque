-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : mar. 29 août 2023 à 12:50
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
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
