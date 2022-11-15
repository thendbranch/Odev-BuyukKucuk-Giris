// https://app.patika.dev/
// https://app.patika.dev/thendbranch

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Java ile klavyeden girilen N tane sayma sayısından
        en büyük ve en küçük sayıları bulan ve
        bu sayıları ekrana yazan programı yazın.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç Sayı Gireceksiniz : ");
        int gSayi = input.nextInt();
        int min = 1;
        int max = 1;
        int a;

        for (int i = 1; i <= gSayi ; i++) {
            System.out.print(i + ". Sayı Giriniz : ");
            a = input.nextInt();

            if (i == 1){
                max = a;
                min = a;
            }

            if (a>max){
                max=a;
            } else if (a<min) {
                min=a;
            }
        }
        System.out.println("En Büyük Sayı : " + max);
        System.out.println("En Küçük Sayı : " + min);
    }
}