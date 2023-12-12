import java.util.Scanner;

public class Sifre {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String kullaniciAdi,sifre;

        System.out.print("Kullanici Adinizi Giriniz : ");
        kullaniciAdi = scanner.nextLine();
        System.out.print("Sifrenizi Giriniz : ");
        sifre = scanner.nextLine();

        if(kullaniciAdi.equals("Cannerg") && sifre.equals("12345"))
        {
            System.out.print("Basarili bir sekilde giris yaptiniz !");
        }else{
            System.out.println("Kullanici adi veya Sifre hatali. Sifirlamak ister misiniz (Evet/Hayir)");
            String cevap;
            cevap = scanner.nextLine();
            if(cevap.equals("Evet"))
            {   
                System.out.print("Yeni Kullanici Adinizi Giriniz : ");
                String yeniKullaniciAdi;
                yeniKullaniciAdi = scanner.nextLine();

                System.out.print("Yeni sifrenizi giriniz : ");
                String yeniSifre;
                yeniSifre = scanner.nextLine();
                if(!yeniSifre.equals(sifre) && !yeniKullaniciAdi.equals(kullaniciAdi))
                {
                    System.out.println("Yeni giris bilgileriniz olusturulmustur.");
                }

            }else
            {
                System.out.println("Yeni bilgi girmeyi tercih etmediniz.");
            }

        }
        
        
    
    
    
    
    scanner.close();
    
    }
}
