-- ELIMINAR SI EXISTE LA BD
drop database if exists DBRestaurante;
-- CREAR BD
create database DBRestaurante;
-- USAR BD
use DBRestaurante;

-- ////////////////////////////////////////////////////////////////////////////////////
-- CREACIÓN DE TABLAS
-- ////////////////////////////////////////////////////////////////////////////////////
drop table if exists Locales;
create table Locales(
	Id_Locales int auto_increment ,
	nombre_Locales varchar(40) not null,
    longitud_Locales double not null,
    latitud_Locales double not null,
    constraint pk_Locales primary key(Id_Locales)

);
-- ------------------------------------------------------------------------------------
drop table if exists Tipo_Usuario;
create table Tipo_Usuario(
	Id_TipoUsu int auto_increment ,
	des_TipoUsu varchar(40) not null,
	constraint pk_TipoUsu primary key(Id_TipoUsu)
);
-- ------------------------------------------------------------------------------------
drop table if exists Estado;
create table Estado(
	Id_Estado int auto_increment ,
    des_Estado varchar(40) not null,
    constraint pk_Id_Estado primary key(Id_Estado)
);
-- ------------------------------------------------------------------------------------  
drop table if exists Usuario;  
create table Usuario(
	Id_Usu int auto_increment ,
	Id_TipoUsu int not null,
	nom_Usu varchar(40) not null,
	apePat_Usu varchar(40) not null,
	apeMat_Usu varchar(40) not null,
	dni_Usu char(8) not null ,
	telf_Usu char(9) not null,
	fechIng_Usu timestamp default current_timestamp,
	Id_Estado int not null,
    usuario varchar(10),
    contraseña varchar(10),
	constraint pk_Usuario primary key(Id_Usu),
	constraint fk_Id_Estado foreign key(Id_Estado) references Estado(Id_Estado),
	constraint fk_TipoUsu foreign key(Id_TipoUsu) references Tipo_Usuario(Id_TipoUsu),
	constraint uq_dni_Usu unique(dni_Usu)
);


-- ------------------------------------------------------------------------------------ 
drop table if exists Tipo_Categoria; 
create table Tipo_Categoria(
	Id_TipoCat int auto_increment ,
	des_TipoCat varchar(30) not null,
	constraint pk_TipoCategoria primary key(Id_TipoCat)  
);

-- ------------------------------------------------------------------------------------  
drop table if exists Producto;
create table Producto(
    Id_Prod int auto_increment ,
    Id_TipoCat int not null,
    nom_Prod varchar(60) not null,
    precio_Prod decimal(6,2) not null,
    stock_Prod smallint null,
    Id_Estado int not null,
    constraint pk_Id_Prod primary key(Id_Prod),
    constraint fk_Id_Estado2 foreign key(Id_Estado) references Estado(Id_Estado),
    constraint fk_Id_TipoCat foreign key(Id_TipoCat) references Tipo_Categoria(Id_TipoCat)
);


-- ------------------------------------------------------------------------------------ 
drop table if exists Pedido;      
create table Pedido(
    Id_Pedido int ,
    Id_Usu int not null,
    Nro_Mesa int not null,
	fech_Pedido timestamp default current_timestamp,
    Id_Estado int default 3,
    total numeric(6,2) default 0
    
);
-- ------------------------------------------------------------------------------------
drop table if exists detalle_Pedido;    	
create table detalle_Pedido(
    Id_Pedido int ,
    Id_Prod int not null,
    cant tinyint not null,
    prec_Prod decimal (6,2)not null,
 --   subtotal decimal(6,2) as (cant*prec_prod),
    id_estado int default 3,
    fech_Pedido timestamp default current_timestamp
);

-- TABLAS NUEVAS
drop table if exists Motorizado;   
CREATE TABLE Motorizado(
	Id_Motor int auto_increment,
	nom_Motor varchar(40) not null,
	apePat_Motor varchar(40) not null,
	apeMat_Motor varchar(40) not null,
	dni_Motor char(8) not null ,
    nro_brevete char(8) not null,
	telf_Tra char(9) not null,
    placaAutomovil char(5) not null,
	fechIng_Tra timestamp default current_timestamp,
	Id_Estado int not null,
    constraint pk_IdMot primary key(id_Motor),
    constraint fk_IdEstado foreign key(id_Estado) references Estado(Id_Estado)
   -- usuario varchar(10),
   -- contraseña varchar(10),
);


