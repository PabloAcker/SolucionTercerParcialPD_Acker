package ej1;

public class AutomovilElectrico implements IAutomovil{
    private Automovil automovil;

    public AutomovilElectrico(Automovil automovil) {
        this.automovil = automovil;
    }

    @Override
    public void llenarGasolina() {
        automovil.cargar();
    }

    @Override
    public int estadoCombustible() {
        return automovil.estadoDeElectricidad();
    }
}
