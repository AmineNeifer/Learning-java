package ExcepetionHandling.Exercice1;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Integer q1 = question1(args);
//        System.out.println(q1);

        Integer q2 = question2();
//        System.out.println(q2);

        
    }
    private static Integer question1(String[] args) {
        int sum = 0;
        for (String s: args) {
            try{
                sum += parseInt(s);
            } catch (NumberFormatException e) { }
        }
        return sum;
    }
    private static Integer question2() {
        int intInput = 0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an Integer");

            String inputUser = sc.nextLine();
            try {
                intInput = parseInt(inputUser);
                break;
            } catch (NumberFormatException e){
                System.out.println("that is not an integer :'(");
            }
        }
        return intInput;
    }
}