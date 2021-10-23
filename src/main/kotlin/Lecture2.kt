//  index = 0.0588 * L - 0.296 * S - 15.8




fun grado( sentence :String):Int{

    return sentence.length
}

fun consecutivos(lista : List<Int>): Int{
    var contador1 = 0;
    var contador2 = 0;

    for (i in lista){
        if (i == 0 ){
            contador1 =0;
        }else{
            contador1++
            contador2 = maxOf(contador1, contador2)
        }
    }

    return contador2
}
fun main(){
    //print(grado("Congratulations! Today is your day. You're off to Great Places! You're off and away!"))

    val lista1 = listOf(1,1,0,1,1,1);
    val lista2 = listOf(1,1,1,1,1,0,0,0,1,1,1,0,1,1,1);

    println(consecutivos(lista1))
    println(consecutivos(lista2))

}