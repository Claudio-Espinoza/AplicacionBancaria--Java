package UI.frame;

import control.controlador.Control;
import control.controlador.baseDeDatos;
import control.entidades.Motivo;
import control.entidades.Notificable;
import control.entidades.Transaccion;
import java.awt.event.MouseEvent;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;

/*
 * @author Claudio Espinoza
 */
public class Dashboard extends javax.swing.JFrame {

    private String rut;

    public Dashboard(String nombre, String apellido, String apellido2, String correo, String rut, int fondo) {
        this.rut = rut;
        initComponents();
        setLocationRelativeTo(null);
        modificarInicio(nombre, apellido, apellido2, correo, this.rut);
        
        this.setVisible(true);
       // modificarCartola();
    }

    private void modificarInicio(String nombre, String apellido, String apellido2, String correo, String rut) {
        jLabel_nombreInicio.setText(nombre);
        jLabel_apellidoPaternoInicio.setText(apellido);
        jLabel_apellidoMaternoInicio.setText(apellido2);
        jLabel_rutInicio.setText(rut);
        jLabel_mailInicio.setText(correo);

    }

    private void modificarFondos(String fondo, String rut) {
        // esto solo muestra la plata
        jLabel_mostraMontorFondos.setText(String.valueOf(fondo));

        System.out.println("aaaaaaaahh");
        DefaultTableModel model = (DefaultTableModel) jTable_fondos.getModel();
        for (int i = 0; i < baseDeDatos.retornarIDTransaccion(rut); i++) {
            String rutDestino=baseDeDatos.retornarRutDestino(this.rut, i+1);
            String monto=baseDeDatos.retornarMontoTransaccion(this.rut, i+1);
           
            Control a=new Control();
            String num[]={baseDeDatos.retornarNumTransaccion(rut, i+1)};
            
                String data[] = {rutDestino, monto};
                model.addRow(data);
                

        }

    }

