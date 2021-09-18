package pregovor;

public class BigDog extends Dog {

	public BigDog() {
		super();
	}
	
	public BigDog(String name) {
		super(name);
	}
	
	public void greets() {
		System.out.println("Wooow");
	}
	
	public void greets(Dog another) {
		System.out.println("Wooooow");
	}
	
	public void greets(BigDog another) {
		System.out.println("Woooooooooooow");
	}

}
