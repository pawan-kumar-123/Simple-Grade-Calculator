package project;

import java.util.Scanner;

public class project1 {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the grade: ");
        int grd = sc.nextInt();
        int[] arr = new int[grd];
        int cont = 0;
        int highest = arr[0];
        int lowest = arr[0];
        System.out.println("Enter The Element Of Array:");
        for (int i = 0; i < grd; i++) {
            arr[i] = sc.nextInt();
            cont += arr[i];
            if (arr[i] >= 90) {
                System.out.println("A");
            } else if (arr[i] <= 89 && arr[i] >= 80) {
                System.out.println("B");
            } else if (arr[i] <= 79 && arr[i] >= 70) {
                System.out.println("C");
            } else if (arr[i] <= 69 && arr[i] >= 60) {
                System.out.println("D");
            } else if (arr[i] <= 60) {
                System.out.println("F");
            }
        }
        for (int i = 0; i < grd; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] > highest) {
                highest = arr[i];
            } else {
                lowest = arr[i];
            }
        }
        System.out.println("Total Number: " + cont / grd + " ");
        System.out.println("high: " + highest + " ");
        System.out.println("low : " + lowest + " ");
    }

}





/* output 
 Enter the grade: 
5
Enter The Element Of Array:
92
A
85
B
78
C
64
D
55
F
92 85 78 64 55 Total Number: 74
high: 92
low : 55
 */