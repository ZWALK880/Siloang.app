package view;

import Config.Koneksi;
import aplikasidesktopsiloang.MenuUtama;
import aplikasidesktopsiloang.MenuUtamaKasir;
import view.FiturChangePassword;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;

public class FiturLogin extends javax.swing.JFrame {

    private Connection conn;

    public FiturLogin() {
        initComponents();
        conn = Koneksi.getConnection();
        setActionButton();
        lb_hidePassword.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        left = new javax.swing.JPanel();
        lb_logoSiloang = new javax.swing.JLabel();
        right = new javax.swing.JPanel();
        lb_welcome = new javax.swing.JLabel();
        lb_please = new javax.swing.JLabel();
        lb_email = new javax.swing.JLabel();
        tf_username = new javax.swing.JTextField();
        lb_password = new javax.swing.JLabel();
        lb_forgotPassword = new javax.swing.JLabel();
        lb_hidePassword = new javax.swing.JLabel();
        lb_showPassword = new javax.swing.JLabel();
        tf_password = new javax.swing.JPasswordField();
        bt_checkBox = new javax.swing.JCheckBox();
        bt_login = new javax.swing.JButton();
        lb_dontHave = new javax.swing.JLabel();
        lb_register = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN - Aplikasi Desktop SiLoang");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        left.setBackground(new java.awt.Color(255, 255, 255));

        lb_logoSiloang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg_formSiloang.png"))); // NOI18N

        javax.swing.GroupLayout leftLayout = new javax.swing.GroupLayout(left);
        left.setLayout(leftLayout);
        leftLayout.setHorizontalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftLayout.createSequentialGroup()
                .addComponent(lb_logoSiloang)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        leftLayout.setVerticalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftLayout.createSequentialGroup()
                .addComponent(lb_logoSiloang)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(left);
        left.setBounds(0, 0, 400, 500);

        right.setBackground(new java.awt.Color(14, 97, 171));
        right.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_welcome.setFont(new java.awt.Font("SansSerif", 1, 26)); // NOI18N
        lb_welcome.setForeground(new java.awt.Color(255, 255, 255));
        lb_welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_welcome.setText("Welcome Back!");
        right.add(lb_welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 67, 390, -1));

