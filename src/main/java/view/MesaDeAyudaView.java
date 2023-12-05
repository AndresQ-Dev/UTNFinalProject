package view;

import controller.ControladorIncidente;
import javax.swing.table.DefaultTableModel;
import Service.Validar;
import controller.ControladorCliente;
import controller.ControladorTecnico;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;
import model.Cliente;
import model.Incidente;
import model.EnumTipoServicio;
import model.Tecnico;
import persistenceJPA.exceptions.NonexistentEntityException;
import Service.CustomJTable;

/**
 *
 * @author andres
 */
public class MesaDeAyudaView extends javax.swing.JPanel {

    DefaultTableModel modeloTablaIncidentes = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    DefaultTableModel modeloTablaCliente = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    private ControladorIncidente controlIncidente = new ControladorIncidente();
    private ControladorCliente controlCliente = new ControladorCliente();
    private ControladorTecnico controlTecnico = new ControladorTecnico();
    //Formato para mostrar la fecha y hora 
    private DateFormat dateFormat = new SimpleDateFormat("EEEEE, dd/MM/yyyy HH:mm:ss");
    private boolean modoNuevo = false;//Flag para manejar cambios de funciones en boton "Buscar Por Razon Social"

    public MesaDeAyudaView() {
        initComponents();
        cabeceraTablaIncidentes();
        cargarCombo();
        cabeceraTablaClientes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfBusquedaCuit = new javax.swing.JTextField();
        tfRazonSocial = new javax.swing.JTextField();
        tfBusquedaTicket = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        rbEstado = new javax.swing.JRadioButton();
        tfTicket = new javax.swing.JTextField();
        tfCliente = new javax.swing.JTextField();
        cbTipoServicio = new javax.swing.JComboBox<>();
        tfTecnico = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDetalle = new javax.swing.JTextArea();
        tfAlta = new javax.swing.JTextField();
        tfFin = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbIncidentes = new CustomJTable();
        btNuevo = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        cbEditar = new javax.swing.JCheckBox();
        lbBusquedaPorRazonSocial = new javax.swing.JLabel();
        lbBusquedaPorTicket = new javax.swing.JLabel();
        lbBusquedaPorCuit = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbClientes = new CustomJTable();
        jLabel13 = new javax.swing.JLabel();
        tfBusquedaCliente = new javax.swing.JTextField();

        setForeground(new java.awt.Color(153, 204, 255));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(1024, 740));

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mesa de Ayuda");

