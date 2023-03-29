import java.util.Scanner;

public class NotOrtHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, turkce, fizik, kimya, muzik;

        System.out.print("Matematik notunuz :");
        mat = input.nextInt();

        System.out.print("Beden notunuz :");
        turkce = input.nextInt();

        System.out.print("Fizik notunuz :");
        fizik = input.nextInt();

        System.out.print("Tarih notunuz :");
        kimya = input.nextInt();

        System.out.print("Muzik notunuz :");
        muzik = input.nextInt();

        if (mat < 0 || mat > 100) {
            mat = 0;
        } else {
            mat = mat;
        }
        if (fizik < 0 || fizik > 100) {
            fizik = 0;
        } else {
            fizik = fizik;
        }
        if (turkce < 0 || turkce > 100) {
            turkce = 0;
        } else {
            turkce = turkce;
        }
        if (kimya < 0 || kimya > 100) {
            kimya = 0;
        } else {
            kimya = kimya;
        }
        if (muzik < 0 || muzik > 100) {
            muzik = 0;
        } else {
            muzik = muzik;
        }

        double avarage = (mat + turkce + kimya + fizik + muzik)/5;
        System.out.println("Ortalamanız:" + avarage);
        if (avarage>55){
            System.out.println("Tebrikler, Sınıfı Geçtiniz.");
        }else {
            System.out.println("Üzgünüz Sınıfta kaldınız.");
        }



    }
}
