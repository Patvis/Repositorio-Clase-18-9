/*  Programa javo que declare cuatro variables enteras A, B, C y D y asígnale un valor a cada una. A continuación, realiza las instrucciones necesarias para que:
B tome el valor de C
C tome el valor de A
A tome el valor de D
D tome el valor de B
Si por ejemplo A = 1, B = 2, C = 3 y D = 4 el programa debe mostrar:
Valores iniciales
A = 1
B = 2
C = 3
D = 4
Valores finales
B toma el valor de C -> B = 3                                                                                     
C toma el valor de A -> C = 1
A toma el valor de D -> A = 4
D toma el valor de B -> D = 2  */

public class ejercicio3 {
    public static void main(String[] args) {
//Inicializar variables
        int A=1, B=2, C=3, D=4, temp=0;
//Valores Iniciales
        System.out.println("\nA = "+A+"\nB = "+B+"\nC = "+C+"\nD = "+D);
//Operaciones
        temp = A;
        A = B;
        B = C;
        C = D;
        D = temp;
        temp = 0;
//valores Finales
    System.out.println("\nA toma el valor de B -> A = "+A+"\nB toma el valor de C -> B = "+B+"\nC toma el valor de D -> C = "+C+"\nD toma el valor de A -> D = "+D);
    }
}