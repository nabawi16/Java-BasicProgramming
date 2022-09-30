import java.util.Scanner;

public class kelilingPersegi {
    public static void main(String[] args) {
        int sisi, keliling;

        System.out.println("========KELILING PERSEGI========");
        System.out.println("--------------------------------");

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan persegi : ");
        sisi = scan.nextInt();
        keliling = sisi * sisi;
        System.out.println("Keliling Persegi : " + keliling);
    }
}
