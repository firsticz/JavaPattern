
public class ProxyPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Image vdo = new ProxyVDO("test_10mb.avi"); 
		 
	      //image will be loaded from disk 
		  vdo.display();  
	      System.out.println(""); 
	      //image will not be loaded from disk 
	      vdo.display();
	}	

}
