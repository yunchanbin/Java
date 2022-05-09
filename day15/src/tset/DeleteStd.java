package tset;

import dao.StudentDao;
import frame.Dao;
import vo.StudentVo;

public class DeleteStd {

	public static void main(String[] args) {
		Dao<Integer, StudentVo> dao = new StudentDao();
		
		try {
			dao.delete(1111);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
