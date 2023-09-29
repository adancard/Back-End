create database Projeto_Revisao;

use Projeto_Revisao;

create table tarefa(
id_tarefa int, 
titulo varchar(50),
descricao varchar(100),
status enum ('A','P','C'),
constraint pk_tarefa primary key (id_tarefa)
);

create table log_tarefa(

id_log int not null auto_increment,
id_tarefa int not null,
operacao varchar(80),
mensagem varchar(80),
data_hora_log date,
constraint pk_log_tarefa primary key(id_log)
);

select * from log_tarefa;
select * from tarefa;