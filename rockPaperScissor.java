import java.util.Random;
import java.util.Scanner;
// ROCK PAPER SCISSOR
public class rockPaperScissors 
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Random rc = new Random();

        // Shahid's Choice

        System.out.println("Enter '0' for Rock\nEnter '1' for PAPER\nEnter '2' for SCISSOR" );
        System.out.println("Enter your Choice : ");
        int a=sc.nextInt();
        if (a==0){
            System.out.println("You selected ROCK");
        }
        else if (a==1){
            System.out.println("You selected PAPER");
        }
        else if (a==2){
            System.out.println("You selected SCISSOR");
        }else {
            System.out.println("Enter a valid Input");
        }

        //Computer's Choice

//        System.out.println("Computer's choice is :");
        int b=rc.nextInt(0,2);
        if (b==0){
            System.out.println("Bot selected ROCK");
        }
        else if (b==1){
            System.out.println("Bot selected PAPER");
        }
        else if (b==2){
            System.out.println("Bot selected SCISSOR");
        }else {
            System.out.println("Enter a valid Input");
        }

        //Result

        if (a==b){
            System.out.println("draw");
        }
        else if (a==0 && b==2 || a==1 && b==0 || a==2 && b==1){
            System.out.println("won");
        }
        else
            System.out.println("loose");
        }
    }
