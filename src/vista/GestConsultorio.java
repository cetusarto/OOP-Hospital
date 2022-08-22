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
import negocio.Medico;
import negocio.Paciente;

/**
 *
 * @author cesar
 */
public class GestConsultorio extends javax.swing.JFrame implements ActionListener, MouseListener, KeyListener, ItemListener {
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión Consultorio");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 0));
        jButton3.setText("Regresar");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(486, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(436, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(57, 57, 57)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(156, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextField1.setEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("ID:");

        jLabel2.setText("Password:");

        jPasswordField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 51, 0));
        jButton4.setText("Validar");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 51, 0));
        jButton5.setText("Log Out");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addComponent(jPasswordField1))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    private ButtonGroup bg;
    private Entrada entry;
    private DefaultTableModel modelo;
    private GestionMedico doc;
    private GestionCitas gestor;
    private String id;
    private GestionPaciente marty;

    public GestConsultorio(Entrada entry) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.modelo = new DefaultTableModel();
        this.marty = new GestionPaciente();
        this.poneraEscuchar();
        this.gestor = new GestionCitas();
        this.modelo = new DefaultTableModel();
        this.doc = new GestionMedico();
        this.entry = entry;
        this.id = "";
        this.llenar();
        this.basics();

    }

    private void basics() {
        this.jButton4.setVisible(false);
        this.jButton5.setVisible(false);
        this.jLabel1.setVisible(false);
        this.jLabel2.setVisible(false);
        this.jTextField1.setVisible(false);
        this.jPasswordField1.setVisible(false);
        this.jPasswordField1.setText("");
        this.jComboBox1.setSelectedIndex(0);
        this.modelaTabla();
    }

    private void llenar() {

        this.jComboBox1.removeAllItems();
        ArrayList<Medico> espec = this.doc.getMedicos();
        this.jComboBox1.addItem("Seleccione Doctor:");
        for (Medico l : espec) {
            this.jComboBox1.addItem(l.getNombres() + " " + l.getApellido1());
        }
        this.jComboBox1.setSelectedIndex(0);
    }

    private void modelaTabla() {

        this.jTable1.setModel(this.modelo);

        String[] titulos = {"Fecha", "Dia", "Hora", "Paciente"};
        this.modelo.setDataVector(null, titulos);

        TableColumn columna = null;
        columna = this.jTable1.getColumnModel().getColumn(0);
        columna.setMinWidth(127);
        columna.setMaxWidth(127);

        columna = this.jTable1.getColumnModel().getColumn(1);
        columna.setMinWidth(100);
        columna.setMaxWidth(100);

        columna = this.jTable1.getColumnModel().getColumn(2);
        columna.setMinWidth(100);
        columna.setMaxWidth(100);

        columna = this.jTable1.getColumnModel().getColumn(3);
        columna.setMinWidth(300);
        columna.setMaxWidth(300);

        this.jTable1.getTableHeader().setReorderingAllowed(false); // No permitir mover las columnas

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(this.modelo);// Ordenar al clickear columnas
        this.jTable1.setRowSorter(elQueOrdena);
        this.agregaFila();

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

    private void poneraEscuchar() {
        this.jButton3.addActionListener(this);
        this.jButton4.addActionListener(this);
        this.jButton5.addActionListener(this);
        this.jTable1.addMouseListener(this);
        this.jComboBox1.addItemListener(this);

    }

    private boolean security() {
        boolean entro = false;
        Medico rojas = new Medico();
        rojas = this.doc.buscarMedico(this.id);
        if (this.jPasswordField1.getText() == "") {
            JOptionPane.showMessageDialog(null, "Debe ingresar contraseña");
        }
        if (this.jPasswordField1.getText().equals(rojas.getPassword())) {
            JOptionPane.showMessageDialog(null, "Entró");
            entro = true;
        } else {
            JOptionPane.showMessageDialog(null, "Contraseña errónea");
            this.jPasswordField1.setText("");

        }

        return entro;
    }

    private void sacarId(int pos) {
        int x = pos - 1;
        ArrayList<Medico> espec = this.doc.getMedicos();
        Medico rojas = espec.get(x);
        this.id = rojas.getIdMed();

    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == this.jButton3) {
            this.setVisible(false);
            this.entry.setVisible(true);
        }
        if (evento.getSource() == this.jButton4) {
            if (this.security() == true) {
                this.modelaTabla();
                this.jButton5.setVisible(true);
            }
        }
        if (evento.getSource() == this.jButton5) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            JOptionPane.showConfirmDialog(null, "¿Está segur@?", "Atento", dialogButton);
            if (dialogButton == JOptionPane.YES_OPTION) {
                this.basics();
            }
        }

    }

    @Override
    public void mouseClicked(MouseEvent e
    ) {
    }

    @Override
    public void mousePressed(MouseEvent e
    ) {
        if (e.getSource() == this.jTable1) {
            int fila = this.jTable1.getSelectedRow();
            if (fila >= 0) {
                String dato1 = (String) this.jTable1.getValueAt(fila, 0);
                String dato2 = (String) this.jTable1.getValueAt(fila, 1);
                String dato3 = (String) this.jTable1.getValueAt(fila, 2);

                Cita travel = new Cita();
                travel = this.gestor.buscarCitaXFecha(dato1, dato2, dato3);

                this.setVisible(false);
                AtencionPaciente op = new AtencionPaciente(this, travel.getIdCita(), travel.getIdPaciente());

            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e
    ) {
    }

    @Override
    public void mouseEntered(MouseEvent e
    ) {
    }

    @Override
    public void mouseExited(MouseEvent e
    ) {
    }

    @Override
    public void keyTyped(KeyEvent e
    ) {
    }

    @Override
    public void keyPressed(KeyEvent e
    ) {
    }

    @Override
    public void keyReleased(KeyEvent e
    ) {
    }

    @Override
    public void itemStateChanged(ItemEvent e
    ) {
        if (e.getSource() == jComboBox1) //Si se desplego el jcombobox1
        {
            if (e.getStateChange() == ItemEvent.SELECTED)//si se seleciono un item
            {
                int index = this.jComboBox1.getSelectedIndex();

                if (index > 0) {
                    this.jButton4.setVisible(true);
                    this.jLabel1.setVisible(true);
                    this.jLabel2.setVisible(true);
                    this.jTextField1.setVisible(true);
                    this.jPasswordField1.setVisible(true);
                    this.sacarId(index);
                    this.jTextField1.setText(this.id);

                } else {
                    this.id = "";
                    this.basics();
                }
            }
        }
    }

}
