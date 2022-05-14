
//sorting the collection for userdefined object

//we can do sorting the collection of type userdefined class based on only one data member

//sorting the elements of the list

package comparablee;

import java.util.ArrayList;
import java.util.Collections;


class Students implements Comparable<Students> {

	int rollno;
	String name;
	int age;

	Students(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Students st) {
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}

	/*public int compareTo(Students st) {
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}*/
} 

public class Userdefinedcomparable {

	public static void main(String args[]) {
		ArrayList<Students> studentList = new ArrayList<Students>();
		studentList.add(new Students(101, "Viswanath", 24));
		studentList.add(new Students(106, "Suvarna", 28));
		studentList.add(new Students(105, "Adinarayana", 22));
		studentList.add( new Students(110, "viswath", 20));
	Collections.sort(studentList);
		for (Students st : studentList) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);

		}
		Students k = new Students(110, "Vijay", 23);
		System.out.println("hashcode: " + k.hashCode());
		System.out.println("toString: " + k.toString());
	}
}
