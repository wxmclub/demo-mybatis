DROP TABLE IF EXISTS `t_doc`;

CREATE TABLE `t_doc` (
  `id` VARCHAR(32) NOT NULL COMMENT 'ID',
  `name` VARCHAR(64) NOT NULL COMMENT '名称',
  `sort_no` INTEGER NOT NULL COMMENT '排序号',
  PRIMARY KEY (`id`)
);


insert into t_doc (`id`,`name`,`sort_no`) values
 ('1','a1',1),
 ('2','a2',2),
 ('3','a3',3),
 ('4','a4',4),
 ('5','a5',5),
 ('6','a6',6),
 ('7','a7',7),
 ('8','a8',8),
 ('9','a9',9),
 ('10','a10',10),
 ('11','a11',11),
 ('12','a12',12),
 ('13','a13',13),
 ('14','a14',14),
 ('15','a15',15),
 ('16','a16',16),
 ('17','a17',17),
 ('18','a18',18),
 ('19','a19',19),
 ('20','a20',20);