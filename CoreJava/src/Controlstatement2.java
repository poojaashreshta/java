import java.util.Scanner;
public class Controlstatement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Value of i:");
		int i=sc.nextInt();
		int n=5,mul=1;
		while(i<=n) {
			System.out.println("The value of i is:"+i);
			mul=mul*i;
			System.out.println("mul="+mul);
			i++;
		}
	}
}
