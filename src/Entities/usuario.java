/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author Chris
 */
public class Usuario {
    
    private String correo;
    private String password;
    private int role;
    private String id_perfil;

    public Usuario(String correo, String password, int role, String id_perfil) {
        this.correo = correo;
        this.password = password;
        this.role = role;
        this.id_perfil = id_perfil;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getId_perfil() {
        return id_perfil;
    }

    public void setId_perfil(String id_perfil) {
        this.id_perfil = id_perfil;
    }
    
    
    
    
    
    
    
    
}
