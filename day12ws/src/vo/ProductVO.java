package vo;

public class ProductVO {
	private String code;
	private int ea;
	private double price;
	
	public ProductVO() {
		
	}

	public ProductVO(String code, int ea, double price) {
		this.code = code;
		this.ea = ea;
		this.price = price;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getEa() {
		return ea;
	}

	public void setEa(int ea) {
		this.ea = ea;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductVO [code=" + code + ", ea=" + ea + ", price=" + price + "]";
	}


	
	
}
