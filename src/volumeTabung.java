import java.util.Scanner;

public class volumeTabung {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        double r, t, volume;
        double phi = Math.PI;

        System.out.println("========VOLUME TABUNG========");
        System.out.println("-----------------------------");

        System.out.print("Masukan Alas   : ");
        r=input.nextDouble();
        System.out.print("Masukan Tinggi : ");
        t=input.nextDouble();

        volume = (phi * Math.pow(r, 2) *t);
        System.out.println("Volume Tabung  : "+volume);
    }
}
