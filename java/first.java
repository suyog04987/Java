import java.util.*;


public class first{
   public static void main(String[] args) {
    int a[]=new int[5];
    System.out.println("Enter 5 numbers:");
    Scanner ob = new Scanner(System.in);
        for (int i=0;i<5;i++)
        {
            a[i]= ob.nextInt();

        }
        for (int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
        sumArray( a);
        int g=a[0];
        for(int i=0;i<5;i++)
        {
            if(a[i]>g)
            {
                g=a[i];

            }
        }
        System.out.println("greatest number is"+g);


       for(int i=0;i<5;i++)
       {
        for(int j=0;j<5;j++)
            {
                int temp=0;
                if (a[j]>a[i])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

            }
            
       }
       for(int i=0;i<5;i++)
       {
        System.out.println("assedning order:"+" "+a[i]);
       }







   }
   static void sumArray(int a[]){
    int sum=0;
    for(int i=0;i<5;i++)
    {
        sum=sum+a[i];

    }
    System.out.println("sum is:"+sum);

   }

}