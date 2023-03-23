package ej1;

public class Main {
    public static void main(String[] args) {
        IAutomovil autoGaso = new Gasolina();
        autoGaso.llenarGasolina();
        autoGaso.estadoCombustible();

        IAutomovil autoGasoEspecial = new GasolinaEspecial();
        autoGasoEspecial.llenarGasolina();
        autoGasoEspecial.estadoCombustible();

        IAutomovil autoDiesel = new Diesel();
        autoDiesel.llenarGasolina();
        autoDiesel.estadoCombustible();

        IAutomovil autoElectrico = new AutomovilElectrico(new Automovil());
        autoElectrico.llenarGasolina();
        autoElectrico.estadoCombustible();
    }
}
