import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {

        String testing = getDurationString(1233, 53);
        System.out.println(testing);


    }

    public static String getDurationString(int min, int sec){
        int hourscalculation = 0;
        int mincalculation = min;
        int minvalue = min;
        int seccalculation = 0;
        String returnStringmin = "1";
        String returnStringhours = "1";
        String returnStringsec = "1";
        String returnStringCombined = null;
        if (min >=0){
            if (sec >= 0 && sec <= 59){
                mincalculation = minvalue % 60;
                returnStringmin = String.valueOf(mincalculation);

                hourscalculation = min / 60;
                returnStringhours = String.valueOf(hourscalculation);

                //hourscalculation = (min - mincalculation)/60;
                //returnStringhours = String.valueOf(hourscalculation);

                returnStringsec = String.valueOf(sec);

                returnStringCombined = returnStringhours + "h" + returnStringmin + "m" + returnStringsec + "s";

            }
            else return "Sec need to be within 0 to 59";
        }
        else return "Min need to be positive or 0";

        return returnStringCombined;
    }
}
