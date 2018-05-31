package HavaYoluProjesi;


public class KayıtEkranı extends javax.swing.JFrame {

    Temelislemler islemler = new Temelislemler();
    
    public KayıtEkranı() {
        initComponents();
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
        jLabel9 = new javax.swing.JLabel();
        dogum_Gün = new javax.swing.JComboBox<>();
        dogum_Ay = new javax.swing.JComboBox<>();
        dogum_Yil = new javax.swing.JComboBox<>();
        uyari_ekrani = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tc_alani = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        EvAdres_Sehir_Secim = new javax.swing.JComboBox<>();
        EvAdres_Semt = new javax.swing.JTextField();
        EvAdres_Mahalle = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        IsAdres_Sehir_Secim = new javax.swing.JComboBox<>();
        IsAdres_Semt = new javax.swing.JTextField();
        IsAdres_Mahalle = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        sozlesmeOnay = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(487, 200, 0, 0));

        jPanel1.setBackground(new java.awt.Color(47, 54, 64));

        jPanel2.setBackground(new java.awt.Color(245, 246, 250));

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
        jLabel8.setText("* E mail Adresi : ");

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

        jLabel9.setFont(new java.awt.Font("Noto Sans UI", 1, 24)); // NOI18N
        jLabel9.setText("Kayıt Ekranı :");

