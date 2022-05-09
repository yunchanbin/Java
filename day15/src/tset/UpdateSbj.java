package tset;

import dao.SubjectDao;
import frame.Dao;
import vo.SubjectVo;

public class UpdateSbj {

	public static void main(String[] args) {
		Dao<Integer, SubjectVo> dao = new SubjectDao();
		
		SubjectVo sbj = new SubjectVo(12, "영어", "종합강의실");
		
		try {
			dao.update(sbj);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
		
	}	


}
