CREATE TABLE `sale_records` (
id bigint(20) NOT NULL AUTO_INCREMENT,
order_id bigint(20) DEFAULT NULL,
refund_id bigint(20) DEFAULT NULL,
channel_id bigint(20) DEFAULT NULL,
store_id bigint(20) DEFAULT NULL,
outer_order_no varchar(20) DEFAULT NULL,
tenant_code varchar(20) DEFAULT NULL,
total_list_price decimal(19,2) DEFAULT NULL,
total_discount_price decimal(19,2) DEFAULT NULL,
total_payment_price decimal(19,2) DEFAULT NULL,
freight_price decimal(19,2) DEFAULT NULL,
channel_type varchar(10) DEFAULT NULL,
created_id bigint(20) DEFAULT NULL,
salesman_id bigint(20) DEFAULT NULL,
transaction_type varchar(10) DEFAULT NULL,
offline_shop_code varchar(10) DEFAULT NULL,
trade_created datetime NOT NULL,
created_at datetime NOT NULL,
send_status varchar(4) NULL DEFAULT '',
send_msg varchar(100) DEFAULT NULL,
send_at datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idx_sale_record_order_id` (`order_id`),
  KEY `idx_sale_record_refund_id` (`refund_id`),
  KEY `idx_sale_record_trade_created` (`trade_created`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;