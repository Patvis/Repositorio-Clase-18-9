import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        //Variables
        String nombre, apellido, dni;
        int anioNac=0, edad=0;
        //Objeto Scanner
        Scanner obj_Scan = new Scanner(System.in);  
        //Ingreso de Datos
        System.out.print("Por favor ingrese su Nombre: ");
        nombre = obj_Scan.next();
        System.out.print("Por favor ingrese su Apellido: ");
        apellido = obj_Scan.next();
        System.out.print("Por favor ingrese su Numero de Documento: ");
        dni = obj_Scan.next();
        System.out.print("Por favor ingrese su Anio de Nacimiento: ");
        anioNac = obj_Scan.nextInt();
        //Operacion de edad (al 2020)
        edad = 2020-anioNac;
        //Devolucion de Tarjeta
        System.out.print("\n\nInformacion de Usuario:");
        System.out.print("\nNombre Completo: "+apellido+", "+nombre);
        System.out.print("\nDNI: "+dni);
        System.out.print("\nAnio de Nacimiento: "+anioNac+"; Edad: "+edad);
    }
}
