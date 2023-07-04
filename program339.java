import java.util.*;

/*

                Accept number and find generic root of that number

*/
class Digits
{
   
    int GenericRoot(int iNo)
    {
        int iDigit=0;
      int iSum=0;
      int iCount=0;
      while(iNo >=10)
      {
        while(iNo!=0)
        {
            iDigit=iNo %10;
            iSum = iSum + iDigit;
            iNo = iNo /10;
        }

        if(iSum>=10)
        {
            iNo=iSum;
            iSum=0;
        }
        else
        {
            iNo=iSum;
            break;
        }

       
      }
      return iNo;



    }
}    

class program339
{


    public static void main (String Args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter  Number : ");
        int iNo=sobj.nextInt();

        Digits dobj = new Digits();

        int iRet= dobj.GenericRoot(iNo);

        System.out.println("Generic root  is : "+iRet);

       
        
   }
}