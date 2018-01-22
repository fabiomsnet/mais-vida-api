# Mais Vida API


Para a excecução de nossa API, é necessário que você tenha o MySQL, visto isso, execute o script SQL abaixo, pois o mesmo criará o banco de dados, tabela e usuários da nossa API:

<p>create database maisvida;</p>
<p>use maisvida;</p>
<p>create table account (id varchar(255), password varchar(255), username varchar(255));</p>
<p>insert into account(id, username, password) values (1, "admin", "admin");</p>
