package Loops;

//Write a program to print the numbers from 1 to 10.
// 1,2,3,4,5...10


public class forLoop {

    public static void main(String[] args) {
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(4);
//        System.out.println(5);
//        System.out.println(6);
//        System.out.println(7);
//        System.out.println(8);
//        System.out.println(9);
//        System.out.println(10);

        /*
        for loop
        common variable : i
        initilization: 1
        updation: +1
        condition: whenever the number is less than 11 , less than or equal to 10
         */

        for( int i =1 ; i<11 ; i= i+1)
        {
            System.out.println(i);
        }
        System.out.println("outside for loop");

    }

}
