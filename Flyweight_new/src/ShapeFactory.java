import java.util.HashMap;

public class ShapeFactory {
	 private static final HashMap<String, Shape> circleMap = new HashMap();
	 public static Shape getCircle(String color) { 
	      Triangle triangle = (Triangle)circleMap.get(color); 
	 
	      if(triangle == null) { 
	    	  triangle = new Triangle(color); 
	         circleMap.put(color, triangle); 
	         System.out.println("Creating triangle of color : " + color); 
	      } 
	      return triangle; 
	   
	}
}
