Algoritmo "ascendente"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Arthur Henrique Kronbauer 
// Descrição   : Ler 2 números e imprimir em ordem crescente
// Autor(a)    : Gabriel S. Olavo
// Data atual  : 27/02/2026
Var
// Seção de Declarações das variáveis 

primeiroNumero : real
segundoNumero : real
maior : real
menor : real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

escreva("Insira o número A: ")
leia(primeiroNumero)
escreva("Insira o número B: ")
leia(segundoNumero)

se (primeiroNumero > segundoNumero) entao
   maior <- primeiroNumero
   menor <- segundoNumero
senao
   menor <- primeiroNumero
   maior <- segundoNumero
fimse

escreval("")
escreval("Número A: ",maior)
escreval("Número B: ",menor)

Fimalgoritmo