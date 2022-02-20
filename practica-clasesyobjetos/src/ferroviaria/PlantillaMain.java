package ferroviaria;

import ferroviaria.maquinaria.Locomotora;
import ferroviaria.maquinaria.Tren;
import ferroviaria.personal.Especialidad;
import ferroviaria.personal.JefeDeEstacion;
import ferroviaria.personal.Maquinista;
import ferroviaria.personal.Mecanico;

public class PlantillaMain {
    public static void main(String[] args) {
        // Simulamos una estación: creamos objetos de diversos tipos:

        // dos maquinistas
        Maquinista maquinista1 = new Maquinista();
        maquinista1.setNombre("Pepe");
        maquinista1.setDni("11111111P");
        maquinista1.setSueldo(42_000.0);
        maquinista1.setRango(1);

        Maquinista maquinista2= new Maquinista();
        maquinista2.setNombre("Marta");
        maquinista2.setDni("22222222M");
        maquinista2.setSueldo(42_000.0);
        maquinista2.setRango(1);

        // imprimimos los datos de los dos maquinistas
        System.out.println(maquinista1.datosMaquinista() + "\n");
        System.out.println(maquinista2.datosMaquinista() + "\n");


        // un mecánico de cada especialidad
        Mecanico F = new Mecanico();
        F.setNombre("F.Frenador");
        F.setTelefono(389177612);

        Mecanico H = new Mecanico();
        H.setNombre("H.Hidráulico");
        H.setTelefono(389177612);

        Mecanico E = new Mecanico();
        E.setNombre("E.Electricista");
        E.setTelefono(123455767);

        Mecanico M = new Mecanico();
        M.setNombre("M.Motorista");
        M.setTelefono(1451254232);


        // imprimimos los datos de cada mecánico
        System.out.println(F.datosMecanico() + " especialidad= " + Especialidad.FRENOS + "}\n");
        System.out.println(H.datosMecanico() + " especialidad= " + Especialidad.HIDRAULICA + "}\n");
        System.out.println(E.datosMecanico() + " especialidad= " + Especialidad.ELECTRICIDAD + "}\n");
        System.out.println(M.datosMecanico() + " especialidad= " + Especialidad.MOTOR + "}\n");

        // Un jefe de estación
        JefeDeEstacion Boss = new JefeDeEstacion();
        Boss.setNombre("El Boss");
        Boss.setDni("22222222D");
        Boss.setFecha_nombramiento("2019-12-01");


        // Imprimimos los datos del jefe de estación
        System.out.println(Boss.datosBoss() + "\n");

        // Una locomotora
        Locomotora locomotora = new Locomotora();
        locomotora.setMatricula("M3085");
        locomotora.setPotencia(350);
        locomotora.setAñoFabricacion(2020);
        locomotora.setMecanico(F.datosMecanico()+ " especialidad= " + Especialidad.FRENOS + "}\n");

        // imprimimos los datos de la locomotora
        System.out.println("Datos de locomotora:");
        System.out.println("====================");
        System.out.println(locomotora.datosLocomotora() + "\n");

        // Creamos un tren con la locomotora que acabamos de crear
        Tren tren1 = new Tren();
        System.out.println("Datos del tren:");
        System.out.println("Tren:");
        System.out.println("locomotora=");
        System.out.println(locomotora.datosLocomotora() + " " + F.datosMecanico() + " especialidad= " +
                Especialidad.FRENOS + "}\n");

        // Añadimos 6 vagones al tren (nos dirá que el último no se puede
        System.out.println("\nAñadimos 5 vagones al tren y tratamos de añadir uno más: ");
        System.out.println("***************************");

        // Asignamos uno de los maquinistas al tren creado
        System.out.println("\n*****     Le asignamos un maquinista *****");

        // Mostramos el número de vagones del tren
        // Mostramos los datos del tren creado

        // Quitamos un vagón
        System.out.println("\n***** Quitamos un vagón *****");
        // mostramos el número de vagones del tren

        // Finalmente, contamos todos los elementos que tenemos en la estación
        System.out.println("\nMi estación se compone de");


    }
}