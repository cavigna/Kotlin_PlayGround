fun main() {
    hacerPiramide(4)


}



fun hacerPiramide(height: Int) {
    var height = height
    var m = 1

    while (height >= 1) {

        for (i in 1 until height) print(" ")
        for (j in 1..m) print("#")
        print("  ")
        for (j in 1..m) print("#")
        for (i in 1 until height) print(" ")
        m++
        height--
        print("\n")
    }

}

fun preguntaUsuario(height: Int) {
    var height = height
    var m = 1



    while (height >= 1) {

        for (i in 1 until height) print(" ")
        for (j in 1..m) print("#")
        print("  ")
        for (j in 1..m) print("#")
        for (i in 1 until height) print(" ")
        m++
        height--
        print("\n")
    }

}

