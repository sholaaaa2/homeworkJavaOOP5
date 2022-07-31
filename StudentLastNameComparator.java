package level1;

import java.util.Comparator;

public class StudentLastNameComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Student st1 = (Student)o1;
		Student st2 = (Student)o2;
		
		String ln1 = st1.getSurname();
		String ln2 = st2.getSurname();
		
		return ln1.compareTo(ln2);
	}

}
