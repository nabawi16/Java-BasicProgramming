import java.util.Scanner;

public class menghitungRatarataBilangan {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("masukan list bilangan, pisahkan dengan tanda koma. contoh: 1,2,3,dst : ");
        String inputan =  myObj.nextLine();
        String[] list_angka = inputan.split(",");
        System.out.println(list_angka);

        int n = list_angka.length;
        float jumlah = 0;
        for (String i : list_angka) {
            float angka = Float.parseFloat(i);
            jumlah = jumlah + angka;
            System.out.println(i);
        }

        System.out.println("Rata-rata dari bilangan diatas " + jumlah / n);
    }
}
