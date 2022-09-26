import java.io.File;
import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args) {
        // input keyboard
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter your name ");

        String userName = myObj.nextLine();
        System.out.println("Your name is " + userName);

        // input file
        File myFile = new File("data.txt");
        if (myFile.exists()) {
            System.out.println(myFile.getName() + " exist!");
            System.out.println("The file is " + myFile.length() + " bytes");
            if (myFile.canRead()) {
                System.out.println("file can read!");
            } else {
                System.out.println("file can not be read!");
            }
            if (myFile.canWrite()) {
                System.out.println("file can be written!");
            } else {
                System.out.println("file can not be written!");
            }
            System.out.println("path: " + myFile.getAbsolutePath());
            System.out.println("file name: " + myFile.getName());
            System.out.println("file size: " + myFile.length());
        } else {
            System.out.println("file does not exist!");
        }
    }
}
