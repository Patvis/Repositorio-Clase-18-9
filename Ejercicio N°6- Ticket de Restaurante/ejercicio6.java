/* 
Realizar un programa en el cual el resultado sea el ticket de un restaurante. 
Que el usuario ingrese:
- Se ingrese el nombre del Mozo
- Se ingresar el total de lo consumido
- Seleccionar modalidad de pago
        - Efectivo
        - Tarjeta de crédito
        - Tarjeta de débito
. En el caso de ser de crédito ingresar los números
- En el caso de ser de crédito ingresar cantidad de cuotas
- En el caso de ser de débito ingresar los números

Calcular descuento o interés  según el medio de pago:
-Efectivo -30%
-Débito -10%
-Tarjeta Crédito  +10%

Ejemplo del ticket:
=============================
RESTAURANTE CFP N°36
Zavaleta 204, , C1437EYF CABA
=============================
Caja # 1 - Ticket # 1
LO ATENDIO: XXXXXX
30/04/2010 11:46:47 AM
=============================
1 Gaseosa  
1 Milanesa Napolitana con fritas
1 Flan con Crema 
1 Cafe 
=============================
SUBTOTAL XXXXXX
FORMA DE PAGO: XXXXXXX
NUMERO TARJETA :XXXXXXX(si pago con tarjeta)
CUOTAS: XX (si pago con tarjeta credito)
DESCUENTO: XXXXXX

TOTAL : XXXXXX

=============================
Gracias por su visita
=============================

-------------------------------SCAN-------------------------------
import java.util.Scanner;
	//constructor de metodo scanner
	Scanner leer = new Scanner(System.in)
	//escanear por teclado 
	System.out.print("---Ingrese int numero1---");
	numero1 = leer.nextInt();

	System.out.print("---Ingrese string palabra1---");
	palabra1 = leer.next();

*/
import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        //Declaracion de Variables
        String nombreMozo,numeroTarjeta;
        float consumido=0,montoFinal=0;
        int medioDePago=0,cuotas=0;
        boolean fin=false;
        Scanner obj_Scan = new Scanner(System.in);
        //Ingreso de Valores
        System.out.println("Ingrese el nombre del Mozo: ");
        nombreMozo = obj_Scan.next();
        System.out.print("Ingrese el valor total de su consumicion: ");
        consumido = obj_Scan.nextInt();
        System.out.print("Ingrese su medio de pago de acuerdo a la siguiente referencia:");
        do {
            System.out.println("\n1.Efectivo (30% de Descuento)\n2.Tarjeta de Debito (10% de Descuento)\n3.Tarjeta de Credito (10% de Recargo)");
            System.out.println("Medio de Pago deseado: ");
            medioDePago = obj_Scan.nextInt();
            if ((medioDePago>0)&&(medioDePago<4)) {
                if (medioDePago==1) { //Efectivo
                    System.out.println("\nEligio como medio de pago deseado: 1.Efectivo");
                    montoFinal=(float) (consumido*(0.7));
                    //Devolucion de Ticket
                    System.out.print("\n=============================\nPizzeria Los HDP\nGerli, Sucursal de Donovan y\nnCamino Gral. Chamizo\nC1092, Avellaneda\n=============================\nCaja # 1 - Ticket # 1\nLO ATENDIO: "+nombreMozo+"\n04/20/2020 06:09:00 PM\n=============================\n1 Cerveza Tirada\n1 Pizza de Ricota y Queso\n=============================\nSUBTOTAL: $"+consumido+"\nFORMA DE PAGO: Efectivo\nDESCUENTO: 30% = $"+(montoFinal-consumido)+"\n\nTOTAL : $"+montoFinal+"\n\n=============================\nGracias por su visita\n=============================");
                    fin=true;
                } else if (medioDePago==2) { //Debito
                    System.out.print("\nEligio como medio de pago deseado: 2.Tarjeta de Debito");
                    montoFinal=(float) (consumido*(0.9));
                    System.out.println("\nIngrese el Numero de su Tarjeta de Debito: ");
                    numeroTarjeta = obj_Scan.next();
                    //Devolucion de Ticket
                    System.out.print("\n=============================\nPizzeria Los HDP\nGerli, Sucursal de Donovan y\nCamino Gral. Chamizo\nC1092, Avellaneda\n=============================\nCaja # 1 - Ticket # 1\nLO ATENDIO: "+nombreMozo+"\n04/20/2020 06:09:00 PM\n=============================\n1 Cerveza Tirada\n1 Pizza de Ricota y Queso\n=============================\nSUBTOTAL: $"+consumido+"\nDESCUENTO: 10% = $"+(montoFinal-consumido)+"\nFORMA DE PAGO: Tarjeta de Debito\nNUMERO TARJETA: "+numeroTarjeta+"\n\nTOTAL : $"+montoFinal+"\n\n=============================\nGracias por su visita\n=============================");
                    fin=true;
                } else if (medioDePago==3) { //Credito
                    System.out.println("\nEligio como medio de pago deseado: 3.Tarjeta de Credito");
                    montoFinal=(float) (consumido*(1.1));
                    System.out.println("\nIngrese el Numero de su Tarjeta de Credito: ");
                    numeroTarjeta = obj_Scan.next();
                    //Cuotas?
                    System.out.print("\nIngrese en cuantas cuotas desea efectuar el pago (1-12): ");
                    do {
                        cuotas = obj_Scan.nextInt();
                        if ((cuotas>12)||(cuotas<1)) {
                            System.out.print("\nIngrese un numero de cuotas en el rango de 1 a 12 meses: ");
                        }
                    } while ((cuotas>12)||(cuotas<1));
                    //Devolucion de Ticket
                    System.out.print("\n=============================\nPizzeria Los HDP\nGerli, Sucursal de Donovan y\nCamino Gral. Chamizo\nC1092, Avellaneda\n=============================\nCaja # 1 - Ticket # 1\nLO ATENDIO: "+nombreMozo+"\n04/20/2020 06:09:00 PM\n=============================\n1 Cerveza Tirada\n1 Pizza de Ricota y Queso\n=============================\nSUBTOTAL: $"+consumido+"\nRECARGO: 10% = $"+(montoFinal-consumido)+"\nFORMA DE PAGO: Tarjeta de Credito\nNUMERO TARJETA: "+numeroTarjeta+"\nCANT. CUOTAS: "+cuotas+"\nVALOR CUOTAS: $"+(montoFinal/cuotas)+"\n\nTOTAL : $"+montoFinal+"\n\n=============================\nGracias por su visita\n=============================");
                    fin=true;
                }
            } else {
                System.out.print("Por favor, ingrese un medio de pago valido de acuerdo a la siguiente referencia");
            }
        } while (fin==false);
    }
}
