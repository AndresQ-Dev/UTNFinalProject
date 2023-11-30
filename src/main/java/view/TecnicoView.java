package view;

import controller.ControladorIncidente;
import controller.ControladorTecnico;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import model.Incidente;
import model.Tecnico;

public class TecnicoView extends javax.swing.JPanel {

    //Implemento Singleton
    private static TecnicoView instanciaUnica;

    //Formato para mostrar la fecha y hora 
    private DateFormat dateFormat = new SimpleDateFormat("EEEEE, dd/MM/yyyy HH:mm:ss");
    private ControladorTecnico controlTecnico = new ControladorTecnico();
    private ControladorIncidente controlIncidente = new ControladorIncidente();

    DefaultTableModel modeloTablaIncidentesPorTecnico = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    private TecnicoView() {
        initComponents();
        cargarCombo();
        cargarCabeceraTablaIncidentes();
    }

    public static TecnicoView obtenerInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new TecnicoView();
        }
        return instanciaUnica;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbListadoTecnicos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListaIncidentesPorTecnicos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        tfIdIncidente = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        taDetalle = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        taObservaciones = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1024, 740));

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administración de Incidentes");

        cbListadoTecnicos.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        cbListadoTecnicos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbListadoTecnicosItemStateChanged(evt);
            }
        });
        cbListadoTecnicos.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbListadoTecnicosPropertyChange(evt);
            }
        });

        tbListaIncidentesPorTecnicos.setModel(new javax.swing.table.DefaultTableModel(
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
        tbListaIncidentesPorTecnicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbListaIncidentesPorTecnicosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbListaIncidentesPorTecnicos);

        jButton1.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jButton1.setText("Finalizar Incidente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tfIdIncidente.setEditable(false);

        taDetalle.setEditable(false);
        taDetalle.setColumns(20);
        taDetalle.setLineWrap(true);
        taDetalle.setRows(5);
        jScrollPane2.setViewportView(taDetalle);

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel3.setText("Detalle");

        taObservaciones.setColumns(20);
        taObservaciones.setLineWrap(true);
        taObservaciones.setRows(5);
        taObservaciones.setFocusable(false);
        jScrollPane3.setViewportView(taObservaciones);

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel4.setText("Observaciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(cbListadoTecnicos, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfIdIncidente, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel3)))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(47, 47, 47))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(cbListadoTecnicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfIdIncidente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbListadoTecnicosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbListadoTecnicosPropertyChange

    }//GEN-LAST:event_cbListadoTecnicosPropertyChange

    private void cbListadoTecnicosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbListadoTecnicosItemStateChanged
        //cargar incidentes a tabla
        limpiarTablaIncidentes();
        // Obtener el técnico seleccionado del ComboBox
        Tecnico tecnicoSeleccionado = (Tecnico) cbListadoTecnicos.getSelectedItem();
        // Verificar null
        if (tecnicoSeleccionado != null) {
            // traigo todos los incidentes
            List<Incidente> todosLosIncidentes = controlIncidente.listarIncidentes();

            //probando API Stream con Lambda...
            List<Incidente> incidentesTecnico = todosLosIncidentes
                    .stream()
                    .filter(incidente -> incidente.getTecnico().getApellidoNombre().equals(tecnicoSeleccionado.getApellidoNombre()) && incidente.isEstado())
                    .collect(Collectors.toList());

            // Lleno la tabla con incidentes del técnico
            for (Incidente incidente1 : incidentesTecnico) {
                String estado = incidente1.isEstado() ? "Activo" : "Finalizado";
                modeloTablaIncidentesPorTecnico.addRow(new Object[]{
                    incidente1.getIdIncidente(),
                    incidente1.getCliente().getRazonSocial(),
                    incidente1.getDetalle(),
                    dateFormat.format(incidente1.getFechaAlta()),
                    estado});
            }
        }
        limpiarCampos();
    }//GEN-LAST:event_cbListadoTecnicosItemStateChanged

    private void tbListaIncidentesPorTecnicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbListaIncidentesPorTecnicosMouseClicked
        // TODO add your handling code here:
        int rowSelect = tbListaIncidentesPorTecnicos.getSelectedRow();
        if (rowSelect != -1) {
            int idIncidente = (int) tbListaIncidentesPorTecnicos.getValueAt(rowSelect, 0);
            Incidente incidente = controlIncidente.buscarIncidentePorId(idIncidente);
            if (incidente != null) {
                tfIdIncidente.setText(String.valueOf(incidente.getIdIncidente()));
                taDetalle.setText(incidente.getDetalle());
            }
        }
    }//GEN-LAST:event_tbListaIncidentesPorTecnicosMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!tfIdIncidente.getText().isEmpty()) {
            if (!taObservaciones.getText().isEmpty()) {
                String observ = taObservaciones.getText();
                String idIncidenteSrt = tfIdIncidente.getText();
                Incidente incidente = controlIncidente.buscarIncidentePorId(Integer.parseInt(idIncidenteSrt));
                if (incidente != null) {
                    incidente.setObservacionesTecnico(observ);
                    try {
                        controlIncidente.editarIncidente(incidente);
                        JOptionPane.showMessageDialog(null, "Incidente finalizado.");
                        liberarTecnico(incidente);
                        limpiarCampos();
                    } catch (Exception ex) {
                        Logger.getLogger(TecnicoView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe escribir un comentario para cerrar un incidente.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe elegir un incidente activo.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Tecnico> cbListadoTecnicos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea taDetalle;
    private javax.swing.JTextArea taObservaciones;
    private javax.swing.JTable tbListaIncidentesPorTecnicos;
    private javax.swing.JTextField tfIdIncidente;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo() {
        List<Tecnico> listadoDeTecnicos = controlTecnico.listarTecnicos();
        if (listadoDeTecnicos != null && !listadoDeTecnicos.isEmpty()) {
            // Ordenar la lista
            Collections.sort(listadoDeTecnicos);

            DefaultComboBoxModel<Tecnico> modeloCombo = new DefaultComboBoxModel<>(listadoDeTecnicos.toArray(new Tecnico[0]));
            cbListadoTecnicos.setModel(modeloCombo);

            // filtrar tecnicos activos con Stream :)
            List<Tecnico> tecnicosActivos = listadoDeTecnicos
                    .stream()
                    .filter(tecnico -> tecnico.isEstado())
                    .collect(Collectors.toList());

            DefaultComboBoxModel<Tecnico> modeloComboFiltrado = new DefaultComboBoxModel<>(tecnicosActivos.toArray(new Tecnico[0]));
            cbListadoTecnicos.setModel(modeloComboFiltrado);
        }
    }

    private void cargarCabeceraTablaIncidentes() {
        modeloTablaIncidentesPorTecnico.addColumn("ID");
        modeloTablaIncidentesPorTecnico.addColumn("Razon Social");
        modeloTablaIncidentesPorTecnico.addColumn("Detalle");
        modeloTablaIncidentesPorTecnico.addColumn("Fecha Alta");
        modeloTablaIncidentesPorTecnico.addColumn("Estado");
        tbListaIncidentesPorTecnicos.setModel(modeloTablaIncidentesPorTecnico);
        TableColumnModel columnModel2 = tbListaIncidentesPorTecnicos.getColumnModel();
        columnModel2.getColumn(0).setMaxWidth(40);
    }

    private void limpiarTablaIncidentes() {
        modeloTablaIncidentesPorTecnico.setRowCount(0);
    }

    private void limpiarCampos() {
        tfIdIncidente.setText("");
        taDetalle.setText("");
        taObservaciones.setText("");
    }

    private void liberarTecnico(Incidente incidente) {
        Tecnico tecnico=controlTecnico.buscarTecnicoPorID(incidente.getTecnico().getIdTecnico());
        if (tecnico!=null) {
            tecnico.setDisponibilidad(true);
            try {
                controlTecnico.actualizarTecnico(tecnico);
            } catch (Exception ex) {
                Logger.getLogger(TecnicoView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
