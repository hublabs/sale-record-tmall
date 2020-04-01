CREATE TABLE `tmall_promotions` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `shop_code` varchar(10) DEFAULT NULL,
  `tid` bigint(20) DEFAULT NULL,
  `oid` bigint(20) DEFAULT NULL,
  `discount_fee` decimal(19,2) DEFAULT NULL,
  `promotion_id` varchar(100) DEFAULT NULL,
  `promotion_name` varchar(100) DEFAULT NULL,
  `promotion_desc` varchar(100) DEFAULT NULL,
  `trade_created` datetime DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idx_tmall_promotions_tid` (`tid`),
  KEY `idx_tmall_promotions_oid` (`oid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
