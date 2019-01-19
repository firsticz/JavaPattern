public class RealVDO implements Image { 
 
   private String fileName; 
 
   public RealVDO(String fileName){ 
      this.fileName = fileName; 
      loadFromDisk(fileName); 
   } 
 
   @Override 
   public void display() { 
      System.out.println("Displaying " + fileName); 
   } 
 
   private void loadFromDisk(String fileName){ 
      System.out.println("Loading " + fileName); 
   } 
}