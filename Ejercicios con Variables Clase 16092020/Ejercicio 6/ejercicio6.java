/*  Escribe un programa java que declare una variable C de tipo entero y asígnale un valor.
A continuación muestra un mensaje indicando si el valor de C es positivo o negativo, si es par o impar, si es múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que 100.
Consideraremos el 0 como positivo. Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.  */

public class ejercicio6 {
    public static void main(String[] args) {
//Inicializar variables
        int C = 45;
//Operacion y devolucion
        System.out.println("El numero " + C + " es " + ((C>=0) ? ("positivo.") : ("negativo.")));
        System.out.println("El numero " + C + " es " + ((C%2==0) ? ("par.") : ("impar.")));
        System.out.println("El numero " + C + ((C%5 == 0) ? (" es multiplo de 5.") : (" no es multiplo de 5.")));
        System.out.println("El numero " + C + ((C%10 == 0) ? (" es multiplo de 10.") : (" no es multiplo de 10.")));
        System.out.println("El numero " + C + " es " + ((C>=100) ? ("mayor (o igual) a 100.") : ("menor a 100.")));
    }
}