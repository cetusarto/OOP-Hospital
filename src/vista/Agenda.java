/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import gestion.GestionCitas;
import gestion.GestionMedico;
import gestion.GestionPaciente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import negocio.Cita;
import negocio.Especialidad;
import negocio.Medico;
import negocio.Paciente;

/**
 *
 * @author cesar
 */
public class Agenda extends javax.swing.JFrame implements ActionListener, ItemListener {
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Agenda");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));

        jButton3.setForeground(new java.awt.Color(204, 0, 204));
        jButton3.setText("Regresar");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 204));
        jLabel2.setText("Identificación:");

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
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    private String id;
    private GestMedico entry;
    private GestionMedico doc;
    private int opcion;
    private DefaultTableModel modelo;
    private GestionCitas gestor;
    private GestionPaciente marty;

    public Agenda(GestMedico entry, String code) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.entry = entry;
        this.id = code;
        this.opcion = 1;
        this.gestor = new GestionCitas();
        this.doc = new GestionMedico();
        this.modelo = new DefaultTableModel();
        this.marty = new GestionPaciente();
        this.poneraEscuchar();
        this.doc();
        this.modelaTabla();
        this.llenaCombo();
    }

    private void doc() {
        Medico mr = new Medico();
        mr = this.doc.buscarMedico(this.id);
        this.setTitle("Agenda Dr./Dra. " + mr.getNombres());

    }

    private void poneraEscuchar() {
        this.jButton3.addActionListener(this);
        this.jComboBox1.addItemListener(this);

    }

    private void llenaCombo() {
        this.jComboBox1.removeAllItems();
        ArrayList<Cita> espec = this.gestor.getCitas();
        this.jComboBox1.addItem("Todas");
        for (Cita l : espec) {
            if (l.isAtendido() == false) {
                if (l.getIdMedico().equals(this.id)) {
                    this.jComboBox1.addItem(l.getFecha());
                }

            }
        }
        this.jComboBox1.setSelectedIndex(0);
    }

    private void modelaTabla() {

        this.jTable1.setModel(this.modelo);

        String[] titulos = {"Fecha", "Dia", "Hora", "Paciente"};
        this.modelo.setDataVector(null, titulos);

        TableColumn columna = null;
        columna = this.jTable1.getColumnModel().getColumn(0);
        columna.setMinWidth(80);
        columna.setMaxWidth(80);

        columna = this.jTable1.getColumnModel().getColumn(1);
        columna.setMinWidth(80);
        columna.setMaxWidth(80);

        columna = this.jTable1.getColumnModel().getColumn(2);
        columna.setMinWidth(80);
        columna.setMaxWidth(80);

        columna = this.jTable1.getColumnModel().getColumn(3);
        columna.setMinWidth(250);
        columna.setMaxWidth(250);

        this.jTable1.getTableHeader().setReorderingAllowed(false); // No permitir mover las columnas

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(this.modelo);// Ordenar al clickear columnas
        this.jTable1.setRowSorter(elQueOrdena);
        if (this.opcion == 1) {
            this.agregaFila();
        }
        if (this.opcion == 2) {
            this.agregaFilaFilt();
        }
    }

    private void agregaFila() {
        String fecha, nombres, dia, hora;
        ArrayList<Cita> studs = this.gestor.getCitas();
        for (Cita stud : studs) {
            if (stud.getIdMedico().equals(this.id)) {
                fecha = stud.getFecha();
                dia = stud.getDia();
                hora = stud.getHora();
                Paciente tim = new Paciente();
                tim = this.marty.buscarPaciente(stud.getIdPaciente());
                nombres = tim.getNombres() + " " + tim.getApellido1() + " " + tim.getApellido2();

                Vector<String> fila = new Vector();
                fila.add(fecha);
                fila.add(dia);
                fila.add(hora);
                fila.add(nombres);
                this.modelo.addRow(fila);
            }
        }
    }

    private void agregaFilaFilt() {
        String fecha, nombres, dia, hora;
        ArrayList<Cita> studs = this.gestor.getCitas();
        for (Cita stud : studs) {
            if (stud.getIdMedico().equals(this.id)) {
                if (stud.getFecha().equals(this.jComboBox1.getSelectedItem())) {
                    fecha = stud.getFecha();
                    dia = stud.getDia();
                    hora = stud.getHora();
                    Paciente tim = new Paciente();
                    tim = this.marty.buscarPaciente(stud.getIdPaciente());
                    nombres = tim.getNombres() + " " + tim.getApellido1() + " " + tim.getApellido2();

                    Vector<String> fila = new Vector();
                    fila.add(fecha);
                    fila.add(dia);
                    fila.add(hora);
                    fila.add(nombres);
                    this.modelo.addRow(fila);
                }
            }
        }

    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == this.jButton3) {
            this.setVisible(false);
            this.entry.setVisible(true);
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
                    this.opcion = 2;
                    this.modelaTabla();
                } else {
                    this.opcion = 1;
                    this.modelaTabla();
                }
            }
        }
    }
}
