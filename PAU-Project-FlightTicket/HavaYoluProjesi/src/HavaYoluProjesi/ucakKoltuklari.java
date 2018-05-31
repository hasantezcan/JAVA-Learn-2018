package HavaYoluProjesi;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;

public class ucakKoltuklari extends javax.swing.JFrame {

    int ucakid;
    int uyeid;
    String koltukAdi = ""; //Radio Buttonlarda güncelleme işlemi için kullanılacak..

    UcakIslemleri ucakIslemleri = new UcakIslemleri();
    biletIslemleri biletislemleri = new biletIslemleri();

    public ucakKoltuklari(int ucakid, int uyeid) {
        this.ucakid = ucakid;
        this.uyeid = uyeid;
        initComponents();
        SeferOzeti_panel.setVisible(false);

        koltukIsimver();

        buttonGroup1.getButtonCount();

        System.out.println(ucakid + "   " + uyeid);
    }

    public void koltukIsimver() {
        jRadioButton1.setActionCommand("A1");
        jRadioButton2.setActionCommand("A2");
        jRadioButton3.setActionCommand("A3");
        jRadioButton4.setActionCommand("A4");
        jRadioButton5.setActionCommand("A5");
        jRadioButton6.setActionCommand("A6");
        jRadioButton7.setActionCommand("A7");
        jRadioButton8.setActionCommand("A8");
        jRadioButton9.setActionCommand("A9");
        jRadioButton10.setActionCommand("A10");
        jRadioButton11.setActionCommand("A11");
        jRadioButton12.setActionCommand("A15");
        jRadioButton13.setActionCommand("A16");
        jRadioButton14.setActionCommand("A17");
        jRadioButton15.setActionCommand("A18");
        jRadioButton16.setActionCommand("A19");
        jRadioButton17.setActionCommand("A20");

        jRadioButton18.setActionCommand("B1");
        jRadioButton19.setActionCommand("B2");
        jRadioButton20.setActionCommand("B3");
        jRadioButton21.setActionCommand("B4");
        jRadioButton22.setActionCommand("B5");
        jRadioButton23.setActionCommand("B6");
        jRadioButton24.setActionCommand("B7");
        jRadioButton25.setActionCommand("B8");
        jRadioButton26.setActionCommand("B9");
        jRadioButton27.setActionCommand("B10");
        jRadioButton28.setActionCommand("B11");
        jRadioButton29.setActionCommand("B15");
        jRadioButton30.setActionCommand("B16");
        jRadioButton31.setActionCommand("B17");
        jRadioButton32.setActionCommand("B18");
        jRadioButton33.setActionCommand("B19");
        jRadioButton34.setActionCommand("B20");

        jRadioButton35.setActionCommand("C1");
        jRadioButton36.setActionCommand("C2");
        jRadioButton37.setActionCommand("C3");
        jRadioButton38.setActionCommand("C4");
        jRadioButton39.setActionCommand("C5");
        jRadioButton40.setActionCommand("C6");
        jRadioButton41.setActionCommand("C7");
        jRadioButton42.setActionCommand("C8");
        jRadioButton43.setActionCommand("C9");
        jRadioButton44.setActionCommand("C10");
        jRadioButton45.setActionCommand("C11");
        jRadioButton46.setActionCommand("C15");
        jRadioButton47.setActionCommand("C16");
        jRadioButton48.setActionCommand("C17");
        jRadioButton49.setActionCommand("C18");
        jRadioButton50.setActionCommand("C19");
        jRadioButton51.setActionCommand("C20");

        jRadioButton52.setActionCommand("D1");
        jRadioButton53.setActionCommand("D2");
        jRadioButton54.setActionCommand("D3");
        jRadioButton55.setActionCommand("D4");
        jRadioButton56.setActionCommand("D5");
        jRadioButton57.setActionCommand("D6");
        jRadioButton58.setActionCommand("D7");
        jRadioButton59.setActionCommand("D8");
        jRadioButton60.setActionCommand("D9");
        jRadioButton61.setActionCommand("D10");
        jRadioButton62.setActionCommand("D11");
        jRadioButton63.setActionCommand("D15");
        jRadioButton64.setActionCommand("D16");
        jRadioButton65.setActionCommand("D17");
        jRadioButton66.setActionCommand("D18");
        jRadioButton67.setActionCommand("D19");
        jRadioButton68.setActionCommand("D20");

        jRadioButton69.setActionCommand("E1");
        jRadioButton70.setActionCommand("E2");
        jRadioButton71.setActionCommand("E3");
        jRadioButton72.setActionCommand("E4");
        jRadioButton73.setActionCommand("E5");
        jRadioButton74.setActionCommand("E6");
        jRadioButton75.setActionCommand("E7");
        jRadioButton76.setActionCommand("E8");
        jRadioButton77.setActionCommand("E9");
        jRadioButton78.setActionCommand("E10");
        jRadioButton79.setActionCommand("E11");
        jRadioButton80.setActionCommand("E15");
        jRadioButton81.setActionCommand("E16");
        jRadioButton82.setActionCommand("E17");
        jRadioButton83.setActionCommand("E18");
        jRadioButton84.setActionCommand("E19");
        jRadioButton85.setActionCommand("E20");

        jRadioButton86.setActionCommand("F1");
        jRadioButton87.setActionCommand("F2");
        jRadioButton88.setActionCommand("F3");
        jRadioButton89.setActionCommand("F4");
        jRadioButton90.setActionCommand("F5");
        jRadioButton91.setActionCommand("F6");
        jRadioButton92.setActionCommand("F7");
        jRadioButton93.setActionCommand("F8");
        jRadioButton94.setActionCommand("F9");
        jRadioButton95.setActionCommand("F10");
        jRadioButton96.setActionCommand("F11");
        jRadioButton97.setActionCommand("F15");
        jRadioButton98.setActionCommand("F16");
        jRadioButton99.setActionCommand("F17");
        jRadioButton100.setActionCommand("F18");
        jRadioButton101.setActionCommand("F19");
        jRadioButton102.setActionCommand("F20");

    }