        lb_please.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lb_please.setForeground(new java.awt.Color(255, 255, 255));
        lb_please.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_please.setText("Please enter your details to login.");
        right.add(lb_please, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 104, 390, -1));

        lb_email.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lb_email.setForeground(new java.awt.Color(255, 255, 255));
        lb_email.setText("Username");
        right.add(lb_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 173, -1, -1));

        tf_username.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        right.add(tf_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 195, 230, 40));

        lb_password.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lb_password.setForeground(new java.awt.Color(255, 255, 255));
        lb_password.setText("Password");
        right.add(lb_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 241, -1, -1));

        lb_forgotPassword.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lb_forgotPassword.setForeground(new java.awt.Color(183, 183, 183));
        lb_forgotPassword.setText("  Change password?");
        lb_forgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_forgotPasswordMouseClicked(evt);
            }
        });
        right.add(lb_forgotPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 241, 110, -1));

        lb_hidePassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_hidePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_eyeVisible.png"))); // NOI18N
        right.add(lb_hidePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 268, 30, 30));

        lb_showPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_showPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_eyeDetector.png"))); // NOI18N
        right.add(lb_showPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 268, 30, 30));

        tf_password.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        right.add(tf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 263, 230, 40));

        bt_checkBox.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        bt_checkBox.setForeground(new java.awt.Color(255, 255, 255));
        bt_checkBox.setText("Remember me");
        bt_checkBox.setBorder(null);
        bt_checkBox.setContentAreaFilled(false);
        right.add(bt_checkBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 310, -1, -1));

        bt_login.setBackground(new java.awt.Color(28, 179, 228));
        bt_login.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        bt_login.setForeground(new java.awt.Color(255, 255, 255));
        bt_login.setText("Login");
        right.add(bt_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 351, 230, 40));

        lb_dontHave.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lb_dontHave.setForeground(new java.awt.Color(255, 255, 255));
        lb_dontHave.setText("Don't have an account?");
        right.add(lb_dontHave, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 397, -1, -1));

        lb_register.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lb_register.setForeground(new java.awt.Color(183, 183, 183));
        lb_register.setText("Register");
        lb_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_registerMouseClicked(evt);
            }
        });
        right.add(lb_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 397, -1, -1));

        jPanel1.add(right);
        right.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lb_registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_registerMouseClicked
        this.dispose();
        FiturRegister Register = new FiturRegister();
        Register.setVisible(true);
    }//GEN-LAST:event_lb_registerMouseClicked

    private void lb_forgotPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_forgotPasswordMouseClicked
        this.dispose();
        FiturChangePassword forgotPassword = new FiturChangePassword();
        forgotPassword.setVisible(true);
    }//GEN-LAST:event_lb_forgotPasswordMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatLightLaf.setup();
        //FlatDarkLaf.setup();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FiturLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox bt_checkBox;
    private javax.swing.JButton bt_login;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_dontHave;
    private javax.swing.JLabel lb_email;
    private javax.swing.JLabel lb_forgotPassword;
    private javax.swing.JLabel lb_hidePassword;
    private javax.swing.JLabel lb_logoSiloang;
    private javax.swing.JLabel lb_password;
    private javax.swing.JLabel lb_please;
    private javax.swing.JLabel lb_register;
    private javax.swing.JLabel lb_showPassword;
    private javax.swing.JLabel lb_welcome;
    private javax.swing.JPanel left;
    private javax.swing.JPanel right;
    private javax.swing.JPasswordField tf_password;
    private javax.swing.JTextField tf_username;
    // End of variables declaration//GEN-END:variables

    private void setActionButton() {
        lb_showPassword.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lb_showPassword.setVisible(false);
                lb_hidePassword.setVisible(true);
                tf_password.setEchoChar((char) 0);
            }
        });

        lb_hidePassword.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lb_showPassword.setVisible(true);
                lb_hidePassword.setVisible(false);
                tf_password.setEchoChar('•');
            }
        });

        bt_login.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                prosesLogin();
            }
        });

        tf_password.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    bt_login.doClick();
                }
            }
        });
    }

    private boolean validasiInput() {
        boolean valid = false;
        if (tf_username.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username tidak boleh kosong");
        } else if (tf_password.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password tidak boleh kosong");
        } else {
            valid = true;
        }
        return valid;
    }

    private String[] checkLogin(String username, String password) {
        if (conn != null) {
            try {
                String sql = "SELECT id_user, level, nama FROM user WHERE username=? AND password=?";
                PreparedStatement st = conn.prepareStatement(sql);
                st.setString(1, username);
                st.setString(2, password);

                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    // Mengembalikan id_user, level, dan nama pengguna jika login berhasil
                    return new String[] {
                        rs.getString("id_user"),
                        rs.getString("level"),
                        rs.getString("nama")
                    };
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null; // Mengembalikan null jika login gagal
    }


    private void prosesLogin() {
        if (validasiInput()) {
            String username = tf_username.getText();
            String password = new String(tf_password.getPassword());

            String[] userData = checkLogin(username, password);

            if (userData != null) {
                String userID = userData[0];
                String level = userData[1];
                String userName = userData.length > 2 ? userData[2] : "Pengguna"; // Nama pengguna opsional

                if (level.equalsIgnoreCase("Admin")) {
                    MenuUtama mn = new MenuUtama(userID);
                    mn.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Selamat Datang, " + userName + "! Anda masuk sebagai Admin.");
                } else if (level.equalsIgnoreCase("Kasir")) {
                    MenuUtamaKasir mnk = new MenuUtamaKasir(userID);
                    mnk.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Selamat Datang, " + userName + "! Anda masuk sebagai Kasir.");
                } else {
                    JOptionPane.showMessageDialog(this, "Level tidak dikenal! Mohon hubungi administrator.");
                    return;
                }

                dispose(); // Menutup form login
            } else {
                JOptionPane.showMessageDialog(this, "Username atau Password salah !");
            }
        }
    }
}