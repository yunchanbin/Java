package lotto;

import java.util.ArrayList;

public class TestApp {

	public static void main(String[] args) {
		Dao dao = new LottoDao();
		LottoVo wcode = new LottoVo(1,2,3,4,5,6);
		double balance = 10000.0;
		System.out.println(balance);
		int n = 5;
		try {
			balance -= dao.minus(n);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(balance);
		ArrayList<LottoVo> list;
		int accord = 0;
		try {
			list = dao.create(n, balance);
			
			for (int i = 0; i < 5; i++) {
				LottoVo code = list.get(i);
				accord = dao.correct(wcode, code);
				double c = dao.plus(accord);
				balance += c;

				System.out.printf("Correct : %d \t (code : ",accord);
				System.out.println(list.get(i)+")");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		System.out.println(balance);
		
	}

}
