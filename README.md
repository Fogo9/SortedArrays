# **SORTED ARRAYS**

## **INFORMATION**

* **Program to find repeating even numbers in arrays.**

## **TECHNOLOGIES USED**

* **JAVA**

## **CONTENTS**

* Number, array, and i variables are declared with int.

* Arrays and scanner class are defined from util library.

* Sorts numbers in arrays from smallest to largest with the definition of sort.

* Definitions are created for the user to enter the size of the array and the elements of the array.

## **CODES**

```Java

        import java.util.Arrays;

        import java.util.Scanner;

        public class SortedArrays {

            public static void main(String[] args) {

                int number;

                Scanner input = new Scanner(System.in);

                System.out.print("Enter The Number : ");

                number = input.nextInt();


```

```Java

                int[] array = new int[number];

                for(int i = 0; i < number; i++){

                    System.out.print("Enter The Elements of The Array : ");

                    array[i] = input.nextInt();

                }

                Arrays.sort(array);

                System.out.println(Arrays.toString(array));

            }
        }

```

```bash

    Enter The Number : 5
    Enter The Elements of The Array : 99
    Enter The Elements of The Array : -2
    Enter The Elements of The Array : -2121
    Enter The Elements of The Array : 1
    Enter The Elements of The Array : 0
    [-2121, -2, 0, 1, 99]

    Enter The Number : 6
    Enter The Elements of The Array : 1000221
    Enter The Elements of The Array : 22
    Enter The Elements of The Array : -1
    Enter The Elements of The Array : 999
    Enter The Elements of The Array : 0
    Enter The Elements of The Array : 254
    [-1, 0, 22, 254, 999, 1000221]

```

<br />

## **LINK**

* Click here https://github.com/Fogo9/SortedArrays.git to access the Github page for this project.

<br />

## **LICENSE**

* This software is licensed By Tuncay Demir under the MIT license.

<br />

>[Patika.dev](https://app.patika.dev/fogomurphy)

<br/>

| Name |  Email |
| ---- |  ----- |
| Tuncay | tuncaydemir682@gmail.com |