        tfBusquedaCuit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfBusquedaCuitKeyTyped(evt);
            }
        });

        tfRazonSocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfRazonSocialKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfRazonSocialKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfRazonSocialKeyTyped(evt);
            }
        });

        tfBusquedaTicket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfBusquedaTicketKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel2.setText("Ticket");

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel3.setText("Cuit");

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel4.setText("Razon Social");

        jLabel5.setFont(new java.awt.Font("Cantarell", 3, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Busqueda");

        jLabel6.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Cliente");

        jLabel7.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("N° Ticket");

        jLabel8.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Tipo Servicio");

        jLabel9.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Técnico");

        jLabel10.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Detalle");

        jLabel11.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Fecha Fin");

        jLabel12.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Fecha Alta");

        rbEstado.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        rbEstado.setText("Estado");
        rbEstado.setEnabled(false);

        tfTicket.setEditable(false);

        tfCliente.setEditable(false);

        cbTipoServicio.setEditable(true);
        cbTipoServicio.setEnabled(false);

        tfTecnico.setEditable(false);

        taDetalle.setEditable(false);
        taDetalle.setColumns(20);
        taDetalle.setLineWrap(true);
        taDetalle.setRows(5);
        jScrollPane1.setViewportView(taDetalle);

        tfAlta.setEditable(false);
        tfAlta.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        tfFin.setEditable(false);
        tfFin.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        tbIncidentes.setModel(new javax.swing.table.DefaultTableModel(
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
        tbIncidentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbIncidentesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbIncidentes);

        btNuevo.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        btNuevo.setText("Nuevo");
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });

        btEliminar.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        btGuardar.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        cbEditar.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        cbEditar.setText("Editar");
        cbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEditarActionPerformed(evt);
            }
        });

        lbBusquedaPorRazonSocial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa01.png"))); // NOI18N
        lbBusquedaPorRazonSocial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbBusquedaPorRazonSocialMouseClicked(evt);
            }
        });

        lbBusquedaPorTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa01.png"))); // NOI18N
        lbBusquedaPorTicket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbBusquedaPorTicketMouseClicked(evt);
            }
        });

        lbBusquedaPorCuit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa01.png"))); // NOI18N
        lbBusquedaPorCuit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbBusquedaPorCuitMouseClicked(evt);
            }
        });

        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        tbClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClientesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbClientes);

        jLabel13.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel13.setText("Escoger Cliente ->");

        tfBusquedaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfBusquedaClienteKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(23, 23, 23)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfBusquedaCuit)
                                    .addComponent(tfBusquedaTicket)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(tfRazonSocial))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbBusquedaPorTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbBusquedaPorCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbBusquedaPorRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbTipoServicio, 0, 200, Short.MAX_VALUE)
                                    .addComponent(tfTecnico)
                                    .addComponent(tfCliente)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(rbEstado)
                                    .addGap(162, 162, 162)
                                    .addComponent(cbEditar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel11))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfFin)
                                        .addComponent(tfAlta)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btNuevo)
                                        .addGap(107, 107, 107)
                                        .addComponent(btEliminar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btGuardar))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addGap(27, 27, 27)
                                .addComponent(tfBusquedaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)))))
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(tfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(cbTipoServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(tfTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel10))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tfBusquedaTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                    .addComponent(lbBusquedaPorTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tfBusquedaCuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                    .addComponent(lbBusquedaPorCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbBusquedaPorRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tfRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4)))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(64, 64, 64))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(tfBusquedaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfAlta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(tfFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbEstado)
                            .addComponent(cbEditar))
                        .addGap(74, 74, 74))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btGuardar)
                            .addComponent(btEliminar)
                            .addComponent(btNuevo))
                        .addGap(29, 29, 29))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfBusquedaTicketKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBusquedaTicketKeyTyped
        Validar.esNumero(evt);
    }//GEN-LAST:event_tfBusquedaTicketKeyTyped

    private void tfBusquedaCuitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBusquedaCuitKeyTyped
        Validar.esNumero(evt);
    }//GEN-LAST:event_tfBusquedaCuitKeyTyped

    private void tfRazonSocialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfRazonSocialKeyTyped
        Validar.esLetra(evt);
    }//GEN-LAST:event_tfRazonSocialKeyTyped

    private void lbBusquedaPorTicketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBusquedaPorTicketMouseClicked
        // Busqueda por Id (N° de Ticket)
        modoNuevo = false;
        desactivarCampo();
        limpiarTablaClientes();
        String ticketBuscadoSrt = tfBusquedaTicket.getText();
        if (!ticketBuscadoSrt.isEmpty()) {
            int ticketInt = Integer.parseInt(ticketBuscadoSrt);
            Incidente incidente = controlIncidente.buscarIncidentePorId(ticketInt);
            if (incidente != null) {
                limpiarTablaIncidentes();
                modeloTablaIncidentes.addRow(new Object[]{incidente.getIdIncidente(),
                    incidente.getCliente().getRazonSocial(),
                    incidente.getCategoriaServicio(),
                    dateFormat.format(incidente.getFechaAlta())});
            }

        } else {
            JOptionPane.showMessageDialog(null, "El Campo de Busqueda no puede estar vacio");
        }
    }//GEN-LAST:event_lbBusquedaPorTicketMouseClicked

    private void lbBusquedaPorCuitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBusquedaPorCuitMouseClicked
        // Busqueda por Cuit
        modoNuevo = false;
        desactivarCampo();
        limpiarTablaClientes();
        String cuitBuscadoSrt = tfBusquedaCuit.getText().trim();
        if (!cuitBuscadoSrt.isEmpty()) {
            List<Incidente> listadoIncidentes = controlIncidente.listarIncidentes();
            if (listadoIncidentes != null && !listadoIncidentes.isEmpty()) {
                for (Incidente incidente : listadoIncidentes) {
                    if (cuitBuscadoSrt.equals(incidente.getCliente().getCuit())) {
                        limpiarTablaIncidentes();
                        modeloTablaIncidentes.addRow(new Object[]{incidente.getIdIncidente(),
                            incidente.getCliente().getRazonSocial(),
                            incidente.getCategoriaServicio(),
                            dateFormat.format(incidente.getFechaAlta())});
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Lista vacia.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El Campo de Busqueda no puede estar vacio");
        }
    }//GEN-LAST:event_lbBusquedaPorCuitMouseClicked

    private void lbBusquedaPorRazonSocialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBusquedaPorRazonSocialMouseClicked
        // Busqueda por razon Social
        modoNuevo = false;
        desactivarCampo();
        limpiarTablaClientes();
        String razonSocialBuscada = tfRazonSocial.getText();
        if (!razonSocialBuscada.isEmpty()) {
            // Obtener la lista de incidentes
            List<Incidente> listadoIncidentes = controlIncidente.listarIncidentes();

            if (listadoIncidentes != null && !listadoIncidentes.isEmpty()) {
                for (Incidente incidente : listadoIncidentes) {
                    // Comparar ignorando mayúsculas y minúsculas
                    if (incidente.getCliente().getRazonSocial().equalsIgnoreCase(razonSocialBuscada)) {
                        // Agregar el incidente a la tabla
                        limpiarTablaIncidentes();
                        modeloTablaIncidentes.addRow(new Object[]{
                            incidente.getIdIncidente(),
                            incidente.getCliente().getRazonSocial(),
                            incidente.getCategoriaServicio(),
                            dateFormat.format(incidente.getFechaAlta())
                        });
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Lista vacía.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El Campo de Búsqueda no puede estar vacío");

        }
    }//GEN-LAST:event_lbBusquedaPorRazonSocialMouseClicked

    private void tfRazonSocialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfRazonSocialKeyPressed
        // al teclear        
    }//GEN-LAST:event_tfRazonSocialKeyPressed

    private void tfRazonSocialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfRazonSocialKeyReleased
        //al soltar la tecla buscar Incidentes por Razon Social
        modoNuevo = false;
        desactivarCampo();
        limpiarTablaClientes();
        limpiarTablaIncidentes();
        String razonSocialBuscada = tfRazonSocial.getText();
        if (!razonSocialBuscada.isEmpty()) {

            // Obtener la lista de incidentes
            List<Incidente> listadoIncidentes = controlIncidente.listarIncidentes();

            if (listadoIncidentes != null && !listadoIncidentes.isEmpty()) {
                for (Incidente incidente : listadoIncidentes) {
                    // Comparar ignorando mayúsculas y minúsculas
                    if (incidente.getCliente().getRazonSocial().toLowerCase().contains(razonSocialBuscada.toLowerCase())) {
                        // Agregar el incidente a la tabla
                        //limpiarTablaIncidentes();
                        modeloTablaIncidentes.addRow(new Object[]{
                            incidente.getIdIncidente(),
                            incidente.getCliente().getRazonSocial(),
                            incidente.getCategoriaServicio(),
                            dateFormat.format(incidente.getFechaAlta())
                        });
                    }
                }
            } else {
                //JOptionPane.showMessageDialog(null, "Lista vacía.");
            }
        } else {
            //JOptionPane.showMessageDialog(null, "El Campo de Búsqueda no puede estar vacío");

        }
    }//GEN-LAST:event_tfRazonSocialKeyReleased

    private void tbIncidentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbIncidentesMouseClicked
        //uso el flag modoNuevo para redirigir el código
        int rowSelect = tbIncidentes.getSelectedRow();
        if (rowSelect != -1) {
            int idIncidente = (int) tbIncidentes.getValueAt(rowSelect, 0);
            Incidente incidente = controlIncidente.buscarIncidentePorId(idIncidente);
            if (incidente != null) {
                cargarCampos(incidente);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Tiene que seleccioanr una fila.");
        }
    }//GEN-LAST:event_tbIncidentesMouseClicked

    private void cbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEditarActionPerformed
        if (cbEditar.isSelected()) {
            activarCampo();
        } else {
            desactivarCampo();
        }
    }//GEN-LAST:event_cbEditarActionPerformed

    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        limpiarCampos();
        limpiarTablaClientes();
        tfBusquedaCliente.requestFocus();
        modoNuevo = true;
    }//GEN-LAST:event_btNuevoActionPerformed

    private void tfBusquedaClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBusquedaClienteKeyReleased
        //al soltar la tecla
        if (modoNuevo) {
            limpiarTablaClientes();
            String razonSocialBuscada = tfBusquedaCliente.getText().toLowerCase();
            if (!razonSocialBuscada.isEmpty()) {
                // Obtener la lista de Clientes
                List<Cliente> listadoCliente = controlCliente.listarClientes();

                if (listadoCliente != null && !listadoCliente.isEmpty()) {
                    for (Cliente cliente : listadoCliente) {
                        // Buscar si lo ingresado esta contenido en alguna Razon Social de cliente activo
                        if (cliente.getRazonSocial().toLowerCase().contains(razonSocialBuscada) && cliente.isEstado()) {
                            // Agregar el cliente a la tabla
                            modeloTablaCliente.addRow(new Object[]{
                                cliente.getIdCliente(),
                                cliente.getRazonSocial(),
                                cliente.getTipoServicio(),
                                cliente.isEstado()
                            });
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_tfBusquedaClienteKeyReleased

    private void tbClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClientesMouseClicked
        //Al cliquear en la tabla de Clientes...
        int rowSelect = tbClientes.getSelectedRow();
        if (rowSelect != -1) {
            int idCliente = (int) tbClientes.getValueAt(rowSelect, 0);
            Cliente cliente = controlCliente.buscarClientePorId(idCliente);
            if (cliente != null) {
                idClienteEscogido = cliente.getIdCliente();
                cargarCamposCliente(cliente);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Tiene que seleccioanr una fila.");
        }
    }//GEN-LAST:event_tbClientesMouseClicked

    //*****************************************************************************************************
    //Declaro variables Globales para resguardar datos resultante de buscar el cliente y tecnico posible...
    int idClienteEscogido;
    int idTecnicoEscogido;
    EnumTipoServicio categoriaEscogida;

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        //uso el flag para derivar...
        if (modoNuevo) {//si es verdaero se arma el Objeto Incidente
            Cliente cliente = controlCliente.buscarClientePorId(idClienteEscogido);
            Tecnico tecnico = controlTecnico.buscarTecnicoPorID(idTecnicoEscogido);
            EnumTipoServicio tipoServ = categoriaEscogida;
            String detalle = taDetalle.getText();
            Date fechaAlta = Date.from(Instant.now());

            //Verifico
            if (cliente != null && tecnico != null) {
                if (!detalle.isEmpty()) {
                    int confirmacion = JOptionPane.showConfirmDialog(null,
                            "El tiempo estimado de resolución es de " + tipoServ.getTiempoEstimado() + "hs\n¿Está de acuerdo?", "Confirmar tiempo estimado",
                            JOptionPane.YES_NO_OPTION);
                    if (confirmacion == JOptionPane.YES_OPTION) {
                        Incidente incidente = new Incidente(cliente, tecnico, tipoServ, detalle, fechaAlta, true);
                        controlIncidente.crearIncidente(incidente);
                        JOptionPane.showMessageDialog(null, "Incidente agregado Correctamente\nEnviando mail con detalles al Cliente...");
                        limpiarCampos();
                        limpiarTablaClientes();
                        tecnico.setDisponibilidad(false);//Tecnico pasa a ser "No disponible"
                        modoNuevo = false;
                        try {
                            controlTecnico.actualizarTecnico(tecnico);//persisto la modificacion del tecnico....
                        } catch (Exception ex) {
                            Logger.getLogger(MesaDeAyudaView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Debe colocar un detalle del incidente.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El cliente o técnico no es válido.");
            }

        } else {
            if (cbEditar.isSelected()) {//si el CheckBox Editar esta selecionado
                String idIncidenteEdit = tfTicket.getText();
                if (!idIncidenteEdit.isEmpty()) {
                    Incidente incidente = controlIncidente.buscarIncidentePorId(Integer.parseInt(idIncidenteEdit));
                    if (incidente != null) {
                        String detalleEdit = taDetalle.getText();
                        if (!detalleEdit.isEmpty()) {
                            incidente.setDetalle(detalleEdit);
                            try {
                                controlIncidente.editarIncidente(incidente);
                                JOptionPane.showMessageDialog(null, "Cambios guardados en Incidente N° " + incidente.getIdIncidente());
                                limpiarCampos();
                                limpiarTablaClientes();
                                limpiarTablaIncidentes();
                                cbEditar.setSelected(false);
                            } catch (Exception ex) {
                                Logger.getLogger(MesaDeAyudaView.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        // Eliminar Incidente
        if (modoNuevo) {// En modoNuevo no se puede eliminar
            JOptionPane.showMessageDialog(null, "Eliminación no permitida.");
            return;
        }

        String idIncidenteStr = tfTicket.getText();
        if (idIncidenteStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se seleccionó un Incidente.");
            return;
        }

        int idIncidente = Integer.parseInt(idIncidenteStr);//obtengo idIncidente en int

//        if (!validarBaja(idIncidente)) {//verificar estado de incidente
//            JOptionPane.showMessageDialog(null, "El Incidente ya se encuentra dado de baja.");
//            return;
//        }
//        System.out.println("pase el if de validacioooooonnn....");
        // Traer el Incidente
        Incidente incidente = controlIncidente.buscarIncidentePorId(idIncidente);
        if (incidente == null) {
            JOptionPane.showMessageDialog(null, "Incidente no encontrado.");
            return;
        }

        // Traer el Técnico
        Tecnico tecnico = controlTecnico.buscarTecnicoPorID(incidente.getTecnico().getIdTecnico());

        // Solicitar razon de eliminacion...
        String motivoEliminacion = JOptionPane.showInputDialog("Ingrese el motivo de la eliminación del Incidente:");

        if (motivoEliminacion == null || motivoEliminacion.isEmpty()) {//verifico que no esté vacio o sea nulo
            JOptionPane.showMessageDialog(null, "Tiene que especificar un motivo.");
            return;
        }

        try {
            // Eliminar el Incidente
            System.out.println("Antes de eliminar: "+incidente.isEstado()+incidente.getIdIncidente());
            controlIncidente.eliminarIncidente(idIncidente);
            Incidente inciUpdate=controlIncidente.buscarIncidentePorId(idIncidente);//Borrar
            System.out.println("Estado despues de eliminar: "+inciUpdate.isEstado()+" "+inciUpdate.getIdIncidente());

            // Pasar a disponibilidad el Técnico
            tecnico.setDisponibilidad(true);

            // Persistir cambios
            controlTecnico.actualizarTecnico(tecnico);

            // Actualizo y persisto el motivo de eliminación de incidente en variable "Detalle"
            Incidente incidenteEliminado=controlIncidente.buscarIncidentePorId(idIncidente);
            incidenteEliminado.setDetalle(incidenteEliminado.getDetalle() + " || " + motivoEliminacion.toUpperCase());
            controlIncidente.editarIncidente(incidenteEliminado);
            limpiarCampos();
            limpiarTablaIncidentes();
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(MesaDeAyudaView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalStateException ex) {
            Logger.getLogger(MesaDeAyudaView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ya se encuentra dado de baja.");
        } catch (Exception ex) {
            Logger.getLogger(MesaDeAyudaView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JCheckBox cbEditar;
    private javax.swing.JComboBox<EnumTipoServicio> cbTipoServicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbBusquedaPorCuit;
    private javax.swing.JLabel lbBusquedaPorRazonSocial;
    private javax.swing.JLabel lbBusquedaPorTicket;
    private javax.swing.JRadioButton rbEstado;
    private javax.swing.JTextArea taDetalle;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTable tbIncidentes;
    private javax.swing.JTextField tfAlta;
    private javax.swing.JTextField tfBusquedaCliente;
    private javax.swing.JTextField tfBusquedaCuit;
    private javax.swing.JTextField tfBusquedaTicket;
    private javax.swing.JTextField tfCliente;
    private javax.swing.JTextField tfFin;
    private javax.swing.JTextField tfRazonSocial;
    private javax.swing.JTextField tfTecnico;
    private javax.swing.JTextField tfTicket;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo() {
        EnumTipoServicio[] tipoServicio = EnumTipoServicio.values();
        DefaultComboBoxModel<EnumTipoServicio> comboBoxModel = new DefaultComboBoxModel<>(tipoServicio);
    }

    private void cabeceraTablaIncidentes() {
        modeloTablaIncidentes.addColumn("ID");
        modeloTablaIncidentes.addColumn("Razon Social");
        modeloTablaIncidentes.addColumn("Categoria");
        modeloTablaIncidentes.addColumn("Alta");
        tbIncidentes.setModel(modeloTablaIncidentes);
        TableColumnModel columnModel = tbIncidentes.getColumnModel();
        columnModel.getColumn(0).setMaxWidth(60);
    }

    private void limpiarTablaIncidentes() {
        modeloTablaIncidentes.setRowCount(0);
    }

    private void cargarCampos(Incidente incidente) {
        tfTicket.setText(String.valueOf(incidente.getIdIncidente()));
        tfCliente.setText(incidente.getCliente() != null ? incidente.getCliente().getRazonSocial() : "");
        cbTipoServicio.setSelectedItem(incidente.getCategoriaServicio() != null ? incidente.getCategoriaServicio().toString() : "");
        tfTecnico.setText(incidente.getTecnico() != null ? incidente.getTecnico().getApellidoNombre() : "");
        taDetalle.setText(incidente.getDetalle());
        tfAlta.setText(incidente.getFechaAlta() != null ? dateFormat.format(incidente.getFechaAlta()) : "");
        //tfAlta.setText(incidente.getFechaAlta() != null ? incidente.getFechaAlta().toString() : "");
        tfFin.setText(incidente.getFechaFinalizacion() != null ? dateFormat.format(incidente.getFechaFinalizacion()) : "");
        //tfFin.setText(incidente.getFechaFinalizacion() != null ? incidente.getFechaFinalizacion().toString() : "");
        rbEstado.setSelected(incidente.isEstado());
    }

    private void activarCampo() {
        taDetalle.setEditable(true);
    }

    private void desactivarCampo() {
        taDetalle.setEditable(false);
    }

    private void limpiarCampos() {
        tfBusquedaTicket.setText("");
        tfBusquedaCuit.setText("");
        tfRazonSocial.setText("");
        tfTicket.setText("");
        tfCliente.setText("");
        tfTecnico.setText("");
        taDetalle.setText("");
        tfAlta.setText("");
        tfFin.setText("");
        rbEstado.setSelected(false);
        tfBusquedaCliente.setText("");
        limpiarTablaIncidentes();
    }

    private void cabeceraTablaClientes() {
        modeloTablaCliente.addColumn("ID");
        modeloTablaCliente.addColumn("Razon Social");
        modeloTablaCliente.addColumn("Tipo Servicio");
        modeloTablaCliente.addColumn("Estado");
        tbClientes.setModel(modeloTablaCliente);
        TableColumnModel columnModel2 = tbClientes.getColumnModel();
        columnModel2.getColumn(0).setMaxWidth(40);
    }

    private void limpiarTablaClientes() {
        modeloTablaCliente.setRowCount(0);
    }

    private void cargarCamposCliente(Cliente cliente) {
        //Buscar el primer técnico disponible para esta categoria.
        Tecnico tecnico = tecnicoDisponible(cliente.getTipoServicio());
        if (tecnico != null) {
            tfTecnico.setText(tecnico.getApellidoNombre());
            activarCampo();
        } else {
            JOptionPane.showMessageDialog(null, "No hay técnico disponible en la categoria requerida.");
        }

        tfCliente.setText(cliente.getRazonSocial());
        cbTipoServicio.setSelectedItem(cliente.getTipoServicio());
    }

    private Tecnico tecnicoDisponible(EnumTipoServicio tipoServicio) {
        List<Tecnico> listadoTecnicos = controlTecnico.listarTecnicos();
        Tecnico tecnicNull = null;
        if (listadoTecnicos != null) {
            for (Tecnico tecnico : listadoTecnicos) {
                if (tecnico.getCategoria().toString().equalsIgnoreCase(tipoServicio.toString()) && tecnico.isEstado() && tecnico.isDisponibilidad()) {
                    categoriaEscogida = tipoServicio;
                    idTecnicoEscogido = tecnico.getIdTecnico();
                    return tecnico;
                }
            }
        }
        return tecnicNull;
    }

    private boolean validarBaja(int idIncidente) {
        Incidente incidente = controlIncidente.buscarIncidentePorId(idIncidente);
        return incidente.isEstado();
    }

}
