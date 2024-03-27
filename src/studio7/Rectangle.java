package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double width;
	private double length;

	public Rectangle(int width, int length) {
		this.width = width;
		this.length = length;

	}

	public double Perimeter(double width, double length) {
		return (2 * width) + (2 * length);
	}

	public double Area(double width, double length) {
		return width * length;
	}

	public boolean greater(Rectangle b) {
		if (Area(this.width, this.length) > Area(b.width, b.length))
			return true;
		else
			return false;
	}

	public boolean sqaure(double width, double length) {
		return this.width == this.length;
	}

	public void draw(double width, double length) {
		StdDraw.filledRectangle(0, 0, length / 2.0, width / 2.0);
	}

	public static void main(String[] args) {

	}

}
