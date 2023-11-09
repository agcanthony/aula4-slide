//class Calculadora{
//
//    fun soma(v1:Int, v2:Int) = v1 + v2
//    fun subtracao(v1:Int, v2:Int) = v1 - v2
//    fun multilicacao(v1:Int, v2:Int) = v1 * v2
//    fun divisao(v1:Int, v2:Int) = v1 / v2
//
//}

// mostra a criação de uma classe e a reutilização dela em outra parte do sistema

// Define a classe CalculadoraFull
class CalculadoraFull {

    // Função que realiza a soma e subtração de dois valores inteiros
    fun somaSubtracao(v1: Int, v2: Int) = v1 + v2 - v2

    // Função que realiza a subtração e multiplicação de dois valores inteiros
    fun subtracaoMultiplicacao(v1: Int, v2: Int) = v1 - v2 * v1

    // Função que realiza a multiplicação de dois valores inteiros
    fun multiplicacao(v1: Int, v2: Int) = v1 * v2

    // Função que realiza a divisão de dois valores inteiros
    fun divisao(v1: Int, v2: Int) = v1 / v2
}
