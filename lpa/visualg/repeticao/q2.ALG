Algoritmo "intervalo"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Arthur Henrique Kronbauer 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Gabriel S. Olavo
// Data atual  : 15/03/2026
Var
// Seção de Declarações das variáveis 
   qtdImpar : inteiro
   intervaloA : inteiro
   intervaloB : inteiro
   contador : inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   qtdImpar <- 0
   
   escreva("Informe o início do intervalo: ")
   leia(intervaloA)
   escreva("Informe o final do intervalo: ")
   leia(intervaloB)
   
   para contador de intervaloA ate intervaloB faca
     se (contador % 2 <> 0) entao
        qtdImpar <- qtdImpar + 1
     fimse
   fimpara
   
   escreval("Ímpares: ",qtdImpar)

Fimalgoritmo