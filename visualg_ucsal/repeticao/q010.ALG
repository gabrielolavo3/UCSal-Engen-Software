Algoritmo "consumidor"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Arthur Henrique Kronbauer 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Gabriel S. Olavo
// Data atual  : 16/03/2026
Var
// Seção de Declarações das variáveis 
   idade : inteiro
   qtdHomem : inteiro
   qtdMulher : inteiro
   qtdEntrevistados : inteiro
   qtdServicos : inteiro
   sexo : caractere
   codigo : caractere
   maiorGenero : caractere
   percentualServico : real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   codigo <- "0"
   qtdEntrevistados <- 0
   qtdMulher <- 0
   qtdHomem <- 0
   
   enquanto codigo <> "5" faca
     escreval("Objetivos de Ida ao Shopping")
     escreval("1 - Compras")
     escreval("2 - Serviços(banco, correio, etc)")
     escreval("3 - Lazer(cinema, jogos, etc)")
     escreval("4 - Alimentação(restaurante e lanchonetes)")
     escreval("5 - Encerrar programa")
     escreval("")
     escreva("Selecione um dos códigos de objetivo acima: ")
     leia(codigo)
     
     se codigo = "5" entao
        interrompa // Equivalente ao break, para o pragrama no momento que executa
     fimse
     
     escreva("Informe a idade do/a entrevistado/a: ")
     leia(idade)
     escreva("Informe o sexo do/a entrevistado/a |(m)asculino ou (f)eminino: ")
     leia(sexo)
     escreval("")
     
     qtdEntrevistados <- qtdEntrevistados + 1 // Soma quantas pessoas foram entrevistadas
     
     se (codigo = 2) entao
        qtdServicos <- qtdServicos + 1
     fimse
     
     se sexo = "f" entao
        qtdMulher <- qtdMulher + 1
     senao
        qtdHomem <- qtdHomem + 1
     fimse
   fimenquanto
   
   percentualServico <- (qtdServicos / qtdEntrevistados) * 100

   se qtdMulher > qtdHomem entao
     maiorGenero <- "Gênero que mais frequenta o shopping: mulher"
   senao
     maiorGenero <- "Gênero que mais frequenta o shopping: homem"
   fimse
   
   escreval("Percentual de indivíduos que buscam Serviços: ",percentualServico,"%")
   escreval(maiorGenero)

Fimalgoritmo