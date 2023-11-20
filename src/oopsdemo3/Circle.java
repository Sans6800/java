package oopsdemo3;

public class Circle implements Shape {
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		
	}

	@Override
	public double getArea() {
		
		return Math.PI*this.radius*this.radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	

}
