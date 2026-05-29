# carrinho-compra
Este projeto foi desenvolvido para praticar e demonstrar o uso de funções JavaScript para manipulação de strings, elementos do DOM, e atualização dinâmica de conteúdo em uma página web. O projeto simula a funcionalidade básica de um carrinho de compras, onde o usuário pode adicionar produtos, ver o total acumulado, e limpar o carrinho.

Funcionalidades
* Adicionar Produtos ao Carrinho: O usuário pode adicionar produtos ao carrinho, informando o nome, valor unitário e a quantidade desejada.
* Atualização Dinâmica: O total do carrinho é atualizado automaticamente à medida que novos produtos são adicionados.
* Limpar Carrinho: O usuário pode limpar o carrinho, removendo todos os produtos e resetando o valor total.

Conceitos Aplicados
Neste projeto, os seguintes conceitos e técnicas foram aplicados:

* Função split() no JavaScript: Utilizada para separar trechos de uma string com base em um delimitador específico. No caso deste projeto, foi utilizada para separar o nome do produto e o valor unitário de uma string.

* Recuperação de Valores de Formulário: Os valores digitados em campos de formulário foram recuperados utilizando a propriedade value do JavaScript.

* Modificação do HTML Dinâmico: O código HTML de um elemento na página foi modificado dinamicamente utilizando a propriedade innerHTML para atualizar o conteúdo do carrinho de compras.

* Template String: Utilizado para concatenar valores de variáveis dentro de strings de forma mais legível e prática.

Código de Funcionamento
O código principal do projeto envolve duas funções:

adicionar(): Responsável por adicionar o produto ao carrinho, calcular o preço total baseado na quantidade e valor unitário, e atualizar o conteúdo do carrinho na página.
limpar(): Reseta o carrinho, removendo todos os produtos e reiniciando o valor total para zero.

Exemplo de Uso
1 * Adicionar Produtos: O usuário seleciona ou insere o nome do produto e a quantidade, e então clica no botão "Adicionar" para incluir o item no carrinho.
2 * Ver Total: O valor total do carrinho é atualizado automaticamente e exibido na página.
3 * Limpar Carrinho: O usuário pode clicar no botão "Limpar" para remover todos os produtos e resetar o valor total.

Tecnologias Utilizadas
* HTML5: Para a estruturação da página e criação do formulário de entrada.
* CSS3: Para estilização básica dos elementos da página.
* JavaScript: Para lógica de manipulação de strings, atualização dinâmica do DOM, e gerenciamento do estado do carrinho de compras.
