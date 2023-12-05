-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Dec 05, 2023 at 06:25 AM
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
  `direccion` varchar(255) NOT NULL,
  `cuit` varchar(255) NOT NULL,
  `estado` tinyint(1) DEFAULT 0,
  `mail` varchar(255) NOT NULL,
  `razonSocial` varchar(255) NOT NULL,
  `telefono` varchar(255) NOT NULL,
  `tipoServicio` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `Cliente`
--

INSERT INTO `Cliente` (`id`, `direccion`, `cuit`, `estado`, `mail`, `razonSocial`, `telefono`, `tipoServicio`) VALUES
(1, 'Av. Ca', '2010500400', 1, 'abc@abc.coma', 'ABC Solutions S.A.', '011456456', 'WINDOWS'),
(2, 'Av. Siempre Viva 3055', '1622500500', 1, 'xyz@xyz.com', 'XYZ Tech S.A.', '011999999', 'WINDOWS'),
(3, 'Av. Rivadavia 5000', '3010200300', 1, 'data@data.com', 'Data Solutions Corp.', '011789789', 'WINDOWS_SERVER'),
(4, 'Av. Corrientes 2000', '2221100100', 1, 'tech@tech.com', 'Tech Innovators S.A.', '011555555', 'WINDOWS_SERVER'),
(5, 'Av. San Martin 1500', '4020400200', 1, 'office@office.com', 'Office Pro Corp.', '011444444', 'MS_OFFICE'),
(6, 'Av. Belgrano 2500', '1623400100', 1, 'soft@soft.com', 'Soft Office S.A.', '011666666', 'MS_OFFICE'),
(7, 'Av. Callao 200', '5010200300', 1, 'libre@libre.com', 'Libre Systems Corp.', '011333333', 'LIBRE_OFFICE'),
(8, 'Av. 9 de Julio 1500', '2021100100', 1, 'opensource@opensource.com', 'Open Source Innovations', '011222222', 'LIBRE_OFFICE'),
(9, 'Av. Pueyrredón 800', '6010400200', 1, 'tango@tango.com', 'Tango Pro Solutions', '011999999', 'TANGO'),
(10, 'Av. Santa Fe 1200', '2523400100', 1, 'tangoglobal@tangoglobal.com', 'Tango Global S.A.', '011888888', 'TANGO'),
(11, 'Av. Córdoba 500', '7010200300', 1, 'saptech@saptech.com', 'SAP Tech Corp.', '011777777', 'SAP'),
(12, 'Av. Scalabrini Ortiz 300', '2821100100', 1, 'sapsolutions@sapsolutions.com', 'SAP Solutions Innovate', '011666666', 'SAP'),
(13, 'Av. Juan B. Justo 1500', '8010400200', 1, 'networking@networking.com', 'Networking Corp.', '011555555', 'REDES'),
(14, 'Av. Gaona 2000', '3123400100', 1, 'connect@connect.com', 'Connect Solutions S.A.', '011444444', 'REDES'),
(15, 'Av. Dorrego 300', '9010200300', 1, 'linuxinnovations@linuxinnovations.com', 'Linux Innovations S.R.L.', '011333333', 'LINUX_DESKTOP'),
(16, 'Av. Libertador 1000', '3321100100', 1, 'desktop@desktop.com', 'Desktop Technologies', '011222222', 'LINUX_DESKTOP'),
(17, 'Av. Monroe 500', '10010400200', 1, 'debian@debian.com', 'Debian Solutions Corp.', '011999999', 'SERVER_DEBIAN'),
(18, 'Av. Scalabrini Ortiz 800', '3623400100', 1, 'debiantech@debiantech.com', 'Debian Tech S.A.', '011888888', 'SERVER_DEBIAN'),
(19, 'Av. Cabildo 2000', '11010200300', 1, 'redhat@redhat.com', 'Red Hat Systems S.A.', '011777777', 'RHEL'),
(20, 'Av. Santa Fe 800', '3921100100', 1, 'techredhat@techredhat.com', 'Tech Red Hat Argentina', '011666666', 'RHEL'),
(21, 'Av. Corrientes 800', '12010400200', 1, 'databasepro@databasepro.com', 'Database Pro Corp.', '011555555', 'DATABASE_MANAGER'),
(22, 'Av. 9 de Julio 1500', '4123400100', 1, 'dbinnovate@dbinnovate.com', 'DB Innovate S.A.', '011444444', 'DATABASE_MANAGER'),
(23, 'Av. Pueyrredón 1000', '13010200300', 1, 'hardware@hardware.com', 'Hardware Tech S.R.L.', '011333333', 'MANTENIMIENTO_HARDWARE'),
(24, 'Av. Scalabrini Ortiz 500', '4321100100', 1, 'solutionshardware@solutionshardware.com', 'Solutions Hardware', '011222222', 'MANTENIMIENTO_HARDWARE'),
(25, 'Av. Dorrego 2000', '14010400200', 1, 'print@print.com', 'Print Innovations Corp.', '011999999', 'IMPRESION_COORPORATIVA'),
(26, 'Av. Gaona 500', '4523400100', 1, 'printtech@printtech.com', 'Print Tech S.A.', '011888888', 'IMPRESION_COORPORATIVA');

