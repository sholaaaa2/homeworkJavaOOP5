package level1;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
//		Copy from folder1 to folder2
		File fol1 = new File("a");
		File fol2 = new File("b");
		
		try {
			DocCopy.copyFiles(fol1,fol2);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
//		Two files to one
		File file1 = new File("a.txt");
		File file2 = new File("b.txt");
		
		try {
			File fileTest = TwoFilesToOne.makeFile(file1, file2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		Save Student
		Student sd1 = new Student("Vova", "Ivanchenko", 19,3);
		Student sd2 = new Student("Ilona", "Green", 20,3);
		Student sd3 = new Student("Zhora", "Vovk", 18,3);
		
		Group gr = new Group("TE31");
		
		try {
			gr.addStudent(sd1);
			gr.addStudent(sd2);
			gr.addStudent(sd3);
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}
		
		Controler cn = new Controler();
		
		try {
			cn.saveGroup(gr);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		Load Student
		try {
			Group grTwo = cn.loadGroup("TE41");
			System.out.println(grTwo);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}
	}

}
