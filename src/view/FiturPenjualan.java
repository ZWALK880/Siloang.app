package view;

import Config.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.function.Supplier;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.FlatDarkLaf;

public class FiturPenjualan extends javax.swing.JPanel {
    
    private final Connection conn;

    public FiturPenjualan() {
        initComponents();
        conn = Koneksi.getConnection();
        setTabelModel();
        loadData();
        setupListeners();
        txt_totalHarga.setText("Rp 0");
        
        txt_idTransaksi.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "ID Transaksi");
        txt_idUser.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "ID User");
        cb_produk.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "--- Pilih Produk ---");
        txt_jumlah.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Jumlah Pembelian");
        txt_tanggal.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "yyyy-MM-dd");
        txt_search.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Pencarian");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        panelView = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_data = new javax.swing.JTable();
        btn_add = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        panelAdd = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_save = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        lb_idUser = new javax.swing.JLabel();
        txt_idTransaksi = new javax.swing.JTextField();
        lb_idTransaksi = new javax.swing.JLabel();
        lb_produk = new javax.swing.JLabel();
        lb_tanggal = new javax.swing.JLabel();
        lb_jumlah = new javax.swing.JLabel();
        txt_idUser = new javax.swing.JTextField();
        txt_tanggal = new com.toedter.calendar.JDateChooser();
        cb_produk = new javax.swing.JComboBox<>();
        lb_totalHarga = new javax.swing.JLabel();
        txt_totalHarga = new javax.swing.JTextField();
        txt_jumlah = new javax.swing.JSpinner();

        setLayout(new java.awt.CardLayout());

        panelMain.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Data Master > Penjualan");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_product15px.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Data Penjualan SiLoang");

        tbl_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_dataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_data);

        btn_add.setBackground(new java.awt.Color(0, 0, 255));
        btn_add.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_add.png"))); // NOI18N
        btn_add.setText("TAMBAH");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_batal.setBackground(new java.awt.Color(255, 153, 0));
        btn_batal.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_batal.setForeground(new java.awt.Color(255, 255, 255));
        btn_batal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_update.png"))); // NOI18N
        btn_batal.setText("BATAL");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(255, 0, 0));
        btn_delete.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_delete.png"))); // NOI18N
        btn_delete.setText("HAPUS");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        txt_search.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        txt_search.setForeground(new java.awt.Color(102, 102, 102));
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_searchKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelViewLayout = new javax.swing.GroupLayout(panelView);
        panelView.setLayout(panelViewLayout);
        panelViewLayout.setHorizontalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(panelViewLayout.createSequentialGroup()
                            .addComponent(btn_add)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_delete)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_batal)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)))))
                .addGap(10, 10, 10))
        );
        panelViewLayout.setVerticalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3)))
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        panelMain.add(panelView, "card2");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Data Master > Penjualan");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_product15px.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setText("Tambah Data Penjualan SiLoang");

        btn_save.setBackground(new java.awt.Color(0, 0, 255));
        btn_save.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_save.setForeground(new java.awt.Color(255, 255, 255));
        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_simpan.png"))); // NOI18N
        btn_save.setText("SIMPAN");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_cancel.setBackground(new java.awt.Color(255, 153, 0));
        btn_cancel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_update.png"))); // NOI18N
        btn_cancel.setText("BATAL");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        lb_idUser.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_idUser.setText("ID User");

        txt_idTransaksi.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        txt_idTransaksi.setForeground(new java.awt.Color(102, 102, 102));

        lb_idTransaksi.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_idTransaksi.setText("ID Transaksi");

        lb_produk.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_produk.setText("Produk");

        lb_tanggal.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_tanggal.setText("Tanggal Transaksi");

        lb_jumlah.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_jumlah.setText("Jumlah");

        txt_idUser.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        txt_idUser.setForeground(new java.awt.Color(102, 102, 102));

        cb_produk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Pilih Produk ---", "Refill Galon", "Galon Aqua", "Galon Cleo", "Galon Vit", "Tukar Galon Aqua", "Tukar Galon Cleo", "Tukar Galon Vit", "Tisu Antiseptik", "Tutup Galon", " " }));

        lb_totalHarga.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_totalHarga.setText("Total Harga");

        txt_totalHarga.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        txt_totalHarga.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txt_totalHarga)
                    .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lb_totalHarga)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb_produk)
                            .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                                    .addComponent(btn_save)
                                    .addGap(10, 10, 10)
                                    .addComponent(btn_cancel)
                                    .addGap(474, 474, 474)))
                            .addComponent(lb_tanggal)
                            .addComponent(lb_jumlah)
                            .addComponent(txt_tanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelAddLayout.createSequentialGroup()
                                        .addComponent(txt_idTransaksi)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(panelAddLayout.createSequentialGroup()
                                        .addComponent(lb_idTransaksi)
                                        .addGap(274, 274, 274)))
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_idUser)
                                    .addComponent(txt_idUser, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cb_produk, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_jumlah)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel2)))))
                .addGap(10, 10, 10))
        );
        panelAddLayout.setVerticalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel5)))
                .addGap(10, 10, 10)
                .addComponent(jLabel6)
                .addGap(11, 11, 11)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_idTransaksi)
                    .addComponent(lb_idUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_idTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_idUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(lb_produk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_produk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_jumlah)
                .addGap(2, 2, 2)
                .addComponent(txt_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_tanggal)
                .addGap(4, 4, 4)
                .addComponent(txt_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_totalHarga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_totalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        panelMain.add(panelAdd, "card2");

        add(panelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        panelMain.removeAll();
        panelMain.add(panelAdd);
        panelMain.repaint();
        panelMain.revalidate();
        
        txt_idTransaksi.setText(setIDProduk());
        if(btn_add.getText().equals("EDIT")){
            dataTabel();
            btn_save.setText("PERBARUI");
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        showPanel();
        //panelMain.removeAll();
        //panelMain.add(panelView);
        //panelMain.repaint();
        //panelMain.revalidate();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        if(btn_save.getText().equals("TAMBAH"))
            {
                btn_save.setText("SIMPAN");
            }
        else if(btn_save.getText().equals("SIMPAN"))
            {
                insertData();
            }
        else if(btn_save.getText().equals("PERBARUI"))
            {
                updateData();
            }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void tbl_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dataMouseClicked
        if(btn_add.getText().equals("TAMBAH")){
            btn_add.setText("EDIT");
            btn_delete.setVisible(true);
            btn_batal.setVisible(true);
        }
    }//GEN-LAST:event_tbl_dataMouseClicked

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        deleteData();
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        showPanel();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void txt_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyTyped
        searchData();
    }//GEN-LAST:event_txt_searchKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_save;
    private javax.swing.JComboBox<String> cb_produk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_idTransaksi;
    private javax.swing.JLabel lb_idUser;
    private javax.swing.JLabel lb_jumlah;
    private javax.swing.JLabel lb_produk;
    private javax.swing.JLabel lb_tanggal;
    private javax.swing.JLabel lb_totalHarga;
    private javax.swing.JPanel panelAdd;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelView;
    private javax.swing.JTable tbl_data;
    private javax.swing.JTextField txt_idTransaksi;
    private javax.swing.JTextField txt_idUser;
    private javax.swing.JSpinner txt_jumlah;
    private javax.swing.JTextField txt_search;
    private com.toedter.calendar.JDateChooser txt_tanggal;
    private javax.swing.JTextField txt_totalHarga;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        getData((DefaultTableModel) tbl_data.getModel());
        btn_batal.setVisible(false);
        btn_delete.setVisible(false);
    }
    
    private void showPanel() {
        panelMain.removeAll();
        panelMain.add(new FiturPenjualan());
        panelMain.repaint();
        panelMain.revalidate();
    }
    
    private void resetForm() {
        txt_idTransaksi.setText("");
        txt_idUser.setText("");
        cb_produk.setSelectedIndex(0);
        txt_jumlah.setValue(0);
        txt_tanggal.setDate(null);
        txt_totalHarga.setText("");
    }

    private void setTabelModel() {
        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
        model.addColumn("ID Transaksi");
        model.addColumn("ID User");
        model.addColumn("Nama Produk");
        model.addColumn("Jumlah");
        model.addColumn("Tanggal Transaksi");
        model.addColumn("Total Harga");
    }

    private void getData(DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
            String sql = "SELECT * FROM transaksi";
            try (PreparedStatement st = conn.prepareStatement(sql)){
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String idTransaksi      = rs.getString("id_transaksi");
                    String idUser           = rs.getString("id_user");
                    String namaProduk       = rs.getString("nama_produk");
                    int jumlah              = rs.getInt("jumlah");
                    String tanggalTransaksi = rs.getString("tanggal_transaksi");
                    int totalHarga          = rs.getInt("total_harga");
                    
                    Object[] rowData = {idTransaksi, idUser, namaProduk, jumlah, tanggalTransaksi, totalHarga};
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(FiturPenjualan.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    
    //Penomoran Otomatis ID Produk
    private String setIDProduk(){
        String urutan = null;
        
        try {
            String sql = "SELECT RIGHT(id_transaksi, 3) AS LastNumber " +
                         "FROM transaksi " +
                         "WHERE id_transaksi LIKE 'TR%' " +
                         "ORDER BY id_transaksi DESC " +
                         "LIMIT 1";
            
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            if (rs.next()) {
                String lastNumber = rs.getString("LastNumber");
                int nextNumber = Integer.parseInt(lastNumber) + 1;
                urutan = String.format("TR%03d", nextNumber);
            } else {
                urutan = "TR001";
            }
        
            rs.close();
            st.close();
            
        } catch (SQLException e) {
            java.util.logging.Logger.getLogger(FiturProduk.class.getName()).log(Level.SEVERE,null,e);
            urutan = "TR001";
        } 
        return urutan;
    }

    private void insertData() {
        String idTransaksi = txt_idTransaksi.getText();
        String idUser = txt_idUser.getText(); 
        String namaProduk = cb_produk.getSelectedItem().toString(); 
        String jumlahText = txt_jumlah.getValue().toString(); 
        String totalText = txt_totalHarga.getText();

        Date tanggal = txt_tanggal.getDate();
        String tanggalTransaksi = "";
        
        if (tanggal != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            tanggalTransaksi = sdf.format(tanggal);
        } else {
            tanggal = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            tanggalTransaksi = sdf.format(tanggal);
        }
        
        if(idTransaksi.isEmpty() || idUser.isEmpty() || namaProduk.isEmpty() || jumlahText.isEmpty() || tanggalTransaksi.isEmpty() || totalText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi !", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //Convert String ke Integer
        int jumlah = Integer.parseInt(jumlahText);
        int totalHarga = Integer.parseInt(totalText);
        
        try {
            updateStokProduk(namaProduk, jumlah);
            String sql = "INSERT INTO transaksi (id_transaksi, id_user, nama_produk, jumlah, tanggal_transaksi, total_harga) VALUES (?,?,?,?,?,?)";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, idTransaksi);
            st.setString(2, idUser);
            st.setString(3, namaProduk);
            st.setInt(4, jumlah);
            st.setString(5, tanggalTransaksi);
            st.setInt(6, totalHarga);
            
            int rowInserted = st.executeUpdate();
            if(rowInserted > 0){
                JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan");
                resetForm();
                loadData();
                showPanel();
            }
        } catch (SQLException e) {
            Logger.getLogger(FiturPenjualan.class.getName()).log(Level.SEVERE,null,e);
        }
    }

    private void dataTabel() {
        panelView.setVisible(false);
        panelAdd.setVisible(true);
        
        int row = tbl_data.getSelectedRow();
        jLabel6.setText("Perbarui Data Penjualan SiLoang");
        
        txt_idTransaksi.setEnabled(false);
        
        txt_idTransaksi.setText(tbl_data.getValueAt(row, 0).toString());          
        txt_idUser.setText(tbl_data.getValueAt(row, 1).toString());                
        cb_produk.setSelectedItem(tbl_data.getValueAt(row, 2).toString());        
        
        try {
            String nilaiStr = tbl_data.getValueAt(row, 3).toString();
            Integer nilai = Integer.parseInt(nilaiStr);
            txt_jumlah.setValue(nilai);
        } catch (NumberFormatException e) {
            System.err.println("Error konversi nilai jumlah: " + e.getMessage());
            txt_jumlah.setValue(0); 
        }
        
        try {
            String tanggalStr = tbl_data.getValueAt(row, 4).toString();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
            Date tanggal = sdf.parse(tanggalStr);
            txt_tanggal.setDate(tanggal); 
        } catch (ParseException e) {
            e.printStackTrace();
        }   
        
        txt_totalHarga.setText(tbl_data.getValueAt(row, 5).toString()); 
    }
    
    private void updateData() {
        String idTransaksi = txt_idTransaksi.getText();
        String idUser = txt_idUser.getText();
        String namaProduk = cb_produk.getSelectedItem().toString();
        String jumlahText = txt_jumlah.getValue().toString(); 
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String tanggalTransaksi = sdf.format(txt_tanggal.getDate());
        String totalText = txt_totalHarga.getText(); 
        
        if(idTransaksi.isEmpty() || idUser.isEmpty() || namaProduk.isEmpty() || jumlahText.isEmpty() || tanggalTransaksi.isEmpty() || totalText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi !", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //Convert String ke Integer
        int jumlah = Integer.parseInt(jumlahText);
        int totalHarga = Integer.parseInt(totalText);
        
        try {
            String sql = "UPDATE transaksi SET id_user=?, nama_produk=?, jumlah=?, tanggal_transaksi=?, total_harga=? WHERE id_transaksi=?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, idUser);
            st.setString(2, namaProduk);
            st.setInt(3, jumlah);
            st.setString(4, tanggalTransaksi);
            st.setInt(5, totalHarga);
            st.setString(6, idTransaksi);
            
            int rowUpdated = st.executeUpdate();
            if(rowUpdated > 0){
                JOptionPane.showMessageDialog(this, "Data Berhasil Diperbarui");
                resetForm();
                loadData();
                showPanel();
            }
        } catch (SQLException e) {
            Logger.getLogger(FiturPenjualan.class.getName()).log(Level.SEVERE,null,e);
        }
    }

    private void deleteData() {
        int selectedRow = tbl_data.getSelectedRow();
        int confirm = JOptionPane.showConfirmDialog(this, 
                "Apakah yakin ingin menghapus data ini?",
                "Konfirmasi Hapus Data",
                JOptionPane.YES_NO_OPTION);
        
        if(confirm == JOptionPane.YES_OPTION){
            String id = tbl_data.getValueAt(selectedRow, 0).toString();
            try {
                String sql = "DELETE FROM transaksi WHERE id_transaksi=?";
                try(PreparedStatement st = conn.prepareStatement(sql)){
                    st.setString(1, id);
                    
                    int rowDelete = st.executeUpdate();
                    if(rowDelete > 0){
                        JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
                    }else{
                        JOptionPane.showMessageDialog(this, "Data Gagal Dihapus");
                    }
                }
            } catch (SQLException e) {
                Logger.getLogger(FiturPenjualan.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        resetForm();
        loadData();
        showPanel();
    }

    private void searchData() {
        String kataKunci = txt_search.getText();
        
        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
        model.setRowCount(0);
        
        try {
            String sql = "SELECT * FROM transaksi WHERE id_transaksi LIKE ? OR nama_produk LIKE ?";
            try (PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, "%" + kataKunci + "%");
                st.setString(2, "%" + kataKunci + "%");
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String idTransaksi       = rs.getString("id_transaksi");
                    String idUser             = rs.getString("id_user");
                    String namaProduk        = rs.getString("nama_produk");
                    int jumlah               = rs.getInt("jumlah");
                    String tanggalTransaksi  = rs.getString("tanggal_transaksi");
                    int totalHarga           = rs.getInt("total_harga");
                    
                    Object[] rowData = {idTransaksi, idUser, namaProduk, jumlah, tanggalTransaksi, totalHarga};
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(FiturPenjualan.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    
    private void hitungTotalHarga() {
        try {
            // Ambil nama produk yang dipilih
            String namaProduk = cb_produk.getSelectedItem().toString();
        
            // Ambil jumlah dari spinner
            int jumlah = Integer.parseInt(txt_jumlah.getValue().toString());
        
            // Query untuk mendapatkan harga produk
            String sql = "SELECT harga FROM produk WHERE nama_produk = ?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, namaProduk);
            ResultSet rs = st.executeQuery();
        
            if (rs.next()) {
                int harga = rs.getInt("harga");
                int totalHarga = harga * jumlah;
                txt_totalHarga.setText(String.valueOf(totalHarga));
            }
        
        } catch (SQLException e) {
            java.util.logging.Logger.getLogger(FiturPenjualan.class.getName()).log(Level.SEVERE, null, e);
        } catch (NumberFormatException e) {
            txt_totalHarga.setText("0");
        }
    }
        
    private void setupListeners() {
        // Listener untuk combo box produk
        cb_produk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hitungTotalHarga();
            }
        });
        
        txt_jumlah.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                hitungTotalHarga();
            }
        });
    }
    
    private void updateStokProduk(String namaProduk, int jumlahBeli) {
        try {
            // Query untuk mendapatkan stok saat ini
            String sqlSelect = "SELECT stok FROM produk WHERE nama_produk = ?";
            PreparedStatement st = conn.prepareStatement(sqlSelect);
            st.setString(1, namaProduk);
            ResultSet rs = st.executeQuery();
        
            if (rs.next()) {
                int stokSekarang = rs.getInt("stok");
                int stokBaru = stokSekarang - jumlahBeli;
            
                // Validasi stok cukup
                if (stokBaru < 0) {
                    JOptionPane.showMessageDialog(this, 
                        "Stok tidak mencukupi! Stok tersedia: " + stokSekarang,
                        "Error Stok",
                        JOptionPane.ERROR_MESSAGE);
                    return;
                }
            
                // Update stok di tabel produk
                String sqlUpdate = "UPDATE produk SET stok = ? WHERE nama_produk = ?";
                PreparedStatement psUpdate = conn.prepareStatement(sqlUpdate);
                psUpdate.setInt(1, stokBaru);
                psUpdate.setString(2, namaProduk);
                psUpdate.executeUpdate();
                psUpdate.close();
            }
        
            rs.close();
            st.close();
        
        } catch (SQLException e) {
            Logger.getLogger(FiturPenjualan.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(this, 
                "Error mengupdate stok: " + e.getMessage(),
                "Database Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }

}
