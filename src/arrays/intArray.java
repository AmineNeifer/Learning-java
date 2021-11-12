package arrays;

public class intArray {
    public static void main(String[] args) {
        int[] intArray = new int[7];
        intArray[0] = 0;
        intArray[1] = 23;
        intArray[2] = -123412;
        intArray[3] = 1234123;
        intArray[4] = 542;
        intArray[5] = -12;
        intArray[6] = 2;

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
