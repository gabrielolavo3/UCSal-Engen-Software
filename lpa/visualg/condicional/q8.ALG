Algoritmo "pesoideal"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Arthur Henrique Kronbauer 
// Descrição   : Cálcular o peso ideal, de acordo com o peso
// Autor(a)    : Gabriel S. Olavo
// Data atual  : 27/02/2026
Var
// Seção de Declarações das variáveis 

sexo : caractere
altura : real
pesoIdeal : real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

escreva("Informe a sua altura: ")
leia(altura)
escreva("Informe o seu sexo: ")
leia(sexo)

se sexo = "masculino" entao
   pesoIdeal <- (72.7 * altura) - 44.7
senao
   pesoIdeal <- (62.1 * altura) - 44.7
fimse

limpatela

escreval("Resumo")
escreval("Sexo: ",sexo)
escreval("Altura: ",altura)
escreval("Peso ideal: ",pesoIdeal :2:2)

Fimalgoritmo