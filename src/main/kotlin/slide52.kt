//aula 4 - slide 52
//fun main(){
//
//    val p1 = Pessoa("maria",60f,1.70f)
//    val p2 = Colaborador(2000f,"joaquim",60f,1.75f)
//    val p3 = Cliente(1500f,"marcos",60f,1.80f)
//
//    println("${p1.nome} tem IMC = ${p1.imc}")
//    println("${p2.nome} tem IMC = ${p2.imc}")
//    println("${p3.nome} tem IMC = ${p3.imc}")
//}
//
//open class Pessoa(val nome: String, val peso: Float, val altura: Float){
////    fun imc() = peso/(altura * altura)
//    val imc get() = peso/(altura * altura)
//}
//fim slide 52

fun main() {
    // Cria uma instância da classe Pessoa com parâmetros específicos
    val p1 = Pessoa("malaquias", 80f, 1.90f)

    // Cria uma instância da classe Colaborador com parâmetros específicos
    val p2 = Colaborador(2000f, "jose", 60f, 1.65f)

    // Cria uma instância da classe Cliente com parâmetros específicos
    val p3 = Cliente(1500f, "joao", 70f, 1.80f)

    // Imprime o nome e o IMC de cada instância
    println("${p1.nome} tem IMC = ${p1.imc}")
    println("${p2.nome} tem IMC = ${p2.imc}")
    println("${p3.nome} tem IMC = ${p3.imc}")
}

 Define uma classe abstrata Pessoa com propriedades nome, peso e altura
open class Pessoa(val nome: String, val peso: Float, val altura: Float) {
    // Define uma propriedade de acesso (get) chamada 'imc' que calcula e retorna o IMC
    val imc get() = peso / (altura * altura)
}

