
package homework_2;

import java.util.Scanner;


public class Homework_2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        StringBuilder sb = new StringBuilder();
        
        System.out.print("Mesajı giriniz: ");
        String girdi1 = sc.nextLine();
        girdi1=girdi1.toUpperCase();
        
        System.out.print("\nAnahtarı giriniz: ");
        String anahtar1 = sc.nextLine();
        anahtar1=anahtar1.toUpperCase();
        
        vigenere v1 = new vigenere("ABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ",anahtar1,girdi1);
        
 
              for (int i = 0; i < v1.getGirdi().length(); i++) {
                  
                  int ilkolay = v1.getAlfabe().indexOf(v1.getGirdi().charAt(i));
                  
                  int ikinciolay = v1.getAlfabe().indexOf(v1.getAnahtar().charAt(i % v1.getAnahtar().length()));
                  
                  int son = ilkolay+ikinciolay;
                  
                  son = son %v1.getAlfabe().length();
                  
                  sb.append( v1.getAlfabe().charAt(son));
         }

            String selamjava = sb.toString();
            
            System.out.print("\nŞifreli mesajınız = "+selamjava+"\n\n");
            
                 

    
              
        
    }
    
}
