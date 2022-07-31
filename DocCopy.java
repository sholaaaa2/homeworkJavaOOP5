package level1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DocCopy {

	public static void copyFiles(File in, File out) throws IOException {
		MyFileFilter mFF = new MyFileFilter("docx");
		File[] fileList = in.listFiles(mFF);

		for (File file : fileList) {

			try (FileInputStream fis = new FileInputStream(file);
					FileOutputStream fos = new FileOutputStream(new File(out, file.getName()))) {
				byte[] buffer = new byte[1024];
				int byteread = 0;
				for (; (byteread = fis.read(buffer)) > 0;) {
					fos.write(buffer, 0, byteread);
				}
			} catch (IOException e) {
				throw e;
			}

		}
	}

}
