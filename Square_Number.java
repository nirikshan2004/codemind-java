import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,f=0;
        n=sc.nextInt();
        for( i=0;i<n;i++)
        {
            for (j=0;j<n;j++)
            {
                if((i*i)+(j*j)==n)
                {
                    f=1;
                }
            }
        }
        if(f==1)
        {
            System.out.println("True");
        }
        else
        {
              System.out.println("False");
        }
    }
}
