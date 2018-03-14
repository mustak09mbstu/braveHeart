
import java.util.Scanner;

public class SearchSpecificElemtofArray {

    public static void main(String args[]){
        int i,n;
        boolean ElementsFound=false;

        /*Taking Array size from User*/
        System.out.println("Enter the Array size: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];

        /*Taking Elements from User*/
        System.out.println("Enter Array Elements: ");
        for (i=0;i<n;i++){

            arr[i]=sc.nextInt();
        }

        /*Given Array Elements are printing Here*/

        System.out.println(" Given Array Elements are: ");
        for (i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }

        /*Input Your Desired Number Which You want to Search*/
        System.out.println();
        System.out.println(" Input Your Desired Element: ");

        Scanner FindElement=new Scanner(System.in);
       int input=FindElement.nextInt();

       /*Checking Condition*/

        for (i=0;i<n;i++){
            if(arr[i]==input){
                ElementsFound=true;
                break;
            }
        }

        /*If have same elements multiple times it will print first occurrence of that Element*/
        if (ElementsFound)
            System.out.println(" Your Desired Element found "+"arr["+i+"]"+"="+input);
        else
            System.out.println(input+" Your Desired Element Not found");
    }
}
