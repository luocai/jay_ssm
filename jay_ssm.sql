/*
Navicat MySQL Data Transfer

Source Server         : cai
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : music

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2018-04-05 11:15:04
*/
use music;
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `roleId` int(5) NOT NULL,
  `roleName` varchar(10) NOT NULL,
  `rolePer` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`roleId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('0', 'visitor', null);
INSERT INTO `role` VALUES ('1', 'admin', null);

-- ----------------------------
-- Table structure for songs
-- ----------------------------
DROP TABLE IF EXISTS `songs`;
CREATE TABLE `songs` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) NOT NULL,
  `album` varchar(10) NOT NULL,
  `time` int(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=68 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of songs
-- ----------------------------
INSERT INTO `songs` VALUES ('1', '七里香', '七里香', '2004');
INSERT INTO `songs` VALUES ('2', '夜曲', '十一月的肖邦', '2005');
INSERT INTO `songs` VALUES ('3', '东风破', '叶惠美', '2003');
INSERT INTO `songs` VALUES ('4', '以父之名', '叶惠美', '2003');
INSERT INTO `songs` VALUES ('5', '夜的第七章', '依然范特西', '2006');
INSERT INTO `songs` VALUES ('13', '等你下课', '单曲', '2018');
INSERT INTO `songs` VALUES ('14', '可爱女人', 'jay', '2000');
INSERT INTO `songs` VALUES ('17', '四面楚歌', '十一月的肖邦', '2005');
INSERT INTO `songs` VALUES ('20', '外婆', '七里香', '200');
INSERT INTO `songs` VALUES ('26', '借口', '七里香', '800');
INSERT INTO `songs` VALUES ('27', '借口', '七里香', '900');
INSERT INTO `songs` VALUES ('28', '借口', '七里香', '1000');
INSERT INTO `songs` VALUES ('29', '借口', '七里香', '1100');
INSERT INTO `songs` VALUES ('30', '借口', '七里香', '1200');
INSERT INTO `songs` VALUES ('31', '借口', '七里香', '1300');
INSERT INTO `songs` VALUES ('32', '借口', '七里香', '1400');
INSERT INTO `songs` VALUES ('33', '借口', '七里香', '1500');
INSERT INTO `songs` VALUES ('34', '借口', '七里香', '1600');
INSERT INTO `songs` VALUES ('35', '借口', '七里香', '1700');
INSERT INTO `songs` VALUES ('36', '借口', '七里香', '1800');
INSERT INTO `songs` VALUES ('37', '借口', '七里香', '1900');
INSERT INTO `songs` VALUES ('38', '借口', '七里香', '2000');
INSERT INTO `songs` VALUES ('39', '借口', '七里香', '2100');
INSERT INTO `songs` VALUES ('40', '借口', '七里香', '2200');
INSERT INTO `songs` VALUES ('41', '借口', '七里香', '2300');
INSERT INTO `songs` VALUES ('42', '借口', '七里香', '2400');
INSERT INTO `songs` VALUES ('43', '借口', '七里香', '2500');
INSERT INTO `songs` VALUES ('44', '借口', '七里香', '2600');
INSERT INTO `songs` VALUES ('45', '借口', '七里香', '2700');
INSERT INTO `songs` VALUES ('46', '借口', '七里香', '2800');
INSERT INTO `songs` VALUES ('47', '借口', '七里香', '2900');
INSERT INTO `songs` VALUES ('48', '借口', '七里香', '3000');
INSERT INTO `songs` VALUES ('49', '借口', '七里香', '3100');
INSERT INTO `songs` VALUES ('50', '借口', '七里香', '3200');
INSERT INTO `songs` VALUES ('51', '借口', '七里香', '3300');
INSERT INTO `songs` VALUES ('52', '借口', '七里香', '3400');
INSERT INTO `songs` VALUES ('53', '借口', '七里香', '3500');
INSERT INTO `songs` VALUES ('54', '借口', '七里香', '3600');
INSERT INTO `songs` VALUES ('55', '借口', '七里香', '3700');
INSERT INTO `songs` VALUES ('56', '借口', '七里香', '3800');
INSERT INTO `songs` VALUES ('57', '借口', '七里香', '3900');
INSERT INTO `songs` VALUES ('58', '借口', '七里香', '4000');
INSERT INTO `songs` VALUES ('59', '借口', '七里香', '4100');
INSERT INTO `songs` VALUES ('60', '借口', '七里香', '4200');
INSERT INTO `songs` VALUES ('61', '借口', '七里香', '4300');
INSERT INTO `songs` VALUES ('62', '借口', '七里香', '4400');
INSERT INTO `songs` VALUES ('63', '借口', '七里香', '4500');
INSERT INTO `songs` VALUES ('64', '借口', '七里香', '4600');
INSERT INTO `songs` VALUES ('65', '借口', '七里香', '4700');
INSERT INTO `songs` VALUES ('66', '借口', '七里香', '4800');
INSERT INTO `songs` VALUES ('67', '借口', '七里香', '4900');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `username` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL,
  `role` int(5) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '诸葛财财', '6666', '1');
INSERT INTO `user` VALUES ('2', '空谷幽兰', '1314', '1');
INSERT INTO `user` VALUES ('3', 'cc', '1234', '0');
INSERT INTO `user` VALUES ('4', 'lili', '8888', '0');
INSERT INTO `user` VALUES ('5', 'hehe', 'hehe', '0');
INSERT INTO `user` VALUES ('6', 'lala', 'lala', '0');
INSERT INTO `user` VALUES ('7', 'cai', '1234', '0');
INSERT INTO `user` VALUES ('10', 'ooo', 'ooo', '0');
INSERT INTO `user` VALUES ('19', 'hello', 'hello', '0');
