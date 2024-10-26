import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("количество элементов массива:");
        int[] myArray = new int[scan.nextInt()];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scan.nextInt();
        }
        System.out.println("введи s1 и s2:");

        int s1 = scan.nextInt();
        int s2 = scan.nextInt();
        if (s1 < 0 || s2 >= myArray.length || s2 <= s1) {
            System.out.println("s1 должно быть меньше s2");
            return;


        }
        int sum = 0;

        for (int i = s1; i <= s2; i++) {

            sum += myArray[i];

        }
        double med = (double) sum/(s2-s1+1);

        System.out.println("= " + med);
    }
}