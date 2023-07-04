import java.util.*;

/*

                Accept number and sum  of Digits in that number

*/
class Digits
{
    int iCount=0;
    int iSum=0;
    public int SumOfDigits(int iValue)
    {
        

        while(iValue!=0)
        {
            int iDigit=iValue % 10;
            iSum = iSum + iDigit;
            iValue = iValue /10;
        }
        return iSum;

        
    
    }
}    

class program336
{


    public static void main (String Args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter  Number : ");
        int iNo=sobj.nextInt();

        Digits dobj = new Digits();

        int iRet= dobj.SumOfDigits(iNo);

        System.out.println("Sum  of digits  is : "+iRet);

       
        
   }
}