package HavaYoluProjesi;


import HavaYoluProjesi.UcakIslemleri;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class UcakDenetim extends javax.swing.JFrame {

    DefaultTableModel model;
    UcakIslemleri ucakIslemleri = new UcakIslemleri();
    
    public UcakDenetim() {
        initComponents();
        
        model = (DefaultTableModel) ucak_tablosu.getModel();
        ucakGoruntule();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        saat_alani = new javax.swing.JTextField();
        nerden_alani = new javax.swing.JTextField();
        nereye_alani = new javax.swing.JTextField();
        ucakAdi_alani = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tarih_alani = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        ucakEkle_buton = new javax.swing.JButton();
        ucakGuncelle_Buton = new javax.swing.JButton();
        UcakSil_buton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ucak_tablosu = new javax.swing.JTable();
        mesajYazisi = new javax.swing.JLabel();
        geri_dön_buton = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(630, 220, 0, 0));

        jPanel1.setBackground(new java.awt.Color(47, 54, 64));
        jPanel1.setForeground(new java.awt.Color(47, 54, 64));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(223, 228, 234));

        jLabel3.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        jLabel3.setText("Uçağın Adı : ");

        jLabel4.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        jLabel4.setText("Kalkış Saati : ");

        jLabel5.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        jLabel5.setText("Nerden : ");

        jLabel6.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        jLabel6.setText("Nereye : ");

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Temzile");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        jLabel7.setText("Tarih :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saat_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nerden_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nereye_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ucakAdi_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tarih_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ucakAdi_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(saat_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tarih_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nerden_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nereye_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(6, 6, 6))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 84, 330, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 56, 303, 10));

        jLabel9.setFont(new java.awt.Font("Noto Sans UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(245, 246, 250));
        jLabel9.setText("Uçak Denetim Ekranı :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 18, -1, -1));

        ucakEkle_buton.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        ucakEkle_buton.setText("Yeni Ucak Ekle");
        ucakEkle_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ucakEkle_butonActionPerformed(evt);
            }
        });
        jPanel1.add(ucakEkle_buton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 190, 38));

        ucakGuncelle_Buton.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        ucakGuncelle_Buton.setText("Uçak Güncelle");
        ucakGuncelle_Buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ucakGuncelle_ButonActionPerformed(evt);
            }
        });
        jPanel1.add(ucakGuncelle_Buton, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 165, 190, 38));

        UcakSil_buton.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        UcakSil_buton.setForeground(new java.awt.Color(255, 0, 0));
        UcakSil_buton.setText("Uçak Sil");
        UcakSil_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UcakSil_butonActionPerformed(evt);
            }
        });
        jPanel1.add(UcakSil_buton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 190, 38));

        jPanel3.setBackground(new java.awt.Color(223, 228, 234));

        ucak_tablosu.setBackground(new java.awt.Color(245, 246, 250));
        ucak_tablosu.setFont(new java.awt.Font("Noto Sans UI", 0, 12)); // NOI18N
        ucak_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Uçak Adı", "Kalkış Saati", "Tarih", "Nerden", "Nereye"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ucak_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ucak_tablosuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ucak_tablosu);
        if (ucak_tablosu.getColumnModel().getColumnCount() > 0) {
            ucak_tablosu.getColumnModel().getColumn(0).setResizable(false);
            ucak_tablosu.getColumnModel().getColumn(1).setResizable(false);
            ucak_tablosu.getColumnModel().getColumn(2).setResizable(false);
            ucak_tablosu.getColumnModel().getColumn(3).setResizable(false);
            ucak_tablosu.getColumnModel().getColumn(4).setResizable(false);
            ucak_tablosu.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 362, 600, 190));

        mesajYazisi.setFont(new java.awt.Font("Noto Sans UI", 0, 14)); // NOI18N
        mesajYazisi.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(mesajYazisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 28, 288, 23));

        geri_dön_buton.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        geri_dön_buton.setText("<< GERİ DÖN");
        geri_dön_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geri_dön_butonActionPerformed(evt);
            }
        });
        jPanel1.add(geri_dön_buton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ucakEkle_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ucakEkle_butonActionPerformed
        
         mesajYazisi.setText("");

        String UcakAdi = ucakAdi_alani.getText();
        String nerden = nerden_alani.getText();
        String nereye = nereye_alani.getText();
        String tarih = tarih_alani.getText();
        String saat = saat_alani.getText();

        ucakIslemleri.yeniUcakEkle(UcakAdi, nerden, nereye, saat, tarih);

        ucakGoruntule();

        mesajYazisi.setText("Yeni uçak başarlı bir şekilde eklendi");
        
    }//GEN-LAST:event_ucakEkle_butonActionPerformed

    private void ucak_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ucak_tablosuMouseClicked

        int selectedrow = ucak_tablosu.getSelectedRow();
        
        ucakAdi_alani.setText(model.getValueAt(selectedrow, 1).toString());
        saat_alani.setText(model.getValueAt(selectedrow, 2).toString());
        tarih_alani.setText(model.getValueAt(selectedrow, 3).toString());
        nerden_alani.setText(model.getValueAt(selectedrow, 4).toString());
        nereye_alani.setText(model.getValueAt(selectedrow, 5).toString());
        
        

    }//GEN-LAST:event_ucak_tablosuMouseClicked

    private void ucakGuncelle_ButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ucakGuncelle_ButonActionPerformed
        
        mesajYazisi.setText("");

        String UcakAdi = ucakAdi_alani.getText();
        String nerden = nerden_alani.getText();
        String tarih = tarih_alani.getText();
        String nereye = nereye_alani.getText();
        String saat = saat_alani.getText();
        
        int selectedrow = ucak_tablosu.getSelectedRow();
        
        if (selectedrow == -1) {

            if (model.getRowCount() == 0) {

                mesajYazisi.setText("Uçak tablosu şuanda boş.");

            } else {
                mesajYazisi.setText("Lütfen güncellenecek bir \"uçak\" seçin...");
            }

        } else {
            int id = (int) model.getValueAt(selectedrow, 0);
            
            

            ucakIslemleri.ucakGuncelle(id, UcakAdi, saat, tarih, nerden, nereye);

            ucakGoruntule();

            mesajYazisi.setText("Uçak başarı ile güncellendi....");

        }
        
        
    }//GEN-LAST:event_ucakGuncelle_ButonActionPerformed

    private void UcakSil_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UcakSil_butonActionPerformed
        
        mesajYazisi.setText("");

        int selectedrow = ucak_tablosu.getSelectedRow();

        if (selectedrow == -1) {

            if (model.getRowCount() == 0) {

                mesajYazisi.setText("Uçak tablosu şuan boş...");

            } else {
                mesajYazisi.setText("Lütfen silincek bir uçak seçin...");
            }

        } else {
            int id = (int)model.getValueAt(selectedrow, 0);
            
            ucakIslemleri.ucakSil(id);
            
            ucakGoruntule();
            
            mesajYazisi.setText("Uçak başarı ile silindi....");
        }
        
    }//GEN-LAST:event_UcakSil_butonActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        ucakAdi_alani.setText("");
        saat_alani.setText("");
        tarih_alani.setText("");
        nerden_alani.setText("");
        nereye_alani.setText("");
        
        mesajYazisi.setText("Kutuların içi temizlendi..");
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void geri_dön_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geri_dön_butonActionPerformed
        AdminPanel ap = new AdminPanel();

        ap.setVisible(true);

        setVisible(false);
    }//GEN-LAST:event_geri_dön_butonActionPerformed

   public void ucakGoruntule() {

        model.setRowCount(0);

        ArrayList<Ucak> ucakArray = new ArrayList<Ucak>();

        ucakArray = ucakIslemleri.ucaklariGetir();

        if (ucakArray != null) {

            for (Ucak ucak : ucakArray) {

                Object[] eklenecek = {ucak.getId(),ucak.getUcakAdi(),ucak.getSaat(),ucak.getTarih(),ucak.getNerden(),ucak.getNereye()};

                model.addRow(eklenecek);
            }

        }

    }
    
    
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
            java.util.logging.Logger.getLogger(UcakDenetim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UcakDenetim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UcakDenetim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UcakDenetim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UcakDenetim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UcakSil_buton;
    private javax.swing.JButton geri_dön_buton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel mesajYazisi;
    private javax.swing.JTextField nerden_alani;
    private javax.swing.JTextField nereye_alani;
    private javax.swing.JTextField saat_alani;
    private javax.swing.JTextField tarih_alani;
    private javax.swing.JTextField ucakAdi_alani;
    private javax.swing.JButton ucakEkle_buton;
    private javax.swing.JButton ucakGuncelle_Buton;
    private javax.swing.JTable ucak_tablosu;
    // End of variables declaration//GEN-END:variables
}
