Algoritmo "nadador"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Arthur Henrique Kronbauer
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Gabriel S. Olavo
// Data atual  : 15/03/2026
Var
// Seção de Declarações das variáveis 
   idade : inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   escreva("Insira a idade do nadador: ")
   leia(idade)
   
   se ((idade >= 8) e (idade <= 10)) entao
      escreval("Você pertence à Classe Infantil")
   senao
        se ((idade >= 11) e (idade <= 13)) entao
           escreval("Você pertence à Classe Juvenil A")
        senao
             se ((idade >= 14) e (idade <= 17)) entao
                escreval("Você pertence à Classe Juvenil B")
             senao
                  se ((idade >= 18)) entao
                     escreval("Você pertence à Classe Adulta")
                  senao
                       escreval("Você não participa de nenhuma Classe")
                  fimse
             fimse
        fimse
   fimse


Fimalgoritmo