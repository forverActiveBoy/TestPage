/*
Navicat MySQL Data Transfer

Source Server         : LinuxMysql
Source Server Version : 50560
Source Host           : 192.168.74.166:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50560
File Encoding         : 65001

Date: 2019-04-21 23:21:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for shiro_role_resource
-- ----------------------------
DROP TABLE IF EXISTS `shiro_role_resource`;
CREATE TABLE `shiro_role_resource` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rolename` varchar(50) DEFAULT NULL,
  `resid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of shiro_role_resource
-- ----------------------------
INSERT INTO `shiro_role_resource` VALUES ('1', 'system', '1');
INSERT INTO `shiro_role_resource` VALUES ('2', 'system', '2');
INSERT INTO `shiro_role_resource` VALUES ('3', 'system', '3');
INSERT INTO `shiro_role_resource` VALUES ('4', 'system', '4');
INSERT INTO `shiro_role_resource` VALUES ('5', 'system', '5');
INSERT INTO `shiro_role_resource` VALUES ('6', 'system', '6');
INSERT INTO `shiro_role_resource` VALUES ('7', 'system', '7');
INSERT INTO `shiro_role_resource` VALUES ('8', 'system', '8');
INSERT INTO `shiro_role_resource` VALUES ('9', 'system', '9');
INSERT INTO `shiro_role_resource` VALUES ('10', 'system', '10');
INSERT INTO `shiro_role_resource` VALUES ('11', 'system', '11');
INSERT INTO `shiro_role_resource` VALUES ('12', 'system', '12');
INSERT INTO `shiro_role_resource` VALUES ('13', 'system', '13');
INSERT INTO `shiro_role_resource` VALUES ('14', 'system', '14');
INSERT INTO `shiro_role_resource` VALUES ('15', 'system', '15');
INSERT INTO `shiro_role_resource` VALUES ('16', 'system', '16');
INSERT INTO `shiro_role_resource` VALUES ('17', 'system', '17');
INSERT INTO `shiro_role_resource` VALUES ('18', 'system', '18');
INSERT INTO `shiro_role_resource` VALUES ('19', 'system', '19');
