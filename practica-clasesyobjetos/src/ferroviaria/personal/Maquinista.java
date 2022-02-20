package ferroviaria.personal;

public class Maquinista {

    ////atributos: solo se pueden ver desde la misma clase
    private String nombre;
    private String dni;
    private double sueldo;
    private int rango;

    //getters y setters recuperar y cambiar los valores que tomen en los objetos.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getRango() {
        return rango;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }

    //metodo para imprimir (toString)

    public String datosMaquinista() {
        return "Datos del maquinista " + this.nombre + ": \n" +
                "Maquinista{" +
                "nombre='" + this.nombre + '\'' +
                ", DNI='" + this.dni + '\'' +
                ", sueldo=" + this.sueldo +
                ", rango=" + this.rango +
                '}';
    }
}
