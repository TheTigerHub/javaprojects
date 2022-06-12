import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {

        int a = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("What's your name: ");
        while(sc.hasNextLine() && a != 5) a++;  System.out.println("Hello, "+sc.nextLine()+", the date and time is : "+new Date());

        long longthing = Long.MAX_VALUE;

        System.out.println("The date and time is "+ new Date());

        System.out.println("this is extralongnumbertestestestest "+ longthing);

    }
}
