/*  Escribe un programa java que declare una variable A de tipo entero y asígnale un valor.
A continuación muestra un mensaje indicando si A es par o impar.
Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.  */

public class ejercicio4 {
    public static void main(String[] args) {
//Inicializar variables
        int A = 16;
//Operacion y devolucion
        System.out.println("El numero " + A + " es " + ((A%2 == 0) ? ("par.") : ("impar.")));
    }
}