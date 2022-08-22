
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import gestion.Funciones;
import gestion.GestionCitas;
import gestion.GestionDisponibilidad;
import gestion.GestionEspecialidades;
import gestion.GestionMedico;
import gestion.GestionPaciente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import negocio.Cita;
import negocio.Disponibilidad;
import negocio.Especialidad;
import negocio.Medico;
import negocio.Paciente;

/**
 *
 * @author cesar
 */
public class GestCita extends javax.swing.JFrame implements ActionListener, ItemListener, KeyListener, MouseListener {
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField4 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jDay = new javax.swing.JLabel();
        Lunes = new javax.swing.JLabel();
        Martes = new javax.swing.JLabel();
        Miercoles = new javax.swing.JLabel();
        Jueves = new javax.swing.JLabel();
        Viernes = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Gestión Citas");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

        jButton3.setForeground(new java.awt.Color(255, 0, 51));
        jButton3.setText("Regresar");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("Id:");

        jButton4.setForeground(new java.awt.Color(255, 0, 51));
        jButton4.setText("Buscar");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField2.setEditable(false);

        jTextField3.setEditable(false);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setEnabled(false);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setText("Seleccione el día:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hora", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30" }));

        jButton5.setForeground(new java.awt.Color(255, 0, 51));
        jButton5.setText("Guardar");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextField4.setEditable(false);

        jButton6.setForeground(new java.awt.Color(255, 0, 51));
        jButton6.setText("Modificar");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton7.setForeground(new java.awt.Color(255, 0, 51));
        jButton7.setText("Eliminar");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jDay.setForeground(new java.awt.Color(51, 0, 51));
        jDay.setText("Dias disponibles:");

        Lunes.setForeground(new java.awt.Color(51, 0, 51));
        Lunes.setText("Lunes");
        Lunes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Martes.setForeground(new java.awt.Color(51, 0, 51));
        Martes.setText("Martes");
        Martes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Miercoles.setForeground(new java.awt.Color(51, 0, 51));
        Miercoles.setText("Miercoles");
        Miercoles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Jueves.setForeground(new java.awt.Color(51, 0, 51));
        Jueves.setText("Jueves");
        Jueves.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Viernes.setForeground(new java.awt.Color(51, 0, 51));
        Viernes.setText("Viernes");
        Viernes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton8.setForeground(new java.awt.Color(255, 0, 51));
        jButton8.setText("Buscar dia");
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jDay, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Lunes, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Martes, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Miercoles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Jueves)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Viernes)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(138, 138, 138)))
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDay)
                    .addComponent(Lunes)
                    .addComponent(Martes)
                    .addComponent(Miercoles)
                    .addComponent(Jueves)
                    .addComponent(Viernes))
                .addGap(37, 37, 37)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jueves;
    private javax.swing.JLabel Lunes;
    private javax.swing.JLabel Martes;
    private javax.swing.JLabel Miercoles;
    private javax.swing.JLabel Viernes;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jDay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
    private ButtonGroup bg;
    private Entrada entry;
    private GestionPaciente gestorPac;
    private GestionEspecialidades gestorEsp;
    private GestionMedico doc;
    private GestionCitas gestor;
    private GestionDisponibilidad dispo;
    private String especialidad;
    private String idPaciente;
    private String dia;
    private String day;
    private String fecha;
    private String idMedico;
    private DefaultTableModel modelo;
    private String idCita;
    private int opcion;

    private ArrayList<Disponibilidad> disponibilidades;

    private Funciones funciones;

    public GestCita(Entrada entry) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.poneraEscuchar();
        this.entry = entry;
        this.gestorPac = new GestionPaciente();
        this.gestor = new GestionCitas();
        this.gestorEsp = new GestionEspecialidades();
        this.doc = new GestionMedico();
        this.dispo = new GestionDisponibilidad();
        this.funciones = new Funciones();
        this.modelo = new DefaultTableModel();
        this.disponibilidades = new ArrayList<Disponibilidad>();
        this.idMedico = "";
        this.idPaciente = "";
        this.opcion = 0;
        this.dia = "";
        this.idCita = "";
        this.day = "";
        this.fecha = "";
        this.basics();
        this.especialidad = "Especialidad";
    }

    private void basics() {
        this.jTextField1.setText("");
        this.jTextField2.setText("");
        this.jTextField3.setText("");
        this.Jueves.setVisible(false);
        this.Martes.setVisible(false);
        this.Miercoles.setVisible(false);
        this.Viernes.setVisible(false);
        this.Lunes.setVisible(false);
        this.jDay.setVisible(true);
        this.jButton8.setVisible(false);
        this.jComboBox1.setEnabled(false);
        this.jButton7.setEnabled(false);
        this.jButton6.setEnabled(false);
        this.jComboBox2.setEnabled(false);
        this.jDateChooser1.setEnabled(false);
        this.jTextField4.setVisible(true);
        this.jTextField4.setText(this.especialidad);
        this.fillCombo1();
        this.llenarTabla();

    }

    private void nuevo() {

        this.jComboBox1.setEnabled(true);
        this.jButton7.setEnabled(true);
        this.jButton6.setEnabled(true);
        this.jComboBox2.setEnabled(true);
        this.jDateChooser1.setEnabled(true);
        this.jTextField4.setVisible(false);
        this.jTextField4.setText(this.especialidad);
        this.fillCombo1();
        this.llenarTabla();
    }

    private void poneraEscuchar() {
        this.jButton3.addActionListener(this);
        this.jButton4.addActionListener(this);
        this.jButton5.addActionListener(this);
        this.jButton6.addActionListener(this);
        this.jButton7.addActionListener(this);
        this.jButton8.addActionListener(this);

        this.jComboBox1.addItemListener(this);
        this.jTable1.addMouseListener(this);
    }

    private void fillCombo1() {

        this.jComboBox1.removeAllItems();
        ArrayList<Medico> espec = this.doc.getMedicos();
        this.jComboBox1.addItem("Seleccione Doctor:");
        for (Medico l : espec) {
            if (this.dispo.pruebaExistenciaDispo(l.getIdMed()) == true) {
                this.jComboBox1.addItem(l.getNombres() + " " + l.getApellido1());
            }
        }
        this.jComboBox1.setSelectedIndex(0);
    }

    private void verCita() {
        Cita mig = new Cita();
        Paciente lol = new Paciente();
        Medico doc = new Medico();
        mig = this.gestor.buscarCita(this.idCita);
        lol = this.gestorPac.buscarPaciente(mig.getIdPaciente());
        doc = this.doc.buscarMedico(mig.getIdMedico());
        this.jTextField1.setText(mig.getIdPaciente());
        this.jTextField2.setText(lol.getNombres());
        this.jTextField3.setText(lol.getApellido1() + " " + lol.getApellido2());
        this.jComboBox1.setSelectedItem(doc.getNombres() + " " + doc.getApellido1());
        this.jComboBox2.setSelectedItem(mig.getHora());
        this.jComboBox2.setEnabled(true);
        this.jComboBox1.setEnabled(true);
        this.fecha = mig.getFecha();
        this.jDateChooser1.setDate(this.funciones.StringADate(this.fecha));

    }

    private void llenarTabla() {

        this.jTable1.setModel(this.modelo);

        String[] titulos = {"IdCita", "Fecha", "Dia", "Hora", "Paciente"};
        this.modelo.setDataVector(null, titulos);

        //Para el tamaño de las columnas
        TableColumn columna = null;
        columna = this.jTable1.getColumnModel().getColumn(0);
        columna.setMinWidth(100);
        columna.setMaxWidth(100);

        columna = this.jTable1.getColumnModel().getColumn(1);
        columna.setMinWidth(100);
        columna.setMaxWidth(100);

        columna = this.jTable1.getColumnModel().getColumn(2);
        columna.setMinWidth(80);
        columna.setMaxWidth(80);

        columna = this.jTable1.getColumnModel().getColumn(3);
        columna.setMinWidth(260);
        columna.setMaxWidth(260);

        this.jTable1.getTableHeader().setReorderingAllowed(false); // No permitir mover las columnas

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(this.modelo);// Ordenar al clickear columnas
        this.jTable1.setRowSorter(elQueOrdena);
        this.llenar();
    }

    public void llenar() {
        String id, date, day, hora, nombres;
        ArrayList<Cita> monty = this.gestor.getCitas();
        for (Cita clark : monty) {
            id = clark.getIdCita();
            date = clark.getFecha();
            day = clark.getDia();
            hora = clark.getHora();
            Paciente luis = this.gestorPac.buscarPaciente(clark.getIdPaciente());
            nombres = luis.getNombres() + " " + luis.getApellido1() + " " + luis.getApellido2();

            Vector<String> fila = new Vector();
            fila.add(id);
            fila.add(date);
            fila.add(day);
            fila.add(hora);
            fila.add(nombres);

            this.modelo.addRow(fila);
        }
    }

    private boolean validar() {
        boolean sirve = true;
        if (this.jComboBox1.getSelectedIndex() == 0 || this.jComboBox2.getSelectedIndex() == 0 || this.day.equals(null)) {
            JOptionPane.showMessageDialog(null, "Debe rellenar todos los espacios");
            sirve = false;
        }
        if (this.idMedico.equals(null) || this.idPaciente.equals(null)) {
            JOptionPane.showMessageDialog(null, "Debe rellenar todos los espacios");
            sirve = false;
        }

        if (this.funciones.getFecha(jDateChooser1) == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fecha");
            sirve = false;
        }
        return sirve;
    }

    private void tryThis() {
        this.jComboBox2.removeAllItems();
        String day = this.funciones.getDia(this.jDateChooser1);
        Disponibilidad getter = this.dispo.buscarDisponibilidadMedYDay(this.idMedico, day);

        boolean print = false;

        ArrayList<String> caja = new ArrayList<String>();
        caja.add("7:00");
        caja.add("7:30");
        caja.add("8:00");
        caja.add("8:30");
        caja.add("9:00");
        caja.add("9:30");
        caja.add("10:00");
        caja.add("10:30");
        caja.add("11:00");
        caja.add("11:30");
        caja.add("12:00");
        caja.add("12:30");
        caja.add("13:00");
        caja.add("13:30");
        caja.add("14:00");
        caja.add("14:30");
        caja.add("15:00");
        caja.add("15:30");
        caja.add("16:00");
        caja.add("16:30");
        caja.add("17:00");
        caja.add("17:30");
        caja.add("18:00");
        caja.add("18:30");
        caja.add("19:00");
        this.jComboBox2.addItem("Hora");
        for (String tester : caja) {
            if (tester.equals(getter.getHora1())) {
                print = true;
            }
            if (tester.equals(getter.getHora2())) {
                print = false;
            }
            if (print == true) {
                this.jComboBox2.addItem(tester);
            }
            this.jComboBox2.setEnabled(true);

        }
    }

    private void happyDays() {
        for (Disponibilidad l : this.disponibilidades) {
            if (l.getDia().equals("Monday")) {
                this.Lunes.setVisible(true);
            }
            if (l.getDia().equals("Tuesday")) {
                this.Martes.setVisible(true);
            }
            if (l.getDia().equals("Wednesday")) {
                this.Miercoles.setVisible(true);
            }
            if (l.getDia().equals("Thursday")) {
                this.Jueves.setVisible(true);
            }
            if (l.getDia().equals("Friday")) {
                this.Viernes.setVisible(true);
            }
        }
    }

    public void buildId() {
        String id = "", letter = "";
        int number;
        number = (int) Math.floor((Math.random() * 98) + 10);

        letter = this.jTextField4.getText().substring(0, 3);
        id = letter + number;

        this.idCita = id;
    }

    public void guardar() {
        Cita messenger = new Cita(this.idCita, this.idMedico, this.idPaciente, this.funciones.getFecha(this.jDateChooser1), this.funciones.getDia(this.jDateChooser1), (String) this.jComboBox2.getSelectedItem(), false);
        this.gestor.saveCita(messenger);
    }

    public void modificar() {
        Cita messenger = new Cita(this.idCita, this.idMedico, this.idPaciente, this.funciones.getFecha(this.jDateChooser1), this.funciones.getDia(this.jDateChooser1), (String) this.jComboBox2.getSelectedItem(), false);
        this.gestor.modificarCita(this.idCita, messenger);
    }

    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == this.jButton3) {
            this.setVisible(false);
            this.entry.setVisible(true);
        }
        if (evento.getSource() == this.jButton8) {
            if (!this.jDateChooser1.getDate().equals(null)) {
                if (this.dispo.pruebaExistenciaDispoDia(this.idMedico, this.funciones.getDia(this.jDateChooser1)) == true) {
                    this.tryThis();
                } else {
                    JOptionPane.showMessageDialog(null, "Elija una fecha válida");
                    this.jDateChooser1.setDate(null);
                    this.jComboBox2.setEnabled(false);

                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe añadir datos");

            }
        }
        if (evento.getSource() == this.jButton5) {
            if (this.validar() == true) {
                if (this.gestor.pruebaExistenciaCita(this.idCita) == false) {
                    if (this.opcion == 1) {
                        this.modificar();
                        
                    } else {
                        this.guardar();
                    }
                    this.basics();
                }
            }
        }
        if (evento.getSource() == this.jButton6) {
            if (this.validar() == true) {
                this.jButton5.setEnabled(true);
                this.opcion = 1;
            }
        }
        if (evento.getSource() == this.jButton7) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            JOptionPane.showConfirmDialog(null, "¿Está segur@? Se borrarán todos los médicos con dicha especialidad", "Atento", dialogButton);
            if (dialogButton == JOptionPane.YES_OPTION) {
                this.gestor.eliminarCita(this.idCita);
                this.basics();
            }

        }
        if (evento.getSource() == this.jButton4) {
            if (this.jComboBox1.getSelectedIndex() != 0) {
                this.basics();
            }
            {
                if (!this.jTextField1.getText().equals(null)) {
                    if (this.gestorPac.pruebaExistenciaCode(this.jTextField1.getText()) == true) {
                        Paciente mig = new Paciente();
                        mig = this.gestorPac.buscarPaciente(this.jTextField1.getText());
                        this.jTextField2.setText(mig.getNombres());
                        this.jTextField3.setText(mig.getApellido1() + " " + mig.getApellido2());
                        this.jComboBox1.setEnabled(true);
                        this.jButton5.setEnabled(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "No existe ese número");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Digite un numero");

                }
            }
        }

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == jComboBox1) //Si se desplego el jcombobox1
        {
            if (e.getStateChange() == ItemEvent.SELECTED)//si se seleciono un item
            {
                int index = this.jComboBox1.getSelectedIndex();

                if (index > 0) {

                    ArrayList<Medico> espec = this.doc.getMedicos();
                    Medico medic = new Medico();
                    medic = espec.get(index - 1);
                    Especialidad nameEs = new Especialidad();
                    nameEs = this.gestorEsp.buscarEspecialidades(medic.getIdSpec());
                    this.especialidad = nameEs.getEspecialidad();
                    this.idMedico = medic.getIdMed();
                    this.disponibilidades = this.dispo.getDisponibilidadesXId(this.idMedico);
                    this.idPaciente = this.jTextField1.getText();
                    this.jButton4.setText("Nuevo");
                    this.jTextField4.setText(this.especialidad);
                    this.jDateChooser1.setEnabled(true);
                    this.jButton8.setVisible(true);
                    this.happyDays();
                    this.buildId();

                }
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == this.jTable1) {
            int fila = this.jTable1.getSelectedRow();
            if (fila >= 0) {
                String dato = (String) this.jTable1.getValueAt(fila, 0);
                this.basics();
                this.idCita = dato;
                this.verCita();

                this.jButton7.setEnabled(true);
                this.jButton6.setEnabled(true);
                this.jButton5.setEnabled(false);

            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

}
