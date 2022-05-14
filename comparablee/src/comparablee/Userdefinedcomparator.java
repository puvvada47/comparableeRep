

//sorting the collection for userdefined object

//we can do sorting the collection of type userdefined class based on more than one data member

////sorting the elements of the list
package comparablee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student
 {
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}  

class AgeComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		
		// 1way
		//return Integer.valueOf(s1.age).compareTo(Integer.valueOf(s2.age));

        //2way
		Integer I1 = (Integer) s1.age;
		Integer I2 = (Integer) s2.age;
		return Integer.compare(I1, I2);
		//return I1.compareTo(I2);

		

		/*3way(direct Logic)
		  if (s1.age == s2.age) 
		  return 0; 
		  else if (s1.age > s2.age) 
		  return 1;
		  else return -1;
		  
		  
		  4way(Optimized way which is implemented in Integer compare logic
		   public static int compare(int x, int y) {
        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }

		 */

		/*
  int i=Integer.parseInt("10"); System.out.println(i);
 */

/*
 * int o=Integer.parseInt("abc"); System.out.println(o); //throws
 * numberformat exception
 */

	}
}

class NameComparator implements Comparator<Student> {
	public int compare(Student o1, Student o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;

		return s1.name.compareTo(s2.name);
	}
}  



public class Userdefinedcomparator {

	public static void main(String args[]) {

		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(101, "Viswanath", 24));
		studentList.add(new Student(106, "Suvarna", 28));
		studentList.add(new Student(105, "Adinarayana", 22));
		studentList.add( new Student(110, "viswath", 20));
		//---------------------------------------------------------------------------

		System.out.println("Sorting by Name...");
          
		
		//1way
		//Collections.sort(al, new NameComparator());
		
		//2way(annoymous way instead of explicity creating class,during compile time an annoymous class will create)
		Collections.sort(studentList,new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
			return o1.name.compareTo(o2.name);
			}
		}); 
		Iterator<Student> itr = studentList.iterator();
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		
		
		
		
		//---------------------------------------------------------------------------
		
		System.out.println("======================");
		System.out.println("=======================");
		System.out.println("sorting by age...");
      
		
		//1way
		//Collections.sort(studentList, new AgeComparator());
		
		//2way(annoymous way instead of explicity creating class,during compile time an annoymous class will create)
		Collections.sort(studentList,new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				int x=o1.age;
				int y=o2.age;
				
			return (x>y)?1:((x<y)?-1:0);
			//return Integer.valueOf(o1.age).compareTo(Integer.valueOf(o1.age));
			}
		}); 
		
		Collections.reverse(studentList);
		Iterator<Student> itr2 = studentList.iterator();
		while (itr2.hasNext()) {
			Student st = (Student) itr2.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}

}
 


