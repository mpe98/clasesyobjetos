package ferroviaria.personal;

public class Mecanico {

    ////atributos: solo se pueden ver desde la misma clase
    private String nombre;
    private int telefono;

    //getters y setters recuperar y cambiar los valores que tomen en los objetos.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


    //método para imprimir (toString)
    public String datosMecanico() {
        return "Datos del mecánico " + this.nombre + ": \n" +
                "Mecánico{" +
                "nombre='" + this.nombre + '\'' +
                ", teléfono=" + this.telefono;
    }
}
