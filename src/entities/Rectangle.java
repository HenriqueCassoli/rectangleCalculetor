package entities;

public class Rectangle {
	
	public double width;
	public double height;
	
	public double area() {
		
		double p = width * height;
		return p;
	}
	
	public double Perimeter(){
		double p = 2*(width + height);
		return p;
	}
	
	public double Diagonal() {
		double p = Math.sqrt(Math.pow(width,2) + Math.pow(height,2) );
		return p;
	}

}
