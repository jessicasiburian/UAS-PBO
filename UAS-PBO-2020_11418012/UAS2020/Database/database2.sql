/*
SQLyog Ultimate v8.55 
MySQL - 5.5.5-10.1.37-MariaDB : Database - uaspam
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`uaspam` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `uaspam`;

/*Table structure for table `bank_soal` */

DROP TABLE IF EXISTS `bank_soal`;

CREATE TABLE `bank_soal` (
  `id_soal` int(10) NOT NULL AUTO_INCREMENT,
  `tipe_soal` char(50) NOT NULL,
  `tingkat_kesulitan` char(50) NOT NULL,
  `jawaban` text NOT NULL,
  `pertanyaan` text NOT NULL,
  `matkul` int(10) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id_soal`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `bank_soal` */

insert  into `bank_soal`(`id_soal`,`tipe_soal`,`tingkat_kesulitan`,`jawaban`,`pertanyaan`,`matkul`,`created_at`,`updated_at`) values (1,'True/False','Mudah','False','Android adalah aplikasi yang bisa dibangun menggunakan PHP',1,NULL,NULL),(2,'Short Answer','sedang','Tidak ada','Tuliskan apa yang kamu ketahui tentang spalshscreen',1,'2020-06-18 16:21:03','2020-06-18 16:21:03'),(3,'Short Answer','mudah','Tidak ada','Apa mau mu?',1,'2020-06-18 16:26:46','2020-06-18 16:26:46');

/*Table structure for table `info_login` */

DROP TABLE IF EXISTS `info_login`;

CREATE TABLE `info_login` (
  `id_peserta` int(10) NOT NULL,
  `tgl_login` int(10) NOT NULL,
  PRIMARY KEY (`id_peserta`,`tgl_login`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `info_login` */

/*Table structure for table `jawaban_peserta` */

DROP TABLE IF EXISTS `jawaban_peserta`;

CREATE TABLE `jawaban_peserta` (
  `username` char(25) NOT NULL,
  `id_soalkuis` int(10) NOT NULL,
  `jawaban_peserta` char(25) DEFAULT NULL,
  PRIMARY KEY (`username`,`id_soalkuis`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `jawaban_peserta` */

/*Table structure for table `kuis` */

DROP TABLE IF EXISTS `kuis`;

CREATE TABLE `kuis` (
  `id_kuis` int(10) NOT NULL AUTO_INCREMENT,
  `tgl_pelaksanaan` datetime NOT NULL,
  `matkul` char(50) NOT NULL,
  `durasi` int(11) NOT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id_kuis`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `kuis` */

insert  into `kuis`(`id_kuis`,`tgl_pelaksanaan`,`matkul`,`durasi`,`updated_at`,`created_at`) values (1,'0000-00-00 00:00:00','PAM',200,NULL,NULL),(2,'2020-05-18 00:00:00','PBO',200,'2020-06-18 14:33:04','2020-06-18 14:33:04');

/*Table structure for table `matkul` */

DROP TABLE IF EXISTS `matkul`;

CREATE TABLE `matkul` (
  `id_matkul` int(11) NOT NULL AUTO_INCREMENT,
  `nama` char(50) DEFAULT NULL,
  PRIMARY KEY (`id_matkul`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `matkul` */

insert  into `matkul`(`id_matkul`,`nama`) values (1,'PAM'),(2,'PBO'),(3,'PROBSTAT');

/*Table structure for table `peserta` */

DROP TABLE IF EXISTS `peserta`;

CREATE TABLE `peserta` (
  `id_peserta` int(10) NOT NULL,
  `username` char(25) NOT NULL,
  `password` char(25) NOT NULL,
  `nama` char(50) NOT NULL,
  `nim` int(10) NOT NULL,
  `prodi` char(25) NOT NULL,
  `angkatan` char(10) NOT NULL,
  `email` char(25) NOT NULL,
  PRIMARY KEY (`id_peserta`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `peserta` */

/*Table structure for table `soal_kuis` */

DROP TABLE IF EXISTS `soal_kuis`;

CREATE TABLE `soal_kuis` (
  `id_soalkuis` int(10) NOT NULL,
  `id_kuis` int(10) NOT NULL,
  `id_soal` int(10) NOT NULL,
  PRIMARY KEY (`id_soalkuis`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `soal_kuis` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `email` char(25) NOT NULL,
  `password` char(25) NOT NULL,
  `role` char(10) NOT NULL,
  PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
