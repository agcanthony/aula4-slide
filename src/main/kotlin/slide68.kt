//aula 4 - slide 68
//fun main (){
//
//    var a: Any = '1'
//    var resultado = when (a){
//
//        is String -> "$a é um texto"
//        is Int -> "$a é um número inteiro"
//        else -> "Não sei"
//    }
//
//    println(resultado)
//    println(a::class.simpleName) // mostra o tipo da váriavel
//
//}
//fim slide 68

// Função principal (main)
fun main (){

    // Declara uma variável 'x' do tipo Any com o valor 6
    var x: Any = 6

    // Utiliza a expressão 'when' para verificar o tipo de 'x' e atribuir uma mensagem com base no tipo
    var resultado = when (x){
        // Se 'x' for do tipo Char, gera a mensagem indicando que é um char
        is Char -> "$x é um char"
        // Se 'x' for do tipo Int, gera a mensagem indicando que é um número inteiro
        is Int -> "$x é um número inteiro"
        // Caso contrário, gera a mensagem padrão "Não sei"
        else -> "Não sei"
    }

    // Imprime o resultado da expressão 'when'
    println(resultado)

    // Imprime o nome simples do tipo da variável 'x' usando reflection
    println(x::class.simpleName)
}