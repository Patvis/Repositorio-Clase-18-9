package ejercicio.n.pkg9.vectoresfunciones;

public class EjercicioN9VectoresFunciones {

    public static void main(String[] args) {
       int[] notas = {8,4,7,6,9,3,7};
       float promedio = 0;
       funcBoletin(notas);
    }
    
    public static void funcBoletin (int[]notas) {
        System.out.println("===========================\n          Boletin          \n===========================");
        System.out.println("Alumno: Patricio Visconti\nFecha Nac: 20/01/2020\nDNI: 42341666");
        System.out.println("Materia:\tNota:\nMatematica:");
        for (int i=0;i<notas.length;i+=1) {
            System.out.println("\t\t"+notas[i]);
        }
        System.out.println("Promedio:\t"+funcPromedio(notas));
    }
    
    public static float funcPromedio(int[]notas){
        int suma=0;
        for (int j=0;j<notas.length;j++){
            suma = suma+notas[j];
        }
        return suma/notas.length;
    }
}