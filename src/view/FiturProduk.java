package view;

import Config.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;

public class FiturProduk extends javax.swing.JPanel {
    
    private final Connection conn;

    public FiturProduk() {
        initComponents();
        conn = Koneksi.getConnection();
        setTabelModel();
        loadData();
        
        txt_id.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "ID Produk");
        txt_nama.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Nama Produk");
        cb_satuan.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "--- Pilih Satuan ---");
        txt_stok.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Stok Produk");
        txt_harga.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Harga Produk");
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
        lb_nama = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        lb_id = new javax.swing.JLabel();
        lb_satuan = new javax.swing.JLabel();
        lb_harga = new javax.swing.JLabel();
        lb_stok = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        txt_stok = new javax.swing.JTextField();
        txt_harga = new javax.swing.JTextField();
        cb_satuan = new javax.swing.JComboBox<>();

        setLayout(new java.awt.CardLayout());

        panelMain.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Data Master > Produk");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_product15px.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Data Produk SiLoang");

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
        jLabel2.setText("Data Master > Produk");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_product15px.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setText("Tambah Data Produk SiLoang");

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

        lb_nama.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_nama.setText("Nama");

        txt_id.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        txt_id.setForeground(new java.awt.Color(102, 102, 102));

        lb_id.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_id.setText("ID");

        lb_satuan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_satuan.setText("Satuan");

        lb_harga.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_harga.setText("Harga");

        lb_stok.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_stok.setText("Stok");

        txt_nama.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        txt_nama.setForeground(new java.awt.Color(102, 102, 102));

        txt_stok.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        txt_stok.setForeground(new java.awt.Color(102, 102, 102));

        txt_harga.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        txt_harga.setForeground(new java.awt.Color(102, 102, 102));

        cb_satuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Pilih Satuan ---", "Liter", "Pcs" }));

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cb_satuan, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lb_satuan)
                        .addComponent(lb_id)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb_nama)
                            .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                                    .addComponent(btn_save)
                                    .addGap(10, 10, 10)
                                    .addComponent(btn_cancel)
                                    .addGap(304, 304, 304)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel2)))
                            .addComponent(txt_id)
                            .addComponent(txt_nama)))
                    .addComponent(lb_harga)
                    .addComponent(lb_stok)
                    .addComponent(txt_stok)
                    .addComponent(txt_harga, javax.swing.GroupLayout.Alignment.TRAILING))
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
                .addGap(10, 10, 10)
                .addComponent(lb_id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_nama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_satuan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_satuan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_stok)
                .addGap(2, 2, 2)
                .addComponent(txt_stok, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lb_harga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        
        txt_id.setText(setIDProduk());
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
    private javax.swing.JComboBox<String> cb_satuan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_harga;
    private javax.swing.JLabel lb_id;
    private javax.swing.JLabel lb_nama;
    private javax.swing.JLabel lb_satuan;
    private javax.swing.JLabel lb_stok;
    private javax.swing.JPanel panelAdd;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelView;
    private javax.swing.JTable tbl_data;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_stok;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        getData((DefaultTableModel) tbl_data.getModel());
        btn_batal.setVisible(false);
        btn_delete.setVisible(false);
    }
    
    private void showPanel() {
        panelMain.removeAll();
        panelMain.add(new FiturProduk());
        panelMain.repaint();
        panelMain.revalidate();
    }
    
    private void resetForm() {
        txt_id.setText("");
        txt_nama.setText("");
        cb_satuan.setSelectedIndex(0);
        txt_stok.setText("0");
        txt_harga.setText("0");
    }

    private void setTabelModel() {
        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
        model.addColumn("ID Produk");
        model.addColumn("Nama Produk");
        model.addColumn("Satuan");
        model.addColumn("Stok");
        model.addColumn("Harga");
    }

    private void getData(DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
            String sql = "SELECT * FROM produk";
            try (PreparedStatement st = conn.prepareStatement(sql)){
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String idProduk     = rs.getString("id_produk");
                    String namaProduk   = rs.getString("nama_produk");
                    String satuan       = rs.getString("satuan");
                    int stok            = rs.getInt("stok");
                    int harga           = rs.getInt("harga");
                    
                    Object[] rowData = {idProduk, namaProduk, satuan, stok, harga};
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(FiturProduk.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    
    //Penomoran Otomatis ID Produk
    private String setIDProduk(){
        String urutan = null;
        
        try {
            String sql = "SELECT RIGHT(id_produk, 3) AS LastNumber " +
                         "FROM produk " +
                         "WHERE id_produk LIKE 'SL%' " +
                         "ORDER BY id_produk DESC " +
                         "LIMIT 1";
            
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            if (rs.next()) {
                String lastNumber = rs.getString("LastNumber");
                int nextNumber = Integer.parseInt(lastNumber) + 1;
                urutan = String.format("SL%03d", nextNumber);
            } else {
                urutan = "SL001";
            }
        
            rs.close();
            st.close();
            
        } catch (SQLException e) {
            java.util.logging.Logger.getLogger(FiturProduk.class.getName()).log(Level.SEVERE,null,e);
            urutan = "SL001";
        } 
        return urutan;
    }

    private void insertData() {
        String idProduk = txt_id.getText();
        String namaProduk = txt_nama.getText();
        String satuan = cb_satuan.getSelectedItem().toString();   
        String stokText = txt_stok.getText();  
        String hargaText = txt_harga.getText();
        
         if(idProduk.isEmpty() || namaProduk.isEmpty() || satuan.isEmpty() || stokText.isEmpty() || hargaText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi !", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //Convert String ke Integer
        int stok = Integer.parseInt(stokText);
        int harga = Integer.parseInt(hargaText);
        
        try {
            String sql = "INSERT INTO produk (id_produk, nama_produk, satuan, stok, harga) VALUES (?,?,?,?,?)";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, idProduk);
            st.setString(2, namaProduk);
            st.setString(3, satuan);
            st.setInt(4, stok);
            st.setInt(5, harga);
            
            int rowInserted = st.executeUpdate();
            if(rowInserted > 0){
                JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan");
                resetForm();
                loadData();
                showPanel();
            }
        } catch (SQLException e) {
            Logger.getLogger(FiturProduk.class.getName()).log(Level.SEVERE,null,e);
        }
    }

    private void dataTabel() {
        panelView.setVisible(false);
        panelAdd.setVisible(true);
        
        int row = tbl_data.getSelectedRow();
        jLabel6.setText("Perbarui Data Produk SiLoang");
        
        //txt_id.setEditable(false); //Gabisa diedit
        txt_id.setEnabled(false);  //Gabisa diklik
        txt_id.setDisabledTextColor(new Color(102, 102, 102)); 
        txt_id.setBackground(new Color(240, 240, 240));
        
        txt_id.setText(tbl_data.getValueAt(row, 0).toString());            // kolom 0 = ID Produk
        txt_nama.setText(tbl_data.getValueAt(row, 1).toString());          // kolom 1 = Nama Produk 
        cb_satuan.setSelectedItem(tbl_data.getValueAt(row, 2).toString()); // kolom 2 = Satuan
        txt_stok.setText(tbl_data.getValueAt(row, 3).toString());          // kolom 3 = Stok
        txt_harga.setText(tbl_data.getValueAt(row, 4).toString());         // kolom 4 = Harga
    }
    
    private void updateData() {
        String idProduk = txt_id.getText();
        String namaProduk = txt_nama.getText();
        String satuan = cb_satuan.getSelectedItem().toString();   
        String stokText = txt_stok.getText();  
        String hargaText = txt_harga.getText();
        
        if(idProduk.isEmpty() || namaProduk.isEmpty() || satuan.isEmpty() || stokText.isEmpty() || hargaText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi !", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //Convert String ke Integer
        int stok = Integer.parseInt(stokText);
        int harga = Integer.parseInt(hargaText);
        
        try {
            String sql = "UPDATE produk SET nama_produk=?, satuan=?, stok=?, harga=? WHERE id_produk=?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, namaProduk);
            st.setString(2, satuan);
            st.setInt(3, stok);
            st.setInt(4, harga);
            st.setString(5, idProduk);
            
            int rowUpdated = st.executeUpdate();
            if(rowUpdated > 0){
                JOptionPane.showMessageDialog(this, "Data Berhasil Diperbarui");
                resetForm();
                loadData();
                showPanel();
            }
        } catch (SQLException e) {
            Logger.getLogger(FiturProduk.class.getName()).log(Level.SEVERE,null,e);
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
                String sql = "DELETE FROM produk WHERE id_produk=?";
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
                Logger.getLogger(FiturProduk.class.getName()).log(Level.SEVERE,null,e);
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
            String sql = "SELECT * FROM produk WHERE id_produk LIKE ? OR nama_produk LIKE ?";
            try (PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, "%" + kataKunci + "%");
                st.setString(2, "%" + kataKunci + "%");
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String idProduk     = rs.getString("id_produk");
                    String namaProduk   = rs.getString("nama_produk");
                    String satuan       = rs.getString("satuan");
                    int stok            = rs.getInt("stok");
                    int harga           = rs.getInt("harga");
                    
                    Object[] rowData = {idProduk, namaProduk, satuan, stok, harga};
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(FiturProduk.class.getName()).log(Level.SEVERE,null,e);
        }
    }
}
