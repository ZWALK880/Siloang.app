package aplikasidesktopsiloang;

import view.FiturLogin;
import view.FiturDashboard;
import view.FiturProduk;
import view.FiturPelanggan;
import view.FiturSupplier;
import view.FiturPenjualan;
import view.FiturPembelian;
import view.FiturKeuangan;
import java.awt.Color;
import java.awt.PopupMenu;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MenuUtama extends javax.swing.JFrame {

    private String userID;
    
    public MenuUtama(String userID) {
        initComponents();
        this.userID = userID;
    }
    
    public String getUserID() {
        return userID;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_kiri = new javax.swing.JPanel();
        pn_profil = new javax.swing.JPanel();
        lb_akun = new javax.swing.JLabel();
        lb_admin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pn_btnDashboard = new javax.swing.JPanel();
        pn_line = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lb_dashboard = new javax.swing.JLabel();
        pn_btnProduk = new javax.swing.JPanel();
        pn_line1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lb_produk = new javax.swing.JLabel();
        pn_btnPenjualan = new javax.swing.JPanel();
        pn_line2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lb_penjualan = new javax.swing.JLabel();
        pn_btnPembelian = new javax.swing.JPanel();
        pn_line3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lb_pembelian = new javax.swing.JLabel();
        pn_btnKeuangan = new javax.swing.JPanel();
        pn_line4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        lb_keuangan = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pn_btnPelanggan = new javax.swing.JPanel();
        pn_line5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lb_pelanggan = new javax.swing.JLabel();
        pn_btnSupplier = new javax.swing.JPanel();
        pn_line6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lb_supplier = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pn_kanan = new javax.swing.JPanel();
        pn_navbar = new javax.swing.JPanel();
        lb_logout = new javax.swing.JLabel();
        icon_logout = new javax.swing.JLabel();
        pn_dasar = new javax.swing.JPanel();
        pn_utama = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU UTAMA - Aplikasi Desktop SiLoang");

        pn_kiri.setBackground(new java.awt.Color(17, 97, 171));

        pn_profil.setBackground(new java.awt.Color(3, 78, 143));
        pn_profil.setPreferredSize(new java.awt.Dimension(150, 60));

        lb_akun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_profile.png"))); // NOI18N

        lb_admin.setBackground(new java.awt.Color(255, 255, 255));
        lb_admin.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lb_admin.setForeground(new java.awt.Color(255, 255, 255));
        lb_admin.setText("A D M I N");

        javax.swing.GroupLayout pn_profilLayout = new javax.swing.GroupLayout(pn_profil);
        pn_profil.setLayout(pn_profilLayout);
        pn_profilLayout.setHorizontalGroup(
            pn_profilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_profilLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lb_akun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_admin)
                .addContainerGap())
        );
        pn_profilLayout.setVerticalGroup(
            pn_profilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_profilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_akun, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_profilLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_admin)
                .addGap(17, 17, 17))
        );

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Data Master");

        pn_btnDashboard.setBackground(new java.awt.Color(17, 97, 171));

        pn_line.setBackground(new java.awt.Color(17, 97, 171));

        javax.swing.GroupLayout pn_lineLayout = new javax.swing.GroupLayout(pn_line);
        pn_line.setLayout(pn_lineLayout);
        pn_lineLayout.setHorizontalGroup(
            pn_lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_lineLayout.setVerticalGroup(
            pn_lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_dashboard.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        lb_dashboard.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_dashboard.setForeground(new java.awt.Color(255, 255, 255));
        lb_dashboard.setText("Dashboard");
        lb_dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_dashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_dashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_dashboardMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btnDashboardLayout = new javax.swing.GroupLayout(pn_btnDashboard);
        pn_btnDashboard.setLayout(pn_btnDashboardLayout);
        pn_btnDashboardLayout.setHorizontalGroup(
            pn_btnDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnDashboardLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_dashboard)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pn_btnDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnDashboardLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(164, Short.MAX_VALUE)))
        );
        pn_btnDashboardLayout.setVerticalGroup(
            pn_btnDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btnDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(lb_dashboard))
                .addContainerGap())
            .addGroup(pn_btnDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnDashboardLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pn_btnProduk.setBackground(new java.awt.Color(17, 97, 171));

        pn_line1.setBackground(new java.awt.Color(17, 97, 171));

        javax.swing.GroupLayout pn_line1Layout = new javax.swing.GroupLayout(pn_line1);
        pn_line1.setLayout(pn_line1Layout);
        pn_line1Layout.setHorizontalGroup(
            pn_line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_line1Layout.setVerticalGroup(
            pn_line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_product.png"))); // NOI18N

        lb_produk.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_produk.setForeground(new java.awt.Color(255, 255, 255));
        lb_produk.setText("Produk");
        lb_produk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_produkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_produkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_produkMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btnProdukLayout = new javax.swing.GroupLayout(pn_btnProduk);
        pn_btnProduk.setLayout(pn_btnProdukLayout);
        pn_btnProdukLayout.setHorizontalGroup(
            pn_btnProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnProdukLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_produk)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pn_btnProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnProdukLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(126, Short.MAX_VALUE)))
        );
        pn_btnProdukLayout.setVerticalGroup(
            pn_btnProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnProdukLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btnProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(lb_produk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pn_btnProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnProdukLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pn_btnPenjualan.setBackground(new java.awt.Color(17, 97, 171));

        pn_line2.setBackground(new java.awt.Color(17, 97, 171));

        javax.swing.GroupLayout pn_line2Layout = new javax.swing.GroupLayout(pn_line2);
        pn_line2.setLayout(pn_line2Layout);
        pn_line2Layout.setHorizontalGroup(
            pn_line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_line2Layout.setVerticalGroup(
            pn_line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_penjualan.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        lb_penjualan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_penjualan.setForeground(new java.awt.Color(255, 255, 255));
        lb_penjualan.setText("Penjualan");
        lb_penjualan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_penjualanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_penjualanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_penjualanMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btnPenjualanLayout = new javax.swing.GroupLayout(pn_btnPenjualan);
        pn_btnPenjualan.setLayout(pn_btnPenjualanLayout);
        pn_btnPenjualanLayout.setHorizontalGroup(
            pn_btnPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPenjualanLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_penjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pn_btnPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnPenjualanLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(120, Short.MAX_VALUE)))
        );
        pn_btnPenjualanLayout.setVerticalGroup(
            pn_btnPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_btnPenjualanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btnPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(lb_penjualan))
                .addContainerGap())
            .addGroup(pn_btnPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnPenjualanLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pn_btnPembelian.setBackground(new java.awt.Color(17, 97, 171));

        pn_line3.setBackground(new java.awt.Color(17, 97, 171));

        javax.swing.GroupLayout pn_line3Layout = new javax.swing.GroupLayout(pn_line3);
        pn_line3.setLayout(pn_line3Layout);
        pn_line3Layout.setHorizontalGroup(
            pn_line3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_line3Layout.setVerticalGroup(
            pn_line3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_pengeluaran.png"))); // NOI18N
        jLabel9.setText("jLabel9");

        lb_pembelian.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_pembelian.setForeground(new java.awt.Color(255, 255, 255));
        lb_pembelian.setText("Pembelian");
        lb_pembelian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_pembelianMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_pembelianMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_pembelianMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btnPembelianLayout = new javax.swing.GroupLayout(pn_btnPembelian);
        pn_btnPembelian.setLayout(pn_btnPembelianLayout);
        pn_btnPembelianLayout.setHorizontalGroup(
            pn_btnPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPembelianLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_pembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(pn_btnPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnPembelianLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(124, Short.MAX_VALUE)))
        );
        pn_btnPembelianLayout.setVerticalGroup(
            pn_btnPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPembelianLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btnPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(lb_pembelian))
                .addContainerGap())
            .addGroup(pn_btnPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnPembelianLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pn_btnKeuangan.setBackground(new java.awt.Color(17, 97, 171));

        pn_line4.setBackground(new java.awt.Color(17, 97, 171));

        javax.swing.GroupLayout pn_line4Layout = new javax.swing.GroupLayout(pn_line4);
        pn_line4.setLayout(pn_line4Layout);
        pn_line4Layout.setHorizontalGroup(
            pn_line4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_line4Layout.setVerticalGroup(
            pn_line4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_keuangan.png"))); // NOI18N
        jLabel12.setText("jLabel12");

        lb_keuangan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_keuangan.setForeground(new java.awt.Color(255, 255, 255));
        lb_keuangan.setText("Keuangan");
        lb_keuangan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_keuanganMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_keuanganMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_keuanganMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btnKeuanganLayout = new javax.swing.GroupLayout(pn_btnKeuangan);
        pn_btnKeuangan.setLayout(pn_btnKeuanganLayout);
        pn_btnKeuanganLayout.setHorizontalGroup(
            pn_btnKeuanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnKeuanganLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_keuangan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pn_btnKeuanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnKeuanganLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(170, Short.MAX_VALUE)))
        );
        pn_btnKeuanganLayout.setVerticalGroup(
            pn_btnKeuanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnKeuanganLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btnKeuanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(lb_keuangan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pn_btnKeuanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnKeuanganLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Laporan");

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("AppSiLoang v2.0.24");

        pn_btnPelanggan.setBackground(new java.awt.Color(17, 97, 171));

        pn_line5.setBackground(new java.awt.Color(17, 97, 171));

        javax.swing.GroupLayout pn_line5Layout = new javax.swing.GroupLayout(pn_line5);
        pn_line5.setLayout(pn_line5Layout);
        pn_line5Layout.setHorizontalGroup(
            pn_line5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_line5Layout.setVerticalGroup(
            pn_line5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_pelanggan.png"))); // NOI18N
        jLabel8.setText("jLabel6");

        lb_pelanggan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_pelanggan.setForeground(new java.awt.Color(255, 255, 255));
        lb_pelanggan.setText("Pelanggan");
        lb_pelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_pelangganMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_pelangganMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_pelangganMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btnPelangganLayout = new javax.swing.GroupLayout(pn_btnPelanggan);
        pn_btnPelanggan.setLayout(pn_btnPelangganLayout);
        pn_btnPelangganLayout.setHorizontalGroup(
            pn_btnPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPelangganLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_pelanggan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pn_btnPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnPelangganLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(120, Short.MAX_VALUE)))
        );
        pn_btnPelangganLayout.setVerticalGroup(
            pn_btnPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_btnPelangganLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btnPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_pelanggan))
                .addContainerGap())
            .addGroup(pn_btnPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnPelangganLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pn_btnSupplier.setBackground(new java.awt.Color(17, 97, 171));

        pn_line6.setBackground(new java.awt.Color(17, 97, 171));

        javax.swing.GroupLayout pn_line6Layout = new javax.swing.GroupLayout(pn_line6);
        pn_line6.setLayout(pn_line6Layout);
        pn_line6Layout.setHorizontalGroup(
            pn_line6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_line6Layout.setVerticalGroup(
            pn_line6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_supplier.png"))); // NOI18N
        jLabel10.setText("jLabel9");

        lb_supplier.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_supplier.setForeground(new java.awt.Color(255, 255, 255));
        lb_supplier.setText("Supplier");
        lb_supplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_supplierMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_supplierMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_supplierMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btnSupplierLayout = new javax.swing.GroupLayout(pn_btnSupplier);
        pn_btnSupplier.setLayout(pn_btnSupplierLayout);
        pn_btnSupplierLayout.setHorizontalGroup(
            pn_btnSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnSupplierLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(pn_btnSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnSupplierLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(124, Short.MAX_VALUE)))
        );
        pn_btnSupplierLayout.setVerticalGroup(
            pn_btnSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnSupplierLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btnSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(lb_supplier))
                .addContainerGap())
            .addGroup(pn_btnSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnSupplierLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Transaksi");

        javax.swing.GroupLayout pn_kiriLayout = new javax.swing.GroupLayout(pn_kiri);
        pn_kiri.setLayout(pn_kiriLayout);
        pn_kiriLayout.setHorizontalGroup(
            pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_profil, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_kiriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_kiriLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pn_btnPelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pn_btnSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pn_btnProduk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pn_btnPenjualan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pn_btnPembelian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pn_btnDashboard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pn_btnKeuangan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pn_kiriLayout.setVerticalGroup(
            pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_kiriLayout.createSequentialGroup()
                .addComponent(pn_profil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(pn_btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pn_btnProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pn_btnPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pn_btnSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel5)
                .addGap(10, 10, 10)
                .addComponent(pn_btnPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pn_btnPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel11)
                .addGap(10, 10, 10)
                .addComponent(pn_btnKeuangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(5, 5, 5))
        );

        getContentPane().add(pn_kiri, java.awt.BorderLayout.LINE_START);

        pn_kanan.setBackground(new java.awt.Color(255, 255, 255));
        pn_kanan.setLayout(new java.awt.BorderLayout());

        pn_navbar.setBackground(new java.awt.Color(255, 255, 255));

        lb_logout.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_logout.setText("Logout");
        lb_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_logoutMouseClicked(evt);
            }
        });

        icon_logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_logout.png"))); // NOI18N
        icon_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_logoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_navbarLayout = new javax.swing.GroupLayout(pn_navbar);
        pn_navbar.setLayout(pn_navbarLayout);
        pn_navbarLayout.setHorizontalGroup(
            pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_navbarLayout.createSequentialGroup()
                .addContainerGap(959, Short.MAX_VALUE)
                .addComponent(lb_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(icon_logout)
                .addGap(26, 26, 26))
        );
        pn_navbarLayout.setVerticalGroup(
            pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_navbarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon_logout, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(lb_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pn_kanan.add(pn_navbar, java.awt.BorderLayout.PAGE_START);

        pn_utama.setOpaque(false);
        pn_utama.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Kelompok 1 Aplikasi Desktop | TIF GOL C - 2024");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pn_dasarLayout = new javax.swing.GroupLayout(pn_dasar);
        pn_dasar.setLayout(pn_dasarLayout);
        pn_dasarLayout.setHorizontalGroup(
            pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dasarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pn_dasarLayout.setVerticalGroup(
            pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dasarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pn_kanan.add(pn_dasar, java.awt.BorderLayout.CENTER);

        getContentPane().add(pn_kanan, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lb_produkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_produkMouseEntered
        pn_btnProduk.setBackground(new Color(28,179,228));
        pn_line1.setBackground(new Color(3,78,143));
    }//GEN-LAST:event_lb_produkMouseEntered

    private void lb_produkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_produkMouseExited
        pn_btnProduk.setBackground(new Color(17,97,171));
        pn_line1.setBackground(new Color(17,97,171));
    }//GEN-LAST:event_lb_produkMouseExited

    private void lb_penjualanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_penjualanMouseEntered
        pn_btnPenjualan.setBackground(new Color(28,179,228));
        pn_line2.setBackground(new Color(3,78,143));
    }//GEN-LAST:event_lb_penjualanMouseEntered

    private void lb_penjualanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_penjualanMouseExited
        pn_btnPenjualan.setBackground(new Color(17,97,171));
        pn_line2.setBackground(new Color(17,97,171));
    }//GEN-LAST:event_lb_penjualanMouseExited

    private void lb_pembelianMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_pembelianMouseEntered
        pn_btnPembelian.setBackground(new Color(28,179,228));
        pn_line3.setBackground(new Color(3,78,143));
    }//GEN-LAST:event_lb_pembelianMouseEntered

    private void lb_pembelianMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_pembelianMouseExited
        pn_btnPembelian.setBackground(new Color(17,97,171));
        pn_line3.setBackground(new Color(17,97,171));
    }//GEN-LAST:event_lb_pembelianMouseExited

    private void lb_keuanganMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_keuanganMouseEntered
        pn_btnKeuangan.setBackground(new Color(28,179,228));
        pn_line4.setBackground(new Color(3,78,143));
    }//GEN-LAST:event_lb_keuanganMouseEntered

    private void lb_keuanganMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_keuanganMouseExited
        pn_btnKeuangan.setBackground(new Color(17,97,171));
        pn_line4.setBackground(new Color(17,97,171));
    }//GEN-LAST:event_lb_keuanganMouseExited

    private void lb_produkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_produkMouseClicked
        pn_utama.removeAll();
        pn_utama.add(new FiturProduk());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_lb_produkMouseClicked

    private void lb_penjualanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_penjualanMouseClicked
        pn_utama.removeAll();
        pn_utama.add(new FiturPenjualan(getUserID()));
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_lb_penjualanMouseClicked

    private void lb_dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_dashboardMouseExited
        pn_btnDashboard.setBackground(new Color(17,97,171));
        pn_line.setBackground(new Color(17,97,171));
    }//GEN-LAST:event_lb_dashboardMouseExited

    private void lb_dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_dashboardMouseEntered
        pn_btnDashboard.setBackground(new Color(28,179,228));
        pn_line.setBackground(new Color(3,78,143));
    }//GEN-LAST:event_lb_dashboardMouseEntered

    private void lb_dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_dashboardMouseClicked
        pn_utama.removeAll();
        pn_utama.add(new FiturDashboard());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_lb_dashboardMouseClicked

    private void lb_pembelianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_pembelianMouseClicked
        pn_utama.removeAll();
        pn_utama.add(new FiturPembelian(getUserID()));
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_lb_pembelianMouseClicked

    private void lb_keuanganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_keuanganMouseClicked
        pn_utama.removeAll();
        pn_utama.add(new FiturKeuangan(getUserID()));
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_lb_keuanganMouseClicked

    private void lb_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_logoutMouseClicked
        this.dispose();
        FiturLogin LoginFrame = new FiturLogin();
        LoginFrame.setVisible(true);
    }//GEN-LAST:event_lb_logoutMouseClicked

    private void lb_pelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_pelangganMouseClicked
        pn_utama.removeAll();
        pn_utama.add(new FiturPelanggan(getUserID()));
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_lb_pelangganMouseClicked

    private void lb_pelangganMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_pelangganMouseEntered
        pn_btnPelanggan.setBackground(new Color(28,179,228));
        pn_line5.setBackground(new Color(3,78,143));
    }//GEN-LAST:event_lb_pelangganMouseEntered

    private void lb_pelangganMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_pelangganMouseExited
        pn_btnPelanggan.setBackground(new Color(17,97,171));
        pn_line5.setBackground(new Color(17,97,171));
    }//GEN-LAST:event_lb_pelangganMouseExited

    private void lb_supplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_supplierMouseClicked
        pn_utama.removeAll();
        pn_utama.add(new FiturSupplier(getUserID()));
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_lb_supplierMouseClicked

    private void lb_supplierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_supplierMouseEntered
        pn_btnSupplier.setBackground(new Color(28,179,228));
        pn_line6.setBackground(new Color(3,78,143));
    }//GEN-LAST:event_lb_supplierMouseEntered

    private void lb_supplierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_supplierMouseExited
        pn_btnSupplier.setBackground(new Color(17,97,171));
        pn_line6.setBackground(new Color(17,97,171));
    }//GEN-LAST:event_lb_supplierMouseExited

    private void icon_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_logoutMouseClicked
        this.dispose();
        FiturLogin LoginFrame = new FiturLogin();
        LoginFrame.setVisible(true);
    }//GEN-LAST:event_icon_logoutMouseClicked

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icon_logout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb_admin;
    private javax.swing.JLabel lb_akun;
    private javax.swing.JLabel lb_dashboard;
    private javax.swing.JLabel lb_keuangan;
    private javax.swing.JLabel lb_logout;
    private javax.swing.JLabel lb_pelanggan;
    private javax.swing.JLabel lb_pembelian;
    private javax.swing.JLabel lb_penjualan;
    private javax.swing.JLabel lb_produk;
    private javax.swing.JLabel lb_supplier;
    private javax.swing.JPanel pn_btnDashboard;
    private javax.swing.JPanel pn_btnKeuangan;
    private javax.swing.JPanel pn_btnPelanggan;
    private javax.swing.JPanel pn_btnPembelian;
    private javax.swing.JPanel pn_btnPenjualan;
    private javax.swing.JPanel pn_btnProduk;
    private javax.swing.JPanel pn_btnSupplier;
    private javax.swing.JPanel pn_dasar;
    private javax.swing.JPanel pn_kanan;
    private javax.swing.JPanel pn_kiri;
    private javax.swing.JPanel pn_line;
    private javax.swing.JPanel pn_line1;
    private javax.swing.JPanel pn_line2;
    private javax.swing.JPanel pn_line3;
    private javax.swing.JPanel pn_line4;
    private javax.swing.JPanel pn_line5;
    private javax.swing.JPanel pn_line6;
    private javax.swing.JPanel pn_navbar;
    private javax.swing.JPanel pn_profil;
    private javax.swing.JPanel pn_utama;
    // End of variables declaration//GEN-END:variables
  
}
