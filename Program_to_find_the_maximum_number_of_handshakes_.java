import java.util.Scanner;
class Handshakes
{
    public static void main(String args[])
    {
        int x,tot;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        tot=x*(x-1)/2;
        System.out.println(tot);
    }
}