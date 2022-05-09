package day0413;

public class Variable {

	public static void main(String[] args) {
		int ni = 2100000000;
		
		// long이나 double에 값을 넣고 싶어도 오른쪽에 숫자를 적으면 기본형이 Integer이므로, 값을 받아들이지 못한다.
		// 이러한 경우 숫자 뒤에 L, D를 적어서 각 형태에 맞는 수를 적어주도록 한다.
		long nl = 10000000000000L;	
		double nd1 = 100000000000000000000000000000.0;	//근데 double은 그냥 실수형으로 적어주면 알아서 double로 인식
		double nd2 = 100000000000000000000000000000000000000D;	
		
		double result = nl / ni;
		
		System.out.println(ni);
		System.out.println(nl);
		System.out.println(nd1);
		System.out.println(nd2);
		System.out.println("result : " + result);
	}

}
