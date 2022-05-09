package ch02;

public class P46 {

	public static void main(String[] args) {
		double d1 = 1000000000;
		//double d2 = 10000000000; // 정수를 집어넣는 것은 가능하다. 단, int로 변환되니까 int의 범위만 가질 수 있다. 그리고 들어갈 땐 정수로 들어가지만 double 안에 들어가고 나면 다시 실수로 바뀐다.
		int a = (int)100.1;	// 잘라줘야 집어 넣을 수 있다.
		System.out.println(a);
		System.out.println(d1);
		
	}

}
