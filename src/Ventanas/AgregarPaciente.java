/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Conexion;
import Clases.Medico;
import Clases.Paciente;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author UNI
 */
public class AgregarPaciente extends javax.swing.JInternalFrame {

    /**
     * Creates new form AgregarDoctor
     */
    public AgregarPaciente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cmbSangre = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlergia = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtEnfermedad = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Agregar Paciente");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel7.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel7.setText("Nombres");

        txtNombre.setDoubleBuffered(true);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel10.setText("Apellidos");

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel9.setText("Peso");

        jLabel13.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel13.setText("Tipo de Sangre");

        cmbSangre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Seleccione>", "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));

        jLabel14.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel14.setText("Alergias");

        txtPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesoKeyTyped(evt);
            }
        });

        txtAlergia.setColumns(20);
        txtAlergia.setRows(5);
        txtAlergia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAlergiaKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtAlergia);

        jLabel15.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel15.setText("Enfermedades");

        txtEnfermedad.setColumns(20);
        txtEnfermedad.setRows(5);
        jScrollPane2.setViewportView(txtEnfermedad);

        jLabel11.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel11.setText("Altura");

        txtAltura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAlturaKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel12.setText("Edad");

        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel16.setText("Telefono");

        try {
            txtTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cmbSangre, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelefono)
                    .addComponent(txtApellido)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSangre, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1435355686_pencil.png"))); // NOI18N
        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1435355589_floppy.png"))); // NOI18N
        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1435355601_sign-error.png"))); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(10, 10, 10)
                        .addComponent(jButton2)
                        .addGap(10, 10, 10)
                        .addComponent(jButton3))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(30, 30, 30))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 656, 612);
    }// </editor-fold>//GEN-END:initComponents

    public void Guardar(){
        String Nombre = txtNombre.getText().trim();
        String Apellido = txtApellido.getText().trim();
        String PesoF = txtPeso.getText().trim();
        String AlturaF = txtAltura.getText().trim();
        String EdadF = txtEdad.getText().trim();
        float Peso = Float.parseFloat(PesoF);
        float Altura = Float.parseFloat(AlturaF);
        int Edad = Integer.parseInt(EdadF);
        String TipoSangre = (String) cmbSangre.getSelectedItem();
        String Alergias = txtAlergia.getText().trim();
        String Enfermedades = txtEnfermedad.getText().trim();
        String Telefono = txtTelefono.getText().trim();
        
        if("".equals(Nombre)||"".equals(Apellido)||"<Seleccione>".equals(TipoSangre)||
                "".equals(PesoF)||"".equals(AlturaF)||"".equals(EdadF)||"".equals(Alergias)||"".equals(Enfermedades)){
                    JOptionPane.showMessageDialog
        (this, "Complete todos los campos y seleccione correctamente",
                "Complete",JOptionPane.ERROR_MESSAGE);
        }
        else{
            Paciente.Agregar_Paciente(Nombre, Apellido, Peso, Altura, Edad, Alergias, Enfermedades, TipoSangre, Telefono);
            Limpiar();// TODO add your handling code here:

            }
        
    }
    
     public void ValidarDinero(java.awt.event.KeyEvent evt, JTextField txtPrecio) {
        
        char a = evt.getKeyChar();
        
        if (!Character.isDigit(a) && !Character.isISOControl(a) && a != '.') {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
            return;
        }
        
        if ("0".equals(txtPrecio.getText()) && txtPrecio.getCaretPosition() == 1 && a != '.' && !Character.isISOControl(a)) {
            txtPrecio.setText(txtPrecio.getText() + ".");
//        return;
        }
        
        if (a == '.' && txtPrecio.getText().contains(".")) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
            return;
        }
        
        String x1 = "";
        if (Character.isDigit(a) || (Character.isISOControl(a) && !"".equals(txtPrecio.getText()))) {
            x1 = txtPrecio.getText();
        }
        if (Character.isDigit(a) || (a == '.')) {
            x1 = txtPrecio.getText().concat(String.valueOf(a));
        }
        
        if (!"".equals(x1)) {
            
            try {
                
                Double x = Double.parseDouble(x1);
                
                if (x > Double.MAX_VALUE) {
                    Toolkit.getDefaultToolkit().beep();
                    evt.consume();
                }
                
            } catch (NumberFormatException ex) {
                Toolkit.getDefaultToolkit().beep();
                evt.consume();
            }
        }
        
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Guardar(); 
    }//GEN-LAST:event_jButton2ActionPerformed

    ResultSet resultado;
    int ID_Esp [];
    
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        
// TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameOpened

    public void Limpiar(){
        txtApellido.setText("");
        txtTelefono.setText("");
        txtAlergia.setText("");
        txtAltura.setText("");
        txtNombre.setText("");
        txtEnfermedad.setText("");
        txtPeso.setText("");
        txtEdad.setText("");
        cmbSangre.setSelectedIndex(0);
        
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Limpiar();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtAlergiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAlergiaKeyTyped
if(evt.getKeyChar() == KeyEvent.VK_TAB){
  txtEnfermedad.requestFocus();
}// TODO add your handling code here:
    }//GEN-LAST:event_txtAlergiaKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
char a = evt.getKeyChar();

if(!Character.isLetter(a)&&!Character.isISOControl(a)&&a!=' '){
    evt.consume();
    Toolkit.getDefaultToolkit().beep();
}        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
char a = evt.getKeyChar();

if(!Character.isLetter(a)&&!Character.isISOControl(a)&&a!=' '){
    evt.consume();
    Toolkit.getDefaultToolkit().beep();
}        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
char a = evt.getKeyChar();

if(!Character.isDigit(a)&&!Character.isISOControl(a)){
    evt.consume();
    Toolkit.getDefaultToolkit().beep();
}        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadKeyTyped

    private void txtPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoKeyTyped
        ValidarDinero(evt, txtPeso);        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoKeyTyped

    private void txtAlturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAlturaKeyTyped
        ValidarDinero(evt, txtAltura);        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlturaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbSangre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtAlergia;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextArea txtEnfermedad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JFormattedTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