drop table if exists Delivery;      
create table Delivery(
    Id_Del int ,
    id_Motor int,
    dir varchar(80),
	fech_Del timestamp default current_timestamp,
    total numeric(6,2) default 0
);

drop table if exists detalle_Delivery;    	
create table detalle_Delivery(
    Id_Del int ,
    Id_Prod int not null,
    cant tinyint not null,
    prec_Prod decimal (6,2)not null,
	subtotal decimal(6,2) as (cant*prec_prod),
    fech_Pedido timestamp default current_timestamp
);




-- ------------------------------------------------------------------------------------  
-- ////////////////////////////////////////////////////////////////////////////////////
-- CREACIÓN DE PROCEDIMIENTOS ALMACENADOS
-- ////////////////////////////////////////////////////////////////////////////////////

drop procedure if exists usp_PedidosAtendidosUsuario;
DELIMITER $$
create procedure usp_PedidosAtendidosUsuario(
	xId_Usu int
)
    begin
		Select 
			u.Id_Usu 'Codigo Usuario',
			concat(u.nom_Usu,space(1),u.apePat_Usu,space(1),u.apeMat_Usu) as 'Nombre Usuario', 
			p.Id_Pedido 'Codigo Pedido',
			p.total_Pedido 'Total'
		from Pedido p
		inner join usuario u on p.Id_Usu = u.Id_Usu
		where u.Id_Usu = xId_Usu;
	end $$
DELIMITER ;

-- ----------------------------------------------------------------------------------------------------------
drop procedure if exists usp_InsertarUsuario;
DELIMITER $$
create procedure usp_InsertarUsuario(
	xId_TipoUsu int,
	xnom_Usu varchar(40),
	xapePat_Usu varchar(40),
	xapeMat_Usu varchar(40),
	xdni_Usu char(8),
	xtelf_Usu char(9),
	xUsuario varchar(10),
	xContraseña varchar(10)
)
    begin
		Insert into Usuario values(
			null,
			xId_TipoUsu,
			xnom_Usu,
			xapePat_Usu,
			xapeMat_Usu,
			xdni_Usu,
			xtelf_Usu,
			null,
			1,
			xUsuario,
			xContraseña
		);
    end $$
DELIMITER ;

-- ----------------------------------------------------------------------------------------------------------
drop procedure if exists usp_InsertarProducto;
DELIMITER $$
create procedure usp_InsertarProducto(
	xId_TipoCat int,
	xnom_Prod varchar(60),
	xprecio_Prod decimal(6,2),
	xstock_Prod smallint
)
    begin
		Insert into Producto values(
			null,
			xId_TipoCat,
			xnom_Prod,
			xprecio_Prod,
			xstock_Prod,
			1
		);
    end $$
DELIMITER ;
-- ------------------------------------------------------------------------------------------------------------------
drop procedure if exists usp_ActualizarUsuario;
DELIMITER $$
create procedure usp_ActualizarUsuario(
	xid_usuario int,
	xId_TipoUsu int,
	xnom_Usu varchar(40),
	xapePat_Usu varchar(40),
	xapeMat_Usu varchar(40),
	xdni_Usu char(8),
	xtelf_Usu char(9),
	xusuario varchar(10),
	xcontraseña varchar(10)
)
	begin 
		Update usuario
			set Id_TipoUsu = xId_TipoUsu,
				nom_Usu = xnom_Usu,
				apePat_Usu = xapePat_Usu,
				apeMat_Usu = xapeMat_Usu,
				dni_Usu = xdni_Usu,
				telf_Usu = xtelf_Usu,
                usuario=xusuario,
				contraseña =xcontraseña
                where Id_Usu=xid_usuario;
	end $$
DELIMITER ;

-- ------------------------------------------------------------------------------------------------------------------
drop procedure if exists usp_ActualizarProducto;
DELIMITER $$
create procedure usp_ActualizarProducto(
	xId_Prod int,
	xId_TipoCat int,
	xnom_Prod varchar(60),
	xprecio_Prod decimal(6,2),
	xstock_Prod smallint
)
    begin 
		update producto
			set Id_TipoCat = xId_TipoCat,
			nom_Prod = xnom_Prod,
			precio_Prod = xprecio_Prod,
			stock_Prod = xstock_Prod,
			Id_estado=1
			where Id_Prod=xid_Prod;
	end $$
