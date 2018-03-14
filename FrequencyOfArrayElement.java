

import java.util.Scanner;

public class FrequencyOfArrayElement {
    public static void main(String[] args){

    /*Initializing variables*/
        int arr[]=new int[22];
        int dup[]=new int[15];
        int n,i,j,count;

        /*Defining Array size*/

      System.out.println("Enter the Array size: ");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();

      /*Taking Array Element from User*/
        System.out.println("Enter the Array Elements");
       for (i=0;i<n;i++){

           arr[i]=sc.nextInt();
           dup[i]=-1;
       }


        System.out.println(" Array Elements are printed here");
        for (i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }

    /* calculating frequency of Array element*/

        for (i=0;i<n;i++) {
            count = 1;
            for (j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    dup[j] = 0;
                }
            }
            if (dup[i] != 0) {
                dup[i] = count;
            }
        }

        /*Printing Distinct Array element and it's Frequency*/

            System.out.println("Frequency of each element in array: ");
            for (i=0;i<n;i++){
                if (dup[i]!=0){
                    System.out.println("Elements "+arr[i]+" occur"+dup[i]+" times");
                }
            }



    }
}
