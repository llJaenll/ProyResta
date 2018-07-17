/*INSERTS BASICOS PARA FUNCIONAMIENTO*/
use DBRestaurante;

insert into estado values(null,'Activo'); 			-- 1
insert into estado values(null,'Inactivo');			-- 2
insert into estado values(null, 'En proceso');		-- 3
insert into estado values(null, 'Pendiente');		-- 4
insert into estado values(null, 'Pagado');			-- 5
insert into estado values(null, 'Ordenado');		-- 6
insert into estado values(null, 'Cancelado');		-- 7
insert into estado values(null, 'Servido');			-- 8

insert into tipo_usuario values(null,'Administrador');
insert into tipo_usuario values(null,'Mesero');
insert into tipo_usuario values(null,'Cocinero');
insert into tipo_usuario values(null,'Recepcionista');
insert into tipo_usuario values(null,'Cajero');

insert into tipo_categoria values(null,'Menu');
insert into tipo_categoria values(null,'Ensaladas');
insert into tipo_categoria values(null,'Bebidas');
insert into tipo_categoria values(null,'Complementos');
insert into tipo_categoria values(null,'Ofertas');

call usp_InsertarUsuario(1,'Maveric','Ramos','Pinillos','12345678','123456789','Mramos','ciber');
call usp_InsertarUsuario(2,'Gianfranco','Poma','Vidal','87654321','123456789','Gpoma','ciber');
call usp_InsertarUsuario(3,'Eduardo','Cumpa','Rojas','12345679','123456789','Ecumpa','ciber');
call usp_InsertarUsuario(4,'Jaen','Rumiche','Riveros','12345677','123456789','Jrumic','ciber');
call usp_InsertarUsuario(5,'Cristofer','Montalvo','Montalvo','12345671','123456789','Cmonta','ciber');
insert into Motorizado(nom_Motor,apePat_Motor,apeMat_Motor,dni_Motor,nro_brevete,telf_Tra,placaAutomovil,Id_Estado
) values('Maveric','Ramos','Pinillos','12345678','12345678','12345679','ASDFE',1);


select * from estado;
select * from delivery;
select * from detalle_delivery;
select * from producto;
select * from usuario;
select * from tipo_categoria;
select * from tipo_usuario;

/*LOCALES*/
insert  into Locales values(null,'Miraflores',-77.0315913,-12.111062);
insert  into Locales values(null,'Surco',-76.99181550000003,-12.1416088);
/*PLATOS*/
-- null, categoria, nombre, precio, stock, estado
-- 1
insert into producto values(null,1,'Arroz Con Pollo',15.5,10,1);
insert into producto values(null,1,'Chanfainita',14.5,10,1);
insert into producto values(null,1,'Cau Cau',15,10,1);
insert into producto values(null,1,'Seco De Cabrito',17.5,10,1);
insert into producto values(null,1,'Arroz Con Pato',18.5,10,1);
insert into producto values(null,1,'Aji De Gallina',15.5,10,1);
insert into producto values(null,1,'Lomo Saltado',17,10,1);
insert into producto values(null,1,'Tacu Tacu',16,10,1);
insert into producto values(null,1,'Arroz Chaufa',15,10,1);
insert into producto values(null,1,'Tallarin Saltado',16,10,1);
-- 2
insert into producto values(null,2,'Ensalada De Pasta',10,10,1);
insert into producto values(null,2,'Ensalada De Patata',10.5,10,1);
insert into producto values(null,2,'Ensalada Mixta',11,10,1);
insert into producto values(null,2,'Ensalada Caprese',12.5,10,1);
insert into producto values(null,2,'Ensalada Waldorf',15,10,1);
insert into producto values(null,2,'Ensalada Rusa',15,10,1);
insert into producto values(null,2,'Ensalada De Col',14,10,1);
insert into producto values(null,2,'Ensalada Griega',13,10,1);
insert into producto values(null,2,'Ensalada Cesar',15,10,1);
insert into producto values(null,2,'Ensala de Palta',12,10,1);
-- 3
insert into producto values(null,3,'Pisco Sour',7,10,1);
insert into producto values(null,3,'Chicha Morada',8,10,1);
insert into producto values(null,3,'Limonada',8,10,1);
insert into producto values(null,3,'Chilcano',6.5,10,1);
insert into producto values(null,3,'Cuba Libre',7.5,10,1);
insert into producto values(null,3,'Gin Tonic',6.5,10,1);
insert into producto values(null,3,'Cerveza',7,10,1);
insert into producto values(null,3,'Inka Kola',7,10,1);
insert into producto values(null,3,'Coca Cola',8,10,1);
insert into producto values(null,3,'Maracuya Sour',7,10,1);
-- 4
insert into producto values(null,4,'Causa',10,10,1);
insert into producto values(null,4,'Ceviche',15,10,1);
insert into producto values(null,4,'Anticucho',12,10,1);
insert into producto values(null,4,'Mollejita',13,10,1);
insert into producto values(null,4,'Papa A La Huancaina',10,10,1);
insert into producto values(null,4,'Ocopa',10,10,1);
insert into producto values(null,4,'Rocoto Relleno',14,10,1);
insert into producto values(null,4,'Palta Rellena',10,10,1);
insert into producto values(null,4,'Tequenos',10,10,1);
insert into producto values(null,4,'Choritos A La Chalaca',15,10,1);
-- 5
insert into producto values(null,5,'Desayuno Continental',10,10,1);
insert into producto values(null,5,'Desayuno Americano',11,10,1);
insert into producto values(null,5,'Fruta Empalada',12,10,1);




