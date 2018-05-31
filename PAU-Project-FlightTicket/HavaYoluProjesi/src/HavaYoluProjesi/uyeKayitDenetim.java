package HavaYoluProjesi;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class uyeKayitDenetim extends javax.swing.JFrame {

    DefaultTableModel model;
    uyeIslemleri uyeislemleri = new uyeIslemleri();

    public uyeKayitDenetim() {
        initComponents();

        model = (DefaultTableModel) uye_tablosu.getModel();
        uyeGoruntule();
    }

    public void uyeGoruntule() {

        model.setRowCount(0);

        ArrayList<uyeler> uyeArray = new ArrayList<uyeler>();

        uyeArray = uyeislemleri.uyeleriGetir();

        if (uyeArray != null) {

            for (uyeler uyee : uyeArray) {

                Object[] eklenecek = {uyee.getId(), uyee.getAd(), uyee.getSoyad(), uyee.getParola(), uyee.getEmail(), uyee.getCinsiyet(), uyee.getDogumTarihi()};

                model.addRow(eklenecek);
            }

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ad_alani = new javax.swing.JTextField();
        soyad_alani = new javax.swing.JTextField();
        parola_alani = new javax.swing.JPasswordField();
        email_alani = new javax.swing.JTextField();
        cinsiyet_secim = new javax.swing.JComboBox<>();
        uyari_ekrani = new javax.swing.JLabel();
        dogumTarihi_alani = new javax.swing.JTextField();
        uye_guncelle_buton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        uye_tablosu = new javax.swing.JTable();
        mesajYazisi = new javax.swing.JLabel();
        uye_sil_buton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(500, 250, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(47, 54, 64));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(223, 228, 234));

        jLabel1.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        jLabel1.setText("Adı : ");

        jLabel2.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        jLabel2.setText("Soyadı : ");

        jLabel3.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        jLabel3.setText("Parola :");

        jLabel4.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        jLabel4.setText("Cinsiyet : ");

        jLabel5.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        jLabel5.setText("Doğum Tarihi : ");

        jLabel8.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        jLabel8.setText("* E mail : ");

        parola_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parola_alaniActionPerformed(evt);
            }
        });

        cinsiyet_secim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seçim yapılmadı", "ERKEK", "KADIN" }));
        cinsiyet_secim.setToolTipText("faefsdfsfs");
        cinsiyet_secim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinsiyet_secimActionPerformed(evt);
            }
        });

        uyari_ekrani.setFont(new java.awt.Font("Noto Sans UI", 1, 12)); // NOI18N
        uyari_ekrani.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(email_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(parola_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ad_alani)
                                            .addComponent(soyad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(7, 7, 7)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dogumTarihi_alani)
                                    .addComponent(cinsiyet_secim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uyari_ekrani, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(ad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(soyad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(parola_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addComponent(uyari_ekrani))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(email_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cinsiyet_secim, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dogumTarihi_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 400, 250));

        uye_guncelle_buton.setText("Kullanıcı Güncelle");
        uye_guncelle_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uye_guncelle_butonActionPerformed(evt);
            }
        });
        jPanel1.add(uye_guncelle_buton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 400, 41));

        jButton2.setIcon(new javax.swing.ImageIcon("/home/hasantezcan/Desktop/İMAGE/geributton.png")); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, 59, 41));

        jLabel10.setFont(new java.awt.Font("Noto Sans UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(245, 246, 250));
        jLabel10.setText("Kayıt Denetim Ekranı :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 18, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 56, 303, 10));

        jPanel3.setBackground(new java.awt.Color(223, 228, 234));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        uye_tablosu.setBackground(new java.awt.Color(245, 246, 250));
        uye_tablosu.setFont(new java.awt.Font("Noto Sans UI", 0, 12)); // NOI18N
        uye_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Adı", "Soyadı", "Parola", "Email", "Cinsiyet", "Doğum Tarihi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        uye_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uye_tablosuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(uye_tablosu);
        if (uye_tablosu.getColumnModel().getColumnCount() > 0) {
            uye_tablosu.getColumnModel().getColumn(1).setResizable(false);
            uye_tablosu.getColumnModel().getColumn(2).setResizable(false);
            uye_tablosu.getColumnModel().getColumn(3).setResizable(false);
            uye_tablosu.getColumnModel().getColumn(4).setResizable(false);
            uye_tablosu.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 560, 400));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 580, 420));

        mesajYazisi.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        mesajYazisi.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(mesajYazisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 510, 20));

        uye_sil_buton.setText("Kullanıcı Sil");
        uye_sil_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uye_sil_butonActionPerformed(evt);
            }
        });
        jPanel1.add(uye_sil_buton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 400, 41));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 581));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void parola_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parola_alaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parola_alaniActionPerformed

    private void cinsiyet_secimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinsiyet_secimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cinsiyet_secimActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        AdminPanel ap = new AdminPanel();

        ap.setVisible(true);

        setVisible(false);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void uye_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uye_tablosuMouseClicked

        int selectedrow = uye_tablosu.getSelectedRow();

        ad_alani.setText(model.getValueAt(selectedrow, 1).toString());
        soyad_alani.setText(model.getValueAt(selectedrow, 2).toString());
        parola_alani.setText(model.getValueAt(selectedrow, 3).toString());
        email_alani.setText(model.getValueAt(selectedrow, 4).toString());
        cinsiyet_secim.setSelectedItem(model.getValueAt(selectedrow, 5).toString());
        dogumTarihi_alani.setText(model.getValueAt(selectedrow, 6).toString());
    }//GEN-LAST:event_uye_tablosuMouseClicked

    private void uye_guncelle_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uye_guncelle_butonActionPerformed

        mesajYazisi.setText("");

        String adı = ad_alani.getText();
        String soyadı = soyad_alani.getText();
        String parola = parola_alani.getText();
        String email = email_alani.getText();
        String cinsiyet = cinsiyet_secim.getSelectedItem().toString();
        String dogumTarihi = dogumTarihi_alani.getText();

        

        int selectedrow = uye_tablosu.getSelectedRow();

        if (selectedrow == -1) {

            if (model.getRowCount() == 0) {

                mesajYazisi.setText("Üye tablosu şuanda boş.");

            } else {
                mesajYazisi.setText("Lütfen güncellenecek bir \"üye\" seçin...");
            }

        } else {
            int id = (int) model.getValueAt(selectedrow, 0);

            uyeislemleri.uyeGuncelle(id, adı, soyadı, parola, email, cinsiyet, dogumTarihi);

            uyeGoruntule();

            mesajYazisi.setText("Uçak başarı ile güncellendi....");

        }


    }//GEN-LAST:event_uye_guncelle_butonActionPerformed

    private void uye_sil_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uye_sil_butonActionPerformed
       
        mesajYazisi.setText("");

        int selectedrow = uye_tablosu.getSelectedRow();

        if (selectedrow == -1) {

            if (model.getRowCount() == 0) {

                mesajYazisi.setText("Üye tablosu şuan boş...");

            } else {
                mesajYazisi.setText("Lütfen silincek bir üye seçin...");
            }

        } else {
            int id = (int)model.getValueAt(selectedrow, 0);
            
            uyeislemleri.uyeSil(id);
            
            uyeGoruntule();
            
            mesajYazisi.setText("Üye başarı ile silindi....");
        }
        
        
        
        
    }//GEN-LAST:event_uye_sil_butonActionPerformed

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
            java.util.logging.Logger.getLogger(uyeKayitDenetim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(uyeKayitDenetim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(uyeKayitDenetim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(uyeKayitDenetim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new uyeKayitDenetim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad_alani;
    private javax.swing.JComboBox<String> cinsiyet_secim;
    private javax.swing.JTextField dogumTarihi_alani;
    private javax.swing.JTextField email_alani;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mesajYazisi;
    private javax.swing.JPasswordField parola_alani;
    private javax.swing.JTextField soyad_alani;
    private javax.swing.JLabel uyari_ekrani;
    private javax.swing.JButton uye_guncelle_buton;
    private javax.swing.JButton uye_sil_buton;
    private javax.swing.JTable uye_tablosu;
    // End of variables declaration//GEN-END:variables
}
