package HavaYoluProjesi;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class BiletAl extends javax.swing.JFrame {

    int ucakid;
    int uyeid;
    String email;
    DefaultTableModel model;
    DefaultTableModel model2;

    Temelislemler islemler = new Temelislemler();

    public BiletAl(String email, int uyeid) {
        this.email = email;
        this.uyeid = uyeid;

        initComponents();

        cbDoldur();
        model = (DefaultTableModel) ucak_tablosu.getModel();
        model2 = (DefaultTableModel) ucak_tablosuDonus.getModel();
        //jScrollPane3.setVisible(false);
        donus_ucuslari_label.setVisible(false);

    }

    public void cbDoldur() {

        ArrayList<String> nerdendondur = new ArrayList<>();

        nerdendondur = islemler.nerdenDondur();

        ArrayList<String> nereyedondur = new ArrayList<>();

        nereyedondur = islemler.nereyeDondur();

        for (String sehir : nerdendondur) {
            nerden_cb.addItem(sehir);
        }

        for (String sehir : nereyedondur) {
            nereye_cb.addItem(sehir);
        }

    }

    public void SeferBul() {

        String nerden = nerden_cb.getSelectedItem().toString();
        String nereye = nereye_cb.getSelectedItem().toString();

        LocalDate datePicker = gidisTarihiDatePicker.getDate();
        String gidisTarihi = datePicker.getDayOfMonth() + "/" + datePicker.getMonthValue() + "/" + datePicker.getYear();

        model.setRowCount(0);

        ArrayList<Ucak> ucakArray1 = new ArrayList<Ucak>();

        ucakArray1 = islemler.SeferSorgula(nerden, nereye, gidisTarihi);

        if (ucakArray1 != null) {

            for (Ucak ucak : ucakArray1) {

                Object[] eklenecek = {ucak.getId(), ucak.getUcakAdi(), ucak.getSaat(), ucak.getTarih(), ucak.getNerden(), ucak.getNereye()};

                model.addRow(eklenecek);
            }

        }

        ///---------------------------
        LocalDate datePicker2 = donusTarihiDatePicker.getDate();
        System.out.println(datePicker2);
        if (datePicker2 != null) {

            String donusTarihi = datePicker2.getDayOfMonth() + "/" + datePicker2.getMonthValue() + "/" + datePicker2.getYear();

            model2.setRowCount(0);

            ArrayList<Ucak> ucakArray2 = new ArrayList<Ucak>();

            ucakArray2 = islemler.SeferSorgula(nereye, nerden, donusTarihi);

            if (ucakArray2 != null) {

                for (Ucak ucak : ucakArray2) {

                    Object[] eklenecek = {ucak.getId(), ucak.getUcakAdi(), ucak.getSaat(), ucak.getTarih(), ucak.getNerden(), ucak.getNereye()};

                    model2.addRow(eklenecek);
                }

            }
        } else {
            System.out.println("lütfen bir gidiş seferi seçiniz");
        }

    }

    public void Donusucak_idGonder() {

        int selectedrow = ucak_tablosu.getSelectedRow();

        if (selectedrow == -1) {

            if (model.getRowCount() == 0) {

                mesajYazisi.setText("Uçak tablosu şuanda boş.");

            } else {
                mesajYazisi.setText("Lütfen koltuk seçimi için bir \"sefer\" seçin...");
            }

        } else {
            ucakid = (int) model.getValueAt(selectedrow, 0);

            mesajYazisi.setText("Sefer seçildi.. Şimdi koltuk seçmek için ilerleyin..");

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        donus_ucuslari_label = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ucak_tablosu = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        ucak_tablosuDonus = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        mesajYazisi = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        nerden_cb = new javax.swing.JComboBox<>();
        nereye_cb = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        gidisDonus_rb1 = new javax.swing.JRadioButton();
        tekYon_rb1 = new javax.swing.JRadioButton();
        donusTarihiDatePicker = new com.github.lgooddatepicker.components.DatePicker();
        jLabel6 = new javax.swing.JLabel();
        donusTarihiLabel = new javax.swing.JLabel();
        gidisTarihiDatePicker = new com.github.lgooddatepicker.components.DatePicker();
        ucus_ara_buton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        geri_dön_buton = new javax.swing.JButton();
        bilet_al_buton_son = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(420, 300, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(47, 54, 64));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(223, 228, 234));
        jPanel1.setForeground(new java.awt.Color(153, 255, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        donus_ucuslari_label.setText("Dönüş Uçuşları :");
        donus_ucuslari_label.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        jPanel1.add(donus_ucuslari_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 120, 20));

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
        ucak_tablosu.setBackground(new java.awt.Color(245, 246, 250));
        ucak_tablosu.setFont(new java.awt.Font("Noto Sans UI", 0, 12)); // NOI18N
        ucak_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ucak_tablosuMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ucak_tablosuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ucak_tablosu);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 520, 270));

        ucak_tablosuDonus.setModel(new javax.swing.table.DefaultTableModel(
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
        ucak_tablosuDonus.setBackground(new java.awt.Color(245, 246, 250));
        ucak_tablosuDonus.setFont(new java.awt.Font("Noto Sans UI", 0, 12)); // NOI18N
        ucak_tablosuDonus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ucak_tablosuDonusMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(ucak_tablosuDonus);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 520, 130));

        jLabel10.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        jLabel10.setText("Gidiş Uçuşları :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 20));

        mesajYazisi.setFont(new java.awt.Font("Noto Sans UI", 0, 14)); // NOI18N
        mesajYazisi.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(mesajYazisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 400, 20));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 540, 320));

        jPanel3.setBackground(new java.awt.Color(223, 228, 234));
        jPanel3.setForeground(new java.awt.Color(153, 255, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nerden_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nerden_cbActionPerformed(evt);
            }
        });
        jPanel3.add(nerden_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 370, 30));

        jPanel3.add(nereye_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 370, 30));

        jLabel2.setText("NERDEN?");
        jLabel2.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        gidisDonus_rb1.setBackground(new java.awt.Color(223, 228, 234));
        buttonGroup1.add(gidisDonus_rb1);
        gidisDonus_rb1.setFont(new java.awt.Font("Noto Sans UI", 0, 14)); // NOI18N
        gidisDonus_rb1.setText("Gidiş - Dönüş");
        gidisDonus_rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gidisDonus_rb1ActionPerformed(evt);
            }
        });
        jPanel3.add(gidisDonus_rb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        tekYon_rb1.setBackground(new java.awt.Color(223, 228, 234));
        buttonGroup1.add(tekYon_rb1);
        tekYon_rb1.setFont(new java.awt.Font("Noto Sans UI", 0, 14)); // NOI18N
        tekYon_rb1.setText("Tek Yön");
        tekYon_rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tekYon_rb1ActionPerformed(evt);
            }
        });
        jPanel3.add(tekYon_rb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));
        jPanel3.add(donusTarihiDatePicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 180, 30));

        jLabel6.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        jLabel6.setText("NEREYE?");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        donusTarihiLabel.setText("Dönüş tarihi");
        donusTarihiLabel.setFont(new java.awt.Font("Noto Sans UI", 0, 14)); // NOI18N
        jPanel3.add(donusTarihiLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));
        jPanel3.add(gidisTarihiDatePicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 180, 30));

        ucus_ara_buton.setText("UÇUŞ ARA >>");
        ucus_ara_buton.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        ucus_ara_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ucus_ara_butonActionPerformed(evt);
            }
        });
        jPanel3.add(ucus_ara_buton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 370, 40));

        jLabel11.setFont(new java.awt.Font("Noto Sans UI", 0, 14)); // NOI18N
        jLabel11.setText("Gidiş tarihi");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 420, 320));

        geri_dön_buton.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        geri_dön_buton.setText("GERİ DÖN");
        geri_dön_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geri_dön_butonActionPerformed(evt);
            }
        });
        jPanel2.add(geri_dön_buton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 270, 130, 30));

        bilet_al_buton_son.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        bilet_al_buton_son.setText("KOLTUK SEÇ!");
        bilet_al_buton_son.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bilet_al_buton_sonActionPerformed(evt);
            }
        });
        jPanel2.add(bilet_al_buton_son, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 310, 130, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nerden_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nerden_cbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nerden_cbActionPerformed

    private void ucus_ara_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ucus_ara_butonActionPerformed
        SeferBul();


    }//GEN-LAST:event_ucus_ara_butonActionPerformed

    private void ucak_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ucak_tablosuMouseClicked

        int selectedrow = ucak_tablosu.getSelectedRow();

