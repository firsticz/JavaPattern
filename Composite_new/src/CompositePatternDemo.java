
public class CompositePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee CEO = new Employee("John","CEO", 30000); 
		 
	      Employee headSales = new Employee("Robert","Head Sales", 20000); 
	 
	      Employee headMarketing = new Employee("Michel","Head Marketing", 20000);
	      Employee headAccout = new Employee("Kethy","Head Accout", 20000);
	 
//	      Employee clerk1 = new Employee("Laura","Marketing", 10000); 
	      Employee clerk2 = new Employee("Bob","Marketing", 10000); 
	      Employee clerk1 = new Employee("Prim","Accout", 10000); 
	 
	      Employee salesExecutive1 = new Employee("Richard","Sales", 10000); 
	      Employee salesExecutive2 = new Employee("Rob","Sales", 10000); 
	 
	      CEO.add(headSales); 
	      CEO.add(headMarketing); 
	      CEO.add(headAccout); 
	 
	      headSales.add(salesExecutive1); 
	      headSales.add(salesExecutive2); 
	 
	      headMarketing.add(clerk1); 
	      headMarketing.add(clerk2);
	      
	      headAccout.add(clerk1);
	      
	      System.out.println(CEO);  
	      for (Employee headEmployee : CEO.getSubordinates()) { 
	         System.out.println(headEmployee); 
	         for (Employee employee : headEmployee.getSubordinates()) { 
	            System.out.println(employee); 
	         } 
	      }
	}

}
