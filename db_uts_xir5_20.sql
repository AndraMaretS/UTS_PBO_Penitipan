-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 16 Mar 2017 pada 17.13
-- Versi Server: 10.1.13-MariaDB
-- PHP Version: 7.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_uts_xir5_20`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_akun`
--

CREATE TABLE `tb_akun` (
  `username` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_akun`
--

INSERT INTO `tb_akun` (`username`, `password`) VALUES
('iqbal', 'iqbal');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_penitipan`
--

CREATE TABLE `tb_penitipan` (
  `NoResi` int(11) NOT NULL,
  `NamaPetugas` varchar(80) NOT NULL,
  `NOPOL` varchar(80) NOT NULL,
  `JnsKendaraan` enum('Motor','Mobil') NOT NULL,
  `TglMasuk` varchar(25) NOT NULL,
  `TglKeluar` varchar(25) NOT NULL,
  `HargaHari` varchar(80) NOT NULL,
  `HargaTotal` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_penitipan`
--

INSERT INTO `tb_penitipan` (`NoResi`, `NamaPetugas`, `NOPOL`, `JnsKendaraan`, `TglMasuk`, `TglKeluar`, `HargaHari`, `HargaTotal`) VALUES
(1122, 'Muhamad', 'P 8642 WZ', 'Motor', '2017-03-16', '2017-03-24', '3000', '24000'),
(1134, 'Iqbal', 'B 251 SD', 'Mobil', '2017-03-16', '2017-03-26', '3000', '30000'),
(1137, 'Samudra', 'N 7640 BB', 'Motor', '2017-03-17', '2017-03-22', '3000', '15000');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_penitipan`
--
ALTER TABLE `tb_penitipan`
  ADD PRIMARY KEY (`NoResi`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
