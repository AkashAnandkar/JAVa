import java.util.*;

// Approcah 1

/*

Find Factorial of number

*/

class program328
{

    public static void main (String Args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter  Number : ");
        int iNo=sobj.nextInt();

        int iMult=1;

        for(int iCnt=1;iCnt<=iNo;iCnt++)
        {
            iMult=iMult * iCnt;
        }

        System.out.println("Factorial is : "+iMult);
        
        
   }
}