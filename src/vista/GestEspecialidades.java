/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import gestion.GestionEspecialidades;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import negocio.Especialidad;

/**
 *
 * @author cesar
 */
public class GestEspecialidades extends javax.swing.JFrame implements ActionListener, KeyListener, ItemListener {
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Gestión Especialidades");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));

        jButton1.setBackground(new java.awt.Color(255, 204, 0));
        jButton1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 204, 0));
        jButton1.setText("Regresar");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton2.setBackground(new java.awt.Color(255, 204, 51));
        jButton2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("Guardar");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setEnabled(false);

        jTextField1.setEnabled(false);

        jButton4.setBackground(new java.awt.Color(255, 204, 51));
        jButton4.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 51, 51));
        jButton4.setText("Nueva");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton5.setBackground(new java.awt.Color(255, 204, 51));
        jButton5.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 16)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 51, 51));
        jButton5.setText("Modificar");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setEnabled(false);

        jTextField2.setEnabled(false);

        jButton6.setBackground(new java.awt.Color(255, 204, 51));
        jButton6.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 16)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 51, 51));
        jButton6.setText("Guardar");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setEnabled(false);

        jButton7.setBackground(new java.awt.Color(255, 204, 51));
        jButton7.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 16)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 51, 51));
        jButton7.setText("Eliminar");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                                    .addComponent(jTextField2))
                                .addGap(18, 18, 18)
                                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
    private ButtonGroup bg;
    private Entrada entry;
    private GestionEspecialidades gestor;

    public GestEspecialidades(Entrada entry) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.poneraEscuchar();
        this.entry = entry;
        this.gestor = new GestionEspecialidades();
        this.basics();

    }

    private void poneraEscuchar() {
        this.jButton2.addActionListener(this);
        this.jButton1.addActionListener(this);
        this.jButton4.addActionListener(this);
        this.jButton5.addActionListener(this);
        this.jButton6.addActionListener(this);
        this.jButton7.addActionListener(this);

        this.jButton1.addKeyListener(this);
        this.jButton2.addKeyListener(this);
        this.jButton4.addKeyListener(this);
        this.jButton5.addKeyListener(this);
        this.jButton6.addKeyListener(this);
        this.jButton7.addKeyListener(this);

        this.jTextField1.addKeyListener(this);
        this.jTextField2.addKeyListener(this);

        this.jComboBox1.addItemListener(this);

    }

    private void basics() {
        this.jButton2.setEnabled(false);
        this.jTextField1.setEnabled(false);
        this.jTextField1.setText("");
        this.jButton6.setEnabled(false);
        this.jButton7.setEnabled(false);
        this.jTextField2.setEnabled(false);
        this.jTextField2.setText("");
        this.llenaCombo();

    }

    private void llenaCombo() {
        this.jComboBox1.removeAllItems();
        ArrayList<Especialidad> espec = this.gestor.getEspecialidades();
        this.jComboBox1.addItem("Seleccione Especialidad:");
        for (Especialidad l : espec) {
            this.jComboBox1.addItem(l.getEspecialidad());
        }
        this.jComboBox1.setSelectedIndex(0);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        String name;

        if (evento.getSource() == this.jButton1) {
            this.setVisible(false);
            this.entry.setVisible(true);
        }
        if (evento.getSource() == this.jButton4) {
            this.jButton2.setEnabled(true);
            this.jTextField1.setEnabled(true);
        }
        if (evento.getSource() == this.jButton5) {
            this.jButton6.setEnabled(true);
            this.jButton7.setEnabled(true);
            this.jTextField2.setEnabled(true);

        }
        if (evento.getSource() == this.jButton2) {
            name = this.jTextField1.getText();
            if (this.jTextField1.getText().length() < 3) {
                JOptionPane.showMessageDialog(null, "Escriba un nombre válido");
                this.basics();
            } else {
                if (this.gestor.pruebaExistencia(name) == true) {
                    JOptionPane.showMessageDialog(null, "Ya existe ese nombre");
                    this.basics();
                } else {
                    int dialogButton = JOptionPane.YES_NO_OPTION;
                    JOptionPane.showConfirmDialog(null, "¿Está segur@?", "Atento", dialogButton);
                    if (dialogButton == JOptionPane.YES_OPTION) {
                        Especialidad esp = new Especialidad(name, this.buildId());
                        this.gestor.saveEspecialidad(esp);
                        this.basics();
                    }
                }
            }
        }
        if (evento.getSource() == this.jButton7) {
            int y = this.jComboBox1.getItemCount();
            name = this.jTextField2.getText();
            this.gestor.eliminarEspecialidad(name);
            this.basics();

        }
        if (evento.getSource() == this.jButton6) {
            name = this.jTextField2.getText();
            if (this.jTextField2.getText().length() < 3) {
                JOptionPane.showMessageDialog(null, "Escriba un nombre válido");
                this.basics();
            } else {
                if (this.gestor.pruebaExistencia(name) == true) {
                    JOptionPane.showMessageDialog(null, "Ya existe ese nombre");
                    this.basics();
                } else {                   
                        this.gestor.modificarEspecialidad((String) this.jComboBox1.getSelectedItem(),name);
                        this.basics();
                    
                }
            }

        }
    }

    private String buildId() {
        String id = "", letter = "";
        int number;
        number = (int) Math.floor((Math.random() * 98) + 10);
        
            letter = this.jTextField1.getText().substring(0, 3);
            id = letter + number;
               
        return id;

    }

    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        if (e.getSource() == jTextField1 || e.getSource() == jTextField2) {
            if (!(Character.isLetter(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_SPACE || c == KeyEvent.VK_ENTER)) {
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "No está permitido ese carácter");
                e.consume();
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e
    ) {
        int key = e.getKeyCode();
        if (e.getSource() == jButton1) {

            if (key == KeyEvent.VK_UP) {
                if (jButton7.isEnabled()) {
                    jButton7.requestFocus();
                }
            }
            if (key == KeyEvent.VK_DOWN) {
                if (jTextField1.isEnabled()) {
                    jTextField1.requestFocus();
                }
                jButton4.requestFocus();

            }
        }
        if (e.getSource() == jButton7) {

            if (key == KeyEvent.VK_UP) {
                if (jTextField2.isEnabled()) {
                    jTextField2.requestFocus();
                }
            }
            if (key == KeyEvent.VK_DOWN) {
                if (jButton1.isEnabled()) {
                    jButton1.requestFocus();
                }
            }
            if (key == KeyEvent.VK_RIGHT) {
                if (jButton6.isEnabled()) {
                    jButton6.requestFocus();
                }
            }
            if (key == KeyEvent.VK_LEFT) {
                if (jButton5.isEnabled()) {
                    jButton5.requestFocus();
                }
            }

        }
        if (e.getSource() == jButton6) {

            if (key == KeyEvent.VK_UP) {
                if (jComboBox1.isEnabled()) {
                    jComboBox1.requestFocus();
                }
            }
            if (key == KeyEvent.VK_DOWN) {
                if (jButton7.isEnabled()) {
                    jButton7.requestFocus();
                }
            }
            if (key == KeyEvent.VK_RIGHT) {
                if (jButton5.isEnabled()) {
                    jButton5.requestFocus();
                }
            }
            if (key == KeyEvent.VK_LEFT) {
                if (jTextField2.isEnabled()) {
                    jTextField2.requestFocus();
                }
            }

        }
        if (e.getSource() == jButton5) {

            if (key == KeyEvent.VK_UP) {
                if (jComboBox1.isEnabled()) {
                    jComboBox1.requestFocus();
                }
            }
            if (key == KeyEvent.VK_DOWN) {
                if (jButton7.isEnabled()) {
                    jButton7.requestFocus();
                }
            }
            if (key == KeyEvent.VK_RIGHT) {
                if (!jTextField2.isEnabled()) {
                    jButton7.requestFocus();
                } else {
                    jTextField2.requestFocus();
                }
            }
            if (key == KeyEvent.VK_LEFT) {
                if (jButton6.isEnabled()) {
                    jButton6.requestFocus();
                }
            }
        }
        if (e.getSource() == jTextField2) {
            if (key == KeyEvent.VK_ENTER) {
                if (jButton6.isEnabled()) {
                    jButton6.requestFocus();
                }
            }
            if (key == KeyEvent.VK_UP) {
                if (jComboBox1.isEnabled()) {
                    jComboBox1.requestFocus();
                }
            }
            if (key == KeyEvent.VK_DOWN) {
                if (jButton7.isEnabled()) {
                    jButton7.requestFocus();
                }
            }
            if (key == KeyEvent.VK_RIGHT) {
                if (jButton6.isEnabled()) {
                    jButton6.requestFocus();
                }
            }
            if (key == KeyEvent.VK_LEFT) {
                if (jButton5.isEnabled()) {
                    jButton5.requestFocus();
                }
            }
        }
        if (e.getSource() == jComboBox1) {
            if (key == KeyEvent.VK_UP) {
                if (jTextField1.isEnabled()) {
                    jTextField1.requestFocus();
                }
            }

            if (key == KeyEvent.VK_DOWN) {
                if (jTextField2.isEnabled()) {
                    jTextField2.requestFocus();
                }
            }

        }
        if (e.getSource() == jButton2) {

            if (key == KeyEvent.VK_UP) {
                if (jButton1.isEnabled()) {
                    jButton1.requestFocus();
                }
            }
            if (key == KeyEvent.VK_DOWN) {
                if (jComboBox1.isEnabled()) {
                    jComboBox1.requestFocus();
                }
            }
            if (key == KeyEvent.VK_RIGHT) {
                if (jButton4.isEnabled()) {
                    jButton4.requestFocus();
                }
            }
            if (key == KeyEvent.VK_LEFT) {
                if (jTextField1.isEnabled()) {
                    jTextField1.requestFocus();
                }
            }
        }
        if (e.getSource() == jButton4) {

            if (key == KeyEvent.VK_UP) {
                if (jButton1.isEnabled()) {
                    jButton1.requestFocus();
                }
            }
            if (key == KeyEvent.VK_DOWN) {
                if (jComboBox1.isEnabled()) {
                    jComboBox1.requestFocus();
                }
            }
            if (key == KeyEvent.VK_RIGHT) {
                if (jTextField1.isEnabled()) {
                    jTextField1.requestFocus();
                }
            }
            if (key == KeyEvent.VK_LEFT) {
                if (jButton2.isEnabled()) {
                    jButton2.requestFocus();
                }
            }
        }
        if (e.getSource() == jTextField1) {

            if (key == KeyEvent.VK_UP) {
                if (jButton1.isEnabled()) {
                    jButton1.requestFocus();
                }
            }
            if (key == KeyEvent.VK_DOWN) {
                if (jComboBox1.isEnabled()) {
                    jComboBox1.requestFocus();
                }
            }
            if (key == KeyEvent.VK_RIGHT) {
                if (jButton2.isEnabled()) {
                    jButton2.requestFocus();
                }
            }
            if (key == KeyEvent.VK_LEFT) {
                if (jButton4.isEnabled()) {
                    jButton4.requestFocus();
                }
            }
        }

    }

    @Override
    public void keyReleased(KeyEvent e
    ) {
    }

    @Override
    public void itemStateChanged(ItemEvent e
    ) {
        if (e.getSource() == jComboBox1) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                int index = this.jComboBox1.getSelectedIndex();
                String item = (String) this.jComboBox1.getSelectedItem();

                if (index > 0) {
                    this.jTextField2.setText((String) this.jComboBox1.getSelectedItem());
                    this.jButton5.setEnabled(true);
                    this.jButton7.setEnabled(true);
                }
                if (index == 0) {
                    this.jButton5.setEnabled(false);
                    this.jButton7.setEnabled(false);
                    this.jTextField2.setEnabled(false);

                }
            }
        }
    }

}
