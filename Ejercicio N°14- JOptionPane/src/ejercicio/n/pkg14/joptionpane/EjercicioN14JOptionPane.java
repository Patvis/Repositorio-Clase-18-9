package ejercicio.n.pkg14.joptionpane;

import javax.swing.JOptionPane;

public class EjercicioN14JOptionPane {
/*
 Realizar un programa que calcule las cuotas de un préstamo bancario. 
Solicitarle al Cliente por JOPTIONPANE :
Nombre  y apellido
DNI
Sueldo Mensual:
Solicitado:
Cuotas : hasta 12 
Calculo: 
•	El banco presta hasta 100000 pesos siempre y cuando el sueldo del solicitante superé los 200000 anuales.
•	El préstamo  no debe superar a los 10 sueldos del cliente.
•	Calculo = solicitado / cuota
Imprimir la información consola
*/  
    public static void main(String[] args) {
        boolean seraOtorgado=false;
        String nombre=JOptionPane.showInputDialog("Ingrese su Nombre Completo:");
        int dni=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su DNI:")), cuotas=0;
        double sueldo=Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo mensual:")), montoCuotas;
        int prestamo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto de prestamo deseado:"));
        if (prestamo>200000){
            JOptionPane.showMessageDialog(null, "El banco solo puede dar hasta 200000 pesos disculpe");
            System.exit(0);
        }
        do {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese en cuantas cuotas desea pagar su prestamo (1-12):"));
            if (opcion>0 && opcion<=12) { cuotas=opcion;}
            else { JOptionPane.showMessageDialog(null, "Las cuotas deben ser entre 1 mes y 12 como maximo.\nPor favor ingrese un valor valido.");}
        } while (cuotas==0);
        if (200000<(sueldo*12)) {
            double montoPrestamo=sueldo*10;
            if (prestamo<=montoPrestamo) {
                montoCuotas=prestamo/cuotas;
                seraOtorgado=true;
                funcDatosUsuario(nombre,dni,sueldo);
                funcDatosPrestamo(prestamo,montoCuotas,cuotas);
                funcSeraOtorgado(seraOtorgado);
            }
        } else {
            seraOtorgado = false;
            funcSeraOtorgado(seraOtorgado);
        }
    }
    
    
    public static void funcDatosUsuario(String nombre,int dni,double sueldo){
        System.out.println("================================\n           BANCO CFP36          \n================================");
        System.out.println("Cliente:\t"+nombre+"\nDNI:\t"+dni+"\nSueldo:\t"+sueldo);         }
    
    
    public static void funcDatosPrestamo(double prestamo,double montoCuotas,int cuotas){
        System.out.println("Monto solicitado:\t"+prestamo+ "\nCuotas a Pagar:\t"+montoCuotas+"\nCantidad de Cuotas:\t"+cuotas);           
    }
    
    
    public static void funcSeraOtorgado(boolean otorgado){
        if (otorgado){
            System.out.println("Prestamo APROBADO");
            System.out.println("=================================");
        } else { JOptionPane.showMessageDialog(null,"No se puede otorgar el prestamo\nDEDEGADO");}
    }
}