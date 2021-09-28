package pregovor;

import java.util.*;

public class zad7 {
	public static Set <Integer> symmetricDifference(Set <Integer> a, Set <Integer> b){
		Set <Integer> dif1 = new HashSet<>();
		Set <Integer> dif2 = new HashSet<>();

		//Elements in a that aren't in b
		dif1.addAll(a);
		dif1.removeAll(b);
		
		//Elements in b that aren't in a
		dif2.addAll(b);
		dif2.removeAll(a);
		
		//The two differences combined
		dif1.addAll(dif2);

		return dif1;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Set <Integer> a = new HashSet<>();
		Set <Integer> b = new HashSet<>();
		
		for(int i = 0; i < 10; i ++) {
			a.add(r.nextInt(10));
			b.add(r.nextInt(10));
		}
		System.out.println("a: " + a.toString());
		System.out.println("b: " + b.toString());
		System.out.println("Symmetric difference: " + symmetricDifference(a, b));
	}

}