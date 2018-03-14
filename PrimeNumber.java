
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]){
        int i,n,j;
        int total=0;

        /*taking an interval from User*/

        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();


        System.out.print("Prime Numbers are: ");
        int count=0;

        /*Checking Condition for Prime Number*/

        for (i=1;i<=n;i++){
            boolean flag=true;

            for (j=2;j<i/2;j++){

                if (i%j==0){
                    flag=false;
                    break;

                    }
            }


            /*Print a series of prime number within a Range*/

            if (flag){
                System.out.print(" "+i);
                count++;
            }


        }

        /*Printing Total Prime Number Within the Range*/
        System.out.println();
        System.out.println("Total : "+count);

    }
}
