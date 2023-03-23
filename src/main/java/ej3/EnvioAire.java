package ej3;

public class EnvioAire implements IEnvio{
    @Override
    public void envioPaquete(IEmpresa empresa) {
        //incrementa 10%
        System.out.println("Envio realizado por Aire>>>");
        System.out.println("\tSe le incrementa un 10%:");
        empresa.getPrecio() + empresa.getPrecio() * 10 / 100;
        System.out.println("Nuevo precio actualizado: " + empresa.getPrecio() + "Bs");
        System.out.println("====================================================");
    }
}
