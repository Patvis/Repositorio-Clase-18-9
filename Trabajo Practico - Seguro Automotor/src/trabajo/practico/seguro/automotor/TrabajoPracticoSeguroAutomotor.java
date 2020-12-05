package trabajo.practico.seguro.automotor;

import javax.swing.JOptionPane;
import javax.swing.*;
import java.util.Random;

public class TrabajoPracticoSeguroAutomotor {

    //Funcion Main
    public static void main(String[] args) {
        //Ingreso de datos
        String [] arr_datos = func_datosCliente(); //Creacion de Array de datos y llamado a funcion de Llenarlos
        System.out.println("Usuario:\n\tNombre: "+arr_datos[0]+"\n\tApellido: "+arr_datos[1]+"\n\tTelefono: "+arr_datos[2]+"\n\tEMAIL: "+arr_datos[3]); //Comprobar datos en la Consola
        
        String [] arr_vehiculo = func_elegirVehiculo(); //Creacion de Array de Vehículo y llamado a funcion de elegirlo
        System.out.println("Vehiculo:\n\tMarca: "+arr_vehiculo[0]+"\n\tModelo: "+arr_vehiculo[1]+"\n\tDominio(Patente): "+arr_vehiculo[2]+"\n\tAño: "+arr_vehiculo[3]); //Comprobar datos en la Consola
        
        int int_antiguedad = 2020-(Integer.parseInt(arr_vehiculo[3])); //Creacion de variable antiguedad en numero entero y asignacion en base al año actual (2020)
        System.out.println("\tAntiguedad: "+int_antiguedad); //Comprobar datos en la Consola
        
        int int_valorAntiguedad = func_valorAntiguedad(int_antiguedad); //Creacion de variable del valor por antiguedad y llamado a funcion para calcularla
        System.out.println("\tValor por Antiguedad: "+int_valorAntiguedad); //Comprobar datos en la Consola
        
        int int_valorTipoCobertura = func_tipoCobertura(); //Creacion de variable de monto de Cobertura y llamado a funcion de elegirlo y calcularlo
        System.out.println("\tValor por Tipo de Cobertura: "+int_valorTipoCobertura); //Comprobar datos en la Consola
        
        String [] arr_adicCobertura = func_adicCobertura(); //Creacion de Array de adicionales de cobertura y llamado a funcion a elegirlas
        System.out.println("\tAdicionales:\n\t"+arr_adicCobertura[0]+"\n\t"+arr_adicCobertura[1]+"\n\t"+arr_adicCobertura[2]+"\n\t"+arr_adicCobertura[3]+"\nBarrera null: "+arr_adicCobertura[4]+"\n\tCantidad de Adicionales:"+arr_adicCobertura[5]); //Comprobar datos en la Consola
        
        int int_valorAdicionales = func_valorAdicionales(arr_adicCobertura); //Creacion de variable del valor por adicionales y llamado a funcion para calcularlo
        System.out.println("\tValor por Adicionales: "+int_valorAdicionales); //Comprobar datos en la Consola
        
        int int_precioFinal = func_calcPrecio(int_valorAntiguedad,int_valorTipoCobertura,int_valorAdicionales); //Creacion de variable del valor final y llamado a funcion para calcularlo
        System.out.println("\tValor Final: "+int_precioFinal); //Comprobar datos en la Consola
        
        func_imprPoliza(arr_datos,arr_vehiculo,int_antiguedad,int_valorAntiguedad,int_valorTipoCobertura,arr_adicCobertura,int_valorAdicionales,int_precioFinal); //Llamado a funcion para imprimir la Poliza
    }


