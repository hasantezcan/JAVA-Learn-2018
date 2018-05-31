-- phpMyAdmin SQL Dump
-- version 4.5.4.1deb2ubuntu2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: May 27, 2018 at 11:12 PM
-- Server version: 5.7.22-0ubuntu0.16.04.1
-- PHP Version: 7.0.28-0ubuntu0.16.04.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `havaYoluProjesi`
--

-- --------------------------------------------------------

--
-- Table structure for table `biletler`
--

CREATE TABLE `biletler` (
  `biletid` int(11) NOT NULL,
  `ucakid` int(11) NOT NULL,
  `uyeid` int(11) NOT NULL,
  `koltukid` text COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Dumping data for table `biletler`
--

INSERT INTO `biletler` (`biletid`, `ucakid`, `uyeid`, `koltukid`) VALUES
(12, 10, 15, 'D11');

-- --------------------------------------------------------

--
-- Table structure for table `ucaklar`
--

CREATE TABLE `ucaklar` (
  `id` int(11) NOT NULL,
  `UcakAdi` text COLLATE utf8_turkish_ci NOT NULL,
  `saat` text COLLATE utf8_turkish_ci NOT NULL,
  `tarih` text COLLATE utf8_turkish_ci NOT NULL,
  `nerden` text COLLATE utf8_turkish_ci NOT NULL,
  `nereye` text COLLATE utf8_turkish_ci NOT NULL,
  `kapasite` int(11) NOT NULL DEFAULT '102'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Dumping data for table `ucaklar`
--

INSERT INTO `ucaklar` (`id`, `UcakAdi`, `saat`, `tarih`, `nerden`, `nereye`, `kapasite`) VALUES
(1, 'AX-025', '09.00', '23/5/2018', 'ORDU', 'RİZE', 102),
(7, 'AX-024', '12.30', '21/5/2018', 'KARS', 'DENİZLİ', 102),
(8, 'TR-006', '11.30', '19/5/2018', 'DENİZLİ', 'KARS', 102),
(10, 'TR 005', '20.05', '19/5/2018', 'DENİZLİ', 'KARS', 102),
(13, 'TR-003', '19.00', '20/5/2018', 'ANTALYA', 'SAMSUN', 102),
(14, 'TR-002', '11.00', '21/5/2018', 'IZMIR', 'AMASYA', 102),
(15, 'AB-23', '11.00', '23/5/2018', 'DENİZLİ', 'NEW-YORK', 102),
(16, 'AB-23', '12.00', '23/5/2018', 'NEW-YORK', 'DENIZLI', 102);

-- --------------------------------------------------------

--
-- Table structure for table `uyeler`
--

CREATE TABLE `uyeler` (
  `id` int(11) NOT NULL,
  `ad` text COLLATE utf8_turkish_ci NOT NULL,
  `soyad` text COLLATE utf8_turkish_ci NOT NULL,
  `parola` text COLLATE utf8_turkish_ci NOT NULL,
  `email` text COLLATE utf8_turkish_ci NOT NULL,
  `cinsiyet` text COLLATE utf8_turkish_ci NOT NULL,
  `dogumTarihi` text COLLATE utf8_turkish_ci NOT NULL,
  `EvAdresi` text COLLATE utf8_turkish_ci NOT NULL,
  `IsAdresi` text COLLATE utf8_turkish_ci NOT NULL,
  `TC` text COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Dumping data for table `uyeler`
--

INSERT INTO `uyeler` (`id`, `ad`, `soyad`, `parola`, `email`, `cinsiyet`, `dogumTarihi`, `EvAdresi`, `IsAdresi`, `TC`) VALUES
(1, 'Hasan', 'TEZCAN', 'a', 'a', 'ERKEK', '19/08/1998', 'DENİZLİ', 'DENİZLİ', '111'),
(3, 'Tulin', 'Aktaş', 'b', 'b', 'KADIN', '20/AGUSTOS/1990', 'AYDIN, asda, asdsad', 'ADIYAMAN, asdas, asdsad', 'bbbb'),
(4, 'Uzay', 'Kaya', '155969987asd', 'uzay.kaya@hotmail.com', 'ERKEK', '15/MAYIS/1995 ', 'DENIZLI, aa, bb', 'DENIZLI, aa, bb', '16336876370'),
(8, 'Bora', 'Tanrikulu', 'asd', 'bora', 'ERKEK', '1/OCAK/1929 ', 'seçim yapılmadı, , ', 'seçim yapılmadı, , ', '123'),
(12, 'Beyza', 'Kaynar', '1', 'beyzakaynar35@hotmail.com', 'KADIN', '27/AĞUSTOS/1998 ', 'İZMIR, karşıyaka, aaaa', 'DENIZLI, kınıklı, bbbb', '6666666666'),
(15, 'Ömer', 'Sert', '12345', 'ömer@sert.com', 'ERKEK', '1/OCAK/1929 ', 'ADANA, , ', 'ADANA, , ', '11111111');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `biletler`
--
ALTER TABLE `biletler`
  ADD PRIMARY KEY (`biletid`);

--
-- Indexes for table `ucaklar`
--
ALTER TABLE `ucaklar`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `uyeler`
--
ALTER TABLE `uyeler`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `biletler`
--
ALTER TABLE `biletler`
  MODIFY `biletid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
--
-- AUTO_INCREMENT for table `ucaklar`
--
ALTER TABLE `ucaklar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
--
-- AUTO_INCREMENT for table `uyeler`
--
ALTER TABLE `uyeler`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
