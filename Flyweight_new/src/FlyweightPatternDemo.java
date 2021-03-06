
public class FlyweightPatternDemo {
	
	 private static final String colors[] =  
	      { "Red", "Green", "Blue", "White", "Black" }; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i < 20; ++i) { 
	        Triangle circle =  
	           (Triangle)ShapeFactory.getCircle(getRandomColor()); 
	        circle.setwidth(getRandomwidth()); 
	        circle.setlength(getRandomlength()); 
	        circle.setheight(100); 
	        circle.draw(); 
	     } 
	}
	
	
  private static String getRandomColor() { 
     return colors[(int)(Math.random()*colors.length)]; 
  } 
  
  private static int getRandomwidth() { 
      return (int)(Math.random()*100 ); 
   } 
   private static int getRandomlength() { 
      return (int)(Math.random()*100); 
   } 

}
