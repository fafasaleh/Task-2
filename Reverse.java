import java.util.Scanner;

public class Reverse {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int[] intArray = new int [5] ;

        //print array starting from first element
        System.out.println("Enter 5 elements :");
        for(int i=0;i<intArray.length;i++)
            intArray[i]=input.nextInt();
        System.out.print("");



        //print array starting from last element
        System.out.println("Original Array printed in reverse order:");
        System.out.print("[");
        for(int i=intArray.length-1;i>=0;i--){
            if(i==intArray.length+1)
                System.out.print(intArray[i]);
            else
                System.out.print(intArray[i]+",");
        }
        System.out.print("]");
    }
}
