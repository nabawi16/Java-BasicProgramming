import java.util.Scanner;

public class kelilingPersegiPanjang {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int panjang, lebar, keliling;

        System.out.println("========KELILING PERSEGI PANJANG========");
        System.out.println("----------------------------------------");

        System.out.print("Masukan Panjang          : ");
        panjang=input.nextInt();
        System.out.print("Masukan Lebar            : ");
        lebar=input.nextInt();

        keliling=2*(panjang+lebar);

        System.out.println("Keliling Persegi Panjang : "+keliling);
    }
}
