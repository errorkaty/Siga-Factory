# SIGA — Atividade Factory: painéis por perfil (Anotações de desenvolvimento)

**Técnicas de Programação II (TP2) · Aula 5** — CST em Desenvolvimento de Software Multiplataforma · Fatec de Porto Ferreira

## 1. Identificar o acoplamento causado pelo `if/else` com `new` em `GerenciadorLogin`:
A classe "GerenciadorLogin" utiliza bloco "if/else" para escolher o painel que vai acessar e instancia diretamente as classes "PainelAluno", "PainelProfessor" e "PainelCoordenador". Isso gera acoplamento porque ela conhece as implementações concretas de cada uma. Também viola OCP porque para adicionar um novo, seria necessário modificar a estrutura de "MontarPainel()" e acrescentar uma nova condição.

## 2. Simple Factory:
Antes, a classe "GerenciadorLogin" fazia todo o trabalho; ela verificava o tipo de usuário, escolhia a classe correspondente, criava o painel concreto e montava o painel. 
Agora com o uso do Simple Factory, dividimos as responsabilidades em duas classes: "FabricaPainel" agora verifica o tipo, escolhe a classe e cria o painel concreto. Enquanto "GerenciadorLogin" fica responsável por pedir o painel à fábrica e montar o painel recebido.
Dessa forma, a criação fica centralizada na fábrica e o "GerenciadorLogin" para de depender diretamente das classes concretas de painel.

## 3. Factory Method:

## 4. Adicionar um novo perfil:

## 5. Desenhar o diagrama de classes da solução final: