Algoritmo "fitas_loja2"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Arthur Henrique Kronbauer
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Gabriel S. Olavo
// Data atual  : 25/02/2026
Var
// Seção de Declarações das variáveis

acervoTotal : inteiro
fitasPituba : real
fitasItapua : real
fitasClientesPituba : real
fitasClientesItapua : real
fitasCompradasClientes: real
acervoPorLoja : real
percentualFitas : real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...

escreva("Informe a quantidade total do acervo: ")
leia(acervoTotal)
escreva("Informe a quantidade de fitas disponíveis na loja da Pituba: ")
leia(fitasPituba)
escreva("Informe a quantidade de fitas disponíveis na loja de Itapuã: ")
leia(fitasItapua)

se (fitasPituba >= acervoTotal) ou (fitasItapua >= acervoTotal) entao
   escreval("Entrada inválida de valores. Execute o programa novamente!")
senao
   acervoPorLoja <- acervoTotal / 2
   fitasClientesPituba <- acervoPorLoja - fitasPituba
   fitasClientesItapua <- acervoPorLoja - fitasItapua
   fitasCompradasClientes <- fitasClientesPituba + fitasClientesItapua
   percentualFitas <- (fitasCompradasClientes / acervoTotal) * 100
   
   limpatela
   escreval("Quantidade de fitas compradas na loja da Pituba: ",fitasClientesPituba)
   escreval("Quantidade de fitas compradas na loja de Itapuã: ",fitasClientesItapua)
   escreval("Total de fitas vendidas: ",fitasCompradasClientes)
   escreval("Percentual de fitas com clientes: ",percentualFitas)
fimse

Fimalgoritmo