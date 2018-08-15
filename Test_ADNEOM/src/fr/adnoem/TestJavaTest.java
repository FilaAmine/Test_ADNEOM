package fr.adnoem;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;

public class TestJavaTest {
	// ArrayList <ArrayList<Integer>> liste = null;
	
	@Test
	public void testFct() {
		//charger les element de ArrayListe
		
		ArrayList<Integer> l1 = new ArrayList<>();
		for (int i = 1; i < 10; i++) {
			l1.add(i);
		}
		// La liste de comparaison 
                 ArrayList<ArrayList<Integer>> fil = new ArrayList<ArrayList<Integer>>();
                fil.add(new ArrayList<Integer>(Arrays.asList((Integer)1,(Integer)2,(Integer)3)));
                fil.add(new ArrayList<Integer>(Arrays.asList((Integer)4,(Integer)5,(Integer)6)));
                fil.add(new ArrayList<Integer>(Arrays.asList((Integer)7,(Integer)8,(Integer)9)));
		assertEquals(fil, TestJava.fct(l1, 3));
	}

}
