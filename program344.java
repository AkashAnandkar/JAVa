/*

     Accept numbers for array and display number from arrray

*/

import java.util.*;

class program344
{

    public static void  main (String Args[])
    {

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");

        int iSize=0;
        iSize = sobj.nextInt();

        int Arr[]= new int[iSize];

        System.out.println("Enter the elements : ");

        int iCnt=0;
        for(iCnt=0 ; iCnt<Arr.length ; iCnt++)
        {
            Arr[iCnt]=sobj.nextInt();
        }

        System.out.println("Elements of array  are : ");
         for(iCnt=0 ; iCnt<Arr.length ; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
}