    public void SonSeferBilgisiGoruntule() {

        ArrayList<Ucak> sonGoruntule = new ArrayList<>();

        sonGoruntule = ucakIslemleri.KoltukEkraninaGetir(ucakid);

        String ucak_adi = "";
        String kakisYeri = "";
        String inisYeri = "";
        String KalkisSaati = "";
        String KalkisTarihi = "";

        for (Ucak ucak : sonGoruntule) {
            ucak_adi = ucak.getUcakAdi();
            kakisYeri = ucak.getNerden();
            inisYeri = ucak.getNereye();
            KalkisTarihi = ucak.getTarih();
            KalkisSaati = ucak.getSaat();

        }
        ucakAdı_tb.setText(ucak_adi);
        kalkıs_tb.setText(kakisYeri);
        varis_tb.setText(inisYeri);
        kalkısTarihi_tb.setText(KalkisTarihi);
        kalkisSaati_tb.setText(KalkisSaati);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        perde = new javax.swing.JPanel();
        lutfen_koltuk_seciniz_seprator = new javax.swing.JSeparator();
        lutfen_koltuk_seciniz_tb = new javax.swing.JLabel();
        perde_buton = new javax.swing.JButton();
        butonlar = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jRadioButton23 = new javax.swing.JRadioButton();
        jRadioButton24 = new javax.swing.JRadioButton();
        jRadioButton25 = new javax.swing.JRadioButton();
        jRadioButton26 = new javax.swing.JRadioButton();
        jRadioButton27 = new javax.swing.JRadioButton();
        jRadioButton28 = new javax.swing.JRadioButton();
        jRadioButton29 = new javax.swing.JRadioButton();
        jRadioButton30 = new javax.swing.JRadioButton();
        jRadioButton31 = new javax.swing.JRadioButton();
        jRadioButton32 = new javax.swing.JRadioButton();
        jRadioButton33 = new javax.swing.JRadioButton();
        jRadioButton34 = new javax.swing.JRadioButton();
        jRadioButton35 = new javax.swing.JRadioButton();
        jRadioButton36 = new javax.swing.JRadioButton();
        jRadioButton37 = new javax.swing.JRadioButton();
        jRadioButton38 = new javax.swing.JRadioButton();
        jRadioButton39 = new javax.swing.JRadioButton();
        jRadioButton40 = new javax.swing.JRadioButton();
        jRadioButton41 = new javax.swing.JRadioButton();
        jRadioButton42 = new javax.swing.JRadioButton();
        jRadioButton43 = new javax.swing.JRadioButton();
        jRadioButton44 = new javax.swing.JRadioButton();
        jRadioButton45 = new javax.swing.JRadioButton();
        jRadioButton46 = new javax.swing.JRadioButton();
        jRadioButton47 = new javax.swing.JRadioButton();
        jRadioButton48 = new javax.swing.JRadioButton();
        jRadioButton49 = new javax.swing.JRadioButton();
        jRadioButton50 = new javax.swing.JRadioButton();
        jRadioButton51 = new javax.swing.JRadioButton();
        jRadioButton52 = new javax.swing.JRadioButton();
        jRadioButton53 = new javax.swing.JRadioButton();
        jRadioButton54 = new javax.swing.JRadioButton();
        jRadioButton55 = new javax.swing.JRadioButton();
        jRadioButton56 = new javax.swing.JRadioButton();
        jRadioButton57 = new javax.swing.JRadioButton();
        jRadioButton58 = new javax.swing.JRadioButton();
        jRadioButton59 = new javax.swing.JRadioButton();
        jRadioButton60 = new javax.swing.JRadioButton();
        jRadioButton61 = new javax.swing.JRadioButton();
        jRadioButton62 = new javax.swing.JRadioButton();
        jRadioButton63 = new javax.swing.JRadioButton();
        jRadioButton64 = new javax.swing.JRadioButton();
        jRadioButton65 = new javax.swing.JRadioButton();
        jRadioButton66 = new javax.swing.JRadioButton();
        jRadioButton67 = new javax.swing.JRadioButton();
        jRadioButton68 = new javax.swing.JRadioButton();
        jRadioButton69 = new javax.swing.JRadioButton();
        jRadioButton70 = new javax.swing.JRadioButton();
        jRadioButton71 = new javax.swing.JRadioButton();
        jRadioButton72 = new javax.swing.JRadioButton();
        jRadioButton73 = new javax.swing.JRadioButton();
        jRadioButton74 = new javax.swing.JRadioButton();
        jRadioButton75 = new javax.swing.JRadioButton();
        jRadioButton76 = new javax.swing.JRadioButton();
        jRadioButton77 = new javax.swing.JRadioButton();
        jRadioButton78 = new javax.swing.JRadioButton();
        jRadioButton79 = new javax.swing.JRadioButton();
        jRadioButton80 = new javax.swing.JRadioButton();
        jRadioButton81 = new javax.swing.JRadioButton();
        jRadioButton82 = new javax.swing.JRadioButton();
        jRadioButton83 = new javax.swing.JRadioButton();
        jRadioButton84 = new javax.swing.JRadioButton();
        jRadioButton85 = new javax.swing.JRadioButton();
        jRadioButton86 = new javax.swing.JRadioButton();
        jRadioButton87 = new javax.swing.JRadioButton();
        jRadioButton88 = new javax.swing.JRadioButton();
        jRadioButton89 = new javax.swing.JRadioButton();
        jRadioButton90 = new javax.swing.JRadioButton();
        jRadioButton91 = new javax.swing.JRadioButton();
        jRadioButton92 = new javax.swing.JRadioButton();
        jRadioButton93 = new javax.swing.JRadioButton();
        jRadioButton94 = new javax.swing.JRadioButton();
        jRadioButton95 = new javax.swing.JRadioButton();
        jRadioButton96 = new javax.swing.JRadioButton();
        jRadioButton97 = new javax.swing.JRadioButton();
        jRadioButton98 = new javax.swing.JRadioButton();
        jRadioButton99 = new javax.swing.JRadioButton();
        jRadioButton100 = new javax.swing.JRadioButton();
        jRadioButton101 = new javax.swing.JRadioButton();
        jRadioButton102 = new javax.swing.JRadioButton();
        ucakIci = new javax.swing.JLabel();
        bilet_al_buton_son = new javax.swing.JButton();
        kartin_ustundeki_isim = new javax.swing.JTextField();
        kullanici_adi_label1 = new javax.swing.JLabel();
        kullanici_adi_label2 = new javax.swing.JLabel();
        kart_numarasi = new javax.swing.JTextField();
        sonKullanim_yil = new javax.swing.JTextField();
        cvc2 = new javax.swing.JTextField();
        kullanici_adi_label4 = new javax.swing.JLabel();
        kullanici_adi_label3 = new javax.swing.JLabel();
        kullanici_adi_label5 = new javax.swing.JLabel();
        sonKullanim_ay = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        uyari_yazisi = new javax.swing.JLabel();
        kullanici_adi_label8 = new javax.swing.JLabel();
        kullanici_adi_label9 = new javax.swing.JLabel();
        SeferOzeti_panel = new javax.swing.JPanel();
        ucakAdı_tb = new javax.swing.JLabel();
        varis_tb = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        kullanici_adi_label7 = new javax.swing.JLabel();
        kullanici_adi_label10 = new javax.swing.JLabel();
        kalkıs_tb = new javax.swing.JLabel();
        kalkısTarihi_tb = new javax.swing.JLabel();
        kalkisSaati_tb = new javax.swing.JLabel();
        kullanici_adi_label15 = new javax.swing.JLabel();
        kullanici_adi_label16 = new javax.swing.JLabel();
        kullanici_adi_label18 = new javax.swing.JLabel();
        kullanici_adi_label19 = new javax.swing.JLabel();
        kullanici_adi_label20 = new javax.swing.JLabel();
        koltuk_adi_goster = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 246, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        perde.setBackground(new java.awt.Color(245, 246, 250));
        perde.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        perde.add(lutfen_koltuk_seciniz_seprator, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 340, 10));

