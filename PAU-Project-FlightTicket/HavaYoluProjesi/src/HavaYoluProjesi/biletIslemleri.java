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

public class biletIslemleri {

    private Connection con = null;

    private Statement statement = null;

    private PreparedStatement preparedStatement = null;

    public biletIslemleri() {

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

    public void yeniBiletEkle(int ucakidi, int uyeid, String koltukid) {

        String sorgu = "INSERT INTO biletler (ucakid, uyeid, koltukid) VALUES (?,?,?)";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setInt(1, ucakidi);
            preparedStatement.setInt(2, uyeid);
            preparedStatement.setString(3, koltukid);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(biletIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<Ucak> KullaniciArayuzuIcin_biletleriGoster(int uyeid) {

        ArrayList<Ucak> biletleriGoster = new ArrayList<>();
        
        try {
            statement = con.createStatement();
            
            String sorgu =  "SELECT * FROM ucaklar WHERE id = (SELECT ucakid FROM biletler WHERE uyeid = '" +uyeid+ "')" ;
            
            System.out.println(uyeid+ " sadasdasdasdasdasdasdasdas");
            
            //String sorgu =  "SELECT * FROM ucaklar WHERE id = (SELECT ucakid FROM biletler WHERE uyeid = (SELECT id FROM uyeler WHERE id = '" +uyeid+ "'))" ;
            
            


                System.out.println(sorgu);
            //String sorgu = "SELECT * FROM ucaklar WHERE id = (SELECT id FROM biletler WHERE uyeid = (SELECT id FROM uyeler WHERE = " + "'" + uyeid + "'" +"))";
            //SELECT * FROM ucaklar WHERE id = (SELECT ucakid FROM biletler WHERE uyeid = (SELECT id FROM uyeler WHERE = 'uyeid'))
            //String sorgu = "SELECT * FROM ucaklar WHERE id =" + "\'" + uyeid + "\'";
            ResultSet rs;
            rs = statement.executeQuery(sorgu);
            
            System.out.println("salammmmmmmmmm");
            
            
            while (rs.next()) {
                int id = rs.getInt("id");
                String UcakAdi = rs.getString("UcakAdi");
                String saat = rs.getString("saat");
                String tarih = rs.getString("tarih");
                String nerdenn = rs.getString("nerden");
                String nereyee = rs.getString("nereye");

                biletleriGoster.add(new Ucak(id, UcakAdi, saat, tarih, nerdenn, nereyee));
            }
            return biletleriGoster;

        } catch (SQLException ex) {
            Logger.getLogger(Temelislemler.class.getName()).log(Level.SEVERE, null, ex);

            return null;
        }
    }
}
