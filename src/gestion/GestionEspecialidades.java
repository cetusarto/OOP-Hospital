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
import negocio.Medico;

/**
 *
 * @author cesar
 */
public class GestionEspecialidades {

    private String ruta;
    private Especialidad gestor;
    private GestionMedico doc;

    public GestionEspecialidades() {
        this.ruta = "./Archivos/misEspecialidades.txt";
        this.verificaArchivo();
        this.gestor = new Especialidad();
        this.doc = new GestionMedico();
    }

    public void saveEspecialidad(Especialidad especialidad) {
        File archivo;
        FileWriter fr;
        PrintWriter pw;
        try {
            archivo = new File(this.ruta);
            fr = new FileWriter(archivo, true);
            pw = new PrintWriter(fr);
            pw.println(especialidad);
            pw.close();
            JOptionPane.showMessageDialog(null, "Especialidad Añadida");
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Hubo fallos en la operación");
        }
    }

    public Especialidad buscarEspecialidades(String id) {
        FileReader fr;
        BufferedReader br;
        Especialidad espec = null;
        String registro;
        try {
            fr = new FileReader(this.ruta);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                if ((campos[1].equals(id))) {
                    espec = new Especialidad(campos[0], campos[1]);
                    break;
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
            //System.exit(1);
        }
        return espec;
    }

    public void modificarEspecialidad(String q, String n) {
        ArrayList<Especialidad> es = this.getEspecialidades();
        int pos = -1;
        for (Especialidad est : es) {
            pos++;
            if (est.getEspecialidad().equals(q)) {
                Especialidad l = new Especialidad();
                l = est;
                l.setEspecialidad(n);
                es.set(pos, l);
                System.out.print(es);
                this.recargaArchivo(es);
                JOptionPane.showMessageDialog(null, "Cambios realizados");

            }
        }

    }

    public boolean pruebaExistencia(String name) {
        boolean hay = false;
        FileReader file;
        BufferedReader br;
        String registro;

        try {
            file = new FileReader(this.ruta);
            br = new BufferedReader(file);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                if (campos[0].equals(name)) {
                    hay = true;
                    break;
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
        }
        return hay;
    }

    private void recargaArchivo(ArrayList<Especialidad> especialidades) {
        File file;
        FileWriter fr;
        PrintWriter pw;

        try {
            file = new File(this.ruta);
            fr = new FileWriter(file, false);
            pw = new PrintWriter(fr);
            for (Especialidad esp : especialidades) {
                pw.println(esp);
            }
            pw.close();
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Hubo fallos en la operación");
        }

    }

    public ArrayList<Especialidad> getEspecialidades() {

        Especialidad especialidad = null;
        FileReader file;
        BufferedReader br;
        String registro;
        ArrayList<Especialidad> especialidades = new ArrayList();

        try {
            file = new FileReader(this.ruta);
            br = new BufferedReader(file);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                especialidad = new Especialidad(campos[0], campos[1]);
                especialidades.add(especialidad);
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Hubo fallos en la operación");
        }
        return especialidades;
    }

    public void eliminarEspecialidad(String especialidad) {
        int dialogButton = JOptionPane.YES_NO_OPTION;

        ArrayList<Especialidad> espc = this.getEspecialidades();
        String name = especialidad;

        if (espc.size()> 1) {
            for (Especialidad esp : espc) {
                if (esp.getEspecialidad().equals(name)) {
                    JOptionPane.showConfirmDialog(null, "¿Está segur@? Se borrarán todos los médicos con dicha especialidad", "Atento", dialogButton);
                    if (dialogButton == JOptionPane.YES_OPTION) {
                        if (this.doc.medicos() == true) {
                            do {
                                this.doc.eliminarMedico2(esp.getIdEspecialidad());
                            } while (this.doc.pruebaExistenciaEsp(esp.getIdEspecialidad()) == true);
                        }
                        espc.remove(esp);
                        
                        this.recargaArchivo(espc);
                        JOptionPane.showMessageDialog(null, "Especialidad eliminada");
                        break;

                    }
                }
            }
        } else {
            if (espc.size() == 1) {

                JOptionPane.showConfirmDialog(null, "¿Está segur@? Se borrarán todos los médicos con dicha especialidad", "Atento", dialogButton);
                if (dialogButton == JOptionPane.YES_OPTION) {
                    for (Especialidad esp : espc) {
                        if (esp.getEspecialidad().equals(name)) {
                            if (this.doc.medicos() == true) {
                                do {
                                    this.doc.eliminarMedico2(esp.getIdEspecialidad());
                                } while (this.doc.pruebaExistenciaEsp(esp.getIdEspecialidad()) == true);
                            }

                        }
                    }
                }
                espc.clear();
                this.recargaArchivo(espc);
                JOptionPane.showMessageDialog(null, "Ultima especialidad eliminada");
            }
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

    public Especialidad buscarEspecialidad(String nombre) {
        FileReader fr;
        BufferedReader br;
        Especialidad espec = null;
        String registro;
        try {
            fr = new FileReader(this.ruta);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                if ((campos[0].equals(nombre))) {
                    espec = new Especialidad(campos[0], campos[1]);
                    break;
                }
            }
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Fallo buscando en el archivo..!!");
            //System.exit(1);
        }

        return espec;
    }

    public Especialidad buscarIdEspecialidad(String nombre) {
        FileReader fr;
        BufferedReader br;
        Especialidad espec = null;
        String registro;
        try {
            fr = new FileReader(this.ruta);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                String[] campos = registro.split(",");
                if ((campos[1].equals(nombre))) {
                    espec = new Especialidad(campos[0], campos[1]);
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
