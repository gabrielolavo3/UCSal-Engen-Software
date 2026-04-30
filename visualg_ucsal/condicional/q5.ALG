Algoritmo "propriedade_numerica"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Arthur Henrique Kronbauer
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Gabriel S. Olavo
// Data atual  : 25/02/2026
Var
// Seção de Declarações das variáveis
numero : inteiro
parteUmNumero : inteiro
parteDoisNumero : inteiro
soma : inteiro
comparacao : inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...

escreva("Informe um número com 4 dígitos: ")
leia(numero)

parteUmNumero <- numero div 100
parteDoisNumero <- numero mod 100
soma <- parteUmNumero + parteDoisNumero
comparacao <- soma * soma

se (comparacao = numero) entao
   escreval("O número possui a propriedade")
senao
   escreval("O número não possui a propriedade")
fimse

Fimalgoritmo