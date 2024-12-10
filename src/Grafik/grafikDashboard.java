/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Grafik;

import Config.Koneksi;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.plot.CategoryPlot;

public class grafikDashboard extends javax.swing.JFrame {
 private Connection conn;

    public grafikDashboard() {
        conn = Koneksi.getConnection();
        initComponents();
        updateChart("Mingguan");
    }

        private void updateChart(String filter) {
        DefaultCategoryDataset dataset = createDataset(filter);

        // Menampilkan grafik kosong sementara
        DefaultCategoryDataset emptyDataset = new DefaultCategoryDataset();
        JFreeChart chart = createChart(emptyDataset);  // Gunakan dataset kosong dulu
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(panelChart.getWidth(), panelChart.getHeight()));
        panelChart.removeAll();
        panelChart.setLayout(new java.awt.BorderLayout());
        panelChart.add(chartPanel, java.awt.BorderLayout.CENTER);
        panelChart.revalidate();
        panelChart.repaint();

        // Mulai animasi untuk menambahkan data
        animateChartLine(dataset, chartPanel);

        }
    
    private void animateChartLine(DefaultCategoryDataset dataset, ChartPanel chartPanel) {
        javax.swing.Timer timer = new javax.swing.Timer(150, new ActionListener() {
        int currentIndex = 0;
        DefaultCategoryDataset animatedDataset = new DefaultCategoryDataset();  // Dataset animasi kosong

        @Override
        public void actionPerformed(ActionEvent e) {
            if (currentIndex < dataset.getColumnCount()) {
                // Ambil data satu per satu dari dataset asli
                String category = (String) dataset.getColumnKey(currentIndex);
                Number value = dataset.getValue(0, currentIndex);
                animatedDataset.addValue(value, "Penjualan", category);

                // Update chart dengan dataset animasi
                chartPanel.getChart().getCategoryPlot().setDataset(animatedDataset);
                currentIndex++;
            } else {
                // Setelah animasi selesai, set dataset penuh ke grafik
                ((javax.swing.Timer) e.getSource()).stop();  // Stop timer
                chartPanel.getChart().getCategoryPlot().setDataset(dataset);  // Set dataset penuh
            }
        }
    });
    timer.start();  // Mulai timer untuk animasi
}
        private DefaultCategoryDataset createDataset(String filter){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        try {
            String query = "SELECT tanggal_transaksi, SUM(total_harga) AS total FROM transaksi ";

            if ("Mingguan".equals(filter)) {
               query = "SELECT tanggal_transaksi, SUM(total_harga) AS total FROM transaksi WHERE tanggal_transaksi BETWEEN DATE_SUB(CURDATE(), INTERVAL 7 DAY) AND CURDATE() GROUP BY tanggal_transaksi ORDER BY `transaksi`.`tanggal_transaksi` ASC;";
           } else if ("Bulanan".equals(filter)) {
               query = "SELECT MIN(tanggal_transaksi) AS tanggal_awal_periode, MAX(tanggal_transaksi) AS tanggal_transaksi, SUM(total_harga) AS total FROM transaksi WHERE MONTH(tanggal_transaksi) = MONTH(CURDATE()) AND YEAR(tanggal_transaksi) = YEAR(CURDATE()) GROUP BY (DAY(tanggal_transaksi) - 1) DIV 6 ORDER BY tanggal_awal_periode ASC;";
           } else if ("Tahunan".equals(filter)) {
               query = "SELECT DATE_FORMAT(tanggal_transaksi, '%Y-%m') AS bulan, MIN(tanggal_transaksi) AS tanggal_transaksi, SUM(total_harga) AS total FROM transaksi WHERE YEAR(tanggal_transaksi) = YEAR(CURRENT_DATE()) GROUP BY DATE_FORMAT(tanggal_transaksi, '%Y-%m') ORDER BY bulan ASC;";
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
                "Jumlah pendapatan", 
            dataset);

    org.jfree.chart.StandardChartTheme theme = new org.jfree.chart.StandardChartTheme("JFree");
    theme.setExtraLargeFont(new java.awt.Font("SansSerif", java.awt.Font.BOLD, 16));
    theme.setLargeFont(new java.awt.Font("SansSerif", java.awt.Font.BOLD, 12));
    theme.setRegularFont(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 10));
    theme.apply(LineChart);

    CategoryPlot plot = LineChart.getCategoryPlot();
    org.jfree.chart.renderer.category.LineAndShapeRenderer renderer = new org.jfree.chart.renderer.category.LineAndShapeRenderer();

    renderer.setSeriesPaint(0, java.awt.Color.BLUE);
    renderer.setSeriesStroke(0, new java.awt.BasicStroke(2.0f));
    renderer.setSeriesShapesVisible(0, true);
    renderer.setSeriesShape(0, new java.awt.geom.Ellipse2D.Double(-3.0, -3.0, 6.0, 6.0));
    
    plot.setRenderer(renderer);
    plot.setBackgroundPaint(java.awt.Color.WHITE);
    plot.setRangeGridlinePaint(java.awt.Color.GRAY);
    plot.setDomainGridlinePaint(java.awt.Color.GRAY);
    plot.setOutlineVisible(false);

    // Membuat DecimalFormatSymbols untuk mengatur simbol Rupiah
    java.text.DecimalFormatSymbols formatSymbols = new java.text.DecimalFormatSymbols();
    formatSymbols.setCurrencySymbol("Rp."); // Menambahkan "Rp." dengan titik
    formatSymbols.setGroupingSeparator('.'); // Pemisah ribuan menggunakan titik
    formatSymbols.setDecimalSeparator(','); // Pemisah desimal menggunakan koma

    // Membuat DecimalFormat dengan pola yang valid
    java.text.DecimalFormat rupiahFormat = new java.text.DecimalFormat("#,##0.##", formatSymbols); // Pola tanpa simbol mata uang

    // Menambahkan simbol mata uang secara manual di depan nilai format
    rupiahFormat.setPositivePrefix("Rp.");
    rupiahFormat.setNegativePrefix("-Rp."); // Untuk nilai negatif (opsional)

    // Mengatur formatter pada sumbu y
    org.jfree.chart.axis.NumberAxis yAxis = (org.jfree.chart.axis.NumberAxis) plot.getRangeAxis();
    yAxis.setNumberFormatOverride(rupiahFormat); // Terapkan format ke sumbu y


    return LineChart;


    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelChart = new javax.swing.JPanel();
        waktu = new javax.swing.JComboBox<>();

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(waktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private javax.swing.JPanel panelChart;
    private javax.swing.JComboBox<String> waktu;
    // End of variables declaration//GEN-END:variables
}
