package app;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Suricata
 */
public class empleado extends javax.swing.JFrame {

    public static final String URL = "jdbc:mysql://localhost:3307/escuela";//Nombre de la BD(Escuela);
    public static final String USERNAME = "root";
    public static final String PASSWORD = "1qaz";
    
    PreparedStatement ps;
    ResultSet res;

    //Metodo de tipo conexion 
    public static Connection getConection() {

        Connection conex = null;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            conex = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            JOptionPane.showMessageDialog(null, "Conexión Exitosa!");
        } catch (Exception ex) {

            System.out.println("Error" + ex);
        }
        return conex;
    }//Finaliza Metodo de conexion a la BD
    
    private void LimpiarCampos(){
    
        txtClave.setText(null);
        txtNombre.setText(null);
        txtPaterno.setText(null);
        txtMaterno.setText(null);
        txtTelefono.setText(null);
        txtCorreo.setText(null);
        cbxGenero.setSelectedIndex(0);
        cbxRol.setSelectedIndex(0);
    }

    public empleado() {
        initComponents();
        txtId.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPaterno = new javax.swing.JTextField();
        txtMaterno = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbxGenero = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbxRol = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnModifica = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Uso de MySQL y Java");
        setResizable(false);

        jLabel1.setText("Clave:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Paterno:");

        jLabel4.setText("Materno:");

        jLabel5.setText("Teléfono:");

        jLabel6.setText("Correo:");

        jLabel7.setText("Género:");

        cbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opción", "Masculino", "Femenino" }));

        jLabel8.setText("Puesto:");

        cbxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Recursos Humanos", "Administración", "Mantenimiento", "Sistemas" }));

        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        txtId.setEnabled(false);

        btnGuardar.setText("Guardar");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });

        btnModifica.setText("Modificar");
        btnModifica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificaMouseClicked(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtClave)
                        .addGap(18, 18, 18)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbxRol, javax.swing.GroupLayout.Alignment.LEADING, 0, 352, Short.MAX_VALUE)
                            .addComponent(cbxGenero, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaterno, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(btnModifica)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar))
                            .addComponent(txtPaterno, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(45, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(cbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbxRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnModifica)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        
        Connection conexion = null;
        
        try{
            conexion=getConection();
            ps=(PreparedStatement) conexion.prepareStatement("INSERT INTO empleado(clave,nombre,apaterno,amaterno,telefonoemp,correoemp,genero,puestoemp) VALUES(?,?,?,?,?,?,?,?)");
            ps.setString(1,txtClave.getText().toString().trim());
            ps.setString(2,txtNombre.getText().toString().trim());
            ps.setString(3,txtPaterno.getText().toString().trim());
            ps.setString(4,txtMaterno.getText().toString().trim());
            ps.setString(5,txtTelefono.getText().toString().trim());
            ps.setString(6,txtCorreo.getText().toString().trim());
            ps.setString(7,cbxGenero.getSelectedItem().toString());
            ps.setString(8,cbxRol.getSelectedItem().toString());
            
            int res = ps.executeUpdate();
            if(res>0){
                 JOptionPane.showMessageDialog(null,"Los datos han sido registrados.");
                 LimpiarCampos();
            }else{
                 JOptionPane.showMessageDialog(null,"Ha ocurriso un error al guardar datos.");
                 LimpiarCampos();
            }
            
            conexion.close();
            
        }catch(Exception ex){
            
            System.err.println("Error:"+ex);
        }
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        // TODO add your handling code here:
         Connection conexion = null;
         
         try{
            conexion=getConection();
            ps=(PreparedStatement) conexion.prepareStatement("SELECT * FROM empleado WHERE clave=?");
            ps.setString(1,txtClave.getText());
            res = ps.executeQuery();
            
            if(res.next()){
                
                txtId.setText(res.getString("id"));
                txtNombre.setText(res.getString("nombre"));
                txtPaterno.setText(res.getString("apaterno"));
                txtMaterno.setText(res.getString("amaterno"));
                txtTelefono.setText(res.getString("telefonoemp"));
                txtCorreo.setText(res.getString("correoemp"));
                txtId.setText(res.getString("id"));
                cbxGenero.setSelectedItem(res.getString("genero"));
                cbxRol.setSelectedItem(res.getString("puestoemp")); 
            }else{
            
                JOptionPane.showMessageDialog(null,"No hay datos con ese número de clave.");
            }
                    
            conexion.close();
            
        }catch(Exception ex){
            
            System.err.println("Error:"+ex);
        }
         
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnModificaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificaMouseClicked
        // TODO add your handling code here:
        
         Connection conexion = null;
        
        try{
            conexion=getConection();
            ps=(PreparedStatement) conexion.prepareStatement("UPDATE empleado SET clave=?,nombre=?,apaterno=?,amaterno=?,telefonoemp=?,correoemp=?,genero=?,puestoemp=? WHERE id=?");
            ps.setString(1,txtClave.getText().toString().trim());
            ps.setString(2,txtNombre.getText().toString().trim());
            ps.setString(3,txtPaterno.getText().toString().trim());
            ps.setString(4,txtMaterno.getText().toString().trim());
            ps.setString(5,txtTelefono.getText().toString().trim());
            ps.setString(6,txtCorreo.getText().toString().trim());
            ps.setString(7,cbxGenero.getSelectedItem().toString());
            ps.setString(8,cbxRol.getSelectedItem().toString());
            ps.setString(9,txtId.getText().toString());
            
            int res = ps.executeUpdate();
            if(res>0){
                 JOptionPane.showMessageDialog(null,"El registro ha sido modificado.");
                 LimpiarCampos();
            }else{
                 JOptionPane.showMessageDialog(null,"Ha ocurriso un error al modificar datos.");
                 LimpiarCampos();
            }
            
            conexion.close();
            
        }catch(Exception ex){
            
            System.err.println("Error:"+ex);
        }
        
        
    }//GEN-LAST:event_btnModificaMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        // TODO add your handling code here:
        
        Connection conexion = null;
        
        try{
            conexion=getConection();
            ps=(PreparedStatement) conexion.prepareStatement("DELETE FROM empleado WHERE id=?");
            ps.setInt(1,Integer.parseInt(txtId.getText().toString()));
            
            int res = ps.executeUpdate();
            if(res>0){
                 JOptionPane.showMessageDialog(null,"El registro ha sido eliminado.");
                 LimpiarCampos();
            }else{
                 JOptionPane.showMessageDialog(null,"Ha ocurriso un error al eliminar registro.");
                 LimpiarCampos();
            }
            
            conexion.close();
            
        }catch(Exception ex){
            
            System.err.println("Error:"+ex);
        }
        
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        // TODO add your handling code here:
         LimpiarCampos();
    }//GEN-LAST:event_btnLimpiarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModifica;
    private javax.swing.JComboBox<String> cbxGenero;
    private javax.swing.JComboBox<String> cbxRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMaterno;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPaterno;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