DELIMITER ;
-- ------------------------------------------------------------------------------------------------------------------
drop procedure if exists usp_listarProductoPorCategoria;
DELIMITER $$
create procedure usp_listarProductoPorCategoria(
	xId_TipoCat int
)
    begin 
		Select 
			*
		from producto
		where Id_TipoCat = xId_TipoCat;
	end $$
DELIMITER ;
-- ------------------------------------------------------------------------------------------------------------------
drop procedure if exists usp_listarProducto;
DELIMITER $$
create procedure usp_listarProducto()
    begin 
		Select 
			p.Id_Prod,p.nom_Prod,c.des_TipoCat,p.precio_Prod,p.stock_Prod,
            p.Id_Estado
		from producto p inner join tipo_categoria c
        on p.Id_TipoCat=c.Id_TipoCat
		where Id_Estado = 1;
	end $$
DELIMITER ;

 --  -------------------------------------------------------------------------
drop procedure if exists usp_validarIngreso;
DELIMITER $$
create procedure usp_validarIngreso(
	xUsuario varchar(10),
	xContraseña varchar(10)
)
	begin 
		select 
			* 
        from usuario
        where usuario=xUsuario and contraseña=xContraseña;
	end $$
DELIMITER ;


 --  ------------------------------------------------------------------------- 
drop procedure if exists usp_usuarioTipo;
Delimiter $$
create procedure usp_usuarioTipo()
    begin
		select 
			u.Id_usu,
			tu.des_TipoUsu,
			u.nom_Usu,
			u.apePat_Usu,
			u.apeMat_Usu,
			u.telf_Usu,
            u.fechIng_Usu,
			u.dni_Usu,u.usuario,u.contraseña
			from usuario u
			inner join tipo_usuario tu on u.Id_TipoUsu=tu.Id_TipoUsu 
            where id_estado=1;
	end $$
DELIMITER ;

 --  -------------------------------------------------------------------------		
drop procedure if exists usp_buscarusuarioTipo;
Delimiter $$
create procedure usp_buscarusuarioTipo(cod int)
    begin
		select 
			u.Id_usu,
			tu.des_TipoUsu,
			u.nom_Usu,
			u.apePat_Usu,
			u.apeMat_Usu,
			u.telf_Usu,
			u.dni_Usu,u.usuario,u.contraseña
			from usuario u
			inner join tipo_usuario tu on u.Id_TipoUsu=tu.Id_TipoUsu
			where u.id_usu=cod and u.Id_Estado=1;
	end $$
DELIMITER ;
 --  -------------------------------------------------------------------------
drop procedure if exists usp_EliminarUsuario;
DELIMITER $$
create procedure usp_EliminarUsuario(
	xId_Usu int
)
    begin
		update usuario
			set Id_Estado = 2
			where Id_Usu = xId_Usu;
	end $$
DELIMITER ;
 --  -------------------------------------------------------------------------
drop procedure if exists usp_EliminarProducto;
DELIMITER $$
create procedure usp_EliminarProducto(
	xId_Prod int
)
    begin
		update producto
			set Id_Estado = 2
			where Id_Prod = xId_Prod;
	end $$
DELIMITER ;
--  ------------------------------------------------------------------------- 
drop procedure if exists usp_validarDNI;
DELIMITER $$
create procedure usp_validarDNI(
	xdni char(8)
)
    begin
		select 
			* 
        from usuario u  
        where u.dni_Usu=xdni;
    end $$
DELIMITER ;
--  -------------------------------------------------------------------------     
drop procedure if exists usp_InsertarDelivery;
DELIMITER $$
CREATE PROCEDURE usp_InsertarDelivery(
	xId_Del int,
	xid_Motor int,
	xdir varchar(80)
)
	begin
		insert into Delivery(
			Id_Del,
			id_Motor,
			dir
		) 
		values(
			xId_Del,
			xid_Motor,
			xdir
		);
	end $$
