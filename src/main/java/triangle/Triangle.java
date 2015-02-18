package triangle;

public class Triangle{
	private int a;
	private int b;
	private int c;
	String type = "TRIANGLE.SCALENE";
	
	public Triangle(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public String classify(){
		if(isValid()){
			if(a == b || b == c || a == c){
				if(a == b && b == c){
					type = "TRIANGLE.EQUILATERAL";
				}else{
					type = "TRIANGLE.ISOSCELES";
				}
				
			}else{
				type = "TRIANGLE.SCALENE";
			}
		}else{
			type = "INVALID";
		}
		return type;
	}
	
	public boolean isValid(){
		if(a>0 && b>0 && c>0 && a+b>c && b+c>a && a+c>b){
			return true;
		}else{
			return false;
		}
	}
	public boolean isRightAngled(){
		if(isValid()){
			if(a*a + b*b == c*c || b*b + c*c == a*a || a*a + c*c == b*b){
				return true;
			}
		}
		return false;
	}
}
