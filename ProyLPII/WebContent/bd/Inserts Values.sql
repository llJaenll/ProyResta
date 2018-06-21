/*INSERTS BÁSICOS PARA FUNCIONAMIENTO*/
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
/*
insert into mesa values(null, 'Mesa para 2');
insert into mesa values(null, 'Mesa para 2');
insert into mesa values(null, 'Mesa para 4');
insert into mesa values(null, 'Mesa para 4');
insert into mesa values(null, 'Mesa para 8');
insert into mesa values(null, 'Mesa para 4');
insert into mesa values(null, 'Mesa para 4');
insert into mesa values(null, 'Mesa para 2');
insert into mesa values(null, 'Mesa para 8');
insert into mesa values(null, 'Mesa para 16');
insert into mesa values(null, 'Mesa para 5');
insert into mesa values(null, 'Mesa para 8');
*/

call usp_InsertarUsuario(1,'Maveric','Ramos','Pinillos','12345678','123456789','Mramos','ciber');
call usp_InsertarUsuario(2,'Gianfranco','Poma','Vidal','87654321','123456789','Gpoma','ciber');
call usp_InsertarUsuario(3,'Eduardo','Cumpa','Rojas','12345679','123456789','Ecumpa','ciber');
call usp_InsertarUsuario(4,'Jaen','Rumiche','Riveros','12345677','123456789','Jrumic','ciber');
call usp_InsertarUsuario(5,'Cristofer','Montalvo','Montalvo','12345671','123456789','Cmonta','ciber');

call usp_InsertarProducto(1,'Arroz chaufa',20,100,'ruta');

/*
call usp_InsertarCliente('Juan','Ramirez','Perez','12345678');
call usp_InsertarCliente('Ken','Cordova','Rojas','12345678');
call usp_InsertarCliente('Pablo','Ramirez','Diaz','12345678');
call usp_InsertarCliente('Jose','Alcorcon','Perez','12345678');
call usp_InsertarCliente('Jerundio','Guerrero','Mendoza','12345678');
call usp_InsertarCliente('Carlos','Lobaton','Cuevita','12345678');
*/
select * from estado;
select * from pedido;
select * from detalle_pedido;
select * from producto;
select * from usuario;
select * from tipo_categoria;
select * from tipo_usuario;





