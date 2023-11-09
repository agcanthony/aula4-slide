//aula 4 - slide 33
//fun main() {
//    val myText = "Hello"
//    val newText1 = myText + " " + myText
//    val newText2 = "$myText $myText"
//
//    println(myText)
//    println(newText2)
//    println(newText2)
//}
//fim slide 33

fun main() {
    val myText = "Anthony" // Define uma variável chamada myText e atribui o valor "Anthony" a ela
    val myText1 = "George" // Define uma variável chamada myText1 e atribui o valor "George" a ela
    val newText2 = myText + " " + myText1 // Cria uma nova variável newText2 que contém a concatenação das strings myText e myText1 com um espaço entre elas
    val newText3 = "$myText $myText1" // Cria uma nova variável newText3 que usa uma interpolação de strings para unir myText e myText1 com um espaço entre elas

    println(myText) // Imprime o conteúdo da variável myText, que é "Anthony"
    println(newText2) // Imprime o conteúdo da variável newText2, que deve ser "Anthony George"
    println(newText3) // Imprime o conteúdo da variável newText3, que também deve ser "Anthony George"
}
