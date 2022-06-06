import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner cmscanner = new Scanner(System.in);
        System.out.println("CM:");
        double cm = cmscanner.nextDouble();

        Scanner decimalpointscan = new Scanner(System.in);
        System.out.println("How Many Decimal Points:");
        int decimalpoint = decimalpointscan.nextInt();

        double inches = (cm/2.54);
        inches = inches * Math.pow(10, decimalpoint);
        inches = Math.floor(inches);
        inches = inches / Math.pow(10, decimalpoint);

        System.out.println(inches);

    }
}
