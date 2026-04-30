Algoritmo "maior"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Arthur Henrique Kronbauer 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : gabriel S. Olavo
// Data atual  : 15/03/2026
Var
// Seção de Declarações das variáveis 
   valorA : inteiro
   valorB : inteiro
   valorC : inteiro
   maior : inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   escreva("Informe o valor A: ")
   leia(valorA)
   escreva("Informe o valor B: ")
   leia(valorB)
   escreva("Informe o valor C: ")
   leia(valorC)
   
   se ((valorA > valorB) e (valorA > valorC)) entao
      maior <- valorA
      senao
           se ((valorB > valorA) e (valorB > valorC)) entao
              maior <- valorB
           senao
                maior <- valorC
           fimse
   fimse
   
   escreval("Maior número:",maior)

Fimalgoritmo