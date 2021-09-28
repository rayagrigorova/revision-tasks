package pregovor;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
public class zad9 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List <String> allLines = Files.readAllLines(Paths.get("src/pregovor/text2.txt"));
		
		for(int i = 0; i < allLines.size(); i++) {
			allLines.set(i, allLines.get(i).replaceAll("[0-9]", "*"));
		}
		System.out.println(allLines);
	}

}
