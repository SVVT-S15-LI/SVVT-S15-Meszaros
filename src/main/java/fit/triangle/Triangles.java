package fit.triangle;

import triangle.Triangle;
import fit.ColumnFixture;

public class Triangles extends ColumnFixture{
	public int a;
	public int b;
	public int c;
	
	public String type(){
		Triangle t = new Triangle(a, b, c);
		return t.classify();
	}
	public boolean isRightAngled(){
		Triangle tr = new Triangle(a, b, c);
		return tr.isRightAngled();
	}
	
	
	
	
}
