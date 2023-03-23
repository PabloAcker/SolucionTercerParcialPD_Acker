package ej3;

public class EmpresaSRL implements IEmpresa{
    private int precio;
    private String nombrePaquete;
    private String peso;
    private IEnvio envio;

    public EmpresaSRL(int precio, String nombrePaquete, String peso, IEnvio envio) {
        this.precio = precio;
        this.nombrePaquete = nombrePaquete;
        this.peso = peso;
        this.envio = envio;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public IEnvio getEnvio() {
        return envio;
    }
    public void setEnvio(IEnvio envio) {
        this.envio = envio;
    }

    public String getNombrePaquete() {
        return nombrePaquete;
    }

    public void setNombrePaquete(String nombrePaquete) {
        this.nombrePaquete = nombrePaquete;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
    @Override
    public void envioPaquete(){
        System.out.println("Enviando un paquete con la Empresa SRL...");
        System.out.println("Precio: " +getPrecio());
        System.out.println("Nombre del paquete: " +getNombrePaquete());
        System.out.println("Peso: " + getPeso());
        this.envio.envioPaquete(this);
    }
}
