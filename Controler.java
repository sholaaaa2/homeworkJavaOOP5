package level1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Controler implements GroupDAO {

	@Override
	public void saveGroup(Group g) throws IOException {
		String file = g.getId() + ".txt";
		Student[] arrStudent = g.getGroupOfStudent();
		try (PrintWriter pw = new PrintWriter(file)) {
			for (Student student : arrStudent) {
				if (student != null) {
					pw.println(student.toCSVString());
				}
			}
		} catch (IOException e) {
			throw e;
		}

	}

	@Override
	public Group loadGroup(String id) throws IOException, StudentException {
		String file = id + ".txt";
		Group g = new Group(id);

		try (BufferedReader bf = new BufferedReader(new FileReader(file))) {
			String str = "";
			Student sd = new Student();
			for (; (str = bf.readLine()) != null;) {
				g.addStudent(sd.fromCSVString(str));
			}
		} catch (IOException e) {
			throw e;
		} catch (StudentException e) {
			throw e;
		}
		return g;
	}

}
