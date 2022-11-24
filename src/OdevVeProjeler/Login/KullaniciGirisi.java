package OdevVeProjeler.Login;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userNameInp, userName = "patika", passwordInp, password = "java123", yeniSifre, sifirla, sifreTekrar;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userNameInp = inp.nextLine();
        System.out.print("Şifreniz: ");
        passwordInp = inp.nextLine();

        if (userNameInp.equals(userName) && passwordInp.equals(password)) {
            System.out.println("Giriş yaptınız.");
        } else {
            System.out.println("Bilgileriniz yanlış! Yeni şifre oluşturmak ister misiniz?");
            System.out.print("Seçiminizi yapınız (Evet/Hayır): ");
            sifirla = inp.nextLine();
            if (sifirla.equals("Evet")) {
                System.out.println("Yeni şifre eski şifreden farklı olmalıdır!");
                System.out.print("Yeni şifreyi giriniz: ");
                yeniSifre = inp.nextLine();
                if (yeniSifre.equals(password)) {
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz: ");
                    sifreTekrar = inp.nextLine();
                    if (sifreTekrar.equals(password)) {
                        System.out.println("Çok fazla yanlış deneme yaptınız!\n" +
                                "Güvenliğiniz için hesabınız askıya alınmıştır.\n" +
                                "Lütfen müşteri hizmetleriyle iletişime geçiniz.");
                    } else {
                        System.out.println("Şifre başarıyla oluşturuldu.");
                    }
                } else {
                    System.out.println("Şifre başarıyla oluşturuldu.");
                }
            } else {
                System.out.println("Giriş bilgilerinizi ihtiyaç duyduğunuzda yine bu sayfa üzerinden değiştirebilirsiniz.\n" +
                        "İyi günler dileriz.");
            }
        }
    }
}
