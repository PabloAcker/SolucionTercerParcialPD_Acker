package ej1;

import java.util.Random;

public class GasolinaEspecial implements IAutomovil{
    private int capacidad;
    public GasolinaEspecial() {
        capacidad = 0;
    }
    @Override
    public void llenarGasolina() {
        System.out.println("Cargando Gasolina especial");
        capacidad = new Random().nextInt(100);
        System.out.println("Capacidad: " + capacidad);
        System.out.println();
    }

    @Override
    public int estadoCombustible() {
        System.out.println("Mostrando estado actual del combustible...");
        int estado = new Random().nextInt(99)+1;
        System.out.println("Estado: " + estado);
        System.out.println("==============================================================");
        return estado;
    }
}