    //Funcion para llenar los datos de cliente
    public static String[] func_datosCliente() {
        JTextField Input1=new JTextField(), Input2=new JTextField(), Input3=new JTextField(), Input4=new JTextField(); //Definir Campos a Completar
        String[] arr_datos = new String[] {"a","a","1","@"}; //Array donde se guardan los datos
        Object[] message = {
            "Bienvenido a CFP Seguros!\nPor favor ingrese sus datos a continuacion,\nluego presione el boton OK.",
            "Nombre:", Input1, "Apellido:", Input2, "Telefono:", Input3, "Email:", Input4
        }; //Mensaje con multiples campos
        int opcion = JOptionPane.showConfirmDialog(null, message, "Programa de Autogestion de CFP Seguros", JOptionPane.OK_CANCEL_OPTION);  //Ventana de Ingreso de datos
        if (opcion == JOptionPane.OK_OPTION) {
            arr_datos[0] = Input1.getText();
            arr_datos[1] = Input2.getText();
            arr_datos[2] = Input3.getText();
            arr_datos[3] = Input4.getText();
        } //Asignacion de datos ingresados al Array de datos
        return arr_datos; //Devolver el Array de datos
    }
 
    
    //Funcion para elegir el vehiculo y calcular el precio
    public static String[] func_elegirVehiculo() {
        String[] arr_vehiculo = new String[] {"Marca","Modelo","Dominio","Antiguedad"};  //Array donde se guardan los datos
        String[] arr_opcionesMarcas = {"Chevrolet","Citroen","Fiat","Ford","Honda","Nissan","Peugeot","Renault","Toyota","Volkswagen","Otro"}; //Array  de opciones de marcas
        Object marca = JOptionPane.showInputDialog(null,"Seleccione la Marca de su auto:","Programa de Autogestion de CFP Seguros",JOptionPane.QUESTION_MESSAGE,null, arr_opcionesMarcas,arr_opcionesMarcas[0]); //Ventana de seleccion de marca
        arr_vehiculo[0] = (String)marca; //Almacenar la Marca en su posicion del Array de Vehiculo
/*debug*/   System.out.println(arr_vehiculo[0]);
        if (marca=="Other") { //Ingreso de Marca=Otro y modelo por teclado
            arr_vehiculo[0] = (JOptionPane.showInputDialog(null,"Especifique la marca de su Vehiculo.","Programa de Autogestion de CFP Seguros",JOptionPane.PLAIN_MESSAGE,null,null,null)).toString();
            arr_vehiculo[1] = (JOptionPane.showInputDialog(null,"Ingrese el modelo de su Vehiculo.","Programa de Autogestion de CFP Seguros",JOptionPane.PLAIN_MESSAGE,null,null,null)).toString();
        } else { //Ingreso de modelo por teclado
            arr_vehiculo[1] = (JOptionPane.showInputDialog(null,"Ingrese el modelo de su Vehiculo.","Programa de Autogestion de CFP Seguros",JOptionPane.PLAIN_MESSAGE,null,null,null)).toString();
        }
/*debug*/   System.out.println(arr_vehiculo[1]);
        arr_vehiculo[2] = (JOptionPane.showInputDialog(null,"Ingrese el dominio (Patente) de su Vehiculo.","Programa de Autogestion de CFP Seguros",JOptionPane.PLAIN_MESSAGE,null,null,null)).toString(); //Ingreso de Patente
/*debug*/   System.out.println(arr_vehiculo[2]);
        int anioModelo = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el año del modelo de su Vehiculo.","Programa de Autogestion de CFP Seguros",JOptionPane.PLAIN_MESSAGE,null,null,null).toString()); //Ingreso de Año guardado como Entero
/*debug*/   System.out.println("int="+anioModelo);
        arr_vehiculo[3]=Integer.toString(anioModelo); //Conversion de la antiguedad a String
/*debug*/   System.out.println("Str="+arr_vehiculo[3]);
        return arr_vehiculo;
    }
    

    //Funcion para calcular el valor agregado de la antiguedad
    public static int func_valorAntiguedad(int int_antiguedad)  {
/*debug*/System.out.println(int_antiguedad);
        int int_valorAntiguedad = 20;
        if (int_antiguedad<=5) {
            int_valorAntiguedad = 500;
/*debug*/   System.out.println(int_valorAntiguedad);
        } else if (int_antiguedad<10) {
            int_valorAntiguedad = 1000;
/*debug*/   System.out.println(int_valorAntiguedad);
        } else if (int_antiguedad<15) {
            int_valorAntiguedad = 1500;
/*debug*/   System.out.println(int_valorAntiguedad);
        } else if (int_antiguedad<20) {
            int_valorAntiguedad = 2000;
/*debug*/   System.out.println(int_valorAntiguedad);
        }
        return int_valorAntiguedad;
    }


