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
public class Paciente {

    private String idPaciente;
    private String nombres;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private String nacimiento;
    private char sexo;

    public Paciente() {
        this.idPaciente = "";
        this.nombres = "";
        this.apellido1 = "";
        this.apellido2 = "";
        this.telefono = "";
        this.nacimiento = "";
        this.sexo = 0;
    }

    public Paciente(String idPaciente, String nombres, String apellido1, String apellido2, String telefono, String nacimiento, char sexo) {
        this.idPaciente = idPaciente;
        this.nombres = nombres;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefono = telefono;
        this.nacimiento = nacimiento;
        this.sexo = sexo;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
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

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return this.idPaciente + "//" + this.nombres + "//" + this.apellido1 + "//" + this.apellido2 + "//" + this.telefono + "//" + this.nacimiento + "//" + this.sexo;
    }

}
