package comparablee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Sortingwrapperobject {
	public static void main(String args[]) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(Integer.valueOf(201));
		al.add(Integer.valueOf(101));
		al.add(230);// internally will be converted into objects as
					// Integer.valueOf(230)
        al.add(300);
		Collections.sort(al);
		
		
		

		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
