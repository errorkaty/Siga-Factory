# SIGA — Atividade Factory: painéis por perfil (Anotações de desenvolvimento)

**Técnicas de Programação II (TP2) · Aula 5** — CST em Desenvolvimento de Software Multiplataforma · Fatec de Porto Ferreira

# 1. Identificar o acoplamento causado pelo `if/else` com `new` em `GerenciadorLogin`:
A classe "GerenciadorLogin" utiliza bloco "if/else" para escolher o painel que vai acessar e instancia diretamente as classes "PainelAluno", "PainelProfessor" e "PainelCoordenador". Isso gera acoplamento porque ela conhece as implementações concretas de cada uma. Também viola OCP porque para adicionar um novo, seria necessário modificar a estrutura de "MontarPainel()" e acrescentar uma nova condição.
