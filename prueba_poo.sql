-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-07-2023 a las 01:05:18
-- Versión del servidor: 10.4.25-MariaDB
-- Versión de PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `prueba_poo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `datos`
--

CREATE TABLE `datos` (
  `id` int(11) NOT NULL,
  `Mensaje` varchar(500) NOT NULL,
  `Autor` varchar(500) NOT NULL DEFAULT 'NATY',
  `fecha` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `datos`
--

INSERT INTO `datos` (`id`, `Mensaje`, `Autor`, `fecha`) VALUES
(25, 'Hola :3', 'NATY', '2023-07-28'),
(26, 'Holi, cómo estás?', 'ALEX', '2023-07-28'),
(27, 'Te quiero uwu', 'NATY', '2023-07-28'),
(28, 'yo gual :3', 'ALEX', '2023-07-28'),
(29, 'Prueba de otro dia :3', 'NATY', '2023-07-29'),
(30, 'Holi', 'ALEX', '2023-07-29'),
(31, 'ESTA ES UNA PRUEBA', 'NATY', '2023-07-29'),
(32, 'ESTA ES OTRA PRUEBA', 'ALEX', '2023-07-29'),
(33, 'owoEscribe un mensaje', 'NATY', '2023-07-29'),
(34, 'ewe', 'NATY', '2023-07-29'),
(35, 'owo', 'ALEX', '2023-07-29');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `datos`
--
ALTER TABLE `datos`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `datos`
--
ALTER TABLE `datos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
