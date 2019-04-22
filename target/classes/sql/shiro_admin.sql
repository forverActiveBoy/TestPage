/*
Navicat MySQL Data Transfer

Source Server         : LinuxMysql
Source Server Version : 50560
Source Host           : 192.168.74.166:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50560
File Encoding         : 65001

Date: 2019-04-21 23:17:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for shiro_admin
-- ----------------------------
DROP TABLE IF EXISTS `shiro_admin`;
CREATE TABLE `shiro_admin` (
  `id` varchar(50) NOT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `beforepassword` varchar(50) DEFAULT NULL,
  `passwordsalt` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of shiro_admin
-- ----------------------------
INSERT INTO `shiro_admin` VALUES ('d3b64745-63f8-11e9-86b8-000c29ddba79', 'xiaobai@qq.com', '4581eac79fbb649365e91629539a96d1', '123456', 'OMGG');
INSERT INTO `shiro_admin` VALUES ('d3bbedb3-63f8-11e9-86b8-000c29ddba79', 'xiaohei@qq.com', '4581eac79fbb649365e91629539a96d1', '123456', 'OMGG');
