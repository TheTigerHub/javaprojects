import java.util.Scanner;

public class main {

    public static void main (String[] arg){

        int min = 0;
        int max = 100;
        int differenceofnumbers = 0;
        int scoretobeadded = 0;
        int score = 0;
        int numberofguesses = 0;

        while (score <= 250) {

            Scanner guessscanner = new Scanner(System.in);
            System.out.println("Enter your guess");

            int computerrandom = (int)(Math.random()*(max-min+1)+min);
            int humanguess = guessscanner.nextInt();


            differenceofnumbers = computerrandom - humanguess;
            scoretobeadded = 100 - Math.abs(differenceofnumbers);
            score += scoretobeadded;
            numberofguesses ++;


            System.out.println("The number was:");
            System.out.println(computerrandom);
            System.out.println(" ");
            System.out.println("Your score is: ");
            System.out.println(score);
            System.out.println(" ");
            System.out.println("So far you have guessed ");
            System.out.println(numberofguesses);
            System.out.println("many times!");
            System.out.println(" ");
            System.out.println("___________________________________________________________");
            System.out.println(" ");



        }



    }

}
