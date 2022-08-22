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
import negocio.Disponibilidad;
import negocio.Medico;
import negocio.Paciente;

/**
 *
 * @author cesar
 */
public class GestionDisponibilidad {
    
    private String ruta;
    private Disponibilidad gestor;
    private GestionCitas cita;
    
    public GestionDisponibilidad() {
        this.ruta = "./Archivos/misDisponibilidades.txt";
        this.verificaArchivo();
        this.gestor = new Disponibilidad();
        this.cita = new GestionCitas();
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
    
    public boolean disponibilidad() {
        ArrayList<Disponibilidad> m = new ArrayList<Disponibilidad>();
        m = this.getDisponibilidades();
        boolean hay = true;
        if (m.size() == 0) {
            hay = false;
        }
        return hay;
    }
    
    public boolean pruebaExistenciaDispo(String codigo) {
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
     public boolean pruebaExistenciaDispoDia(String codigo, String dia) {
        boolean exists = false;
        FileReader file;
        BufferedReader br;
        String registro;
        
        try {
            file = new FileReader(this.ruta);
            br = new BufferedReader(file);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                if ((campos[0].equals(codigo)&&campos[1].equals(dia))) {
                    exists = true;
                    break;
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
        }
        return exists;
    }
    
    
    public ArrayList<Disponibilidad> getDisponibilidades() {
        FileReader fr;
        BufferedReader br;
        Disponibilidad monty = null;
        String registro;
        ArrayList<Disponibilidad> clark = new ArrayList();
        
        try {
            fr = new FileReader(this.ruta);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                monty = new Disponibilidad(campos[0], campos[1], campos[2], campos[3]);
                clark.add(monty);
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
        }
        return clark;
    }

    public ArrayList<Disponibilidad> getDisponibilidadesXId(String idMedico) {
        FileReader fr;
        BufferedReader br;
        Disponibilidad monty = null;
        String registro;
        ArrayList<Disponibilidad> clark = new ArrayList();
        
        try {
            fr = new FileReader(this.ruta);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                monty = new Disponibilidad(campos[0], campos[1], campos[2], campos[3]);
                if (campos[0].equals(idMedico)) {
                    clark.add(monty);
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
        }
        return clark;
    }
    
    public void eliminarDisponibilidad2(String id) {
        ArrayList<Disponibilidad> doc = this.getDisponibilidades();
        if (doc.size() > 1) {
            for (Disponibilidad test : doc) {
                if (test.getIdMedico().equals(id)) {
                    doc.remove(test);
                    this.recargaArchivo(doc);
                    break;
                }
            }
        } else {
            if (doc.size() != 0) {
                doc.clear();
                this.recargaArchivo(doc);
            }
            
        }
    }
    
    public void eliminarDisponibilidad(String id) {
        int dialogButton = JOptionPane.YES_NO_OPTION;
        
        ArrayList<Disponibilidad> doc = this.getDisponibilidades();
        if (doc.size() > 1) {
            for (Disponibilidad test : doc) {
                if (test.getIdMedico().equals(id)) {
                    JOptionPane.showConfirmDialog(null, "¿Está seguro?", "Atento", dialogButton);
                    if (dialogButton == JOptionPane.YES_OPTION) {
                        doc.remove(test);
                        this.recargaArchivo(doc);
                        JOptionPane.showMessageDialog(null, "Disponibilidad eliminada");
                        
                    }
                }
                
            }
            
        } else {
            if (doc.size() == 0) {
            }
            JOptionPane.showConfirmDialog(null, "¿Está seguro?", "Atento", dialogButton);
            if (dialogButton == JOptionPane.YES_OPTION) {
                doc.clear();
                this.recargaArchivo(doc);
                JOptionPane.showMessageDialog(null, "Disponibilidad eliminada");
            }
            
        }
    }
    
    public void recargaArchivo(ArrayList<Disponibilidad> med) {
        File file;
        FileWriter fr;
        PrintWriter pw;
        
        try {
            file = new File(this.ruta);
            fr = new FileWriter(file, false);
            pw = new PrintWriter(fr);
            for (Disponibilidad monty : med) {
                pw.println(monty);
            }
            pw.close();
            
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo guardando en el archivo..!!");
        }
    }
    
    public void guardaDisponibilidades(Disponibilidad med) {
        //guardar al estudiante en el archivo....
        File file;
        FileWriter fr;
        PrintWriter pw;
        int dialogButton = JOptionPane.YES_NO_OPTION;
        JOptionPane.showConfirmDialog(null, "¿Está seguro?", "Atento", dialogButton);
        if (dialogButton == JOptionPane.YES_OPTION) {
            try {
                file = new File(this.ruta);
                fr = new FileWriter(file, true);
                pw = new PrintWriter(fr);
                pw.println(med);
                pw.close();
                JOptionPane.showMessageDialog(null, "Disponibilidad guardada");
            } catch (IOException ioe) {
                JOptionPane.showMessageDialog(null, "Fallo guardando en el archivo..!!");
            }
        }
        
    }
    
    public Disponibilidad buscarDisponibilidadDay(String day) {
        FileReader fr;
        BufferedReader br;
        Disponibilidad pac = null;
        String registro;
        try {
            fr = new FileReader(this.ruta);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                if ((campos[1].equals(day))) {
                    pac = new Disponibilidad(campos[0], campos[1], campos[2], campos[3]);
                    break;
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
            //System.exit(1);
        }
        
        return pac;
    }
    
    public Disponibilidad buscarDisponibilidadMed(String med) {
        FileReader fr;
        BufferedReader br;
        Disponibilidad pac = null;
        String registro;
        try {
            fr = new FileReader(this.ruta);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                if ((campos[0].equals(med))) {
                    pac = new Disponibilidad(campos[0], campos[1], campos[2], campos[3]);
                    break;
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
            //System.exit(1);
        }
        
        return pac;
    }
        public Disponibilidad buscarDisponibilidadMedYDay(String med, String dia) {
        FileReader fr;
        BufferedReader br;
        Disponibilidad pac = null;
        String registro;
        try {
            fr = new FileReader(this.ruta);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                if ((campos[0].equals(med))&& campos[1].equals(dia)) {
                    pac = new Disponibilidad(campos[0], campos[1], campos[2], campos[3]);
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
            //System.exit(1);
        }
        
        return pac;
    }
    
    public void modificarDisponibilidad(String id, String med) {
        
        ArrayList<Disponibilidad> clark = this.getDisponibilidades();
        int pos = -1;
        for (Disponibilidad monty : clark) {
            pos++;
            if (monty.getIdMedico().equals(id)) {
                Disponibilidad n = new Disponibilidad();
                n = monty;
                n.setIdMedico(med);
                clark.set(pos, n);
                this.recargaArchivo(clark);
                break;
            }
        }
        
    }
}
