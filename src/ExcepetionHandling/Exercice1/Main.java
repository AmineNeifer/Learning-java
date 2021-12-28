package ExcepetionHandling.Exercice1;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Integer sum = 0;
        for (String s: args) {
            try{
                sum += parseInt(s);
            } catch (NumberFormatException e) { }
        }
        System.out.println(sum);
    }
}