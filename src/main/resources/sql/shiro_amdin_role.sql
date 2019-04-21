/*
Navicat MySQL Data Transfer

Source Server         : LinuxMysql
Source Server Version : 50560
Source Host           : 192.168.74.166:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50560
File Encoding         : 65001

Date: 2019-04-21 23:18:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for shiro_amdin_role
-- ----------------------------
DROP TABLE IF EXISTS `shiro_amdin_role`;
CREATE TABLE `shiro_amdin_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `roleid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of shiro_amdin_role
-- ----------------------------
