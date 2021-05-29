package repo;

import java.sql.SQLException;
import java.util.List;

public interface SecretRepo {
	
	List<String> getSecretFilesUsingSecretCode(String secretCode) throws SQLException, ClassNotFoundException;
}
