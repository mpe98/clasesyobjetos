package ferroviaria.personal;

public class JefeDeEstacion {

    //atributos: solo se pueden ver desde la misma clase
    private String nombre;
    private String dni;
    private String fecha_nombramiento;

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

    public String getFecha_nombramiento() {
        return fecha_nombramiento;
    }

    public void setFecha_nombramiento(String fecha_nombramiento) {
        this.fecha_nombramiento = fecha_nombramiento;
    }

    //metodo para imprimir (toString)
    public String datosBoss() {
        return "Datos del jefe de estación:\n" +
                "JefeDeEstacion" + "{nombre='" + this.nombre + '\'' +
                ", dni=" + this.dni +
                ", fecha_nombramiento='" + this.fecha_nombramiento + '\'' +
                '}';
    }
}