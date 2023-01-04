import java.util.Scanner; 

public class Controlstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
		if(a<30) {
			System.out.println("a is less than 30");
		}
		else {
			System.out.println("a is greater than 30");
		}
	

	}

}
