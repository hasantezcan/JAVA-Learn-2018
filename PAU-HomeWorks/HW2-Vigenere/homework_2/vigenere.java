
package homework_2;


public class vigenere {
    
    private String alfabe = "";
    private String anahtar = "";
    private String girdi = "";
    private String cikti = "";

    public vigenere() {  
        
    }
    
    public vigenere(String alfabe,String anahtar,String girdi) {
        
        this.alfabe=alfabe;
        this.anahtar=anahtar;
        this.girdi=girdi;
        
    }
    
   
    public String getAlfabe() {
        return alfabe;
    }

    public void setAlfabe(String alfabe) {
        this.alfabe = alfabe;
    }

    public String getAnahtar() {
        return anahtar;
    }

    public void setAnahtar(String anahtar) {
        this.anahtar = anahtar;
    }

    public String getGirdi() {
        return girdi;
    }

    public void setGirdi(String girdi) {
        this.girdi = girdi;
    }

    public String getCikti() {
        return cikti;
    }

    public void setCikti(String cikti) {
        this.cikti = cikti;
    }
    
    
    
    
    
    
    
    
            
            
    
    
}
