//option 1
public class ctaMod4 {

	public static void main(String[] args) { //"Shape Array"
		Shape sphere = new Sphere(10.1);
		Shape cylinder = new Cylinder(4, 13.6);
		Shape cone = new Cone(11.3, 5);
		
		//create an array of shapes
		Shape[]shapes = new Shape[3];
		
		//add shapes to array
		shapes[0] = sphere;
		shapes[1] = cylinder;
		shapes[2] = cone;
		
		//iterate through array, display info
		for (int i =0; i <=2; i++) {
			shapes[i].Display();
		}

	}//end of main

}//end of ctaMod4

abstract class Shape {
	
	 Shape() {
		
	}
	
	
	protected double surface_area() {
		return 0;
		
		
	}//end of surface area method
	
	protected double volume() {
		return 0;
	}
	
	protected void Display() {
		System.out.println("Surface area: " + Double.toString(surface_area()));
		System.out.println("Volume: " + Double.toString(volume()));
	}
	
}//end of class shape

class Sphere extends Shape {
	
	private double radius;
	
	Sphere() {
		
	}
	
	Sphere (double radius) {
		this.radius=radius;
	}
	
	@Override
	protected double surface_area() {
		double area;
		area = 4 * (radius*radius) * Math.PI;
		return area;
	}
	
	@Override
	protected double volume() {
		double volume;
		volume = (4/3.0) * Math.PI * (radius*radius*radius);
		return volume;
	}
	
	@Override
	protected void Display() {
		
		double sa = surface_area();
		
		System.out.println("Surface area of sphere: " + Double.toString(sa));

		double vol = volume();
		System.out.println("Volume of sphere: " + Double.toString(vol));
	}
	
}//end of Sphere class

class Cylinder extends Shape {
	private double radius;
	private double height;
	
	Cylinder() {
		
	}
	
	 Cylinder(double radius, double height) {
		this.radius=radius;
		this.height=height;
	}
	
	@Override
	protected double surface_area() {
		double area;
		area = (2 * Math.PI * radius * height) + (2 * Math.PI * (radius*radius));
		return area;
	}
	
	@Override
	protected double volume() {
		double vol;
		vol = Math.PI * (radius*radius) * height;
		return vol;
	}
	
	@Override
	protected void Display() {
		double sa = surface_area();
		double vol = volume();
		System.out.println("Surface area of Cylinder: " + Double.toString(sa));
		System.out.println("Volume of Cylinder: " + Double.toString(vol));
	}
	
}//end of Cylinder Class

class Cone extends Shape {
	private double radius;
	private double height;
	
	Cone() {
		
	}
	
	Cone (double radius, double height) {
		this.radius=radius;
		this.height=height;
	}
	
	@Override
	protected double surface_area() {
		double area;
		area = Math.PI * radius * (radius + Math.sqrt((height*height)+(radius*radius)));
		return area;
	}
	
	@Override
	protected double volume() {
		double vol;
		vol= Math.PI * (radius*radius) * (height/3);
		return vol;
	}
	
	@Override
	protected void Display() {
		double sa = surface_area();
		double vol = volume();
		System.out.println("Surface area of Cone: " + Double.toString(sa));
		System.out.println("Volume of Cone: " + Double.toString(vol));
	}
	
}//end of Cone class
