import java.util.Arrays;

import java.util.Scanner;

public class SortedArrays {
    public static void main(String[] args) {

        int number;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Number : ");

        number = input.nextInt();


        int[] array = new int[number];

        for(int i = 0; i < number; i++){

            System.out.print("Enter The Elements of The Array : ");

            array[i] = input.nextInt();

        }

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

    }
}
