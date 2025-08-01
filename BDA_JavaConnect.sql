CREATE DATABASE IF NOT EXISTS cadastro_pessoas;
USE cadastro_pessoas;

CREATE TABLE pessoas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    sobrenome VARCHAR(255),
    data_nascimento DATE,
    ativo BOOLEAN,
    cpf CHAR(11) NOT NULL UNIQUE,
    peso DECIMAL(5,2),
    altura DECIMAL(4,2)
);
select * from pessoas;