package level1;

public class Student extends Human implements CSVConverter {
	private int course;

	public Student(String name, String surname, int age, int course) {
		super(name, surname, age);
		this.course = course;
	}

	public Student() {
		super();
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [name=" + this.getName() + ", surname=" + this.getSurname() + ", age=" + this.getAge()
				+ ", course=" + course + "]";
	}

	@Override
	public String toCSVString() {
		return super.getName() + " " + super.getSurname() + " " + super.getAge() + " " + course;
	}

	@Override
	public Student fromCSVString(String str) {
		String[] st = str.split(" ");
		String nameNew = st[0];
		String surnameNew = st[1];
		int ageNew = Integer.parseInt(st[2]);
		int courseNew = Integer.parseInt(st[3]);
		return new Student(nameNew, surnameNew, ageNew, courseNew);
	}

}
