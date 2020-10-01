/*  Escribe un programa Java que realice lo siguiente:
        -declarar una variable N de tipo int
        -una variable A de tipo double
        -una variable C de tipo char
    y asigna a cada una un valor. A continuación, muestra por pantalla:
        -El valor de cada variable.
        -La suma de N + A
        -La diferencia de A - N
        -El valor numérico correspondiente al carácter que contiene la variable C.
Si por ejemplo le hemos dado a N el valor 5, a A el valor 4.56 y a C el valor ‘a’, se debe mostrar por pantalla:
Variable N = 5
Variable A = 4.56                                                                                                 
Variable C = a
5 + 4.56 = 9.559999999999999
4.56 - 5 = -0.4400000000000004
Valor numérico del carácter a = 97  */

public class ejercicio1 {
    public static void main(String[] args) {
//Inicializar variables
        int N;
        double A;
        char C;
//Asignar Valores a las variables
        N = 10;
        A = 7.5;
        C = 'Z';
//Muestra por pantalla
        System.out.println("La variable N equivale a: " + N);
        System.out.println("La variable A equivale a: " + A);
        System.out.println("La variable C equivale a: " + C);
        System.out.println("\nLa suma de " + N + " + " + A + " = " + (N+A));
        System.out.println("La diferencia de " + A + " - " + N + " = " + (A-N));
        System.out.println("C: " + (int) C);
    }
}