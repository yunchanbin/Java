package tset;

import dao.StudentDao;
import frame.Dao;
import vo.StudentVo;

public class InsertStd {

	public static void main(String[] args) {
		Dao<Integer, StudentVo> dao = new StudentDao();

		StudentVo std = new StudentVo(1111, "김민수", 80);
		
		try {
			dao.insert(std);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
