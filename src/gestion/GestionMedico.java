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
import negocio.Disponibilidad;
import negocio.Medico;

/**
 *
 * @author cesar
 */
public class GestionMedico {

    private String ruta;
    private GestionDisponibilidad gestor;
    private GestionCitas cita;

    public GestionMedico() {
        this.ruta = "./Archivos/misMedicos.txt";
        this.verificArchivo();
        this.gestor = new GestionDisponibilidad();
        this.cita = new GestionCitas();
    }

    public boolean medicos() {
        ArrayList<Medico> m = new ArrayList<Medico>();
        m = this.getMedicos();
        boolean hay = false;
        if (m == null) {
            hay = true;
        }
        return hay;
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

    public boolean pruebaExistenciaEsp(String codigo) {
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
                    break;
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
        }
        return exists;
    }

    public Medico buscarMedico(String id) {
        FileReader fr;
        BufferedReader br;
        Medico espec = null;
        String registro;
        try {
            fr = new FileReader(this.ruta);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                if ((campos[0].equals(id))) {
                    espec = new Medico(campos[0], campos[1], campos[2], campos[3], campos[4], campos[5], campos[6], campos[7]);
                    break;
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
            //System.exit(1);
        }
        return espec;
    }

    public Medico buscarMedicoXName(String id) {
        FileReader fr;
        BufferedReader br;
        Medico espec = null;
        String registro;
        try {
            fr = new FileReader(this.ruta);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                if ((campos[2].equals(id))) {
                    espec = new Medico(campos[0], campos[1], campos[2], campos[3], campos[4], campos[5], campos[6], campos[7]);
                    break;
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
            //System.exit(1);
        }
        return espec;
    }

    public Medico buscarMedicoXId(String id) {
        FileReader fr;
        BufferedReader br;
        Medico espec = null;
        String registro;
        try {
            fr = new FileReader(this.ruta);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                if ((campos[2].equals(id))) {
                    espec = new Medico(campos[0], campos[1], campos[2], campos[3], campos[4], campos[5], campos[6], campos[7]);
                    break;
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
            //System.exit(1);
        }
        return espec;
    }

    public void guardaMedico(Medico med) {
        //guardar al estudiante en el archivo....
        File file;
        FileWriter fr;
        PrintWriter pw;

        try {
            file = new File(this.ruta);
            fr = new FileWriter(file, true);
            pw = new PrintWriter(fr);
            pw.println(med);
            pw.close();
            JOptionPane.showMessageDialog(null, "Medico guardado");
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo guardando en el archivo..!!");
        }
    }

    public void modificarMedico(String id, Medico med) {

        ArrayList<Medico> clark = this.getMedicos();
        int pos = -1;
        for (Medico monty : clark) {
            pos++;
            if (monty.getIdMed().equals(id)) {
                if (this.gestor.disponibilidad() == true) {
                    this.gestor.modificarDisponibilidad(id, med.getIdMed());
                }
                if (this.cita.citas() == true) {
                    this.cita.modificarCitaMed(id, med.getIdMed());
                }
                clark.set(pos, med);
                this.recargaArchivo(clark);
                JOptionPane.showMessageDialog(null, "Modificación correcta");

                break;

            }
        }

    }

    public void modificarMedicoEd(String id, Medico med) {

        ArrayList<Medico> clark = this.getMedicos();
        int pos = -1;
        for (Medico monty : clark) {
            pos++;
            if (monty.getIdMed().equals(id)) {
                clark.set(pos, med);
                this.recargaArchivo(clark);
                break;
            }
        }

    }

    public void recargaArchivo(ArrayList<Medico> med) {
        File file;
        FileWriter fr;
        PrintWriter pw;

        try {
            file = new File(this.ruta);
            fr = new FileWriter(file, false);
            pw = new PrintWriter(fr);
            for (Medico monty : med) {
                pw.println(monty);
            }
            pw.close();
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo guardando en el archivo..!!");
        }
    }

    public void eliminarMedico(String id) {
        int dialogButton = JOptionPane.YES_NO_OPTION;

        ArrayList<Medico> doc = this.getMedicos();
        if (doc.size() > 1) {
            for (Medico test : doc) {
                if (test.getIdMed().equals(id)) {
                    JOptionPane.showConfirmDialog(null, "¿Está seguro?", "Atento", dialogButton);
                    if (dialogButton == JOptionPane.YES_OPTION) {
                        if (this.gestor.disponibilidad() == true) {
                            do {
                                this.gestor.eliminarDisponibilidad(id);
                            } while (this.gestor.pruebaExistenciaDispo(id) == true);
                        }
                        if (this.cita.citas() == true) {
                            do {
                                this.cita.eliminarCita(id);
                            } while (this.cita.pruebaExistenciaCitaMed(id) == true);
                        }
                        doc.remove(test);
                        this.recargaArchivo(doc);
                        JOptionPane.showMessageDialog(null, "Medico eliminado");

                    }
                }

            }
        } else {
            if (doc.size() != 0) {

                JOptionPane.showConfirmDialog(null, "¿Está seguro?", "Atento", dialogButton);
                if (dialogButton == JOptionPane.YES_OPTION) {
                    if (this.gestor.disponibilidad() == true) {
                        do {
                            this.gestor.eliminarDisponibilidad(id);
                        } while (this.gestor.pruebaExistenciaDispo(id) == true);
                    }
                    if (this.cita.citas() == true) {
                        do {
                            this.cita.eliminarCita(id);
                        } while (this.cita.pruebaExistenciaCitaMed(id) == true);
                    }
                    doc.clear();
                    this.recargaArchivo(doc);
                    JOptionPane.showMessageDialog(null, "Ultimo médico eliminado");
                }
            }

        }
    }

    public void eliminarMedico2(String id) {

        ArrayList<Medico> doc = this.getMedicos();
        if (doc.size() > 1) {
            for (Medico test : doc) {
                if (test.getIdMed().equals(id)) {
                    if (this.gestor.disponibilidad() == true) {
                        do {
                            this.gestor.eliminarDisponibilidad2(id);
                        } while (this.gestor.pruebaExistenciaDispo(id) == true);
                    }
                    if (this.cita.citas() == true) {
                        do {
                            this.cita.eliminarCita(id);
                        } while (this.cita.pruebaExistenciaCitaMed(id) == true);
                    }
                    doc.remove(test);
                    this.recargaArchivo(doc);
                }

            }
        } else {
            if (doc.size() != 0) {

                if (this.gestor.disponibilidad() == true) {
                    do {
                        this.gestor.eliminarDisponibilidad(id);
                    } while (this.gestor.pruebaExistenciaDispo(id) == true);
                    if (this.cita.citas() == true) {
                        do {
                            this.cita.eliminarCita(id);
                        } while (this.cita.pruebaExistenciaCitaMed(id) == true);
                    }
                    doc.clear();
                    this.recargaArchivo(doc);
                    JOptionPane.showMessageDialog(null, "Ultimo médico eliminado");
                }
            }

        }
    }

    public ArrayList<Medico> getMedicos() {
        FileReader fr;
        BufferedReader br;
        Medico monty = null;
        String registro;
        ArrayList<Medico> clark = new ArrayList();

        try {
            fr = new FileReader(this.ruta);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                monty = new Medico(campos[0], campos[1], campos[2], campos[3], campos[4], campos[5], campos[6], campos[7]);
                clark.add(monty);
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
            //System.exit(1);
        }
        return clark;
    }

}
