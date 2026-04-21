package Phase_1;
import java.util.Scanner;

public class Statements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many Chromazons do you have?");
        int number;
        while (true) {
            try {
                number = input.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Please enter a valid integer.");
                input.nextLine(); // Clear the invalid input
            }
        }
        switch (number) {
            case 46:
                System.out.println("You normal");
                break;
            case 69:
                System.out.println("haha 69");
                break;
            case 67:
                System.out.println("SIX SEVEN SIX SEVEN SIX SEVEN SIX SEVEN 676767676767676767 六七六七六七");
                break;
            case 45:
                System.out.println("you got down sydrone");
                break;
            case 47:
                System.out.println("you got up sydrone I guess?");
                break;
            default:
                System.out.println("You got " + number + " Chromazons, which is a very weird number of Chromazons to have.");
                break;
        }
    }
}
