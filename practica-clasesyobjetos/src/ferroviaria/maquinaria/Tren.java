package ferroviaria.maquinaria;

import java.util.Scanner;

public class Tren {
    //atributos(default): accesibles desde la clase vecina
    int vagones;
    String maquinista;

    //getters y setters
    public int getVagones() {
        return vagones;
    }

    public void setVagones(int vagones) {
        this.vagones = vagones;
    }

    public String getMaquinista() {
        return maquinista;
    }

    public void setMaquinista(String maquinista) {
        this.maquinista = maquinista;
    }

    //método para imprimir (toString)
    public String datosTren() {
        return "Tren{" +
                "vagones=" + this.vagones +
                ", maquinista='" + this.maquinista + '\'' +
                '}';
    }



    //metodo añadirVagon()
    public void añadirVagon() {
        for (int i = 0; i < vagones; i++) {
            if (vagones > 5) {
                System.out.println("No se puede añadir ningún vagón más.");
            } else {
                //creacion de un vagon mediante una nueva instancia
                Vagon otrovagon = new Vagon();
                Scanner sc = new Scanner(System.in);
                System.out.println("¿Cuál es la carga máxima?");
                int cargaMaxima = sc.nextInt();
                System.out.println("¿Cuál es la mercancia?");
                String mercancia = sc.nextLine();
            }
        }
    }
}
