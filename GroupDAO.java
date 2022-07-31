package level1;

import java.io.IOException;

public interface GroupDAO {
	public void saveGroup(Group g) throws IOException;
	public Group loadGroup(String id) throws IOException, StudentException;
}
