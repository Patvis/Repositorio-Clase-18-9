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
                        saldo = extDinero(saldo);
                        break;
                    case 4:
                        cambClave(pw);
                }
            } while(operacion!=5);
        }
    }
    
    //Funciones del menú principal
    public static void verSaldo(int saldo) {
        System.out.println("\n\n==============================");
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
            if (CBU.length()==16) {
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
            System.out.println("\n\n==============================");
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
    
    public static int extDinero(int saldo) {
        int montoExt=0;
        String[] opciones = {"200","500","1000","2000","Otro Importe"};
        do {
            Object opcionElegida = JOptionPane.showInputDialog(null,"Seleccione el importe a Retirar:","Retirar Dinero",JOptionPane.QUESTION_MESSAGE,null, opciones,opciones[0]);
            switch ((String)opcionElegida) {
                case "200":
                    montoExt=200;
                    break;
                case "500":
                    montoExt=500;
                    break;
                case "1000":
                    montoExt=1000;
                    break;
                case "2000":
                    montoExt=2000;
                    break;
                case "Otro Importe":
                    montoExt=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el monto a Retirar:","Ingrese el monto aquí."));
                    break;
            }
            if (montoExt>saldo) {
                JOptionPane.showMessageDialog(null,"Por favor, ingrese un monto valido menor a su saldo.\nSu saldo actual es de: $"+saldo,"Retirar Dinero",JOptionPane.WARNING_MESSAGE);
            }
        } while ((montoExt>=saldo)||(montoExt<0));
        saldo = saldo - montoExt;
        ticketExt(saldo,montoExt);
        return saldo;
    }
        //Funcion Ticket de Extraccion
        private static void ticketExt(int saldo, int montoExt) {
            System.out.println("\n\n==============================");
            System.out.println("========BANCO CFP N°36========");
            System.out.println("==============================");
            System.out.println("==Extracción realizada por:===");
            System.out.println("==$"+montoExt+"=====================");
            System.out.println("==Saldo Restante:=============");
            System.out.println("==$"+saldo+"======================");
            System.out.println("==============================");
        }
 
    public static String cambClave(String pw) {
        /*Punto de Manu 4_Cambio de Clave
  A)Seleccionar canal para el cambio de clave (HOME BANKING, Clave telefonica y Cajero)
  B)La clave no puede ser la misma que tiene hoy
  C)Imprimir comprobante de cambio de clave indicar en que canal se realizo el cmabio. No mostrar la clave solo ticket informativo.*/   
        String nuevaPw="clave inicializada C:";
        String[] opciones = {"Clave Homebanking","Clave Telefónica","Clave de Cajero"};
        Object opcionElegida = JOptionPane.showInputDialog(null,"Seleccione la clave que desea cambiar:","Cambio de Clave",JOptionPane.QUESTION_MESSAGE,null, opciones,opciones[0]);
        System.out.println(opcionElegida);
        switch ((String)opcionElegida) {
            case "Clave Homebanking":
                nuevaPw=JOptionPane.showInputDialog(null,"Por favor, ingrese su nueva Clave Homebanking:","Cambio de Clave");
                break;
            case "Clave Telefónica":
                nuevaPw=JOptionPane.showInputDialog(null,"Por favor, ingrese su nueva Clave Telefonica:","Cambio de Clave");
                break;
            case "Clave de Cajero":
                nuevaPw=JOptionPane.showInputDialog(null,"Por favor, ingrese su nueva Clave de Cajero:","Cambio de Clave");
                break;
        }
        return nuevaPw;
    }
    
}