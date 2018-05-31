package HavaYoluProjesi;

import HavaYoluProjesi.Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UcakIslemleri {

    private Connection con = null;

    private Statement statement = null;

    private PreparedStatement preparedStatement = null;

    public UcakIslemleri() {  //Constructor..

        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.dbIsmi + "?useUnicode=true&characterEncoding=utf8&verifyServerCertificate=false&useSSL=true"; // kodumuzu güvence altına alak için 

        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException ex) {
            System.out.println("Driver bulunamadı");
        }

        try {
            con = DriverManager.getConnection(url, Database.kullaniciAdi, Database.parola);

            System.out.println("Bağlantı başarılı...");

        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
            //ex.printStackTrace();
        }

    }

    public void yeniUcakEkle(String UcakAdi, String nerden, String nereye, String saat, String tarih) {

        String sorgu = "Insert Into ucaklar (UcakAdi,saat,tarih,nerden,nereye) VALUES (?,?,?,?,?)";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, UcakAdi);
            preparedStatement.setString(2, saat);
            preparedStatement.setString(3, tarih);
            preparedStatement.setString(4, nerden);
            preparedStatement.setString(5, nereye);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(UcakIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void ucakGuncelle(int id, String UcakAdi, String saat, String tarih, String nerden, String nereye) {

        //String sorgu = "Update calisanlar set ad = ? , soyad = ? , departman = ? , maas = ? where id = ?";
        String sorgu = "Update ucaklar set UcakAdi = ?, saat = ?, tarih = ?, nerden = ?, nereye = ? where id = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, UcakAdi);
            preparedStatement.setString(2, saat);
            preparedStatement.setString(3, tarih);
            preparedStatement.setString(4, nerden);
            preparedStatement.setString(5, nereye);
            preparedStatement.setInt(6, id);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(UcakIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("YETERRRRRR LAAAA \n\n\n\n\n\n\n Yetrrrr laaaaa");
        }

    }

    public void ucakSil(int id) {

        String sorgu = "Delete from ucaklar where id = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(UcakIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<Ucak> ucaklariGetir() {  // UCAKLARI GETİR METHODU....

        ArrayList<Ucak> cikti = new ArrayList<Ucak>();

        try {
            statement = con.createStatement();
            String sorgu = "Select * From ucaklar";

            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                int id = rs.getInt("id");
                String UcakAdi = rs.getString("UcakAdi");
                String saat = rs.getString("saat");
                String tarih = rs.getString("tarih");
                String nerden = rs.getString("nerden");
                String nereye = rs.getString("nereye");

                cikti.add(new Ucak(id, UcakAdi, saat, tarih, nerden, nereye));

            }
            return cikti;

        } catch (SQLException ex) {
            Logger.getLogger(UcakIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public ArrayList<Ucak> KoltukEkraninaGetir(int ucakid) {

        ArrayList<Ucak> KEGdondur = new ArrayList<>();

        try {
            statement = con.createStatement();
            String sorgu = "SELECT * FROM ucaklar WHERE id =" + "\'" + ucakid + "\'";

            ResultSet rs;
            rs = statement.executeQuery(sorgu);
            while (rs.next()) {
                int id = rs.getInt("id");
                String UcakAdi = rs.getString("UcakAdi");
                String saat = rs.getString("saat");
                String tarih = rs.getString("tarih");
                String nerdenn = rs.getString("nerden");
                String nereyee = rs.getString("nereye");

                KEGdondur.add(new Ucak(id, UcakAdi, saat, tarih, nerdenn, nereyee));
            }
            return KEGdondur;

        } catch (SQLException ex) {
            Logger.getLogger(UcakIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }



}
