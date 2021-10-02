fun main(args: Array<String>) {
    println("Hello World!")

    var palabra = "palabra"
    palabra.capitalize()
    println("Program arguments: ${args.joinToString()}")

    println(makeUpperCase("hola"))
}

fun makeUpperCase(str: String) {
    var str2 = str.forEach { it.uppercase() }
    return str2

}