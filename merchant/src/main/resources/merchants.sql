create table merchants (
  id int(10) unsigned not null auto_increment,
  name varchar(128) not null,
  logo_url varchar(512) not null,
  business_license_url varchar(512) not null,
  phone varchar(64) not null,
  address varchar not null,
  verified boolean not null,
  PRIMARY KEY (id)
  ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARACTER=utf8;
)