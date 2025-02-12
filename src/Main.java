//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner password = new Scanner(System.in);
        System.out.println("Please create a password");
        int correctPW = 0;
        String trash = "";
        if(password.hasNextInt())
        {
            correctPW = password.nextInt();
            password.nextLine();
        }
        else{
            trash = password.nextLine();
            System.out.println("Enter a valid number, not"+ trash);
        }
        int pW = 0;
        while (pW != correctPW) {
            Scanner checkPW = new Scanner(System.in);
            System.out.println("Please enter your password");
            if(checkPW.hasNextInt())
            {
                pW = checkPW.nextInt();
                checkPW.nextLine();
            }
            else{
                trash = checkPW.nextLine();
                System.out.println("Enter a valid number, not "+ trash);
            }
        }
        System.out.println("Correct Password");
    }
}