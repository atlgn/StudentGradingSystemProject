-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jun 06, 2021 at 03:23 PM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `studentregsys`
--

-- --------------------------------------------------------

--
-- Table structure for table `attendance`
--

DROP TABLE IF EXISTS `attendance`;
CREATE TABLE IF NOT EXISTS `attendance` (
  `att_id` int(11) NOT NULL AUTO_INCREMENT,
  `std_id` int(11) NOT NULL,
  `crs_id` int(11) NOT NULL,
  `att_date` date NOT NULL,
  PRIMARY KEY (`att_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `attendance`
--

INSERT INTO `attendance` (`att_id`, `std_id`, `crs_id`, `att_date`) VALUES
(1, 2, 3, '2021-06-16'),
(2, 3, 4, '2021-06-23'),
(4, 44, 44, '2021-06-11'),
(5, 3, 5, '2021-06-11'),
(6, 4, 5, '2021-06-11');

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
CREATE TABLE IF NOT EXISTS `course` (
  `crs_id` int(11) NOT NULL AUTO_INCREMENT,
  `dept_id` int(11) NOT NULL,
  `crs_code` varchar(7) NOT NULL,
  `crs_name` varchar(255) NOT NULL,
  PRIMARY KEY (`crs_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`crs_id`, `dept_id`, `crs_code`, `crs_name`) VALUES
(1, 13, 'MENG104', 'Engineering Graphics'),
(2, 13, 'EENG112', 'Introduction to Programming '),
(3, 13, 'PHYS101', 'Physics - I'),
(4, 12, 'CHEM101', 'General Chemistry'),
(5, 10, 'ITEC', 'Academic English'),
(6, 13, 'EENG225', 'Fundamentals of Electrical Engineering'),
(7, 6, 'ITEC105', 'COMPUTER 1'),
(8, 6, 'ITEC105', 'COMPUTER 1');

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
CREATE TABLE IF NOT EXISTS `department` (
  `dept_id` int(11) NOT NULL AUTO_INCREMENT,
  `dept_name` varchar(255) NOT NULL,
  PRIMARY KEY (`dept_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`dept_id`, `dept_name`) VALUES
(1, 'Information Technologies'),
(2, 'Interior Architecture'),
(3, 'Banking and Insurance'),
(4, 'Political Science'),
(5, 'Management Information Systems'),
(6, 'Business Administration'),
(8, 'Civil Engineering'),
(9, 'Computer Engineering'),
(10, 'Software Engineering'),
(11, 'qweqweqw'),
(12, 'Physiotherapy and Rehabilitation'),
(13, 'Mechatronics Engineering'),
(14, 'Mechatronics Engineering');

-- --------------------------------------------------------

--
-- Table structure for table `grades`
--

DROP TABLE IF EXISTS `grades`;
CREATE TABLE IF NOT EXISTS `grades` (
  `grd_id` int(11) NOT NULL AUTO_INCREMENT,
  `std_id` int(11) NOT NULL,
  `crs_id` int(11) NOT NULL,
  `grd_mt` float NOT NULL,
  `grd_hw` float NOT NULL,
  `grd_final` float NOT NULL,
  `grd_lgrade` varchar(10) NOT NULL,
  PRIMARY KEY (`grd_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `grades`
--

INSERT INTO `grades` (`grd_id`, `std_id`, `crs_id`, `grd_mt`, `grd_hw`, `grd_final`, `grd_lgrade`) VALUES
(1, 2, 3, 34, 54, 34, 'c'),
(2, 5, 3, 34, 54, 65, 'A'),
(3, 2, 3, 34, 54, 34, 'c'),
(4, 2, 4, 34, 54, 34, 'c'),
(5, 2, 4, 34, 54, 34, 'c');

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
CREATE TABLE IF NOT EXISTS `students` (
  `std_id` int(11) NOT NULL AUTO_INCREMENT,
  `std_no` varchar(7) NOT NULL,
  `std_name` varchar(255) NOT NULL,
  `std_surname` varchar(255) NOT NULL,
  `std_gender` char(1) NOT NULL,
  `std_nationality` varchar(255) NOT NULL,
  `std_birthdate` date NOT NULL,
  PRIMARY KEY (`std_id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`std_id`, `std_no`, `std_name`, `std_surname`, `std_gender`, `std_nationality`, `std_birthdate`) VALUES
(7, '193342', 'Philip', 'Udoye', 'F', 'Nigeri', '2021-06-02'),
(8, '189931', 'Kemal', 'Salih', 'M', 'TRNC', '2002-05-17'),
(9, '188883', 'Fathima', 'Mohammad', 'F', 'Syria', '2021-06-02'),
(10, '189447', 'Jasmin', 'Faruq', 'F', 'Egypt', '2002-02-19'),
(11, '189222', 'Ayse', 'Cengiz', 'F', 'Turkey', '2002-03-28'),
(12, '193342', 'Philip', 'Udoye', 'M', 'Nigeri', '2003-09-16'),
(13, '189931', 'Kemal', 'Salih', 'M', 'TRNC', '2002-05-17'),
(14, '188883', 'Fathima', 'Mohammad', 'F', 'Syria', '2001-11-22'),
(16, '189222', 'Ayse', 'Cengiz', 'F', 'Turkey', '2002-03-28'),
(19, '188883', 'Fathima', 'Mohammad', 'M', 'Syriafg', '2021-06-02'),
(20, '189447', 'Jasmin', 'Faruq', 'F', 'Egypt', '2002-02-19'),
(21, '189222', 'Ayse', 'Cengiz', 'F', 'Turkey', '2021-06-02');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
