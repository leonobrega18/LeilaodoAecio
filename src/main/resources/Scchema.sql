CREATE TABLE USUARIO(
    usuarioID integer primary key auto_increment,
    login varchar(50),
    password varchar(50),
    nome varchar(100),
    cpf varchar(20),
    endereco varchar(100)
);