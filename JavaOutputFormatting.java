import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();

                int n= s1.length();
                System.out.print(s1);
                for(int k=n;k<15;k++)
                {
                    System.out.print(" ");
                }

                if(x<=99&&x>9)
                {
                System.out.print("0"+x);}
                if(x<=9)
                {
                System.out.print("00"+x);}
                else if(x>99)
                {
                    System.out.print(x);
                }
                System.out.println();
                


               
            }
            System.out.println("================================");

    }
}



