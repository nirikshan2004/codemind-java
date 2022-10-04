import java.util.Scanner;
class Disk
{
    public static void main(String args[])
    {
        int t,s,b,total;
        Scanner sc=new Scanner(System.in);
       
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        total=2*t*s*b*512;
        System.out.println(total);
    }
}