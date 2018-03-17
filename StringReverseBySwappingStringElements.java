
import java.util.Scanner;

public class StringReverseBySwapingVariables {
    public static void main(String args[]){

        /*Initializing variables*/
        int i,j=0;

        /*Taking String from User*/
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        /*Converting String to a Character type Array*/
        char arr[]=str.toCharArray();
        j=arr.length-1;


        /*Checking Condition for Swapping*/
        for (i=0;i<j;i++,j--){

            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

        /*Printing String in Reverse Order*/
        for (i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }


    }

    }


