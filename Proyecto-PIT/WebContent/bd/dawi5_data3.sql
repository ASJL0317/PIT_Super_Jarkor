use bd_mantenimiento;

create table tb_personal(
cod_per      smallint not null auto_increment,
nom_per		 varchar(30),
img_bytes	 longblob,
img_nombre	 text,
img_content_type text,
cv_bytes	 longblob,
cv_nombre	 text,
cv_content_type text,
PRIMARY KEY (cod_per)
);