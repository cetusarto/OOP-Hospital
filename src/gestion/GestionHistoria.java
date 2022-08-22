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
import negocio.Especialidad;
import negocio.Historia;
import negocio.Paciente;

/**
 *
 * @author cesar
 */
public class GestionHistoria {

    private String ruta;

    public GestionHistoria() {
        this.ruta = "./Archivos/misHistorias.txt";
        this.verificaArchivo();

    }

    public boolean pruebaHistoria(String codigo) {
        boolean exists = false;
        FileReader file;
        BufferedReader br;
        String registro;

        try {
            file = new FileReader(this.ruta);
            br = new BufferedReader(file);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                if ((campos[0].equals(codigo))) {
                    exists = true;
                    break;
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
        }
        return exists;
    }

    private void verificaArchivo() {
        try {
            File filex = new File(this.ruta);
            if (!filex.exists()) {
                filex.createNewFile();
            }
        } catch (IOException xxx) {
            JOptionPane.showMessageDialog(null, "Fallo buscando ruta...!!");
        }
    }

    public ArrayList<Historia> getHistoria() {

        Historia especialidad = null;
        FileReader file;
        BufferedReader br;
        String registro;
        ArrayList<Historia> especialidades = new ArrayList();

        try {
            file = new FileReader(this.ruta);
            br = new BufferedReader(file);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split("^.");
                especialidad = new Historia(campos[0], campos[1], campos[2], campos[3], campos[4]);
                especialidades.add(especialidad);
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Hubo fallos en la operación");
        }
        return especialidades;
    }

    public void guardaHistoria(Historia cita) {
        //guardar al eprofiante en el archivo....
        File file;
        FileWriter fr;
        PrintWriter pw;

        try {
            file = new File(this.ruta);
            fr = new FileWriter(file, true);
            pw = new PrintWriter(fr);
            pw.println(cita);
            pw.close();
            JOptionPane.showMessageDialog(null, "Operación exitosa..!!");
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo guardando en el archivo..!!");
            //System.exit(1);
        }
    }

    public Historia buscarHistoria(String id) {
        FileReader fr;
        BufferedReader br;
        Historia espec = null;
        String registro;
        try {
            fr = new FileReader(this.ruta);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split("^.");
                if ((campos[0].equals(id))) {
                    espec = new Historia(campos[0], campos[1], campos[2], campos[3], campos[4]);
                    break;
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
            //System.exit(1);
        }

        return espec;
    }

}
