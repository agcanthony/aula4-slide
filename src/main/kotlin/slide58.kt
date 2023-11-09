//aula 4 - slide 58
//open class Pessoa(val nome: String, val peso:Float, val altura: Float)
//{
//
//    //fun imc = peso/(altura*altura)
//
//    val imc get() = peso /(altura * altura)
//}

// Define uma classe abstrata Pessoa com propriedades nome, peso e altura
open class Pessoa(val nome: String, val peso: Float, val altura: Float)
{
    // Propriedade de acesso (get) chamada 'imc' que calcula e retorna o Índice de Massa Corporal (IMC)
    val imc get() = peso / (altura * altura)

}
