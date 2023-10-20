import java.util.*;
public class guessgame {
    public static void main(String[]args ){

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int guessnum = rand.nextInt(100);
        System.out.println(guessnum);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 to 100: ");

        while (true){

            int guess = sc.nextInt();

            if (guess == guessnum){
                System.out.println("Congratulations! You got the number right!");
                break;
            } else if (guess <  guessnum) {
                System.out.println("Your guess is too low, Try again!");
            } else if (guess > guessnum) {
                System.out.println("Your guess is too high, Try again!");
            }
            else{
                System.out.println("Error! The Number is higher than 100.");
            }

        }

    }

}
