//aula 4 - slide 67
//fun main (){
//    val a = "1"
//    println(a+1)
//    println(a.toInt()+1)
//    println(a.toFloat()+1)
//    println((a.toDouble()+1).toString())
//    println((a.toDouble()+1).toString()+1)
//
//}
//fim slide 67

// Função principal (main)
fun main (){
    // Declara uma variável 'x' do tipo String com o valor "10"
    val x = "10"

    // Concatenação de String com Int (resultando em "101")
    println(x + 1)

    // Conversão de String para Int e soma (resultando em 11)
    println(x.toInt() + 1)

    // Conversão de String para Float e soma (resultando em 11.0)
    println(x.toFloat() + 1)

    // Conversão de String para Double, soma e converte para String (resultando em "11.0")
    println((x.toDouble() + 1).toString())

    // Conversão de String para Double, soma, converte para String e concatenação com Int (resultando em "11.01")
    println((x.toDouble() + 1).toString() + 1)
}