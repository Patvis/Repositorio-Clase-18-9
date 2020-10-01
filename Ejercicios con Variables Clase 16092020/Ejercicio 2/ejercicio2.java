/*  Escribe un programa Java que realice lo siguiente:
        -declarar dos variables X e Y de tipo int
        -dos variables N y M de tipo double
y asigna a cada una un valor. A continuación, muestra por pantalla:
        -El valor de cada variable.
        -La suma  X + Y
        -La diferencia  X – Y
        -El producto  X * Y
        -El cociente  X / Y
        -El resto  X % Y
        -La suma  N + M
        -La diferencia  N – M
        -El producto  N * M
        -El cociente  N / M
        -El resto  N % M
        -La suma X + N
        -El cociente Y / M
        -El resto Y % M
        -El doble de cada variable
        -La suma de todas las variables
        -El producto de todas las variables  */

public class ejercicio2 {
    public static void main(String[] args) {
//Inicializar variables
        int X, Y;
        double N, M;
//Asignar Valores a las variables
        X = 7;
        Y = 10;
        N = 17;
        M = 20;
//Muestra por pantalla
        //Valores de Variables
        System.out.println("La variable X equivale a: " + X + "\nLa variable Y equivale a: " + Y + "\nLa variable N equivale a: " + N + "\nLa variable M equivale a: " + M);
        //Cuentas con X e Y
        System.out.println("\nLa suma de " + X + " + " + Y + " = " + (X+Y));
        System.out.println("La diferencia de " + X + " - " + Y + " = " + (X-Y));
        System.out.println("El producto de " + X + " * " + Y + " = " + (X*Y));
        System.out.println("El cociente de " + X + " / " + Y + " = " + (X/Y));
        System.out.println("El resto del cociente de " + X + " / " + Y + " = " + (X % Y));
        //Cuentas con N y M
        System.out.println("\nLa suma de " + N + " + " + M + " = " + (N+M));
        System.out.println("La diferencia de " + N + " - " + M + " = " + (N-M));
        System.out.println("El producto de " + N + " * " + M + " = " + (N*M));
        System.out.println("El cociente de " + N + " / " + M + " = " + (N/M));
        System.out.println("El resto del cociente de " + N + " / " + M + " = " + (N % M));
        //Cuentas mixtas
        System.out.println("\nLa suma de " + X + " + " + N + " = " + (X+N));
        System.out.println("El cociente de " + Y + " / " + M + " = " + (Y/M));
        System.out.println("El resto del cociente de " + Y + " / " + M + " = " + (Y % M));
        System.out.println("El doble de cada variable es:\n\tX * 2 = " + X*2 + "\n\tY * 2 = " + Y*2 + "\n\tN * 2 = " + N*2 + "\n\tM * 2 = " + M*2);
        System.out.println("La suma de todas las variables es: " + X + " + " + Y + " + " + N + " + " + M + " = " + (X+Y+N+M));
        System.out.println("La suma de todas las variables es: " + X + " * " + Y + " * " + N + " * " + M + " = " + (X*Y*N*M));
    }
}