package ejercicio.n.pkg10.juego.del.vaso;

import java.util.Random;
import javax.swing.JOptionPane;

public class EjercicioN10JuegoDelVaso {

    public static void main(String[] args) {
        int[] puntaje = new int[] {0,0};
        String[] nombreJug = {"null","null"};
        nombreJug[0] = (JOptionPane.showInputDialog(null,"Ingrese el nombre del Jugador 1:","Juego del Vaso",JOptionPane.PLAIN_MESSAGE,null,null,null)).toString();
        nombreJug[1] = (JOptionPane.showInputDialog(null,"Ingrese el nombre del Jugador 2:","Juego del Vaso",JOptionPane.PLAIN_MESSAGE,null,null,null)).toString();
        Random rand = new Random();
        for (int ronda=0;ronda<3;ronda+=1) {
            int jugador=0;
            for (jugador=0;jugador<2;jugador+=1) {
                int pelotita = rand.nextInt(3);
                int seleccion = JOptionPane.showOptionDialog(null,"Encuentre la pelotita escondida","Juego del Vaso. Jugador "+jugador+". Ronda: "+ronda,JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,new Object []{"Vaso 1", "Vaso 2","Vaso 3"},"Vaso 1" );    
                if (pelotita==seleccion){
                    JOptionPane.showMessageDialog(null,"Correcto!", "Juego del Vaso. Jugador "+(jugador+1)+". Ronda: "+(ronda+1),JOptionPane.INFORMATION_MESSAGE,null);
                    puntaje[jugador]+=1;
                } else {
                    JOptionPane.showMessageDialog(null,"Incorrecto!", "Juego del Vaso"+(jugador+1)+". Ronda: "+(ronda+1),JOptionPane.INFORMATION_MESSAGE,null);
                }
            }
        }
        System.out.println(nombreJug[0]+": "+puntaje[0]+"\n"+nombreJug[1]+": "+puntaje[1]);
    }
}
