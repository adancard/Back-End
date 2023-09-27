create database Projeto_Revisao;

use Projeto_Revisao;

create table tarefa(
id_tarefa int, 
titulo varchar(50),
descricao varchar(100),
status enum ('A','P','C'),
constraint pk_tarefa primary key (id_tarefa)
);