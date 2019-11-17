/*
Navicat MySQL Data Transfer

Source Server         : root@localhost
Source Server Version : 50140
Source Host           : localhost:3306
Source Database       : itcast-mybatis

Target Server Type    : MYSQL
Target Server Version : 50140
File Encoding         : 65001

Date: 2019-11-17 22:31:48
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `order`
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '下单用户ID',
  `number` varchar(32) NOT NULL COMMENT '订单号',
  `createtime` datetime NOT NULL COMMENT '订单创建时间',
  `note` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`),
  KEY `FK_ORDER` (`user_id`),
  KEY `FK_ORDER_user` (`user_id`),
  CONSTRAINT `FK_ORDER_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO order VALUES ('1', '13', '10001', '2019-11-19 19:24:19', null);
INSERT INTO order VALUES ('4', '13', '10002', '2019-11-17 19:25:07', null);
INSERT INTO order VALUES ('5', '14', '10003', '2019-11-17 19:25:42', null);

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(30) DEFAULT NULL,
  `sex` varchar(2) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO user VALUES ('13', '陆晓', '男', '2019-11-10', '北京市昌平区');
INSERT INTO user VALUES ('14', null, null, '2019-11-10', '湖北省武汉市-MybatisMapper');
INSERT INTO user VALUES ('15', '陆晓update', '男', '2019-11-10', '北京市昌平区update');
INSERT INTO user VALUES ('16', '陆晓', '男', '2019-11-10', '北京市昌平区');
INSERT INTO user VALUES ('17', '陆晓', '男', '2019-11-10', '北京市昌平区');
INSERT INTO user VALUES ('18', '王路路', '男', '2019-11-10', '湖北省武汉市');
INSERT INTO user VALUES ('19', '王路路', '男', '2019-11-10', '湖北省武汉市');
INSERT INTO user VALUES ('20', '王路路', '男', '2019-11-10', '湖北省武汉市');
INSERT INTO user VALUES ('21', '王路路', '男', '2019-11-10', '湖北省武汉市');
