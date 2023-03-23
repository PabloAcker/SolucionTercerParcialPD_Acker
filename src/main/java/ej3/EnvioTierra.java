package ej3;

public class EnvioTierra implements IEnvio{
    @Override
    public void envioPaquete(IEmpresa empresa) {
        //incrementa 5%
        System.out.println("Envio realizado por Tierra>>>");
        System.out.println("\tSe le incrementa un 5%:");
        empresa.setPrecio(empresa.getPrecio() + empresa.getPrecio()*5/100);
        System.out.println("Nuevo precio actualizado: " + empresa.getPrecio() + "Bs");
        System.out.println("====================================================");
    }
}
