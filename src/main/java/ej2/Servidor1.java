package ej2;

import java.util.ArrayList;
import java.util.List;

public class Servidor1 implements IServidor{
    private List<Usuario> usuarioList;

    public Servidor1() {
        usuarioList = new ArrayList<>();
    }
    @Override
    public void userLogin(Usuario usuario, String userName, String psw) {
        usuarioList.add(usuario);
    }

    @Override
    public void atenderUsuarios() {
        for (Usuario usuario:usuarioList){
            System.out.println("Añadiendo al nuevo usuario...\nSe lo añadió al Servidor 1");
            usuario.showInfo();
        }
    }
}
