/*
SQLyog - Free MySQL GUI v5.19
Host - 5.0.15-nt : Database - home_prediction
*********************************************************************
Server version : 5.0.15-nt
*/

SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `home_prediction`;

USE `home_prediction`;

SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';

/*Table structure for table `adminlogin` */

DROP TABLE IF EXISTS `adminlogin`;

CREATE TABLE `adminlogin` (
  `id` int(5) NOT NULL auto_increment,
  `name` varchar(50) default NULL,
  `password` varchar(50) default NULL,
  `adminid` varchar(20) NOT NULL,
  `address` varchar(50) default NULL,
  `phone` varchar(15) default NULL,
  `email` varchar(50) default NULL,
  PRIMARY KEY  (`id`,`adminid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `adminlogin` */

insert into `adminlogin` (`id`,`name`,`password`,`adminid`,`address`,`phone`,`email`) values (1,'admin','123','admin','bnagaloree','9988668866','admin123@gmail.com');

/*Table structure for table `house_dataset` */

DROP TABLE IF EXISTS `house_dataset`;

CREATE TABLE `house_dataset` (
  `h_id` int(11) NOT NULL auto_increment,
  `h_city` varchar(20) default NULL,
  `h_division` varchar(30) default NULL,
  `h_area` varchar(40) default NULL,
  `h_street` varchar(100) default NULL,
  `h_rssqft` int(50) default NULL,
  `h_year` int(10) default NULL,
  `h_type` varchar(20) default NULL,
  `h_bhk` int(10) default NULL,
  PRIMARY KEY  (`h_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `house_dataset` */

insert into `house_dataset` (`h_id`,`h_city`,`h_division`,`h_area`,`h_street`,`h_rssqft`,`h_year`,`h_type`,`h_bhk`) values (1,'bangalore','bangalore_south','rajajinagar','6th main road',20000,2019,'independent',1);
insert into `house_dataset` (`h_id`,`h_city`,`h_division`,`h_area`,`h_street`,`h_rssqft`,`h_year`,`h_type`,`h_bhk`) values (2,'bangalore','bangalore_north','udi','5th main',30000,2018,'villa',3);

/*Table structure for table `userlogin` */

DROP TABLE IF EXISTS `userlogin`;

CREATE TABLE `userlogin` (
  `id` int(5) NOT NULL auto_increment,
  `userid` varchar(50) NOT NULL,
  `password` varchar(50) default NULL,
  `username` varchar(20) default NULL,
  `gender` varchar(50) default NULL,
  `address` varchar(50) default NULL,
  `city` varchar(50) default NULL,
  `email` varchar(50) default NULL,
  `phone` varchar(12) default NULL,
  PRIMARY KEY  (`id`,`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `userlogin` */

insert into `userlogin` (`id`,`userid`,`password`,`username`,`gender`,`address`,`city`,`email`,`phone`) values (31,'amutha','amutha','amutha','Female','Bangalore','bangalore','bansalrajat016@gmail.com','9632917445');
insert into `userlogin` (`id`,`userid`,`password`,`username`,`gender`,`address`,`city`,`email`,`phone`) values (36,'manu','shanu','manu','Male','jayanagara','Bangalore`','rameshrajworld@gmail.com','9900392855');
insert into `userlogin` (`id`,`userid`,`password`,`username`,`gender`,`address`,`city`,`email`,`phone`) values (40,'merry','123','merry','Male','Jayanagarrrrr','Bangalore','rameshrajworld@gmail.com','9900223344');
insert into `userlogin` (`id`,`userid`,`password`,`username`,`gender`,`address`,`city`,`email`,`phone`) values (43,'vnu','vnu','vnu','Male','vidhyanagar','hassan','shanusharugowda@gmail.com','9988776655');

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
