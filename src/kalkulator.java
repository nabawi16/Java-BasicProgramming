import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka1, angka2, operasi ,hasil = 0;
        System.out.println("==============KALKULATOR==============");
        System.out.println("Operasi Perkalian,   Input Angka => 1 ");
        System.out.println("Operasi Pembagian,   Input Angka => 2 ");
        System.out.println("Operasi Penjumlahan, Input Angka => 3 ");
        System.out.println("Operasi Pengurangan, Input Angka => 4 ");
        System.out.println("--------------------------------------");

        System.out.print("Pilih Operasi : ");
        operasi=input.nextInt();
        System.out.println("----------------------- Input");
        System.out.print("Angka Pertama         = ");
        angka1=input.nextInt();
        System.out.print("Angka Kedua           = ");
        angka2=input.nextInt();
        System.out.println("---------------------------");

        switch (operasi){
            case 1 : hasil=angka1*angka2;break;
            case 2 : hasil=angka1/angka2;break;
            case 3 : hasil=angka1+angka2;break;
            case 4 : hasil=angka1-angka2;break;
            default : System.out.println("Input Pilihan Operasi SALAH!");
        }

        System.out.println("Hasil                 = "+hasil);
    }
}
