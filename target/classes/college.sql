
-- ----------------------------
-- Table structure for college
-- ----------------------------
DROP TABLE IF EXISTS `college`;
CREATE TABLE `college` (
  `college_id` int(32) NOT NULL AUTO_INCREMENT,
  `college_name` varchar(50) NOT NULL,
	`college_location` varchar(25) DEFAULT NULL,
  `art_min_grade` int(15) DEFAULT NULL,
	`art_min_rank` int(15) DEFAULT NULL,
	`science_min_grade` int(15) DEFAULT NULL,
	`science_min_rank` int(15) DEFAULT NULL,
  PRIMARY KEY (`college_id`)
) ENGINE=InnoDB CHARSET=utf8 ROW_FORMAT=COMPACT;
INSERT INTO college(`college_name`,`college_location`,`art_min_grade`,`art_min_rank`,`science_min_grade`,`science_min_rank`) VALUES ('玉林师范学院','广西',516,43053,446,135818),('右江民族医学院','广西',null,null,483,90567),('梧州学院','广西',515,43326,447,135321),('南宁学院','广西',514,44374,443,140504),('南宁师范大学','广西',530,30955,462,115227),('柳州工学院','广西',500,57594,427,161335),('贺州学院','广西',516,43099,349,249960),('河池学院','广西',null,null,446,136359),('桂林医学院','广西',null,null,494,78051),('桂林旅游学院','广西',515,43304,447,135569),('桂林理工大学','广西',532,29763,486,86577),('桂林航天工业学院','广西',516,43099,455,124652),('桂林电子科技大学','广西',537,26028,519,53109),('广西中医药大学','广西',545,21306,495,76568),('广西艺术学院','广西',519,40274,452,128297),('广西医科大学','广西',null,null,548,30223),('广西外国语学院','广西',509,48786,429,159200),('广西师范大学','广西',555,15502,517,54117),('广西民族大学','广西',543,22213,477,96814),('广西科技师范学院','广西',515,43304,447,135569),('广西科技大学','广西',483,75174,476,98755),('广西大学','广西',544,32988,null,null),('广西财经学院','广西',530,30919,480,93327),('北海艺术设计学院','广西',496,61302,425,164696),('北部湾大学','广西',517,41705,447,135486)
