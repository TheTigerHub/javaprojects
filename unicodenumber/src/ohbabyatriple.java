import java.util.Scanner;

public class ohbabyatriple {


    public static void main(String [] args ){

        int thetriples = 3;
        int numberoftimesalreadydone = 0;
        int totalnumber = 0;

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number of triples: ");
        int count = reader.nextInt();
        reader.close();

        while (numberoftimesalreadydone < count){
            System.out.println(totalnumber);
            totalnumber += thetriples;
            thetriples += 3;
            numberoftimesalreadydone += 1;

        }
        System.out.println("  ");
        System.out.println("the total is: ");
        System.out.println(totalnumber);
    }

}
