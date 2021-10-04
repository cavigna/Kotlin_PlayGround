fun main() {
 hacerPiramide(preguntaUsuario())
//    cardValid(4003600000000014)
//    cardValid(3566002020360505)
//    cardValid(3566002020360509)
//    cardValid(4003600000000014)



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

        for (i in 1 until height) print(" ")  //==> i =1, i++, height-1
        for (j in 1..m) print("#")
        print("  ")
        for (j in 1..m) print("#")
        for (i in 1 until height) print(" ") // m = 2, h =2
        m++
        height-- // m = 3, h=1
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

/*
#include <cs50.h>
#include <stdio.h>
#include <math.h>
#include <stdlib.h>


int recursivo(int n)
{
    if(n<10){
        return n;
    }
    else
    {
        return n%10 + recursivo(n/10);
    }
}



bool credit_valid(long n)
{
    int m = n;
    int par = 0;
    int impar = 0;

    int digitos = floor(log10(labs(n))) + 1;

    for (int i = 1; i <= digitos; i++)
    {
        int po = n % 10;
        n /= 10;

        if ( i % 2 == 0)
        {

            int por2 = po * 2 ;
            par += recursivo(por2);

        }

        else
        {
            impar += po;

        }


    }

    if((par+impar)%10 == 0){
        return true;
    }
    else{
        return false;
    }


    printf("%d", (par+impar));
    printf("\n");
    printf("\n");




  }


void tipo(long n, bool valid)
{
    int dos = n / 100000000000000;


    if(valid)
    {
         if (dos == 34 || dos == 35 || || dos == 37)
        {
            printf("AMEX\n");

        }

        else if( dos >=40 && dos <50 )
        {
            printf("VISA\n");
        }

        else if( dos >=51 && dos <55 )
        {
            printf("MASTERCARD\n");
        }
    }


    else
    {
        printf("INVALID\n");
    }


}










int main(void)
{

    long numero = 4003600000000014;
    long numero2 = 378282246310005;
    //credit_valid(4003600000000014);
    //tipo(numero, credit_valid(numero));
    tipo(numero2, credit_valid(numero2));


    //printf("%ld", (numero % 10));

}
 */

/*
#include <cs50.h>
#include <stdio.h>
#include <math.h>
#include <stdlib.h>


int recursivo(int n)
{
    if(n<10){
        return n;
    }
    else
    {
        return n%10 + recursivo(n/10);
    }
}



bool credit_valid(long n)
{
    int m = n;
    int par = 0;
    int impar = 0;

    int digitos = floor(log10(labs(n))) + 1;

    for (int i = 1; i <= digitos; i++)
    {
        int po = n % 10;
        n /= 10;

        if ( i % 2 == 0)
        {

            int por2 = po * 2 ;
            par += recursivo(por2);

        }

        else
        {
            impar += po;

        }


    }

    if((par+impar)%10 == 0){
        return true;
    }
    else{
        return false;
    }


    printf("%d", (par+impar));
    printf("\n");
    printf("\n");




  }


void tipo(long n, bool valid)
{
    int dos = 0;
    int digitos = floor(log10(labs(n))) + 1;

    if(digitos == 16)
    {
         dos = n / 100000000000000;
    }

    else if (digitos == 15)
    {
         dos = n / 10000000000000;
    }

    else if (digitos == 14)
    {
         dos = n / 1000000000000;
    }

    else if (digitos == 13)
    {
         dos = n / 100000000000;
    }





    printf("%d", dos);


    if(valid)
    {
         if (dos == 34 || dos == 35 ||  dos == 37)
        {
            printf("AMEX\n");


        }

        else if( dos >=40 && dos <50 )
        {
            printf("VISA\n");
        }

        else if( (dos >=51 && dos <55) || dos ==22  )
        {
            printf("MASTERCARD\n");
        }
    }


    else
    {
        printf("INVALID\n");
    }


}










int main(void)
{

    //long numero = 4003600000000014;
    //long numero = 2221000000000009;
    long numero = 378282246310005;



    //long numero2 = 4012888888881881;
    //credit_valid(4003600000000014);
    tipo(numero, credit_valid(numero));
    //tipo(numero2, credit_valid(numero2));


    //printf("%ld", (numero % 10));

}
 */