DELIMITER ;
--  ------------------------------------------------------------------------- 
drop procedure if exists usp_InsertarDetalleDelivery;
DELIMITER $$
CREATE PROCEDURE usp_InsertarDetalleDelivery(    
    xId_Del int,
	xId_Prod int,
	xCant int,
	xPrec_Prod decimal(6,2)
)
	begin
		insert into detalle_delivery(
			Id_Del,
			Id_Prod,
			Cant,
			Prec_Prod
		)
        values(
			xId_Del,
			xId_Prod,
			xCant,
			xPrec_Prod
		);

	UPDATE producto 
		SET stock_Prod = stock_Prod - xCant
		WHERE Id_Prod=xId_Prod;
	UPDATE Delivery set total=total+(xCant*xPrec_Prod)
		where Id_Del=xId_Del;    
	end $$
DELIMITER ;
--  ------------------------------------------------------------------------- 
drop procedure if exists usp_ActualizaDetallePedido;
DELIMITER $$
CREATE PROCEDURE usp_ActualizaDetallePedido(
	xId_Pedido int,
	xId_Prod int,
	xCant int,
	xPrec_Prod decimal(6,2)
)
	begin
		update detalle_pedido 
			set cant=cant+xCant 
		where Id_Pedido=xId_Pedido and Id_Prod=xId_Prod and id_estado=3;

		UPDATE producto 
			SET stock_Prod = stock_Prod - xCant
		WHERE Id_Prod=xID_Prod ;
	end $$
DELIMITER ;
--  ------------------------------------------------------------------------- 
drop procedure if exists usp_EliminarDetallePedido;
DELIMITER $$
CREATE PROCEDURE usp_EliminarDetallePedido(
	xId_Pedido int,
	xId_Prod int,
	xCant int,
	xPrec_Prod decimal(6,2)
)
	begin
		delete from detalle_pedido
        where Id_Pedido=xId_Pedido and Id_Prod=xId_Prod and id_estado=3;

		UPDATE producto 
			SET stock_Prod = stock_Prod + xCant
		WHERE Id_Prod=xID_Prod;
	end $$
DELIMITER ;
--  ------------------------------------------------------------------------- 
drop procedure if exists usp_CancelarPedido;
DELIMITER $$
CREATE PROCEDURE usp_CancelarPedido(
	xId_Prod int,
	xCant int
)
	begin
		UPDATE producto 
			SET stock_Prod = stock_Prod + xCant
		WHERE Id_Prod=xID_Prod;
	end $$
DELIMITER ;
--  ------------------------------------------------------------------------- 
drop procedure if exists usp_EliminarPedidos;
DELIMITER $$
CREATE PROCEDURE usp_EliminarPedidos(
	xId_Ped int
)
	begin
		delete from pedido 
        where Id_Pedido=xId_Ped;
        
		delete from detalle_pedido 
        where Id_Pedido=xId_Ped;
	end $$
DELIMITER ;
--  ------------------------------------------------------------------------- 
drop procedure if exists usp_ActualizarPedido;
DELIMITER $$
CREATE PROCEDURE usp_ActualizarPedido(
	xId_Ped int,
	xtotal numeric(6,2)
)
	begin
		update pedido 
			set total=xTotal, 
			id_estado=4 
			where Id_Pedido=xId_Ped;

		update detalle_pedido 
			set id_estado=6 
			where Id_Pedido=xId_Ped;
	end $$
DELIMITER ;
--  -------------------------------------------------------------------------     
drop procedure if exists usp_MuestraDetalle;
DELIMITER $$
CREATE PROCEDURE usp_MuestraDetalle(
	xId_Pedido int
)
	begin
		select 
			p.Id_Prod, 
			p.nom_Prod,
			dp.cant,
			dp.prec_Prod,
			dp.subtotal 
		from detalle_pedido dp join producto p
		on dp.id_prod = p.id_prod
		where dp.Id_Pedido=xId_Pedido and dp.Id_Estado=3;
	end $$
DELIMITER ;
--  -------------------------------------------------------------------------     
drop procedure if exists usp_MuestraDetalletipo;
DELIMITER $$
CREATE PROCEDURE usp_MuestraDetalletipo(
	xId_Pedido int
)
	begin
		select 
			p.Id_Prod, 
			p.nom_Prod,
			dp.cant,
			dp.prec_Prod,
			dp.subtotal 
		from detalle_pedido dp 
		join producto p on dp.id_prod = p.id_prod
		where dp.Id_Pedido=xId_Pedido and (dp.Id_estado=6 or dp.id_estado=8);
	end $$
