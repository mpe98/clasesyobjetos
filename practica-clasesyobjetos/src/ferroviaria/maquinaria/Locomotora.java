package ferroviaria.maquinaria;

public class Locomotora {
    //atributos(default): accesibles desde la clase vecina
    String matricula;
    int potencia;
    int añoFabricacion;
    String mecanico;

    //getters y setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public String getMecanico() {
        return mecanico;
    }

    public void setMecanico(String mecanico) {
        this.mecanico = mecanico;
    }

    //método para imprimir los datos (toString)
    public String datosLocomotora() {
        return "Locomotora" +
                "{matricula='" + this.matricula + '\'' +
                ", potencia=" + this.potencia +
                ", añoFabricacion=" + this.añoFabricacion +
                ", mecanico='" + this.mecanico + '\'' +
                '}';
    }
}
