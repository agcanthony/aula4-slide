//aula 4 - slide 69
//fun main (){
//
//    var r: Any = "s"
//    var t = 0f
//
//    do {
//
//        println("Digite um número inteiro ou 's' para sair: ")
//        try{
//
//            r = readLine()!!
//            if(r == "s")
//                break
//            t += r.toInt()
//
//        }
//        catch(e: NumberFormatException){
//
//            println("Número inválido, tente novamente!")
//        }
//        catch(e: Exception){
//
//            println("!!!Houve uma execeção!!!")
//        }
//        finally {
//            println("    Total parcial: $t")
//        }
//
//    }    while(r != "s")
//}
//fim slide 69
// Função principal (main)
fun main (){

    // Declara uma variável 'x' do tipo Any inicializada com a String "n"
    var x: Any = "n"

    // Inicializa a variável 't' do tipo Float com valor zero
    var t = 0f

    // Loop 'do-while' que solicita a entrada do usuário até que 'x' seja "n"
    do {
        // Solicita ao usuário que digite um número inteiro ou 'n' para sair
        println("Digite um número inteiro ou 'n' para sair: ")

        // Bloco 'try' para lidar com exceções durante a leitura e conversão de entrada
        try {
            // Lê a entrada do usuário como String
            x = readLine()!!

            // Verifica se o usuário digitou "n" para sair do loop
            if (x == "n")
                break

            // Tenta converter a entrada para Int e soma ao total 't'
            t += x.toInt()
        }
        // Captura exceção de formato inválido de número
        catch(e: NumberFormatException){
            // Imprime uma mensagem de número inválido
            println("Número inválido!")
        }
        // Captura exceção genérica
        catch(e: Exception){
            // Imprime uma mensagem de exceção genérica
            println("!!!Houve uma exceção!!!")
        }
        // Bloco 'finally' que sempre é executado, independentemente de exceções
        finally {
            // Imprime o total acumulado até o momento
            println("    Total: $t")
        }

    } while(x != "n") // Continua o loop enquanto 'x' não for "n"
}

