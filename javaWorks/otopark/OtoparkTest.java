package otopark;

import java.util.Scanner;

public class OtoparkTest {

    public static void main(String[] args) {
        // Arac[] arabalar;
        Scanner scan = new Scanner(System.in);

        Otopark o1 = new Otopark(20, 5);

       
       

        System.out.println("UCUZDUR OTOPARK'A HOŞGELDİNİZ\n-------------------------");
        
        boolean flag = false;
        while (!flag) {
            

            System.out.println("\nMENU");
            System.out.println("-----------");
            System.out.println("1-Araba Kabul\n"
                    + "2-Araba Çıkart\n"
                    + "3-Toplam Hasılatı Gör\n"
                    + "4-Anlık Araba Sayısı\n"
                    + "5-Anlık Araba Bilgisi\n"
                    + "9-ÇIKIŞ");

            int choice = scan.nextInt();

            if (choice == 1) {
                o1.AracKabul();
            }

            if (choice == 2) {
                o1.AracCıkıs();
            }

            if (choice == 3) {
                System.out.println("\nToplam Kazaç = " + o1.toplamKazanc+"\n");
            }
            
            if (choice == 4) {
                System.out.println("Anlık Araba Sayısı = "+o1.getAnlikArabaSayisi());
            }
            
            if (choice == 5) {
                o1.AnlıkAracBilgisi();
            }
        }

    }

}
