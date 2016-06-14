/*
 Navicat Premium Data Transfer

 Source Server         : simple
 Source Server Type    : MySQL
 Source Server Version : 50713
 Source Host           : localhost
 Source Database       : test

 Target Server Type    : MySQL
 Target Server Version : 50713
 File Encoding         : utf-8

 Date: 06/12/2016 17:10:36 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `flight`
-- ----------------------------
DROP TABLE IF EXISTS `flight`;
CREATE TABLE `flight` (
  `id` int(11) NOT NULL,
  `origin` varchar(20) NOT NULL,
  `destination` varchar(20) NOT NULL,
  `airline` varchar(20) NOT NULL,
  `flight_number` varchar(20) NOT NULL,
  `traveler` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
--  Table structure for `sys_menu`
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `menu_id` int(32) NOT NULL AUTO_INCREMENT,
  `menu_url` varchar(255) NOT NULL COMMENT '菜单链接',
  `parent_id` int(32) DEFAULT '0' COMMENT '父级id',
  `menu_order` int(32) DEFAULT '0' COMMENT '菜单order',
  `menu_icon` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT '' COMMENT '菜单icon',
  PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
--  Table structure for `sys_permission`
-- ----------------------------
DROP TABLE IF EXISTS `sys_permission`;
CREATE TABLE `sys_permission` (
  `permission_id` int(32) NOT NULL AUTO_INCREMENT,
  `description` varchar(50) NOT NULL COMMENT '权限名称',
  PRIMARY KEY (`permission_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
--  Table structure for `sys_role`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `role_id` int(32) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(255) DEFAULT NULL COMMENT '用户角色名称',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
--  Table structure for `sys_role_permission`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_permission`;
CREATE TABLE `sys_role_permission` (
  `role_permission_id` int(32) NOT NULL AUTO_INCREMENT,
  `roleId` int(32) DEFAULT '0' COMMENT '角色id',
  `permission_id` int(32) DEFAULT '0' COMMENT '权限id',
  PRIMARY KEY (`role_permission_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
--  Table structure for `sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `used_id` int(32) NOT NULL,
  `user_name` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `nickName` varchar(50) DEFAULT NULL,
  `sex` bit(10) DEFAULT b'0',
  `phone` varchar(20) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `activity` bit(10) DEFAULT b'0',
  PRIMARY KEY (`used_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
--  Table structure for `sys_user_roles`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_roles`;
CREATE TABLE `sys_user_roles` (
  `user_roles_id` int(32) NOT NULL AUTO_INCREMENT,
  `user_id` int(32) DEFAULT '0',
  `role_id` int(32) DEFAULT '0',
  PRIMARY KEY (`user_roles_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

SET FOREIGN_KEY_CHECKS = 1;
