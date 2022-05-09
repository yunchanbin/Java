package tset;

import dao.SubjectDao;
import frame.Dao;
import vo.SubjectVo;

public class InsertSbj {

	public static void main(String[] args) {
		Dao<Integer, SubjectVo> dao = new SubjectDao();
		
		SubjectVo sbj = new SubjectVo(133, "수학2", "수학실");
		try {
			dao.insert(sbj);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
