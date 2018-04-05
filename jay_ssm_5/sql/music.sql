/*
Navicat MySQL Data Transfer

Source Server         : cai
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : music

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2018-03-18 08:39:12
*/

SET FOREIGN_KEY_CHECKS=0;

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
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

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

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `username` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '诸葛财财', '6666');
INSERT INTO `user` VALUES ('2', '空谷幽兰', '1314');
INSERT INTO `user` VALUES ('3', 'cc', '1234');
INSERT INTO `user` VALUES ('4', 'lili', '8888');
INSERT INTO `user` VALUES ('5', 'hehe', 'hehe');
INSERT INTO `user` VALUES ('6', 'lala', 'lala');
