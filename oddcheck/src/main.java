public class main {

    public static void main(String[] args) {

        if (isOdd(3)){
            System.out.println("Odd");
        }
        else {
            System.out.println("Even");
        }
    }

    public static boolean isOdd(int number){

        if (number > 0){
            if (number%2 != 0 ){
                return true;
            }
            else {
                return false;
            }
        }
        else{
            return false;
        }


    }

}
