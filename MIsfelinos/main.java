package MIsfelinos;

import java.util.Scanner;

public class main {


    public static boolean buscarRaza(gato gatos[], String razaBuscada) {
        for (int i = 0; i < gatos.length; i++) {
            if (gatos[i].getRazas().equalsIgnoreCase(razaBuscada)) {
                System.out.println("La raza '" + razaBuscada + "' se encuentra en la posición " + (i + 1) + ".");
                return true;
            }
        }
        return false;
    }

    public static String raza_gato(caracteristica3 gatos[]){
        String razas_gatos;
        String color_gatos;
        double peso_gatos;
        int indice=0;

        razas_gatos = gatos[0].getRazas();
        color_gatos = gatos[0].getColor();
        peso_gatos = gatos[0].getPeso();

        for (int i=0;i< gatos.length;i++){
            System.out.println("La raza del gato "+(i+1)+" es: " + gatos[i].getRazas());
            System.out.println("Su color es: " +gatos[i].getColor());
            System.out.println("Su peso es: "+gatos[i].getPeso());
            System.out.println();
            System.out.println();


        }

        return razas_gatos;
    }



    public static void main(String[] args) {
        String raza, razas_ga;
        String color;
        double peso;
        Scanner entrada = new Scanner(System.in);

        caracteristica3 gatos[] =  new caracteristica3[5];
        for (int i=0; i < gatos.length; i++){
            System.out.println("Ingrese la raza del gato "+(i+1) +":");
            raza = entrada.nextLine();
            System.out.println("Ingrese el color: ");
            color = entrada.nextLine();
            System.out.println("Ingrese su peso: ");
            peso = entrada.nextDouble();


            gatos[i]= new caracteristica3(raza,color,peso);
            entrada.nextLine();
        }

        razas_ga = raza_gato(gatos);
        System.out.println("Ingrese la raza que desea buscar:");
        String razaBuscada = entrada.nextLine();

        if (buscarRaza(gatos, razaBuscada)) {
            System.out.println("La raza '" + razaBuscada + "' se encuentra en el arreglo.");
        } else {
            System.out.println("La raza '" + razaBuscada + "' no se encuentra en el arreglo.");
        }









    }


}

