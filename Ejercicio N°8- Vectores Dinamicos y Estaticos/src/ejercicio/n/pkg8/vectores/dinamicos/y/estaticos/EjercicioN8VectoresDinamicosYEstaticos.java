package ejercicio.n.pkg8.vectores.dinamicos.y.estaticos;

public class EjercicioN8VectoresDinamicosYEstaticos {

    public static void main(String[] args) {
        String Nombre[] = new String [5];
        int Edad[] = new int[5];
        String Sexo [] = new String[5];
        
        Nombre[0] = "Alvaro Toledo"; Edad[0] = 29; Sexo[0] ="Masculino";
        Nombre[1] = "Ignacio Camilucci"; Edad[1] = 28; Sexo[1] ="Masculino";
        Nombre[2] = "Juan C Falabrino"; Edad[2] = 28; Sexo[2] ="Masculino";
        Nombre[3] = "Rosario Arana"; Edad[3] = 24; Sexo[3] ="Femenino";
        Nombre[4] = "Margarita Soler"; Edad[4] = 21; Sexo[4] ="Femenino";
        
        for (int i=0;i<Edad.length;i+=1){
            System.out.println("Usuario "+(i+1)+":\n\tNombre: "+Nombre[i]+"\n\tEdad: "+Edad[i]+"\n\tSexo: "+Sexo[i]);
        }
    }
}