/*  Escribe un programa java que declare una variable B de tipo entero y asígnale un valor.
A continuación muestra un mensaje indicando si el valor de B es positivo o negativo.
Consideraremos el 0 como positivo. Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.  */

public class ejercicio5 {
    public static void main(String[] args) {
//Inicializar variables
        int B = -16;
//Operacion y devolucion
        System.out.println("El numero " + B + " es " + ((B>=0) ? ("positivo.") : ("negativo.")));
    }
}