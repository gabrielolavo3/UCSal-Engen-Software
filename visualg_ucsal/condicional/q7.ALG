Algoritmo "km/h e m/s"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Arthur Henrique Kronbauer
// Descrição   : Converter de kilometro por hora para metro por segundoS
// Autor(a)    : Gabriel S. Olavo
// Data atual  : 27/02/2026
Var
// Seção de Declarações das variáveis

kmPorHora : real
metroPorSegundo : real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...

escreva("Digite um número em Km/h: ")
leia(kmPorHora)

metroPorSegundo <- kmPorHora / 3.6

limpatela
escreval("O valor",kmPorHora,"Km/h equivale à ",metroPorSegundo :2:2,"m/s")

Fimalgoritmo