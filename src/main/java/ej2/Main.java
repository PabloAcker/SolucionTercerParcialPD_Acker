package ej2;

public class Main {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();

        //Probando 3 uduarios, los 2 primeros validos, el ultimo con contrasenia invalida
        Usuario user1 = new Usuario("Eynar", 17, "ContraseniaComun");
        Usuario user2 = new Usuario("Mateo", 18, "soyElMateo123");
        Usuario user3 = new Usuario("Anuel", 23, "random1234");

        proxy.addUsers(user1);
        proxy.addUsers(user2);
        proxy.addUsers(user3);

        proxy.userLogin(user1, "Eynar", "ContraseniaComun");
        proxy.userLogin(user2, "Mateo", "soyElMateo123");
        proxy.userLogin(user3, "Anuel", "otraContrasenia");

        proxy.atenderUsuarios();
    }
}
