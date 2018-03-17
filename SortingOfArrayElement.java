package com.controlstatement;
import java.util.Scanner;

public class SortingOfArrayElement {
    public static void main(String[] args){

        /*Initializing variables*/
        int i,n,j;
        int temp=0;

        /*Taking Array Size from User*/

        System.out.println("Enter Array size: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];

        /*Taking Array Element from User*/
        System.out.println("Enter Array Elements: ");
        for (i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        /*Printing Given Array Element*/
        System.out.println("Before Sorting Array Elements are: ");
        for (i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        /*Checking Condition for Sorting*/
        for (i=0;i<n-1;i++){
            for (j=i+1;j<n;j++){
                if (arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        /*Printing Array Elemet After sorting*/
        System.out.println();
        System.out.println("After sorting Array Elements are: ");
        for (i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