DELIMITER ;
--  ------------------------------------------------------------------------- 
drop procedure if exists usp_MuestraProductosStock;
DELIMITER $$
create procedure usp_MuestraProductosStock()
	begin
		select 
			 Id_Prod,nom_Prod,precio_Prod,stock_Prod
		from producto 
        where stock_prod<50;
	end $$
DELIMITER ;
--  ------------------------------------------------------------------------- 
drop procedure if exists usp_MuestraProductosCategoria
DELIMITER $$
create procedure usp_MuestraProductosCategoria(
	xId_TipCat int
)
	begin
		select
		 Id_Prod,nom_Prod,precio_Prod,stock_Prod
		from producto 
        where Id_TipoCat=xId_TipCat;
	end $$
DELIMITER ;
--  ------------------------------------------------------------------------- 
drop procedure if exists usp_MuestraProductosMasVendidos;
DELIMITER $$
create procedure usp_MuestraProductosMasVendidos(
	xId_TipCat int
)
	begin
			select 
			p.nom_Prod 
		from detalle_pedido dp
		join producto p on p.Id_Prod=dp.Id_Prod 
		group by p.nom_Prod order by sum(dp.cant) desc limit 8;
	end $$
DELIMITER ;
--  ------------------------------------------------------------------------- 
delimiter $$
create procedure usp_reporte_Mes_Año(
	anio int
)
	begin
		select 
			(select sum(p.total) from pedido p where month(p.fech_Pedido)=1) as 'Enero',
			(select sum(p.total) from pedido p where month(p.fech_Pedido)=2) as 'Febrero',
			(select sum(p.total) from pedido p where month(p.fech_Pedido)=3) as 'Marzo',
			(select sum(p.total) from pedido p where month(p.fech_Pedido)=4) as 'Abril',
			(select sum(p.total) from pedido p where month(p.fech_Pedido)=5) as 'Mayo',
			(select sum(p.total) from pedido p where month(p.fech_Pedido)=6) as 'Junio',
			(select sum(p.total) from pedido p where month(p.fech_Pedido)=7) as 'Julio',
			(select sum(p.total) from pedido p where month(p.fech_Pedido)=8) as 'Agosto',
			(select sum(p.total) from pedido p where month(p.fech_Pedido)=9) as 'Setiembre',
			(select sum(p.total) from pedido p where month(p.fech_Pedido)=10) as 'Octubre',
			(select sum(p.total) from pedido p where month(p.fech_Pedido)=11) as 'Noviembre',
			(select sum(p.total) from pedido p where month(p.fech_Pedido)=12) as 'Diciembre' 
		from pedido p 
		where year(p.fech_Pedido)=anio 
		group by 1 ;
	end $$
delimiter ;
--  ------------------------------------------------------------------------- 
delimiter $$
create procedure usp_PlatomasVendido()
	begin
		select 
			p.nom_Prod,
			sum(dp.cant) 'Ventas' 
		from detalle_pedido dp
		join producto p on p.Id_Prod=dp.Id_Prod 
		group by p.nom_Prod order by sum(dp.cant) desc limit 8;
	end $$
delimiter ;
--  ------------------------------------------------------------------------- 
drop procedure if exists usp_ventaDia;
delimiter $$
create procedure usp_ventaDia ()
	begin
		select 
			sum(p.total) 
		from pedido p 
        where day(p.fech_Pedido)=day(now());
	end $$
delimiter ;
--  ------------------------------------------------------------------------- 
drop procedure if exists usp_ListarPedidoxMesa;
delimiter $$
create procedure usp_ListarPedidoxMesa(xNro_Mesa int)
	begin
		select 
			pr.nom_Prod, 
			dp.cant,
			dp.fech_Pedido,
			p.Id_Pedido
		from pedido p 
		join detalle_pedido dp on p.Id_Pedido = dp.Id_Pedido 
		join producto pr on dp.Id_Prod = pr.Id_Prod
		where p.Nro_Mesa = xNro_Mesa and dp.Id_Estado = 6 and p.Id_Estado=4;
	end $$