        dogum_Gün.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dogum_Gün.setToolTipText("faefsdfsfs");
        dogum_Gün.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dogum_GünActionPerformed(evt);
            }
        });

        dogum_Ay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OCAK", "ŞUBAT", "MART", "NİSAN", "MAYIS", "HAZİRAN", "TEMMUZ", "AĞUSTOS", "EYLÜL", "EKİM", "KASIM", "ARALIK" }));
        dogum_Ay.setToolTipText("faefsdfsfs");
        dogum_Ay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dogum_AyActionPerformed(evt);
            }
        });

        dogum_Yil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1929 ", "1930 ", "1931 ", "1932 ", "1933 ", "1934 ", "1935 ", "1936 ", "1937 ", "1938 ", "1939 ", "1940 ", "1941 ", "1942 ", "1943 ", "1944 ", "1945 ", "1946 ", "1947 ", "1948 ", "1949 ", "1950 ", "1951 ", "1952 ", "1953 ", "1954 ", "1955 ", "1956 ", "1957 ", "1958 ", "1959 ", "1960 ", "1961 ", "1962 ", "1963 ", "1964 ", "1965 ", "1966 ", "1967 ", "1968 ", "1969 ", "1970 ", "1971 ", "1972 ", "1973 ", "1974 ", "1975 ", "1976 ", "1977 ", "1978 ", "1979 ", "1980 ", "1981 ", "1982 ", "1983 ", "1984 ", "1985 ", "1986 ", "1987 ", "1988 ", "1989 ", "1990 ", "1991 ", "1992 ", "1993 ", "1994 ", "1995 ", "1996 ", "1997 ", "1998 ", "1999 ", "2000 ", "2001 ", "2002 ", "2003 ", "2004", "2005 ", "2006 ", "2007 ", "2008 ", "2009 ", "2010 ", "2011 ", "2012 ", "2013 ", "2014 ", "2015 ", "2016 ", "2017 ", "2018 ", " ", " ", " " }));
        dogum_Yil.setToolTipText("faefsdfsfs");
        dogum_Yil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dogum_YilActionPerformed(evt);
            }
        });

        uyari_ekrani.setFont(new java.awt.Font("Noto Sans UI", 1, 12)); // NOI18N
        uyari_ekrani.setForeground(new java.awt.Color(255, 0, 0));

        jLabel6.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        jLabel6.setText("Tc : ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(39, 39, 39))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(dogum_Gün, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dogum_Ay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dogum_Yil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cinsiyet_secim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ad_alani)
                                            .addComponent(parola_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(84, 84, 84)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel6))
                                        .addGap(43, 43, 43)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(soyad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tc_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(email_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel9)
                        .addGap(52, 52, 52)
                        .addComponent(uyari_ekrani, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(uyari_ekrani))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(soyad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(parola_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tc_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(email_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cinsiyet_secim, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dogum_Gün, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dogum_Ay, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dogum_Yil, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(245, 246, 250));

        jLabel17.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        jLabel17.setText("Ev Adresi : ");

        EvAdres_Sehir_Secim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seçim yapılmadı", "ADANA", "ADIYAMAN", "AFYON", "AĞRI", "AMASYA", "ANKARA", "ANTALYA", "ARTVIN", "AYDIN", "BALIKESIR", "BILECIK", "BINGÖL", "BITLIS", "BOLU", "BURDUR", "BURSA", "ÇANAKKALE", "ÇANKIRI", "ÇORUM", "DENIZLI", "DIYARBAKIR", "ELAZIĞ", "ERZINCAN", "ERZURUM", "ESKIŞEHIR", "GAZIANTEP", "GIRESUN", "GÜMÜŞHANE", "HAKKARI", "HATAY", "ISPARTA", "MERSIN", "İSTANBUL", "İZMIR", "KARS", "KASTAMONU", "KAYSERI", "KIRKLARELI", "KIRŞEHIR", "KOCAELI", "KONYA", "KÜTAHYA", "MALATYA", "MANISA", "K.MARAŞ", "MARDIN", "MUĞLA", "MUŞ", "NEVŞEHIR", "NIĞDE", "ORDU", "RIZE", "SAKARYA", "SAMSUN", "SIIRT", "SINOP", "SIVAS", "TEKIRDAĞ", "TOKAT", "TRABZON", "TUNCELI", "ŞANLIURFA", "UŞAK", "VAN", "YOZGAT", "ZONGULDAK", "AKSARAY", "BAYBURT", "KARAMAN", "KIRIKKALE", "BATMAN", "ŞIRNAK", "BARTIN", "ARDAHAN", "IĞDIR", "YALOVA", "KARABÜK", "KILIS", "OSMANIYE", "DÜZCE" }));
        EvAdres_Sehir_Secim.setToolTipText("");
        EvAdres_Sehir_Secim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EvAdres_Sehir_SecimActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        jLabel18.setText("Mahalle : ");

        jLabel19.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        jLabel19.setText("Semt : ");

        jLabel20.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        jLabel20.setText("Şehir : ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EvAdres_Mahalle)
                            .addComponent(EvAdres_Sehir_Secim, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EvAdres_Semt, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(EvAdres_Sehir_Secim, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(EvAdres_Semt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(EvAdres_Mahalle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(245, 246, 250));

        IsAdres_Sehir_Secim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seçim yapılmadı", "ADANA", "ADIYAMAN", "AFYON", "AĞRI", "AMASYA", "ANKARA", "ANTALYA", "ARTVIN", "AYDIN", "BALIKESIR", "BILECIK", "BINGÖL", "BITLIS", "BOLU", "BURDUR", "BURSA", "ÇANAKKALE", "ÇANKIRI", "ÇORUM", "DENIZLI", "DIYARBAKIR", "ELAZIĞ", "ERZINCAN", "ERZURUM", "ESKIŞEHIR", "GAZIANTEP", "GIRESUN", "GÜMÜŞHANE", "HAKKARI", "HATAY", "ISPARTA", "MERSIN", "İSTANBUL", "İZMIR", "KARS", "KASTAMONU", "KAYSERI", "KIRKLARELI", "KIRŞEHIR", "KOCAELI", "KONYA", "KÜTAHYA", "MALATYA", "MANISA", "K.MARAŞ", "MARDIN", "MUĞLA", "MUŞ", "NEVŞEHIR", "NIĞDE", "ORDU", "RIZE", "SAKARYA", "SAMSUN", "SIIRT", "SINOP", "SIVAS", "TEKIRDAĞ", "TOKAT", "TRABZON", "TUNCELI", "ŞANLIURFA", "UŞAK", "VAN", "YOZGAT", "ZONGULDAK", "AKSARAY", "BAYBURT", "KARAMAN", "KIRIKKALE", "BATMAN", "ŞIRNAK", "BARTIN", "ARDAHAN", "IĞDIR", "YALOVA", "KARABÜK", "KILIS", "OSMANIYE", "DÜZCE" }));
        IsAdres_Sehir_Secim.setToolTipText("");
        IsAdres_Sehir_Secim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IsAdres_Sehir_SecimActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        jLabel21.setText("Mahalle : ");

        jLabel22.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        jLabel22.setText("Semt : ");

        jLabel23.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        jLabel23.setText("Şehir : ");

        jLabel24.setFont(new java.awt.Font("Noto Sans UI", 1, 14)); // NOI18N
        jLabel24.setText("İş Adresi : ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(IsAdres_Mahalle)
                            .addComponent(IsAdres_Sehir_Secim, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IsAdres_Semt, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(IsAdres_Sehir_Secim, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(IsAdres_Semt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(IsAdres_Mahalle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sozlesmeOnay.setForeground(new java.awt.Color(245, 246, 250));
        sozlesmeOnay.setText("ÖZ PAU JET Üyelik sözleşmesini ve şartlarını okudum ve kabul ediyorum.");

        jButton1.setText("Kayıt Ol");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(sozlesmeOnay, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sozlesmeOnay)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EvAdres_Sehir_SecimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EvAdres_Sehir_SecimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EvAdres_Sehir_SecimActionPerformed

    private void cinsiyet_secimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinsiyet_secimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cinsiyet_secimActionPerformed

    private void parola_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parola_alaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parola_alaniActionPerformed

    private void IsAdres_Sehir_SecimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IsAdres_Sehir_SecimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IsAdres_Sehir_SecimActionPerformed

    private void dogum_GünActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dogum_GünActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dogum_GünActionPerformed

    private void dogum_AyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dogum_AyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dogum_AyActionPerformed

    private void dogum_YilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dogum_YilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dogum_YilActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        uyari_ekrani.setText("");
        
        String ad = ad_alani.getText();
        String soyad = soyad_alani.getText();
        String parola = new String(parola_alani.getPassword());
        String email = email_alani.getText();
        String cinsiyet = (cinsiyet_secim.getSelectedItem()).toString();  // TO STRİNG KULLANDIM PATLARSA BAK!!
       
        String dogumTarihi = dogum_Gün.getSelectedItem() + "/" +dogum_Ay.getSelectedItem() + "/" + dogum_Yil.getSelectedItem();
        
        String evAdresi = EvAdres_Sehir_Secim.getSelectedItem() + ", " + EvAdres_Semt.getText() + ", " + EvAdres_Mahalle.getText();
        String isAdresi = IsAdres_Sehir_Secim.getSelectedItem() + ", " + IsAdres_Semt.getText() + ", " + IsAdres_Mahalle.getText();
        String tc = tc_alani.getText();
        
        if (sozlesmeOnay.isSelected()) {
            islemler.yeniUyeEkle(ad,soyad,parola,email,cinsiyet,dogumTarihi,evAdresi,isAdresi,tc);
            
            uyari_ekrani.setText("Üye başarılı bir şekilde eklendi....");
            
            
        }else{
            uyari_ekrani.setText("Üyelik sözleşmesini kaydetmeden üye olamazsınız... ");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        setVisible(false);

        //KayıtEkranı kayıtEkranı = new KayıtEkranı();
        GirisEkrani girisEkrani = new GirisEkrani();

        girisEkrani.setVisible(true);
        //System.exit(0);
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(KayıtEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KayıtEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KayıtEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KayıtEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KayıtEkranı().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EvAdres_Mahalle;
    private javax.swing.JComboBox<String> EvAdres_Sehir_Secim;
    private javax.swing.JTextField EvAdres_Semt;
    private javax.swing.JTextField IsAdres_Mahalle;
    private javax.swing.JComboBox<String> IsAdres_Sehir_Secim;
    private javax.swing.JTextField IsAdres_Semt;
    private javax.swing.JTextField ad_alani;
    private javax.swing.JComboBox<String> cinsiyet_secim;
    private javax.swing.JComboBox<String> dogum_Ay;
    private javax.swing.JComboBox<String> dogum_Gün;
    private javax.swing.JComboBox<String> dogum_Yil;
    private javax.swing.JTextField email_alani;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField parola_alani;
    private javax.swing.JTextField soyad_alani;
    private javax.swing.JCheckBox sozlesmeOnay;
    private javax.swing.JTextField tc_alani;
    private javax.swing.JLabel uyari_ekrani;
    // End of variables declaration//GEN-END:variables
}
