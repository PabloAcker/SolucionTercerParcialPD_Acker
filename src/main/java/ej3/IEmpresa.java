package ej3;

public interface IEmpresa {
    int getPrecio();
    void setPrecio(int precio);
    IEnvio getEnvio();
    void setEnvio(IEnvio envio);
    void envioPaquete();
}
