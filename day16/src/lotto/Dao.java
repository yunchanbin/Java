package lotto;

import java.util.ArrayList;

public interface Dao {
	
	public ArrayList<LottoVo> create(int low, double balance) throws Exception;
	
	public int correct(LottoVo wcode, LottoVo code) throws Exception;
	
	public double plus(int n) throws Exception;
	
	public double minus(int n) throws Exception;

	public LottoVo create();

		
}