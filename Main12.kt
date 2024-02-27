package fundamentos.controles
fun main(args: Array<String>) {
    val nota = 4
    when(nota){
        10,9 -> print("Fantastico")
        8,7 -> print("Parabens")
        6,5,4 -> print("Tem como recuperar")
        in 3 .. 0 -> print("Te vejo proximo semestre")
        else -> print("Nota invalida")
    }
}