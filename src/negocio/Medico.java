/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author cesar
 */
public class Medico {

    private String idMed;
    private String idSpec;
    private String nombres;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private String foto;
    private String password;

    public Medico() {
        this.idMed = "";
        this.idSpec = "";
        this.nombres = "";
        this.apellido1 = "";
        this.apellido2 = "";
        this.telefono = "";
        this.foto = "";
        this.password = "";
    }

    public Medico(String idMed, String idSpec, String nombres, String apellido1, String apellido2, String telefono, String foto, String password) {
        this.idMed = idMed;
        this.idSpec = idSpec;
        this.nombres = nombres;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefono = telefono;
        this.foto = foto;
        this.password = password;
    }

    public String getIdMed() {
        return idMed;
    }

    public void setIdMed(String idMed) {
        this.idMed = idMed;
    }

    public String getIdSpec() {
        return idSpec;
    }

    public void setIdSpec(String idSpec) {
        this.idSpec = idSpec;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return this.idMed + "," + this.idSpec + "," + this.nombres + "," + this.apellido1 + "," + this.apellido2 + "," + this.telefono + "," + this.foto + "," + this.password ;
    }
    

}
