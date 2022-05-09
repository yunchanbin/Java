package frame;

public class Sql {
	public static String insertStd = "INSERT INTO STUDENT VALUES (?,?,?)";
	public static String deleteStd = "DELETE FROM STUDENT WHERE id=?";
	public static String updateStd = "UPDATE STUDENT SET name=?, score=? WHERE id=?";
	public static String selectStd = "SELECT * FROM STUDENT WHERE id=?";
	public static String selectAllStd = "SELECT * FROM STUDENT";
	
	
	public static String insertSbj = "INSERT INTO SUBJECT VALUES (?,?,?)";
	public static String deleteSbj = "DELETE FROM SUBJECT WHERE code=?";
	public static String updateSbj = "UPDATE SUBJECT SET subject=?, room=? WHERE code=?";
	public static String selectSbj = "SELECT * FROM SUBJECT WHERE code=?";
	public static String selectAllSbj = "SELECT * FROM SUBJECT";	
}
