//aula 4 - slide 66
//package br.com.jpescola.util

//class Calculadora{
//
//    fun soma(v1:Int, v2:Int) = v1 + v2
//    fun subtracao(v1:Int, v2:Int) = v1 - v2
//    fun multilicacao(v1:Int, v2:Int) = v1 * v2
//   // fun divisao(v1:Int, v2:Int) = v1 / v2
//    fun divisao(v1:Int, v2:Int) = v1 / v2.toFloat()
//    fun divisao(v1:Float, v2:Float) = v1 / v2
//
//}
// fim slide 66

// Define um pacote chamado 'br.com.jpescola.util'
package br.com.jpescola.util

// Define a classe Calculadora1 no pacote 'br.com.jpescola.util'
class Calculadora1 {

    // Função que realiza a soma de dois valores inteiros
    fun soma(v1: Int, v2: Int) = v1 + v2

    // Função que realiza a subtração de dois valores inteiros
    fun subtracao(v1: Int, v2: Int) = v1 - v2

    // Função que realiza a multiplicação de dois valores inteiros
    fun multiplicacao(v1: Int, v2: Int) = v1 * v2

    // Função que realiza a divisão de um valor float por um valor inteiro
    fun divisao(v1: Float, v2: Int) = v1 / v2.toFloat()

    // Função que realiza a multiplicação de dois valores float
    fun multiplicacao(v1: Float, v2: Float) = v1 * v2
}
