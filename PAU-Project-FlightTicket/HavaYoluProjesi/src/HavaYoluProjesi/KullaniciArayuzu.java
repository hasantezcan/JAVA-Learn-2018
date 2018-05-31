package HavaYoluProjesi;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class KullaniciArayuzu extends javax.swing.JFrame {
    int uyeid;
    String email;
    Temelislemler temelislemler = new Temelislemler();
    DefaultTableModel model;
    biletIslemleri biletislemleri = new biletIslemleri();

    public KullaniciArayuzu(String email) {
        this.email = email;

        initComponents();
        
         model = (DefaultTableModel) sefer_tablosu.getModel();
        
        bilgiGetir();
        biletleriGoster();
    }

    public void bilgiGetir() {

        ArrayList<uyeler> arraylistUyeler = new ArrayList<uyeler>();

        arraylistUyeler = temelislemler.kullaniciBilgisi();

        for (uyeler object : arraylistUyeler) {

            if (email.equals(object.getEmail())) {

                String kullaniciadihg = object.getAd() + " " + object.getSoyad();
                
                uyeid = object.getId();
                
                System.out.println( uyeid + " UYE ID !!!");

                kullanici_adi_label.setText(kullaniciadihg);

                if (object.getCinsiyet().equals("KADIN")) {
                    erkek_foto.setVisible(false);
                } else {
                    kadın_foto.setVisible(false);
                }

            }
        }

    }
    
    public void biletleriGoster(){
        
        ArrayList<Ucak> biletGoster = new ArrayList<Ucak>();
        
        biletGoster = biletislemleri.KullaniciArayuzuIcin_biletleriGoster(uyeid);
        
        if (biletGoster != null) {

            for (Ucak ucak : biletGoster) {

                Object[] eklenecek = {ucak.getId(),ucak.getUcakAdi(),ucak.getSaat(),ucak.getTarih(),ucak.getNerden(),ucak.getNereye()};

                model.addRow(eklenecek);
            }

        }
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        erkek_foto = new javax.swing.JLabel();
        kadın_foto = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        kullanici_adi_label = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        sefer_tablosu = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        BiletSil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(600, 300, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 246, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        erkek_foto.setIcon(new javax.swing.ImageIcon("/home/hasantezcan/NetBeansProjects/HavaYoluProjesi/src/HavaYoluProjesi/image/malee.png")); // NOI18N
        jPanel1.add(erkek_foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, 80));

        kadın_foto.setIcon(new javax.swing.ImageIcon("/home/hasantezcan/NetBeansProjects/HavaYoluProjesi/src/HavaYoluProjesi/image/femalee.png")); // NOI18N
        jPanel1.add(kadın_foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, 80));

        jButton1.setFont(new java.awt.Font("Noto Sans UI", 1, 18)); // NOI18N
        jButton1.setText("Bilet AL >>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 160, 60));

        kullanici_adi_label.setText("Hoş geldiniz");
        kullanici_adi_label.setFont(new java.awt.Font("Noto Sans UI", 1, 24)); // NOI18N
        kullanici_adi_label.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(kullanici_adi_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 220, 10));

        jButton2.setFont(new java.awt.Font("Noto Sans UI", 1, 12)); // NOI18N
        jButton2.setText("Kullanıcı Ayarları");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 160, -1));

        jButton3.setFont(new java.awt.Font("Noto Sans UI", 1, 12)); // NOI18N
        jButton3.setText("Çıkış Yap");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, -1, -1));

        jLabel10.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        jLabel10.setText("Uçuşlarım :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 90, 20));

        sefer_tablosu.setBackground(new java.awt.Color(245, 246, 250));
        sefer_tablosu.setFont(new java.awt.Font("Noto Sans UI", 0, 12)); // NOI18N
        sefer_tablosu.setModel(new javax.swing.table.DefaultTableModel(
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
        sefer_tablosu.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(sefer_tablosu);
        if (sefer_tablosu.getColumnModel().getColumnCount() > 0) {
            sefer_tablosu.getColumnModel().getColumn(0).setResizable(false);
            sefer_tablosu.getColumnModel().getColumn(1).setResizable(false);
            sefer_tablosu.getColumnModel().getColumn(2).setResizable(false);
            sefer_tablosu.getColumnModel().getColumn(3).setResizable(false);
            sefer_tablosu.getColumnModel().getColumn(4).setResizable(false);
            sefer_tablosu.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 162, 420, 100));

        jButton4.setText("Kullanıcı Ayarları");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 160, -1));

        BiletSil.setFont(new java.awt.Font("Noto Sans UI", 1, 12)); // NOI18N
        BiletSil.setText("Bilet Sil");
        jPanel1.add(BiletSil, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 160, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 311));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        BiletAl ba = new BiletAl(email,uyeid);

        ba.setVisible(true);

        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        GirisEkrani ge = new GirisEkrani();
        ge.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BiletSil;
    private javax.swing.JLabel erkek_foto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel kadın_foto;
    private javax.swing.JLabel kullanici_adi_label;
    private javax.swing.JTable sefer_tablosu;
    // End of variables declaration//GEN-END:variables
}