   /* private void modificarCartola() {

        String matriz[][] = new String[baseDeDatos.retornarIDTransaccion(rut)][4];

        // aqui elijes tus eliges los nombres de los txt,  me da lo mismo
        //txtMontoDado = "";
        // txtrutDestino = "";
        // txtMontoTransaccion = "";
        // txtnumTransaccion = "";
// aca da lo mismo el orden de cada dato depende de ti y es lo mismo que en la anterior
        for (int i = 0; i < baseDeDatos.retornarIDTransaccion(rut); i++) {
            matriz[i][0] = baseDeDatos.retornarMontoTransaccion(rut, i); //ESTO LITERAL DICE EL NOMBRE DEL METODO LO QUE HACE
            matriz[i][1] = baseDeDatos.retornarRutDestino(rut, i); //ESTO LITERAL DICE EL NOMBRE DEL METODO LO QUE HACE
            matriz[i][2] = baseDeDatos.retornarFechaTransaccion(rut, i); //ESTO LITERAL DICE EL NOMBRE DEL METODO LO QUE HACE
            matriz[i][3] = baseDeDatos.retornarNumTransaccion(rut, i); //ESTO LITERAL DICE EL NOMBRE DEL METODO LO QUE HACE
        }

        jTable_Cartola.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Nº Monto", "Monto", "Rut", "Fecha"
                }
        ));
    } */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_containerDashboard = new javax.swing.JPanel();
        jPanel_containerMenu = new javax.swing.JPanel();
        jLabel_iconoTransferir = new javax.swing.JLabel();
        jLabel_iconoFondos = new javax.swing.JLabel();
        jLabel_iconoDivisa = new javax.swing.JLabel();
        jLabel_inicio = new javax.swing.JLabel();
        jLabel_salir = new javax.swing.JLabel();
        jPanel_decoracionTapar = new javax.swing.JPanel();
        jPanel_containerFuncionalidades = new javax.swing.JPanel();
        jPanel_containerInicio = new javax.swing.JPanel();
        jLabel_iconInicio = new javax.swing.JLabel();
        jLabel_nombreInicio = new javax.swing.JLabel();
        jLabel_apellidoPaternoInicio = new javax.swing.JLabel();
        jLabel_apellidoMaternoInicio = new javax.swing.JLabel();
        jLabel_mailInicio = new javax.swing.JLabel();
        jLabel_rutInicio = new javax.swing.JLabel();
        jPanel_containerFondos = new javax.swing.JPanel();
        jLabel_mostraMontorFondos = new javax.swing.JLabel();
        jSeparator_decoracionFondos1 = new javax.swing.JSeparator();
        jSeparator_decoracionFondos2 = new javax.swing.JSeparator();
        jLabel_tituloFondos = new javax.swing.JLabel();
        jLabel_tituloMostrarFondos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_fondos = new javax.swing.JTable();
        jPanel_containerCartola = new javax.swing.JPanel();
        jLabel_tituloCartola = new javax.swing.JLabel();
        jSeparator_decoracionCartola1 = new javax.swing.JSeparator();
        jSeparator_decoracionCartola2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Cartola = new javax.swing.JTable();
        jPanel_containerTrasferir = new javax.swing.JPanel();
        jTextField_rutIngresarTransferir = new javax.swing.JTextField();
        jTextField_montoIngresarTransferir = new javax.swing.JTextField();
        jLabel_tituloRutTransferir = new javax.swing.JLabel();
        jLabel_tituloMontoTransferir = new javax.swing.JLabel();
        jLabel_iconoMontoTransferir = new javax.swing.JLabel();
        jLabel_IconAccionTransferir = new javax.swing.JLabel();
        jLabel_transferencia = new javax.swing.JLabel();
        jSeparator_decoracionTransferir = new javax.swing.JSeparator();
        jLabel_montivoTransferir = new javax.swing.JLabel();
        jLabel_numeroTranseferir = new javax.swing.JLabel();
        jPanel_opcionMotivo1Transferir = new javax.swing.JPanel();
        jLabel_motivoPersonal = new javax.swing.JLabel();
        jPanel_opcionMotivo2Transferir = new javax.swing.JPanel();
        jLabel_motivoPago = new javax.swing.JLabel();
        jPanel_opcionMotivo3Transferir = new javax.swing.JPanel();
        jLabel_motivoPrestamo = new javax.swing.JLabel();
        jPanel_containerDivisa = new javax.swing.JPanel();
        jLabel_tituloDivisa = new javax.swing.JLabel();
        jLabel_iconoDolarDivisa = new javax.swing.JLabel();
        jLabel_iconoEuroDivisa = new javax.swing.JLabel();
        jLabel_CalculoEuroDivisa = new javax.swing.JLabel();
        jLabel_CalculoDolarDivisa = new javax.swing.JLabel();
        jLabel_iconoCambioDivisa = new javax.swing.JLabel();
        jLabel_botonCalcularDivisa = new javax.swing.JLabel();
        jSeparator_decoracionDivisa1 = new javax.swing.JSeparator();
        jSeparator_decoracionDivisa2 = new javax.swing.JSeparator();
        jSeparator_decoracionDivisa3 = new javax.swing.JSeparator();
        jSeparator_decoracionDivisa4 = new javax.swing.JSeparator();
        jTextField_ingresarMontoDivisa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel_containerDashboard.setBackground(new java.awt.Color(240, 241, 242));

