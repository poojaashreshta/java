class Addition{
	void sum(int x, double y) {
		System.out.println("Two Integer sum="+(x+y));
		
	}
	void sum(double x,int y) {
		System.out.println("Two integer sum="+(x+y));
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a= new Addition();
		a.sum(2.3,1);
		
	}

}
