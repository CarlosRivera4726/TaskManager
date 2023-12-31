package dev.carlos.taskmanager;

import dev.carlos.resources.CustomColors;
import java.awt.Color;

/**
 *
 * @author carlos
 */
public class TaskManager extends javax.swing.JFrame {
    int mouseX, mouseY;

    public TaskManager() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        topBar = new javax.swing.JPanel();
        btnExit = new javax.swing.JPanel();
        lblBtnExit = new javax.swing.JLabel();
        bg_title = new javax.swing.JLabel();
        form = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        btnIngresar = new javax.swing.JPanel();
        lblBtnIngresar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TASK MANAGER");
        setBackground(new java.awt.Color(12, 29, 54));
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(12, 29, 54));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topBar.setBackground(new java.awt.Color(12, 29, 54));
        topBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                topBarMouseDragged(evt);
            }
        });
        topBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topBarMousePressed(evt);
            }
        });
        topBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setBackground(new java.awt.Color(249, 204, 11));
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblBtnExit.setFont(lblBtnExit.getFont().deriveFont(lblBtnExit.getFont().getStyle() | java.awt.Font.BOLD, 23));
        lblBtnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnExit.setText("X");
        lblBtnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBtnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnExitLayout = new javax.swing.GroupLayout(btnExit);
        btnExit.setLayout(btnExitLayout);
        btnExitLayout.setHorizontalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnExitLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnExitLayout.setVerticalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        topBar.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        bg.add(topBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, -1));

        bg_title.setBackground(new java.awt.Color(12, 29, 54));
        bg_title.setIcon(new javax.swing.ImageIcon("/home/carlos/NetBeansProjects/TaskManager/src/main/java/dev/carlos/resources/Logo_Task_Manager.png")); // NOI18N
        bg.add(bg_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 290, 590));

        form.setBackground(new java.awt.Color(12, 29, 54));
        form.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        lblUser.setFont(lblUser.getFont().deriveFont(lblUser.getFont().getStyle() | java.awt.Font.BOLD, 28));
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("USUARIO");

        txtUser.setBackground(new java.awt.Color(12, 29, 54));
        txtUser.setFont(txtUser.getFont());
        txtUser.setForeground(new java.awt.Color(204, 204, 204));
        txtUser.setText("Ingrese su usuario");
        txtUser.setBorder(null);
        txtUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUserMousePressed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 51, 255));

        lblPassword.setFont(lblPassword.getFont().deriveFont(lblPassword.getFont().getStyle() | java.awt.Font.BOLD, 28));
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("CONTRASEÑA");

        txtPassword.setBackground(new java.awt.Color(12, 29, 54));
        txtPassword.setFont(txtPassword.getFont());
        txtPassword.setForeground(new java.awt.Color(204, 204, 204));
        txtPassword.setText("********");
        txtPassword.setBorder(null);
        txtPassword.setPreferredSize(new java.awt.Dimension(120, 19));
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPasswordMousePressed(evt);
            }
        });

        btnIngresar.setBackground(new java.awt.Color(249, 204, 11));
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblBtnIngresar.setFont(lblBtnIngresar.getFont().deriveFont(lblBtnIngresar.getFont().getStyle() | java.awt.Font.BOLD));
        lblBtnIngresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnIngresar.setText("INGRESAR");
        lblBtnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnIngresarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnIngresarLayout = new javax.swing.GroupLayout(btnIngresar);
        btnIngresar.setLayout(btnIngresarLayout);
        btnIngresarLayout.setHorizontalGroup(
            btnIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
        );
        btnIngresarLayout.setVerticalGroup(
            btnIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
        form.setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUser)
                    .addComponent(lblPassword)
                    .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator2)
                        .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                        .addComponent(txtUser)
                        .addComponent(jSeparator1)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(lblUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lblPassword)
                .addGap(13, 13, 13)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        bg.add(form, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 520, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void topBarMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_topBarMousePressed
        // TODO add your handling code here:
        mouseX = evt.getX();
        mouseY = evt.getY();

    }// GEN-LAST:event_topBarMousePressed

    private void topBarMouseDragged(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_topBarMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mouseX, y - mouseY);
    }// GEN-LAST:event_topBarMouseDragged

    private void lblBtnExitMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_lblBtnExitMouseEntered
        // TODO add your handling code here:
        btnExit.setBackground(Color.red);
        lblBtnExit.setForeground(Color.white);
    }// GEN-LAST:event_lblBtnExitMouseEntered

    private void lblBtnExitMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_lblBtnExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }// GEN-LAST:event_lblBtnExitMouseClicked

    private void lblBtnExitMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_lblBtnExitMouseExited
        btnExit.setBackground(CustomColors.YELLOW_COLOR);
        lblBtnExit.setForeground(Color.BLACK);
    }// GEN-LAST:event_lblBtnExitMouseExited

    private void lblBtnIngresarMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_lblBtnIngresarMouseEntered
        // TODO add your handling code here:
        btnIngresar.setBackground(Color.WHITE);
    }// GEN-LAST:event_lblBtnIngresarMouseEntered

    private void lblBtnIngresarMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_lblBtnIngresarMouseExited
        btnIngresar.setBackground(CustomColors.YELLOW_COLOR);
    }// GEN-LAST:event_lblBtnIngresarMouseExited

    private void txtUserMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtUserMousePressed
        // TODO add your handling code here:
        if(txtUser.getText().equals("Ingrese su usuario"))
        {
            txtUser.setText("");
            txtUser.setForeground(Color.white);
            this.jSeparator1.setForeground(CustomColors.YELLOW_COLOR);
            this.jSeparator2.setForeground(Color.GRAY);
        }
        if(String.valueOf(txtPassword.getPassword()).isEmpty())
        {
            txtPassword.setText("********");
            txtPassword.setForeground(Color.gray);
        }
        
    }// GEN-LAST:event_txtUserMousePressed

    private void txtPasswordMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtPasswordMousePressed
        // TODO add your handling code here:
        if(String.valueOf(txtPassword.getPassword()).equals("********"))
        {
            txtPassword.setText("");
            txtPassword.setForeground(Color.white);
            this.jSeparator1.setForeground(Color.GRAY);
            this.jSeparator2.setForeground(CustomColors.YELLOW_COLOR);
        }
        if(txtUser.getText().isEmpty())
        {
            txtUser.setText("Ingrese su usuario");
            txtUser.setForeground(Color.gray);
        }
        
    }// GEN-LAST:event_txtPasswordMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TaskManager.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskManager.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskManager.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskManager.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaskManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bg_title;
    private javax.swing.JPanel btnExit;
    private javax.swing.JPanel btnIngresar;
    private javax.swing.JPanel form;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblBtnExit;
    private javax.swing.JLabel lblBtnIngresar;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel topBar;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