-- --------------------------------------------------------

--
-- Table structure for table `Incidente`
--

CREATE TABLE `Incidente` (
  `id` int(11) NOT NULL,
  `categoria` varchar(255) NOT NULL,
  `detalle` varchar(255) NOT NULL,
  `estado` tinyint(1) DEFAULT 0,
  `fechaAlta` datetime NOT NULL,
  `fechaFin` datetime DEFAULT NULL,
  `observacionesTecnico` varchar(255) DEFAULT NULL,
  `idCliente` int(11) NOT NULL,
  `idTecnico` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `Incidente`
--

INSERT INTO `Incidente` (`id`, `categoria`, `detalle`, `estado`, `fechaAlta`, `fechaFin`, `observacionesTecnico`, `idCliente`, `idTecnico`) VALUES
(1, 'WINDOWS', 'Windows 10 tarda demasiado en iniciar...', 0, '2023-11-29 21:30:42', '2023-11-29 21:41:21', 'Se encontraron varias fallas en HDD, se cambia por un SSD.', 1, 1),
(2, 'SERVER_DEBIAN', 'No se puede acceder a carpetas del Servidor Debian en algunas maquinas cliente...', 0, '2023-11-29 21:34:25', '2023-11-30 18:57:19', 'Se repara servicios de comparticion en las maquinas afectadas...', 17, 18),
(3, 'WINDOWS', 'Despues de actualización de Windows 11 en Pc4 no se muestra menu inferior de inicio...', 0, '2023-11-29 22:03:36', '2023-12-04 19:22:30', 'Se restablace a estado anterior de upgrade y se actualiza correctamente. se realizan test de prueba con resultados satisfactorios.', 1, 2),
(6, 'RHEL', 'Fallo en apertura de apps en Notebook con RED Hat 8. Algunas no inician o se cierran inesperadamente...', 0, '2023-11-30 04:20:50', '2023-12-04 19:24:11', 'Se restablecen apps que no funcionaban si modificar archivos Conf para no perder configuraciones particulares de lso terminales clientes. Pruebas satisfactorias.', 19, 19),
(7, 'RHEL', 'Se solicita inicializar Pc de escritorio nueva para contaduría con Red Hat 8 o superior ... || PC VUELVE A GARANTIA POR DEFECTO DE FABRICA.1', 0, '2023-11-30 04:29:16', '2023-12-04 20:17:31', 'Tarea completada...', 20, 20),
(8, 'MANTENIMIENTO_HARDWARE', 'instalar disco nuevo', 0, '2023-11-30 21:27:50', '2023-12-04 19:26:33', 'Se instala SSD nuevo 500GB. Se clona sistema atenrior y se realizan test basicos. Resultosdos satisfactorios.', 24, 24),
(9, 'MS_OFFICE', 'Desaparecieron Iconos de Office al inicar windows...', 0, '2023-12-04 20:25:09', '2023-12-04 20:26:43', 'Se restablecen iconos del escritorio. Se realizan pruebas satisfactorias.', 6, 5),
(10, 'TANGO', 'No se puede loguear con ningun usuario valido. ', 0, '2023-12-04 20:34:43', '2023-12-04 20:35:08', 'se conecta con el servidor nuevamente...', 10, 9),
(11, 'TANGO', 'El modulo Astor Sueldos fóalla en la paerutra depues de la actualizacion de Tango live.', 0, '2023-12-04 21:54:37', '2023-12-04 21:56:00', 'Se reinstala modulo y se reconecta al server de Tango. Error en licencia, se comunica a Axoft del incidente...', 10, 9),
(12, 'TANGO', 'Instalar tango en nueva maquina de RRHH.', 0, '2023-12-04 22:12:20', '2023-12-05 00:31:08', 'Se intala Tango Live en maquina requerida y se conecta a la base de datos.', 9, 9),
(13, 'MANTENIMIENTO_HARDWARE', 'Pc 04 y 07 necesitan mantenimiento. Temperatura alta y apagados sorpresivos.', 0, '2023-12-05 00:29:41', '2023-12-05 00:32:26', 'Se realiza mantenimeinto  y limpieza de hardware a dos maquinas.', 23, 24),
(14, 'LIBRE_OFFICE', 'No funciona Calc de LibreOffice.', 0, '2023-12-05 01:16:41', '2023-12-05 01:18:52', 'Se corrije errores en el diso y se repara instalacion completa de LibreOffice.', 7, 7),
(15, 'LIBRE_OFFICE', 'Instalr libre Office en español en mauina de Recepcion.', 0, '2023-12-05 01:17:46', '2023-12-05 01:19:46', 'Se cambia el idioma en la app. Ya se encontraba instalada en Ingles.', 7, 8);

-- --------------------------------------------------------

--
-- Table structure for table `Tecnico`
--

CREATE TABLE `Tecnico` (
  `id` int(11) NOT NULL,
  `apellidoNombre` varchar(255) NOT NULL,
  `especialidad` varchar(255) NOT NULL,
  `cuil` varchar(255) NOT NULL,
  `disponibilidad` tinyint(1) DEFAULT 0,
  `estado` tinyint(1) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `Tecnico`
--

INSERT INTO `Tecnico` (`id`, `apellidoNombre`, `especialidad`, `cuil`, `disponibilidad`, `estado`) VALUES
(1, 'Bill Gates', 'WINDOWS', '18251212338', 1, 1),
(2, 'Steve Jobs', 'WINDOWS', '19240224150', 1, 1),
(3, 'Linus Torvalds', 'WINDOWS_SERVER', '18120623189', 1, 1),
(4, 'Richard Stallman', 'WINDOWS_SERVER', '19110317120', 1, 1),
(5, 'Larry Page', 'MS_OFFICE', '18051212338', 1, 1),
(6, 'Sergey Brin', 'MS_OFFICE', '19040224150', 1, 1),
(7, 'Mark Shuttleworth', 'LIBRE_OFFICE', '18210623189', 1, 1),
(8, 'Eric Raymond', 'LIBRE_OFFICE', '19190317120', 1, 1),
(9, 'Scott McNealy', 'TANGO', '18040626145', 1, 1),
(10, 'Marc Benioff', 'TANGO', '19030319120', 1, 1),
(11, 'Hasso Plattner', 'SAP', '18070626145', 1, 1),
(12, 'Dietmar Hopp', 'SAP', '19060319120', 1, 1),
(13, 'Vint Cerf', 'REDES', '18100626145', 1, 1),
(14, 'Bob Kahn', 'REDES', '19100319120', 1, 1),
(15, 'Linus Torvalds', 'LINUX_DESKTOP', '18010626145', 1, 1),
(16, 'Alan Cox', 'LINUX_DESKTOP', '19000319120', 1, 1),
(17, 'Mark Zuckerberg', 'SERVER_DEBIAN', '18120626145', 1, 1),
(18, 'Dustin Moskovitz', 'SERVER_DEBIAN', '19110319120', 1, 1),
(19, 'Paul Cormier', 'RHEL', '18051226145', 1, 1),
(20, 'Jim Whitehurst', 'RHEL', '19040219120', 1, 1),
(21, 'Larry Ellison', 'DATABASE_MANAGER', '18210626145', 1, 1),
(22, 'Michael Stonebraker', 'DATABASE_MANAGER', '19190319120', 1, 1),
(24, 'Michael Dell', 'MANTENIMIENTO_HARDWARE', '18040626148', 1, 1),
(25, 'Meg Whitman', 'MANTENIMIENTO_HARDWARE', '19030319127', 1, 1),
(26, 'Tim Cook', 'IMPRESION_COORPORATIVA', '18070626143', 1, 1),
(27, 'Sheryl Sandberg', 'IMPRESION_COORPORATIVA', '19060319129', 1, 1);

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
-- Indexes for table `Incidente`
--
ALTER TABLE `Incidente`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_Incidente_idTecnico` (`idTecnico`),
  ADD KEY `FK_Incidente_idCliente` (`idCliente`);

--
-- Indexes for table `Tecnico`
--
ALTER TABLE `Tecnico`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `cuil` (`cuil`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Cliente`
--
ALTER TABLE `Cliente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- AUTO_INCREMENT for table `Incidente`
--
ALTER TABLE `Incidente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `Tecnico`
--
ALTER TABLE `Tecnico`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `Incidente`
--
ALTER TABLE `Incidente`
  ADD CONSTRAINT `FK_Incidente_idCliente` FOREIGN KEY (`idCliente`) REFERENCES `Cliente` (`id`),
  ADD CONSTRAINT `FK_Incidente_idTecnico` FOREIGN KEY (`idTecnico`) REFERENCES `Tecnico` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
