package level1;

import java.util.Arrays;
import java.util.Comparator;

public class Group {
	private String id;
	private Student[] groupOfStudent = new Student[10];

	public Group(String id) {
		super();
		this.id = id;
	}

	public Group() {

	}

	public Student[] getGroupOfStudent() {
		return groupOfStudent;
	}

	public void setGroupOfStudent(Student[] groupOfStudent) {
		this.groupOfStudent = groupOfStudent;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void addStudent(Student stud) throws StudentException {
		for (int i = 0; i < this.groupOfStudent.length; i++) {
			if (this.groupOfStudent[i] == null) {
				this.groupOfStudent[i] = stud;
				return;
			}
		}
		throw new StudentException();

	}

	public Student findStudent(String surname) {
		for (int i = 0; i < this.groupOfStudent.length; i++) {
			if (this.groupOfStudent[i] != null && this.groupOfStudent[i].getSurname() != null
					&& this.groupOfStudent[i].getSurname().equals(surname)) {
				return this.groupOfStudent[i];
			}
		}
		return null;
	}

	public void deleteStudent(String surname) {
		for (int i = 0; i < this.groupOfStudent.length; i++) {
			if (this.groupOfStudent[i] != null && this.groupOfStudent[i].getSurname() != null
					&& this.groupOfStudent[i].getSurname().equals(surname)) {
				this.groupOfStudent[i] = null;
			}
		}
	}

	@Override
	public String toString() {
		return "Group [id=" + id + ", groupOfStudent=" + Arrays.toString(groupOfStudent) + "]";
	}

	public void sortStudentByLastname() {
		Arrays.sort(groupOfStudent, Comparator.nullsLast(new StudentLastNameComparator()));
	}
}
