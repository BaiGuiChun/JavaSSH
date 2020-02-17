/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50728
 Source Host           : localhost:3306
 Source Schema         : ssh

 Target Server Type    : MySQL
 Target Server Version : 50728
 File Encoding         : 65001

 Date: 16/02/2020 17:26:56
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for commodity
-- ----------------------------
DROP TABLE IF EXISTS `commodity`;
CREATE TABLE `commodity` (
  `COMMID` int(11) NOT NULL AUTO_INCREMENT,
  `CONAME` varchar(255) DEFAULT NULL,
  `COMPANY` varchar(255) DEFAULT NULL COMMENT '单位',
  `PLAOFO` varchar(255) DEFAULT NULL COMMENT '产地',
  `PRICE` varchar(255) DEFAULT NULL COMMENT '价格',
  PRIMARY KEY (`COMMID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of commodity
-- ----------------------------
BEGIN;
INSERT INTO `commodity` VALUES (1, 'iPhone12', '台', '中国华强北', '¥:5999');
INSERT INTO `commodity` VALUES (2, 'MacBookPro', '台', '中国华强北19号', '¥:19999');
COMMIT;

-- ----------------------------
-- Table structure for cust_comm
-- ----------------------------
DROP TABLE IF EXISTS `cust_comm`;
CREATE TABLE `cust_comm` (
  `CC_ID` int(10) NOT NULL AUTO_INCREMENT,
  `CUST_ID` int(10) DEFAULT NULL COMMENT '客户ID',
  `COMM_ID` int(10) DEFAULT NULL COMMENT '商品ID',
  `STATE` int(10) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`CC_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `CUST_ID` int(255) NOT NULL AUTO_INCREMENT,
  `CUNAME` varchar(255) DEFAULT NULL,
  `PHONE` varchar(255) DEFAULT NULL COMMENT '手机号码',
  `CARDID` varchar(255) DEFAULT NULL COMMENT '身份证',
  `ADDRESS` varchar(255) DEFAULT NULL COMMENT '地址',
  `GENDER` varchar(255) DEFAULT NULL COMMENT '性别',
  PRIMARY KEY (`CUST_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer
-- ----------------------------
BEGIN;
INSERT INTO `customer` VALUES (1, '东方红', '13012345678', '440981200011223344', 'zhongshuan', '女');
INSERT INTO `customer` VALUES (2, '张三', '1234567890', '356235295729', '中国', '男');
INSERT INTO `customer` VALUES (5, '李四', '13229991868', '356235295729', '广东省广州1', '男');
COMMIT;

-- ----------------------------
-- Table structure for sys_dictionaries
-- ----------------------------
DROP TABLE IF EXISTS `sys_dictionaries`;
CREATE TABLE `sys_dictionaries` (
  `DICT_ID` int(255) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(255) DEFAULT NULL,
  `BZ` varchar(255) DEFAULT NULL,
  `PARENT_ID` varchar(255) DEFAULT NULL COMMENT '上级ID',
  PRIMARY KEY (`DICT_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_dictionaries
-- ----------------------------
BEGIN;
INSERT INTO `sys_dictionaries` VALUES (1, '小明', '小明司机1h~100rmb', '');
INSERT INTO `sys_dictionaries` VALUES (2, '小红', '小红司机1h~101rmb', NULL);
INSERT INTO `sys_dictionaries` VALUES (3, '小李', '小李司机1h～102rmb', NULL);
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` varchar(255) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES ('1', 'admin', '1');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
