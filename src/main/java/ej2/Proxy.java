package ej2;

import java.util.ArrayList;
import java.util.List;

public class Proxy implements IServidor{
    private IServidor servidor1;
    private IServidor servidor2;
    private List<Usuario> usuariosList;

    public Proxy() {
        System.out.println("\t\tIniciando servidores...\n");
        usuariosList = new ArrayList<>();
        this.servidor1 = new Servidor1();
        this.servidor2 = new Servidor2();
    }
    public void addUsers(Usuario usuario){
        usuariosList.add(usuario);
    }

    @Override
    public void userLogin(Usuario usuario, String userName, String psw) {
        System.out.println("Autenticando el nuevo usuario...");
        if (userName.equals(usuario.getUserName()) && psw.equals(usuario.getPsw())){
            if (esPrimo(usuario.getId())){
                servidor1.userLogin(usuario, userName, psw);
            } else {
                servidor2.userLogin(usuario, userName, psw);
            }
        } else {
            System.out.println("Constraseña y/o username inválidos!!!");
            System.out.println("=================================================");
        }
    }

    @Override
    public void atenderUsuarios() {
        servidor1.atenderUsuarios();
        servidor2.atenderUsuarios();
    }
    public boolean esPrimo(int id){
        if (id == 0 || id == 1 || id == 4) {
            return false;
        }
        for (int i = 2; i < id /2; i++){
            if (id % i == 0){
                return false;
            }
        }
        return true;
    }
}