    //Funcion para definir el tipo de cobertura
    public static int func_tipoCobertura() {
        String[] arr_tiposCobertura = {"Responsabilidad Civil","Terceros Completo","Todo Riesgo"}; //Array de opciones de coberturas
        Object cobertura = JOptionPane.showInputDialog(null,"Seleccione el Tipo de Cobertura:","Programa de Autogestion de CFP Seguros",JOptionPane.QUESTION_MESSAGE,null, arr_tiposCobertura,arr_tiposCobertura[0]); //Ventana de seleccion de cobertura
/*debug*/  System.out.println((String)cobertura);
        int int_valorTipoCobertura = 0;
        switch ((String)cobertura) {
            case "Responsabilidad Civil" -> int_valorTipoCobertura=1000;
            case "Terceros Completo" -> int_valorTipoCobertura=2000;
            case "Todo Riesgo" -> int_valorTipoCobertura=3000;
        }
/*debug*/ System.out.println(int_valorTipoCobertura);
        return int_valorTipoCobertura;
    }
    
    
    //Funcion para Adicionales de la Cobertura
    public static String[] func_adicCobertura() {
        int int_contadorAdicionales = 0;
        String[] arr_adicElegidos = {"null","null","null","null","null","cantidad"};
        int int_masAdicionales = JOptionPane.showOptionDialog(null,"Desea agregar adicionales a su seguro?\nCada adicional tiene un valor de $300.\nPromocion: Cada 2 seleccionados, se le cobrara solamente uno.","Programa de Autogestion de CFP Seguros",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[]{"Si","No"},"Si");
/*debug*/System.out.println(int_masAdicionales);
        while (int_masAdicionales==0 & int_contadorAdicionales<=3) {
            String[] arr_adicCobertura = {"Granizo","Llantas Deportivas","Asistencia Mecanica","Localizador GPS"}; //Array de opciones de Adicionales
            Object seleccionAdicional = JOptionPane.showInputDialog(null,"Seleccione Adicionales de su auto:","Programa de Autogestion de CFP Seguros",JOptionPane.QUESTION_MESSAGE,null, arr_adicCobertura,arr_adicCobertura[0]); //Ventana de seleccion de marca
            arr_adicElegidos[int_contadorAdicionales] = (String)seleccionAdicional;
/*debug*/   System.out.println(arr_adicElegidos[int_contadorAdicionales]);
            int_contadorAdicionales+=1;
            if (int_contadorAdicionales<=3) {
                int_masAdicionales = JOptionPane.showOptionDialog(null,"Desea agregar mas adicionales a su seguro?\nCada adicional tiene un valor de $300.\nPromocion: Cada 2 seleccionados, se le cobrara solamente uno.","Programa de Autogestion de CFP Seguros",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[]{"Si","No"},"Si");
            }
        }
/*debug*/   System.out.println("Cantidad de Adicionales: "+int_contadorAdicionales);
        arr_adicElegidos[5] = Integer.toString(int_contadorAdicionales);
        return arr_adicElegidos;
    }
    
    
    //Funcion para calcular el valor de los adicionales
    public static int func_valorAdicionales(String[] arr_adicCobertura)  {
        int int_valorAdicionales = 0;
        int int_cantAdicionales = Integer.parseInt(arr_adicCobertura[5]);
/*debug*/ System.out.println(int_cantAdicionales);
        if (int_cantAdicionales!=0) {
            if (int_cantAdicionales<=2) {
                int_valorAdicionales = 300;
            } else if (int_cantAdicionales<=4) {
                int_valorAdicionales = 600;
            }
        }
/*debug*/ System.out.println(int_valorAdicionales);

        return int_valorAdicionales;
    }
    
    
    //Funcion para calcular el Precio Final
    public static int func_calcPrecio(int int_valorAntiguedad,int int_valorTipoCobertura,int int_valorAdicionales) {
        int int_precioFinal = int_valorAntiguedad+int_valorTipoCobertura+int_valorAdicionales;
/*debug*/System.out.println(int_precioFinal);
        return int_precioFinal;
    }
    
    
    //Funcion para imprimir el ticket
    public static void func_imprPoliza(String [] arr_datos,String [] arr_vehiculo,int int_antiguedad,int int_valorAntiguedad,int int_valorTipoCobertura,String [] arr_adicCobertura,int int_valorAdicionales,int int_precioFinal) {
        System.out.println("La informacion para su seguro ha sido guardada correctamente. Por favor acerquese a la sucursal mas cercana para establecer un metodo de pago.\n");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------\n----------------------------------------------------------------------------------------------------------------------------------------------\n\n");
        Random rand = new Random(); //rand.nextInt(10);
        System.out.println("\t\t\tCFP Seguros\nPóliza Nro "+rand.nextInt(100000)+":\n");
        System.out.println("Informacion del Propietario:\nNombre: "+arr_datos[0]+"\tApellido: "+arr_datos[1]+"\nTelefono: "+arr_datos[2]+"\nEmail: "+arr_datos[3]+"\n");
        System.out.println("Informacion del Vehículo:\nMarca: "+arr_vehiculo[0]+"\t\tModelo: "+arr_vehiculo[1]+"\nAño: "+arr_vehiculo[3]+"\t\tDominio: "+arr_vehiculo[2]+"\n");
        System.out.println("Informacion de Cobertura:\nTipo de Seguro: ");
        String str_tipoCobertura="Tipo";
        switch (int_valorTipoCobertura) {
            case 1000 -> { System.out.println("\t\t-Responsabilidad Civil"); str_tipoCobertura = "Responsabilidad Civil"; }
            case 2000 -> { System.out.println("\t\t-Terceros Completo"); str_tipoCobertura = "Terceros Completo"; }
            case 3000 -> { System.out.println("\t\t-Todo Riesgo"); str_tipoCobertura = "Todo Riesgo"; }
        }
        System.out.println(arr_adicCobertura[5]+" Adicionales:");
        int i=0; while (!arr_adicCobertura[i].equals("null")) { System.out.println("\t    -"+arr_adicCobertura[i]); i+=1; }
        System.out.println("\nLiquidación:");
        System.out.println("Cobertura por "+str_tipoCobertura+":\t$"+int_valorTipoCobertura);
        System.out.println(arr_adicCobertura[5]+" Adicionales:\t\t\t\t$"+int_valorAdicionales);
        System.out.println("Adicional por Antiguedad ("+int_antiguedad+")\t\t$"+int_valorAntiguedad);
        System.out.println("-------------------------------------------------");
        System.out.println("Precio Final:\t\t\t\t$"+int_precioFinal);
    }
}