package DecisionStatements.Switch;

public class switch_01 {
    public static void main(String[] args) {

        int day = 1;

        switch (day)
        {
            case 1 :
                System.out.println("Sunday");
                break;
            case 2 :
                System.out.println("Monday");
                break;
            case 3 :
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wed");
                break;
            case 5:
                System.out.println("thurs");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("invalid value");
        }
        System.out.println("Out of switch block");
    }
}
