public class speedconvertor {

    public static void main(String[] args) {
        printConversion(50);
    }

    public static long toMilesPerHour(double kilometersPerHour){
        long milesperhour = 0;
        if (kilometersPerHour < 0) {
            milesperhour = -1;
        }
        else{
            milesperhour = (long) (kilometersPerHour * 0.621371 + 0.5);
        }
        return milesperhour;
    }

    public static void printConversion (double kilometersPerHour){
        long milesperhour = 0;
        if (kilometersPerHour < 0) {
            milesperhour = -1;
        }
        else{
            milesperhour = (long) (kilometersPerHour * 0.621371);
        }
        System.out.println(milesperhour);
    }
}
