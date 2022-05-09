package tset;

import java.util.List;

import dao.SubjectDao;
import frame.Dao;
import vo.SubjectVo;

public class SelectSbj {

	public static void main(String[] args) {
		Dao<Integer, SubjectVo> dao = new SubjectDao();
		List<SubjectVo> list = null;
		
		try {
			list = dao.select();
			for (SubjectVo sbj : list) {
				System.out.println(sbj);
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
