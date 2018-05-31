package HavaYoluProjesi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Temelislemler {

    private Connection con = null;

    private Statement statement = null;

    private PreparedStatement preparedStatement = null;

    public Temelislemler() {  //Constructor..

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

    public boolean girisYap(String eMail_adi, String parola) {
        String sorgu = "Select * From uyeler where email = ? and parola = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, eMail_adi);
            preparedStatement.setString(2, parola);

            ResultSet rs = preparedStatement.executeQuery();

            return rs.next();

        } catch (SQLException ex) {
            Logger.getLogger(Temelislemler.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public void yeniUyeEkle(String ad, String soyad, String parola, String email, String cinsiyet, String dogumTarihi, String evAdresi, String isAdresi, String tc) {

        String sorgu = "Insert Into uyeler (ad,soyad,parola,email,cinsiyet,dogumTarihi,EvAdresi,IsAdresi,tc) VALUES (?,?,?,?,?,?,?,?,?)";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, parola);
            preparedStatement.setString(4, email);
            preparedStatement.setString(5, cinsiyet);
            preparedStatement.setString(6, dogumTarihi);
            preparedStatement.setString(7, evAdresi);
            preparedStatement.setString(8, isAdresi);
            preparedStatement.setString(9, tc);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Temelislemler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<uyeler> kullaniciBilgisi() {

        ArrayList<uyeler> arraylistUyeler = new ArrayList<uyeler>();

        try {
            statement = con.createStatement();
            String sorgu = "Select * From uyeler";

            ResultSet rs;

            rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                int id =rs.getInt("id");   ///BUNU SONRADAN EKLEDİM 
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String parola = rs.getString("parola");
                String email = rs.getString("email");
                String cinsiyet = rs.getString("cinsiyet");
                String dogumTarihi = rs.getString("dogumTarihi");
                String EvAdresi = rs.getString("EvAdresi");
                String IsAdresi = rs.getString("IsAdresi");
                String TC = rs.getString("TC");

                arraylistUyeler.add(new uyeler(id, ad, soyad, parola, email, cinsiyet, dogumTarihi, EvAdresi, IsAdresi, TC));

            }
            return arraylistUyeler;
        } catch (SQLException ex) {
            Logger.getLogger(Temelislemler.class.getName()).log(Level.SEVERE, null, ex);

            return null;
        }

    }

    public ArrayList<String> nerdenDondur() {

        ArrayList<String> nerdendondur = new ArrayList<>();

        try {
            statement = con.createStatement();
            String sorgu = "Select nerden from ucaklar ";

            ResultSet rs;

            rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                nerdendondur.add(rs.getString("nerden"));

            }
            return nerdendondur;
        } catch (SQLException ex) {
            Logger.getLogger(Temelislemler.class.getName()).log(Level.SEVERE, null, ex);

            return null;
        }

    }

    public ArrayList<String> nereyeDondur() {

        ArrayList<String> nereyedondur = new ArrayList<>();

        try {
            statement = con.createStatement();
            String sorgu = "Select nereye from ucaklar ";

            ResultSet rs;

            rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                nereyedondur.add(rs.getString("nereye"));

            }
            return nereyedondur;
        } catch (SQLException ex) {
            Logger.getLogger(Temelislemler.class.getName()).log(Level.SEVERE, null, ex);

            return null;
        }

    }

    public ArrayList<Ucak> SeferSorgula(String nerden, String nereye, String gidisTarihi) {

        ArrayList<Ucak> seferDondur = new ArrayList<>();

        try {
            statement = con.createStatement();
            String sorgu = "SELECT * FROM ucaklar WHERE nerden= " + "\'" + nerden + "\' and nereye=" + "\'" + nereye + "\' and tarih=" + "\'" + gidisTarihi + "\'";
            //SELECT * FROM musteri WHERE sehir='istanbul'

           
            
            ResultSet rs;
            rs = statement.executeQuery(sorgu);
            while (rs.next()) {
                int id = rs.getInt("id");
                String UcakAdi = rs.getString("UcakAdi");
                String saat = rs.getString("saat");
                String tarih = rs.getString("tarih");
                String nerdenn = rs.getString("nerden");
                String nereyee = rs.getString("nereye");

                seferDondur.add(new Ucak(id, UcakAdi, saat, tarih, nerdenn, nereyee));
            }
            return seferDondur;

        } catch (SQLException ex) {
            Logger.getLogger(Temelislemler.class.getName()).log(Level.SEVERE, null, ex);

            return null;
        }

    }
    
    
    

}
