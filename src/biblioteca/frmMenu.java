
package biblioteca;

public class frmMenu extends javax.swing.JFrame {
    public Pila<Alumno> pilaAlumno = new Pila<Alumno>();
    public Pila<Libro> pilaLibro = new Pila<Libro>();
    public Pila<Prestamo> pilaPrestamo = new Pila<Prestamo>();
    

    
    public frmMenu(Pila<Alumno> pilaAlumno, Pila<Libro> pilaLibro, Pila<Prestamo> pilaPrestamo) {
        initComponents();
        if(!pilaAlumno.isEmpty())
            this.pilaAlumno = pilaAlumno;
        if(!pilaLibro.isEmpty())
            this.pilaLibro = pilaLibro;
        if(!pilaPrestamo.isEmpty())
            this.pilaPrestamo = pilaPrestamo;
    }
    private frmMenu() {
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jlbEstatus = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaResultado = new javax.swing.JTextArea();
        jmbBarraMenu = new javax.swing.JMenuBar();
        jmAlumno = new javax.swing.JMenu();
        jmiInsertarA = new javax.swing.JMenuItem();
        jmiMostrarA = new javax.swing.JMenuItem();
        jmiEliminarA = new javax.swing.JMenuItem();
        jmLibro = new javax.swing.JMenu();
        jmiInsertarL = new javax.swing.JMenuItem();
        jmiMostrarL = new javax.swing.JMenuItem();
        jmiEliminarL = new javax.swing.JMenuItem();
        jmPrestamo = new javax.swing.JMenu();
        jmiInsertarP = new javax.swing.JMenuItem();
        jmiMostrarP = new javax.swing.JMenuItem();
        jmiEliminarP = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbEstatus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbEstatus.setText("Estatus: Inicio");

        jtaResultado.setColumns(20);
        jtaResultado.setRows(5);
        jScrollPane1.setViewportView(jtaResultado);

        jmAlumno.setText("Alumno");

        jmiInsertarA.setText("Insertar");
        jmiInsertarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiInsertarAActionPerformed(evt);
            }
        });
        jmAlumno.add(jmiInsertarA);

        jmiMostrarA.setText("Mostrar");
        jmiMostrarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiMostrarAActionPerformed(evt);
            }
        });
        jmAlumno.add(jmiMostrarA);

        jmiEliminarA.setText("Eliminar");
        jmiEliminarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEliminarAActionPerformed(evt);
            }
        });
        jmAlumno.add(jmiEliminarA);

        jmbBarraMenu.add(jmAlumno);

        jmLibro.setText("Libro");

        jmiInsertarL.setText("Insertar");
        jmiInsertarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiInsertarLActionPerformed(evt);
            }
        });
        jmLibro.add(jmiInsertarL);

        jmiMostrarL.setText("Mostrar");
        jmiMostrarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiMostrarLActionPerformed(evt);
            }
        });
        jmLibro.add(jmiMostrarL);

        jmiEliminarL.setText("Eliminar");
        jmiEliminarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEliminarLActionPerformed(evt);
            }
        });
        jmLibro.add(jmiEliminarL);

        jmbBarraMenu.add(jmLibro);

        jmPrestamo.setText("Prestamo");

        jmiInsertarP.setText("Insertar");
        jmiInsertarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiInsertarPActionPerformed(evt);
            }
        });
        jmPrestamo.add(jmiInsertarP);

        jmiMostrarP.setText("Mostrar");
        jmiMostrarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiMostrarPActionPerformed(evt);
            }
        });
        jmPrestamo.add(jmiMostrarP);

        jmiEliminarP.setText("Eliminar");
        jmiEliminarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEliminarPActionPerformed(evt);
            }
        });
        jmPrestamo.add(jmiEliminarP);

        jmbBarraMenu.add(jmPrestamo);

        jMenu1.setText("File");
        jmbBarraMenu.add(jMenu1);

        jMenu2.setText("Edit");
        jmbBarraMenu.add(jMenu2);

        setJMenuBar(jmbBarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbEstatus)
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jlbEstatus)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiInsertarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiInsertarLActionPerformed
        frmLibro f = new frmLibro(pilaAlumno, pilaLibro, pilaPrestamo);
        f.setVisible(true); //Muestra la ventana de Formulario
        this.setVisible(false); //Hace invisible la ventana actual
    }//GEN-LAST:event_jmiInsertarLActionPerformed

    private void jmiInsertarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiInsertarPActionPerformed
        frmPrestamo f = new frmPrestamo(pilaAlumno, pilaLibro, pilaPrestamo);
        f.setVisible(true); //Muestra la ventana de Formulario
        this.setVisible(false); //Hace invisible la ventana actual
    }//GEN-LAST:event_jmiInsertarPActionPerformed

    private void jmiInsertarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiInsertarAActionPerformed
        frmAlumno f = new frmAlumno(pilaAlumno, pilaLibro, pilaPrestamo);
        f.setVisible(true); //Muestra la ventana de Formulario
        this.setVisible(false); //Hace invisible la ventana actual
    }//GEN-LAST:event_jmiInsertarAActionPerformed

    private void jmiMostrarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiMostrarAActionPerformed
        if(!pilaAlumno.isEmpty())
            this.jtaResultado.setText(pilaAlumno.toString());
        else
            this.jtaResultado.setText("Sin datos para mostrar...");
    }//GEN-LAST:event_jmiMostrarAActionPerformed

    private void jmiMostrarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiMostrarLActionPerformed
        if(!pilaLibro.isEmpty())
            this.jtaResultado.setText(pilaLibro.toString());
        else
            this.jtaResultado.setText("Sin datos para mostrar...");
    }//GEN-LAST:event_jmiMostrarLActionPerformed

    private void jmiMostrarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiMostrarPActionPerformed
        if(!pilaPrestamo.isEmpty())
            this.jtaResultado.setText(pilaPrestamo.toString());
        else
            this.jtaResultado.setText("Sin datos para mostrar...");
    }//GEN-LAST:event_jmiMostrarPActionPerformed

    private void jmiEliminarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEliminarAActionPerformed
        if(!pilaAlumno.isEmpty()){
            pilaAlumno.pop();
            this.jtaResultado.setText("");
            if(!pilaAlumno.isEmpty())
                this.jtaResultado.setText(pilaAlumno.toString());
            else
                this.jtaResultado.setText("Sin datos para mostrar...");
        }
    }//GEN-LAST:event_jmiEliminarAActionPerformed

    private void jmiEliminarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEliminarLActionPerformed
        if(!pilaLibro.isEmpty()){
            pilaLibro.pop();
            this.jtaResultado.setText("");
            if(!pilaLibro.isEmpty())
                this.jtaResultado.setText(pilaLibro.toString());
            else
                this.jtaResultado.setText("Sin datos para mostrar...");
        }
    }//GEN-LAST:event_jmiEliminarLActionPerformed

    private void jmiEliminarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEliminarPActionPerformed
        if(!pilaPrestamo.isEmpty()){
            pilaPrestamo.pop();
            this.jtaResultado.setText("");
            if(!pilaPrestamo.isEmpty())
                this.jtaResultado.setText(pilaPrestamo.toString());
            else
                this.jtaResultado.setText("Sin datos para mostrar...");
        }
    }//GEN-LAST:event_jmiEliminarPActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbEstatus;
    private javax.swing.JMenu jmAlumno;
    private javax.swing.JMenu jmLibro;
    private javax.swing.JMenu jmPrestamo;
    private javax.swing.JMenuBar jmbBarraMenu;
    private javax.swing.JMenuItem jmiEliminarA;
    private javax.swing.JMenuItem jmiEliminarL;
    private javax.swing.JMenuItem jmiEliminarP;
    private javax.swing.JMenuItem jmiInsertarA;
    private javax.swing.JMenuItem jmiInsertarL;
    private javax.swing.JMenuItem jmiInsertarP;
    private javax.swing.JMenuItem jmiMostrarA;
    private javax.swing.JMenuItem jmiMostrarL;
    private javax.swing.JMenuItem jmiMostrarP;
    private javax.swing.JTextArea jtaResultado;
    // End of variables declaration//GEN-END:variables
}
