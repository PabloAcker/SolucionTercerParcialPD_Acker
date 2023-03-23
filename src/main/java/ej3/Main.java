package ej3;

public class Main {
    public static void main(String[] args) {
        IEmpresa empresa1 = new EmpresaSA(40, "Mercaderia", "80kg", new EnvioAire());
        empresa1.envioPaquete();

        IEmpresa empresa2 = new EmpresaSRL(80, "Proteina", "60kg", new EnvioTierra());
        empresa2.envioPaquete();

        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");

        empresa1.setEnvio(new EnvioMar());
        empresa2.setEnvio(new EnvioAire());

        empresa1.envioPaquete();
        empresa2.envioPaquete();
    }
}
