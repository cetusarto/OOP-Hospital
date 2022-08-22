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
import negocio.Cita;
import negocio.Especialidad;
import negocio.Medico;

/**
 *
 * @author cesar
 */
public class GestionCitas {

    private String ruta;

    public GestionCitas() {
        this.ruta = "./Archivos/misCitas.txt";
        this.verificaArchivo();
        this.starter();
    }

    public boolean citas() {
        ArrayList<Cita> m = new ArrayList<Cita>();
        m = this.getCitas();
        boolean hay = true;
        if (m.size() == 0) {
            hay = false;
        }
        return hay;
    }

    private void starter() {
        ArrayList<Cita> m = new ArrayList<Cita>();
        m = this.getCitas();
        if (m.size() == 0) {
        }
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

    public Cita buscarCita(String id) {
        FileReader fr;
        BufferedReader br;
        Cita espec = null;
        String registro;
        try {
            fr = new FileReader(this.ruta);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                if ((campos[0].equals(id))) {
                    espec = new Cita(campos[0], campos[1], campos[2], campos[3], campos[4], campos[5], Boolean.parseBoolean(campos[6]));
                    break;
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
            //System.exit(1);
        }
        return espec;
    }

    public Cita buscarCitaXFecha(String fecha, String dia, String hora) {
        FileReader fr;
        BufferedReader br;
        Cita espec = null;
        String registro;
        try {
            fr = new FileReader(this.ruta);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                if ((campos[3].equals(fecha)) && (campos[4].equals(dia)) && (campos[5].equals(hora))) {
                    espec = new Cita(campos[0], campos[1], campos[2], campos[3], campos[4], campos[5], Boolean.parseBoolean(campos[6]));
                    break;
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
            //System.exit(1);
        }
        return espec;
    }

    public Cita buscarCitaXFechayId(String fecha, String id) {
        FileReader fr;
        BufferedReader br;
        Cita espec = null;
        String registro;
        try {
            fr = new FileReader(this.ruta);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                if ((campos[4].equals(fecha)) && (campos[3].equals(id))) {
                    espec = new Cita(campos[0], campos[1], campos[2], campos[3], campos[4], campos[5], false);
                    break;
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
            //System.exit(1);
        }
        return espec;
    }

    public Cita buscarCitaXDoctor(String id) {
        FileReader fr;
        BufferedReader br;
        Cita espec = null;
        String registro;
        try {
            fr = new FileReader(this.ruta);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                if ((campos[1].equals(id))) {
                    espec = new Cita(campos[0], campos[1], campos[2], campos[3], campos[4], campos[5], Boolean.parseBoolean(campos[6]));
                    break;
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
            //System.exit(1);
        }
        return espec;
    }

    public Cita buscarCitaXId(String id) {
        FileReader fr;
        BufferedReader br;
        Cita espec = null;
        String registro;
        try {
            fr = new FileReader(this.ruta);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                if ((campos[0].equals(id))&& Boolean.parseBoolean(campos[6])==true) {
                    espec = new Cita(campos[0], campos[1], campos[2], campos[3], campos[4], campos[5], Boolean.parseBoolean(campos[6]));
                    break;
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
            //System.exit(1);
        }
        return espec;
    }

    public void saveCita(Cita cita) {
        File archivo;
        FileWriter fr;
        PrintWriter pw;
        try {
            archivo = new File(this.ruta);
            fr = new FileWriter(archivo, true);
            pw = new PrintWriter(fr);
            pw.println(cita);
            pw.close();
            JOptionPane.showMessageDialog(null, "Cita Añadida");
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Hubo fallos en la operación");
        }
    }

    public ArrayList<Cita> getCitas() {
        FileReader fr;
        BufferedReader br;
        Cita monty = null;
        String registro;
        ArrayList<Cita> clark = new ArrayList();

        try {
            fr = new FileReader(this.ruta);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                monty = new Cita(campos[0], campos[1], campos[2], campos[3], campos[4], campos[5], Boolean.parseBoolean(campos[6]));
                clark.add(monty);
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
            //System.exit(1);
        }
        return clark;
    }

    public void modificarCita(String q, Cita cita) {

        ArrayList<Cita> es = this.getCitas();
        int pos = -1;
        for (Cita t : es) {
            pos++;
            if (t.getIdCita().equals(q)) {
                es.set(pos, cita);
                this.recargaArchivo(es);
                JOptionPane.showMessageDialog(null, "Cambios realizados");

            }
        }

    }

    private void recargaArchivo(ArrayList<Cita> es) {
        File file;
        FileWriter fr;
        PrintWriter pw;

        try {
            file = new File(this.ruta);
            fr = new FileWriter(file, false);
            pw = new PrintWriter(fr);
            for (Cita esp : es) {
                pw.println(esp);
            }
            pw.close();
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Hubo fallos en la operación");
        }

    }

    public void eliminarCita(String id) {

        ArrayList<Cita> doc = this.getCitas();
        if (doc.size() > 1) {
            for (Cita test : doc) {
                if (test.getIdCita().equals(id)) {
                    doc.remove(test);
                    this.recargaArchivo(doc);

                }
            }

        } else {
            if (doc.size() == 0) {
            }
            doc.clear();
            this.recargaArchivo(doc);
            JOptionPane.showMessageDialog(null, "Cita eliminada");

        }

    }

    public void eliminarCita2(String id) {

        ArrayList<Cita> doc = this.getCitas();
        if (doc.size() > 1) {
            for (Cita test : doc) {
                if (test.getIdMedico().equals(id)) {
                    doc.remove(test);
                }
            }
            this.recargaArchivo(doc);

        } else {
            if (doc.size() == 1) {
                doc.clear();
                this.recargaArchivo(doc);
            }
        }
    }

    public void eliminarCitaP(String id) {
        int dialogButton = JOptionPane.YES_NO_OPTION;

        ArrayList<Cita> doc = this.getCitas();
        if (doc.size() > 1) {
            for (Cita test : doc) {
                if (test.getIdPaciente().equals(id)) {
                    JOptionPane.showConfirmDialog(null, "¿Está seguro?", "Atento", dialogButton);
                    if (dialogButton == JOptionPane.YES_OPTION) {

                        doc.remove(test);
                        this.recargaArchivo(doc);
                        JOptionPane.showMessageDialog(null, "Cita eliminado");

                    }
                }

            }
        } else {
            JOptionPane.showConfirmDialog(null, "¿Está seguro?", "Atento", dialogButton);
            if (dialogButton == JOptionPane.YES_OPTION) {
                doc.clear();
                this.recargaArchivo(doc);
                JOptionPane.showMessageDialog(null, "Cita eliminado");
            }

        }
    }

    public boolean pruebaExistenciaCita(String codigo) {
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
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
        }
        return exists;
    }

    public boolean pruebaExistenciaCitaMed(String codigo) {
        boolean exists = false;
        FileReader file;
        BufferedReader br;
        String registro;

        try {
            file = new FileReader(this.ruta);
            br = new BufferedReader(file);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                if ((campos[1].equals(codigo))) {
                    exists = true;
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
        }
        return exists;
    }

    public boolean pruebaExistenciaCitaP(String codigo) {
        boolean exists = false;
        FileReader file;
        BufferedReader br;
        String registro;

        try {
            file = new FileReader(this.ruta);
            br = new BufferedReader(file);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                if ((campos[2].equals(codigo))) {
                    exists = true;
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
        }
        return exists;
    }

    public void modificarCitaMed(String id, String med) {

        ArrayList<Cita> clark = this.getCitas();
        int pos = -1;
        for (Cita monty : clark) {
            pos++;
            if (monty.getIdMedico().equals(id)) {
                Cita n = new Cita();
                n = monty;
                n.setIdMedico(med);
                clark.set(pos, n);
                this.recargaArchivo(clark);
                break;
            }
        }

    }

    public void modificarCitaPac(String id, String med) {

        ArrayList<Cita> clark = this.getCitas();
        int pos = -1;
        for (Cita monty : clark) {
            pos++;
            if (monty.getIdPaciente().equals(id)) {
                Cita n = new Cita();
                n = monty;
                n.setIdPaciente(med);
                clark.set(pos, n);
                this.recargaArchivo(clark);
                break;
            }
        }

    }

}
