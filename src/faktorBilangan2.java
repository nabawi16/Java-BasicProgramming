import java.util.Scanner;

public class faktorBilangan2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System. in );
        System.out.println("Masukkan angka :");
        int nilai = a.nextInt();
        System.out.println("Faktor-faktornya :");
        int tambah = 0;
        for (int z = nilai; z >= 1; z--) {
            tambah--;
            if (nilai % z == 0) {
                System.out.print(z
                        + " ");
            }
        }
    }
}
