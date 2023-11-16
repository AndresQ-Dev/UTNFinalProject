-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Nov 16, 2023 at 09:05 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `TicketManager`
--

-- --------------------------------------------------------

--
-- Table structure for table `Cliente`
--

CREATE TABLE `Cliente` (
  `id` int(11) NOT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `cuit` varchar(255) DEFAULT NULL,
  `estado` tinyint(1) DEFAULT 0,
  `mail` varchar(255) DEFAULT NULL,
  `razonSocial` varchar(255) DEFAULT NULL,
  `telefono` varchar(255) DEFAULT NULL,
  `tipoServicio` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `Cliente`
--

INSERT INTO `Cliente` (`id`, `direccion`, `cuit`, `estado`, `mail`, `razonSocial`, `telefono`, `tipoServicio`) VALUES
(1, 'Av. Cabildo 1035', '2010500400', 1, 'hardsoft@hardsoft.com', 'HardSoft S.A.', '011456456', 'TANGO'),
(8, 'Av. Siempre Viva 3055', '1622500500', 1, 'java@java.com', 'Java S.A.', '011999999', 'RHEL');

-- --------------------------------------------------------

--
-- Table structure for table `Tecnico`
--

CREATE TABLE `Tecnico` (
  `id` int(11) NOT NULL,
  `apellidoNombre` varchar(255) DEFAULT NULL,
  `especialidad` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `Tecnico`
--

INSERT INTO `Tecnico` (`id`, `apellidoNombre`, `especialidad`) VALUES
(1, 'Brown Emmet', 'TANGO'),
(2, 'Wozniak Steve', 'RHEL');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Cliente`
--
ALTER TABLE `Cliente`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `cuit` (`cuit`);

--
-- Indexes for table `Tecnico`
--
ALTER TABLE `Tecnico`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Cliente`
--
ALTER TABLE `Cliente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `Tecnico`
--
ALTER TABLE `Tecnico`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
