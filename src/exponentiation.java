import java.util.Scanner;

public class exponentiation {
    public static void main(String[] args) {
        int hasil = 1;
        int angka, pangkat;

        Scanner a=new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        angka=a.nextInt();

        System.out.print("Masukkan pangkat: ");
        Scanner b=new Scanner(System.in);
        pangkat=b.nextInt();

        for(int i=1;i<=pangkat;i++){
            hasil=hasil*angka;
        }
        System.out.println( "Hasil "+angka+" pangkat "+pangkat+" = " +hasil);
    }
}
