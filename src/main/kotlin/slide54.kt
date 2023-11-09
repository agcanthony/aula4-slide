//aula 4 - slide 54
//
//fun main(){
//
//    val p1 = Pessoa("maria",60f,1.70f)
//    val p2 = Pessoa("joaquim",60f,1.75f)
//    val p3 = Pessoa("marcos",60f,1.80f)
//
//    println(p1)
//    println(p2)
//    println(p3.toString())
//}
//
//class Pessoa(var nome: String, var peso: Float, var altura: Float){
//    override fun toString(): String {
//        return "$nome,$peso,$altura"
//    }
//}
//fim slide 54
// Função principal (main)
fun main(){
    // Cria três instâncias da classe Pessoa com parâmetros específicos
    val p1 = Pessoa("jose", 60f, 1.70f)
    val p2 = Pessoa("joao", 70f, 1.75f)
    val p3 = Pessoa("judas", 90f, 1.80f)

    // Imprime cada instância usando a representação padrão toString()
    println(p1)
    println(p2)
    println(p3.toString())
}

// Define a classe Pessoa com propriedades nome, peso e altura
class Pessoa(var nome: String, var peso: Float, var altura: Float){
    // Sobrescreve o método toString() para fornecer uma representação personalizada do objeto
    override fun toString(): String {
        return "$nome, $peso, $altura"
    }
}

