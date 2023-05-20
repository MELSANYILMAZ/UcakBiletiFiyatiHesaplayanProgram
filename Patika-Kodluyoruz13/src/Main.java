import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafe, yas, secim;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen mesafeyi giriniz: ");
        mesafe = input.nextInt();
        System.out.print("Lütfen yaşınızı giriniz: ");
        yas = input.nextInt();
        System.out.println("1. Tek yön");
        System.out.println("2. Gidiş dönüş");
        System.out.print("Seçiminizi yapın (1 veya 2): ");
        secim = input.nextInt();
        double birimFiyati = 0.10;
        double birimFiyati = 0.10;
        double birimFiyati = 0.10;
        double birimFiyati = 0.10;
        double normalFiyat = mesafe * birimFiyati;
        double indirimOrani = 0.0;

        if (mesafe > 0 && yas > 0) { // Geçerli girdilerin kontrolü
            if (yas < 12) { // Yaşa göre indirim kontrolü
                indirimOrani = 0.5;
            } else if (yas >= 12 && yas < 24) {
                indirimOrani = 0.1;
            } else if (yas >= 65) {
                indirimOrani = 0.3;
            }

            if (secim == 2) { // Yolculuk tipine göre indirim kontrolü
                indirimOrani += 0.2;
            }

            double indirimMiktari = normalFiyat * indirimOrani; // İndirim miktarını hesapla
            double indirimliFiyat = normalFiyat - indirimMiktari; // İndirimli fiyatı hesapla

            if (indirimOrani > 0) { // İndirim uygulanan durum
                System.out.println("Kişiye %" + (int) (indirimOrani * 100) + " indirim uygulandı.");
                System.out.println("İndirimli bilet fiyatı: " + indirimliFiyat);
            } else { // İndirim uygulanmayan durum
                System.out.println("İndirim uygulanmadı. Bilet fiyatı: " + normalFiyat);
            }
        } else { // Geçersiz girdi durumu
            System.out.println("Geçersiz bir seçim yaptınız.");
        }
    }
}
