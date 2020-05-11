package geometry;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		// Triangle...
		Triangle triangle1 = new Triangle("First Triangle", "Aluminium", 4, 6);
		Shape aShape1 = triangle1;
		Triangle otherTriangle = (Triangle) aShape1;

		System.out.println(otherTriangle);

		Triangle triangle2 = new Triangle("Second triangle", "glass", 9, 4);
		Triangle triangle3 = new Triangle("Second triangle", "glass", 9, 4);
		Triangle triangle4 = triangle1;

		System.out.println("triangle1 is equal to triangle2? Answer: " + triangle1.equals(triangle2));
		System.out.println("triangle2 is equal to triangle3? Answer: " + triangle2.equals(triangle3));
		System.out.println("newTriangle is equal to triangle4? Answer: " + triangle1.equals(triangle4));
		System.out.println("triangle2 is equal to triangle4? Answer: " + triangle2.equals(triangle4));
		System.out.println("triangle1 hashcode: " + triangle1.hashCode());
		System.out.println("triangle2 hashcode: " + triangle2.hashCode());
		System.out.println("triangle3 hashcode: " + triangle3.hashCode());
		System.out.println("triangle4 hashcode: " + triangle4.hashCode());

		triangle1.getSize();
		triangle1.displayHeight();
		System.out.println(triangle1.toString());

		// Rectangle...
		Rectangle rectangle1 = new Rectangle("First Rectangle", "plastic", 7, 12);
		Rectangle rectangle2 = new Rectangle("Second Rectangle", "composite", 8, 15);
		Rectangle rectangle3 = new Rectangle("Third Rectangle", "aluminium", 5, 6);
		Rectangle rectangle4 = rectangle3;

		System.out.println("rectangle1 is equal to rectangle4? Answer: " + rectangle1.equals(rectangle4));
		System.out.println("rectangle2 is equal to rectangle3? Answer: " + rectangle2.equals(rectangle3));
		System.out.println("rectangle1 is equal to rectangle2? Answer: " + rectangle1.equals(rectangle2));
		System.out.println("rectangle2 is equal to rectangle4? Answer: " + rectangle2.equals(rectangle4));
		System.out.println("rectangle1 hashcode: " + rectangle1.hashCode());
		System.out.println("rectangle2 hashcode: " + rectangle2.hashCode());
		System.out.println("rectangle3 hashcode: " + rectangle3.hashCode());
		System.out.println("rectangle4 hashcode: " + rectangle4.hashCode());

		rectangle1.getSize();
		rectangle1.displayHeight();
		System.out.println(rectangle1.toString());

		Triangle newTriangle1 = new Triangle("Ando foro", "plastic");
		Triangle newTriangle2 = new Triangle("Yes sir", "composite");
		Rectangle newRectangle1 = new Rectangle("Andiamo", "glass");
		Rectangle newRectangle2 = new Rectangle("Let's go", "wood");
//		Shape newShape1 = new Shape("Omaga", "cartoon");
//		Shape newShape2 = new Shape("Ohhh God", "paper");

		ArrayList<Shape> former = new ArrayList<Shape>();

		former.add(newTriangle1);
		former.add(newRectangle2);
		former.add(newRectangle1);
		former.add(newTriangle2);
//		former.add(newShape1);
//		former.add(newShape2);

		for (int i = 0; i < former.size(); i++) {
			System.out.println(former.get(i).toString());
			former.get(i).getSize();
		}

		for (int i = 0; i < former.size(); i++) {
			if (former.get(i) instanceof Triangle) {
				Triangle triangleRef = (Triangle) former.get(i);
				triangleRef.displayHeight();
			} else if (former.get(i) instanceof Rectangle) {
				Rectangle rectangleRef = (Rectangle) former.get(i);
				rectangleRef.displayHeight();
			} else {
				System.out.println("Error: unknown kind of form");
			}
		}
	}
}