//        ucakAdi_alani.setText(model.getValueAt(selectedrow, 1).toString());
//        saat_alani.setText(model.getValueAt(selectedrow, 2).toString());
//        tarih_alani.setText(model.getValueAt(selectedrow, 3).toString());
//        nerden_alani.setText(model.getValueAt(selectedrow, 4).toString());
//        nereye_alani.setText(model.getValueAt(selectedrow, 5).toString());

    }//GEN-LAST:event_ucak_tablosuMouseClicked

    private void tekYon_rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tekYon_rb1ActionPerformed

        donusTarihiDatePicker.setVisible(false);
        donusTarihiLabel.setVisible(false);

        jScrollPane2.setBounds(10, 30, 520, 270);

        donus_ucuslari_label.setVisible(false);


    }//GEN-LAST:event_tekYon_rb1ActionPerformed

    private void gidisDonus_rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gidisDonus_rb1ActionPerformed

        donusTarihiDatePicker.setVisible(true);
        donusTarihiLabel.setVisible(true);
        jScrollPane2.setBounds(10, 30, 520, 120);
        donus_ucuslari_label.setVisible(true);


    }//GEN-LAST:event_gidisDonus_rb1ActionPerformed

    private void ucak_tablosuDonusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ucak_tablosuDonusMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ucak_tablosuDonusMouseClicked

    private void geri_dön_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geri_dön_butonActionPerformed
        KullaniciArayuzu ka = new KullaniciArayuzu(email);

        ka.setVisible(true);

        setVisible(false);
    }//GEN-LAST:event_geri_dön_butonActionPerformed

    private void bilet_al_buton_sonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bilet_al_buton_sonActionPerformed

        
        
        ucakKoltuklari uK = new ucakKoltuklari(ucakid, uyeid);

        uK.setVisible(true);


    }//GEN-LAST:event_bilet_al_buton_sonActionPerformed

    private void ucak_tablosuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ucak_tablosuMouseReleased
        Donusucak_idGonder();
    }//GEN-LAST:event_ucak_tablosuMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bilet_al_buton_son;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.github.lgooddatepicker.components.DatePicker donusTarihiDatePicker;
    private javax.swing.JLabel donusTarihiLabel;
    private javax.swing.JLabel donus_ucuslari_label;
    private javax.swing.JButton geri_dön_buton;
    private javax.swing.JRadioButton gidisDonus_rb1;
    private com.github.lgooddatepicker.components.DatePicker gidisTarihiDatePicker;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel mesajYazisi;
    private javax.swing.JComboBox<String> nerden_cb;
    private javax.swing.JComboBox<String> nereye_cb;
    private javax.swing.JRadioButton tekYon_rb1;
    private javax.swing.JTable ucak_tablosu;
    private javax.swing.JTable ucak_tablosuDonus;
    private javax.swing.JButton ucus_ara_buton;
    // End of variables declaration//GEN-END:variables
}
