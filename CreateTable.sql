CREATE TABLE `itunes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `wrapperType` varchar(500) DEFAULT NULL,
  `trackName` varchar(500) DEFAULT NULL,
  `artistName` varchar(500) DEFAULT NULL,
  `collectionName` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;