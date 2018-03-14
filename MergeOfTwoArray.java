
import java.util.Scanner;

public class MergeOfTwoArray {
    public static void main(String[] args){

        /*Initializing variables*/
        int i,n1,n2;
        int count=0;


        /*Taking First Array Size from User*/
        System.out.println("Taking First Array Size from User: ");
        Scanner firstArraySize=new Scanner(System.in);
        n1=firstArraySize.nextInt();
        int firstArray[]=new int[n1];

        /*Taking First Array Elements from User*/
        System.out.println("Taking First Array Elements from User: ");

        for (i=0;i<n1;i++){
            Scanner firstArrayElement=new Scanner(System.in);
            firstArray[i]=firstArrayElement.nextInt();
        }

        /*Taking Second Array Size from User*/
        System.out.println("Taking Second Array Size from User: ");

        Scanner secondArraySize=new Scanner(System.in);
        n2=secondArraySize.nextInt();
        int secondArray[]=new int[n2];

        /*Taking Second Array Elements from User*/
        System.out.println("Taking Second Array Elements from User: ");
        for (i=0;i<n2;i++){
            Scanner secondArrayElement=new Scanner(System.in);
            secondArray[i]=secondArrayElement.nextInt();
        }

        /*Initializing Merged Array*/

        int mergedArray[]=new int[firstArray.length+secondArray.length];

        /*Merging First Array*/

        for (i=0;i<firstArray.length;i++){
            mergedArray[i]=firstArray[i];
            count++;
        }

        /*Merging Second Array*/
        for (i=0;i<secondArray.length;i++){
            mergedArray[count]=secondArray[i];
            count++;
        }

        /*Printing Merged Array*/
        System.out.println("Printing Merged Array: ");
        for (i=0;i<firstArray.length+secondArray.length;i++){
            System.out.print(mergedArray[i]+" ");
        }
    }
}
