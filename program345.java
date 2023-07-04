import java.util.*;

/*

     Accept numbers for array and display number from array

*/
class ArrayX
{
    public int Arr[];


    public ArrayX(int iSize)
    {
        Arr = new int[iSize];

    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the  elements : ");

        for(int iCnt=0 ; iCnt<Arr.length; iCnt++)
        {
            Arr[iCnt]=sobj.nextInt();
        }
          


    }

    public void Display()
    {

        System.out.println("Elements of array are  : ");
        for(int iCnt=0 ; iCnt<Arr.length ; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }

    }

}



class program345
{

    public static void  main (String Args[])
    {

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");

        int iSize=0;
        iSize = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSize);

        aobj.Accept();
        aobj.Display();

    }   
}