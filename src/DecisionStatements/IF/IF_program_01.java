package DecisionStatements.IF;

public class IF_program_01 {

    public static void main(String[] args) {

        //print the even number from 1 to 10
        for (int i=0; i<=10 ; i=i+1)
        {
            if (i%2==0) //number is even or not
            {
                System.out.println(i);
            }
        }
    }
}
