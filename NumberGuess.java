import java.util.Scanner;
import java.util.Random;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        //Computer Generate Number of its own
        int game_number = random.nextInt(1,100);
        //to check how many times user take chance to complete the game
        int check = 10;
        int i= 1;

        while ( i <= check){
            //Taking input form user while complete the game
            System.out.print("Enter the Number:");
            int user_number = sc.nextInt();
            if(user_number == game_number){
                System.out.println("Congratulations");
                System.out.println("You Have Passed The Test in "+i +" times");
                break;
            }
            else if (user_number>game_number){
                System.out.println("You have enter bigger number");
            }
            else if (user_number<game_number){
                System.out.println("You have enter smaller number");
            }
            else {
                System.out.println("You Failed Try Again Later");
            }
            System.out.println();
            System.out.println(check-i+" Remaining please complete the test");
            System.out.println();            

            i++;
        }
        sc.close();
    }
}