        lutfen_koltuk_seciniz_tb.setFont(new java.awt.Font("Noto Sans UI", 1, 24)); // NOI18N
        lutfen_koltuk_seciniz_tb.setForeground(new java.awt.Color(0, 0, 0));
        lutfen_koltuk_seciniz_tb.setText("Lütfen Koltuğunuzu Seçin..");
        perde.add(lutfen_koltuk_seciniz_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        perde_buton.setFont(new java.awt.Font("Noto Sans UI", 1, 18)); // NOI18N
        perde_buton.setText("ÖDEME EKRANINA GEÇ >>");
        perde_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perde_butonActionPerformed(evt);
            }
        });
        perde.add(perde_buton, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 590, 280, 45));

        jPanel1.add(perde, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 550, 660));

        butonlar.setBackground(new java.awt.Color(245, 246, 250));
        butonlar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butonlarMouseClicked(evt);
            }
        });
        butonlar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(jRadioButton1);
        butonlar.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, 40));

        buttonGroup1.add(jRadioButton2);
        butonlar.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, 30));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, 40));

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, 30));

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, 40));

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, 30));

        buttonGroup1.add(jRadioButton7);
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, 40));

        buttonGroup1.add(jRadioButton8);
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, 30));

        buttonGroup1.add(jRadioButton9);
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, 40));

        buttonGroup1.add(jRadioButton10);
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, 30));

        buttonGroup1.add(jRadioButton11);
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, 40));

        buttonGroup1.add(jRadioButton12);
        jRadioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton12ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, -1, 40));

        buttonGroup1.add(jRadioButton13);
        jRadioButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton13ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, -1, 40));

        buttonGroup1.add(jRadioButton14);
        jRadioButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton14ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, -1, 30));

        buttonGroup1.add(jRadioButton15);
        jRadioButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton15ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 550, -1, 40));

        buttonGroup1.add(jRadioButton16);
        jRadioButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton16ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 590, -1, 30));

        buttonGroup1.add(jRadioButton17);
        jRadioButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton17ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 610, -1, 40));

        buttonGroup1.add(jRadioButton18);
        jRadioButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton18ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 30, 30));

        buttonGroup1.add(jRadioButton19);
        jRadioButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton19ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 30, 20));

        buttonGroup1.add(jRadioButton20);
        jRadioButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton20ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 30, 40));

        buttonGroup1.add(jRadioButton21);
        jRadioButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton21ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 30, 30));

        buttonGroup1.add(jRadioButton22);
        jRadioButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton22ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 30, 40));

        buttonGroup1.add(jRadioButton23);
        jRadioButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton23ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 30, 30));

        buttonGroup1.add(jRadioButton24);
        jRadioButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton24ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 30, 40));

        buttonGroup1.add(jRadioButton25);
        jRadioButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton25ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 30, 30));

        buttonGroup1.add(jRadioButton26);
        jRadioButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton26ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 30, 40));

        buttonGroup1.add(jRadioButton27);
        jRadioButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton27ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 30, 30));

        buttonGroup1.add(jRadioButton28);
        jRadioButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton28ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 30, 40));

        buttonGroup1.add(jRadioButton29);
        jRadioButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton29ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 30, 40));

        buttonGroup1.add(jRadioButton30);
        jRadioButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton30ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 30, 20));

        buttonGroup1.add(jRadioButton31);
        jRadioButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton31ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, 30, 30));

        buttonGroup1.add(jRadioButton32);
        jRadioButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton32ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 550, 30, 40));

        buttonGroup1.add(jRadioButton33);
        jRadioButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton33ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 590, 30, 30));

        buttonGroup1.add(jRadioButton34);
        jRadioButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton34ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 610, 30, 40));

        buttonGroup1.add(jRadioButton35);
        jRadioButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton35ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 30, 50));

        buttonGroup1.add(jRadioButton36);
        jRadioButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton36ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 30, 40));

        buttonGroup1.add(jRadioButton37);
        jRadioButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton37ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 30, 40));

        buttonGroup1.add(jRadioButton38);
        jRadioButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton38ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 30, 30));

        buttonGroup1.add(jRadioButton39);
        jRadioButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton39ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 30, 40));

        buttonGroup1.add(jRadioButton40);
        jRadioButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton40ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 30, 30));

        buttonGroup1.add(jRadioButton41);
        jRadioButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton41ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton41, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 30, 40));

        buttonGroup1.add(jRadioButton42);
        jRadioButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton42ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton42, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 30, 30));

        buttonGroup1.add(jRadioButton43);
        jRadioButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton43ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton43, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 30, 40));

        buttonGroup1.add(jRadioButton44);
        jRadioButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton44ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton44, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 30, 30));

        buttonGroup1.add(jRadioButton45);
        jRadioButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton45ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton45, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 30, 40));

        buttonGroup1.add(jRadioButton46);
        jRadioButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton46ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton46, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 30, 40));

        buttonGroup1.add(jRadioButton47);
        jRadioButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton47ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton47, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 30, 40));

        buttonGroup1.add(jRadioButton48);
        jRadioButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton48ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton48, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 30, 30));

        buttonGroup1.add(jRadioButton49);
        jRadioButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton49ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton49, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, 30, 40));

        buttonGroup1.add(jRadioButton50);
        jRadioButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton50ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton50, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 590, 30, 30));

        buttonGroup1.add(jRadioButton51);
        jRadioButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton51ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton51, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 610, 30, 40));

        buttonGroup1.add(jRadioButton52);
        jRadioButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton52ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton52, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, 30));

        buttonGroup1.add(jRadioButton53);
        jRadioButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton53ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton53, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, 20));

        buttonGroup1.add(jRadioButton54);
        jRadioButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton54ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton54, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, 40));

        buttonGroup1.add(jRadioButton55);
        jRadioButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton55ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton55, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, 30));

        buttonGroup1.add(jRadioButton56);
        jRadioButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton56ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton56, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, 40));

        buttonGroup1.add(jRadioButton57);
        jRadioButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton57ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton57, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, 30));

        buttonGroup1.add(jRadioButton58);
        jRadioButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton58ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton58, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, 40));

        buttonGroup1.add(jRadioButton59);
        jRadioButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton59ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton59, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, 30));

        buttonGroup1.add(jRadioButton60);
        jRadioButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton60ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton60, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, 40));

        buttonGroup1.add(jRadioButton61);
        jRadioButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton61ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton61, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, -1, 30));

        buttonGroup1.add(jRadioButton62);
        jRadioButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton62ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton62, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, -1, 40));

        buttonGroup1.add(jRadioButton63);
        jRadioButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton63ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton63, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, -1, 40));

        buttonGroup1.add(jRadioButton64);
        jRadioButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton64ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton64, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, -1, 20));

        buttonGroup1.add(jRadioButton65);
        jRadioButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton65ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton65, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, -1, 30));

        buttonGroup1.add(jRadioButton66);
        jRadioButton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton66ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton66, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, -1, 40));

        buttonGroup1.add(jRadioButton67);
        jRadioButton67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton67ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton67, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 590, -1, 30));

        buttonGroup1.add(jRadioButton68);
        jRadioButton68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton68ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton68, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 610, -1, 40));

        buttonGroup1.add(jRadioButton69);
        jRadioButton69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton69ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton69, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, 50));

        buttonGroup1.add(jRadioButton70);
        jRadioButton70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton70ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton70, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, 40));

        buttonGroup1.add(jRadioButton71);
        jRadioButton71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton71ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton71, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, 40));

        buttonGroup1.add(jRadioButton72);
        jRadioButton72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton72ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton72, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, 30));

        buttonGroup1.add(jRadioButton73);
        jRadioButton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton73ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton73, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, 40));

        buttonGroup1.add(jRadioButton74);
        jRadioButton74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton74ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton74, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, 30));

        buttonGroup1.add(jRadioButton75);
        jRadioButton75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton75ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton75, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, 40));

        buttonGroup1.add(jRadioButton76);
        jRadioButton76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton76ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton76, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, -1, 30));

        buttonGroup1.add(jRadioButton77);
        jRadioButton77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton77ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton77, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, 40));

        buttonGroup1.add(jRadioButton78);
        jRadioButton78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton78ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton78, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, 30));

        buttonGroup1.add(jRadioButton79);
        jRadioButton79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton79ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton79, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, -1, 40));

        buttonGroup1.add(jRadioButton80);
        jRadioButton80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton80ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton80, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, -1, 40));

        buttonGroup1.add(jRadioButton81);
        jRadioButton81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton81ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton81, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, -1, 40));

        buttonGroup1.add(jRadioButton82);
        jRadioButton82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton82ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton82, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, -1, 30));

        buttonGroup1.add(jRadioButton83);
        jRadioButton83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton83ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton83, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, -1, 40));

        buttonGroup1.add(jRadioButton84);
        jRadioButton84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton84ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton84, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 590, -1, 30));

        buttonGroup1.add(jRadioButton85);
        jRadioButton85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton85ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton85, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 610, -1, 40));

        buttonGroup1.add(jRadioButton86);
        jRadioButton86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton86ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton86, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, 30));

        buttonGroup1.add(jRadioButton87);
        jRadioButton87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton87ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton87, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, 20));

        buttonGroup1.add(jRadioButton88);
        jRadioButton88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton88ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton88, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, 40));

        buttonGroup1.add(jRadioButton89);
        jRadioButton89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton89ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton89, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, 30));

        buttonGroup1.add(jRadioButton90);
        jRadioButton90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton90ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton90, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, 40));

        buttonGroup1.add(jRadioButton91);
        jRadioButton91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton91ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton91, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, 30));

        buttonGroup1.add(jRadioButton92);
        jRadioButton92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton92ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton92, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, 40));

        buttonGroup1.add(jRadioButton93);
        jRadioButton93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton93ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton93, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, 30));

        buttonGroup1.add(jRadioButton94);
        jRadioButton94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton94ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton94, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, 40));

        buttonGroup1.add(jRadioButton95);
        jRadioButton95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton95ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton95, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, 30));

        buttonGroup1.add(jRadioButton96);
        jRadioButton96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton96ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton96, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, 40));

        buttonGroup1.add(jRadioButton97);
        jRadioButton97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton97ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton97, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, -1, 40));

        buttonGroup1.add(jRadioButton98);
        jRadioButton98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton98ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton98, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, -1, 20));

        buttonGroup1.add(jRadioButton99);
        jRadioButton99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton99ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton99, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, -1, 30));

        buttonGroup1.add(jRadioButton100);
        jRadioButton100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton100ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton100, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, -1, 40));

        buttonGroup1.add(jRadioButton101);
        jRadioButton101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton101ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton101, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 590, -1, 30));

        buttonGroup1.add(jRadioButton102);
        jRadioButton102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton102ActionPerformed(evt);
            }
        });
        butonlar.add(jRadioButton102, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 610, -1, 40));

        ucakIci.setIcon(new javax.swing.ImageIcon("/home/hasantezcan/NetBeansProjects/HavaYoluProjesi/src/HavaYoluProjesi/image/ucakIci.png")); // NOI18N
        butonlar.add(ucakIci, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 290, 650));

        jPanel1.add(butonlar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 330, 680));

        bilet_al_buton_son.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        bilet_al_buton_son.setText("BİLET AL !");
        bilet_al_buton_son.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bilet_al_buton_sonActionPerformed(evt);
            }
        });
        jPanel1.add(bilet_al_buton_son, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 610, 250, 50));

        kartin_ustundeki_isim.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        kartin_ustundeki_isim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kartin_ustundeki_isimActionPerformed(evt);
            }
        });
        jPanel1.add(kartin_ustundeki_isim, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, 320, 40));

        kullanici_adi_label1.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        kullanici_adi_label1.setForeground(new java.awt.Color(0, 0, 0));
        kullanici_adi_label1.setText("Kartın Üstündeki İsim :");
        jPanel1.add(kullanici_adi_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, -1, -1));

        kullanici_adi_label2.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        kullanici_adi_label2.setForeground(new java.awt.Color(0, 0, 0));
        kullanici_adi_label2.setText("Kart Numarası : ");
        jPanel1.add(kullanici_adi_label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, -1, -1));

        kart_numarasi.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        kart_numarasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kart_numarasiActionPerformed(evt);
            }
        });
        jPanel1.add(kart_numarasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, 320, 40));

        sonKullanim_yil.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        sonKullanim_yil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sonKullanim_yilActionPerformed(evt);
            }
        });
        jPanel1.add(sonKullanim_yil, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 500, 110, 40));

        cvc2.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        cvc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cvc2ActionPerformed(evt);
            }
        });
        jPanel1.add(cvc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 550, 110, 40));

        kullanici_adi_label4.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        kullanici_adi_label4.setForeground(new java.awt.Color(0, 0, 0));
        kullanici_adi_label4.setText("CVC2 : ");
        jPanel1.add(kullanici_adi_label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 560, -1, -1));

        kullanici_adi_label3.setFont(new java.awt.Font("Noto Sans UI", 1, 24)); // NOI18N
        kullanici_adi_label3.setForeground(new java.awt.Color(0, 0, 0));
        kullanici_adi_label3.setText("/");
        jPanel1.add(kullanici_adi_label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 500, -1, -1));

        kullanici_adi_label5.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        kullanici_adi_label5.setForeground(new java.awt.Color(0, 0, 0));
        kullanici_adi_label5.setText("AA/YY");
        jPanel1.add(kullanici_adi_label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 520, -1, -1));

        sonKullanim_ay.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        sonKullanim_ay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sonKullanim_ayActionPerformed(evt);
            }
        });
        jPanel1.add(sonKullanim_ay, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 500, 110, 40));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 130, 10));

        uyari_yazisi.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        uyari_yazisi.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(uyari_yazisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 630, 250, 20));

        kullanici_adi_label8.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        kullanici_adi_label8.setForeground(new java.awt.Color(0, 0, 0));
        kullanici_adi_label8.setText("Son Kullanma Tarihi");
        jPanel1.add(kullanici_adi_label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, -1, -1));

        kullanici_adi_label9.setFont(new java.awt.Font("Noto Sans UI", 1, 24)); // NOI18N
        kullanici_adi_label9.setForeground(new java.awt.Color(0, 0, 0));
        kullanici_adi_label9.setText("Ödeme :");
        jPanel1.add(kullanici_adi_label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, -1, -1));

        SeferOzeti_panel.setBackground(new java.awt.Color(245, 246, 250));
        SeferOzeti_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ucakAdı_tb.setFont(new java.awt.Font("Noto Sans UI", 1, 18)); // NOI18N
        ucakAdı_tb.setForeground(new java.awt.Color(0, 0, 0));
        ucakAdı_tb.setText("ucak_adı");
        SeferOzeti_panel.add(ucakAdı_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

        varis_tb.setFont(new java.awt.Font("Noto Sans UI", 1, 18)); // NOI18N
        varis_tb.setForeground(new java.awt.Color(0, 0, 0));
        varis_tb.setText("Varış N. : ");
        SeferOzeti_panel.add(varis_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));
        SeferOzeti_panel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 340, 10));

        kullanici_adi_label7.setFont(new java.awt.Font("Noto Sans UI", 1, 24)); // NOI18N
        kullanici_adi_label7.setForeground(new java.awt.Color(0, 0, 0));
        kullanici_adi_label7.setText("Sefer Özetiniz : ");
        SeferOzeti_panel.add(kullanici_adi_label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        kullanici_adi_label10.setFont(new java.awt.Font("Noto Sans UI", 0, 18)); // NOI18N
        kullanici_adi_label10.setForeground(new java.awt.Color(0, 0, 0));
        kullanici_adi_label10.setText("Uçak Adı :");
        SeferOzeti_panel.add(kullanici_adi_label10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        kalkıs_tb.setFont(new java.awt.Font("Noto Sans UI", 1, 18)); // NOI18N
        kalkıs_tb.setForeground(new java.awt.Color(0, 0, 0));
        kalkıs_tb.setText("Kalkış N. : ");
        SeferOzeti_panel.add(kalkıs_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        kalkısTarihi_tb.setFont(new java.awt.Font("Noto Sans UI", 1, 18)); // NOI18N
        kalkısTarihi_tb.setForeground(new java.awt.Color(0, 0, 0));
        kalkısTarihi_tb.setText("Kalkış Tarihi : ");
        SeferOzeti_panel.add(kalkısTarihi_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 180, -1));

        kalkisSaati_tb.setFont(new java.awt.Font("Noto Sans UI", 1, 18)); // NOI18N
        kalkisSaati_tb.setForeground(new java.awt.Color(0, 0, 0));
        kalkisSaati_tb.setText("Saati :");
        SeferOzeti_panel.add(kalkisSaati_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 90, -1));

        kullanici_adi_label15.setFont(new java.awt.Font("Noto Sans UI", 0, 18)); // NOI18N
        kullanici_adi_label15.setForeground(new java.awt.Color(0, 0, 0));
        kullanici_adi_label15.setText("Kalkış Noktası :");
        SeferOzeti_panel.add(kullanici_adi_label15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        kullanici_adi_label16.setFont(new java.awt.Font("Noto Sans UI", 0, 18)); // NOI18N
        kullanici_adi_label16.setForeground(new java.awt.Color(0, 0, 0));
        kullanici_adi_label16.setText("Varış Noktası :");
        SeferOzeti_panel.add(kullanici_adi_label16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        kullanici_adi_label18.setFont(new java.awt.Font("Noto Sans UI", 0, 18)); // NOI18N
        kullanici_adi_label18.setForeground(new java.awt.Color(0, 0, 0));
        kullanici_adi_label18.setText("Kalkış Tarihi :");
        SeferOzeti_panel.add(kullanici_adi_label18, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 120, -1));

        kullanici_adi_label19.setFont(new java.awt.Font("Noto Sans UI", 0, 18)); // NOI18N
        kullanici_adi_label19.setForeground(new java.awt.Color(0, 0, 0));
        kullanici_adi_label19.setText("Saati :");
        SeferOzeti_panel.add(kullanici_adi_label19, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 60, -1));

        kullanici_adi_label20.setFont(new java.awt.Font("Noto Sans UI", 0, 18)); // NOI18N
        kullanici_adi_label20.setForeground(new java.awt.Color(0, 0, 0));
        kullanici_adi_label20.setText("Koltuğunuz :");
        SeferOzeti_panel.add(kullanici_adi_label20, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        koltuk_adi_goster.setFont(new java.awt.Font("Noto Sans UI", 1, 18)); // NOI18N
        koltuk_adi_goster.setForeground(new java.awt.Color(255, 0, 0));
        koltuk_adi_goster.setText("Koltuğunuz : ");
        SeferOzeti_panel.add(koltuk_adi_goster, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, 30));

        jPanel1.add(SeferOzeti_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 540, 270));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void jRadioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton12ActionPerformed

    private void jRadioButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton13ActionPerformed

    private void jRadioButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton14ActionPerformed

    private void jRadioButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton15ActionPerformed

    private void jRadioButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton16ActionPerformed

    private void jRadioButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton17ActionPerformed

    private void jRadioButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton18ActionPerformed

    private void jRadioButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton19ActionPerformed

    private void jRadioButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton20ActionPerformed

    private void jRadioButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton21ActionPerformed

    private void jRadioButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton22ActionPerformed

    private void jRadioButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton23ActionPerformed

    private void jRadioButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton24ActionPerformed

    private void jRadioButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton25ActionPerformed

    private void jRadioButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton26ActionPerformed

    private void jRadioButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton27ActionPerformed

    private void jRadioButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton28ActionPerformed

    private void jRadioButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton29ActionPerformed

    private void jRadioButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton30ActionPerformed

    private void jRadioButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton31ActionPerformed

    private void jRadioButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton32ActionPerformed

    private void jRadioButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton33ActionPerformed

    private void jRadioButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton34ActionPerformed

    private void jRadioButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton35ActionPerformed

    private void jRadioButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton36ActionPerformed

    private void jRadioButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton37ActionPerformed

    private void jRadioButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton38ActionPerformed

    private void jRadioButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton39ActionPerformed

    private void jRadioButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton40ActionPerformed

    private void jRadioButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton41ActionPerformed

    private void jRadioButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton42ActionPerformed

    private void jRadioButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton43ActionPerformed

    private void jRadioButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton44ActionPerformed

    private void jRadioButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton45ActionPerformed

    private void jRadioButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton46ActionPerformed

    private void jRadioButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton47ActionPerformed

    private void jRadioButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton48ActionPerformed

    private void jRadioButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton49ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton49ActionPerformed

    private void jRadioButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton50ActionPerformed

    private void jRadioButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton51ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton51ActionPerformed

    private void jRadioButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton52ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton52ActionPerformed

    private void jRadioButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton53ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton53ActionPerformed

    private void jRadioButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton54ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton54ActionPerformed

    private void jRadioButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton55ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton55ActionPerformed

    private void jRadioButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton56ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton56ActionPerformed

    private void jRadioButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton57ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton57ActionPerformed

    private void jRadioButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton58ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton58ActionPerformed

    private void jRadioButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton59ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton59ActionPerformed

    private void jRadioButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton60ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton60ActionPerformed

    private void jRadioButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton61ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton61ActionPerformed

    private void jRadioButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton62ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton62ActionPerformed

    private void jRadioButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton63ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton63ActionPerformed

    private void jRadioButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton64ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton64ActionPerformed

    private void jRadioButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton65ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton65ActionPerformed

    private void jRadioButton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton66ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton66ActionPerformed

    private void jRadioButton67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton67ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton67ActionPerformed

    private void jRadioButton68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton68ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton68ActionPerformed

    private void jRadioButton69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton69ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton69ActionPerformed

    private void jRadioButton70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton70ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton70ActionPerformed

    private void jRadioButton71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton71ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton71ActionPerformed

    private void jRadioButton72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton72ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton72ActionPerformed

    private void jRadioButton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton73ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton73ActionPerformed

    private void jRadioButton74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton74ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton74ActionPerformed

    private void jRadioButton75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton75ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton75ActionPerformed

    private void jRadioButton76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton76ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton76ActionPerformed

    private void jRadioButton77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton77ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton77ActionPerformed

    private void jRadioButton78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton78ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton78ActionPerformed

    private void jRadioButton79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton79ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton79ActionPerformed

    private void jRadioButton80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton80ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton80ActionPerformed

    private void jRadioButton81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton81ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton81ActionPerformed

    private void jRadioButton82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton82ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton82ActionPerformed

    private void jRadioButton83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton83ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton83ActionPerformed

    private void jRadioButton84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton84ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton84ActionPerformed

    private void jRadioButton85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton85ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton85ActionPerformed

    private void jRadioButton86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton86ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton86ActionPerformed

    private void jRadioButton87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton87ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton87ActionPerformed

    private void jRadioButton88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton88ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton88ActionPerformed

    private void jRadioButton89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton89ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton89ActionPerformed

    private void jRadioButton90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton90ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton90ActionPerformed

    private void jRadioButton91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton91ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton91ActionPerformed

    private void jRadioButton92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton92ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton92ActionPerformed

    private void jRadioButton93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton93ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton93ActionPerformed

    private void jRadioButton94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton94ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton94ActionPerformed

    private void jRadioButton95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton95ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton95ActionPerformed

    private void jRadioButton96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton96ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton96ActionPerformed

    private void jRadioButton97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton97ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton97ActionPerformed

    private void jRadioButton98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton98ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton98ActionPerformed

    private void jRadioButton99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton99ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton99ActionPerformed

    private void jRadioButton100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton100ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton100ActionPerformed

    private void jRadioButton101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton101ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton101ActionPerformed

    private void jRadioButton102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton102ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton102ActionPerformed

    private void kartin_ustundeki_isimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kartin_ustundeki_isimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kartin_ustundeki_isimActionPerformed

    private void kart_numarasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kart_numarasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kart_numarasiActionPerformed

    private void sonKullanim_yilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sonKullanim_yilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sonKullanim_yilActionPerformed

    private void cvc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cvc2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cvc2ActionPerformed

    private void sonKullanim_ayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sonKullanim_ayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sonKullanim_ayActionPerformed

    private void butonlarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butonlarMouseClicked


    }//GEN-LAST:event_butonlarMouseClicked

    private void perde_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perde_butonActionPerformed

        KoltukYazdir(evt);

        SonSeferBilgisiGoruntule();

        perde.setVisible(false);

        perde_buton.setVisible(false);

        lutfen_koltuk_seciniz_seprator.setVisible(false);

        lutfen_koltuk_seciniz_tb.setVisible(false);

        SeferOzeti_panel.setVisible(true);
        
        ucakGuncelle(koltukAdi);

    }//GEN-LAST:event_perde_butonActionPerformed

    private void bilet_al_buton_sonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bilet_al_buton_sonActionPerformed
        
        
        if (kartin_ustundeki_isim.getText().equals("") || kart_numarasi.getText().equals("") || sonKullanim_ay.getText().equals("") || 
                sonKullanim_yil.getText().equals("") || cvc2.getText().equals("")) {
            
            JOptionPane.showMessageDialog(this, "Lütfen Kart Bilgilerini Eksiksiz Giriniz");
            
        }else{
            biletEkle();
            
            JOptionPane.showMessageDialog(this, "Bilet başarılı bir şekilde alındı. ");
            setVisible(false);
        }
        
        
        
        
        
    }//GEN-LAST:event_bilet_al_buton_sonActionPerformed

    public void ucakGuncelle(String koltukAdi) {

        for (Enumeration<AbstractButton> butonlar = buttonGroup1.getElements(); butonlar.hasMoreElements();) {

            AbstractButton buton = butonlar.nextElement();

            if (buton.getActionCommand().equals(koltukAdi)) {
                buton.setVisible(false);
            }
        }
    }

    public void KoltukYazdir(ActionEvent e) {

        koltuk_adi_goster.setText(buttonGroup1.getSelection().getActionCommand());

        koltukAdi = buttonGroup1.getSelection().getActionCommand();

        System.out.println("Selected Radio Button: " + buttonGroup1.getSelection().getActionCommand());

    }
    
    public void biletEkle(){
        
        biletislemleri.yeniBiletEkle(ucakid,uyeid,koltukAdi);
        System.out.println("Bilet eklendi");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SeferOzeti_panel;
    private javax.swing.JButton bilet_al_buton_son;
    private javax.swing.JPanel butonlar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cvc2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton100;
    private javax.swing.JRadioButton jRadioButton101;
    private javax.swing.JRadioButton jRadioButton102;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton27;
    private javax.swing.JRadioButton jRadioButton28;
    private javax.swing.JRadioButton jRadioButton29;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton30;
    private javax.swing.JRadioButton jRadioButton31;
    private javax.swing.JRadioButton jRadioButton32;
    private javax.swing.JRadioButton jRadioButton33;
    private javax.swing.JRadioButton jRadioButton34;
    private javax.swing.JRadioButton jRadioButton35;
    private javax.swing.JRadioButton jRadioButton36;
    private javax.swing.JRadioButton jRadioButton37;
    private javax.swing.JRadioButton jRadioButton38;
    private javax.swing.JRadioButton jRadioButton39;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton40;
    private javax.swing.JRadioButton jRadioButton41;
    private javax.swing.JRadioButton jRadioButton42;
    private javax.swing.JRadioButton jRadioButton43;
    private javax.swing.JRadioButton jRadioButton44;
    private javax.swing.JRadioButton jRadioButton45;
    private javax.swing.JRadioButton jRadioButton46;
    private javax.swing.JRadioButton jRadioButton47;
    private javax.swing.JRadioButton jRadioButton48;
    private javax.swing.JRadioButton jRadioButton49;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton50;
    private javax.swing.JRadioButton jRadioButton51;
    private javax.swing.JRadioButton jRadioButton52;
    private javax.swing.JRadioButton jRadioButton53;
    private javax.swing.JRadioButton jRadioButton54;
    private javax.swing.JRadioButton jRadioButton55;
    private javax.swing.JRadioButton jRadioButton56;
    private javax.swing.JRadioButton jRadioButton57;
    private javax.swing.JRadioButton jRadioButton58;
    private javax.swing.JRadioButton jRadioButton59;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton60;
    private javax.swing.JRadioButton jRadioButton61;
    private javax.swing.JRadioButton jRadioButton62;
    private javax.swing.JRadioButton jRadioButton63;
    private javax.swing.JRadioButton jRadioButton64;
    private javax.swing.JRadioButton jRadioButton65;
    private javax.swing.JRadioButton jRadioButton66;
    private javax.swing.JRadioButton jRadioButton67;
    private javax.swing.JRadioButton jRadioButton68;
    private javax.swing.JRadioButton jRadioButton69;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton70;
    private javax.swing.JRadioButton jRadioButton71;
    private javax.swing.JRadioButton jRadioButton72;
    private javax.swing.JRadioButton jRadioButton73;
    private javax.swing.JRadioButton jRadioButton74;
    private javax.swing.JRadioButton jRadioButton75;
    private javax.swing.JRadioButton jRadioButton76;
    private javax.swing.JRadioButton jRadioButton77;
    private javax.swing.JRadioButton jRadioButton78;
    private javax.swing.JRadioButton jRadioButton79;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton80;
    private javax.swing.JRadioButton jRadioButton81;
    private javax.swing.JRadioButton jRadioButton82;
    private javax.swing.JRadioButton jRadioButton83;
    private javax.swing.JRadioButton jRadioButton84;
    private javax.swing.JRadioButton jRadioButton85;
    private javax.swing.JRadioButton jRadioButton86;
    private javax.swing.JRadioButton jRadioButton87;
    private javax.swing.JRadioButton jRadioButton88;
    private javax.swing.JRadioButton jRadioButton89;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JRadioButton jRadioButton90;
    private javax.swing.JRadioButton jRadioButton91;
    private javax.swing.JRadioButton jRadioButton92;
    private javax.swing.JRadioButton jRadioButton93;
    private javax.swing.JRadioButton jRadioButton94;
    private javax.swing.JRadioButton jRadioButton95;
    private javax.swing.JRadioButton jRadioButton96;
    private javax.swing.JRadioButton jRadioButton97;
    private javax.swing.JRadioButton jRadioButton98;
    private javax.swing.JRadioButton jRadioButton99;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel kalkisSaati_tb;
    private javax.swing.JLabel kalkısTarihi_tb;
    private javax.swing.JLabel kalkıs_tb;
    private javax.swing.JTextField kart_numarasi;
    private javax.swing.JTextField kartin_ustundeki_isim;
    private javax.swing.JLabel koltuk_adi_goster;
    private javax.swing.JLabel kullanici_adi_label1;
    private javax.swing.JLabel kullanici_adi_label10;
    private javax.swing.JLabel kullanici_adi_label15;
    private javax.swing.JLabel kullanici_adi_label16;
    private javax.swing.JLabel kullanici_adi_label18;
    private javax.swing.JLabel kullanici_adi_label19;
    private javax.swing.JLabel kullanici_adi_label2;
    private javax.swing.JLabel kullanici_adi_label20;
    private javax.swing.JLabel kullanici_adi_label3;
    private javax.swing.JLabel kullanici_adi_label4;
    private javax.swing.JLabel kullanici_adi_label5;
    private javax.swing.JLabel kullanici_adi_label7;
    private javax.swing.JLabel kullanici_adi_label8;
    private javax.swing.JLabel kullanici_adi_label9;
    private javax.swing.JSeparator lutfen_koltuk_seciniz_seprator;
    private javax.swing.JLabel lutfen_koltuk_seciniz_tb;
    private javax.swing.JPanel perde;
    private javax.swing.JButton perde_buton;
    private javax.swing.JTextField sonKullanim_ay;
    private javax.swing.JTextField sonKullanim_yil;
    private javax.swing.JLabel ucakAdı_tb;
    private javax.swing.JLabel ucakIci;
    private javax.swing.JLabel uyari_yazisi;
    private javax.swing.JLabel varis_tb;
    // End of variables declaration//GEN-END:variables
}
