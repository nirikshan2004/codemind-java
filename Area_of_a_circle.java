import java.util.Scanner;
class area
{
    public static void main(String args[])
    {
        float area;
        int r;
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        area=(float)(3.14*r*r);
        System.out.format("%.2f",area);
    }
}