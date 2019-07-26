/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50556
Source Host           : localhost:3306
Source Database       : wode

Target Server Type    : MYSQL
Target Server Version : 50556
File Encoding         : 65001

Date: 2019-07-26 19:00:27
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `permission`
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `permissionname` varchar(255) DEFAULT NULL COMMENT '权限名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO `permission` VALUES ('1', '列表');
INSERT INTO `permission` VALUES ('2', '新增');
INSERT INTO `permission` VALUES ('3', '修改');
INSERT INTO `permission` VALUES ('4', '删除');

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `rolename` varchar(255) DEFAULT NULL COMMENT '角色名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '超级管理员');
INSERT INTO `role` VALUES ('2', '总经理');
INSERT INTO `role` VALUES ('3', '技术总监');
INSERT INTO `role` VALUES ('4', '管理员');
INSERT INTO `role` VALUES ('5', '总代理');
INSERT INTO `role` VALUES ('6', '普通代理');
INSERT INTO `role` VALUES ('7', '高级代理');
INSERT INTO `role` VALUES ('8', '普通会员');
INSERT INTO `role` VALUES ('9', 'VIP会员');
INSERT INTO `role` VALUES ('10', '高级商家');
INSERT INTO `role` VALUES ('11', '普通商家');

-- ----------------------------
-- Table structure for `rolepermission`
-- ----------------------------
DROP TABLE IF EXISTS `rolepermission`;
CREATE TABLE `rolepermission` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `roleid` int(11) DEFAULT NULL COMMENT '角色id',
  `permissionid` int(11) DEFAULT NULL COMMENT '权限id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rolepermission
-- ----------------------------
INSERT INTO `rolepermission` VALUES ('1', '1', '1');
INSERT INTO `rolepermission` VALUES ('2', '1', '2');
INSERT INTO `rolepermission` VALUES ('3', '1', '3');
INSERT INTO `rolepermission` VALUES ('4', '1', '4');
INSERT INTO `rolepermission` VALUES ('5', '2', '1');
INSERT INTO `rolepermission` VALUES ('6', '2', '2');
INSERT INTO `rolepermission` VALUES ('7', '2', '3');
INSERT INTO `rolepermission` VALUES ('8', '2', '4');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `userName` varchar(32) NOT NULL,
  `passWord` varchar(50) NOT NULL,
  `realName` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'qqq', 'www', '管理员');
INSERT INTO `user` VALUES ('2', 'aaa', 'sss', '工作人员');
INSERT INTO `user` VALUES ('7', 'qq', 'ww', 'ee');
INSERT INTO `user` VALUES ('8', 'qqq', 'eee', 'rrrr');
INSERT INTO `user` VALUES ('9', 'aa', 'ww', 'eee');
INSERT INTO `user` VALUES ('10', 'as1d2', '3a1sd32', '3212d');
INSERT INTO `user` VALUES ('11', 'zhuzhang', 'hehe', '超管');
INSERT INTO `user` VALUES ('12', '吴斌', '123', '组长');
INSERT INTO `user` VALUES ('13', '彭佩', '123', '组员');
INSERT INTO `user` VALUES ('15', '语音识别', '123', '设备');
INSERT INTO `user` VALUES ('16', 'string', 'string', 'string');

-- ----------------------------
-- Table structure for `userrole`
-- ----------------------------
DROP TABLE IF EXISTS `userrole`;
CREATE TABLE `userrole` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `userid` int(11) DEFAULT NULL COMMENT '用户id',
  `roleid` int(11) DEFAULT NULL COMMENT '角色id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userrole
-- ----------------------------
INSERT INTO `userrole` VALUES ('1', '1', '1');
