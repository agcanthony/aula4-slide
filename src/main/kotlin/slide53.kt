//aula 4 - slide 53
//fun main(){
//
//    val p1 = Pessoa("maria",60f,1.70f)
//    val p2 = Colaborador(2000f,"joaquim",60f,1.75f)
//    val p3 = Cliente(1500f,"marcos",60f,1.80f)
//
//    println("${p1.nome} tem IMC = ${p1.imc()}")
//    println("${p2.nome} tem IMC = ${p2.imc()} e ${if(p2.ativo) "esta ativo" else "foi despedido"}")
//    println("${p3.nome} tem IMC = ${p3.imc()} e renda = ${p3.renda}")
//}
//
//open class Pessoa(val nome: String, val peso: Float, val altura: Float){
//
//    fun imc() = peso/(altura * altura)
//}
// class Cliente (var renda: Float, nome: String, peso: Float, altura: Float): Pessoa( nome, peso,altura){
//
//     fun aprovacao() = renda> 1000
//
// }
//
//class Colaborador (var salario: Float, nome: String, peso: Float, altura: Float): Pessoa( nome, peso,altura){
//
//    val ativo = true
//    fun bonus() = salario > 0
//
//}

// Função principal (main)
fun main(){
    // Cria uma instância da classe Pessoa com parâmetros específicos
    val p1 = Pessoa("mateus",60f,1.87f)

    // Cria uma instância da classe Colaborador com parâmetros específicos
    val p2 = Colaborador(5000f,"jurema",68f,1.78f)

    // Cria uma instância da classe Cliente com parâmetros específicos
    val p3 = Cliente(2500f,"tadeu",70f,1.82f)

    // Imprime o nome, IMC e informações adicionais de cada instância
    println("${p1.nome} tem IMC = ${p1.imc()}")

    // Imprime o nome, IMC, status de ativo e se foi despedido do Colaborador p2
    println("${p2.nome} tem IMC = ${p2.imc()} e ${if(p2.ativo) "está ativo" else "foi despedido"}")

    // Imprime o nome, IMC, renda e se aprovado do Cliente p3
    println("${p3.nome} tem IMC = ${p3.imc()} e renda = ${p3.renda}")
}

// Define uma classe base Pessoa com propriedades nome, peso e altura e um método para calcular o IMC
open class Pessoa(val nome: String, val peso: Float, val altura: Float){
    fun imc() = peso / (altura * altura)
}

// Define a classe Cliente que herda de Pessoa e adiciona a propriedade renda e o método aprovacao
class Cliente (var renda: Float, nome: String, peso: Float, altura: Float): Pessoa(nome, peso, altura){
    fun aprovacao() = renda > 2000
}

// Define a classe Colaborador que herda de Pessoa e adiciona a propriedade salario, o status ativo e o método bonus
class Colaborador (var salario: Float, nome: String, peso: Float, altura: Float): Pessoa(nome, peso, altura){
    val ativo = true
    fun bonus() = salario > 0
}
