package com.controlstatement;
import java.util.Scanner;

public class PrimeNumberUsingArray {
    public static void main(String[] args) {

        /*initializing variables*/
        int i, n, j;
        int temp = 0;
        int count=0;

        /*Taking Array Size from User*/
        System.out.println("Enter Array size: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];

        /*Taking Array Elements from User*/

        System.out.println("Enter Array Elements: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        /*Given Array elements are printing Here*/
        System.out.println("Given Array Elements are: ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

        /*Checking Condition for Prime Numbers*/
        System.out.println();
        System.out.println("Prime Numbers Present in the Given Array: ");

        for (i=0;i<n;i++){
            boolean flag=true;
            for (j=2;j<arr[i];j++){
                if (arr[i]%j==0){
                    flag=false;
                    break;
                }

            }
            if (flag){
                count++;
                System.out.print(arr[i]+" ");
            }
        }

        /*Printing Total Number of Primes*/
        System.out.println();
        System.out.print("Total Prime Number in the Given Array: "+count);
    }
}
