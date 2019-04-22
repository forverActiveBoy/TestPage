/*
Navicat MySQL Data Transfer

Source Server         : LinuxMysql
Source Server Version : 50560
Source Host           : 192.168.74.166:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50560
File Encoding         : 65001

Date: 2019-04-21 23:18:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for shiro_resource
-- ----------------------------
DROP TABLE IF EXISTS `shiro_resource`;
CREATE TABLE `shiro_resource` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `resname` varchar(50) DEFAULT NULL,
  `resurl` varchar(500) DEFAULT NULL,
  `restype` varchar(50) DEFAULT NULL,
  `rescode` varchar(50) DEFAULT NULL,
  `parent_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of shiro_resource
-- ----------------------------
INSERT INTO `shiro_resource` VALUES ('1', '????', null, 'menu', null, null);
INSERT INTO `shiro_resource` VALUES ('2', '?????', '/jsp/cmfz_banner.jsp', 'menu', null, '1');
INSERT INTO `shiro_resource` VALUES ('3', '????', '/jsp/cmfz_guru.jsp', 'menu', null, '1');
INSERT INTO `shiro_resource` VALUES ('4', '??????', '/jsp/cmfz_guru_article.jsp', 'menu', null, '1');
INSERT INTO `shiro_resource` VALUES ('5', '????', '/jsp/cmfz_listen.jsp', 'menu', null, '1');
INSERT INTO `shiro_resource` VALUES ('6', '????', '/jsp/cmfz_chapters_listing.jsp', 'menu', null, '1');
INSERT INTO `shiro_resource` VALUES ('7', '????', '/jsp/cmfz_user_category.jsp', 'menu', null, '1');
INSERT INTO `shiro_resource` VALUES ('8', '????', null, 'menu', null, null);
INSERT INTO `shiro_resource` VALUES ('9', '????', '/jsp/cmfz_userlog.jsp', 'menu', null, '8');
INSERT INTO `shiro_resource` VALUES ('10', '?????', null, 'menu', null, null);
INSERT INTO `shiro_resource` VALUES ('11', '????', '/jsp/cmfz_user.jsp', 'menu', null, '10');
INSERT INTO `shiro_resource` VALUES ('12', '????', '/jsp/cmfz_power.jsp', 'menu', null, '10');
INSERT INTO `shiro_resource` VALUES ('13', '?????', '/jsp/cmfz_admin.jsp', 'menu', null, '10');
INSERT INTO `shiro_resource` VALUES ('14', '?????', '/banner/addBanner.do', 'function', 'banner:create', '2');
INSERT INTO `shiro_resource` VALUES ('15', '?????', '/banner/deleteBanner.do', 'function', 'banner:delete', '2');
INSERT INTO `shiro_resource` VALUES ('16', '?????', '/banner/updateBanner.do', 'function', 'banner:update', '2');
INSERT INTO `shiro_resource` VALUES ('17', '????', '/role/addRole.do', 'function', 'role:create', '12');
INSERT INTO `shiro_resource` VALUES ('18', '????', '/role/removeRole.do', 'function', 'role:delete', '12');
INSERT INTO `shiro_resource` VALUES ('19', '????', '/role/modifyRole', 'function', 'role:update', '12');
