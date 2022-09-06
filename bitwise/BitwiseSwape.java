import java.util.Scanner;
public class BitwiseSwape{
	public static void main(String[] args){

	// To Swap the Two Number by using  Bitwise XOR   Operator
		Scanner input=new Scanner(System.in);
     int a=input.nextInt();
     int b=input.nextInt();
     // System.out.println(a);  
     // System.out.println(b);
     a=a^b;
     b=a^b;
     a=a^b;
     System.out.println(a);
     System.out.println(b);  
	}
}