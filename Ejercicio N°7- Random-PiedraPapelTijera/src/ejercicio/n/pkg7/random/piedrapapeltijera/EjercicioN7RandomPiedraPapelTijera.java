package ejercicio.n.pkg7.random.piedrapapeltijera;

import java.util.Scanner;
import java.util.Random;

public class EjercicioN7RandomPiedraPapelTijera {

    public static void main(String[] args) {
        int ronda = 1;
        int[] puntaje = new int[] {0,0};
        String[] opciones = {"Piedra","Papel","Tijera"};
        do {
            System.out.println("Ronda "+ronda+":");
            //Opcion Rival
            Random rand = new Random();
            int opcionRival = rand.nextInt(3); // 0-2
            //Opcion Jugador
            int opcionJugador = 0;
            do {
                System.out.println("Piedra Papel o Tijera?\nElige una opcion:\n1.Piedra\n2.Papel\n3.Tijera");
                Scanner leer = new Scanner(System.in);
                opcionJugador = leer.nextInt() - 1;
                if (opcionJugador<0 || opcionJugador>2) {
                    System.out.println("Ha elegido una opcion invalida!\n===============================");
                }
            } while (opcionJugador<0 || opcionJugador>2);
            
            //Resultados
            //Empate
            if ((opcionJugador==0 && opcionRival==0)||(opcionJugador==1 && opcionRival==1)||(opcionJugador==2 && opcionRival==2)) {
                System.out.println("\nJugador eligio "+opciones[opcionJugador]+"\nConsola eligio "+opciones[opcionRival]+"\nES UN EMPATE!\n======================");
            }
            //Perdiste
            else if ((opcionJugador==0 && opcionRival==1)||(opcionJugador==1 && opcionRival==2)||(opcionJugador==2 && opcionRival==0)) {
                System.out.println("\nJugador eligio "+opciones[opcionJugador]+"\nConsola eligio "+opciones[opcionRival]+"\nPERDISTE!\n======================");
                ronda++;
                puntaje[1]+=1;
            }
            //Ganaste
            else if ((opcionJugador==1 && opcionRival==0)||(opcionJugador==2 && opcionRival==1)||(opcionJugador==0 && opcionRival==2)) {
                System.out.println("\nJugador eligio "+opciones[opcionJugador]+"\nConsola eligio "+opciones[opcionRival]+"\nGANASTE!\n======================");
                ronda++;
                puntaje[0]+=1;
            }
        } while (ronda<=3);
        System.out.println("Puntaje Final:\n\tJugador: "+puntaje[0]+"\n\tRival: "+puntaje[1]);
    }
    
}
