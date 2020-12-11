package ejercicio.n.pkg13.joptionpane;

import javax.swing.JOptionPane;

public class EjercicioN13JOptionPane {

    public static void main(String[] args) {
        int anio, valorFinal = 0;
        String [] arr_marcasAltaGama = {"AUDI","VOLVO","MERCEDESBENZ","PORCHE","FERRARI"};
        String [] arr_marcas = {" ","AUDI","VOLVO","MERCEDESBENZ","PORCHE","FERRARI","FORD","FIAT","VW","RENAULT"};
        
        Object objMarca = JOptionPane.showInputDialog(null,"Por favor seleccione la marca de su vehiculo","Seguros CFP36",JOptionPane.QUESTION_MESSAGE,null,arr_marcas,arr_marcas[0]);
        anio = Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor ingrese el año de fabricación","Seguros CFP36",JOptionPane.WARNING_MESSAGE));
        boolean boolGamaAlta = funcValorGama(arr_marcasAltaGama, objMarca);
        if (boolGamaAlta){ valorFinal = 1800;} else { valorFinal = 900;}
        valorFinal+=funcValorAnio(anio);
        JOptionPane.showMessageDialog(null,"El valor de la cuota es :  $  " + valorFinal ,"Seguros CFP36",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static boolean funcValorGama(String [] arr_marcasAltaGama, Object objMarca){
        for (String MARCA2:arr_marcasAltaGama){
            if (MARCA2.equals(objMarca)){
                return true;
            }        
        }
        return false;
    }

    public static int funcValorAnio(int anio){
        int valor = 0;
        if(anio>=1990 && anio<=1999){ valor = 480;}
        else if (anio>=2000 && anio<=2010){ valor = 780;}
        else if (anio>=2011 && anio<=2016){ valor = 950;}
        else if (anio>=2017 && anio<=2020){ valor = 1200;}
        return valor;    
    }
    
}