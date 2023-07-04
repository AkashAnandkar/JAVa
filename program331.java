import java.util.*;

/*

                Accept number and return the multiplication of even factor

*/
class Numbers
{

    public int EvenFact(int iValue)
    {
        int iMult=1;
        for(int iCnt=1 ;iCnt<=iValue;iCnt++)   // (N)
        {
            if((iValue % iCnt)==0)
            {

                if(iCnt % 2 ==0)
                {
                    iMult=iMult * iCnt;
                }
                
            }
            
        }
        return iMult;

    }
    
}

class program331
{


    public static void main (String Args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter  Number : ");
        int iNo=sobj.nextInt();

        Numbers nobj = new Numbers();

        int iRet= nobj.EvenFact(iNo);

        System.out.println("Multiplication of even factors is : "+iRet);

       
        
   }
}