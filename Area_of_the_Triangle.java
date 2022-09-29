import java.util.Scanner;
import java.lang.Math;
class Areaoftriangle
{
    public static void main(String args[])
    {
int a,b,c;
float area;
float s;

Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
s=(float)(a+b+c)/2;
area=s*(s-a)*(s-b)*(s-c);
System.out.println(""+String.format("%.2f",Math.sqrt(area)));
    }
}