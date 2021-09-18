package pregovor;

public class Animal_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat("Ivan");
		Dog d1 = new Dog("Ibrahim");
		Dog d2 = new Dog("Mariana");
		BigDog d3 = new BigDog("Golem");
		BigDog d4 = new BigDog("Golliath");
		
		c.greets();
		System.out.println();
		
		d1.greets();
		d1.greets(d2);
		System.out.println();
		
		d3.greets();
		d3.greets(d1);
		d3.greets(d4);
		System.out.println();
	}

}
