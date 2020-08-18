drop database if exists fashion_color;
create database fashion_color;
use fashion_color;

create table if not exists clientes(
	id integer auto_increment primary key,
	nombre varchar(25) not null,
	apellido varchar(25) not null,
	dni int(8) not null unique,
	telefono int not null,
	email varchar(40),
	genero enum('f','m')
)ENGINE = InnoDB;

create table if not exists rebajas(
	id int auto_increment primary key,
    descripcion varchar(40) not null,
	promocion enum ('descuento_50','descuento_jubilados','descuento_bancos','descuento_2daprenda','descuento_efectivo','ninguna','fiestas'),
    descuento int  not null
)ENGINE = InnoDB;

create table  if not exists facturas( 
	numero int auto_increment,
    letra enum ('a','b','c'),
	fecha date,
	id_cliente int null,
    monto double,
    medio_pago enum ('efectivo','tarjeta_debito','tarjeta_credito','tranferencia_bancaria','mercado_pago','tranferencia_via_app','pago_electronico','indefinido'),
	id_rebaja int null,
    descuento int,
	total double,
    primary key (numero),
    constraint fk_id_cliente foreign key (id_cliente) references clientes(id),
    constraint fk_id_rebaja foreign key (id_rebaja) references rebajas(id)
)ENGINE = InnoDB;

create table  if not exists ropas( 
    id int auto_increment primary key,
	ropa varchar(35) not null,
    talle enum('xxs','xs','s','m','l','xl','xxl','xxxl','unico') not null,
    color  enum('nada','amarillo','azul','azul_marino','blanco','celeste','dorado','fucsia','gris','marfil','marron','naranja','negro','plata','rojo','rosa','verde','verde_lima','verde_oliva','violeta') not null,
    genero_ropa enum('femenino','masculino','unisex')not null,
    estacion enum ('primavera_verano','otoño_invierno'),
    stock int,
    precio double
)ENGINE = InnoDB; 

create table  if not exists detalles( 
	numero_factura int,
    letra enum ('a','b','c'),
    id_ropa int not null,
	ropa varchar(45),
	precio_ropa double,
    cantidad int unsigned not null,
    monto double,
	primary key(numero_factura,id_ropa),
	constraint FK_detalles_idropa foreign key (id_ropa) references ropas(id),
    constraint fk_detalles_numero_factura foreign key (numero_factura) references facturas(numero)
)ENGINE = InnoDB;


/*select * from ropas;
select * from clientes where id= 10; 
select * from facturas;
select * from rebajas;
select * from detalles;*/