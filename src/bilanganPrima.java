import java.util.Scanner;

public class bilanganPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil, cek=0;

        System.out.println("BILANGAN PRIMA");
        System.out.print("Masukan Angka : ");
        bil=input.nextInt();

        System.out.println("----------------------------------------------");
        for (int i=2; i<=bil; i++){
            if (bil%i==0){
                cek++;
            }
        }

        if (cek==1){
            System.out.println(bil+" = True");
        }else {
            System.out.println(bil+" = False");
        }
    }
}