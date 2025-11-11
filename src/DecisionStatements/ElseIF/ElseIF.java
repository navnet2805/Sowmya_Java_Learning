package DecisionStatements.ElseIF;

public class ElseIF {
    public static void main(String[] args) {
        int marks = 85;

        if(marks >=85)
        {
            System.out.println("Grade A");
        }
        else if (marks>=60)
        {
            System.out.println("Grade B");
        }
        else if (marks >= 35)
        {
            System.out.println("Grade C");
        }
        else
        {
            System.out.println("Grade F");
        }
    }
}
