# SIGA — Atividade Factory: painéis por perfil (Anotações de desenvolvimento)

**Técnicas de Programação II (TP2) · Aula 5** — CST em Desenvolvimento de Software Multiplataforma · Fatec de Porto Ferreira

## 1. Identificar o acoplamento causado pelo `if/else` com `new` em `GerenciadorLogin`:
A classe "GerenciadorLogin" utiliza bloco "if/else" para escolher o painel que vai acessar e instancia diretamente as classes "PainelAluno", "PainelProfessor" e "PainelCoordenador". Isso gera acoplamento porque ela conhece as implementações concretas de cada uma. Também viola OCP porque para adicionar um novo, seria necessário modificar a estrutura de "MontarPainel()" e acrescentar uma nova condição.

## 2. Simple Factory:
Antes, a classe "GerenciadorLogin" fazia todo o trabalho; ela verificava o tipo de usuário, escolhia a classe correspondente, criava o painel concreto e montava o painel. 
Agora com o uso do Simple Factory, dividimos as responsabilidades em duas classes: "FabricaPainel" agora verifica o tipo, escolhe a classe e cria o painel concreto. Enquanto "GerenciadorLogin" fica responsável por pedir o painel à fábrica e montar o painel recebido.
Dessa forma, a criação fica centralizada na fábrica e o "GerenciadorLogin" para de depender diretamente das classes concretas de painel.

## 3. Factory Method:
Na Simple Factory a criação de painéis estava centralizada na "FabricaPainel", agora com a Factory Method aplicada, foi criada a classe abstrata "CriadorPainel" que delcara o método "criarPainel()", assim, as subclasses (que herdam dela) "CriadorPainelAluno", "CriadorPainelProfessor" e "CriadorPainelCoordenador" sobrescrevem o método e cada uma fica responsável pela criação de seu painel.
A classe "GerenciadorLogin" agora recebe um objeto do tipo "CriadorPainel" e utiliza "criarPainel()" sem conhecer a classe concreta. A escolha do painel passa a ser por polimorfismo.

## 4. Adicionar um novo perfil:
Agora com o Factory Method implementado foi possível adiconar o novo perfil de Secretaria por meio de duas classes novas: "CriadorPainelSecretaria" que herda de "CriadorPainel" e "PainelSecretaria" que implementa "Painel". Sem modificar nada já existente, apenas o "Main" para que ele mostra-se o novo painel.

## 5. Desenhar o diagrama de classes da solução final:
Conforme as instruções do professor pedem, o diagrama nomeado de "Diagrama-classes" está na pasta "docs"