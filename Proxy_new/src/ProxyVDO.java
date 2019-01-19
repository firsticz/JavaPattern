
public class ProxyVDO implements Image{

	private RealVDO realVDO; 
	   private String fileName; 
	 
	   public ProxyVDO(String fileName){ 
	      this.fileName = fileName; 
	   }
	   @Override
	   public void display() { 
		      if(realVDO == null){ 
		    	  realVDO = new RealVDO(fileName); 
		      } 
		      realVDO.display(); 
		   }
}
