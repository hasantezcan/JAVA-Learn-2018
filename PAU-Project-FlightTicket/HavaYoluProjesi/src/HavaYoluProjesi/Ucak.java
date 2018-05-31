package HavaYoluProjesi;

public class Ucak {
    
    private int id;
    private String UcakAdi;
    private String saat;
    private String tarih;
    private String nerden;
    private String nereye;

    public Ucak(int id, String UcakAdi, String saat, String tarih, String nerden, String nereye) {
        this.id = id;
        this.UcakAdi = UcakAdi;
        this.saat = saat;
        this.tarih = tarih;
        this.nerden = nerden;
        this.nereye = nereye;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUcakAdi() {
        return UcakAdi;
    }

    public void setUcakAdi(String UcakAdi) {
        this.UcakAdi = UcakAdi;
    }

    public String getSaat() {
        return saat;
    }

    public void setSaat(String saat) {
        this.saat = saat;
    }

    public String getNerden() {
        return nerden;
    }

    public void setNerden(String nerden) {
        this.nerden = nerden;
    }

    public String getNereye() {
        return nereye;
    }

    public void setNereye(String nereye) {
        this.nereye = nereye;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }
    
    
}
