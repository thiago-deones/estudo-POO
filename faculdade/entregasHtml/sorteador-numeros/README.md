# sorteador-numeros

Este projeto é um site que permite ao usuário sortear números aleatórios dentro de um intervalo definido. O usuário pode escolher a quantidade de números a serem sorteados e especificar o intervalo numérico desejado.

Funcionalidades
* Quantidade de Números: O usuário pode definir quantos números deseja sortear.
* Intervalo Numérico: O usuário especifica o intervalo de números (de X até Y) dentro do qual os números serão sorteados.
* Resultado: O site exibe os números sorteados ao usuário.
  
Como Usar
* Defina a Quantidade: No campo indicado, insira a quantidade de números que deseja sortear.
* Defina o Intervalo: Nos campos "De" e "Até", insira os valores mínimo e máximo do intervalo desejado.
* Clique em Sortear: O site gerará e exibirá a quantidade de números solicitada, dentro do intervalo especificado.

Tecnologias Utilizadas
* HTML5: Estruturação da página.
* CSS3: Estilização e layout.
* JavaScript: Lógica para geração dos números aleatórios e manipulação do DOM.

Como Funciona
O programa utiliza JavaScript para capturar os valores inseridos pelo usuário, gerar números aleatórios dentro do intervalo especificado e exibi-los na página. A função Math.random() é usada para gerar os números aleatórios, enquanto a função Math.floor() garante que os números sorteados sejam inteiros.

Exemplo de Uso
Exemplo 1: Se o usuário definir a quantidade como 5 e o intervalo de 1 até 100, o site sorteará 5 números aleatórios entre 1 e 100.
Exemplo 2: Se o usuário definir a quantidade como 3 e o intervalo de 10 até 50, o site sorteará 3 números aleatórios entre 10 e 50.
