import java.util.*;

/*

                Accept number and check weather number is Armstrong number or not.

*/
class Digits
{
    public boolean CheckArmstrong(int iNo)
     {
        int iTemp=iNo;
        int iCount=0;
        while(iTemp!=0)
        {
            iCount++;
            iTemp= iTemp/10;
        }

        iTemp=iNo;
        int iSum=0;
        int iPower=1;
        int iCnt=0;
        int iDigit=0;

        while(iNo!=0)
        {
            iDigit=iNo % 10;
            for( iCnt=1 ;iCnt<=iCount;iCnt++)
            {
                iPower= iPower * iDigit;
            }
            iSum = iSum + iPower;
            iPower = 1;
            iNo = iNo/10;

        }

        if(iSum==iTemp)
        {
            return true;
        }
        else
        {
            return false;
        }



     }
   
}    

class program341
{


    public static void main (String Args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter  Number : ");
        int iNo=sobj.nextInt();

        Digits dobj = new Digits();

        boolean bRet= dobj.CheckArmstrong(iNo);

        if((bRet==true))
        {
            System.out.println("Number is Armstrong Number ");
        }
        else
        {
            System.out.println("Number is not armstrong number.");
        }
    }
}



/*

Input  = 371

3^3 + 7^3 + 1^3  = 371

27  + 343  + 1 = 371

*/