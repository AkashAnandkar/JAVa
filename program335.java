import java.util.*;

/*

                Accept number and Count number of Digits in that number

*/
class Digits
{
    int iCount=0;
    public int CountDigits(int iValue)
    {
        

        while(iValue!=0)
        {
            int iDigit=iValue % 10;
            iCount++;
            iValue = iValue /10;
        }
        return iCount;

        
    
    }
}    

class program335
{


    public static void main (String Args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter  Number : ");
        int iNo=sobj.nextInt();

        Digits dobj = new Digits();

        int iRet= dobj.CountDigits(iNo);

        System.out.println("Count of digits  is : "+iRet);

       
        
   }
}