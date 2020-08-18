use fashion_colores;
-- Queris
-- 1-Clientes ID número 1
Select*From clientes 
where ID=5;

-- 2-Clientes con apellido con s
Select id,apellido
 From clientes 
 where apellido 
 like's%'; 

-- 3-Clientes con nombre m
Select id,nombre 
From clientes 
where nombre 
like 'm%'; 

-- 4-Clientes que no tengan registrado email
Select id,nombre,email 
From clientes 
where email 
like 'l%'; 

-- 5- factura número y letra
 Select*From facturas
 where numero=8 and letra='b';
 SELECT MAX(numero_factura) AS id FROM detalles;
-- 6- descripcion de detalle
select id_ropa,ropa,precio_ropa,cantidad,monto From detalles 
where numero_factura=2;
 
 
 select last_insert_id()+1 ;

 -- 6-descripcion de factura
 select f.letra,f.numero,f.fecha,f.id_cliente,c.nombre,c.apellido,c.dni,c.telefono,c.email,dt.id_ropa,r.ropa,dt.precio_ropa,dt.cantidad,f.monto,f.medio_pago,f.id_rebaja,re.promocion,re.descuento,f.total
 from detalles as dt
 inner join ropas as r on dt.id_ropa=r.id
 inner join facturas as f on dt.numero_factura=f.numero 
 inner join rebajas as re on f.id_rebaja=re.id
 inner join clientes as c on c.id=f.id_cliente;
 
 -- 6descripcion de factura
select f.letra,f.numero,f.fecha,f.id_cliente,c.nombre,c.apellido,c.dni,c.telefono,c.email,f.monto,f.medio_pago,f.id_rebaja,re.descuento,f.total
 from detalles as dt
 inner join ropas as r on dt.id_ropa=r.id
 inner join facturas as f on dt.numero_factura=f.numero 
 inner join rebajas as re on f.id_rebaja=re.id
 inner join clientes as c on c.id=f.id_cliente;
 
-- 7-detalles de la factura de la fecha (xx/xx/xxxx)
select*From facturas
 where fecha='2000-05-04';

-- 8- cliente que mas gasto en una compra con lo mayor gastado
Select*from facturas 
where monto= (select max(monto)from facturas) ;

-- 9- facturas registradas al cliente xxx
select*from facturas 
where id_cliente=5;

select*from facturas where fecha='2003/12/24';

select * from facturas
where fecha BETWEEN '2003/1/24'  AND '2003/12/24' ;
 -- where fecha='2003/12/24' AND '2003/12/24';
 
 select f.letra,f.numero,f.fecha,f.id_cliente,f.monto,f.medio_pago,f.id_rebaja,f.descuento,f.total
 from detalles as dt
 inner join facturas as f on dt.numero_factura=f.numero
 where f.fecha BETWEEN '2003/1/24'  AND '2003/12/24' ;
 
  select f.numero,f.letra,f.fecha,f.id_cliente,f.monto,f.medio_pago,f.id_rebaja,f.descuento,f.total
 from detalles as dt
 inner join facturas as f on dt.numero_factura=f.numero
 where f.fecha BETWEEN '2003/1/1'  AND '2003/12/31' ;


-- 10- Cantidad de facturas segun su descuento
SELECT descuento, COUNT(descuento) AS promo
FROM  facturas
GROUP BY descuento
ORDER BY promo;
 
-- 11- facturas con descuento y que tipo de descuento tienen
select letra,numero,descuento 
from facturas 
where descuento<>0;
/*select letra,numero,descuento
from facturas where descuento not like 0;*/

-- 12- cuál es el descuento más uso para facturar
SELECT descuento, COUNT( descuento ) AS descuento_mas_usado
FROM  facturas
GROUP BY descuento
ORDER BY descuento_mas_usado;

-- 13- ganancias según los años(agrupar en año)
select*from detalles;

-- 14- que prenda se compró más seguido
select d.id_ropa,d.ropa, count(d.cantidad) as ropa_mas_vendida
from detalles d
group by id_ropa
order by sum(d.cantidad);
select*from ropas;

-- 15-Ropa ID
select * from ropas where id=1;

-- busqueda de prenda
Select*From ropas where ropa='camisa' and genero_ropa = 'femenino'and stock=4  and talle= 'xl';

-- 16-Ropa más cara
select ropa,max(precio) as mas_cara from ropas 
ORDER BY `precio`;

-- 17-a-Cantidad de ropas segun su estacion
SELECT estacion, COUNT( estacion ) AS temporada
FROM  ropas
GROUP BY estacion
ORDER BY temporada;
-- 17-b- Ropas de primavera_verano
select ropa,estacion from ropas where estacion= 'primavera_verano';

-- 18-a-Ropa según su género
SELECT genero, COUNT( genero) AS sexo
FROM  ropas
GROUP BY genero
ORDER BY sexo;
-- 18-b- Ropas de genero f
select ropa,genero from ropas where genero= 'f';

-- 19-ropa color celeste
Select*From ropas where color= 'celeste';

-- 20-ropa talle 
Select id,ropa, estacion From ropas where talle='XL';
select MAX(numero)+1 as Numero from facturas;

-- 21-ultimo numero de factura
select count(*) N°_factura from facturas;

select last_insert_id()+1;
select id_ropa,ropa,precio_ropa,cantidad,monto from detalles;
