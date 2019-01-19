
public class DecoratorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle = new Circle(); 
		 
	      Shape redCircle = new RedShapeDecorator(new Circle()); 
	      Shape greenCircle = new GreenShapeDecorator(new Circle());
	 
	      Shape redRectangle = new RedShapeDecorator(new Rectangle()); 
	      Shape greenRectangle = new GreenShapeDecorator(new Rectangle());
	      
	      System.out.println("Circle with normal border"); 
	      circle.draw(); 
	 
	      System.out.println("\nCircle of red border"); 
	      redCircle.draw(); 
	 
	      System.out.println("\nRectangle of red border"); 
	      redRectangle.draw();
	      
	      System.out.println("Circle with normal border"); 
	      circle.draw(); 
	 
	      System.out.println("\nCircle of green border"); 
	      greenCircle.draw(); 
	 
	      System.out.println("\nRectangle of green border"); 
	      greenRectangle.draw();
	}

}
