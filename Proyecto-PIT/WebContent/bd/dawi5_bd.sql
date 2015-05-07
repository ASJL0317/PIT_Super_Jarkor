create database bd_mantenimiento;

use bd_mantenimiento;

create table tb_vendedor(
cod_ven      smallint not null auto_increment,
nom_ven		 varchar(30),	
ape_ven      varchar(30),
eda_ven      smallint,
fec_nac_ven	 date,
est_civ_ven	 varchar(30),
dis_ven		 varchar(30),
PRIMARY KEY (cod_ven)
);


create table tb_producto(
cod_pro      smallint not null auto_increment,
nom_pro      varchar(30),
pre_pro      real,
stk_pro 	 int,
cat_pro      varchar(30),
fec_reg_pro	 date,
PRIMARY KEY (cod_pro)
);


create table tb_sede(
cod_sed      smallint not null auto_increment,
nom_sed		 varchar(30),	
dir_sed      varchar(30),
fec_ina_sed  date,
ger_sed		 varchar(30),
dis_sed		 varchar(30),
PRIMARY KEY (cod_sed)
);



CREATE TABLE ubigeo(
id				int primary key,
departamento	varchar(70),
provincia		varchar(70),
distrito		varchar(70));
 

create table tb_estado_civil(
codigo      smallint not null auto_increment,
descripcion		 varchar(30),
PRIMARY KEY (codigo));




create table tb_cliente(
codigo      smallint not null auto_increment,
nombre		 varchar(30),
apellido     varchar(30),
distrito     int,
estado	 	 smallint,
PRIMARY KEY (codigo),
FOREIGN KEY (estado)  REFERENCES tb_estado_civil(codigo),
FOREIGN KEY (distrito)  REFERENCES ubigeo(id));


