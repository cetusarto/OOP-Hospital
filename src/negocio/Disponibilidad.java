package negocio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cesar
 */
public class Disponibilidad {

    private String idMedico;
    private String dia;
    private String hora1;
    private String hora2;

    public Disponibilidad() {
        this.idMedico = "";
        this.dia = "";
        this.hora1 = "";
        this.hora2 = "";
    }

    public Disponibilidad(String idMedico, String dia, String hora1, String hora2) {
        this.idMedico = idMedico;
        this.dia = dia;
        this.hora1 = hora1;
        this.hora2 = hora2;
    }

    public String getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(String idmedico) {
        this.idMedico = idmedico;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora1() {
        return hora1;
    }

    public void setHora1(String hora1) {
        this.hora1 = hora1;
    }

    public String getHora2() {
        return hora2;
    }

    public void setHora2(String hora2) {
        this.hora2 = hora2;
    }

    @Override
    public String toString() {
        return this.idMedico + "," + this.dia + "," + this.hora1 + "," + this.hora2;
    }

}
