import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner amogus = new Scanner(System.in);
        System.out.println("Enter Equation: ");
        String userinputequation = amogus.nextLine();
        System.out.println(parseforoperator(userinputequation));

    }


    public static char
    getCharFromString(String stringthing, int index)
    {
        return stringthing.charAt(index);
    }

    public static long parseforoperator (String userInput){
        int index = 0;
        long output = -1;
        char ch = 0;
        char operator = 0;
        long number1 = -1;
        long number2 = -1;
        String debuging = null;

        for (int i = 0; i < userInput.length(); i++) {
            ch = getCharFromString(userInput, i);
            if (Character.isDigit(ch)) {
                continue;
            }
            else {
                operator = ch;
                index = i;
            }
        }

        if (index != -1)
        {
            number1 = Long.parseLong(userInput.substring(0 , index)); //this will give number1
            number2 = Long.parseLong(userInput.substring(index + 1, userInput.length()));
        }
        switch (operator){
            case '+': output = number1 + number2;
                break;
            case '-': output = number1 - number2;
                break;
            case '*': output = number1 * number2;
                break;
            case '/': output = number1 / number2;
                break;
        }
        //System.out.println(number1;
        //System.out.println(number2;

        return output;
    }

}
