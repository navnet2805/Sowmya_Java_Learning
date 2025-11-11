package DecisionStatements.Switch;

public class switch_02 {

    public static void main(String[] args) {

       int day = 9;

       String result = switch (day)
        {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wed";
            case 5 -> "thurs";
            case 6 -> "friday";
            case 7 -> "saturday";
            default ->"invalid value";
        };
        System.out.println(result);
        System.out.println("line number 21");
    }
}
