import java.util.Scanner;

public class basitSifreKontrol {
    public static void main(String[] args) {
   

        // şifre kontrol

        boolean sifreKontrol = false;
        Scanner scan = new Scanner(System.in);

        while (!sifreKontrol) {
            System.out.print("şifre giriniz:");
            int sifre;
            sifre = scan.nextInt();
            if (sifre == 123) {
                System.out.println("şifre doğru");
                sifreKontrol = true;
            } else {
                System.out.println("yanlış şifre");
            }

        }


    }
}


