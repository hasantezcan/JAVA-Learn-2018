package otopark;

public class Arac {

    private int plaka;
    private String aracSahibi;
    
    public Arac(int plaka,String aracSahibi){
        this.plaka = plaka;
        this.aracSahibi = aracSahibi;
    }
    public Arac(){ //BOŞ CONSTRUCTOR ==> öncelikle tüm park yerlerine boş arabaları atıyoruz. Bu boş constructor içi boş olduğu için bu işe yarıyor.
        
    }

    public int getPlaka() {
        return plaka;
    }

    public void setPlaka(int plaka) {
        this.plaka = plaka;
    }

    public String getAracSahibi() {
        return aracSahibi;
    }

    public void setAracSahibi(String aracSahibi) {
        this.aracSahibi = aracSahibi;
    }
    
    
    @Override
    public String toString(){
        return aracSahibi+" "+plaka;
    }
    
    
    
    
    


    
}
