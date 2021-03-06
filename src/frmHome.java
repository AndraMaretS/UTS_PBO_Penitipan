
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samudra~
 */
public class frmHome extends javax.swing.JFrame {
    String nol_jam = "";
    String nol_menit = "";
    String nol_detik = "";

    /**
     * Creates new form frmHome
     */
    public frmHome() {
        initComponents();
        selectData();
        setTanggal();
        setJam();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labeltanggal = new javax.swing.JLabel();
        labeljam = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tNoResi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        tNamaPetugas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tNOPOL = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tTglMasuk = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        tTglKeluar = new com.toedter.calendar.JDateChooser();
        rdMotor = new javax.swing.JRadioButton();
        rdMobil = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        Save = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        Print = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Penitipan Motor dan Mobil");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, 33));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tempat yang aman untuk menitipkan Motor dan Mobil anda");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        labeltanggal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labeltanggal.setForeground(new java.awt.Color(255, 255, 255));
        labeltanggal.setText("Tanggal");
        jPanel1.add(labeltanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, -1, -1));

        labeljam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labeljam.setForeground(new java.awt.Color(255, 255, 255));
        labeljam.setText("Jam");
        jPanel1.add(labeljam, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, -1, -1));

        jLabel9.setFont(new java.awt.Font("Brannboll F PERSONAL USE ONLY", 0, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Samudra2");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 70));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tNoResi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(tNoResi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 190, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("No Resi");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 210, 70));

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tNamaPetugas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(tNamaPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 190, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama Petugas");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("No Polisi");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        tNOPOL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tNOPOL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNOPOLActionPerformed(evt);
            }
        });
        jPanel3.add(tNOPOL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 190, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Jenis Kendaraan");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tanggal Masuk");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        tTglMasuk.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tTglMasukPropertyChange(evt);
            }
        });
        jPanel3.add(tTglMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 190, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tanggal Keluar");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        tTglKeluar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tTglKeluarPropertyChange(evt);
            }
        });
        jPanel3.add(tTglKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 190, 30));

        buttonGroup1.add(rdMotor);
        rdMotor.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rdMotor.setText("Motor");
        jPanel3.add(rdMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 90, -1));

        buttonGroup1.add(rdMobil);
        rdMobil.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rdMobil.setText("Mobil");
        jPanel3.add(rdMobil, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 90, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 210, 320));

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No Resi", "Nama Petugas", "No Polisi", "Jns Kendaraan", "Tgl Masuk", "Tgll Keluar", "Harga PerHari", "Harga Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 640, 330));

        jPanel4.setBackground(new java.awt.Color(0, 102, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Save.setBackground(new java.awt.Color(0, 153, 204));
        Save.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Save.setForeground(new java.awt.Color(255, 255, 255));
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jPanel4.add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, -1));

        Delete.setBackground(new java.awt.Color(0, 153, 204));
        Delete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel4.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 90, -1));

        Clear.setBackground(new java.awt.Color(0, 153, 204));
        Clear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Clear.setForeground(new java.awt.Color(255, 255, 255));
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel4.add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 90, -1));

        Refresh.setBackground(new java.awt.Color(0, 153, 204));
        Refresh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Refresh.setForeground(new java.awt.Color(255, 255, 255));
        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        jPanel4.add(Refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        Print.setBackground(new java.awt.Color(0, 153, 204));
        Print.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Print.setForeground(new java.awt.Color(255, 255, 255));
        Print.setText("Print");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });
        jPanel4.add(Print, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 90, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Copyright © 2017");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Muhamad Iqbal Samudra");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 670, 50));

        setSize(new java.awt.Dimension(886, 508));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String TglMasuk = dateFormat.format(tTglMasuk.getDate());
        String TglKeluar = dateFormat.format(tTglKeluar.getDate());
        
        Date masuk = tTglMasuk.getDate();
        Date keluar = tTglKeluar.getDate();
        long miliseconds = keluar.getTime() - masuk.getTime();
        int days = (int)miliseconds/(1000*60*60*24);
        int total = days * 3000;

        String Kendaraan = "";
        String NoResi = tNoResi.getText();
        String NamaPetugas = tNamaPetugas.getText();
        String NOPOL = tNOPOL.getText();
        
        if (rdMotor.isSelected()) {
            Kendaraan = "Motor";
        } else {
            Kendaraan = "Mobil";
        }
        
        if (NoResi.equals("") ||
            NamaPetugas.equals("") ||
            NOPOL.equals("") ||
            Kendaraan.equals("")){
            
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error",
                JOptionPane.WARNING_MESSAGE);
        }else{            
            String SQL ="INSERT INTO tb_penitipan (NoResi,NamaPetugas,NOPOL,JnsKendaraan,TglMasuk,TglKeluar,HargaHari,HargaTotal)" 
                    + "VALUES('"
                    +tNoResi.getText()+"','"
                    +tNamaPetugas.getText()+"','"
                    +tNOPOL.getText()+"','"
                    +Kendaraan+"','"
                    +TglMasuk+"','"
                    +TglKeluar+"','"
                    +"3000"+"','"
                    +total+"')";
            int status = KoneksiDB.execute(SQL);
            if (status == 1) {
                 JOptionPane.showMessageDialog(this, "Data berhasil diupdate","Sukses", JOptionPane.INFORMATION_MESSAGE);
                 selectData();
            }else{
                JOptionPane.showMessageDialog(this, "Data gagal diupdate", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        int baris = tblData.getSelectedRow();
        if (baris != -1) {
            String NoResi = tblData.getValueAt(baris, 0).toString();
            String SQL = "DELETE FROM tb_penitipan WHERE NoResi='"+NoResi+"'";
            int status = KoneksiDB.execute(SQL);
            if (status==1){
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal dihapus", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih dahulu", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        tNoResi.setText("");
        tNamaPetugas.setText("");
        tNOPOL.setText("");
        buttonGroup1.clearSelection();
        tTglMasuk.setDate(null);
        tTglKeluar.setDate(null);
    }//GEN-LAST:event_ClearActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        selectData();
    }//GEN-LAST:event_RefreshActionPerformed

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        MessageFormat header = new MessageFormat("Rekap Penitipan Motor dan Mobil PT.Samudra");
        MessageFormat footer = new MessageFormat("Page {0,number,integer}       ");
        try {
            tblData.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("Cannot print %s%n", e.getMessage());
        }
    }//GEN-LAST:event_PrintActionPerformed

    private void tNOPOLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNOPOLActionPerformed

    }//GEN-LAST:event_tNOPOLActionPerformed

    private void tTglMasukPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tTglMasukPropertyChange

    }//GEN-LAST:event_tTglMasukPropertyChange

    private void tTglKeluarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tTglKeluarPropertyChange

    }//GEN-LAST:event_tTglKeluarPropertyChange

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        int baris = tblData.getSelectedRow();
        if (baris != -1) {
            tNoResi.setText(tblData.getValueAt(baris, 0).toString());
            tNamaPetugas.setText(tblData.getValueAt(baris, 1).toString());
            tNOPOL.setText(tblData.getValueAt(baris, 2).toString());
            if ("Motor".equals(tblData.getValueAt(baris, 3).toString())) {
                rdMotor.setSelected(true);
            } else {
                rdMobil.setSelected(true);
            }
            SimpleDateFormat date = new SimpleDateFormat ("yyyy-MM-dd");
            Date Masuk = null;
            try {
                Masuk = date.parse(tblData.getValueAt(baris, 4).toString());
            } catch (ParseException ex) {
                Logger.getLogger(frmHome.class.getName()).log(Level.SEVERE, null, ex);
            }
            Date Keluar = null;
            try {
                Keluar = date.parse(tblData.getValueAt(baris, 5).toString());
            } catch (ParseException ex) {
                Logger.getLogger(frmHome.class.getName()).log(Level.SEVERE, null, ex);
            }
            tTglMasuk.setDate(Masuk);
            tTglKeluar.setDate(Keluar);
        }
    }//GEN-LAST:event_tblDataMouseClicked

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
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Print;
    private javax.swing.JButton Refresh;
    private javax.swing.JButton Save;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labeljam;
    private javax.swing.JLabel labeltanggal;
    private javax.swing.JRadioButton rdMobil;
    private javax.swing.JRadioButton rdMotor;
    private javax.swing.JTextField tNOPOL;
    private javax.swing.JTextField tNamaPetugas;
    private javax.swing.JTextField tNoResi;
    private com.toedter.calendar.JDateChooser tTglKeluar;
    private com.toedter.calendar.JDateChooser tTglMasuk;
    private javax.swing.JTable tblData;
    // End of variables declaration//GEN-END:variables

    private void setTanggal() {
        java.util.Date skrg = new java.util.Date();
        java.text.SimpleDateFormat kal = new
        java.text.SimpleDateFormat("dd/MM/yyyy");
        labeltanggal.setText(kal.format(skrg));
    }

    private void setJam() {
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Date dt = new Date();
                int nilai_jam = dt.getHours();
                int nilai_menit = dt.getMinutes();
                int nilai_detik = dt.getSeconds();
                if (nilai_jam <= 9) {
                    nol_jam = "";
                }
                if (nilai_menit <= 9) {
                    nol_menit = "";
                }
                if (nilai_detik <= 9) {
                    nol_detik = "";
                }
                String jam = nol_jam + Integer.toString(nilai_jam);
                String menit = nol_menit + Integer.toString(nilai_menit);
                String detik = nol_detik + Integer.toString(nilai_detik);
                labeljam.setText("Jam "+jam + ":" + menit + ":" + detik);
            }
        };
        new Timer(100, taskPerformer).start();
    }

    private void selectData() {
        String kolom[] = {"NoResi","NamaPetugas","NOPOL","JnsKendaraan","TglMasuk","TglKeluar","HargaHari","HargaTotal"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM tb_penitipan";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        try {
            while(rs.next()) {
                String NoResi = rs.getString(1);
                String NamaPetugas = rs.getString(2);
                String NOPOL = rs.getString(3);
                String JnsKendaraan = "";
                if ("Motor".equals(rs.getString(4))){
                    JnsKendaraan = "Motor";
                } else {
                    JnsKendaraan = "Mobil";
                }
                String TglMasuk = rs.getString(5);
                String TglKeluar = rs.getString(6);
                String HargaHari = rs.getString(7);
                String HargaTotal = rs.getString(8);
                String data[] = {NoResi,NamaPetugas,NOPOL,JnsKendaraan,TglMasuk,TglKeluar,HargaHari,HargaTotal};
                dtm.addRow(data);
            }
        } catch (SQLException ex){
            Logger.getLogger(frmHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        tblData.setModel(dtm);
    }
}
