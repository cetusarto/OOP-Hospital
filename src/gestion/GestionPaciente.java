/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import negocio.Paciente;

/**
 *
 * @author cesar
 */
public class GestionPaciente {

    private String ruta;
    private GestionCitas cita;

    public GestionPaciente() {
        this.ruta = "./Archivos/misPacientes.txt";
        this.verificArchivo();
        this.cita = new GestionCitas();

    }

    private void verificArchivo() {
        try {
            File filex = new File(this.ruta);
            if (!filex.exists()) {
                filex.createNewFile();
            }
        } catch (IOException xxx) {
            JOptionPane.showMessageDialog(null, "Fallo buscando ruta..!!");
        }
    }

    public boolean pruebaExistenciaCode(String codigo) {
        boolean yaEsta = false;
        FileReader file;
        BufferedReader br;
        String registro;

        try {
            file = new FileReader(this.ruta);
            br = new BufferedReader(file);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split("//");
                if ((campos[0].equals(codigo))) {
                    yaEsta = true;
                    break;
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
        }
        return yaEsta;
    }

    public void guardaPaciente(Paciente pac) {
        //guardar al eprofiante en el archivo....
        File file;
        FileWriter fr;
        PrintWriter pw;

        try {
            file = new File(this.ruta);
            fr = new FileWriter(file, true);
            pw = new PrintWriter(fr);
            pw.println(pac);
            pw.close();
            JOptionPane.showMessageDialog(null, "Operación exitosa..!!");
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo guardando en el archivo..!!");
            //System.exit(1);
        }
    }

    public void modificarPaciente(String viejoCodigo, Paciente pac) {

        ArrayList<Paciente> pacient = this.getPacientes();
        int pos = -1;
        for (Paciente test : pacient) {
            pos++;
            if (test.getIdPaciente().equals(viejoCodigo)) {
                if (this.cita.citas() == true) {
                    this.cita.modificarCitaPac(viejoCodigo, test.getIdPaciente());
                }
                pacient.set(pos, test);
                this.recargaArchivo(pacient);
                break;
            }
        }

    }

    public void eliminarPaciente(String id, int valid) {
        int dialogButton = JOptionPane.YES_NO_OPTION;

        ArrayList<Paciente> pac = this.getPacientes();
        if (valid != 2) {

            for (Paciente test : pac) {
                if (test.getIdPaciente().equals(id)) {
                    JOptionPane.showConfirmDialog(null, "¿Está seguro?", "Atento", dialogButton);
                    if (dialogButton == JOptionPane.YES_OPTION) {
                        do {
                            this.cita.eliminarCitaP(id);
                        } while (this.cita.pruebaExistenciaCitaP(id) == true);
                        pac.remove(test);
                        this.recargaArchivo(pac);
                        JOptionPane.showMessageDialog(null, "Paciente eliminado");
                    }
                }
            }
        } else {
            JOptionPane.showConfirmDialog(null, "¿Está seguro?", "Atento", dialogButton);
            if (dialogButton == JOptionPane.YES_OPTION) {
                do {
                    this.cita.eliminarCitaP(id);
                } while (this.cita.pruebaExistenciaCitaP(id) == true);
                pac.clear();
                this.recargaArchivo(pac);
                JOptionPane.showMessageDialog(null, "Especialidad eliminada");

            }
        }
    }

    public ArrayList<Paciente> getPacientes() {
        FileReader fr;
        BufferedReader br;
        Paciente prof = null;
        char l = 0;
        String registro;
        ArrayList<Paciente> paciente = new ArrayList();

        try {
            fr = new FileReader(this.ruta);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split("//");
                prof = new Paciente(campos[0], campos[1], campos[2], campos[3], campos[4], campos[5], campos[6].charAt(0));
                paciente.add(prof);
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
            //System.exit(1);
        }
        return paciente;
    }

    public void recargaArchivo(ArrayList<Paciente> pacient) {
        File file;
        FileWriter fr;
        PrintWriter pw;

        try {
            file = new File(this.ruta);
            fr = new FileWriter(file, false);
            pw = new PrintWriter(fr);
            for (Paciente test : pacient) {
                pw.println(test);
            }
            pw.close();
            JOptionPane.showMessageDialog(null, "Operación exitosa");
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo guardando en el archivo..!!");
            //System.exit(1);
        }
    }

    public Paciente buscarPaciente(String codigo) {
        FileReader fr;
        BufferedReader br;
        Paciente pac = null;
        String registro;
        try {
            fr = new FileReader(this.ruta);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split("//");
                if ((campos[0].equals(codigo))) {
                    pac = new Paciente(campos[0], campos[1], campos[2], campos[3], campos[4], campos[5], campos[6].charAt(0));
                    break;
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
            //System.exit(1);
        }

        return pac;
    }

}
