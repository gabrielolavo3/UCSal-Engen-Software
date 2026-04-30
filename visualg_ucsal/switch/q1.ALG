Algoritmo "clientes"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Arthur Henrique Kronbauer 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Gabriel S. Olavo
// Data atual  : 28/02/2026
Var
// Seção de Declarações das variáveis 

valorCompra : real
valorFinal : real
desconto : inteiro
codigoComprador : caractere

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("1 - Funcionário")
escreval("2 - Cliente vip")
escreval("3 - Cliente comum")
escreval("")
escreva("Informe o tipo de cliente: ")
leia(codigoComprador)
escreva("Informe o valor da compra: ")
leia(valorCompra)

escolha codigoComprador
   caso "1"
      desconto <- 10
      valorFinal <- valorCompra -((valorCompra * desconto) / 100)
   caso "2"
      desconto <- 5
      valorFinal <- valorCompra -((valorCompra * desconto) / 100)
   caso "3"
      valorFinal <- valorCompra
   outrocaso
     escreval("Valores inválidos!")
fimescolha

limpatela
se (codigoComprador = "1") ou (codigoComprador = "2") entao
   escreval("Valor da compra:", valorCompra)
   escreval("Valor da final:", valorFinal)
   escreval("Desconto aplicado:", desconto,"%")
fimse

fimalgoritmo