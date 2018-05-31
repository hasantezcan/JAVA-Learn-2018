package HavaYoluProjesi;


public class uyeler {
    
    private int id;
    private String ad;
    private String soyad;
    private String parola;
    private String email;
    private String cinsiyet;
    private String dogumTarihi;
    private String EvAdresi;
    private String IsAdresi;
    private String TC;

    public uyeler(int id,String ad, String soyad, String parola, String email, String cinsiyet, String dogumTarihi, String EvAdresi, String IsAdresi, String TC) {
        this.id =id;
        this.ad = ad;
        this.soyad = soyad;
        this.parola = parola;
        this.email = email;
        this.cinsiyet = cinsiyet;
        this.dogumTarihi = dogumTarihi;
        this.EvAdresi = EvAdresi;
        this.IsAdresi = IsAdresi;
        this.TC = TC;
    }
    
    public uyeler(int id,String ad, String soyad, String parola, String email, String cinsiyet, String dogumTarihi){
        this.id =id;
        this.ad = ad;
        this.soyad = soyad;
        this.parola = parola;
        this.email = email;
        this.cinsiyet = cinsiyet;
        this.dogumTarihi = dogumTarihi;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public String getEvAdresi() {
        return EvAdresi;
    }

    public void setEvAdresi(String EvAdresi) {
        this.EvAdresi = EvAdresi;
    }

    public String getIsAdresi() {
        return IsAdresi;
    }

    public void setIsAdresi(String IsAdresi) {
        this.IsAdresi = IsAdresi;
    }

    public String getTC() {
        return TC;
    }

    public void setTC(String TC) {
        this.TC = TC;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
            
    
    
}
