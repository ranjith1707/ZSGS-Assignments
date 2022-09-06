import java.util.Scanner;
public class BitwiseChecking{
    public static void main(String[] args){
       Scanner input=new Scanner(System.in);
       // TO Check Odd or Even number By Using Bitwise & Operator
       int number=input.nextInt();
       if((number & 1)==1)
        System.out.println(number+"   Is a odd Number");
        else
            System.out.println(number+"   is A Even number");
     }

    }