import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
int kılo;
double boy;
       Scanner inp= new Scanner(System.in);
        System.out.print("Lütfen boyunuzu(metre cinsinden) giriniz: ");
        boy=inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kılo=inp.nextInt();
        double vkı=kılo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz:"+vkı);
    }
}
