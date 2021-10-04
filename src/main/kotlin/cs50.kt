fun main() {
    //hacerPiramide(preguntaUsuario())
    cardValid(4003600000000014)
    cardValid(3566002020360505)
    cardValid(3566002020360509)
    cardValid(4003600000000014)



}
/*
4003600000000014
 */

fun cardValid(cardNumber: Long){
    val numToString = cardNumber.toString()
    var suma2digitos =0
    var suma1digitos =0

    for (i in numToString.length-2 downTo 0 step 2){
        suma2digitos += (recursiveDigit(numToString[i].toString().toInt() * 2))
    }

    for (i in numToString.length-1 downTo 1 step  2){
        suma1digitos+= numToString[i].toString().toInt()
    }

    if ((suma1digitos+suma2digitos)%10==0) {
        println("VALID")
    }
    else{
        println("INVALID")
    }



}

fun recursiveDigit(n: Int): Int{
    return if (n<10) n
    else (n%10 + recursiveDigit(n/10))
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

fun preguntaUsuario(): Int {
    var n:Int
    do {
        println("Height:")
         n = readLine()!!.toInt()
        println("")
    } while (n < 1 || n > 8)
    return n

}


/*
#include <cs50.h>
#include <stdio.h>


void makepy(int n){
    int m = 1;

    while(n>=1){

        for(int i = 1; i<=n; i++  ) printf(" ");
        for(int j = 1; j<=m; j++)printf("#");

        printf("  ");

        for(int j = 1; j<=m; j++)printf("#");
        for(int i = 1; i<=n; i++  ) printf(" ");

        m++;
        n--;

        printf("\n");

    }

}


int main(void){
    makepy(4);

}
 */
