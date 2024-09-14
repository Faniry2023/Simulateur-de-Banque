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
