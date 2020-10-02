import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
//Inicializar variables
        int operacion=0;
        double num1=0,num2=0,res=0;
        Scanner leer = new Scanner(System.in);
//Ingresar Valores
        System.out.print("Ingrese el primer numero: ");
        num1 = leer.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        num2 = leer.nextDouble();
//Elegir Operación
        System.out.print("\nIngrese el numero correspondiente a la operacion que desea realizar:");
        System.out.print("\n\t1. Suma.\n\t2. Resta.\n\t3. Producto.\n\t4. Cociente.\n");
        operacion = leer.nextInt();
//Realizar Opreación y mostrar resultado
        switch (operacion) {
            case 1: //1. Suma.
                res = num1 + num2;
                System.out.println("El resultado de la SUMA de "+num1+" y "+num2+" es igual a: "+res);
                break;
            case 2: //1. Resta.
                res = num1 - num2;
                System.out.println("El resultado de la RESTA de "+num1+" y "+num2+" es igual a: "+res);
                break;
            case 3: //1. Producto.
                res = num1 * num2;
                System.out.println("El resultado de PRODUCTO entre "+num1+" y "+num2+" es igual a: "+res);
                break;
            case 4: //1. Cociente.
                res = num1 / num2;
                System.out.println("El resultado del COCIENTE entre "+num1+" y "+num2+" es igual a: "+res);
                break;
            default: //Operacion invalida
                System.out.println("\nEl tipo de operacion ingresado es invalido, reinicie el programa para volver a empezar.\n\n");
        }
    }
}