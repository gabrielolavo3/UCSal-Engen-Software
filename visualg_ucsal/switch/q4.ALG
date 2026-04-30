Algoritmo "operacoes"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Gabriel S. Olavo
// Data atual  : 05/03/2026
Var
// Seção de Declarações das variáveis 
numeroA : real
numeroB : real
operacao : caractere
resultado : real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva("Informe o número A: ")
leia(numeroA)
escreva("Informe o número B: ")
leia(numeroB)
escreval("")

escreval("+ - Soma")
escreval("- - Subtração")
escreval("* - Multiplicação")
escreval("/ - Divisão")
escreval("")
escreva("Selecione o símbolo da operação: ")
leia(operacao)

se (operacao = "+") ou (operacao = "-") ou (operacao = "*") ou (operacao = "/") entao
   escolha operacao
      caso "+"
      resultado <- numeroA + numeroB
      caso "-"
      resultado <- numeroA - numeroB
      caso "*"
      resultado <- numeroA * numeroB
      caso "/"
      resultado <- numeroA / numeroB
   fimescolha

   limpatela
   escreval("Primeiro número:", numeroA)
   escreval("Segundo número:", numeroB)
   escreval("Resultado:", resultado)
senao
escreval("Operação incorreta")
fimse

Fimalgoritmo