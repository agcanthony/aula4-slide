//aula 4 - slide 48
//fun main() {
//    val p1 = Pessoa()
//    val p2 = Pessoa()
//    val p3 = Pessoa()
//
//    println(p1.nome)
//    println(p2.nome)
//    println(p3.nome)
//}
//
//class Pessoa {
//    var nome = "Vazio"
//    var peso = 0f
//    var altura = 0f
//}
//
//fun main() {
//    val p1 = Pessoa()
//    val p2 = Pessoa()
//    val p3 = Pessoa()
//    p1.nome = "Maria"
//    println(p1.nome)
//    println(p2.nome)
//    println(p3.nome)
//}
//
//class Pessoa {
//    var nome = "Vazio"
//    var peso = 0f
//    var altura = 0f
//}
//
//fun main() {
//    val p1 = Pessoa("Maria", 60f, 1.70f)
//    val p2 = Pessoa("Joaquim", 70f, 1.75f)
//    val p3 = Pessoa("Marcos", 80f, 1.80f)
//    println(p1.nome)
//    println(p2.nome)
//    println(p3.nome)
//}
//class Pessoa(var nome: String, var peso: Float, var altura: Float)
//fim slide 48

fun main() {
    // Cria três instâncias da classe Pessoa
    val p1 = Pessoa()
    val p2 = Pessoa()
    val p3 = Pessoa()

    // Imprime o nome de cada instância (que é "Nome" por padrão)
    println(p1.nome)
    println(p2.nome)
    println(p3.nome)
}

// Define a classe Pessoa com propriedades nome, peso e altura
class Pessoa {
    var nome = "Nome"
    var peso = 0f
    var altura = 0f
}


fun main() {
    // Cria três instâncias da classe Pessoa
    val p1 = Pessoa()
    val p2 = Pessoa()
    val p3 = Pessoa()

    // Modifica o nome da instância p1 para "José"
    p1.nome = "José"

    // Imprime o nome de cada instância
    println(p1.nome)
    println(p2.nome)
    println(p3.nome)
}

// Define a classe Pessoa com as mesmas propriedades nome, peso e altura
class Pessoa {
    var nome = "Nome"
    var peso = 0f
    var altura = 0f
}

fun main() {
    // Cria três instâncias da classe Pessoa com parâmetros personalizados
    val p1 = Pessoa("Mateus", 70f, 1.80f)
    val p2 = Pessoa("Marcos", 80f, 1.85f)
    val p3 = Pessoa("Lucas", 85f, 1.89f)

    // Imprime o nome de cada instância
    println(p1.nome)
    println(p2.nome)
    println(p3.nome)
}

// Define a classe Pessoa com um construtor que aceita parâmetros para nome, peso e altura
class Pessoa(var nome: String, var peso: Float, var altura: Float)
