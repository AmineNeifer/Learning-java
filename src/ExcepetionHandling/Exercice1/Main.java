package ExcepetionHandling.Exercice1;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Integer sum = question1(args);
        System.out.println(sum);


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
}