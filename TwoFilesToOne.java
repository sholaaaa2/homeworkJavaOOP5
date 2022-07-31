package level1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class TwoFilesToOne {

	public static File makeFile(File f1, File f2) throws IOException {
		File twoToOne = new File("twoToOne.txt");
		String str = "";
		String strHelp = "";
		String[] arrStr1;
		String[] arrStr2;

		try (BufferedReader bf1 = new BufferedReader(new FileReader(f1));
				BufferedReader bf2 = new BufferedReader(new FileReader(f2));
				PrintWriter pw = new PrintWriter(twoToOne)) {
			for (; (str = bf1.readLine()) != null;) {
				strHelp += str + " ";
			}
			arrStr1 = strHelp.split(" ");

			strHelp = "";

			for (; (str = bf2.readLine()) != null;) {
				strHelp += str + " ";
			}
			arrStr2 = strHelp.split(" ");

			for (int i = 0; i < arrStr1.length; i++) {
				for (int j = 0; j < arrStr2.length; j++) {
					if (arrStr2[j].equals(arrStr1[i])) {
						pw.print(arrStr1[i] + " ");
						break;
					}
				}
			}

		} catch (IOException e) {
			throw e;
		}
		return twoToOne;
	}

}
