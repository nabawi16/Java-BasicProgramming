import java.util.Scanner;

public class kelilingSegitiga {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a, t;
        double keliling;

        System.out.println("========KELILING SEGITIGA========");
        System.out.println("---------------------------------");

        System.out.print("Masukan Alas       : ");
        a=input.nextInt();
        System.out.print("Masukan Tinggi     : ");
        t=input.nextInt();

        keliling=a*t;
        System.out.println("Keliling Segitiga  : "+keliling);
    }
}
