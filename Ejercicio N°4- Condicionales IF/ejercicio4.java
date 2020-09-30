public class ejercicio4 {
//Decodificar cada uno de los diagramas de flujos adjuntos, separando los ejercicios con comentarios.
    public static void main(String[] args) {
//  1)
        int temperatura = 27;
        if (temperatura > 25) {
            System.out.println("A la playa!!!");
        }

//  2)
        boolean haceSol = true;
        if (haceSol == true) {
            System.out.println("No te olvides la sombrilla");
        }

//  3)
        boolean nevando = true;
        if (nevando == true || haceSol == true) {
            System.out.println("Que bien!");
        }

//  4)
        temperatura = 29;
        if (nevando && temperatura >= 20 && temperatura <= 30) {
            System.out.println("No me lo creo.");
        }

//  5)
        temperatura = 32;
        if ((temperatura < 0 || temperatura > 30) && haceSol) {
            System.out.println("Mejor me quedo en casa.");
        }

//  6)
        if (temperatura > 25) {
            System.out.println("A la playa!!!");
        }

//  7)
        temperatura = 10;
        if (temperatura <= 25) {
            System.out.println("Esperando al buen tiempo...");
        }

//  8)
        if (temperatura > 25) {
            System.out.println("A la playa!!!");
        } else {
            System.out.println("Esperando al buen tiempo...");
        }


//  9)
        if (temperatura > 25) {
            System.out.println("A la playa!!!");
        } else if (temperatura > 15) {
            System.out.println("A la montaña!!!");
        } else if (temperatura < 5 && nevando) {
            System.out.println("A esquiar!!!!");
        } else {
            System.out.println("A dormir.");
        }

//  10)
        if (temperatura < 15) {
            if (temperatura < 5){
                System.out.println("A esquiar!!!");
            } else {
                System.out.println("A dormir.");
            }
        } else {
            if (temperatura > 25) {
                System.out.println("A la playa!!!");
            }
            else {
                System.out.println("A la montaña!!!");
            }
        }
    }
}
