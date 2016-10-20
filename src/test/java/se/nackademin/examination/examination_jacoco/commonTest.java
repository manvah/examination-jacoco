package se.nackademin.examination.examination_jacoco;
import java.util.ArrayList;

public class commonTest {

	public boolean testArrays(ArrayList<String> array1, ArrayList<String> array2) {
		
		for (int i = 0 ; i < array1.size() ; i++ ) {
			if (array1.get(i) != array2.get(i)) {
				return false;
			}
		}
		
		
		return true;
	}
	
}
