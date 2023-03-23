package ej2;

public class Usuario {
    //( id,nombre, pwd)
    private String userName;
    private int id;
    private String psw;

    public Usuario(String userName, int id, String psw) {
        this.userName = userName;
        this.id = id;
        this.psw = psw;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }
    public void showInfo(){
        System.out.println("Mostrando informacion del usuario>>>>>");
        System.out.println("UserName: " + getUserName());
        System.out.println("ID: " + getId());
        System.out.println("===================================================");
    }
}
