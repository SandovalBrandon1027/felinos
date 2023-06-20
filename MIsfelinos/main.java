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

    public static String raza_gato(gato gatos[]){
        String razas_gatos;
        int indice=0;

        razas_gatos = gatos[0].getRazas();

        for (int i=0;i< gatos.length;i++){
            System.out.println("La raza del gato "+(i+1)+" es: " + gatos[i].getRazas());
        }

        return razas_gatos;
    }

    public static void main(String[] args) {
        String raza, razas_ga;
        Scanner entrada = new Scanner(System.in);

        gato gatos[] = new gato[5];
        for (int i=0; i < gatos.length; i++){
            System.out.println("Ingrese la raza del gato "+(i+1) +":");
            raza = entrada.nextLine();
            gatos[i]= new gato(raza);
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

