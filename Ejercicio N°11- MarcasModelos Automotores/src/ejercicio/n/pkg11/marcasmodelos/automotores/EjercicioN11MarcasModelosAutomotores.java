package ejercicio.n.pkg11.marcasmodelos.automotores;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class EjercicioN11MarcasModelosAutomotores {

    public static void main(String[] args) {
        ImageIcon icon = new  ImageIcon("src/Images/Logo.png");
        int confirmar = JOptionPane.showOptionDialog(null,"Bienvenido al Programa de\nAutogestion CFP Seguros","Programa de Autogestion de CFP Seguros",JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,icon,new String[]{"Continuar","Salir"},"default");
        if (confirmar == JOptionPane.NO_OPTION) {
            System.exit(0);
        }
        String [] marcas = {"  ","Ford","Fiat", "Renault"}; String [] Ford = {"Fiesta","Falcon","Ka","Focus"}; String [] Fiat = {"1500","Palio","Punto","Cubo"}; String [] Renault = {"Clio","Sandero","12","Kwind"};
        Object opcion = JOptionPane.showInputDialog(null,"Seleccione una marca de vehiculo", "Mi coche",JOptionPane.QUESTION_MESSAGE,null, marcas,marcas[0]);
        funcModelos(Ford,Fiat,Renault,opcion);
    }

    private static void funcModelos(String[] Ford,String[] Fiat,String[] Renault,Object opcion){
        if (opcion == "Ford"){
            Object fordmodelo = JOptionPane.showInputDialog(null,"Los modelos para la marca  " + opcion + "Seleccione el modelo que le guste","Modelos de  Autos",JOptionPane.QUESTION_MESSAGE,null,Ford,Ford[0]);
            System.out.println("Su veiculo es de la marca " + opcion + " modelo " + fordmodelo);
        }
        else if (opcion == "Fiat"){
            Object fiatmodelo = JOptionPane.showInputDialog(null,"Los modelos para la marca  " + opcion + "Seleccione el modelo que le guste","Modelos de  Autos",JOptionPane.QUESTION_MESSAGE,null,Fiat,Fiat[0]);
            System.out.println("Su veiculo es de la marca " + opcion + " modelo " + fiatmodelo);
        }
        else if (opcion == "Renault"){
            Object renaultmodelo = JOptionPane.showInputDialog(null,"Los modelos para la marca  " + opcion + "Seleccione el modelo que le guste","Modelos de  Autos",JOptionPane.QUESTION_MESSAGE,null,Renault,Renault[0]);
            System.out.println("Su veiculo es de la marca " + opcion + " modelo " + renaultmodelo);
        }
    }

}