
CREATE DATABASE /*!32312 IF NOT EXISTS*/ `yinhangsystem` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `yinhangsystem`;

DROP TABLE IF EXISTS `config`;

CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';


LOCK TABLES `config` WRITE;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg'),(2,'picture2','upload/picture2.jpg'),(3,'picture3','upload/picture3.jpg');
UNLOCK TABLES;

DROP TABLE IF EXISTS `cunkuanxinxi`;

CREATE TABLE `cunkuanxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `kahao` varchar(200) DEFAULT NULL COMMENT '卡号',
  `yinxingmingcheng` varchar(200) DEFAULT NULL COMMENT '银行名称',
  `kaxing` varchar(200) DEFAULT NULL COMMENT '卡型',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `yue` int(11) NOT NULL COMMENT '存款金额',
  `cunkuanriqi` date DEFAULT NULL COMMENT '存款日期',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8 COMMENT='存款信息';


LOCK TABLES `cunkuanxinxi` WRITE;

UNLOCK TABLES;




DROP TABLE IF EXISTS `kahaozhanghu`;
CREATE TABLE `kahaozhanghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `kahao` varchar(200) NOT NULL COMMENT '卡号',
  `yinxingmingcheng` varchar(200) DEFAULT NULL COMMENT '银行名称',
  `kaxing` varchar(200) NOT NULL COMMENT '卡型',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `yue` float NOT NULL COMMENT '余额',
  `bankariqi` date DEFAULT NULL COMMENT '办卡日期',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  PRIMARY KEY (`id`),
  UNIQUE KEY `kahao` (`kahao`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8 COMMENT='卡号账户';

LOCK TABLES `kahaozhanghu` WRITE;
UNLOCK TABLES;


DROP TABLE IF EXISTS `kefufankui`;
CREATE TABLE `kefufankui` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) NOT NULL COMMENT '标题',
  `fankuineirong` longtext NOT NULL COMMENT '反馈内容',
  `fankuishijian` datetime DEFAULT NULL COMMENT '反馈时间',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `shhf` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=139 DEFAULT CHARSET=utf8 COMMENT='客服反馈';


LOCK TABLES `kefufankui` WRITE;

UNLOCK TABLES;

DROP TABLE IF EXISTS `qukuanxinxi`;
CREATE TABLE `qukuanxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `kahao` varchar(200) DEFAULT NULL COMMENT '卡号',
  `yinxingmingcheng` varchar(200) DEFAULT NULL COMMENT '银行名称',
  `kaxing` varchar(200) DEFAULT NULL COMMENT '卡型',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `yue` float NOT NULL COMMENT '取款金额',
  `qukuanriqi` date DEFAULT NULL COMMENT '取款日期',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8 COMMENT='取款信息';

LOCK TABLES `qukuanxinxi` WRITE;

UNLOCK TABLES;


DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='token表';


LOCK TABLES `token` WRITE;
UNLOCK TABLES;

DROP TABLE IF EXISTS `tongzhixinxi`;

CREATE TABLE `tongzhixinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) NOT NULL COMMENT '标题',
  `yonghuming` varchar(200) NOT NULL COMMENT '用户名',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `tongzhineirong` longtext COMMENT '通知内容',
  `tongzhishijian` datetime DEFAULT NULL COMMENT '通知时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `yinxingmingcheng` varchar(200) DEFAULT NULL COMMENT '银行名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COMMENT='通知信息';


LOCK TABLES `tongzhixinxi` WRITE;
UNLOCK TABLES;


DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';

LOCK TABLES `users` WRITE;

INSERT INTO `users` VALUES (1,'admin','admin','管理员','2023-03-21 08:30:55');

UNLOCK TABLES;


DROP TABLE IF EXISTS `yinxing`;

CREATE TABLE `yinxing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) NOT NULL COMMENT '账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `yinxingmingcheng` varchar(200) DEFAULT NULL COMMENT '银行名称',
  `fuzeren` varchar(200) DEFAULT NULL COMMENT '负责人',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `zixundianhua` varchar(200) DEFAULT NULL COMMENT '咨询电话',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhanghao` (`zhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8 COMMENT='银行';

LOCK TABLES `yinxing` WRITE;


UNLOCK TABLES;


DROP TABLE IF EXISTS `yonghu`;

CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuming` varchar(200) NOT NULL COMMENT '用户名',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yonghuming` (`yonghuming`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8 COMMENT='用户';


LOCK TABLES `yonghu` WRITE;

UNLOCK TABLES;



DROP TABLE IF EXISTS `zhuanzhangxinxi`;

CREATE TABLE `zhuanzhangxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `kahao` varchar(200) DEFAULT NULL COMMENT '卡号',
  `yinxingmingcheng` varchar(200) DEFAULT NULL COMMENT '银行名称',
  `kaxing` varchar(200) DEFAULT NULL COMMENT '卡型',
  `zhuanzhangkahao` varchar(200) NOT NULL COMMENT '转账卡号',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `yue` float NOT NULL COMMENT '转账金额',
  `zhuanzhangriqi` date DEFAULT NULL COMMENT '转账日期',
  `beizhu` longtext NOT NULL COMMENT '备注',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=79 DEFAULT CHARSET=utf8 COMMENT='转账信息';

LOCK TABLES `zhuanzhangxinxi` WRITE;
UNLOCK TABLES;

