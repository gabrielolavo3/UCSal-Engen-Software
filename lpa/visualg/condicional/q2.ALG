Algoritmo "gasolina"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Arthur Henrique Kronbauer
// Descrição   : Ler o valor da gasolina de 3 postos de combustível e obtém a média! (função)
// Autor(a)    : Gabriel S. Olavo
// Data atual  : 22/02/2026

Var
// Seção de Declarações das variáveis

postoUm : real
postoDois : real
postoTres : real
media : real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...

escreval("Preço de Gasolina")
escreval("")

escreva("Insira o preço do 1º posto de combustível: ")
leia(postoUm)
escreva("Insira o preço do 2º posto de combustível: ")
leia(postoDois)
escreva("Insira o preço do 3º posto de combustível: ")
leia(postoTres)

media <- (postoUm + postoDois + postoTres) / 3

limpatela

escreval("Preço do posto 1: R$", postoUm)
escreval("Preço do posto 2: R4", postoDois)
escreval("Preço do posto 3: R$", postoTres)
escreval("A média de preços: R$", media)


Fimalgoritmo