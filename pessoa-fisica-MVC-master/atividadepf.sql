-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 13-Abr-2018 às 16:31
-- Versão do servidor: 5.7.17
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `atividadepf`
--
CREATE DATABASE IF NOT EXISTS `atividadepf` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `atividadepf`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `pessoa`
--

CREATE TABLE `pessoa` (
  `Nome` varchar(100) NOT NULL,
  `endereco` varchar(100) NOT NULL,
  `bairro` varchar(20) NOT NULL,
  `cep` varchar(8) NOT NULL,
  `cidade` varchar(20) NOT NULL,
  `telefone` varchar(11) NOT NULL,
  `celular` varchar(11) NOT NULL,
  `rg` varchar(10) NOT NULL,
  `cpf` varchar(12) NOT NULL,
  `sexo` set('F','M') NOT NULL,
  `estado` varchar(3) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
