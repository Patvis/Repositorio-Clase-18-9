package ejercicio15.cajero.automatico.banco.cfp36;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ejercicio15CajeroAutomaticoBancoCFP36 {

    public static void main(String[] args) {
        int saldo=50000;
        int operacion=0;
        String pw="1234", pwIngresada = "12345678";
        ImageIcon icon = new  ImageIcon("src/Images/RsBankLogo.png");
  
        JOptionPane.showMessageDialog(null, "Banco CFP N°36","Bienvenido",JOptionPane.INFORMATION_MESSAGE,icon);
        pwIngresada = JOptionPane.showInputDialog(null, "Bienvenido Patricio.\nPor favor, Ingrese su contraseña:",null);
        System.out.println(pw+" | "+ pwIngresada);
        if (pwIngresada.equals(pw)){
            do {
                operacion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Saldo\n2. Transferir\n3. Extracción\n4. Cambio de Clave\n5. Salir","Ingrese la opcion deseada aquí."));
                switch(operacion) {
                    case 1:
                        verSaldo(saldo);
                        break;
                    case 2:
                        saldo = transDinero(saldo);
                        break;
                    case 3:
                        extDinero(saldo);
                        break;
                    case 4:
                        cambClave(pw);
                }
            } while(operacion!=5);
        }
    }
    
    //Funciones del menú principal
    public static void verSaldo(int saldo) {
        System.out.println("==============================");
        System.out.println("========BANCO CFP N°36========");
        System.out.println("==============================");
        System.out.println("==Consulta de Saldo:==========");
        System.out.println("==Cuenta corriente en Pesos:==");
        System.out.println("==$"+saldo+"======================");
        System.out.println("==============================");
        System.out.println("==Cuenta corriente en ========");
        System.out.println("==Dolares:====================");
        System.out.println("==U$D-----====================");
        System.out.println("==============================");
    }
    
    public static int transDinero(int saldo) {
        //Declaracion de Variables
        int montoTransf=0; boolean CBUvalido=false; String CBU;
        //Ingresar CBU
        do {
            CBU = JOptionPane.showInputDialog(null, "Ingrese el CBU de la cuenta a transferir:","Ingrese el CBU aquí.");
            //Verificar que el largo del CBU es de 16 caracteres para salir del bucle
            if (CBU.length()==1) {
                CBUvalido = true;
            }
        }  while (CBUvalido==false);
        //Ingresar monto a transferir
        do {
            montoTransf = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el monto a transferir a CBU:\n"+CBU,"Ingrese el monto aquí."));
        }  while ((saldo<=montoTransf)&&(montoTransf>0));
        saldo = saldo - montoTransf;
        System.out.println(saldo+" | "+montoTransf);
        ticketTransf(saldo,montoTransf,CBU);
        return saldo;
    }
    
        //Funcion Ticket de Transferencia
        private static void ticketTransf(int saldo, int montoTransf, String CBU) {
            System.out.println("==============================");
            System.out.println("========BANCO CFP N°36========");
            System.out.println("==============================");
            System.out.println("==Transferencia a CBU:========");
            System.out.println("======="+CBU+"=======");
            System.out.println("==============================");
            System.out.println("==Monto Transferido:==========");
            System.out.println("==$"+montoTransf+"=====================");
            System.out.println("==Saldo Restante:=============");
            System.out.println("==$"+saldo+"======================");
            System.out.println("==============================");
        }
    
    public static void extDinero(int saldo) {
        
    }
    
    public static void cambClave(String pw) {
        
    }
    
}
