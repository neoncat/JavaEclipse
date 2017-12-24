CREATE DATABASE java_exemplo
DEFAULT CHARACTER SET utf8 
DEFAULT COLLATE utf8_general_ci;

use java_exemplo;

create table usuario(
id int auto_increment primary key,
nome varchar(35) not null,
email varchar(50) not null,
senha varchar(32) not null,
conectado char(1) default '0'
)
ENGINE = InnoDB DEFAULT CHARSET = utf8;

INSERT INTO usuario (nome, email, senha) VALUES
('Jane Doe', 'jane@email.com', md5('123abc')),
('John Doe', 'john@email.com', md5('qwert123')),
('Admin', 'admin@email.com', md5('admin2017'));