
package com.mycompany.automovil.igu;

import com.mycompany.automovil.logica.Automovil;
import com.mycompany.automovil.logica.Controladora;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultaAutomovil extends javax.swing.JFrame {
    
    Controladora control = new Controladora();

    public ConsultaAutomovil() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAutos = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("CONSULTA DE AUTOMÓVILES");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaAutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaAutos);

        btnEliminar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(227, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        // Control de que la tabla no esté vacía
        if(tablaAutos.getRowCount() > 0) {
            // Valido que se haya seleccionado un registro
            if(tablaAutos.getSelectedRow() != -1) {
                // Obtener el Id del auto a borrrar
                int idAuto = Integer.parseInt(String.valueOf(tablaAutos.getValueAt(tablaAutos.getSelectedRow(), 0)));
                
                control.borrarAuto(idAuto);
                mostrarMensaje("Auto borrado correctamente", "Info", "Borrado Exitoso");
                cargarTabla();
            } else {
                mostrarMensaje("No selecciono un registro para eliminar", "Error", "Error en Eliminar");
            }
        } else {
            mostrarMensaje("La tabla está vacía, no se puede eliminar", "Error", "Error en Eliminar");
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
        // Control de que la tabla no esté vacía
        if(tablaAutos.getRowCount() > 0) {
            // Valido que se haya seleccionado un registro
            if(tablaAutos.getSelectedRow() != -1) {
                
                // Obtener el Id del auto a modificar
                int idAuto = Integer.parseInt(String.valueOf(tablaAutos.getValueAt(tablaAutos.getSelectedRow(), 0)));
                
                ModifAuto modif = new ModifAuto(idAuto);
                modif.setVisible(true);
                modif.setLocationRelativeTo(null);
                this.dispose();
                
            } else {
                mostrarMensaje("No selecciono un registro para modificar", "Error", "Error en Modificar");
            }
        } else {
            mostrarMensaje("La tabla está vacía, no se puede modificar", "Error", "Error en Modificar");
        }
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        cargarTabla();
        
    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaAutos;
    // End of variables declaration//GEN-END:variables

    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if(tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    
    private void cargarTabla() {
        
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            
            // Hacemos que la tabla no sea editable
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        // Ponemos titulos a las columnas
        String titulos[] = {"Id", "Modelo", "Marca", "Motor", "Color", "Patente", "Puertas"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        // Traer los autos desde la BD
        List<Automovil> listaAutos = control.traerAutos();
        
        // Setear los datos en la tabla
        if (listaAutos != null) {
            for(Automovil auto : listaAutos){
                Object[] object = {auto.getId(), auto.getModelo(), auto.getMarca(), auto.getMotor(), 
                auto.getColor(), auto.getPatente(), auto.getCantPuerta()};
                
                modeloTabla.addRow(object);
            }
        }
        
        tablaAutos.setModel(modeloTabla);
    }
}