delimiter ;
--  ------------------------------------------------------------------------- 
drop procedure if exists usp_evaluarMesa;
delimiter $$
create procedure usp_evaluarMesa(xNro_Mesa int)
	begin
		select p.Id_Pedido 
		from pedido p 
		where p.Nro_Mesa = xNro_Mesa and (p.Id_Estado=3 or p.Id_Estado=4);
	end $$
delimiter ;
--  ------------------------------------------------------------------------- 
drop procedure if exists usp_evaluarReserva;
delimiter $$
create procedure usp_evaluarReserva(xNro_Mesa int, hora int)
	begin
		select 
			* 
        from reserva 
        where Nro_Mesa=xNro_Mesa and hora_Reserva=hora and Id_estado=1;
	end $$
delimiter ;
--  ------------------------------------------------------------------------- 
drop procedure if exists usp_clientesReserva;
delimiter $$
create procedure usp_clientesReserva()
	begin
		select 
			c.nom_Cliente,
			count(r.Id_Reserva) 
		from cliente c 
		inner join reserva r on c.id_Cliente=r.id_Cliente 
		group by c.nom_Cliente 
		order by count(r.Id_Reserva) desc limit 8;
	end $$
delimiter ;
--  ------------------------------------------------------------------------- 
drop procedure if exists usp_pedido;
delimiter $$
create procedure usp_pedido(
	xnumMesa int
)
	begin
		select 
			dt.cant,
			pd.nom_Prod,
			dt.prec_Prod,
			dt.subtotal 
		from pedido p 
		inner join detalle_pedido dt on p.Id_Pedido=dt.Id_Pedido
		inner join producto pd on dt.Id_Prod=pd.Id_Prod
		where p.Nro_Mesa=xnumMesa and p.Id_Estado=5;
    end $$
delimiter ;
  --  -------------------------------------------------------------------------   
drop procedure if exists usp_actulizarPedidoPrePagado;
delimiter $$
create procedure usp_actulizarPedidoPrePagado(
	xid_pedido int
)
    begin
		update pedido 
			set id_estado=5
			where Id_Pedido=xid_pedido;
	end $$
delimiter ;
--  ------------------------------------------------------------------------- 
drop procedure if exists usp_actulizarPedidoPagado;
delimiter $$
create procedure usp_actulizarPedidoPagado(
	xid_pedido int
)
    begin
		update pedido 
			set id_estado=7
			where Id_Pedido=xid_pedido;
	end $$
delimiter ;
--  ------------------------------------------------------------------------- 	
drop procedure if exists usp_actualizarEstadoDetallePedido;
delimiter $$
create procedure usp_actualizarEstadoDetallePedido(
	horaSegundo varchar(8),
    xid_pedido int
)
    begin
		update detalle_pedido 
				set id_estado=8
				where substring(fech_Pedido,12,19)=horaSegundo and id_pedido=xid_pedido;
	end $$
delimiter ;  
--  -------------------------------------------------------------------------   
drop procedure if exists usp_mesasReserva;
delimiter $$
create procedure usp_mesasReserva()
	begin
		select r.Nro_Mesa,
		count(Id_Reserva) from reserva r group by r.Nro_Mesa order by count(Id_Reserva) desc limit 8;
	end $$
delimiter ;  

-- ---------------------------------------
/*Relaciones


alter table delivery
add constraint pk_IdDelivery primary key(id_del);

alter table delivery
add constraint fk_IdMotor foreign key(id_Motor) references Motorizado(id_Motor);

alter table detalle_delivery
add constraint fk_IdDelivery foreign key(id_del) references delivery(id_del);

alter table detalle_delivery
add constraint fk_DelIdprod foreign key(id_prod) references Producto(id_prod);

*/



call usp_validarIngreso('Mramos','ciber') ;-- ------------------------------------------------------------------------------------  drop table if exists Tipo_Categoria

insert  into Locales values(null,'Miraflores',-77.0315913,-12.111062);
insert  into Locales values(null,'Surco',-76.99181550000003,-12.1416088);
insert into producto values(null,1,'Arroz con Pollo',29.5,10,1);
insert into producto values(null,1,'Arroz con Pato',2.5,10,1,"");
insert into producto values(null,1,'Cebiche',25,10,1,"");
insert into producto values(null,1,'Tallarines',29,10,1,"");
insert into producto values(null,1,'Lomo',2,10,1,"");