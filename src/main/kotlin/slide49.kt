//aula 4 - slide 49
//fun main() {
//    val p1 = Pessoa("Maria", 60f, 1.70f)
//    val p2 = Pessoa("Joaquim", 70f, 1.75f)
//    val p3 = Pessoa("Marcos", 80f, 1.80f)
//    println(p1.nome)
//    println(p2.nome)
//    println(p3.nome)
//}
//class Pessoa(var nome: String, var peso: Float, var altura: Float){
//    fun imc() = peso / (altura * altura)
//}
//fim slide 49


fun main() {
    // Cria três instâncias da classe Pessoa com parâmetros personalizados
    val p1 = Pessoa("Mateus", 75f, 1.80f)
    val p2 = Pessoa("Marcos", 70f, 1.78f)
    val p3 = Pessoa("Lucas", 80f, 1.85f)

    // Imprime o nome de cada instância
    println(p1.nome)
    println(p2.nome)
    println(p3.nome)
}

// Define a classe Pessoa com um construtor que aceita parâmetros para nome, peso e altura
class Pessoa(var nome: String, var peso: Float, var altura: Float) {
    // Define uma função membro (método) chamada 'imc', que calcula e retorna o Índice de Massa Corporal (IMC)
    fun imc() = peso / (altura * altura)
}

