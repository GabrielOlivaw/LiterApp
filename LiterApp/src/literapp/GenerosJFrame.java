package literapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author gabag
 */
public class GenerosJFrame extends javax.swing.JFrame {
    
    private static GenerosJFrame instance;
    
    private ArrayList<Genero> generos;
    
    private boolean nuevo;

    /**
     * Creates new form GenerosJFrame
     */
    public GenerosJFrame() {
        initComponents();
        
        nuevo = false;
        
        cargarDatos();
    }
    
    /**
     * Implementación del patrón Singleton para tener una única ventana.
     * 
     * @return La instancia única de la ventana de géneros.
     */
    public static GenerosJFrame getInstance() {
        if (instance == null)
            instance = new GenerosJFrame();
        
        return instance;
    }
    
    private void cargarDatos() {
        
        activarCamposGenero(false);
        
        generos = new ArrayList<>();
        
        Statement s;
        Connection con = ConectorMySQL.conectarBD();
        
        String consulta = "SELECT * FROM generos";
        
        try {
            s = con.createStatement();
            
            ResultSet rs = s.executeQuery(consulta);
            
            while (rs.next())
                generos.add(new Genero(rs.getInt(1), rs.getString(2), rs.getString(3)));
            
            
        } catch (SQLException ex) {
            Logger.getLogger(GenerosJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(GenerosJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        DefaultListModel listModel = (DefaultListModel)jListGeneros.getModel();
        listModel.removeAllElements();
        
        for (int i=0; i < generos.size(); i++)
            listModel.addElement(generos.get(i).getGenero());
    }
    
    private void activarCamposGenero(boolean val) {
        jTextFieldNombre.setEnabled(val);
        jTextAreaDescripcion.setEnabled(val);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneGeneros = new javax.swing.JScrollPane();
        jListGeneros = new javax.swing.JList<>();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelDescripcion = new javax.swing.JLabel();
        jScrollPaneDescripcion = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jButtonNuevo = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Géneros literarios");
        setResizable(false);

        jListGeneros.setModel(new DefaultListModel());
        jListGeneros.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListGeneros.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListGenerosValueChanged(evt);
            }
        });
        jScrollPaneGeneros.setViewportView(jListGeneros);

        jLabelNombre.setText("Nombre");

        jTextFieldNombre.setEnabled(false);

        jLabelDescripcion.setText("Descripción");

        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setRows(5);
        jTextAreaDescripcion.setEnabled(false);
        jScrollPaneDescripcion.setViewportView(jTextAreaDescripcion);

        jButtonNuevo.setText("Nuevo género");
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar género");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPaneDescripcion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelNombre)
                                    .addGap(61, 61, 61)
                                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabelDescripcion))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonEditar)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPaneGeneros, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonAceptar)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneGeneros, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNuevo)
                    .addComponent(jButtonEditar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelDescripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPaneDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptar)
                    .addComponent(jButtonCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jListGenerosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListGenerosValueChanged
        // TODO add your handling code here:
        activarCamposGenero(false);
        if (jListGeneros.getSelectedIndex() != -1) {
            jTextFieldNombre.setText(generos.get(jListGeneros.getSelectedIndex()).getGenero());
            jTextAreaDescripcion.setText(generos.get(jListGeneros.getSelectedIndex()).getDescripcion());
        }
    }//GEN-LAST:event_jListGenerosValueChanged

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
        activarCamposGenero(true);
        nuevo = false;
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        activarCamposGenero(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        // TODO add your handling code here:
        activarCamposGenero(true);
        jTextFieldNombre.setText("");
        jTextAreaDescripcion.setText("");
        nuevo = true;
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        // TODO add your handling code here:
        
        PreparedStatement ps;
        Connection con = ConectorMySQL.conectarBD();
        
        String consulta;
        
        if (!nuevo) 
            consulta = "UPDATE generos SET genero = ?, descripcion = ? WHERE id = ?";
        else
            consulta = "INSERT INTO generos (genero, descripcion) VALUES (?, ?)";
        
        try {
            ps = con.prepareStatement(consulta);
            
            ps.setString(1, jTextFieldNombre.getText());
            ps.setString(2, jTextAreaDescripcion.getText());
            if (!nuevo)
                ps.setInt(3, generos.get(jListGeneros.getSelectedIndex()).getId());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error en la "
                    + "consulta SQL introducida para insertar/actualizar un "
                    + "género.", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                con.close();
                
                cargarDatos();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error en la conexión MySQL "
                        + "con la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }        
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Look and feel */
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | 
                IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibrosJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerosJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JList<String> jListGeneros;
    private javax.swing.JScrollPane jScrollPaneDescripcion;
    private javax.swing.JScrollPane jScrollPaneGeneros;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}