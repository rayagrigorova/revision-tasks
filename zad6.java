package pregovor;
import java.util.*;
import java.io.*;
public class zad6 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		InputStream stream = zad6.class.getResourceAsStream("text.txt");
		Scanner sc = new Scanner (stream);
		Scanner in = new Scanner(System.in);
		Set <String> set = new HashSet <String>();
		int n = in.nextInt();

		while(sc.hasNext() && n > set.size()) {
			String[] s = (sc.nextLine().toLowerCase().replaceAll(
			          "[^a-zA-Z0]", " ").split(" "));
			
//			System.out.println("String array:");
//			for(int i = 0 ; i < s.length; i++  ) {
//				System.out.print(s[i] + ",");
//			}
			
			for(int i = 0 ; i < s.length && n > set.size(); i++) {
				if(s[i] != "")
				set.add(s[i]);
			}
		}
		System.out.println(set.toString() + " " + set.size());
		sc.close();
		in.close();

	}

}
