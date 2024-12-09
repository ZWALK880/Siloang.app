/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Grafik;

import Config.Koneksi;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class grafikDashboard extends javax.swing.JFrame {
 private Connection conn;

    public grafikDashboard() {
        conn = Koneksi.getConnection();
        initComponents();
        updateChart("Mingguan");
    }

    private void updateChart(String filter) {
    DefaultCategoryDataset dataset = createDataset(filter);
    JFreeChart chart = createChart(dataset);
    ChartPanel cPanel = new ChartPanel(chart);
    cPanel.setPreferredSize(new Dimension(panelChart.getWidth(), panelChart.getHeight()));

    panelChart.removeAll();
    panelChart.setLayout(new java.awt.BorderLayout());
    panelChart.add(cPanel, java.awt.BorderLayout.CENTER);
    
    panelChart.revalidate(); 
    panelChart.repaint();    
}
        private DefaultCategoryDataset createDataset(String filter){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        try {
            String query = "SELECT tanggal_transaksi, SUM(jumlah) AS total FROM transaksi ";

            if ("Mingguan".equals(filter)) {
               query = "SELECT tanggal_transaksi, SUM(jumlah) AS total FROM transaksi WHERE tanggal_transaksi BETWEEN DATE_SUB(CURDATE(), INTERVAL 7 DAY) AND CURDATE() GROUP BY tanggal_transaksi ORDER BY `transaksi`.`tanggal_transaksi` ASC;";
           } else if ("Bulanan".equals(filter)) {
               query = "SELECT MIN(tanggal_transaksi) AS tanggal_awal_periode, MAX(tanggal_transaksi) AS tanggal_transaksi, SUM(jumlah) AS total FROM transaksi WHERE MONTH(tanggal_transaksi) = MONTH(CURDATE()) AND YEAR(tanggal_transaksi) = YEAR(CURDATE()) GROUP BY (DAY(tanggal_transaksi) - 1) DIV 6 ORDER BY tanggal_awal_periode ASC;";
           } else if ("Tahunan".equals(filter)) {
               query = "SELECT DATE_FORMAT(tanggal_transaksi, '%Y-%m') AS bulan, MIN(tanggal_transaksi) AS tanggal_transaksi, SUM(jumlah) AS total FROM transaksi WHERE YEAR(tanggal_transaksi) = YEAR(CURRENT_DATE()) GROUP BY DATE_FORMAT(tanggal_transaksi, '%Y-%m') ORDER BY bulan ASC;";
           }

            PreparedStatement pst = conn.prepareStatement(query);
            ResultSet rst = pst.executeQuery();

            while (rst.next()) {
                int total = rst.getInt("total");
                String tanggal = rst.getString("tanggal_transaksi");
                dataset.addValue(total, "Penjualan", tanggal);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error saat mengambil data dari database: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return dataset;
    }

    private JFreeChart createChart(DefaultCategoryDataset dataset){
        JFreeChart LineChart = ChartFactory.createLineChart(
                "Data Penjualan", 
                "Tanggal", 
                "Jumlah Penjualan", 
                dataset);
        return LineChart;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelChart = new javax.swing.JPanel();
        waktu = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelChartLayout = new javax.swing.GroupLayout(panelChart);
        panelChart.setLayout(panelChartLayout);
        panelChartLayout.setHorizontalGroup(
            panelChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        panelChartLayout.setVerticalGroup(
            panelChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        waktu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mingguan", "Bulanan", "Tahunan" }));
        waktu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waktuActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(waktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(panelChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(waktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelChart.getAccessibleContext().setAccessibleDescription("");
        panelChart.getAccessibleContext().setAccessibleParent(panelChart);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void waktuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waktuActionPerformed
             String selectedFilter = (String) waktu.getSelectedItem();
        updateChart(selectedFilter);

    }//GEN-LAST:event_waktuActionPerformed

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
            java.util.logging.Logger.getLogger(grafikDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(grafikDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(grafikDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(grafikDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new grafikDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel panelChart;
    private javax.swing.JComboBox<String> waktu;
    // End of variables declaration//GEN-END:variables
}
