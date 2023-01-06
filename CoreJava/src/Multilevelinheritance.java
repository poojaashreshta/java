class Electronics{ 
	void input() { 
		System.out.println("Electronics"); 
	}
}
class Mobile extends Electronics{ 
	void mob() {
		System.out.println("Mobile electronics");
	}
}
class Oneplus extends Mobile{ 
	void cat() { 
		System.out.println("Oneplus");
	}
}
public class Multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oneplus a= new Oneplus(); 
		a.input();
		a.mob();
		a.cat();
	}
}
