use fashion_color;
set sql_safe_updates=0;
-- inserto detalles de las clientes
    insert into clientes (id,nombre,apellido,dni,telefono,email,genero) values (0,'jose','sanchez',1243480,401050000,'martinsachez@gmail.com','m');
    insert into clientes (nombre,apellido,dni,telefono,email,genero) values ('Gabriela','Gonzalez',18461461,500060000,'GG46@hotmail.com','f');
    insert into clientes (nombre,apellido,dni,telefono,email,genero) values ('Florencia','Silva',17163189,700060000,'Florchiuuuu@gmail.com.ar','f');
    insert into clientes (nombre,apellido,dni,telefono,email,genero) values ('Jose','Stuar',16169961,80009999,'JOSE_ST@yahoo.com','m');
    insert into clientes (nombre,apellido,dni,telefono,email,genero) values ('Maria','Martinez',17411521,11114444,'M&M@hotmail.com.ar','f');
    insert into clientes (nombre,apellido,dni,telefono,email,genero) values ('Rosana','Lopez',18163666,22224444,'lopezrosita@gmail.com','f');
    insert into clientes (nombre,apellido,dni,telefono,email,genero) values ('Margarita','Salones',14978796,15151515,'salones89@yahoo.com','f');
    insert into clientes (nombre,apellido,dni,telefono,email,genero) values ('Estela','Abate',36646789,14232021,'EstelitaA@hotmail.com.ar','f');
    insert into clientes (nombre,apellido,dni,telefono,email,genero) values ('Pedro','ramirez',34507315,99994848,'perico@hotmail.com','m');
    insert into clientes (nombre,apellido,dni,telefono,email,genero) values ('Luis','fernandez',30001546,14141551,'LUIS_Fernandes_30@yahoo.com.ar','m');
    
-- inserto detalles de las rebajas 
	insert into rebajas (id,descripcion,promocion,descuento) values(1,'verano promo','descuento_50',50);
    insert into rebajas (id,descripcion,promocion,descuento) values(2,'jubilados','descuento_jubilados',30);
    insert into rebajas (id,descripcion,promocion,descuento) values(3,'galicia','descuento_bancos',25);
    insert into rebajas (id,descripcion,promocion,descuento) values(4,'remeras','descuento_2daprenda',15);
    insert into rebajas (id,descripcion,promocion,descuento) values(5,'Al momento','descuento_efectivo',10);
    insert into rebajas (id,descripcion,promocion,descuento) values(6,'nada','ninguna',0);
    
    
 -- inserto detalles de las facturas
	insert into facturas (letra,numero,id_cliente,fecha,medio_pago,id_rebaja,descuento,monto,total) values ('a',1,1,'2000/10/26','efectivo',2,30,600,600);
	insert into facturas (letra,numero,id_cliente,fecha,medio_pago,id_rebaja,descuento,monto,total) values ('b',2,2,'2002/02/15','efectivo',5,10,3600,3240);
	insert into facturas (letra,numero,id_cliente,fecha,medio_pago,id_rebaja,descuento,monto,total) values ('b',3,5,'2000/03/20','Tarjeta_credito',1,50,9000,4500);
	insert into facturas (letra,numero,id_cliente,fecha,medio_pago,id_rebaja,descuento,monto,total) values ('b',4,5,'2000/05/04','Tarjeta_credito',5,10,7100,6390);
	insert into facturas (letra,numero,id_cliente,fecha,medio_pago,id_rebaja,descuento,monto,total) values ('b',5,5,'2001/12/24','Tarjeta_credito',6,0,1600,1600);
	insert into facturas (letra,numero,id_cliente,fecha,medio_pago,id_rebaja,descuento,monto,total) values ('a',6,6,'2002/10/10','Tarjeta_credito',6,0,800,800);
	insert into facturas (letra,numero,id_cliente,fecha,medio_pago,id_rebaja,descuento,monto,total) values ('a',7,7,'2002/02/02','Mercado_pago',6,0,1600,1600);
	insert into facturas (letra,numero,id_cliente,fecha,medio_pago,id_rebaja,descuento,monto,total) values ('b',8,8,'2003/04/18','Tarjeta_credito',3,25,6100,4575);
	insert into facturas (letra,numero,id_cliente,fecha,medio_pago,id_rebaja,descuento,monto,total) values ('b',9,9,'2003/1/24','Tarjeta_debito',2,30,3200,2240);
	insert into facturas (letra,numero,id_cliente,fecha,medio_pago,id_rebaja,descuento,monto,total) values ('a',10,1,'2003/12/24','Tarjeta_debito',4,15,3900,3315);   
    insert into facturas (letra,numero,id_cliente,fecha,medio_pago,id_rebaja,descuento,monto,total) values ('a',11,1,'1000/10/10','indefinido',6,0,0,0);
    
     -- inserto detalles de las Ropas
	insert into ropas (ropa,talle,color,genero_ropa,estacion,stock,precio)  values('remera m.largas','xl','azul','unisex','primavera_verano',5,800);
	insert into ropas  (ropa,talle,color,genero_ropa,estacion,stock,precio) values('remera m.cortas','s','rosa','femenino','otoño_invierno',6,1300);
    insert into ropas  (ropa,talle,color,genero_ropa,estacion,stock,precio) values('camisa','m','verde','masculino','primavera_verano',3,1800);
    insert into ropas  (ropa,talle,color,genero_ropa,estacion,stock,precio) values('camisa','xl','celeste','femenino','otoño_invierno',4,1600);
    insert into ropas  (ropa,talle,color,genero_ropa,estacion,stock,precio) values('camisa','xxl','negro','masculino','primavera_verano',8,1400);
    insert into ropas  (ropa,talle,color,genero_ropa,estacion,stock,precio) values('jean','xl','gris','masculino','otoño_invierno',3,3000);
    insert into ropas  (ropa,talle,color,genero_ropa,estacion,stock,precio) values('jean','m','negro','femenino','otoño_invierno',4,3500);
    insert into ropas  (ropa,talle,color,genero_ropa,estacion,stock,precio) values('calsa','l','dorado','femenino','primavera_verano',2,600);
    insert into ropas  (ropa,talle,color,genero_ropa,estacion,stock,precio) values('vestido','unico','rojo','femenino','primavera_verano',2,3900);
    insert into ropas  (ropa,talle,color,genero_ropa,estacion,stock,precio) values('campera','xxl','azul_marino','unisex','otoño_invierno',4,4000);
    insert into ropas  (ropa,talle,color,genero_ropa,estacion,stock,precio) values('nada','unico','nada','unisex','otoño_invierno',0,0000);
