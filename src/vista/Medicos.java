/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import gestion.GestionEspecialidades;
import gestion.GestionMedico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import negocio.Especialidad;
import negocio.Medico;

/**
 *
 * @author cesar
 */
public class Medicos extends javax.swing.JFrame implements ActionListener, ItemListener {
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Ver Médicos");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jButton1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setText("Regresar");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("Identificación:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(45, 45, 45)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
    private GestMedico entry;
    private DefaultTableModel modelo;
    private GestionMedico esclavo;
    private int opcion;
    private GestionEspecialidades gestor;

    public Medicos(GestMedico entry) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.poneraEscuchar();
        this.entry = entry;
        this.gestor = new GestionEspecialidades();
        this.esclavo = new GestionMedico();
        this.modelo = new DefaultTableModel();
        this.modelaTabla();
        this.llenaCombo();

    }

    private void poneraEscuchar() {
        this.jButton1.addActionListener(this);
        this.jComboBox1.addItemListener(this);

    }

    private void llenaCombo() {
        this.jComboBox1.removeAllItems();
        ArrayList<Especialidad> espec = this.gestor.getEspecialidades();
        this.jComboBox1.addItem("Todas");
        for (Especialidad l : espec) {
            this.jComboBox1.addItem(l.getEspecialidad());
        }
        this.jComboBox1.setSelectedIndex(0);
    }

    private void modelaTabla() {

        this.jTable1.setModel(this.modelo);

        String[] titulos = {"Identificacion", "Nombres y apellidos", "Teléfono"};
        this.modelo.setDataVector(null, titulos);

        //Para el tamaño de las columnas
        TableColumn columna = null;
        columna = this.jTable1.getColumnModel().getColumn(0);
        columna.setMinWidth(150);
        columna.setMaxWidth(150);

        columna = this.jTable1.getColumnModel().getColumn(1);
        columna.setMinWidth(250);
        columna.setMaxWidth(250);

        columna = this.jTable1.getColumnModel().getColumn(2);
        columna.setMinWidth(150);
        columna.setMaxWidth(150);

        this.jTable1.getTableHeader().setReorderingAllowed(false); // No permitir mover las columnas

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(this.modelo);// Ordenar al clickear columnas
        this.jTable1.setRowSorter(elQueOrdena);
        if (this.opcion == 1) {
            this.agregaFilaNormal();
        }
        if (this.opcion == 2) {
            this.agregaFilaEspecial();
        }
    }

    private String getIDEspec() {
        String id = "", name;
        name = (String) this.jComboBox1.getSelectedItem();
        Especialidad especialidades = new Especialidad();
        especialidades = this.gestor.buscarEspecialidad(name);
        id = especialidades.getIdEspecialidad();
        return id;
    }

    private void agregaFilaEspecial() {
        String id, nombres, celular, x;
        ArrayList<Medico> monty = this.esclavo.getMedicos();
        for (Medico clark : monty) {
            if (clark.getIdSpec().equals(this.getIDEspec())) {
                id = clark.getIdMed();
                nombres = clark.getNombres() + " " + clark.getApellido1() + " " + clark.getApellido2();
                celular = clark.getTelefono();

                Vector<String> fila = new Vector();
                fila.add(id);
                fila.add(nombres);
                fila.add(celular);

                this.modelo.addRow(fila);
            }
        }
    }

    private void agregaFilaNormal() {
        String id, nombres, celular;
        ArrayList<Medico> monty = this.esclavo.getMedicos();
        for (Medico clark : monty) {
            id = clark.getIdMed();
            nombres = clark.getNombres() + " " + clark.getApellido1() + " " + clark.getApellido2();
            celular = clark.getTelefono();

            Vector<String> fila = new Vector();
            fila.add(id);
            fila.add(nombres);
            fila.add(celular);

            this.modelo.addRow(fila);
        }

    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == this.jButton1) {
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
