package pregovor;

import java.util.*;

public class zad7 {
	public static Set <Integer> symmetricDifference(Set <Integer> a, Set <Integer> b){
		Set <Integer> dif = new HashSet<>();

		dif.addAll(a);
		dif.removeAll(b);
		dif.addAll(b);
		dif.removeAll(a);

		return dif;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <Integer> a = new HashSet<>(1,4,5,34,-24,54,58,96,35,237,595,-35,123,45,5,8);
		Set <Integer> b = new HashSet<>();
		System.out.println(symmetricDifference(a, b));
	}

}
