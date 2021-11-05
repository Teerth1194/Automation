
public class Rectangle {
	
	private int length;
	private int breadth;
	
	public void setlength(int length) {
		this.length = length;
	}
	
	public void setbreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public int getbreadth() {
		return breadth;
	}
	
	public int getlength() {
		return length;
	}
	
	public int areaOfRectangle() {
		int area = length*breadth;
		return area;
	}
	
	public void calculatePerimeter () {
		int Perimeter = 2*(length + breadth);
		System.out.println("Perimeter of the Rectangle is "+Perimeter);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle();
		rect.setbreadth(5);
		rect.setlength(7);
		rect.calculatePerimeter();
		System.out.println("Breadth of Rectangle is "+rect.getbreadth());
		System.out.println("Length of Rectangle is "+rect.getlength());
		System.out.println("Area of Rectangle is "+rect.areaOfRectangle());

	}

}
