
import java.util.Scanner;

public class StringReverseWithoutSwappingStringElements {

    public static void main(String args[]){

        /*Taking String from User*/
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        /*Converting String to Character Type Array*/
        char arr[]=str.toCharArray();

        /*Printing Reverse String*/
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }



    }
}
