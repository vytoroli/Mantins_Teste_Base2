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

Pre-requisitos: ter o IndelliJ IDEA. ou um IDE que contenha extensões Java.
 - Baixe o projeto e abra no IndelliJ IDEA
 - Navegue até src/test/java/Testes/*
 - Selecione um dos arquivos: Testes_login, Testes_Tarefas
 - Para rodar, basta dar Run na classe ou nos metodos especificos. 


Segue alguns prints: https://docs.google.com/document/d/1VBMZJQkpRY9Rief0sfIwuC1RgOSIbb2XWxBugmp2v-g/edit?usp=sharing

O codigo esta no modo Headless, porem no codigo tem instruções para ativar o navegador de forma visivel.

Rodar no GitbubActions:

O codigo foi implementado para rodar via CI, porem existem algumas falhas para rodar completamente. 
3 das 7 rodam corretamente, porem a mensagem retorna como falha.
Devido ao tempo e outras atividades, não foi possivel identificar o problema.


Considerações sobre a ferramenta Mantis:

Encontrei os seguintes problemas:
Pagina: Criar tarefas
Após criar tarefa, a pagina é redirecionada automaticamente sem deixar selecionar as opções.

Pagina: Ver Tarefas
Botão Buscar da pagina de tarefas não especifica o dado buscado

Botão 'Exportação para Excel' exportando xml
Botão ‘Imprimir Tarefas’. Após clicar, não tem botão para retornar