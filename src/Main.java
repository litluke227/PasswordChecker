//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner password = new Scanner(System.in);
        System.out.println("Please create a password");
        int correctPW = password.nextInt();
        int pW = 0;
        while (pW != correctPW) {
            Scanner checkPW = new Scanner(System.in);
            System.out.println("Please enter your password");
            pW = checkPW.nextInt();
        }
        System.out.println("Correct Password");
    }
}