Algoritmo "livros"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Arthur Henrique Kronbauer 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 21/03/2026
Var
// Seção de Declarações das variáveis 
   tipoLivro : caractere
   sexo : caractere
   maiorTipo : caractere
   livroFiccao : inteiro
   livroRomance : inteiro
   livroAventura : inteiro
   romanceMasculino : inteiro
   percentualHomens : real
   qtdHomens : inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   tipoLivro <- "1"
   livroFiccao <- 0
   livroRomance <- 0
   livroAventura <- 0
   romanceMasculino <- 0
   qtdHomens <- 0
   
   repita
     escreval("Categoria Literária")
     escreval("1 - Ficção")
     escreval("2 - Romance")
     escreval("3 - Aventura")
     escreval("0 - Encerrar programa")
     escreva("Selecione uma categoria de livro: ")
     leia(tipoLivro)
     
     se tipoLivro <> "0" entao
        escreval("")
        escreva("Informe o sexo do comprador |(m)asculino ou (f)eminino:")
        leia(sexo)
        // contador para os generos de livros
        se (tipoLivro = "1") entao
           livroFIccao <- livroFIccao + 1
        senao
          se (tipoLivro = "2") entao
             livroRomance <- livroRomance + 1
          senao
             livroAventura <- livroAventura + 1
          fimse
        fimse
        
        se (sexo = "m") entao
           qtdHomens <- qtdHomens + 1
        fimse

        // contador para homens que gostam de romance
        se ((sexo = "m") e (tipoLivro = "2")) entao
           romanceMasculino <- romanceMasculino + 1
        fimse

    fimse
   ate (tipoLivro = "0")
   
   percentualHomens <- (romanceMasculino * 100) / qtdHomens
   
   se ((livroFiccao > livroRomance) e (livroFiccao > livroAventura)) entao
      maiorTipo <- "Ficção"
      senao
        se ((livroRomance > livroFiccao) e (livroRomance > livroAventura)) entao
           maiorTipo <- "Romance"
        senao
           maiorTipo <- "Aventura"
        fimse
   fimse
   
   escreval("Tipo de livro mais vendido: ",maiorTipo)
   escreval("Percentual de homens que leem livros de romance:",percentualHomens,"%")

Fimalgoritmo