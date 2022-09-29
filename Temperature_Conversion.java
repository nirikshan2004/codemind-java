import java.util.Scanner;
import java.lang.Math;
class Temp
{
    public static void main(String args[])
    {
    float f;
    int c;
    Scanner sc=new Scanner(System.in);
    c=sc.nextInt();
    f=32+(float)(c*9)/5;
    System.out.format("%.2f",f);
    }
}