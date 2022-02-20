package ferroviaria.maquinaria;

class Vagon {
    //atributos(default): accesibles desde la clase vecina
    int id;
    int cargaMaxima;
    int cargaActual;
    String mercancia;

    //getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public int getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(int cargaActual) {
        this.cargaActual = cargaActual;
    }

    public String getMercancia() {
        return mercancia;
    }

    public void setMercancia(String mercancia) {
        this.mercancia = mercancia;
    }

    //metodo para imprimir datos (toString)
    public String datosVagon() {
        return "Vagon{" +
                "id=" + this.id +
                ", cargaMaxima=" + this.cargaMaxima +
                ", cargaActual=" + this.cargaActual +
                ", mercancia='" + this.mercancia + '\'' +
                '}';
    }

    //metodo que cuenta los objetos
    public int contarVagones(int id) {
        int contador = 0;
        for (int i = 0; i < id; i++) {
            contador++;
        }

        return contador;
    }
}
