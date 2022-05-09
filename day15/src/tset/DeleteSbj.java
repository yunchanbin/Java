package tset;

import dao.SubjectDao;
import frame.Dao;
import vo.SubjectVo;

public class DeleteSbj {

	public static void main(String[] args) {
		Dao<Integer, SubjectVo> dao = new SubjectDao();
		
		try {
			dao.delete(132);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
