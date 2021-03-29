import java.util.Scanner;

public class CopyAndClone {

   static Scanner input=new Scanner(System.in);
    static int i=0;

    public static void main(String[] args)
    {



        int[] intArray = new int [3] ;


        // define an array copyArray to copy contents of intArray
        int copyArray[] = new int[intArray.length];

        // copy contents of intArray to copyArray
        for (int i=0; i<intArray.length; i++)
            intArray [i]=input.nextInt();
            copyArray[i] = intArray[i];

        // update element of copyArray
        copyArray[0]++;

        //print both arrays
        System.out.println("intArray[] elements:");
        for (int i=0; i<intArray.length; i++)
            System.out.print(intArray[i] + " ");

        System.out.println("\n\ncopyArray[] elements:");
        intArray [0]= intArray[0]+1;
        for (int i=0; i<intArray.length; i++){
            System.out.print(intArray[i] +" ");
        }

    }
}
