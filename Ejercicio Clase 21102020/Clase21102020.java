import java.util.Scanner;
import java.util.Random;

public class Clase21102020 {
	public static void main(String args[]){
        //Objeto Random
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
		//Declaracion
		int largo = 0, alto = 10;
		//Operacion
        System.out.println("Por favor indique el largo de su matriz: ");
        largo = sc.nextInt();
        System.out.println("Por favor indique el alto de su matriz: ");
        alto = sc.nextInt();
        //Crear Matriz
        int matriz [] [] = new int [largo] [alto];
        //Print
        System.out.println("Su matriz tendra "+largo+" numeros de largo y "+alto+" numeros de alto.\n\n");
        //Llenar matriz con numeros aleatorios
        System.out.println("Su matriz se lleno con los siguientes numeros:\n");
        for (int j = 0;j < alto;j+=1) {
            for (int i = 0;i<largo;i+=1) {
                matriz[i][j] = rd.nextInt(100)+1; // 1-100
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.print("\n");
        }
	}
}