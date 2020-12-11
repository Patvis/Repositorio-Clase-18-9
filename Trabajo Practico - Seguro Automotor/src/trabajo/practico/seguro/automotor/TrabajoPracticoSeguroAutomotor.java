package trabajo.practico.seguro.automotor;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.util.Random;
import javax.swing.*;

public class TrabajoPracticoSeguroAutomotor {

    //Funcion Main
    public static void main(String[] args) {
        //Pantalla Inicial
        ImageIcon icon = new  ImageIcon("src/Images/Logo.png"); //Creacion de objeto del Logo
        int confirmar = JOptionPane.showOptionDialog(null,"Bienvenido al Programa de\nAutogestion CFP Seguros","Programa de Autogestion de CFP Seguros",JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,icon,new String[]{"Continuar","Salir"},"default");  //Ventana de Ingresar o Salir
        if (confirmar == JOptionPane.NO_OPTION) {
            System.exit(0); //Salir del Programa si se selecciona la opcion de salir
        }
        //Ingreso de datos
        String [] arr_datos = func_datosCliente(); //Creacion de Array de datos y llamado a funcion de Llenarlos
        String [] arr_vehiculo = func_elegirVehiculo(); //Creacion de Array de Vehículo y llamado a funcion de elegirlo
        int int_antiguedad = 2020-(Integer.parseInt(arr_vehiculo[3])); //Creacion de variable antiguedad en numero entero y asignacion en base al año actual (2020)
        int int_valorAntiguedad = func_valorAntiguedad(int_antiguedad); //Creacion de variable del valor por antiguedad y llamado a funcion para calcularla
        int int_valorTipoCobertura = func_tipoCobertura(); //Creacion de variable de monto de Cobertura y llamado a funcion de elegirlo y calcularlo
        String [] arr_adicCobertura = func_adicCobertura(); //Creacion de Array de adicionales de cobertura y llamado a funcion a elegirlas
        int int_valorAdicionales = func_valorAdicionales(arr_adicCobertura); //Creacion de variable del valor por adicionales y llamado a funcion para calcularlo
        int int_precioFinal = func_calcPrecio(int_valorAntiguedad,int_valorTipoCobertura,int_valorAdicionales); //Creacion de variable del valor final y llamado a funcion para calcularlo
        
        //Devolucion de datos
        func_imprPoliza(arr_datos,arr_vehiculo,int_antiguedad,int_valorAntiguedad,int_valorTipoCobertura,arr_adicCobertura,int_valorAdicionales,int_precioFinal); //Llamado a funcion para imprimir la Poliza
    }


