Algoritmo "menor"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Arthur Henrique Kronbauer
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Gabriel S. Olavo
// Data atual  : 15/03/2026
Var
// Seção de Declarações das variáveis
   valor : inteiro
   menor : inteiro
   contador : inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
   menor <- 1000000 // É preciso definir um número grande para fazer a comparação entre valores
   valor <- -1 // Força o início do laço

   enquanto valor <> 0 faca
      contador <- contador + 1
      escreva("Digite o número",contador," (use 0 para encerrar): ")
      leia(valor)
      
      se ((valor < menor) e (valor > 0)) entao
         menor <- valor
      fimse
   fimenquanto

   escreval("O menor número é",menor)

Fimalgoritmo