import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int mat,fizik,kimya,biyo,turk;
        int notToplam=0;

        Scanner oku=new Scanner(System.in);
        System.out.println("Not hesaplamaya hos geldiniz.\n\nİsim soyisim giriniz:");
        String isim=oku.nextLine();

        System.out.println("Matematik notunuzu giriniz: ");
        mat=oku.nextInt();
        notToplam+=mat;

        System.out.println("Fizik notunuzu giriniz: ");
        fizik=oku.nextInt();
        notToplam+=fizik;

        System.out.println("Kimya notunuzu giriniz: ");
        kimya=oku.nextInt();
        notToplam+=kimya;

        System.out.println("Biyoloji notunuzu giriniz: ");
        biyo=oku.nextInt();
        notToplam+=biyo;

        System.out.println("Turkce notunuzu giriniz: ");
        turk=oku.nextInt();
        notToplam+=turk;

        System.out.println(isim+ " donem notunuz: "+notToplam/5);





    }
}