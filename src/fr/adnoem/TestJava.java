package fr.adnoem;
import java.util.ArrayList;
public class TestJava {
	
	 
	
	 
		@SuppressWarnings("unchecked")
		public static ArrayList<ArrayList<Integer>> fct (ArrayList<Integer> liste, Integer taille){
	 
			ArrayList<ArrayList<Integer>> List = new ArrayList<ArrayList<Integer>>();
			ArrayList<Integer> list = new ArrayList<Integer>();
	 
			int i=0,j=0,k=0;
			while (i<liste.size())
			{
				list.clear();
				for ( j = 0; j < taille; j++) 
				{
					if((j+i)<liste.size())
						list.add(liste.get(i+j));
				}
				List.add((ArrayList<Integer>) list.clone());
				i+=taille;
				k++;
			}
	 
			return List;
		}
	 
	}


