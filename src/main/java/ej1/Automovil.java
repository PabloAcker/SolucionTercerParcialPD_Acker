package ej1;

import java.util.Random;

public class Automovil implements IElectricos{
    private int bateria;

    public Automovil() {
        bateria = 0;
    }

    @Override
    public void cargar() {
        System.out.println("Cargando la bateria");
        Random random = new Random();
        int max = 100;
        int min = 0;
        int rango = (max - min) / 2;
        int bateria = random.nextInt(rango)*2;
        System.out.println("Capacidad: " + bateria);
        System.out.println();
    }

    @Override
    public int estadoDeElectricidad() {
        System.out.println("Mostrando estado actual de la bateria...");
        int estado = new Random().nextInt(9)+1;
        System.out.println("Estado: " + estado);
        System.out.println("==============================================================");
        return estado;
    }
}
