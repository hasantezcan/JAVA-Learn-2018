package otopark;

import java.util.Scanner;

public class Otopark {

    Arac[] arac;
    int aracKapasitesi;
    int parkUcreti;
    int toplamKazanc;
    int anlikArabaSayisi = 0;

    public Otopark(int aracKapasitesi, int parkUcreti) {

        this.aracKapasitesi = aracKapasitesi;
        this.parkUcreti = parkUcreti;

        arac = new Arac[aracKapasitesi];
        for (int i = 0; i < aracKapasitesi; i++) {

            arac[i] = new Arac();  // araç kapasitesi kadar boş constructorlı "araç" oluşturuduk. Tüm koltukları bilgi vermeden yaratmış olduk.
        }

    }

    public Otopark(Otopark otopark) { // DEFAULT CONSTRUCTOR...  //OVER LOADEDE ????
        this(otopark.aracKapasitesi, otopark.parkUcreti);
    }

    public void AracKabul() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Araç ekleme ekranı =\n---------------------");

        System.out.print("Arabanın Sahibinin Adı/Soyadı= ");
        String a = scan.next();

        System.out.print("Aracin Plakasi =");
        int b = scan.nextInt();

        arac[anlikArabaSayisi] = new Arac(b, a); //boş constructorlar ile dolu olan araç dizesine dolu araçlar gönderdik.

        anlikArabaSayisi++; //anlık araba sayacını 1 arttırdık.

        System.out.println("\n!! " + a + " adlı kişinin " + b + " plakalı araçı otoparka giriş yaptı.");
    }

    public void AracCıkıs() {
        Scanner scan = new Scanner(System.in);

        Arac a1 = new Arac(); // BOŞ OLAN ARABA !! => öncesinde doldurduğumuz araçlar yerine bu boş constructorlu araçı koyucaz.

        System.out.println("Araç çıkış ekrani =\n--------------------");

        boolean flag = true;
        while (flag) {

            System.out.println("1-Plakaya göre çıkış.");
            System.out.println("2-Araç sahibine göre çıkış.");
            int a = scan.nextInt();

            if (a == 1) {
                System.out.print("Çıkacak aracın plakası= ");
                int plk = scan.nextInt();

                for (int i = 0; i < arac.length; i++) {

                    if (plk == arac[i].getPlaka()) {
                        arac[i] = a1; // DOLU ARABA YERİNE BOŞ ARABAYI KOYDUK !!!
                        anlikArabaSayisi--;
                        toplamKazanc += parkUcreti;

                        System.out.println("!!" + plk + " plakalı araç çıkış yaptı.");

                        flag = false;
                    }
                }

            } else if (a == 2) {
                System.out.print("Araç sahibinin adı= ;");

                String sahip = scan.next();

                for (int i = 0; i < arac.length; i++) {

                    if (sahip.equals(arac[i].getAracSahibi())) {

                        arac[i] = a1;

                        anlikArabaSayisi--;

                        toplamKazanc += parkUcreti;

                        System.out.println("\n!!" + sahip + " adlı müşteri çıkış yaptı.");

                        flag = false;
                    }

                }

            } else {
                System.out.println("Lütfen 1 ya da 2 ye basınız!");
            }
        }
    }

    public void AnlıkAracBilgisi() {
        System.out.println("\n");
        for (Arac arac1 : arac) {
            System.out.println(arac1);
        }
    }

    public int getAnlikArabaSayisi() {
        System.out.println("\n");
        return anlikArabaSayisi;
    }

}
