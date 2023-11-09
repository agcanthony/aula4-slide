//aula 4 - slide 46
//fun main() {
//    mensagem()
//}
//fun mensagem() {
//    println("Feliz natal!")
//}
//
//fun main() {
//    mensagem(1)
//    mensagem(2)
//    mensagem(3)
//}
//fun mensagem(n: Int) {
//    if (n == 1)
//        println("Feliz natal!")
//    else
//        println("Feliz aniversário!")
//}
//fim slide 46

// Função principal (main) sem argumentos
fun main() {
    // Chama a função texto() que não aceita argumentos
    texto()
}

// Função texto() sem argumentos
fun texto() {
    // Imprime a mensagem "Feliz ano novo!"
    println("Feliz ano novo!")
}

// Outra função principal (main) com argumento
fun main() {
    // Chama a função texto(x) com diferentes valores de x
    texto(1)
    texto(2)
    texto(3)
}

// Função texto() com um argumento x do tipo Int
fun texto(x: Int) {
    // Verifica o valor de x e imprime mensagens diferentes
    if (x == 1)
        println("Feliz ano Novo!")
    else
        println("Feliz aniversário!")
}
