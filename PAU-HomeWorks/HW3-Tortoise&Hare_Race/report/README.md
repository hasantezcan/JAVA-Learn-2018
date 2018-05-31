## Ödev 3 - Rapor

 *Hasan Tezcan* - *17253046*

---

### 1 - Program başlangıçı

 ![resim 1](resimler/1)

- Program başlangıçında bizden tavşan ve kaplumbağa sayılarını istiyor.


 ![resim 2](resimler/2)

- Değerler alındıkdan sonra yarışımız başlıyor ve çıktımız bu şekilde ekrana basılıyor.

 Bu yarışta **3.tavşan** yarışı kazanmış.


![kaplumbağa kazandı](resimler/5)

- Bu yarışta ise **1.kaplumbağa** yarışı kazanmış.

**Beraberlik** durumundan söz edicek olursak.

![Beraberlik durumu 1](resimler/3)

![Beraberlik durumu 2](resimler/4)

- Ekran çıktısında da gözüktüğü üzere; 66 kaplummbağa ve 55 tavşan girdiğimizde 3.tavşanın ve 5. tavşanın **berabere geldiğini** görüyoruz.

![resim 6](resimler/6)

- Beraberlik durumunun kodu da bu şekilde.

## 2 - Tavaşan ve Kaplumbağa Classları

- Her iki classda da **MOVE** ve **PRINT** adlı iki metod bulunmakta.

![resim 7](resimler/7)

- **MOVE** metodu içinde hayvanların **hareket şartları** belirtilmekte. Bu ekran görüntüsünde **tavşan** hayvanının hareket şartlarını görüyoruz.

![resim 9](resimler/9)

- Kaplumbağanın MOVE methodu.

![resim 8](resimler/8)

- **PRINT** metodun da ise yarışı histogram şeklinde göstermemiz için gerekli olan yazma kısmı mevcud.

## Homework_3 Classı (aslında daha iyi bir isim koyulabilirdi :D)

- Bu classda da iki adet metodumuz bulunmakta **Start** ve **WhoIsTheWinner**

**Start Methodu :**

![resim 10](resimler/10)

![resim 11](resimler/11)

- **Yarış** işlemi burada gerçekleştiriliyor.

**WhoIsTheWinner Methodu:**

![resim 12](resimler/12)

 - Berabere kalma durumu yoksa bu kısımda tavşan mı yoksa kam mı kazandı onu görüyoruz.


 ![resim 13](resimler/13)

 - Burda ise raporun başında da bahsettiğim üzere **beraberlik** durmunu ve bu durumun çıktısını nasıl yazdırdığımı görüyorsunuz.

## Main Classı

![resim 14](resimler/14)

- Bu kısımda sadece **Start methodu** çağırılıyor.