        jPanel_containerMenu.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_iconoTransferir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_iconoTransferir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Transferir.png"))); // NOI18N
        jLabel_iconoTransferir.setPreferredSize(new java.awt.Dimension(60, 40));
        jLabel_iconoTransferir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_iconoTransferir_MouseClicked(evt);
            }
        });

        jLabel_iconoFondos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_iconoFondos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos.png"))); // NOI18N
        jLabel_iconoFondos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_iconoFondos_MouseClicked(evt);
            }
        });

        jLabel_iconoDivisa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_iconoDivisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Divisa.png"))); // NOI18N
        jLabel_iconoDivisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_iconoDivisa_MouseClicked(evt);
            }
        });

        jLabel_inicio.setBackground(new java.awt.Color(242, 188, 87));
        jLabel_inicio.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel_inicio.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_inicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Simbolo.png"))); // NOI18N
        jLabel_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_inicioMouse_Clicked(evt);
            }
        });

        jLabel_salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Salir.png"))); // NOI18N
        jLabel_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_salir_MouseClicked(evt);
            }
        });

        jPanel_decoracionTapar.setBackground(new java.awt.Color(240, 241, 242));

        javax.swing.GroupLayout jPanel_decoracionTaparLayout = new javax.swing.GroupLayout(jPanel_decoracionTapar);
        jPanel_decoracionTapar.setLayout(jPanel_decoracionTaparLayout);
        jPanel_decoracionTaparLayout.setHorizontalGroup(
            jPanel_decoracionTaparLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel_decoracionTaparLayout.setVerticalGroup(
            jPanel_decoracionTaparLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel_containerMenuLayout = new javax.swing.GroupLayout(jPanel_containerMenu);
        jPanel_containerMenu.setLayout(jPanel_containerMenuLayout);
        jPanel_containerMenuLayout.setHorizontalGroup(
            jPanel_containerMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_iconoTransferir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
            .addComponent(jLabel_iconoFondos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_iconoDivisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_inicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_decoracionTapar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_containerMenuLayout.setVerticalGroup(
            jPanel_containerMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_containerMenuLayout.createSequentialGroup()
                .addComponent(jLabel_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel_iconoTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel_iconoFondos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel_iconoDivisa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_decoracionTapar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel_containerFuncionalidades.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_containerFuncionalidades.setLayout(new java.awt.CardLayout());

        jPanel_containerInicio.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_iconInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_iconInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Usuario.png"))); // NOI18N

        jLabel_nombreInicio.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel_nombreInicio.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_nombreInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_nombreInicio.setText("Nombre");

        jLabel_apellidoPaternoInicio.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel_apellidoPaternoInicio.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_apellidoPaternoInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_apellidoPaternoInicio.setText("Nombre");

        jLabel_apellidoMaternoInicio.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel_apellidoMaternoInicio.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_apellidoMaternoInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_apellidoMaternoInicio.setText("Nombre");

        jLabel_mailInicio.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel_mailInicio.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_mailInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_mailInicio.setText("Mail");

        jLabel_rutInicio.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel_rutInicio.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_rutInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_rutInicio.setText("Rut");

        javax.swing.GroupLayout jPanel_containerInicioLayout = new javax.swing.GroupLayout(jPanel_containerInicio);
        jPanel_containerInicio.setLayout(jPanel_containerInicioLayout);
        jPanel_containerInicioLayout.setHorizontalGroup(
            jPanel_containerInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_containerInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_containerInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_iconInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_rutInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_mailInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel_containerInicioLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel_nombreInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel_apellidoPaternoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel_apellidoMaternoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 122, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel_containerInicioLayout.setVerticalGroup(
            jPanel_containerInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_containerInicioLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel_iconInicio)
                .addGap(40, 40, 40)
                .addGroup(jPanel_containerInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nombreInicio)
                    .addComponent(jLabel_apellidoPaternoInicio)
                    .addComponent(jLabel_apellidoMaternoInicio))
                .addGap(18, 18, 18)
                .addComponent(jLabel_mailInicio)
                .addGap(18, 18, 18)
                .addComponent(jLabel_rutInicio)
                .addContainerGap(591, Short.MAX_VALUE))
        );

        jPanel_containerFuncionalidades.add(jPanel_containerInicio, "card6");

        jPanel_containerFondos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_mostraMontorFondos.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel_mostraMontorFondos.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_mostraMontorFondos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel_tituloFondos.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel_tituloFondos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_tituloFondos.setText("Fondos");

        jLabel_tituloMostrarFondos.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel_tituloMostrarFondos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_tituloMostrarFondos.setText("Historial");

        jTable_fondos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rut", "Monto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_fondos);

        javax.swing.GroupLayout jPanel_containerFondosLayout = new javax.swing.GroupLayout(jPanel_containerFondos);
        jPanel_containerFondos.setLayout(jPanel_containerFondosLayout);
        jPanel_containerFondosLayout.setHorizontalGroup(
            jPanel_containerFondosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_containerFondosLayout.createSequentialGroup()
                .addGroup(jPanel_containerFondosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_containerFondosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_tituloFondos, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE))
                    .addGroup(jPanel_containerFondosLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(jPanel_containerFondosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_mostraMontorFondos, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                            .addComponent(jSeparator_decoracionFondos1)
                            .addComponent(jSeparator_decoracionFondos2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel_containerFondosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel_containerFondosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_tituloMostrarFondos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel_containerFondosLayout.setVerticalGroup(
            jPanel_containerFondosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_containerFondosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_tituloFondos)
                .addGap(22, 22, 22)
                .addComponent(jSeparator_decoracionFondos2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel_mostraMontorFondos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator_decoracionFondos1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel_tituloMostrarFondos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(549, Short.MAX_VALUE))
        );

        jPanel_containerFuncionalidades.add(jPanel_containerFondos, "card3");

        jPanel_containerCartola.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_tituloCartola.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel_tituloCartola.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_tituloCartola.setText("Cartola");

        jTable_Cartola.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nº Monto", "Monto", "Rut", "Fecha"
            }
        ));
        jScrollPane2.setViewportView(jTable_Cartola);

        javax.swing.GroupLayout jPanel_containerCartolaLayout = new javax.swing.GroupLayout(jPanel_containerCartola);
        jPanel_containerCartola.setLayout(jPanel_containerCartolaLayout);
        jPanel_containerCartolaLayout.setHorizontalGroup(
            jPanel_containerCartolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_containerCartolaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_containerCartolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_containerCartolaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2))
                    .addComponent(jLabel_tituloCartola, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_containerCartolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator_decoracionCartola1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(jSeparator_decoracionCartola2))
                .addContainerGap())
        );
        jPanel_containerCartolaLayout.setVerticalGroup(
            jPanel_containerCartolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_containerCartolaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_tituloCartola)
                .addGap(2, 2, 2)
                .addGroup(jPanel_containerCartolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel_containerCartolaLayout.createSequentialGroup()
                        .addComponent(jSeparator_decoracionCartola1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(378, 378, 378)
                        .addComponent(jSeparator_decoracionCartola2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(539, Short.MAX_VALUE))
        );

        jPanel_containerFuncionalidades.add(jPanel_containerCartola, "card4");

        jPanel_containerTrasferir.setBackground(new java.awt.Color(255, 255, 255));

        jTextField_rutIngresarTransferir.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jTextField_rutIngresarTransferir.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_rutIngresarTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_rutIngresarTransferirActionPerformed(evt);
            }
        });

        jTextField_montoIngresarTransferir.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jTextField_montoIngresarTransferir.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_montoIngresarTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_montoIngresarTransferirActionPerformed(evt);
            }
        });

        jLabel_tituloRutTransferir.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel_tituloRutTransferir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_tituloRutTransferir.setText("Rut del destinatario");

        jLabel_tituloMontoTransferir.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel_tituloMontoTransferir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_tituloMontoTransferir.setText("Monto a trasferir");

        jLabel_iconoMontoTransferir.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel_iconoMontoTransferir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_iconoMontoTransferir.setText("$");

        jLabel_IconAccionTransferir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_IconAccionTransferir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transaccion.png"))); // NOI18N
        jLabel_IconAccionTransferir.setToolTipText("");
        jLabel_IconAccionTransferir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_IconAccionTransferir_MouseClicked(evt);
            }
        });

        jLabel_transferencia.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel_transferencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_transferencia.setText("Transferencia");

        jLabel_montivoTransferir.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel_montivoTransferir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_montivoTransferir.setText("Motivo de transferencia");

        jLabel_numeroTranseferir.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel_numeroTranseferir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_numeroTranseferir.setText("numero de transferencia");

        jPanel_opcionMotivo1Transferir.setBackground(new java.awt.Color(51, 51, 51));
        jPanel_opcionMotivo1Transferir.setForeground(new java.awt.Color(51, 51, 51));
        jPanel_opcionMotivo1Transferir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_opcionMotivo1Transferir_MouseClicked(evt);
            }
        });

        jLabel_motivoPersonal.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel_motivoPersonal.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_motivoPersonal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_motivoPersonal.setText("Personal");
        jLabel_motivoPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_motivoPersonalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_opcionMotivo1TransferirLayout = new javax.swing.GroupLayout(jPanel_opcionMotivo1Transferir);
        jPanel_opcionMotivo1Transferir.setLayout(jPanel_opcionMotivo1TransferirLayout);
        jPanel_opcionMotivo1TransferirLayout.setHorizontalGroup(
            jPanel_opcionMotivo1TransferirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_motivoPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        jPanel_opcionMotivo1TransferirLayout.setVerticalGroup(
            jPanel_opcionMotivo1TransferirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_motivoPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel_opcionMotivo2Transferir.setBackground(new java.awt.Color(51, 51, 51));
        jPanel_opcionMotivo2Transferir.setForeground(new java.awt.Color(51, 51, 51));
        jPanel_opcionMotivo2Transferir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_opcionMotivo2Transferir_MouseClicked(evt);
            }
        });

        jLabel_motivoPago.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel_motivoPago.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_motivoPago.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_motivoPago.setText("Pago");

        javax.swing.GroupLayout jPanel_opcionMotivo2TransferirLayout = new javax.swing.GroupLayout(jPanel_opcionMotivo2Transferir);
        jPanel_opcionMotivo2Transferir.setLayout(jPanel_opcionMotivo2TransferirLayout);
        jPanel_opcionMotivo2TransferirLayout.setHorizontalGroup(
            jPanel_opcionMotivo2TransferirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_motivoPago, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        jPanel_opcionMotivo2TransferirLayout.setVerticalGroup(
            jPanel_opcionMotivo2TransferirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_motivoPago, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jPanel_opcionMotivo3Transferir.setBackground(new java.awt.Color(51, 51, 51));
        jPanel_opcionMotivo3Transferir.setForeground(new java.awt.Color(51, 51, 51));
        jPanel_opcionMotivo3Transferir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_opcionMotivo3Transferir_MouseClicked(evt);
            }
        });

        jLabel_motivoPrestamo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel_motivoPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_motivoPrestamo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_motivoPrestamo.setText("Prestamo");
        jLabel_motivoPrestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_motivoPrestamoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_opcionMotivo3TransferirLayout = new javax.swing.GroupLayout(jPanel_opcionMotivo3Transferir);
        jPanel_opcionMotivo3Transferir.setLayout(jPanel_opcionMotivo3TransferirLayout);
        jPanel_opcionMotivo3TransferirLayout.setHorizontalGroup(
            jPanel_opcionMotivo3TransferirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_motivoPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        jPanel_opcionMotivo3TransferirLayout.setVerticalGroup(
            jPanel_opcionMotivo3TransferirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_motivoPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel_containerTrasferirLayout = new javax.swing.GroupLayout(jPanel_containerTrasferir);
        jPanel_containerTrasferir.setLayout(jPanel_containerTrasferirLayout);
        jPanel_containerTrasferirLayout.setHorizontalGroup(
            jPanel_containerTrasferirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_containerTrasferirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_tituloMontoTransferir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel_containerTrasferirLayout.createSequentialGroup()
                .addGroup(jPanel_containerTrasferirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_containerTrasferirLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel_iconoMontoTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel_containerTrasferirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_tituloRutTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_montoIngresarTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_rutIngresarTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_montivoTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_numeroTranseferir, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_IconAccionTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel_containerTrasferirLayout.createSequentialGroup()
                                .addComponent(jPanel_opcionMotivo1Transferir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jPanel_opcionMotivo2Transferir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jPanel_opcionMotivo3Transferir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 137, Short.MAX_VALUE))
                    .addGroup(jPanel_containerTrasferirLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_transferencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel_containerTrasferirLayout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jSeparator_decoracionTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel_containerTrasferirLayout.setVerticalGroup(
            jPanel_containerTrasferirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_containerTrasferirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_transferencia)
                .addGap(27, 27, 27)
                .addComponent(jLabel_tituloMontoTransferir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_containerTrasferirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_iconoMontoTransferir)
                    .addComponent(jTextField_montoIngresarTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel_tituloRutTransferir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_rutIngresarTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_montivoTransferir)
                .addGap(10, 10, 10)
                .addGroup(jPanel_containerTrasferirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel_opcionMotivo2Transferir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_opcionMotivo3Transferir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_opcionMotivo1Transferir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel_numeroTranseferir)
                .addGap(26, 26, 26)
                .addComponent(jLabel_IconAccionTransferir)
                .addGap(18, 18, 18)
                .addComponent(jSeparator_decoracionTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(466, 466, 466))
        );

        jPanel_containerFuncionalidades.add(jPanel_containerTrasferir, "card6");

        jPanel_containerDivisa.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_tituloDivisa.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel_tituloDivisa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_tituloDivisa.setText("Calculadora de divisa");

        jLabel_iconoDolarDivisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Dolar.png"))); // NOI18N

        jLabel_iconoEuroDivisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Euro.png"))); // NOI18N

        jLabel_CalculoEuroDivisa.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel_CalculoEuroDivisa.setForeground(new java.awt.Color(102, 102, 102));

        jLabel_CalculoDolarDivisa.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel_CalculoDolarDivisa.setForeground(new java.awt.Color(102, 102, 102));

        jLabel_iconoCambioDivisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Divisa.png"))); // NOI18N

        jLabel_botonCalcularDivisa.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel_botonCalcularDivisa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_botonCalcularDivisa.setText("Calcular");
        jLabel_botonCalcularDivisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_botonCalcularDivisa_MouseClicked(evt);
            }
        });

        jTextField_ingresarMontoDivisa.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jTextField_ingresarMontoDivisa.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_ingresarMontoDivisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ingresarMontoDivisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_containerDivisaLayout = new javax.swing.GroupLayout(jPanel_containerDivisa);
        jPanel_containerDivisa.setLayout(jPanel_containerDivisaLayout);
        jPanel_containerDivisaLayout.setHorizontalGroup(
            jPanel_containerDivisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_containerDivisaLayout.createSequentialGroup()
                .addGroup(jPanel_containerDivisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_containerDivisaLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(jPanel_containerDivisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_containerDivisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator_decoracionDivisa2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_containerDivisaLayout.createSequentialGroup()
                                    .addComponent(jLabel_iconoEuroDivisa)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel_CalculoEuroDivisa, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_containerDivisaLayout.createSequentialGroup()
                                    .addComponent(jLabel_iconoDolarDivisa)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel_containerDivisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator_decoracionDivisa1)
                                        .addComponent(jLabel_CalculoDolarDivisa, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel_containerDivisaLayout.createSequentialGroup()
                                .addComponent(jLabel_iconoCambioDivisa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel_containerDivisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator_decoracionDivisa3, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                                    .addComponent(jTextField_ingresarMontoDivisa))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel_containerDivisaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_tituloDivisa, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_containerDivisaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_botonCalcularDivisa, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_containerDivisaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator_decoracionDivisa4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250))
        );
        jPanel_containerDivisaLayout.setVerticalGroup(
            jPanel_containerDivisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_containerDivisaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_tituloDivisa)
                .addGap(62, 62, 62)
                .addGroup(jPanel_containerDivisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_iconoCambioDivisa, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jTextField_ingresarMontoDivisa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator_decoracionDivisa3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_botonCalcularDivisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator_decoracionDivisa4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel_containerDivisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_iconoDolarDivisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_CalculoDolarDivisa, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator_decoracionDivisa1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel_containerDivisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_iconoEuroDivisa)
                    .addComponent(jLabel_CalculoEuroDivisa, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jSeparator_decoracionDivisa2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(591, Short.MAX_VALUE))
        );

        jPanel_containerFuncionalidades.add(jPanel_containerDivisa, "card5");

        javax.swing.GroupLayout jPanel_containerDashboardLayout = new javax.swing.GroupLayout(jPanel_containerDashboard);
        jPanel_containerDashboard.setLayout(jPanel_containerDashboardLayout);
        jPanel_containerDashboardLayout.setHorizontalGroup(
            jPanel_containerDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_containerDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_containerMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel_containerFuncionalidades, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel_containerDashboardLayout.setVerticalGroup(
            jPanel_containerDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_containerDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_containerDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel_containerMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_containerFuncionalidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_containerDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_containerDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_inicioMouse_Clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_inicioMouse_Clicked
        this.jPanel_containerInicio.setVisible(true);
        this.jPanel_containerTrasferir.setVisible(false);
        this.jPanel_containerFondos.setVisible(false);
        this.jPanel_containerCartola.setVisible(false);
        this.jPanel_containerDivisa.setVisible(false);
    }//GEN-LAST:event_jLabel_inicioMouse_Clicked

    private void jLabel_iconoTransferir_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_iconoTransferir_MouseClicked
        this.jPanel_containerInicio.setVisible(false);
        this.jPanel_containerTrasferir.setVisible(true);
        this.jPanel_containerFondos.setVisible(false);
        this.jPanel_containerCartola.setVisible(false);
        this.jPanel_containerDivisa.setVisible(false);
    }//GEN-LAST:event_jLabel_iconoTransferir_MouseClicked

    private void jLabel_iconoFondos_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_iconoFondos_MouseClicked
        this.jPanel_containerInicio.setVisible(false);
        this.jPanel_containerTrasferir.setVisible(false);
        this.jPanel_containerFondos.setVisible(true);
        this.jPanel_containerCartola.setVisible(false);
        this.jPanel_containerDivisa.setVisible(false);
        
        
        
        String numeroTarjta= baseDeDatos.retornarNumTarjeta(this.rut);
        
        int fondo = baseDeDatos.retornarSaldo(numeroTarjta);
            modificarFondos(String.valueOf(fondo), rut);
    }//GEN-LAST:event_jLabel_iconoFondos_MouseClicked

    private void jLabel_iconoDivisa_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_iconoDivisa_MouseClicked
        this.jPanel_containerInicio.setVisible(false);
        this.jPanel_containerTrasferir.setVisible(false);
        this.jPanel_containerFondos.setVisible(false);
        this.jPanel_containerCartola.setVisible(false);
        this.jPanel_containerDivisa.setVisible(true);
    }//GEN-LAST:event_jLabel_iconoDivisa_MouseClicked

    private void jLabel_salir_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_salir_MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel_salir_MouseClicked

    private void jTextField_rutIngresarTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_rutIngresarTransferirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_rutIngresarTransferirActionPerformed

    private void jTextField_montoIngresarTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_montoIngresarTransferirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_montoIngresarTransferirActionPerformed

    private void jLabel_IconAccionTransferir_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_IconAccionTransferir_MouseClicked
        Control a = new Control();

        String rut = this.rut;

        String numtarjeta = baseDeDatos.retornarNumTarjeta(rut);
        String monto = jTextField_montoIngresarTransferir.getText();
        String rutATransferir = jTextField_rutIngresarTransferir.getText();

        int gasto = Integer.parseInt(monto);

        if (baseDeDatos.comprobarSaldo(numtarjeta, gasto)
                && a.validarRut(rutATransferir)
                && baseDeDatos.comprobarUsuarioTransaccion(rutATransferir)) {

            baseDeDatos.quitarDinero(numtarjeta, gasto);

            String numtarjeta2 = baseDeDatos.retornarNumTarjeta(rutATransferir);
            baseDeDatos.agregarDinero(numtarjeta2, gasto);

            String fechaTransaccion = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(Calendar.getInstance().getTime());

            int numtransaccion = a.generarNumTransaccion();

            jLabel_numeroTranseferir.setText(String.valueOf(numtransaccion));

            baseDeDatos.guardarTransaccion(new Transaccion(fechaTransaccion, gasto, rutATransferir, this.rut, numtransaccion));
            
            

        }

    }//GEN-LAST:event_jLabel_IconAccionTransferir_MouseClicked

    private void jLabel_botonCalcularDivisa_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_botonCalcularDivisa_MouseClicked
        Control control = new Control();

        String rut = this.rut;

        String numtarjeta = baseDeDatos.retornarNumTarjeta(rut);
        int saldo = baseDeDatos.retornarSaldo(numtarjeta);

        jTextField_ingresarMontoDivisa.setText(String.valueOf(saldo));

        jLabel_CalculoDolarDivisa.setText(control.calcularDivisaDolar(saldo));
        jLabel_CalculoEuroDivisa.setText(control.calcularDivisaEuro(saldo));

    }//GEN-LAST:event_jLabel_botonCalcularDivisa_MouseClicked


    private void jTextField_ingresarMontoDivisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ingresarMontoDivisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ingresarMontoDivisaActionPerformed

     private void jPanel_opcionMotivo1Transferir_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_opcionMotivo1Transferir_MouseClicked
         baseDeDatos.agregarMotivoTransaccion(this.rut, String.valueOf(Motivo.PERSONAL));
      }//GEN-LAST:event_jPanel_opcionMotivo1Transferir_MouseClicked

      private void jPanel_opcionMotivo2Transferir_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_opcionMotivo2Transferir_MouseClicked
          baseDeDatos.agregarMotivoTransaccion(this.rut, String.valueOf(Motivo.PAGO));
       }//GEN-LAST:event_jPanel_opcionMotivo2Transferir_MouseClicked

       private void jPanel_opcionMotivo3Transferir_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_opcionMotivo3Transferir_MouseClicked
           baseDeDatos.agregarMotivoTransaccion(this.rut, String.valueOf(Motivo.PRESTAMO));
      }//GEN-LAST:event_jPanel_opcionMotivo3Transferir_MouseClicked

    private void jLabel_motivoPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_motivoPersonalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_motivoPersonalMouseClicked

    private void jLabel_motivoPrestamoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_motivoPrestamoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_motivoPrestamoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_CalculoDolarDivisa;
    private javax.swing.JLabel jLabel_CalculoEuroDivisa;
    private javax.swing.JLabel jLabel_IconAccionTransferir;
    private javax.swing.JLabel jLabel_apellidoMaternoInicio;
    private javax.swing.JLabel jLabel_apellidoPaternoInicio;
    private javax.swing.JLabel jLabel_botonCalcularDivisa;
    private javax.swing.JLabel jLabel_iconInicio;
    private javax.swing.JLabel jLabel_iconoCambioDivisa;
    private javax.swing.JLabel jLabel_iconoDivisa;
    private javax.swing.JLabel jLabel_iconoDolarDivisa;
    private javax.swing.JLabel jLabel_iconoEuroDivisa;
    private javax.swing.JLabel jLabel_iconoFondos;
    private javax.swing.JLabel jLabel_iconoMontoTransferir;
    private javax.swing.JLabel jLabel_iconoTransferir;
    private javax.swing.JLabel jLabel_inicio;
    private javax.swing.JLabel jLabel_mailInicio;
    private javax.swing.JLabel jLabel_montivoTransferir;
    private javax.swing.JLabel jLabel_mostraMontorFondos;
    private javax.swing.JLabel jLabel_motivoPago;
    private javax.swing.JLabel jLabel_motivoPersonal;
    private javax.swing.JLabel jLabel_motivoPrestamo;
    private javax.swing.JLabel jLabel_nombreInicio;
    private javax.swing.JLabel jLabel_numeroTranseferir;
    private javax.swing.JLabel jLabel_rutInicio;
    private javax.swing.JLabel jLabel_salir;
    private javax.swing.JLabel jLabel_tituloCartola;
    private javax.swing.JLabel jLabel_tituloDivisa;
    private javax.swing.JLabel jLabel_tituloFondos;
    private javax.swing.JLabel jLabel_tituloMontoTransferir;
    private javax.swing.JLabel jLabel_tituloMostrarFondos;
    private javax.swing.JLabel jLabel_tituloRutTransferir;
    private javax.swing.JLabel jLabel_transferencia;
    private javax.swing.JPanel jPanel_containerCartola;
    private javax.swing.JPanel jPanel_containerDashboard;
    private javax.swing.JPanel jPanel_containerDivisa;
    private javax.swing.JPanel jPanel_containerFondos;
    private javax.swing.JPanel jPanel_containerFuncionalidades;
    private javax.swing.JPanel jPanel_containerInicio;
    private javax.swing.JPanel jPanel_containerMenu;
    private javax.swing.JPanel jPanel_containerTrasferir;
    private javax.swing.JPanel jPanel_decoracionTapar;
    private javax.swing.JPanel jPanel_opcionMotivo1Transferir;
    private javax.swing.JPanel jPanel_opcionMotivo2Transferir;
    private javax.swing.JPanel jPanel_opcionMotivo3Transferir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator_decoracionCartola1;
    private javax.swing.JSeparator jSeparator_decoracionCartola2;
    private javax.swing.JSeparator jSeparator_decoracionDivisa1;
    private javax.swing.JSeparator jSeparator_decoracionDivisa2;
    private javax.swing.JSeparator jSeparator_decoracionDivisa3;
    private javax.swing.JSeparator jSeparator_decoracionDivisa4;
    private javax.swing.JSeparator jSeparator_decoracionFondos1;
    private javax.swing.JSeparator jSeparator_decoracionFondos2;
    private javax.swing.JSeparator jSeparator_decoracionTransferir;
    private javax.swing.JTable jTable_Cartola;
    private javax.swing.JTable jTable_fondos;
    private javax.swing.JTextField jTextField_ingresarMontoDivisa;
    private javax.swing.JTextField jTextField_montoIngresarTransferir;
    private javax.swing.JTextField jTextField_rutIngresarTransferir;
    // End of variables declaration//GEN-END:variables

}
