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

public class uyeIslemleri {

    private Connection con = null;

    private Statement statement = null;

    private PreparedStatement preparedStatement = null;

    public uyeIslemleri() {  //Constructor..

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

    public ArrayList<uyeler> uyeleriGetir() {  // UCAKLARI GETİR METHODU....

        ArrayList<uyeler> cikti = new ArrayList<uyeler>();

        try {
            statement = con.createStatement();
            String sorgu = "Select * From uyeler";

            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                int id = rs.getInt("id");
                String adı = rs.getString("ad");
                String soyadı = rs.getString("soyad");
                String parola = rs.getString("parola");
                String email = rs.getString("email");
                String cinsiyet = rs.getString("cinsiyet");
                String dogumTarihi = rs.getString("dogumTarihi");

                cikti.add(new uyeler(id, adı, soyadı, parola, email, cinsiyet, dogumTarihi));

            }
            return cikti;

        } catch (SQLException ex) {
            Logger.getLogger(UcakIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public void uyeGuncelle(int id, String ad, String soyad, String parola, String email, String cinsiyet, String dogumTarihi) {

        //String sorgu = "Update calisanlar set ad = ? , soyad = ? , departman = ? , maas = ? where id = ?";
        String sorgu = "Update uyeler set id = ?, ad = ?, soyad = ?, parola = ?, email = ?, cinsiyet = ?, dogumTarihi = ? where id = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, ad);
            preparedStatement.setString(3, soyad);
            preparedStatement.setString(4, parola);
            preparedStatement.setString(5, email);
            preparedStatement.setString(6, cinsiyet);
            preparedStatement.setString(7, dogumTarihi);
            preparedStatement.setInt(8, id);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(UcakIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Üye ekranı güncellenmedi");
        }

    }
    
    public void uyeSil(int id){
        
        String sorgu = "Delete from uyeler where id = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(UcakIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
