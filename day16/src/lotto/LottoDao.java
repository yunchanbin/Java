package lotto;

import java.util.ArrayList;
import java.util.Random;

public class LottoDao implements Dao {

	Random rd;

	public LottoDao() {
		rd = new Random();
	}

	@Override
	public ArrayList<LottoVo> create(int low, double balance) {


		// Make Array
		int ar[][] = new int[low][6];
		for (int i = 0; i < low; i++) {
			for (int j = 0; j < ar[0].length; j++) {
				ar[i][j] = rd.nextInt(15) + 1;
				for (int k = 0; k < j; k++) {
					if (ar[i][j] == ar[i][k]) {
						j--;
					} // End if
				}
			}
		} // End for

		// Array to LottoVo
		ArrayList<LottoVo> list = new ArrayList<LottoVo>();
		for (int i = 0; i < ar.length; i++) {
			LottoVo lotto = new LottoVo(ar[i][0], ar[i][1], ar[i][2], ar[i][3], ar[i][4], ar[i][5]);
			list.add(lotto);
		}


		return list;

	}
	public LottoVo create() {
		// Only for create wcode
		
		// Make Array
		int ar[] = new int[6];
		
		for (int j = 0; j < ar.length; j++) {
			ar[j] = rd.nextInt(15) + 1;
			for (int k = 0; k < j; k++) {
				if (ar[j] == ar[k]) {
					j--;
				} // End if
			}
		}
		// End for
		// Array to LottoVo
		LottoVo lotto = new LottoVo(ar[0], ar[1], ar[2], ar[3], ar[4], ar[5]);
		return lotto;

	}



	public int correct(LottoVo wcode, LottoVo code) {
		int accord = 0;
		//Lotto value to Array
		int wwcode[] = {wcode.getA(), wcode.getB(), wcode.getC(), wcode.getD(), wcode.getE(), wcode.getF()};
		int ar[] = {code.getA(), code.getB(), code.getC(), code.getD(), code.getE(), code.getF()};
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				if (ar[j] == wwcode[i]) {
					accord++;
				} 
			}
		}
		return accord;
	}
	
	@Override
	public double plus(int accord) {
		double c = 0;
		switch (accord) {
		case 6:
			c += 100000000; // 1st
			break;
		case 5:
			c += 10000; // 2nd
			break;
		case 4:
			c += 5000; // 3th
			break;
		default:
			break;
		}
		return c;
	}

	@Override
	public double minus(int n) {
		double m = n * 1000;
		return m;
	}

}
