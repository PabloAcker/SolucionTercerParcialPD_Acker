package ej3;

public class EnvioMar implements IEnvio{
    @Override
    public void envioPaquete(IEmpresa empresa) {
        //incrementa 25%
        System.out.println("Envio realizado por Mar>>>");
        System.out.println("\tSe le incrementa un 25%:");
        empresa.setPrecio(empresa.getPrecio() + empresa.getPrecio()*25/100);
        System.out.println("Nuevo precio actualizado: " + empresa.getPrecio() + "Bs");
        System.out.println("====================================================");
    }
}
