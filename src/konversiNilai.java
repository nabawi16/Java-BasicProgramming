import java.util.Scanner;

public class konversiNilai {
    public static void main(String[] args) {
        // membuat variabel dan Scanner
        int nilai;
        String studenScore;
        Scanner scan = new Scanner(System.in);

        // input
        System.out.print("Inputkan nilai: ");
        nilai = scan.nextInt();

        // higung gradenya
        if ( nilai > 100 ) {
            studenScore = "Invalid";
        } else if ( nilai >= 90 ){
            studenScore = "A+";
        }else if ( nilai >= 80 ){
            studenScore = "A";
        } else if ( nilai >= 65 ){
            studenScore = "B+";
        } else if ( nilai >= 50 ){
            studenScore = "B";
        } else if ( nilai >= 35 ){
            studenScore = "C";
        } else if ( nilai >= 10 ){
            studenScore = "D";
        } else {
            studenScore = "E";
        }

        // cetak hasilnya
        System.out.println("Nilai Huruf: " + studenScore);

        System.out.println("Keterangan: ");

        // mengambil input
        switch(studenScore){
            case "A+":
                System.out.println("== Sangat Memuaskan ==");
                break;
            case "A":
                System.out.println("== Sangat Baik ==");
                break;
            case "B+":
                System.out.println("== Baik ==");
                break;
            case "B":
                System.out.println("== Cukup Baik ==");
                break;
            case "C":
                System.out.println("== Cukup ==");
                break;
            case "D":
                System.out.println("== Buruk ==");
                break;
            case "E":
                System.out.println("== Mahasiswa Abadi ==");
                break;
            default:
                System.out.println("Invalid!");
        }
    }
}