-- inserto detalles de las detalles  
	insert into detalles (letra,numero_factura,id_ropa,ropa,precio_ropa,cantidad,monto) values('a',1,8,'calsa',600,1,600);
	insert into detalles (letra,numero_factura,id_ropa,ropa,precio_ropa,cantidad,monto) values('b',2,3,'camisa',1800,2,3600);
  	insert into detalles (letra,numero_factura,id_ropa,ropa,precio_ropa,cantidad,monto) values ('b',3,6,'jean',3000,3,9000);
	insert into detalles (letra,numero_factura,id_ropa,ropa,precio_ropa,cantidad,monto) values('b',4,9,'vestido',1600,2,3200);
	insert into detalles (letra,numero_factura,id_ropa,ropa,precio_ropa,cantidad,monto) values('b',4,4,'camisa',3900,1,3900);
	insert into detalles (letra,numero_factura,id_ropa,ropa,precio_ropa,cantidad,monto) values('b',5,4,'camisa',1600,1,1600);
    insert into detalles (letra,numero_factura,id_ropa,ropa,precio_ropa,cantidad,monto) values('a',6,1,'remera_mangas_largas',800,1,800);
	insert into detalles (letra,numero_factura,id_ropa,ropa,precio_ropa,cantidad,monto) values('a',7,4,'camisa',1600,1,1600);
	insert into detalles (letra,numero_factura,id_ropa,ropa,precio_ropa,cantidad,monto) values('b',8,1,'remera_mangas_largas',800,1,800);
    insert into detalles (letra,numero_factura,id_ropa,ropa,precio_ropa,cantidad,monto) values('b',8,5,'camisa',1400,1,1400);
    insert into detalles (letra,numero_factura,id_ropa,ropa,precio_ropa,cantidad,monto) values('b',8,9,'vestido',3900,1,3900);
	insert into detalles (letra,numero_factura,id_ropa,ropa,precio_ropa,cantidad,monto) values('b',9,4,'camisa',1600,2,3200);
    insert into detalles (letra,numero_factura,id_ropa,ropa,precio_ropa,cantidad,monto) values('a',10,9,'vestido',3900,1,3900);
    insert into detalles (letra,numero_factura,id_ropa,ropa,precio_ropa,cantidad,monto) values('a',11,11,'nada',0,0,0);


/*select * from ropas;
select * from clientes; 
select * from rebajas;
select * from facturas;
select * from detalles;
*/
-- insert into facturas (letra,numero,id_cliente,fecha,medio_pago,id_rebaja,descuento,monto,total) values ('a',1,1,'0000/00/00','indefinido',6,0,0,0);