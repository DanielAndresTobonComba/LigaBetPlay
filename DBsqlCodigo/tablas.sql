drop database if exists LigaBetPlay;
create database LigaBetPlay;
use LigaBetPlay;

create table jugadores (
	id int primary key auto_increment,
    nombre varchar(50) not null,
    edad int not null,
    identificacion varchar(15) not null unique,
    idEquipo int null,
    nacionalidad varchar(25),
    estado enum("Suspendido" ,"Lesionado" , "Activo" ),
	numCamiseta int null,
    posicion varchar(15) null
    
);

select * from jugadores;
