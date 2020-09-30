public class ejercicio3 {
    public static void main(String[] args) {
        
// Variables 	
	int numero1, numero2, suma, edad;
	String nombre;
// Constante	
	final int NUMERO_3= 4;
// Ingreso los valores a la variables numero1 y numero2
	numero1 = 30;
	numero2 = 40;
// operación suma
	suma = numero1 + numero2;
// Muestro en pantalla las dos variables y el resultado de la suma
	System.out.println("La variable numero1 es igual a: " + numero1 + ".\nLa variable numero2 es igual a: " + numero2 + ".\nEl resultado de la suma de variables es igual a: " + suma + ".");
// Cambio los valores de numero1,numero2 y vuelvo a realizar la operación de suma
	numero1=80;
	numero2=90;
//operación suma
	suma = numero1 + numero2;
// Muestro en pantalla las dos variables y el resultado de la suma
    System.out.println("\nLa variable numero1 ahora es igual a: " + numero1 + ".\nLa variable numero2 ahora es igual a: " + numero2 + ".\nEl resultado de la suma de variables ahora es igual a: " + suma + ".");
// Instancio y muestro en pantalla la variable nombre y su edad
    edad = 20;
    nombre = "Patricio Visconti";
    System.out.println("\nNombre: " + nombre + "\nEdad: " + edad);
// Muestro en pantalla la constante
    System.out.println("\nLa constante declarada al principio del programa es: " + NUMERO_3);
    }
    
}