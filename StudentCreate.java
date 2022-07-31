package level1;

import java.util.Scanner;

public class StudentCreate {
	public static Student createStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name");
		String name = sc.nextLine();
		System.out.println("Enter student lastname");
		String surname = sc.nextLine();
		System.out.println("Enter student age");
		int age = sc.nextInt();
		System.out.println("Enter student course");
		int course = sc.nextInt();
		
		Student sd = new Student(name, surname, age, course);
		
		return sd;
	}
}