    //Funcion para llenar los datos de cliente
    public static String[] func_datosCliente() {
        JTextField Input1=new JTextField(), Input2=new JTextField(), Input3=new JTextField(), Input4=new JTextField(); //Definir Campos a Completar
        String[] arr_datos = new String[] {"a","a","1","@"}; //Array donde se guardan los datos
        Object[] message = {"Bienvenido a CFP Seguros!\nPor favor ingrese sus datos a continuacion,\nluego presione el boton OK.","Nombre:", Input1, "Apellido:", Input2, "Telefono:", Input3, "Email:", Input4}; //Creacion de Campos para la ventana de Informacion de Usuario
        int opcion = JOptionPane.showConfirmDialog(null, message, "Programa de Autogestion de CFP Seguros", JOptionPane.OK_CANCEL_OPTION); //Ventana de Ingreso de datos
        if (opcion == JOptionPane.OK_OPTION) {
            arr_datos[0] = Input1.getText(); //Asignacion de dato Nombre al Array de datos
            arr_datos[1] = Input2.getText(); //Asignacion de dato Apellido al Array de datos
            arr_datos[2] = Input3.getText(); //Asignacion de dato Telefono al Array de datos
            arr_datos[3] = Input4.getText(); //Asignacion de dato Email al Array de datos
        }
        return arr_datos; //Devolver el Array de datos
    }
 
    
    //Funcion para elegir el vehiculo y calcular el precio
    public static String[] func_elegirVehiculo() {
        String[] arr_vehiculo = new String[] {"Marca","Modelo","Dominio","Antiguedad"};  //Array donde se guardan los datos del vehiculo
        String[] arr_opcionesMarcas = {"Chevrolet","Citroen","Fiat","Ford","Honda","Nissan","Peugeot","Renault","Toyota","Volkswagen","Otro"}; //Array de opciones de marcas
        Object marca = JOptionPane.showInputDialog(null,"Seleccione la Marca de su auto:","Programa de Autogestion de CFP Seguros",JOptionPane.QUESTION_MESSAGE,null, arr_opcionesMarcas,arr_opcionesMarcas[0]); //Ventana de seleccion de marca
        arr_vehiculo[0] = (String)marca; //Almacenar la Marca en su posicion del Array de Vehiculo
        if (marca.equals("Otro")) { //Ingreso de Marca=Otro y modelo por teclado
            arr_vehiculo[0] = (JOptionPane.showInputDialog(null,"Especifique la marca de su Vehiculo.","Programa de Autogestion de CFP Seguros",JOptionPane.PLAIN_MESSAGE,null,null,null)).toString();
            arr_vehiculo[1] = (JOptionPane.showInputDialog(null,"Ingrese el modelo de su Vehiculo.","Programa de Autogestion de CFP Seguros",JOptionPane.PLAIN_MESSAGE,null,null,null)).toString();
        } else { //Ingreso de modelo por teclado
            arr_vehiculo[1] = (JOptionPane.showInputDialog(null,"Ingrese el modelo de su Vehiculo.","Programa de Autogestion de CFP Seguros",JOptionPane.PLAIN_MESSAGE,null,null,null)).toString();
        }
        arr_vehiculo[2] = (JOptionPane.showInputDialog(null,"Ingrese el dominio (Patente) de su Vehiculo.","Programa de Autogestion de CFP Seguros",JOptionPane.PLAIN_MESSAGE,null,null,null)).toString(); //Ingreso de Patente
        int anioModelo = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el año del modelo de su Vehiculo.","Programa de Autogestion de CFP Seguros",JOptionPane.PLAIN_MESSAGE,null,null,null).toString()); //Ingreso de Año guardado como Entero
        arr_vehiculo[3]=Integer.toString(anioModelo); //Conversion de la antiguedad a String
        return arr_vehiculo;
    }
    

    //Funcion para calcular el valor agregado de la antiguedad
    public static int func_valorAntiguedad(int int_antiguedad)  {
        int int_valorAntiguedad = 0; //Variable entera donde se guarda el valor de la antiguedad, inicializada en 0
        if (int_antiguedad<0) { //Ventana de año invalido (Negativo)
            JOptionPane.showMessageDialog(null,"El año de su vehículo no es valido!","Programa de Autogestion de CFP Seguros",JOptionPane.WARNING_MESSAGE);
            System.exit(int_valorAntiguedad);
        } else if (int_antiguedad<=5) { //Asignacion de valor por antiguedad
            int_valorAntiguedad = 500;
        } else if (int_antiguedad<10) { //Asignacion de valor por antiguedad
            int_valorAntiguedad = 1000;
        } else if (int_antiguedad<15) { //Asignacion de valor por antiguedad
            int_valorAntiguedad = 1500;
        } else if (int_antiguedad<=20) { //Asignacion de valor por antiguedad
            int_valorAntiguedad = 2000;
        } else if (int_antiguedad>20) { //Ventana de año invalido (Mayor a 20 años de antiguedad)
            JOptionPane.showMessageDialog(null,"Su auto posee mas antiguedad que el maximo asegurado por CFP seguros.\nAntiguedad: "+int_antiguedad+" años\nAntiguedad maxima permitida: 20 años.","Programa de Autogestion de CFP Seguros",JOptionPane.WARNING_MESSAGE);
            System.exit(int_valorAntiguedad);
        }
        return int_valorAntiguedad; //Devolver el Valor de Antiguedad
    }


