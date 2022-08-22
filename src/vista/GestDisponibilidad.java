/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import gestion.GestionDisponibilidad;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import negocio.Disponibilidad;
import negocio.Medico;

/**
 *
 * @author cesar
 */
public class GestDisponibilidad extends javax.swing.JFrame implements ActionListener {
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Gestión Disponibilidad");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jButton3.setForeground(new java.awt.Color(0, 0, 102));
        jButton3.setText("Regresar");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 153), new java.awt.Color(0, 0, 153), new java.awt.Color(0, 0, 153), new java.awt.Color(0, 0, 153)));

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
        jTable1.setMaximumSize(new java.awt.Dimension(485, 150));
        jTable1.setPreferredSize(new java.awt.Dimension(240, 240));
        jScrollPane1.setViewportView(jTable1);

        jButton4.setForeground(new java.awt.Color(0, 0, 102));
        jButton4.setText("Agregar");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton5.setForeground(new java.awt.Color(0, 0, 102));
        jButton5.setText("Ok");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desde", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hasta", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00" }));

        jButton6.setForeground(new java.awt.Color(0, 0, 102));
        jButton6.setText("Eliminar");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 6, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel modelo;
    private GestMedico entry;
    private GestionDisponibilidad gestor;
    private String id;
    private int opcion;

    public GestDisponibilidad(GestMedico entry, String code) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.entry = entry;
        this.poneraEscuchar();
        this.id = code;
        this.gestor = new GestionDisponibilidad();
        this.modelo = new DefaultTableModel();
        this.jLabel1.setText(code);
        this.modelaTabla();
        this.opcion = 0;

    }

    private void poneraEscuchar() {
        this.jButton3.addActionListener(this);
        this.jButton4.addActionListener(this);
        this.jButton5.addActionListener(this);
        this.jButton6.addActionListener(this);

    }

    private void modelaTabla() {
        this.original();
        this.jTable1.setModel(this.modelo);

        String[] titulos = {"Día", "Desde", "Hasta"};
        this.modelo.setDataVector(null, titulos);

        //Para el tamaño de las columnas
        TableColumn columna = null;
        columna = this.jTable1.getColumnModel().getColumn(0);
        columna.setMinWidth(120);
        columna.setMaxWidth(120);

        columna = this.jTable1.getColumnModel().getColumn(1);
        columna.setMinWidth(120);
        columna.setMaxWidth(120);

        columna = this.jTable1.getColumnModel().getColumn(2);
        columna.setMinWidth(120);
        columna.setMaxWidth(120);

        this.jTable1.getTableHeader().setReorderingAllowed(false); // No permitir mover las columnas

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(this.modelo);// Ordenar al clickear columnas
        this.jTable1.setRowSorter(elQueOrdena);
        this.llenar();

    }

    private void llenar() {

        String dia, hora1, hora2;
        ArrayList<Disponibilidad> monty = this.gestor.getDisponibilidades();
        for (Disponibilidad clark : monty) {
            if (clark.getIdMedico().equals(this.id)) {
                dia = clark.getDia();

                hora1 = clark.getHora1();
                hora2 = clark.getHora2();

                Vector<String> fila = new Vector();
                fila.add(dia);
                fila.add(hora1);
                fila.add(hora2);

                this.modelo.addRow(fila);
            }
        }

    }

    private void original() {
        this.jButton4.setVisible(true);
        this.jButton6.setVisible(true);
        this.jComboBox1.setVisible(false);
        this.jComboBox2.setVisible(false);
        this.jComboBox3.setVisible(false);
        this.jComboBox4.setVisible(false);
        this.jComboBox1.setSelectedIndex(0);
        this.jComboBox2.setSelectedIndex(0);
        this.jComboBox3.setSelectedIndex(0);
        this.jComboBox4.setSelectedIndex(0);
        this.jButton5.setVisible(false);
        this.llenar();

    }

    private boolean validar() {
        boolean sirve = true;
        ArrayList<Disponibilidad> monty = this.gestor.getDisponibilidades();

        if (this.opcion == 1) {
            if (this.jComboBox1.getSelectedIndex() == 0 || this.jComboBox2.getSelectedIndex() == 0 || this.jComboBox3.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar todos los espacios");
                sirve = false;
            }
            for (Disponibilidad clark : monty) {
                if (clark.getIdMedico().equals(this.id) && clark.getDia().equals(this.jComboBox1.getSelectedItem())) {
                    JOptionPane.showMessageDialog(null, "Ya hay una disponibilidad ese día");
                    sirve = false;
                }
            }
            if (this.jComboBox2.getSelectedIndex() >= this.jComboBox3.getSelectedIndex()) {
                JOptionPane.showMessageDialog(null, "Las horas no tienen sentido");
                sirve = false;
            }
        }
        if (this.opcion == 2) {
            if (this.jComboBox4.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar un día");
                sirve = false;
            }
            for (Disponibilidad clark : monty) {
                if (clark.getIdMedico().equals(this.id) && clark.getDia().equals(this.jComboBox4.getSelectedItem())) {
                    sirve = true;
                }
            }
        }
        return sirve;

    }

    private void agregar() {
        this.jComboBox1.setVisible(true);
        this.jComboBox2.setVisible(true);
        this.jComboBox3.setVisible(true);
        this.jComboBox4.setVisible(false);
        this.jButton5.setVisible(true);

    }

    private void eliminar() {
        this.jComboBox1.setVisible(false);
        this.jComboBox2.setVisible(false);
        this.jComboBox3.setVisible(false);
        this.jComboBox4.setVisible(true);
        this.jButton5.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == this.jButton3) {
            this.setVisible(false);
            this.entry.setVisible(true);
        }
        if (evento.getSource() == this.jButton4) {
            this.agregar();
            this.opcion = 1;
        }
        if (evento.getSource() == this.jButton6) {
            this.eliminar();
            this.opcion = 2;
        }
        if (evento.getSource() == this.jButton5) {
            if (this.validar() == true) {
                if (this.opcion == 1) {
                    Disponibilidad dispo = new Disponibilidad(this.id, (String) this.jComboBox1.getSelectedItem(), (String) this.jComboBox2.getSelectedItem(), (String) this.jComboBox3.getSelectedItem());
                    this.gestor.guardaDisponibilidades(dispo);
                    this.modelaTabla();
                }
                if (this.opcion == 2) {
                    this.gestor.eliminarDisponibilidad(this.id);
                    this.modelaTabla();
                }
            }
        }

    }

}
