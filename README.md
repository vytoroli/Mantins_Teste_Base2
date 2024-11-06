Olá!
Esse é o projeto teste da Base2.
Ferramenta exemplo de teste do desafio: https://mantis-prova.base2.com.br/
Framework: Selenium Webriver
Linguagem: Java
Pasta dos casos de teste: src/test/java/Testes
Pasta dos PageObjects: src/test/java/PageObjects

Para o desafio foi desenvido os seguintes casos de teste:
 - Login com sucesso
 - Login sem sucesso
 - Criar tarefa
 - Ver Tarefa
 - Buscar tarefa-valida
 - Buscar tarefa-invalida
 - Buscar tarefa-por-nome

O codigo foi desenvolvido usando o IndelliJ IDEA.
Para rodar os testes localmente:
Pre-requisito: ter o IndelliJ IDEA. ou um IDE que contenha extensões Java.
 - Baixe o projeto e abra no IndelliJ IDEA
 - Navegue até src/test/java/Testes/*
 - Selecione um dos arquivos: Testes_login, Testes_Tarefas
 - Para rodar, basta dar Run na classe ou nos metodos especificos. 

Rodar no GitbubActions:
O codigo foi implementado para rodar via CI, porem existem algumas falhas para rodar completamente. 
3 das 7 rodam corretamente, porem a mensagem retorna como falha.
Devido ao tempo e outras atividades, não foi possivel identificar o problema.