    //Funcion para definir el tipo de cobertura
    public static int func_tipoCobertura() {
        String[] arr_tiposCobertura = {"Responsabilidad Civil","Terceros Completo","Todo Riesgo"}; //Array de opciones de coberturas
        Object cobertura = JOptionPane.showInputDialog(null,"Seleccione el Tipo de Cobertura:","Programa de Autogestion de CFP Seguros",JOptionPane.QUESTION_MESSAGE,null, arr_tiposCobertura,arr_tiposCobertura[0]); //Ventana de seleccion de cobertura
        int int_valorTipoCobertura = 0; //Creacion de variable para el valor de la cobertura
        switch ((String)cobertura) { //Asignacion de valor de cobertura en base a la opcion seleccionada
            case "Responsabilidad Civil" -> int_valorTipoCobertura=1000;
            case "Terceros Completo" -> int_valorTipoCobertura=2000;
            case "Todo Riesgo" -> int_valorTipoCobertura=3000;
        }
        return int_valorTipoCobertura; //Devolver el valor del tipo de cobertura (Como se puede devolver solo un tipo de dato sin crear una clase, se manda el valor de la cobertura, y a la hora de imprimir el tipo de cobertura se hace en base a este numero)
    }
    
    
    //Funcion para Adicionales de la Cobertura
    public static String[] func_adicCobertura() {
        int int_contadorAdicionales = 0; //Creacion de variable para contar los adicionales
        String[] arr_adicElegidos = {"null","null","null","null","null","cantidad"}; //Creacion de Array para almacenar los adicionales elegidos. Las posiciones estan en "null" (Y hay una de mas) para frenar el bucle a la hora de imprimir los nombres de la cantidad seleccionada
        int int_masAdicionales = JOptionPane.showOptionDialog(null,"Desea agregar adicionales a su seguro?\nCada adicional tiene un valor de $300.\nPromocion: Cada 2 seleccionados, se le cobrara solamente uno.","Programa de Autogestion de CFP Seguros",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[]{"Si","No"},"Si"); //Ventana para preguntar si desea agregar extras
        while (int_masAdicionales==0 & int_contadorAdicionales<=3) { //Este bucle se ejecutara mientras se seleccione "Si" en la ventana anterior, y hayan 4 o menos adicionales
            String[] arr_adicCobertura = {"Granizo","Llantas Deportivas","Asistencia Mecanica","Localizador GPS"}; //Array de opciones de Adicionales
            Object seleccionAdicional = JOptionPane.showInputDialog(null,"Seleccione Adicionales de su auto:","Programa de Autogestion de CFP Seguros",JOptionPane.QUESTION_MESSAGE,null, arr_adicCobertura,arr_adicCobertura[0]); //Ventana de seleccion de Adicional
            arr_adicElegidos[int_contadorAdicionales] = (String)seleccionAdicional; //Asignar el adicional elegido al Array de adicionales elegidos, en la posicion del contador actual
            int_contadorAdicionales+=1; //Sumar 1 al contador de adicionales
            if (int_contadorAdicionales<=3) { //Verificar si hay menos de 4 adicionales para preguntar si desea agregar uno mas
                int_masAdicionales = JOptionPane.showOptionDialog(null,"Desea agregar mas adicionales a su seguro?\nCada adicional tiene un valor de $300.\nPromocion: Cada 2 seleccionados, se le cobrara solamente uno.","Programa de Autogestion de CFP Seguros",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[]{"Si","No"},"Si"); //Ventana para preguntar si desea agregar mas extras
            }
        }
        arr_adicElegidos[5] = Integer.toString(int_contadorAdicionales); //Almacenar la cantidad de adicionales en la ultima posicion de los adicionales elegidos
        return arr_adicElegidos; //Devolver el array de los adicionales elegidos
    }
    
    
    //Funcion para calcular el valor de los adicionales
    public static int func_valorAdicionales(String[] arr_adicCobertura)  {
        int int_valorAdicionales = 0; //Creacion de variable para la suma del valor de los adicionales
        int int_cantAdicionales = Integer.parseInt(arr_adicCobertura[5]); //Creacion de variable entera de cantidad de adicionales y asignacion en base a la ultima posicion del Array de adicionales
        if (int_cantAdicionales!=0) { //Este bucle se ejecuta si hay al menos 1 adicional
            if (int_cantAdicionales<=2) {
                int_valorAdicionales = 300; //Si hay 1 o 2 adicionales el valor es de 300
            } else if (int_cantAdicionales<=4) {
                int_valorAdicionales = 600; //Si hay 1 o 2 adicionales el valor es de 300
            }
        }
        return int_valorAdicionales; //Devolver la suma del valor de los adicionales
    }
    
    
    //Funcion para calcular el Precio Final
    public static int func_calcPrecio(int int_valorAntiguedad,int int_valorTipoCobertura,int int_valorAdicionales) {
        int int_precioFinal = int_valorAntiguedad+int_valorTipoCobertura+int_valorAdicionales; //Creacion de variable del precio final y asignacion en base a suma de todos los valores
        return int_precioFinal; //Devolver el precio final
    }
    
    
    //Funcion para imprimir el ticket
    public static void func_imprPoliza(String [] arr_datos,String [] arr_vehiculo,int int_antiguedad,int int_valorAntiguedad,int int_valorTipoCobertura,String [] arr_adicCobertura,int int_valorAdicionales,int int_precioFinal) {
        //Intro
        System.out.println("La informacion para su seguro ha sido guardada correctamente. Por favor acerquese a la sucursal mas cercana para establecer un metodo de pago.\n");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------\n----------------------------------------------------------------------------------------------------------------------------------------------\n\n");
        Random rand = new Random(); //rand.nextInt(10);
        System.out.println("\t\t\tCFP Seguros\nPóliza Nro "+rand.nextInt(100000)+":\n"); //Asignacion de numero de poliza random entre 0 y 99999
        System.out.println("Informacion del Propietario:\nNombre: "+arr_datos[0]+"\tApellido: "+arr_datos[1]+"\nTelefono: "+arr_datos[2]+"\nEmail: "+arr_datos[3]+"\n"); //Info Propietario
        System.out.println("Informacion del Vehículo:\nMarca: "+arr_vehiculo[0]+"\t\tModelo: "+arr_vehiculo[1]+"\nAño: "+arr_vehiculo[3]+"\t\tDominio: "+arr_vehiculo[2]+"\n"); //Info Vehiculo
        //Info Cobertura
        System.out.print("Informacion de Cobertura:\nTipo de Seguro: ");
        String str_tipoCobertura="Tipo";
        switch (int_valorTipoCobertura) {
            case 1000 -> { System.out.println("-Responsabilidad Civil"); str_tipoCobertura="Responsabilidad Civil"; }
            case 2000 -> { System.out.println("-Terceros Completo"); str_tipoCobertura="Terceros Completo"; }
            case 3000 -> { System.out.println("-Todo Riesgo"); str_tipoCobertura="Todo Riesgo"; }
        }
        System.out.println(arr_adicCobertura[5]+" Adicionales:");
        int i=0; while (!arr_adicCobertura[i].equals("null")) { System.out.println("\t    -"+arr_adicCobertura[i]); i+=1; }
        //Info Liquidacion
        System.out.println("\nLiquidación:");
        System.out.println("Cobertura por "+str_tipoCobertura+":\t$"+int_valorTipoCobertura);
        System.out.println(arr_adicCobertura[5]+" Adicionales:\t\t\t\t$"+int_valorAdicionales);
        System.out.println("Adicional por Antiguedad: "+int_antiguedad+" año(s)\t$"+int_valorAntiguedad);
        System.out.println("-------------------------------------------------");
        System.out.println("Precio Final:\t\t\t\t$"+int_precioFinal);
    }
}